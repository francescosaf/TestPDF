package mono.com.pspdfkit.ui.special_mode.manager;


public class AnnotationManager_OnAnnotationCreationModeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.AnnotationManager.OnAnnotationCreationModeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChangeAnnotationCreationMode:(Lcom/pspdfkit/ui/special_mode/controller/AnnotationCreationController;)V:GetOnChangeAnnotationCreationMode_Lcom_pspdfkit_ui_special_mode_controller_AnnotationCreationController_Handler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationCreationModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onEnterAnnotationCreationMode:(Lcom/pspdfkit/ui/special_mode/controller/AnnotationCreationController;)V:GetOnEnterAnnotationCreationMode_Lcom_pspdfkit_ui_special_mode_controller_AnnotationCreationController_Handler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationCreationModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onExitAnnotationCreationMode:(Lcom/pspdfkit/ui/special_mode/controller/AnnotationCreationController;)V:GetOnExitAnnotationCreationMode_Lcom_pspdfkit_ui_special_mode_controller_AnnotationCreationController_Handler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationCreationModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationCreationModeChangeListenerImplementor, PSPDFKit.Android", AnnotationManager_OnAnnotationCreationModeChangeListenerImplementor.class, __md_methods);
	}


	public AnnotationManager_OnAnnotationCreationModeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationManager_OnAnnotationCreationModeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationCreationModeChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onChangeAnnotationCreationMode (com.pspdfkit.ui.special_mode.controller.AnnotationCreationController p0)
	{
		n_onChangeAnnotationCreationMode (p0);
	}

	private native void n_onChangeAnnotationCreationMode (com.pspdfkit.ui.special_mode.controller.AnnotationCreationController p0);


	public void onEnterAnnotationCreationMode (com.pspdfkit.ui.special_mode.controller.AnnotationCreationController p0)
	{
		n_onEnterAnnotationCreationMode (p0);
	}

	private native void n_onEnterAnnotationCreationMode (com.pspdfkit.ui.special_mode.controller.AnnotationCreationController p0);


	public void onExitAnnotationCreationMode (com.pspdfkit.ui.special_mode.controller.AnnotationCreationController p0)
	{
		n_onExitAnnotationCreationMode (p0);
	}

	private native void n_onExitAnnotationCreationMode (com.pspdfkit.ui.special_mode.controller.AnnotationCreationController p0);

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
