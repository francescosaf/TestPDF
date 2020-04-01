using System;
using System.IO;
using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;

using Android.Views;
using Android.Widget;
using AndroidX.AppCompat.App;
using Google.Android.Material.FloatingActionButton;
using Google.Android.Material.Snackbar;
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
            PSPDFKitGlobal.Initialize(this, "vw3PgdS-mSyLEmFwHD4PhRhf5nKFqW3qPyPBgy5IVZ5aCLIYb9lbhokQpwGLr0YzWD2gGwSefDZetMB9R-KpY4xVeO-6p-kvqfS3O3UGNYVqy4D3QL8GXpdPNzAfmHWf-jsJns5Xvr-pakJRiNYeC4DKkgFXudIvz85kCMOHo5S--1meRiRTKBSBHI0lq6Wnw7xsfiZ9Is1EnZI80SvkEZEttXD2I9EUTPKfX2SdBt458hZSGhDfaKSPodm8_WTaeXhBbEbRnAapNFYdNxP3aapR_whutWzbJ7iO3jHWsCDodrmIz0JRONLTxbOgEx7TPKFV2JIT9_cZmF3FPb9lTGnayBl1n1mDJwlditeuc_kf9sNxZSqIlOjuSDUBFyTJy-u9vjBQ5dypammhXYaVuwNBV3Myn6tqq_LOI04JxpW7BKURI4nwtd1XsaefXSD0");
            AndroidX.AppCompat.Widget.Toolbar toolbar = FindViewById<AndroidX.AppCompat.Widget.Toolbar>(Resource.Id.toolbar);
            SetSupportActionBar(toolbar);


            FindViewById<Button>(Resource.Id.button2).Click += async (_, e) =>
            {
                var docUri = OpenResouceFile();
                ShowPdfDocument(docUri);

            };
            FindViewById<Button>(Resource.Id.button1).Click += async (_, e) =>
            {
                var intent = new Intent(this, typeof(PSPdfKit));
                StartActivity(intent);

            };

            FindViewById<Button>(Resource.Id.button3).Click += async (_, e) =>
            {
                var intent = new Intent(this, typeof(PSPdfKit2));
                StartActivity(intent);

            };

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

