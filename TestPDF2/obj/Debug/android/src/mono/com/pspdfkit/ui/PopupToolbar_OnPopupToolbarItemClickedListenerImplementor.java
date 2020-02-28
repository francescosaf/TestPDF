package mono.com.pspdfkit.ui;


public class PopupToolbar_OnPopupToolbarItemClickedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.PopupToolbar.OnPopupToolbarItemClickedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemClicked:(Lcom/pspdfkit/ui/toolbar/popup/PopupToolbarMenuItem;)Z:GetOnItemClicked_Lcom_pspdfkit_ui_toolbar_popup_PopupToolbarMenuItem_Handler:PSPDFKit.UI.PopupToolbar/IOnPopupToolbarItemClickedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.PopupToolbar+IOnPopupToolbarItemClickedListenerImplementor, PSPDFKit.Android", PopupToolbar_OnPopupToolbarItemClickedListenerImplementor.class, __md_methods);
	}


	public PopupToolbar_OnPopupToolbarItemClickedListenerImplementor ()
	{
		super ();
		if (getClass () == PopupToolbar_OnPopupToolbarItemClickedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.PopupToolbar+IOnPopupToolbarItemClickedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onItemClicked (com.pspdfkit.ui.toolbar.popup.PopupToolbarMenuItem p0)
	{
		return n_onItemClicked (p0);
	}

	private native boolean n_onItemClicked (com.pspdfkit.ui.toolbar.popup.PopupToolbarMenuItem p0);

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
