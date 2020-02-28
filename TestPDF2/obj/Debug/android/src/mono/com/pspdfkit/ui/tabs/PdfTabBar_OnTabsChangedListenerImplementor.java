package mono.com.pspdfkit.ui.tabs;


public class PdfTabBar_OnTabsChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.tabs.PdfTabBar.OnTabsChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTabsChanged:()V:GetOnTabsChangedHandler:PSPDFKit.UI.Tabs.PdfTabBar/IOnTabsChangedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Tabs.PdfTabBar+IOnTabsChangedListenerImplementor, PSPDFKit.Android", PdfTabBar_OnTabsChangedListenerImplementor.class, __md_methods);
	}


	public PdfTabBar_OnTabsChangedListenerImplementor ()
	{
		super ();
		if (getClass () == PdfTabBar_OnTabsChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Tabs.PdfTabBar+IOnTabsChangedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onTabsChanged ()
	{
		n_onTabsChanged ();
	}

	private native void n_onTabsChanged ();

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
