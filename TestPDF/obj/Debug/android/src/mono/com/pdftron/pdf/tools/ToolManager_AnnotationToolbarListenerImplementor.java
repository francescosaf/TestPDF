package mono.com.pdftron.pdf.tools;


public class ToolManager_AnnotationToolbarListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.AnnotationToolbarListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_annotationToolbarHeight:()I:GetAnnotationToolbarHeightHandler:pdftron.PDF.Tools.ToolManager/IAnnotationToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_inkEditSelected:(Lcom/pdftron/pdf/Annot;I)V:GetInkEditSelected_Lcom_pdftron_pdf_Annot_IHandler:pdftron.PDF.Tools.ToolManager/IAnnotationToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_openAnnotationToolbar:(Lcom/pdftron/pdf/tools/ToolManager$ToolMode;)V:GetOpenAnnotationToolbar_Lcom_pdftron_pdf_tools_ToolManager_ToolMode_Handler:pdftron.PDF.Tools.ToolManager/IAnnotationToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_openEditToolbar:(Lcom/pdftron/pdf/tools/ToolManager$ToolMode;)V:GetOpenEditToolbar_Lcom_pdftron_pdf_tools_ToolManager_ToolMode_Handler:pdftron.PDF.Tools.ToolManager/IAnnotationToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_toolbarHeight:()I:GetToolbarHeightHandler:pdftron.PDF.Tools.ToolManager/IAnnotationToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IAnnotationToolbarListenerImplementor, PDFViewCtrlTools", ToolManager_AnnotationToolbarListenerImplementor.class, __md_methods);
	}


	public ToolManager_AnnotationToolbarListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_AnnotationToolbarListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IAnnotationToolbarListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public int annotationToolbarHeight ()
	{
		return n_annotationToolbarHeight ();
	}

	private native int n_annotationToolbarHeight ();


	public void inkEditSelected (com.pdftron.pdf.Annot p0, int p1)
	{
		n_inkEditSelected (p0, p1);
	}

	private native void n_inkEditSelected (com.pdftron.pdf.Annot p0, int p1);


	public void openAnnotationToolbar (com.pdftron.pdf.tools.ToolManager.ToolMode p0)
	{
		n_openAnnotationToolbar (p0);
	}

	private native void n_openAnnotationToolbar (com.pdftron.pdf.tools.ToolManager.ToolMode p0);


	public void openEditToolbar (com.pdftron.pdf.tools.ToolManager.ToolMode p0)
	{
		n_openEditToolbar (p0);
	}

	private native void n_openEditToolbar (com.pdftron.pdf.tools.ToolManager.ToolMode p0);


	public int toolbarHeight ()
	{
		return n_toolbarHeight ();
	}

	private native int n_toolbarHeight ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
