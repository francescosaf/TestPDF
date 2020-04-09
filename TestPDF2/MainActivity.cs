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
            PSPDFKitGlobal.Initialize(this, "Dz3R9GOESySyg8n3I2kUH3tWEInA4X9FRXgy1pUhjEgHmB6DWQF6vlAw6zvSrP-raYmaknQx6npkvZ7pniFPsCnSJ7hfgo3qTeXnYSA1sOwGo3KWsZdNUrCQLPOqDZYsz8APNfELsFgT0MV6nkUjMuC0Vw9T2KUDO6VSKaGvMhFfqB5O5679r4kon9-khR_osGkJoK18zjNu3zaX6eReWikp7OT5_TvQemeEKKKQyLSPHJaV1FmpbGxZzGZiMrZtr3_-S9H_b69X6NueR_9B7MOt6sMj0rP7CxrPDd-8PzrsBNeXHFlVTx90QOok3-0XwLcBthDN6R_3K_s3dpwGYfGh9ksEK6xvuGsbnnOc9D92SEhLMAqtkHUYe5D06s7TH7l7IwCbgLbhrv8bVyc_y0sHNVdFpgvsTLRWzq9g6Ucjak6NPa8Z69gaR7I6lj5L");
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

