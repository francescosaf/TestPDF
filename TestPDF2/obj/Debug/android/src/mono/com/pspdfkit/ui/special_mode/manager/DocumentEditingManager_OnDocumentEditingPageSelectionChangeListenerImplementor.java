package mono.com.pspdfkit.ui.special_mode.manager;


public class DocumentEditingManager_OnDocumentEditingPageSelectionChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.DocumentEditingManager.OnDocumentEditingPageSelectionChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentEditingPageSelectionChanged:(Lcom/pspdfkit/ui/special_mode/controller/DocumentEditingController;)V:GetOnDocumentEditingPageSelectionChanged_Lcom_pspdfkit_ui_special_mode_controller_DocumentEditingController_Handler:PSPDFKit.UI.SpecialMode.Manager.IDocumentEditingManagerOnDocumentEditingPageSelectionChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IDocumentEditingManagerOnDocumentEditingPageSelectionChangeListenerImplementor, PSPDFKit.Android", DocumentEditingManager_OnDocumentEditingPageSelectionChangeListenerImplementor.class, __md_methods);
	}


	public DocumentEditingManager_OnDocumentEditingPageSelectionChangeListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentEditingManager_OnDocumentEditingPageSelectionChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IDocumentEditingManagerOnDocumentEditingPageSelectionChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDocumentEditingPageSelectionChanged (com.pspdfkit.ui.special_mode.controller.DocumentEditingController p0)
	{
		n_onDocumentEditingPageSelectionChanged (p0);
	}

	private native void n_onDocumentEditingPageSelectionChanged (com.pspdfkit.ui.special_mode.controller.DocumentEditingController p0);

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
