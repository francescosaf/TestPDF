package mono.com.pspdfkit.ui.special_mode.manager;


public class FormManager_OnFormElementEditingModeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.FormManager.OnFormElementEditingModeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChangeFormElementEditingMode:(Lcom/pspdfkit/ui/special_mode/controller/FormEditingController;)V:GetOnChangeFormElementEditingMode_Lcom_pspdfkit_ui_special_mode_controller_FormEditingController_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementEditingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onEnterFormElementEditingMode:(Lcom/pspdfkit/ui/special_mode/controller/FormEditingController;)V:GetOnEnterFormElementEditingMode_Lcom_pspdfkit_ui_special_mode_controller_FormEditingController_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementEditingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onExitFormElementEditingMode:(Lcom/pspdfkit/ui/special_mode/controller/FormEditingController;)V:GetOnExitFormElementEditingMode_Lcom_pspdfkit_ui_special_mode_controller_FormEditingController_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementEditingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementEditingModeChangeListenerImplementor, PSPDFKit.Android", FormManager_OnFormElementEditingModeChangeListenerImplementor.class, __md_methods);
	}


	public FormManager_OnFormElementEditingModeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == FormManager_OnFormElementEditingModeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementEditingModeChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onChangeFormElementEditingMode (com.pspdfkit.ui.special_mode.controller.FormEditingController p0)
	{
		n_onChangeFormElementEditingMode (p0);
	}

	private native void n_onChangeFormElementEditingMode (com.pspdfkit.ui.special_mode.controller.FormEditingController p0);


	public void onEnterFormElementEditingMode (com.pspdfkit.ui.special_mode.controller.FormEditingController p0)
	{
		n_onEnterFormElementEditingMode (p0);
	}

	private native void n_onEnterFormElementEditingMode (com.pspdfkit.ui.special_mode.controller.FormEditingController p0);


	public void onExitFormElementEditingMode (com.pspdfkit.ui.special_mode.controller.FormEditingController p0)
	{
		n_onExitFormElementEditingMode (p0);
	}

	private native void n_onExitFormElementEditingMode (com.pspdfkit.ui.special_mode.controller.FormEditingController p0);

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
