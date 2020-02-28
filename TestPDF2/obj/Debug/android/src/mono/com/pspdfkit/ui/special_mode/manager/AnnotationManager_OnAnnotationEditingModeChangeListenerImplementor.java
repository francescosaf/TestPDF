package mono.com.pspdfkit.ui.special_mode.manager;


public class AnnotationManager_OnAnnotationEditingModeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.AnnotationManager.OnAnnotationEditingModeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChangeAnnotationEditingMode:(Lcom/pspdfkit/ui/special_mode/controller/AnnotationEditingController;)V:GetOnChangeAnnotationEditingMode_Lcom_pspdfkit_ui_special_mode_controller_AnnotationEditingController_Handler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationEditingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onEnterAnnotationEditingMode:(Lcom/pspdfkit/ui/special_mode/controller/AnnotationEditingController;)V:GetOnEnterAnnotationEditingMode_Lcom_pspdfkit_ui_special_mode_controller_AnnotationEditingController_Handler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationEditingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onExitAnnotationEditingMode:(Lcom/pspdfkit/ui/special_mode/controller/AnnotationEditingController;)V:GetOnExitAnnotationEditingMode_Lcom_pspdfkit_ui_special_mode_controller_AnnotationEditingController_Handler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationEditingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationEditingModeChangeListenerImplementor, PSPDFKit.Android", AnnotationManager_OnAnnotationEditingModeChangeListenerImplementor.class, __md_methods);
	}


	public AnnotationManager_OnAnnotationEditingModeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationManager_OnAnnotationEditingModeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationEditingModeChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onChangeAnnotationEditingMode (com.pspdfkit.ui.special_mode.controller.AnnotationEditingController p0)
	{
		n_onChangeAnnotationEditingMode (p0);
	}

	private native void n_onChangeAnnotationEditingMode (com.pspdfkit.ui.special_mode.controller.AnnotationEditingController p0);


	public void onEnterAnnotationEditingMode (com.pspdfkit.ui.special_mode.controller.AnnotationEditingController p0)
	{
		n_onEnterAnnotationEditingMode (p0);
	}

	private native void n_onEnterAnnotationEditingMode (com.pspdfkit.ui.special_mode.controller.AnnotationEditingController p0);


	public void onExitAnnotationEditingMode (com.pspdfkit.ui.special_mode.controller.AnnotationEditingController p0)
	{
		n_onExitAnnotationEditingMode (p0);
	}

	private native void n_onExitAnnotationEditingMode (com.pspdfkit.ui.special_mode.controller.AnnotationEditingController p0);

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
