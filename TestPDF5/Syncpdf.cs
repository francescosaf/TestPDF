
using System;
using System.Collections.Generic;
using System.Drawing;
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
using Syncfusion.Pdf.Parsing;
using Syncfusion.SfPdfViewer.Android;

namespace TestPDF5
{
    [Activity(Label = "Syncpdf")]
    public class Syncpdf : Activity
    {

        const string sampleDoc = "NPMA33.pdf";
        SfPdfViewer pdfViewer;

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


            SetContentView(Resource.Layout.Syncpdf);

            pdfViewer = FindViewById<SfPdfViewer>(Resource.Id.pdfviewercontrol);
            pdfViewer.DocumentLoaded += PdfViewer_DocumentLoaded;
            pdfViewer.PageChanged += PdfViewer_PageChanged;
            System.IO.Stream PdfStream = Assets.Open($"{sampleDoc}");
            pdfViewer.LoadDocument(PdfStream);
            // Create your application here



            pdfViewer.Toolbar.Enabled = true;
            pdfViewer.AnnotationSettings.HandwrittenSignature.Color = Android.Graphics.Color.Red;

            pdfViewer.FreeTextAnnotationSelected += PdfViewer_FreeTextAnnotationSelected;

            FindViewById<Button>(Resource.Id.FillPDF).Click += async (_, e) =>
            {
                FillPdf();
            };

        }

        private void PdfViewer_FreeTextAnnotationSelected(object sender, FreeTextAnnotationSelectedEventArgs args)
        {
            //Get the bounds
            Rect bounds = args.Bounds;

            //Get the page number on which the deselected free text is
            int pageNumber = args.PageNumber;

            //Get the text of the free text annotation
            string text = args.Text;

            //Get the text color
            Android.Graphics.Color textColor = args.TextColor;

            //Get the text size
            // dfloat textSize = args.TextSize;
        }

        private void PdfViewer_PageChanged(object sender, PageChangedEventArgs args)
        {
            System.Diagnostics.Debug.WriteLine($"{args.PageNumber.ToString()}");
        }

        private void PdfViewer_DocumentLoaded(object sender, System.EventArgs args)
        {
            System.Diagnostics.Debug.WriteLine($"{pdfViewer.PageNumber.ToString()}");
            System.Diagnostics.Debug.WriteLine($"{pdfViewer.PageCount.ToString()}"); ;


            //Iterate all the fields    
            //foreach (var field in loadedForm.Fields)
            //{
            //    //For textbox field   
            //    PdfLoadedTextBoxField textBoxField = field as PdfLoadedTextBoxField;
            //    System.Diagnostics.Debug.WriteLine($"************** {textBoxField?.Name}");
            //    //Like this you can iterate all the fillable fields    
            //}


        }

        private void FillPdf()
        {
            PdfLoadedDocument loadedDocument = new PdfLoadedDocument(pdfViewer.SaveDocument());
            PdfLoadedForm loadedForm = loadedDocument.Form;

            PdfLoadedFormFieldCollection fieldCollection = loadedForm.Fields as PdfLoadedFormFieldCollection;

            PdfLoadedField loadedField = null;

            // Get the field using TryGetField Method.

            if (fieldCollection.TryGetField("NPMA-33-1-2", out loadedField))

            {

                (loadedField as PdfLoadedTextBoxField).Text = "John xxxxxxxx";

            }

            foreach (var field in loadedForm.Fields)
            {
                //For textbox field   
                PdfLoadedTextBoxField textBoxField = field as PdfLoadedTextBoxField;
                System.Diagnostics.Debug.WriteLine($"************** {textBoxField?.Name} {textBoxField?.Text}");
                //Like this you can iterate all the fillable fields    
            }

            MemoryStream stream = new MemoryStream();
            loadedDocument.Save(stream);
            loadedDocument.Close(true);
            pdfViewer.LoadDocument(stream);
        }
    }
}
