package mono.com.pspdfkit.ui.toolbar;


public class ToolbarCoordinatorLayout_OnContextualToolbarMovementListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.toolbar.ToolbarCoordinatorLayout.OnContextualToolbarMovementListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachContextualToolbar:(Lcom/pspdfkit/ui/toolbar/ContextualToolbar;)V:GetOnAttachContextualToolbar_Lcom_pspdfkit_ui_toolbar_ContextualToolbar_Handler:PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout/IOnContextualToolbarMovementListenerInvoker, PSPDFKit.Android\n" +
			"n_onDetachContextualToolbar:(Lcom/pspdfkit/ui/toolbar/ContextualToolbar;)V:GetOnDetachContextualToolbar_Lcom_pspdfkit_ui_toolbar_ContextualToolbar_Handler:PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout/IOnContextualToolbarMovementListenerInvoker, PSPDFKit.Android\n" +
			"n_onDragContextualToolbar:(Lcom/pspdfkit/ui/toolbar/ContextualToolbar;II)V:GetOnDragContextualToolbar_Lcom_pspdfkit_ui_toolbar_ContextualToolbar_IIHandler:PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout/IOnContextualToolbarMovementListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout+IOnContextualToolbarMovementListenerImplementor, PSPDFKit.Android", ToolbarCoordinatorLayout_OnContextualToolbarMovementListenerImplementor.class, __md_methods);
	}


	public ToolbarCoordinatorLayout_OnContextualToolbarMovementListenerImplementor ()
	{
		super ();
		if (getClass () == ToolbarCoordinatorLayout_OnContextualToolbarMovementListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Toolbar.ToolbarCoordinatorLayout+IOnContextualToolbarMovementListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAttachContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0)
	{
		n_onAttachContextualToolbar (p0);
	}

	private native void n_onAttachContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0);


	public void onDetachContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0)
	{
		n_onDetachContextualToolbar (p0);
	}

	private native void n_onDetachContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0);


	public void onDragContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0, int p1, int p2)
	{
		n_onDragContextualToolbar (p0, p1, p2);
	}

	private native void n_onDragContextualToolbar (com.pspdfkit.ui.toolbar.ContextualToolbar p0, int p1, int p2);

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
