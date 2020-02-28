package mono.com.pspdfkit.ui.toolbar;


public class ContextualToolbar_OnMenuItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.toolbar.ContextualToolbar.OnMenuItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onToolbarMenuItemClick:(Lcom/pspdfkit/ui/toolbar/ContextualToolbar;Lcom/pspdfkit/ui/toolbar/ContextualToolbarMenuItem;)Z:GetOnToolbarMenuItemClick_Lcom_pspdfkit_ui_toolbar_ContextualToolbar_Lcom_pspdfkit_ui_toolbar_ContextualToolbarMenuItem_Handler:PSPDFKit.UI.Toolbar.ContextualToolbar/IOnMenuItemClickListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Toolbar.ContextualToolbar+IOnMenuItemClickListenerImplementor, PSPDFKit.Android", ContextualToolbar_OnMenuItemClickListenerImplementor.class, __md_methods);
	}


	public ContextualToolbar_OnMenuItemClickListenerImplementor ()
	{
		super ();
		if (getClass () == ContextualToolbar_OnMenuItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Toolbar.ContextualToolbar+IOnMenuItemClickListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onToolbarMenuItemClick (com.pspdfkit.ui.toolbar.ContextualToolbar p0, com.pspdfkit.ui.toolbar.ContextualToolbarMenuItem p1)
	{
		return n_onToolbarMenuItemClick (p0, p1);
	}

	private native boolean n_onToolbarMenuItemClick (com.pspdfkit.ui.toolbar.ContextualToolbar p0, com.pspdfkit.ui.toolbar.ContextualToolbarMenuItem p1);

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
