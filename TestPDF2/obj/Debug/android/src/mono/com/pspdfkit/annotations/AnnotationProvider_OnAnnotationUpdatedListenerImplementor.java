package mono.com.pspdfkit.annotations;


public class AnnotationProvider_OnAnnotationUpdatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.annotations.AnnotationProvider.OnAnnotationUpdatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationCreated:(Lcom/pspdfkit/annotations/Annotation;)V:GetOnAnnotationCreated_Lcom_pspdfkit_annotations_Annotation_Handler:PSPDFKit.Annotations.IAnnotationProviderOnAnnotationUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"n_onAnnotationRemoved:(Lcom/pspdfkit/annotations/Annotation;)V:GetOnAnnotationRemoved_Lcom_pspdfkit_annotations_Annotation_Handler:PSPDFKit.Annotations.IAnnotationProviderOnAnnotationUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"n_onAnnotationUpdated:(Lcom/pspdfkit/annotations/Annotation;)V:GetOnAnnotationUpdated_Lcom_pspdfkit_annotations_Annotation_Handler:PSPDFKit.Annotations.IAnnotationProviderOnAnnotationUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"n_onAnnotationZOrderChanged:(ILjava/util/List;Ljava/util/List;)V:GetOnAnnotationZOrderChanged_ILjava_util_List_Ljava_util_List_Handler:PSPDFKit.Annotations.IAnnotationProviderOnAnnotationUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Annotations.IAnnotationProviderOnAnnotationUpdatedListenerImplementor, PSPDFKit.Android", AnnotationProvider_OnAnnotationUpdatedListenerImplementor.class, __md_methods);
	}


	public AnnotationProvider_OnAnnotationUpdatedListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationProvider_OnAnnotationUpdatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Annotations.IAnnotationProviderOnAnnotationUpdatedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationCreated (com.pspdfkit.annotations.Annotation p0)
	{
		n_onAnnotationCreated (p0);
	}

	private native void n_onAnnotationCreated (com.pspdfkit.annotations.Annotation p0);


	public void onAnnotationRemoved (com.pspdfkit.annotations.Annotation p0)
	{
		n_onAnnotationRemoved (p0);
	}

	private native void n_onAnnotationRemoved (com.pspdfkit.annotations.Annotation p0);


	public void onAnnotationUpdated (com.pspdfkit.annotations.Annotation p0)
	{
		n_onAnnotationUpdated (p0);
	}

	private native void n_onAnnotationUpdated (com.pspdfkit.annotations.Annotation p0);


	public void onAnnotationZOrderChanged (int p0, java.util.List p1, java.util.List p2)
	{
		n_onAnnotationZOrderChanged (p0, p1, p2);
	}

	private native void n_onAnnotationZOrderChanged (int p0, java.util.List p1, java.util.List p2);

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
