package mono.com.pspdfkit.ui.special_mode.manager;


public class AnnotationManager_OnAnnotationCreationModeSettingsChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.AnnotationManager.OnAnnotationCreationModeSettingsChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationCreationModeSettingsChange:(Lcom/pspdfkit/ui/special_mode/controller/AnnotationCreationController;)V:GetOnAnnotationCreationModeSettingsChange_Lcom_pspdfkit_ui_special_mode_controller_AnnotationCreationController_Handler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationCreationModeSettingsChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationCreationModeSettingsChangeListenerImplementor, PSPDFKit.Android", AnnotationManager_OnAnnotationCreationModeSettingsChangeListenerImplementor.class, __md_methods);
	}


	public AnnotationManager_OnAnnotationCreationModeSettingsChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationManager_OnAnnotationCreationModeSettingsChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationCreationModeSettingsChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationCreationModeSettingsChange (com.pspdfkit.ui.special_mode.controller.AnnotationCreationController p0)
	{
		n_onAnnotationCreationModeSettingsChange (p0);
	}

	private native void n_onAnnotationCreationModeSettingsChange (com.pspdfkit.ui.special_mode.controller.AnnotationCreationController p0);

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
