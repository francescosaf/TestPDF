package mono.com.pdftron.pdf.tools;


public class ToolManager_AdvancedAnnotationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.AdvancedAnnotationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_attachFileSelected:(Landroid/graphics/PointF;)V:GetAttachFileSelected_Landroid_graphics_PointF_Handler:pdftron.PDF.Tools.ToolManager/IAdvancedAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_fileAttachmentSelected:(Lcom/pdftron/pdf/annots/FileAttachment;)V:GetFileAttachmentSelected_Lcom_pdftron_pdf_annots_FileAttachment_Handler:pdftron.PDF.Tools.ToolManager/IAdvancedAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_fileCreated:(Ljava/lang/String;Lcom/pdftron/pdf/tools/ToolManager$AdvancedAnnotationListener$AnnotAction;)V:GetFileCreated_Ljava_lang_String_Lcom_pdftron_pdf_tools_ToolManager_AdvancedAnnotationListener_AnnotAction_Handler:pdftron.PDF.Tools.ToolManager/IAdvancedAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_freeTextInlineEditingStarted:()V:GetFreeTextInlineEditingStartedHandler:pdftron.PDF.Tools.ToolManager/IAdvancedAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_freehandStylusUsedFirstTime:()V:GetFreehandStylusUsedFirstTimeHandler:pdftron.PDF.Tools.ToolManager/IAdvancedAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_imageSignatureSelected:(Landroid/graphics/PointF;ILjava/lang/Long;)V:GetImageSignatureSelected_Landroid_graphics_PointF_ILjava_lang_Long_Handler:pdftron.PDF.Tools.ToolManager/IAdvancedAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_imageStamperSelected:(Landroid/graphics/PointF;)V:GetImageStamperSelected_Landroid_graphics_PointF_Handler:pdftron.PDF.Tools.ToolManager/IAdvancedAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_newFileSelectedFromTool:(Ljava/lang/String;)Z:GetNewFileSelectedFromTool_Ljava_lang_String_Handler:pdftron.PDF.Tools.ToolManager/IAdvancedAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IAdvancedAnnotationListenerImplementor, PDFViewCtrlTools", ToolManager_AdvancedAnnotationListenerImplementor.class, __md_methods);
	}


	public ToolManager_AdvancedAnnotationListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_AdvancedAnnotationListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IAdvancedAnnotationListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void attachFileSelected (android.graphics.PointF p0)
	{
		n_attachFileSelected (p0);
	}

	private native void n_attachFileSelected (android.graphics.PointF p0);


	public void fileAttachmentSelected (com.pdftron.pdf.annots.FileAttachment p0)
	{
		n_fileAttachmentSelected (p0);
	}

	private native void n_fileAttachmentSelected (com.pdftron.pdf.annots.FileAttachment p0);


	public void fileCreated (java.lang.String p0, com.pdftron.pdf.tools.ToolManager.AdvancedAnnotationListener.AnnotAction p1)
	{
		n_fileCreated (p0, p1);
	}

	private native void n_fileCreated (java.lang.String p0, com.pdftron.pdf.tools.ToolManager.AdvancedAnnotationListener.AnnotAction p1);


	public void freeTextInlineEditingStarted ()
	{
		n_freeTextInlineEditingStarted ();
	}

	private native void n_freeTextInlineEditingStarted ();


	public void freehandStylusUsedFirstTime ()
	{
		n_freehandStylusUsedFirstTime ();
	}

	private native void n_freehandStylusUsedFirstTime ();


	public void imageSignatureSelected (android.graphics.PointF p0, int p1, java.lang.Long p2)
	{
		n_imageSignatureSelected (p0, p1, p2);
	}

	private native void n_imageSignatureSelected (android.graphics.PointF p0, int p1, java.lang.Long p2);


	public void imageStamperSelected (android.graphics.PointF p0)
	{
		n_imageStamperSelected (p0);
	}

	private native void n_imageStamperSelected (android.graphics.PointF p0);


	public boolean newFileSelectedFromTool (java.lang.String p0)
	{
		return n_newFileSelectedFromTool (p0);
	}

	private native boolean n_newFileSelectedFromTool (java.lang.String p0);

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
