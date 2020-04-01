
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using AndroidX.AppCompat.App;
using pdftron.PDF.Config;
using pdftron.PDF.Controls;
using pdftron.PDF.Model;
using pdftron.PDF.Tools.Utils;

namespace TestPDF
{
    [Activity(Label = "PdfTronFrag")]
    public class PdfTronFrag : AppCompatActivity, PdfViewCtrlTabHostFragment.ITabHostListener
    {

        private PdfViewCtrlTabHostFragment mPdfViewCtrlTabHostFragment;

        public bool CanRecreateActivity()
        {
            return true;
        }

        public bool CanShowFileCloseSnackbar()
        {
            return true;
        }

        public bool CanShowFileInFolder()
        {
            return true;
        }

        public void OnExitSearchMode()
        {
        }

        public void OnJumpToSdCardFolder()
        {
        }

        public void OnLastTabClosed()
        {

        }

        public void OnNavButtonPressed()
        {

        }

        public void OnOpenDocError()
        {

        }

        public void OnShowFileInFolder(string p0, string p1, int p2)
        {

        }

        public void OnStartSearchMode()
        {

        }

        public void OnTabChanged(string p0)
        {

        }

        public void OnTabDocumentLoaded(string p0)
        {

        }

        public void OnTabHostHidden()
        {

        }

        public void OnTabHostShown()
        {

        }

        public void OnTabPaused(FileInfo p0, bool p1)
        {
        }

        public bool OnToolbarCreateOptionsMenu(IMenu p0, MenuInflater p1)
        {
            return false;
        }

        public bool OnToolbarOptionsItemSelected(IMenuItem p0)
        {
            return false;
        }

        public bool OnToolbarPrepareOptionsMenu(IMenu p0)
        {
            return false;
        }

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.PdfTronFragment);

            // Instantiate a PdfViewCtrlTabHostFragment with a document Uri
            var file = Utils.CopyResourceToLocal(this, Resource.Raw.NPMA33, "NPMA33", ".pdf");
            var uri = Android.Net.Uri.FromFile(file);
            ViewerConfig viewerConfig = new ViewerConfig.Builder()
                    .ToolbarTitle("٩(◕‿◕｡)۶")
                    .Build();

            mPdfViewCtrlTabHostFragment = (PdfViewCtrlTabHostFragment)ViewerBuilder.WithUri(uri).UsingConfig(viewerConfig).Build(this);
            mPdfViewCtrlTabHostFragment.AddHostListener(this);
            // Create your application here
            SupportFragmentManager
              .BeginTransaction()
              .Replace(Resource.Id.fragment_container, mPdfViewCtrlTabHostFragment)
              .Commit();
        }
    }
}
