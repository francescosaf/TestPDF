package mono.com.pdftron.pdf.utils;


public class AnnotationClipboardHelper_OnClipboardTaskListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.utils.AnnotationClipboardHelper.OnClipboardTaskListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onnClipboardTaskDone:(Ljava/lang/String;)V:GetOnnClipboardTaskDone_Ljava_lang_String_Handler:pdftron.PDF.Tools.Utils.AnnotationClipboardHelper/IOnClipboardTaskListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.Utils.AnnotationClipboardHelper+IOnClipboardTaskListenerImplementor, PDFViewCtrlTools", AnnotationClipboardHelper_OnClipboardTaskListenerImplementor.class, __md_methods);
	}


	public AnnotationClipboardHelper_OnClipboardTaskListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationClipboardHelper_OnClipboardTaskListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.Utils.AnnotationClipboardHelper+IOnClipboardTaskListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onnClipboardTaskDone (java.lang.String p0)
	{
		n_onnClipboardTaskDone (p0);
	}

	private native void n_onnClipboardTaskDone (java.lang.String p0);

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
