package mono.com.pspdfkit.ui.special_mode.manager;


public class TextSelectionManager_OnTextSelectionModeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.TextSelectionManager.OnTextSelectionModeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEnterTextSelectionMode:(Lcom/pspdfkit/ui/special_mode/controller/TextSelectionController;)V:GetOnEnterTextSelectionMode_Lcom_pspdfkit_ui_special_mode_controller_TextSelectionController_Handler:PSPDFKit.UI.SpecialMode.Manager.ITextSelectionManagerOnTextSelectionModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onExitTextSelectionMode:(Lcom/pspdfkit/ui/special_mode/controller/TextSelectionController;)V:GetOnExitTextSelectionMode_Lcom_pspdfkit_ui_special_mode_controller_TextSelectionController_Handler:PSPDFKit.UI.SpecialMode.Manager.ITextSelectionManagerOnTextSelectionModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.ITextSelectionManagerOnTextSelectionModeChangeListenerImplementor, PSPDFKit.Android", TextSelectionManager_OnTextSelectionModeChangeListenerImplementor.class, __md_methods);
	}


	public TextSelectionManager_OnTextSelectionModeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == TextSelectionManager_OnTextSelectionModeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.ITextSelectionManagerOnTextSelectionModeChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onEnterTextSelectionMode (com.pspdfkit.ui.special_mode.controller.TextSelectionController p0)
	{
		n_onEnterTextSelectionMode (p0);
	}

	private native void n_onEnterTextSelectionMode (com.pspdfkit.ui.special_mode.controller.TextSelectionController p0);


	public void onExitTextSelectionMode (com.pspdfkit.ui.special_mode.controller.TextSelectionController p0)
	{
		n_onExitTextSelectionMode (p0);
	}

	private native void n_onExitTextSelectionMode (com.pspdfkit.ui.special_mode.controller.TextSelectionController p0);

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
