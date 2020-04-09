
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
using Java.Util;
using PSPDFKit.Annotations;
using PSPDFKit.Annotations.Actions;
using PSPDFKit.Configuration;
using PSPDFKit.Configuration.Activity;
using PSPDFKit.Configuration.Page;
using PSPDFKit.Configuration.Theming;
using PSPDFKit.Document;
using PSPDFKit.Forms;
using PSPDFKit.Listeners;
using PSPDFKit.UI;
using PSPDFKit.UI.SpecialMode.Controller;
using PSPDFKit.UI.SpecialMode.Manager;

namespace TestPDF2
{
    [Activity(Label = "PSPdfKit2")]
    public class PSPdfKit2 : AppCompatActivity, IDocumentListener, IOnDocumentLongPressListener, IAnnotationProviderOnAnnotationUpdatedListener, IAnnotationManagerOnAnnotationSelectedListener, IFormManagerOnFormElementClickedListener, IFormManagerOnFormElementSelectedListener, IFormManagerOnFormElementUpdatedListener
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
        private CircleAnnotation customAnnotation;

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
            //fragment.AddOnAnnotationUpdatedListener(this);
            //fragment.AddOnAnnotationSelectedListener(this);
            fragment.AddOnFormElementClickedListener(this);
            fragment.AddOnFormElementSelectedListener(this);
            fragment.AddOnFormElementUpdatedListener(this);
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
            formElement.Annotation.FillColor = GetColor(new Color(Resource.Color.colorRed));
            //formElement.Annotation.Color = GetColor(new Color(Resource.Color.white2));
            formElement.SetText("John xxxxxxxx");
            //formElement.Annotation.AdditionalActions
            //var rectf = field.Annotation.BoundingBox;
            //fragment.ZoomTo(rectf, 0, 1);
            var elements = fragment.Document.FormProvider.FormFields;
            foreach (var elem in elements)
            {
                System.Diagnostics.Debug.WriteLine($"* {elem.Name} | {elem.FullyQualifiedName} | {elem.Type}");
                if (elem.Type == FormType.Text)
                {
                    var fieldEl = elem.FormElement.JavaCast<TextFormElement>();
                    fieldEl.Annotation.FillColor = GetColor(new Color(Resource.Color.colorRed));
                    fragment.NotifyAnnotationHasChanged(fieldEl.Annotation);

                }
                else if (elem.Type == FormType.Radiobutton)
                {
                    var formElementRad = elem.JavaCast<RadioButtonFormField>();

                    foreach (var rfield in formElementRad.FormElements)
                    {
                        var rb1 = rfield.JavaCast<RadioButtonFormElement>();
                        rb1.Annotation.FillColor = Color.Fuchsia;
                        fragment.NotifyAnnotationHasChanged(rb1.Annotation);
                    }
                }
                else if (elem.Type == FormType.Checkbox)
                {
                    var formElementCheck = elem.JavaCast<CheckBoxFormField>();

                    foreach (var cfield in formElementCheck.FormElements)
                    {
                        var cb1 = cfield.JavaCast<CheckBoxFormElement>();
                        cb1.Annotation.FillColor = Color.Green;
                        fragment.NotifyAnnotationHasChanged(cb1.Annotation);
                    }
                }
                else if (elem.Type == FormType.Pushbutton)
                {
                    var formElementPB = elem.JavaCast<PushButtonFormField>();

                    System.Diagnostics.Debug.WriteLine($"Pushbutton ******* {formElementPB.FormElements.Count()}");
                    foreach (var rfield in formElementPB.FormElements)
                    {
                        var pb1 = rfield.JavaCast<PushButtonFormElement>();
                        pb1.Annotation.FillColor = Color.Beige;
                        fragment.NotifyAnnotationHasChanged(pb1.Annotation);
                    }
                }
                else if (elem.Type == FormType.Signature)
                {
                    var fieldSig = elem.FormElement.JavaCast<SignatureFormElement>();
                    fieldSig.Annotation.FillColor = Color.Bisque;
                    fragment.NotifyAnnotationHasChanged(fieldSig.Annotation);

                }
                else if (elem.Type == FormType.Combobox)
                {
                    var fieldcmb = elem.FormElement.JavaCast<ComboBoxFormElement>();
                    fieldcmb.Annotation.FillColor = Color.AliceBlue;
                    fragment.NotifyAnnotationHasChanged(fieldcmb.Annotation);

                }
            }

            var field2 = Document.FormProvider.GetFormFieldWithFullyQualifiedName("Paid");
            var formElementR = field2.JavaCast<RadioButtonFormField>();
            System.Diagnostics.Debug.WriteLine($" ******* {formElementR.FormElements.Count()}");
            foreach (var rfield in formElementR.FormElements)
            {

                var rb = rfield.JavaCast<RadioButtonFormElement>();
                var bounds = rb.Annotation.BoundingBox;
                var bounds2 = new RectF() { Bottom = bounds.Bottom - 2, Right = bounds.Right + 2, Left = bounds.Left - 2, Top = bounds.Top + 2 };
                customAnnotation = new CircleAnnotation(rb.Annotation.PageIndex, bounds2);
                var intList2 = new List<Integer>() { (Integer)3, (Integer)1 };
                customAnnotation.BorderDashArray = intList2;
                customAnnotation.BorderColor = Color.Red;
                customAnnotation.BorderStyle = BorderStyle.Dashed;
                customAnnotation.FillColor = GetColor(new Color(Resource.Color.colorRedtransparency));
                customAnnotation.Alpha = 0.6f;
                customAnnotation.Flags = EnumSet.Of(AnnotationFlags.Locked, AnnotationFlags.Lockedcontents, AnnotationFlags.Readonly);
                document.AnnotationProvider.AddAnnotationToPage(customAnnotation);

                /*
                var rb = rfield.JavaCast<RadioButtonFormElement>();
                var intList1 = new List<Integer>() { (Integer)3, (Integer)1 };
                rb.Annotation.BorderStyle = BorderStyle.Dashed;
                rb.Annotation.BorderDashArray = intList1;
                rb.Annotation.BorderColor = Color.Blue;
                rb.Annotation.BorderWidth = 2;
                rb.Annotation.FillColor = Color.Red;
                */
                //rb.Annotation.UpdateTransformationProperties(rb.Annotation.BoundingBox.
                //rb.Annotation.
                //rb.Select();
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

            //var elements = fragment.Document.FormProvider.FormElements;
            foreach (var el in elements)
            {
                System.Diagnostics.Debug.WriteLine($"{el.Name} | {el.FullyQualifiedName} | {el.Type}");
            }

            //document.AnnotationProvider.RemoveAnnotationFromPage(customAnnotation);
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

        public void OnAnnotationCreated(Annotation p0)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnAnnotationCreated*********");
        }

        public void OnAnnotationRemoved(Annotation p0)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnAnnotationRemoved*********");
        }

        public void OnAnnotationUpdated(Annotation p0)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnAnnotationUpdated*********");
        }

        public void OnAnnotationZOrderChanged(int p0, IList<Annotation> p1, IList<Annotation> p2)
        {
            System.Diagnostics.Debug.WriteLine("*PAGE OnAnnotationZOrderChanged*********");
        }

        public void OnAnnotationSelected(Annotation p0, bool p1)
        {
            System.Diagnostics.Debug.WriteLine($"######### Annotation selected {p0.Name}");
        }

        public bool OnPrepareAnnotationSelection(IAnnotationSelectionController p0, Annotation p1, bool p2)
        {
            System.Diagnostics.Debug.WriteLine($"######### PrepareAnnotation selected {p1.Name}");
            return true;
        }

        public bool OnFormElementClicked(FormElement p0)
        {
            System.Diagnostics.Debug.WriteLine($"FormElement clicked {p0.Name}");

            return false;
        }

        public void OnFormElementSelected(FormElement p0)
        {
            if (p0.Type == FormType.Text)
            {
                var formElement = p0.JavaCast<TextFormElement>();
                System.Diagnostics.Debug.WriteLine($"-------------- FormElement selected {formElement.Name} {formElement.Text}");
            }
            else
                System.Diagnostics.Debug.WriteLine($"-------------- FormElement selected {p0.Name}");

        }

        public void OnFormElementUpdated(FormElement p0)
        {
            if (p0.Type == FormType.Text)
            {
                var formElement = p0.JavaCast<TextFormElement>();
                System.Diagnostics.Debug.WriteLine($"-------------- FormElement updated {formElement.Name} {formElement.Text}");
            }
            else
                System.Diagnostics.Debug.WriteLine($"-------------- FormElement updated {p0.Name}");
        }
    }

}
