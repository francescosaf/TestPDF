package mono.com.pspdfkit.listeners;


public class OnDocumentLongPressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.listeners.OnDocumentLongPressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentLongPress:(Lcom/pspdfkit/document/PdfDocument;ILandroid/view/MotionEvent;Landroid/graphics/PointF;Lcom/pspdfkit/annotations/Annotation;)Z:GetOnDocumentLongPress_Lcom_pspdfkit_document_PdfDocument_ILandroid_view_MotionEvent_Landroid_graphics_PointF_Lcom_pspdfkit_annotations_Annotation_Handler:PSPDFKit.Listeners.IOnDocumentLongPressListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Listeners.IOnDocumentLongPressListenerImplementor, PSPDFKit.Android", OnDocumentLongPressListenerImplementor.class, __md_methods);
	}


	public OnDocumentLongPressListenerImplementor ()
	{
		super ();
		if (getClass () == OnDocumentLongPressListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Listeners.IOnDocumentLongPressListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onDocumentLongPress (com.pspdfkit.document.PdfDocument p0, int p1, android.view.MotionEvent p2, android.graphics.PointF p3, com.pspdfkit.annotations.Annotation p4)
	{
		return n_onDocumentLongPress (p0, p1, p2, p3, p4);
	}

	private native boolean n_onDocumentLongPress (com.pspdfkit.document.PdfDocument p0, int p1, android.view.MotionEvent p2, android.graphics.PointF p3, com.pspdfkit.annotations.Annotation p4);

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
