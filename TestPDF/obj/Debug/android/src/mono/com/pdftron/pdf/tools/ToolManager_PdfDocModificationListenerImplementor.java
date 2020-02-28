package mono.com.pdftron.pdf.tools;


public class ToolManager_PdfDocModificationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.PdfDocModificationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAllAnnotationsRemoved:()V:GetOnAllAnnotationsRemovedHandler:pdftron.PDF.Tools.ToolManager/IPdfDocModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onAnnotationAction:()V:GetOnAnnotationActionHandler:pdftron.PDF.Tools.ToolManager/IPdfDocModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onBookmarkModified:()V:GetOnBookmarkModifiedHandler:pdftron.PDF.Tools.ToolManager/IPdfDocModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onPageLabelsChanged:()V:GetOnPageLabelsChangedHandler:pdftron.PDF.Tools.ToolManager/IPdfDocModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onPageMoved:(II)V:GetOnPageMoved_IIHandler:pdftron.PDF.Tools.ToolManager/IPdfDocModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onPagesAdded:(Ljava/util/List;)V:GetOnPagesAdded_Ljava_util_List_Handler:pdftron.PDF.Tools.ToolManager/IPdfDocModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onPagesCropped:()V:GetOnPagesCroppedHandler:pdftron.PDF.Tools.ToolManager/IPdfDocModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onPagesDeleted:(Ljava/util/List;)V:GetOnPagesDeleted_Ljava_util_List_Handler:pdftron.PDF.Tools.ToolManager/IPdfDocModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onPagesRotated:(Ljava/util/List;)V:GetOnPagesRotated_Ljava_util_List_Handler:pdftron.PDF.Tools.ToolManager/IPdfDocModificationListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IPdfDocModificationListenerImplementor, PDFViewCtrlTools", ToolManager_PdfDocModificationListenerImplementor.class, __md_methods);
	}


	public ToolManager_PdfDocModificationListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_PdfDocModificationListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IPdfDocModificationListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAllAnnotationsRemoved ()
	{
		n_onAllAnnotationsRemoved ();
	}

	private native void n_onAllAnnotationsRemoved ();


	public void onAnnotationAction ()
	{
		n_onAnnotationAction ();
	}

	private native void n_onAnnotationAction ();


	public void onBookmarkModified ()
	{
		n_onBookmarkModified ();
	}

	private native void n_onBookmarkModified ();


	public void onPageLabelsChanged ()
	{
		n_onPageLabelsChanged ();
	}

	private native void n_onPageLabelsChanged ();


	public void onPageMoved (int p0, int p1)
	{
		n_onPageMoved (p0, p1);
	}

	private native void n_onPageMoved (int p0, int p1);


	public void onPagesAdded (java.util.List p0)
	{
		n_onPagesAdded (p0);
	}

	private native void n_onPagesAdded (java.util.List p0);


	public void onPagesCropped ()
	{
		n_onPagesCropped ();
	}

	private native void n_onPagesCropped ();


	public void onPagesDeleted (java.util.List p0)
	{
		n_onPagesDeleted (p0);
	}

	private native void n_onPagesDeleted (java.util.List p0);


	public void onPagesRotated (java.util.List p0)
	{
		n_onPagesRotated (p0);
	}

	private native void n_onPagesRotated (java.util.List p0);

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
