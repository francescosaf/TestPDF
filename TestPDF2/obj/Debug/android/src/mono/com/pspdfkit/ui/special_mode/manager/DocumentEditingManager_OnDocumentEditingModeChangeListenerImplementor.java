package mono.com.pspdfkit.ui.special_mode.manager;


public class DocumentEditingManager_OnDocumentEditingModeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.DocumentEditingManager.OnDocumentEditingModeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEnterDocumentEditingMode:(Lcom/pspdfkit/ui/special_mode/controller/DocumentEditingController;)V:GetOnEnterDocumentEditingMode_Lcom_pspdfkit_ui_special_mode_controller_DocumentEditingController_Handler:PSPDFKit.UI.SpecialMode.Manager.IDocumentEditingManagerOnDocumentEditingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onExitDocumentEditingMode:(Lcom/pspdfkit/ui/special_mode/controller/DocumentEditingController;)V:GetOnExitDocumentEditingMode_Lcom_pspdfkit_ui_special_mode_controller_DocumentEditingController_Handler:PSPDFKit.UI.SpecialMode.Manager.IDocumentEditingManagerOnDocumentEditingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IDocumentEditingManagerOnDocumentEditingModeChangeListenerImplementor, PSPDFKit.Android", DocumentEditingManager_OnDocumentEditingModeChangeListenerImplementor.class, __md_methods);
	}


	public DocumentEditingManager_OnDocumentEditingModeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentEditingManager_OnDocumentEditingModeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IDocumentEditingManagerOnDocumentEditingModeChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onEnterDocumentEditingMode (com.pspdfkit.ui.special_mode.controller.DocumentEditingController p0)
	{
		n_onEnterDocumentEditingMode (p0);
	}

	private native void n_onEnterDocumentEditingMode (com.pspdfkit.ui.special_mode.controller.DocumentEditingController p0);


	public void onExitDocumentEditingMode (com.pspdfkit.ui.special_mode.controller.DocumentEditingController p0)
	{
		n_onExitDocumentEditingMode (p0);
	}

	private native void n_onExitDocumentEditingMode (com.pspdfkit.ui.special_mode.controller.DocumentEditingController p0);

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
