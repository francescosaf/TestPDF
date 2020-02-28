package mono.com.pdftron.pdf.tools;


public class QuickMenu_OnDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.QuickMenu.OnDismissListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDismiss:()V:GetOnDismissHandler:pdftron.PDF.Tools.QuickMenu/IOnDismissListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.QuickMenu+IOnDismissListenerImplementor, PDFViewCtrlTools", QuickMenu_OnDismissListenerImplementor.class, __md_methods);
	}


	public QuickMenu_OnDismissListenerImplementor ()
	{
		super ();
		if (getClass () == QuickMenu_OnDismissListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.QuickMenu+IOnDismissListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onDismiss ()
	{
		n_onDismiss ();
	}

	private native void n_onDismiss ();

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
