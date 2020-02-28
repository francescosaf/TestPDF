package mono.com.pspdfkit.ui.toolbar;


public class ContextualToolbar_OnMenuItemLongClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.toolbar.ContextualToolbar.OnMenuItemLongClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onToolbarMenuItemLongClick:(Lcom/pspdfkit/ui/toolbar/ContextualToolbar;Lcom/pspdfkit/ui/toolbar/ContextualToolbarMenuItem;)Z:GetOnToolbarMenuItemLongClick_Lcom_pspdfkit_ui_toolbar_ContextualToolbar_Lcom_pspdfkit_ui_toolbar_ContextualToolbarMenuItem_Handler:PSPDFKit.UI.Toolbar.ContextualToolbar/IOnMenuItemLongClickListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Toolbar.ContextualToolbar+IOnMenuItemLongClickListenerImplementor, PSPDFKit.Android", ContextualToolbar_OnMenuItemLongClickListenerImplementor.class, __md_methods);
	}


	public ContextualToolbar_OnMenuItemLongClickListenerImplementor ()
	{
		super ();
		if (getClass () == ContextualToolbar_OnMenuItemLongClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Toolbar.ContextualToolbar+IOnMenuItemLongClickListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onToolbarMenuItemLongClick (com.pspdfkit.ui.toolbar.ContextualToolbar p0, com.pspdfkit.ui.toolbar.ContextualToolbarMenuItem p1)
	{
		return n_onToolbarMenuItemLongClick (p0, p1);
	}

	private native boolean n_onToolbarMenuItemLongClick (com.pspdfkit.ui.toolbar.ContextualToolbar p0, com.pspdfkit.ui.toolbar.ContextualToolbarMenuItem p1);

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
