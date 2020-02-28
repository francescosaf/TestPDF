package mono.com.pdftron.pdf.tools;


public class AnnotManager_AnnotationSyncingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.AnnotManager.AnnotationSyncingListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLocalChange:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V:GetOnLocalChange_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Handler:pdftron.PDF.Tools.AnnotManager/IAnnotationSyncingListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.AnnotManager+IAnnotationSyncingListenerImplementor, PDFViewCtrlTools", AnnotManager_AnnotationSyncingListenerImplementor.class, __md_methods);
	}


	public AnnotManager_AnnotationSyncingListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotManager_AnnotationSyncingListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.AnnotManager+IAnnotationSyncingListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onLocalChange (java.lang.String p0, java.lang.String p1, java.lang.String p2)
	{
		n_onLocalChange (p0, p1, p2);
	}

	private native void n_onLocalChange (java.lang.String p0, java.lang.String p1, java.lang.String p2);

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
