package mono.com.pspdfkit.ui.special_mode.manager;


public class AnnotationManager_OnAnnotationDeselectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.AnnotationManager.OnAnnotationDeselectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationDeselected:(Lcom/pspdfkit/annotations/Annotation;Z)V:GetOnAnnotationDeselected_Lcom_pspdfkit_annotations_Annotation_ZHandler:PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationDeselectedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationDeselectedListenerImplementor, PSPDFKit.Android", AnnotationManager_OnAnnotationDeselectedListenerImplementor.class, __md_methods);
	}


	public AnnotationManager_OnAnnotationDeselectedListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationManager_OnAnnotationDeselectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IAnnotationManagerOnAnnotationDeselectedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationDeselected (com.pspdfkit.annotations.Annotation p0, boolean p1)
	{
		n_onAnnotationDeselected (p0, p1);
	}

	private native void n_onAnnotationDeselected (com.pspdfkit.annotations.Annotation p0, boolean p1);

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
