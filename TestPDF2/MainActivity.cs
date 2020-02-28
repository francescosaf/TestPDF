using System;
using System.IO;
using Android.App;
using Android.OS;
using Android.Runtime;
using Android.Support.Design.Widget;
using Android.Support.V7.App;
using Android.Views;
using Android.Widget;
using Java.IO;
using PSPDFKit;
using PSPDFKit.Configuration.Activity;
using PSPDFKit.Configuration.Page;
using PSPDFKit.UI;
using SampleTools;

namespace TestPDF2
{
    [Activity(Label = "@string/app_name", Theme = "@style/AppTheme.NoActionBar", MainLauncher = true)]
    public class MainActivity : AppCompatActivity
    {
        const string sampleDoc = "NPMA33.pdf";

        public string DocumentsDirectory
        {
            get
            {
                return System.Environment.GetFolderPath(System.Environment.SpecialFolder.Personal);
            }
        }

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            SetContentView(Resource.Layout.activity_main);

            Android.Support.V7.Widget.Toolbar toolbar = FindViewById<Android.Support.V7.Widget.Toolbar>(Resource.Id.toolbar);
            SetSupportActionBar(toolbar);

            //var docUri = Android.Net.Uri.Parse(Android.Content.ContentResolver.SchemeAndroidResource + File.PathSeparator + File.Separator + File.Separator + PackageName + "/raw/" + sampleDoc);
            var docUri = OpenResouceFile();
            //Resources.OpenRawResource(Resource.Raw.NPMA33);
            ShowPdfDocument(docUri);

            FloatingActionButton fab = FindViewById<FloatingActionButton>(Resource.Id.fab);
            fab.Click += FabOnClick;
        }


        Android.Net.Uri OpenResouceFile()
        {
            try
            {
                var inputStream = Resources.OpenRawResource(Resource.Raw.NPMA33);

                var directoryFound = Path.Combine(DocumentsDirectory, "Temp");
                if (!Directory.Exists(directoryFound))
                    Directory.CreateDirectory(directoryFound);

                var pdfPath = $"{directoryFound}/npma33.pdf";
                CreateFile(inputStream, pdfPath);

                return Android.Net.Uri.FromFile(new Java.IO.File(pdfPath));
                // Now some_file is tempFile .. do what you like
            }
            catch (Exception e)
            {
                throw new Exception("Can't create temp file ", e);
            }
        }

        public void CreateFile(Stream data, string path)
        {
            Directory.CreateDirectory(Path.GetDirectoryName(path));

            using (var fs = new FileStream(path, FileMode.OpenOrCreate))
            {
                //fs.SetLength(data.Length);
                data.CopyTo(fs);
            }
        }


        void ShowPdfDocument(Android.Net.Uri docUri)
        {
            // Show Document using PSPDFKit activity
            var pspdfkitConfiguration = new PdfActivityConfiguration.Builder(ApplicationContext)
                .ScrollDirection(PageScrollDirection.Horizontal)
                .ShowPageNumberOverlay()
                .ShowThumbnailGrid()
                .FitMode(PageFitMode.FitToWidth)
                .Build();

            if (!PSPDFKitGlobal.IsOpenableUri(this, docUri))
                System.Diagnostics.Debug.WriteLine($"This document uri cannot be opened {docUri.ToString()}");
            else
                PdfActivity.ShowDocument(this, docUri, pspdfkitConfiguration);
        }


        public override bool OnCreateOptionsMenu(IMenu menu)
        {
            MenuInflater.Inflate(Resource.Menu.menu_main, menu);
            return true;
        }

        public override bool OnOptionsItemSelected(IMenuItem item)
        {
            int id = item.ItemId;
            if (id == Resource.Id.action_settings)
            {
                return true;
            }

            return base.OnOptionsItemSelected(item);
        }

        private void FabOnClick(object sender, EventArgs eventArgs)
        {
            View view = (View)sender;
            Snackbar.Make(view, "Replace with your own action", Snackbar.LengthLong)
                .SetAction("Action", (Android.Views.View.IOnClickListener)null).Show();
        }
        public override void OnRequestPermissionsResult(int requestCode, string[] permissions, [GeneratedEnum] Android.Content.PM.Permission[] grantResults)
        {
            Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);

            base.OnRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
}

