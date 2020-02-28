package mono.com.pdftron.pdf.tools;


public class ToolManager_OnLayoutListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.OnLayoutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler:pdftron.PDF.Tools.ToolManager/IOnLayoutListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IOnLayoutListenerImplementor, PDFViewCtrlTools", ToolManager_OnLayoutListenerImplementor.class, __md_methods);
	}


	public ToolManager_OnLayoutListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_OnLayoutListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IOnLayoutListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);

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
