package mono.com.pspdfkit.ui.tabs;


public class PdfTabBar_OnTabClickedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.tabs.PdfTabBar.OnTabClickedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCloseButtonClicked:(Lcom/pspdfkit/ui/tabs/PdfTabBarItem;)Z:GetOnCloseButtonClicked_Lcom_pspdfkit_ui_tabs_PdfTabBarItem_Handler:PSPDFKit.UI.Tabs.PdfTabBar/IOnTabClickedListenerInvoker, PSPDFKit.Android\n" +
			"n_onTabClicked:(Lcom/pspdfkit/ui/tabs/PdfTabBarItem;)Z:GetOnTabClicked_Lcom_pspdfkit_ui_tabs_PdfTabBarItem_Handler:PSPDFKit.UI.Tabs.PdfTabBar/IOnTabClickedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Tabs.PdfTabBar+IOnTabClickedListenerImplementor, PSPDFKit.Android", PdfTabBar_OnTabClickedListenerImplementor.class, __md_methods);
	}


	public PdfTabBar_OnTabClickedListenerImplementor ()
	{
		super ();
		if (getClass () == PdfTabBar_OnTabClickedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Tabs.PdfTabBar+IOnTabClickedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onCloseButtonClicked (com.pspdfkit.ui.tabs.PdfTabBarItem p0)
	{
		return n_onCloseButtonClicked (p0);
	}

	private native boolean n_onCloseButtonClicked (com.pspdfkit.ui.tabs.PdfTabBarItem p0);


	public boolean onTabClicked (com.pspdfkit.ui.tabs.PdfTabBarItem p0)
	{
		return n_onTabClicked (p0);
	}

	private native boolean n_onTabClicked (com.pspdfkit.ui.tabs.PdfTabBarItem p0);

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
