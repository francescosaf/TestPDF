package mono.com.pspdfkit.ui.actionmenu;


public class ActionMenuListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.actionmenu.ActionMenuListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActionMenuItemClicked:(Lcom/pspdfkit/ui/actionmenu/ActionMenu;Lcom/pspdfkit/ui/actionmenu/ActionMenuItem;)Z:GetOnActionMenuItemClicked_Lcom_pspdfkit_ui_actionmenu_ActionMenu_Lcom_pspdfkit_ui_actionmenu_ActionMenuItem_Handler:PSPDFKit.UI.ActionMenuSdk.IActionMenuListenerInvoker, PSPDFKit.Android\n" +
			"n_onActionMenuItemLongClicked:(Lcom/pspdfkit/ui/actionmenu/ActionMenu;Lcom/pspdfkit/ui/actionmenu/ActionMenuItem;)Z:GetOnActionMenuItemLongClicked_Lcom_pspdfkit_ui_actionmenu_ActionMenu_Lcom_pspdfkit_ui_actionmenu_ActionMenuItem_Handler:PSPDFKit.UI.ActionMenuSdk.IActionMenuListenerInvoker, PSPDFKit.Android\n" +
			"n_onDisplayActionMenu:(Lcom/pspdfkit/ui/actionmenu/ActionMenu;)V:GetOnDisplayActionMenu_Lcom_pspdfkit_ui_actionmenu_ActionMenu_Handler:PSPDFKit.UI.ActionMenuSdk.IActionMenuListenerInvoker, PSPDFKit.Android\n" +
			"n_onPrepareActionMenu:(Lcom/pspdfkit/ui/actionmenu/ActionMenu;)Z:GetOnPrepareActionMenu_Lcom_pspdfkit_ui_actionmenu_ActionMenu_Handler:PSPDFKit.UI.ActionMenuSdk.IActionMenuListenerInvoker, PSPDFKit.Android\n" +
			"n_onRemoveActionMenu:(Lcom/pspdfkit/ui/actionmenu/ActionMenu;)V:GetOnRemoveActionMenu_Lcom_pspdfkit_ui_actionmenu_ActionMenu_Handler:PSPDFKit.UI.ActionMenuSdk.IActionMenuListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.ActionMenuSdk.IActionMenuListenerImplementor, PSPDFKit.Android", ActionMenuListenerImplementor.class, __md_methods);
	}


	public ActionMenuListenerImplementor ()
	{
		super ();
		if (getClass () == ActionMenuListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.ActionMenuSdk.IActionMenuListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onActionMenuItemClicked (com.pspdfkit.ui.actionmenu.ActionMenu p0, com.pspdfkit.ui.actionmenu.ActionMenuItem p1)
	{
		return n_onActionMenuItemClicked (p0, p1);
	}

	private native boolean n_onActionMenuItemClicked (com.pspdfkit.ui.actionmenu.ActionMenu p0, com.pspdfkit.ui.actionmenu.ActionMenuItem p1);


	public boolean onActionMenuItemLongClicked (com.pspdfkit.ui.actionmenu.ActionMenu p0, com.pspdfkit.ui.actionmenu.ActionMenuItem p1)
	{
		return n_onActionMenuItemLongClicked (p0, p1);
	}

	private native boolean n_onActionMenuItemLongClicked (com.pspdfkit.ui.actionmenu.ActionMenu p0, com.pspdfkit.ui.actionmenu.ActionMenuItem p1);


	public void onDisplayActionMenu (com.pspdfkit.ui.actionmenu.ActionMenu p0)
	{
		n_onDisplayActionMenu (p0);
	}

	private native void n_onDisplayActionMenu (com.pspdfkit.ui.actionmenu.ActionMenu p0);


	public boolean onPrepareActionMenu (com.pspdfkit.ui.actionmenu.ActionMenu p0)
	{
		return n_onPrepareActionMenu (p0);
	}

	private native boolean n_onPrepareActionMenu (com.pspdfkit.ui.actionmenu.ActionMenu p0);


	public void onRemoveActionMenu (com.pspdfkit.ui.actionmenu.ActionMenu p0)
	{
		n_onRemoveActionMenu (p0);
	}

	private native void n_onRemoveActionMenu (com.pspdfkit.ui.actionmenu.ActionMenu p0);

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
