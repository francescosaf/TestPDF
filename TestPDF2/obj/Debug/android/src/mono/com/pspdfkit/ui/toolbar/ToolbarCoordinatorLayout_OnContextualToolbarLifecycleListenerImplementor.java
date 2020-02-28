package mono.com.pspdfkit.ui.toolbar;


public class ToolbarCoordinatorLayout_OnContextualToolbarLifecycleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.toolbar.ToolbarCoordinatorLayout.OnContextualToolbarLifecycleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDisplayContextualToolbar:(Lcom/pspdfkit/ui/toolbar/ContextualToolbar;)V:GetOnDisplayContextualToolbar_Lcom_pspdfkit_ui_toolbar_ContextualToolbar_Handler:PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout/IOnContextualToolbarLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"n_onPrepareContextualToolbar:(Lcom/pspdfkit/ui/toolbar/ContextualToolbar;)V:GetOnPrepareContextualToolbar_Lcom_pspdfkit_ui_toolbar_ContextualToolbar_Handler:PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout/IOnContextualToolbarLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"n_onRemoveContextualToolbar:(Lcom/pspdfkit/ui/toolbar/ContextualToolbar;)V:GetOnRemoveContextualToolbar_Lcom_pspdfkit_ui_toolbar_ContextualToolbar_Handler:PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout/IOnContextualToolbarLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout+IOnContextualToolbarLifecycleListenerImplementor, PSPDFKit.Android", ToolbarCoordinatorLayout_OnContextualToolbarLifecycleListenerImplementor.class, __md_methods);
	}


	public ToolbarCoordinatorLayout_OnContextualToolbarLifecycleListenerImplementor ()
	{
		super ();
		if (getClass () == ToolbarCoordinatorLayout_OnContextualToolbarLifecycleListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout+IOnContextualToolbarLifecycleListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDisplayContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0)
	{
		n_onDisplayContextualToolbar (p0);
	}

	private native void n_onDisplayContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0);


	public void onPrepareContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0)
	{
		n_onPrepareContextualToolbar (p0);
	}

	private native void n_onPrepareContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0);


	public void onRemoveContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0)
	{
		n_onRemoveContextualToolbar (p0);
	}

	private native void n_onRemoveContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0);

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
