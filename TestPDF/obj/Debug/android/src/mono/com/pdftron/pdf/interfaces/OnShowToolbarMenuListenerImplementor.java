package mono.com.pdftron.pdf.interfaces;


public class OnShowToolbarMenuListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.interfaces.OnShowToolbarMenuListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onShowToolbarMenu:(Z)V:GetOnShowToolbarMenu_ZHandler:pdftron.PDF.Interfaces.IOnShowToolbarMenuListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Interfaces.IOnShowToolbarMenuListenerImplementor, PDFViewCtrlTools", OnShowToolbarMenuListenerImplementor.class, __md_methods);
	}


	public OnShowToolbarMenuListenerImplementor ()
	{
		super ();
		if (getClass () == OnShowToolbarMenuListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Interfaces.IOnShowToolbarMenuListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onShowToolbarMenu (boolean p0)
	{
		n_onShowToolbarMenu (p0);
	}

	private native void n_onShowToolbarMenu (boolean p0);

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
