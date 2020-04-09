
using System;
using System.Collections.Generic;
using System.IO;

using Android.App;
using Android.Content;
using Android.Graphics;
using Android.Graphics.Drawables;
using Android.OS;
using Android.Widget;
using AndroidX.AppCompat.App;
using AndroidX.Core.Content;
using Java.Lang;
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
    [Activity(Label = "PdfTronAct2")]
    public class PdfTronAct2 : AppCompatActivity, ToolManager.IBasicAnnotationListener, ToolManager.IAnnotationModificationListener
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

            SetContentView(Resource.Layout.PdfTronAct2);

            Window.SetSoftInputMode(Android.Views.SoftInput.AdjustPan);

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
            ViewFromResource(Resource.Raw.FMTestForm, "FMTestForm");



            FindViewById<Button>(Resource.Id.FillPDFTron).Click += async (_, e) =>
            {
                FillPdf();
            };


            mPdfDoc.InitSecurityHandler();
            mPdfViewCtrl.SetHighlightFields(false);
        }

        public void SetupToolManager()
        {

            mToolManager = ToolManagerBuilder.From().Build(this, mPdfViewCtrl);
            mToolManager.SetBasicAnnotationListener(this);
            mToolManager.AddAnnotationModificationListener(this);


            mToolManager.AnnotationsModified += (sender, e) =>
            {
                System.Diagnostics.Debug.WriteLine("---.----.-----");
                var extra = e.Extra;
                /*
                    For example, when checkbox value has been changed, this code will print:
                    calling method: handleWidget
                    property: OTHER
                */
                if (extra != null && extra.ContainsKey(Tool.MethodFrom))
                {
                    string methodCalling = extra.GetString(Tool.MethodFrom);
                    Console.WriteLine("AnnotationsModified calling method " + methodCalling);
                    var property = pdftron.PDF.Model.AnnotationProperty.GetProperty(methodCalling);
                    Console.WriteLine("AnnotationsModified property: " + property);
                }

                /*
                    For example, when changed annotation opacity to 50%
                    calling method: editOpacity
                    property: OPACITY
                    key: opacity
                    value: 0.5
                */
                if (extra != null && extra.ContainsKey(Tool.Keys))
                {
                    string[] paramKeys = extra.GetStringArray(Tool.Keys);
                    if (paramKeys != null)
                    {
                        foreach (var key in paramKeys)
                        {
                            Java.Lang.Object param = extra.Get(key);
                            Console.WriteLine("AnnotationsModified key: " + key);
                            Console.WriteLine("AnnotationsModified value: " + param.ToString());
                        }
                    }
                }

                // Do something with the annots
                foreach (var item in e.Annots)
                {
                    var nativeAnnot = item.Key;
                    var annot = TypeConvertHelper.ConvAnnotToManaged(nativeAnnot);
                    if (annot != null && annot.IsValid())
                    {
                        Annot.Type type = annot.GetType();
                        Console.WriteLine("AnnotationsModified: type: " + type);
                    }
                }
            };
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

        public void ViewFromResource(int resourceId, System.String fileName)
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


                /*
                 * Name Space pdftronprivate what is pdftronprivate?
                 * pdftronprivate.PDF.Annot.Type.e_Widge doesn't exist
                 */

                var annots = mPdfViewCtrl.GetAnnotationsOnPage(1);
                int signatureBorderWidth = 9;

                foreach (var annot in annots)
                {

                    if (annot.Type == (int)pdftron.PDF.Annot.Type.e_Widget)
                    {
                        Widget w = new Widget(annot);

                        var annot2 = TypeConvertHelper.ConvAnnotToManaged(annot);

                        // var annotObjNum = annot2.GetSDFObj().GetObjNum();

                        pdftron.PDF.Annots.Widget widget = new pdftron.PDF.Annots.Widget(annot2);

                        Field fld = widget.GetField();
                        string field_name = fld.GetName();

                        System.Diagnostics.Debug.WriteLine("*****" + field_name + "*****" + fld.GetType());

                        /////
                        ///ADDD A BORDER
                        Context context = mPdfViewCtrl.Context;
                        CustomRelativeLayout overlay = new CustomRelativeLayout(context);

                        var square_drawable = ContextCompat.GetDrawable(context, Resource.Drawable.signature_field_border);
                        GradientDrawable square_drawableColored = (GradientDrawable)square_drawable;
                        square_drawableColored.SetStroke(3, Color.Red, 10, 10);
                        overlay.Background = square_drawableColored;
                        overlay.SetAnnot(mPdfViewCtrl, annot, 1);
                        //overlay.SetZoomWithParent(true);
                        mPdfViewCtrl.AddView(overlay);

                        System.Diagnostics.Debug.WriteLine($"{fld.GetName()} {fld.GetType()}");

                        if (fld.GetType() == Field.Type.e_text)
                        {
                            fld.SetValue("John xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        }

                        var colorPt1 = Utils.Color2ColorPt(Color.Cyan);
                        w.SetBackgroundColor(colorPt1, 3);
                        //TypeConvertHelper.ConvAnnotToManaged(annot).GetSDFObj().Erase("AP");
                        widget.GetSDFObj().Erase("AP");
                        //annot2.GetSDFObj().Erase("AP");
                        w.RefreshAppearance();
                        mPdfViewCtrl.Update(annot, 1);


                    }
                }

            }
            catch (PDFNetException e)
            {
                Console.WriteLine(e.Message);

            }

        }

        public void OnAnnotationSelected(pdftronprivate.PDF.Annot annot, int pageNum)
        {
            System.Diagnostics.Debug.WriteLine("******** OnAnnotationSelected");
        }

        public void OnAnnotationUnselected()
        {
            System.Diagnostics.Debug.WriteLine("######### OnAnnotationUnselected");
        }

        public bool OnInterceptAnnotationHandling(pdftronprivate.PDF.Annot annot, Bundle extra, ToolManager.ToolMode toolMode)
        {
            try
            {
                System.Diagnostics.Debug.WriteLine("xxxxxx OnInterceptAnnotationHandling");
                var annot2 = TypeConvertHelper.ConvAnnotToManaged(annot);

                // var annotObjNum = annot2.GetSDFObj().GetObjNum();

                pdftron.PDF.Annots.Widget widget = new pdftron.PDF.Annots.Widget(annot2);

                Field fld = widget.GetField();
                System.Diagnostics.Debug.WriteLine($"{fld.GetValueAsString()}");
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
            System.Diagnostics.Debug.WriteLine("********   OnInterceptDialog");
            return true;
        }

        public void AnnotationsCouldNotBeAdded(string errorMessage)
        {
            System.Diagnostics.Debug.WriteLine("******** AnnotationsCouldNotBeAdded");
        }

        public void OnAnnotationsAdded(IDictionary<pdftronprivate.PDF.Annot, Integer> annots)
        {
            System.Diagnostics.Debug.WriteLine("******** OnAnnotationsAdded");
        }

        public void OnAnnotationsModified(IDictionary<pdftronprivate.PDF.Annot, Integer> annots, Bundle extra)
        {
            try
            {
                System.Diagnostics.Debug.WriteLine("OnAnnotationsModified ****************** OnAnnotationsModified");
                foreach (var annot in annots.Keys)
                {
                    System.Diagnostics.Debug.WriteLine($"######## {annot.GetType()}");
                    var annot2 = TypeConvertHelper.ConvAnnotToManaged(annot);

                    pdftron.PDF.Annots.Widget widget = new pdftron.PDF.Annots.Widget(annot2);

                    Field fld = widget.GetField();
                    System.Diagnostics.Debug.WriteLine($"{fld.GetValueAsString()}");
                }
                // w.c

            }
            catch (PDFNetException e)
            {

            }


        }

        public void OnAnnotationsPreModify(IDictionary<pdftronprivate.PDF.Annot, Integer> annots)
        {
            System.Diagnostics.Debug.WriteLine("******** OnAnnotationsPreModify");
        }

        public void OnAnnotationsPreRemove(IDictionary<pdftronprivate.PDF.Annot, Integer> annots)
        {
            System.Diagnostics.Debug.WriteLine("******** OnAnnotationsPreRemove");
        }

        public void OnAnnotationsRemoved(IDictionary<pdftronprivate.PDF.Annot, Integer> annots)
        {
            System.Diagnostics.Debug.WriteLine("******** OnAnnotationsRemoved");
        }

        public void OnAnnotationsRemovedOnPage(int pageNum)
        {
            System.Diagnostics.Debug.WriteLine("******** OnAnnotationsRemovedOnPage");
        }
    }
}
