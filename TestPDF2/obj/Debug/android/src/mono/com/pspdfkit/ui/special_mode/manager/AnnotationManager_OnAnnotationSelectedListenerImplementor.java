package mono.com.pspdfkit.ui.special_mode.manager;


public class AnnotationManager_OnAnnotationSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.AnnotationManager.OnAnnotationSelectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationSelected:(Lcom/pspdfkit/annotations/Annotation;Z)V:GetOnAnnotationSelected_Lcom_pspdfkit_annotations_Annotation_ZHandler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationSelectedListenerInvoker, PSPDFKit.Android\n" +
			"n_onPrepareAnnotationSelection:(Lcom/pspdfkit/ui/special_mode/controller/AnnotationSelectionController;Lcom/pspdfkit/annotations/Annotation;Z)Z:GetOnPrepareAnnotationSelection_Lcom_pspdfkit_ui_special_mode_controller_AnnotationSelectionController_Lcom_pspdfkit_annotations_Annotation_ZHandler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationSelectedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationSelectedListenerImplementor, PSPDFKit.Android", AnnotationManager_OnAnnotationSelectedListenerImplementor.class, __md_methods);
	}


	public AnnotationManager_OnAnnotationSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationManager_OnAnnotationSelectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationSelectedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationSelected (com.pspdfkit.annotations.Annotation p0, boolean p1)
	{
		n_onAnnotationSelected (p0, p1);
	}

	private native void n_onAnnotationSelected (com.pspdfkit.annotations.Annotation p0, boolean p1);


	public boolean onPrepareAnnotationSelection (com.pspdfkit.ui.special_mode.controller.AnnotationSelectionController p0, com.pspdfkit.annotations.Annotation p1, boolean p2)
	{
		return n_onPrepareAnnotationSelection (p0, p1, p2);
	}

	private native boolean n_onPrepareAnnotationSelection (com.pspdfkit.ui.special_mode.controller.AnnotationSelectionController p0, com.pspdfkit.annotations.Annotation p1, boolean p2);

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
