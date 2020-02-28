package mono.com.pspdfkit.ui;


public class PdfOutlineView_OnAnnotationTapListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.PdfOutlineView.OnAnnotationTapListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationTap:(Lcom/pspdfkit/ui/PdfOutlineView;Lcom/pspdfkit/annotations/Annotation;)V:GetOnAnnotationTap_Lcom_pspdfkit_ui_PdfOutlineView_Lcom_pspdfkit_annotations_Annotation_Handler:PSPDFKit.UI.PdfOutlineView/IOnAnnotationTapListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.PdfOutlineView+IOnAnnotationTapListenerImplementor, PSPDFKit.Android", PdfOutlineView_OnAnnotationTapListenerImplementor.class, __md_methods);
	}


	public PdfOutlineView_OnAnnotationTapListenerImplementor ()
	{
		super ();
		if (getClass () == PdfOutlineView_OnAnnotationTapListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.PdfOutlineView+IOnAnnotationTapListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationTap (com.pspdfkit.ui.PdfOutlineView p0, com.pspdfkit.annotations.Annotation p1)
	{
		n_onAnnotationTap (p0, p1);
	}

	private native void n_onAnnotationTap (com.pspdfkit.ui.PdfOutlineView p0, com.pspdfkit.annotations.Annotation p1);

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
