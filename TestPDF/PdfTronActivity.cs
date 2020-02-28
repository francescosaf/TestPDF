
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using AndroidX.AppCompat.App;
using pdftron.Common;
using pdftron.PDF;
using pdftron.PDF.Config;
using pdftron.PDF.Controls;
using pdftron.PDF.Tools;
using pdftron.PDF.Tools.Utils;

namespace TestPDF
{
    [Activity(Label = "PdfTronActivity")]
    public class PdfTronActivity : AppCompatActivity
    {
        private PDFViewCtrl mPdfViewCtrl;
        private PDFDoc mPdfDoc;

        private ToolManager mToolManager;
        private AnnotationToolbar mAnnotationToolbar;

        //Activity activity;

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
            //pdftron.PDFNet.Initialize(this, Resource.Raw.pdfnet, "Insert commercial license key here after purchase");
            //activity = this.activity as Activity;

            SetContentView(Resource.Layout.PdfTronLayout);

            mPdfViewCtrl = FindViewById<PDFViewCtrl>(Resource.Id.pdfviewctrl);
            SetupToolManager();
            setupAnnotationToolbar(); //if in xml pdftron.pdf.controls.AnnotationToolbar is present
            // Create your application here

            try
            {
                AppUtils.SetupPDFViewCtrl(mPdfViewCtrl, PDFViewCtrlConfig.GetDefaultConfig(this));
            }
            catch (PDFNetException e)
            {
                // Handle exception
            }
            ViewFromResource(Resource.Raw.NPMA33, "NPMA33");



            FindViewById<Button>(Resource.Id.FillPDFTron).Click += async (_, e) =>
            {
                FillPdf();
            };


        }

        public void SetupToolManager()
        {

            mToolManager = ToolManagerBuilder.From().Build(this, mPdfViewCtrl);
            /*
            mToolManager = pdftron.PDF.Config.ToolManagerBuilder.From()
               .SetEditInk(true)
   .SetOpenToolbar(false)
   .SetBuildInPageIndicator(false)
   .SetCopyAnnot(false)
   .DisableToolModes(new ToolManager.ToolMode[]{
        ToolManager.ToolMode.TextAnnotCreate,
        ToolManager.ToolMode.TextCreate,
        ToolManager.ToolMode.TextSquiggly,
      ToolManager.ToolMode.InkEraser,
        ToolManager.ToolMode.FormCheckboxCreate,
        ToolManager.ToolMode.RectCreate,
        ToolManager.ToolMode.TextLinkCreate
   })
   .Build(this, mPdfViewCtrl);
            */
        }

        public void setupAnnotationToolbar()
        {
            mAnnotationToolbar = FindViewById<AnnotationToolbar>(Resource.Id.annotationToolbar);
            // Remember to initialize your ToolManager before calling setup
            mAnnotationToolbar.Setup(mToolManager);
            mAnnotationToolbar.HideButton(AnnotationToolbarButtonId.Close);
            mAnnotationToolbar.Show();
            //mAnnotationToolbar.Close();
        }

        public void ViewFromResource(int resourceId, String fileName)
        {
            var file = Utils.CopyResourceToLocal(this, resourceId, fileName, ".pdf");
            mPdfDoc = new PDFDoc(file.AbsolutePath);
            mPdfViewCtrl.SetDoc(mPdfDoc);
            // Alternatively, you can open the document using Uri:
            // Uri fileUri = Uri.fromFile(file);
            // mPdfDoc = mPdfViewCtrl.openPDFUri(fileUri, null);
        }

        private Android.Net.Uri GetFile()
        {
            var file = Utils.CopyResourceToLocal(this, Resource.Raw.NPMA33, "NPMA33", ".pdf");
            return Android.Net.Uri.FromFile(file);
        }

        public void FillPdf()
        {

            var directoryFound = Path.Combine(DocumentsDirectory, "Downloads");
            if (!Directory.Exists(directoryFound))
                Directory.CreateDirectory(directoryFound);
            try
            {

                mPdfDoc.InitSecurityHandler();
                //FILLL
                var fld = mPdfDoc.GetField("NPMA-33-1-2");
                fld.SetValue("John xxxxxxxx");
                fld.RefreshAppearance();

                FieldIterator itr;
                for (itr = mPdfDoc.GetFieldIterator(); itr.HasNext(); itr.Next())
                {
                    var obj = itr.Current();
                    Console.WriteLine("Field name: {0:s}", itr.Current().GetName());
                    Console.WriteLine("Field partial name: {0:s}", itr.Current().GetPartialName());

                    if (obj.GetType() == Field.Type.e_text && !string.IsNullOrEmpty(obj.GetValueAsString()))
                    {
                        var o = obj.GetValue();

                        if (o != null)
                        {
                            string val = null;
                            if (o.IsString()) val = o.GetAsPDFText();
                            else if (o.IsName()) val = o.GetName();
                            else if (o.IsNumber()) val = o.GetNumber().ToString();

                            Console.WriteLine("Field value obj: {0}", val);
                        }
                        Console.WriteLine("Field value: {0}", obj.GetValueAsString());
                    }
                    else
                    {
                        Console.WriteLine("Field is blank");
                    }

                    Console.WriteLine("Field type: ");
                    Field.Type type = itr.Current().GetType();
                    switch (type)
                    {
                        case Field.Type.e_button:
                            Console.WriteLine("Button"); break;
                        case Field.Type.e_text:
                            Console.WriteLine("Text"); break;
                        case Field.Type.e_choice:
                            Console.WriteLine("Choice"); break;
                        case Field.Type.e_signature:
                            Console.WriteLine("Signature"); break;
                        case Field.Type.e_check:
                            Console.WriteLine("e_check"); break;
                        case Field.Type.e_null:
                            Console.WriteLine("e_null"); break;
                        case Field.Type.e_radio:
                            Console.WriteLine("e_radio"); break;


                    }

                    Console.WriteLine("------------------------------");
                }
                //mPdfDoc.GetAcroForm().PutBool("NeedAppearances", true);
                Console.WriteLine("Done.");
                var pdfPath = $"{directoryFound}/npma33.pdf";
                //doc.Save(pdfPath, 0);
                mPdfViewCtrl.SetDoc(mPdfDoc);
                //var t = Android.Net.Uri.FromFile(new Java.IO.File(pdfPath));
                //var config = new pdftron.PDF.Config.ViewerConfig.Builder().OpenUrlCachePath(this.CacheDir.AbsolutePath).Build();
                //pdftron.PDF.Controls.DocumentActivity.OpenDocument(this, t, config);

            }
            catch (PDFNetException e)
            {
                Console.WriteLine(e.Message);

            }

        }


    }
}
