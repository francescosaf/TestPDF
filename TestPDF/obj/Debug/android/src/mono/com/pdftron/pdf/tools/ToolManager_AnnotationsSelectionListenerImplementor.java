package mono.com.pdftron.pdf.tools;


public class ToolManager_AnnotationsSelectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.AnnotationsSelectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationsSelectionChanged:(Ljava/util/HashMap;)V:GetOnAnnotationsSelectionChanged_Ljava_util_HashMap_Handler:pdftron.PDF.Tools.ToolManager/IAnnotationsSelectionListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IAnnotationsSelectionListenerImplementor, PDFViewCtrlTools", ToolManager_AnnotationsSelectionListenerImplementor.class, __md_methods);
	}


	public ToolManager_AnnotationsSelectionListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_AnnotationsSelectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IAnnotationsSelectionListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationsSelectionChanged (java.util.HashMap p0)
	{
		n_onAnnotationsSelectionChanged (p0);
	}

	private native void n_onAnnotationsSelectionChanged (java.util.HashMap p0);

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
