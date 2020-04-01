
using System;
using System.IO;

using Android.App;
using Android.Content;
using Android.Graphics;
using Android.Graphics.Drawables;
using Android.OS;
using Android.Widget;
using AndroidX.AppCompat.App;
using pdftron.Common;
using pdftron.PDF;
using pdftron.PDF.Config;
using pdftron.PDF.Controls;
using pdftron.PDF.Tools;
using pdftron.PDF.Tools.Utils;
using pdftronprivate.PDF.Annots;
using Path = System.IO.Path;

namespace TestPDF
{
    [Activity(Label = "PdfTronActivity")]
    public class PdfTronActivity : AppCompatActivity, ToolManager.IBasicAnnotationListener
    {
        private pdftron.PDF.PDFViewCtrl mPdfViewCtrl;
        private pdftron.PDF.PDFDoc mPdfDoc;

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

            mPdfViewCtrl = FindViewById<pdftron.PDF.PDFViewCtrl>(Resource.Id.pdfviewctrl);
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
            mToolManager.SetBasicAnnotationListener(this);


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
            mPdfDoc = new pdftron.PDF.PDFDoc(file.AbsolutePath);
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
                mPdfViewCtrl.SetHighlightFields(false);
                //PageIterator itr = mPdfDoc.GetPageIterator();
                //for (; itr.HasNext(); itr.Next())
                //{
                //    Page page = itr.Current();
                //    int num_annots = page.GetNumAnnots();
                //    for (int i = 0; i < num_annots; ++i)
                //    {
                //        Annot annotation = page.GetAnnot(i);
                //        if (annotation.IsValid() == false) continue;
                //        pdftron.PDF.Rect bbox = annotation.GetRect();
                //        Console.WriteLine("  Position: {0:f}, {1:f}, {2:f}, {3:f}",
                //           bbox.x1, bbox.y1, bbox.x2, bbox.y2);
                //        if (annotation.GetType() == Annot.Type.e_Widget)
                //        {
                //            pdftron.PDF.Annots.Widget widget = new pdftron.PDF.Annots.Widget(annotation);

                //            Field fld = widget.GetField();
                //            string field_name = fld.GetName();
                //            Console.WriteLine("Field name: {0:s}", fld.GetName());
                //            if (field_name == "NPMA-33-1-2")
                //            {
                //                Console.WriteLine("Updating ....");
                //                //fld.SetValue("John xxxxxxxx");


                //                var annotObjNum = annotation.GetSDFObj().GetObjNum();
                //                int signatureBorderWidth = 9;
                //                Context context = mPdfViewCtrl.Context;
                //                CustomRelativeLayout overlay = new CustomRelativeLayout(context);
                //                GradientDrawable square_drawable = (GradientDrawable)mPdfViewCtrl.Context.Resources.GetDrawable(Resource.Drawable.signature_field_border);
                //                square_drawable.SetStroke(signatureBorderWidth, Color.Red);
                //                //square_drawable.SetColor(Color.White);

                //                overlay.Background = square_drawable;
                //                var pannot = TypeConvertHelper.ConvAnnotToNative(annotation);
                //                overlay.SetAnnot(mPdfViewCtrl, pannot, 1);
                //                overlay.SetZoomWithParent(true);
                //                mPdfViewCtrl.AddView(overlay);
                //                fld.SetValue("John xxxxxxxx");


                //                var privateAnnot = TypeConvertHelper.ConvAnnotToNative(annotation);
                //                Widget w = new Widget(privateAnnot);
                //                var colorPt = Utils.Color2ColorPt(Color.Red);
                //                w.SetBackgroundColor(colorPt, 3);
                //                w.RefreshAppearance();
                //                mPdfViewCtrl.Update(privateAnnot, 1);

                //                /*
                //                var colorPt = Utils.Color2ColorPt(Color.Red);

                //                //var color = new ColorPt(colorPt);
                //                widget.SetColor(new ColorPt(0.5, 0.5, 0.5));

                //                double[] dash = new double[2];
                //                dash[0] = 2; dash[1] = 4;
                //                widget.SetBorderStyle(new Annot.BorderStyle(Annot.BorderStyle.Style.e_dashed, 3, 0, 0, dash));
                //                widget.RemoveAppearance();
                //                widget.RefreshAppearance();
                //                page.AnnotPushBack(widget);
                //                mPdfViewCtrl.Update(annotation, 1);
                //                */


                //            }
                //        }
                //    }
                //}
                //mPdfViewCtrl.Update(true);

                /*
                 * Name Space pdftronprivate what is pdftronprivate?
                 * pdftronprivate.PDF.Annot.Type.e_Widge doesn't exist
                 */

                var annots = mPdfViewCtrl.GetAnnotationsOnPage(1);
                int x = 0;
                foreach (var annot in annots)
                {
                    if (annot.Type == (int)Annot.Type.e_Widget)
                    {
                        Widget w = new Widget(annot);

                        var annot2 = TypeConvertHelper.ConvAnnotToManaged(annot);

                        // var annotObjNum = annot2.GetSDFObj().GetObjNum();

                        pdftron.PDF.Annots.Widget widget = new pdftron.PDF.Annots.Widget(annot2);

                        Field fld = widget.GetField();
                        string field_name = fld.GetName();
                        if (fld.GetType() == Field.Type.e_text)
                        {
                            fld.SetValue("John xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                            System.Diagnostics.Debug.WriteLine("*****" + field_name + "*****" + fld.GetType());

                            int signatureBorderWidth = 9;
                            Context context = mPdfViewCtrl.Context;
                            CustomRelativeLayout overlay = new CustomRelativeLayout(context);
                            GradientDrawable square_drawable = (GradientDrawable)mPdfViewCtrl.Context.Resources.GetDrawable(Resource.Drawable.signature_field_border);
                            square_drawable.SetStroke(signatureBorderWidth, Color.Red);
                            overlay.Background = square_drawable;
                            overlay.SetAnnot(mPdfViewCtrl, annot, 1);
                            //overlay.SetZoomWithParent(true);
                            mPdfViewCtrl.AddView(overlay);
                            var colorPt1 = Utils.Color2ColorPt(Color.Blue);
                            w.SetBackgroundColor(colorPt1, 3);
                            //w.SetColor(colorPt1);
                            w.RefreshAppearance();
                            mPdfViewCtrl.Update(annot, 1);
                        }

                    }
                }

                // var colorPt = Utils.Color2ColorPt(Color.Red);
                //foreach (var z in annot)
                //{
                //    if (z.Type == pdftronprivate.PDF.Annot.Type.e_Widget)
                //    {
                //        pdftron.PDF.Annots.Widget widget = new pdftron.PDF.Annots.Widget(annotation);
                //        Field fld = widget.GetField();
                //        string field_name = fld.GetName();
                //        Console.WriteLine("Field name: {0:s}", fld.GetName());
                //    }
                //}

                /*

                //FILLL
                var fld = mPdfDoc.GetField("NPMA-33-1-2");
                fld.SetValue("John xxxxxxxx");
                //mPdfViewCtrl.ShowRect(1, fld.GetUpdateRect());
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
                //mPdfViewCtrl.SetDoc(mPdfDoc);
                */
                /*
                var annot = mPdfViewCtrl.GetAnnotationsOnPage(1);
                foreach (var x in annot)
                {
                    var borderStyle = x.GetBorderStyle();
                    borderStyle.SetDash(new double[] { 5d, 5d });
                    Console.WriteLine("***** Field type: {0} ", x.GetType());
                }
                */


                //mPdfViewCtrl.Update(true);
                //var t = Android.Net.Uri.FromFile(new Java.IO.File(pdfPath));
                //var config = new pdftron.PDF.Config.ViewerConfig.Builder().OpenUrlCachePath(this.CacheDir.AbsolutePath).Build();
                //pdftron.PDF.Controls.DocumentActivity.OpenDocument(this, t, config);
                //mPdfViewCtrl.SetZoom((int)fld.GetUpdateRect().x1, (int)fld.GetUpdateRect().y1, 3);


            }
            catch (PDFNetException e)
            {
                Console.WriteLine(e.Message);

            }

        }

        public void OnAnnotationSelected(pdftronprivate.PDF.Annot annot, int pageNum)
        {
            System.Diagnostics.Debug.WriteLine("********");
        }

        public void OnAnnotationUnselected()
        {
            System.Diagnostics.Debug.WriteLine("#########");
        }

        public bool OnInterceptAnnotationHandling(pdftronprivate.PDF.Annot annot, Bundle extra, ToolManager.ToolMode toolMode)
        {
            try
            {
                Widget w = new Widget(annot);
                // w.c

            }
            catch (PDFNetException e)
            {

            }
            // return false so the other events can continue executing
            return false;
        }

        public bool OnInterceptDialog(Android.App.AlertDialog dialog)
        {
            throw new NotImplementedException();
        }
    }
}
