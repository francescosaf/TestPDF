
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.Graphics;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using AndroidX.AppCompat.App;
using Java.Lang;
using PSPDFKit.Annotations;
using PSPDFKit.Annotations.Actions;
using PSPDFKit.Configuration;
using PSPDFKit.Configuration.Page;
using PSPDFKit.Document;
using PSPDFKit.Forms;
using PSPDFKit.Listeners;
using PSPDFKit.UI;

namespace TestPDF2
{
    [Activity(Label = "PSPdfKit2")]
    public class PSPdfKit2 : AppCompatActivity, IDocumentListener, IOnDocumentLongPressListener
    {

        const string sampleDoc = "FMTestForm.pdf";

        public string DocumentsDirectory
        {
            get
            {
                return System.Environment.GetFolderPath(System.Environment.SpecialFolder.Personal);
            }
        }

        PdfFragment fragment;
        PdfConfiguration configuration;
        IPdfDocument Document;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);


            var docUri = OpenResouceFile();
            // Create your application here
            SetContentView(Resource.Layout.PSPDFKitLayout);
            configuration = new PdfConfiguration.Builder().Build();
            fragment = SupportFragmentManager.FindFragmentById(Resource.Id.psPdfkit)?.JavaCast<PdfFragment>();
            if (fragment == null)
            {
                fragment = PdfFragment.NewInstance(docUri, configuration);
                SupportFragmentManager
                    .BeginTransaction()
                    // We use a small hack JavaCast<T> because at build time we expect a 'Android.Support.V4.App.Fragment'
                    // but 'PdfFragment' extends 'AndroidX.Fragment.App.Fragment' but migration package should fix it for us at runtime.
                    .Replace(Resource.Id.psPdfkit, fragment.JavaCast<AndroidX.Fragment.App.Fragment>())
                    .Commit();
            }
            fragment.AddDocumentListener(this);
            fragment.SetOnDocumentLongPressListener(this);


            FindViewById<Button>(Resource.Id.FillPDF).Click += async (_, e) =>
            {
                FillPDF();
            };
        }


        Android.Net.Uri OpenResouceFile()
        {
            try
            {
                var inputStream = Resources.OpenRawResource(Resource.Raw.FMTestForm);

                var directoryFound = System.IO.Path.Combine(DocumentsDirectory, "Temp");


                if (!Directory.Exists(directoryFound))
                    Directory.CreateDirectory(directoryFound);

                var pdfPath = $"{directoryFound}/fmtest.pdf";

                if (File.Exists(pdfPath))
                    File.Delete(pdfPath);

                CreateFile(inputStream, pdfPath);

                return Android.Net.Uri.FromFile(new Java.IO.File(pdfPath));
                // Now some_file is tempFile .. do what you like
            }
            catch (System.Exception e)
            {
                throw new System.Exception("Can't create temp file ", e);
            }
        }


        public void OnDocumentLoaded(IPdfDocument document)
        {
            Document = document;

        }

        private void FillPDF()
        {
            var document = fragment.Document;


            var field = Document.FormProvider.GetFormElementWithName("Client Name");
            var formElement = field.JavaCast<TextFormElement>();

            //IList<Integer> r = new List<Integer> { 1d, 1d };

            var intList = new List<Integer>() { (Integer)3, (Integer)1 };
            formElement.Annotation.BorderStyle = BorderStyle.Dashed;
            formElement.Annotation.BorderDashArray = intList;
            formElement.Annotation.BorderColor = Color.Gray;
            formElement.Annotation.BorderWidth = 3;
            formElement.Annotation.FillColor = GetColor(new Color(Resource.Color.white2));
            //formElement.Annotation.Color = GetColor(new Color(Resource.Color.white2));
            formElement.SetText("John xxxxxxxx");

            //var rectf = field.Annotation.BoundingBox;
            //fragment.ZoomTo(rectf, 0, 1);


            var field2 = Document.FormProvider.GetFormFieldWithFullyQualifiedName("Paid");
            var formElementR = field2.JavaCast<RadioButtonFormField>();
            System.Diagnostics.Debug.WriteLine($" ******* {formElementR.FormElements.Count()}");
            foreach (var rfield in formElementR.FormElements)
            {
                var rb = rfield.JavaCast<RadioButtonFormElement>();
                var intList1 = new List<Integer>() { (Integer)3, (Integer)1 };
                rb.Annotation.BorderStyle = BorderStyle.Dashed;
                rb.Annotation.BorderDashArray = intList1;
                rb.Annotation.BorderColor = Color.Blue;
                rb.Annotation.BorderWidth = 2;
                rb.Annotation.FillColor = Color.Red;
                //rb.Annotation.UpdateTransformationProperties(rb.Annotation.BoundingBox.
                //rb.Annotation.
                rb.Select();
            }
            /*
            if (field2 != null)
            {
                var formElement2 = field2.JavaCast<RadioButtonFormElement>();
                var intList1 = new List<Integer>() { (Integer)1, (Integer)1 };
                formElement2.Annotation.BorderStyle = BorderStyle.Dashed;
                formElement2.Annotation.BorderDashArray = intList1;
                formElement2.Annotation.BorderColor = Color.Blue;
                formElement2.Annotation.FillColor = Color.Red;
            }
            */

            var elements = fragment.Document.FormProvider.FormElements;
            foreach (var el in elements)
            {
                System.Diagnostics.Debug.WriteLine($"{el.Name} | {el.FullyQualifiedName} | {el.Type}");
            }
        }

        public void CreateFile(Stream data, string path)
        {
            Directory.CreateDirectory(System.IO.Path.GetDirectoryName(path));

            using (var fs = new FileStream(path, FileMode.OpenOrCreate))
            {
                //fs.SetLength(data.Length);
                data.CopyTo(fs);
            }
        }

        public void OnDocumentLoadFailed(Throwable exception)
        {
        }

        public bool OnDocumentSave(IPdfDocument document, DocumentSaveOptions saveOptions)
        {
            return true;
        }

        public void OnDocumentSaved(IPdfDocument document)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnDocumentSaved*********");
        }

        public void OnDocumentSaveFailed(IPdfDocument document, Throwable exception)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnDocumentSaveFailed*********");
        }

        public void OnDocumentSaveCancelled(IPdfDocument document)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnDocumentSaveCancelled*********");
        }

        public bool OnPageClick(IPdfDocument document, int pageIndex, MotionEvent @event, PointF pagePosition, Annotation pclickedAnnotation4)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnPageClick*********");
            return false;
        }

        public bool OnDocumentClick()
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnDocumentClick*********");
            return false;
        }

        public void OnPageChanged(IPdfDocument document, int pageIndex)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnPageChanged*********");
        }

        public void OnDocumentZoomed(IPdfDocument document, int pageIndex, float scaleFactor)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnDocumentZoomed*********");
        }

        public void OnPageUpdated(IPdfDocument document, int pageIndex)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnPageUpdated*********");
        }

        public bool OnDocumentLongPress(IPdfDocument document, int pageIndex, MotionEvent @event, PointF pagePosition, Annotation longPressedAnnotation)
        {
            if (fragment.View != null)
                fragment.View.PerformHapticFeedback(FeedbackConstants.LongPress);

            if (longPressedAnnotation is LinkAnnotation)
            {
                var action = ((LinkAnnotation)longPressedAnnotation)?.Action;
                if (action != null && action.Type == ActionType.Uri)
                {
                    var uri = ((UriAction)action).Uri;
                    Toast.MakeText(this, uri, ToastLength.Long).Show();
                    return true;
                }
            }
            return false;
        }
    }
}
