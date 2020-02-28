package mono.com.pdftron.pdf.tools;


public class ToolManager_AnnotationModificationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.AnnotationModificationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_annotationsCouldNotBeAdded:(Ljava/lang/String;)V:GetAnnotationsCouldNotBeAdded_Ljava_lang_String_Handler:pdftron.PDF.Tools.ToolManager/IAnnotationModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onAnnotationsAdded:(Ljava/util/Map;)V:GetOnAnnotationsAdded_Ljava_util_Map_Handler:pdftron.PDF.Tools.ToolManager/IAnnotationModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onAnnotationsModified:(Ljava/util/Map;Landroid/os/Bundle;)V:GetOnAnnotationsModified_Ljava_util_Map_Landroid_os_Bundle_Handler:pdftron.PDF.Tools.ToolManager/IAnnotationModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onAnnotationsPreModify:(Ljava/util/Map;)V:GetOnAnnotationsPreModify_Ljava_util_Map_Handler:pdftron.PDF.Tools.ToolManager/IAnnotationModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onAnnotationsPreRemove:(Ljava/util/Map;)V:GetOnAnnotationsPreRemove_Ljava_util_Map_Handler:pdftron.PDF.Tools.ToolManager/IAnnotationModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onAnnotationsRemoved:(Ljava/util/Map;)V:GetOnAnnotationsRemoved_Ljava_util_Map_Handler:pdftron.PDF.Tools.ToolManager/IAnnotationModificationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onAnnotationsRemovedOnPage:(I)V:GetOnAnnotationsRemovedOnPage_IHandler:pdftron.PDF.Tools.ToolManager/IAnnotationModificationListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IAnnotationModificationListenerImplementor, PDFViewCtrlTools", ToolManager_AnnotationModificationListenerImplementor.class, __md_methods);
	}


	public ToolManager_AnnotationModificationListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_AnnotationModificationListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IAnnotationModificationListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void annotationsCouldNotBeAdded (java.lang.String p0)
	{
		n_annotationsCouldNotBeAdded (p0);
	}

	private native void n_annotationsCouldNotBeAdded (java.lang.String p0);


	public void onAnnotationsAdded (java.util.Map p0)
	{
		n_onAnnotationsAdded (p0);
	}

	private native void n_onAnnotationsAdded (java.util.Map p0);


	public void onAnnotationsModified (java.util.Map p0, android.os.Bundle p1)
	{
		n_onAnnotationsModified (p0, p1);
	}

	private native void n_onAnnotationsModified (java.util.Map p0, android.os.Bundle p1);


	public void onAnnotationsPreModify (java.util.Map p0)
	{
		n_onAnnotationsPreModify (p0);
	}

	private native void n_onAnnotationsPreModify (java.util.Map p0);


	public void onAnnotationsPreRemove (java.util.Map p0)
	{
		n_onAnnotationsPreRemove (p0);
	}

	private native void n_onAnnotationsPreRemove (java.util.Map p0);


	public void onAnnotationsRemoved (java.util.Map p0)
	{
		n_onAnnotationsRemoved (p0);
	}

	private native void n_onAnnotationsRemoved (java.util.Map p0);


	public void onAnnotationsRemovedOnPage (int p0)
	{
		n_onAnnotationsRemovedOnPage (p0);
	}

	private native void n_onAnnotationsRemovedOnPage (int p0);

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
