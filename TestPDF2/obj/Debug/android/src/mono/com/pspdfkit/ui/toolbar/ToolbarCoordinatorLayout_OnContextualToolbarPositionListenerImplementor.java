package mono.com.pspdfkit.ui.toolbar;


public class ToolbarCoordinatorLayout_OnContextualToolbarPositionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.toolbar.ToolbarCoordinatorLayout.OnContextualToolbarPositionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onContextualToolbarPositionChanged:(Lcom/pspdfkit/ui/toolbar/ContextualToolbar;Lcom/pspdfkit/ui/toolbar/ToolbarCoordinatorLayout$LayoutParams$Position;Lcom/pspdfkit/ui/toolbar/ToolbarCoordinatorLayout$LayoutParams$Position;)V:GetOnContextualToolbarPositionChanged_Lcom_pspdfkit_ui_toolbar_ContextualToolbar_Lcom_pspdfkit_ui_toolbar_ToolbarCoordinatorLayout_LayoutParams_Position_Lcom_pspdfkit_ui_toolbar_ToolbarCoordinatorLayout_LayoutParams_Position_Handler:PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout/IOnContextualToolbarPositionListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout+IOnContextualToolbarPositionListenerImplementor, PSPDFKit.Android", ToolbarCoordinatorLayout_OnContextualToolbarPositionListenerImplementor.class, __md_methods);
	}


	public ToolbarCoordinatorLayout_OnContextualToolbarPositionListenerImplementor ()
	{
		super ();
		if (getClass () == ToolbarCoordinatorLayout_OnContextualToolbarPositionListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout+IOnContextualToolbarPositionListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onContextualToolbarPositionChanged (com.pspdfkit.ui.toolbar.ContextualToolbar p0, com.pspdfkit.ui.toolbar.ToolbarCoordinatorLayout.LayoutParams.Position p1, com.pspdfkit.ui.toolbar.ToolbarCoordinatorLayout.LayoutParams.Position p2)
	{
		n_onContextualToolbarPositionChanged (p0, p1, p2);
	}

	private native void n_onContextualToolbarPositionChanged (com.pspdfkit.ui.toolbar.ContextualToolbar p0, com.pspdfkit.ui.toolbar.ToolbarCoordinatorLayout.LayoutParams.Position p1, com.pspdfkit.ui.toolbar.ToolbarCoordinatorLayout.LayoutParams.Position p2);

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
