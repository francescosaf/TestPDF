package mono.com.pspdfkit.listeners;


public class DocumentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.listeners.DocumentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentClick:()Z:GetOnDocumentClickHandler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onDocumentLoadFailed:(Ljava/lang/Throwable;)V:GetOnDocumentLoadFailed_Ljava_lang_Throwable_Handler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onDocumentLoaded:(Lcom/pspdfkit/document/PdfDocument;)V:GetOnDocumentLoaded_Lcom_pspdfkit_document_PdfDocument_Handler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onDocumentSave:(Lcom/pspdfkit/document/PdfDocument;Lcom/pspdfkit/document/DocumentSaveOptions;)Z:GetOnDocumentSave_Lcom_pspdfkit_document_PdfDocument_Lcom_pspdfkit_document_DocumentSaveOptions_Handler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onDocumentSaveCancelled:(Lcom/pspdfkit/document/PdfDocument;)V:GetOnDocumentSaveCancelled_Lcom_pspdfkit_document_PdfDocument_Handler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onDocumentSaveFailed:(Lcom/pspdfkit/document/PdfDocument;Ljava/lang/Throwable;)V:GetOnDocumentSaveFailed_Lcom_pspdfkit_document_PdfDocument_Ljava_lang_Throwable_Handler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onDocumentSaved:(Lcom/pspdfkit/document/PdfDocument;)V:GetOnDocumentSaved_Lcom_pspdfkit_document_PdfDocument_Handler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onDocumentZoomed:(Lcom/pspdfkit/document/PdfDocument;IF)V:GetOnDocumentZoomed_Lcom_pspdfkit_document_PdfDocument_IFHandler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onPageChanged:(Lcom/pspdfkit/document/PdfDocument;I)V:GetOnPageChanged_Lcom_pspdfkit_document_PdfDocument_IHandler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onPageClick:(Lcom/pspdfkit/document/PdfDocument;ILandroid/view/MotionEvent;Landroid/graphics/PointF;Lcom/pspdfkit/annotations/Annotation;)Z:GetOnPageClick_Lcom_pspdfkit_document_PdfDocument_ILandroid_view_MotionEvent_Landroid_graphics_PointF_Lcom_pspdfkit_annotations_Annotation_Handler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"n_onPageUpdated:(Lcom/pspdfkit/document/PdfDocument;I)V:GetOnPageUpdated_Lcom_pspdfkit_document_PdfDocument_IHandler:PSPDFKit.Listeners.IDocumentListener, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Listeners.IDocumentListenerImplementor, PSPDFKit.Android", DocumentListenerImplementor.class, __md_methods);
	}


	public DocumentListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Listeners.IDocumentListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onDocumentClick ()
	{
		return n_onDocumentClick ();
	}

	private native boolean n_onDocumentClick ();


	public void onDocumentLoadFailed (java.lang.Throwable p0)
	{
		n_onDocumentLoadFailed (p0);
	}

	private native void n_onDocumentLoadFailed (java.lang.Throwable p0);


	public void onDocumentLoaded (com.pspdfkit.document.PdfDocument p0)
	{
		n_onDocumentLoaded (p0);
	}

	private native void n_onDocumentLoaded (com.pspdfkit.document.PdfDocument p0);


	public boolean onDocumentSave (com.pspdfkit.document.PdfDocument p0, com.pspdfkit.document.DocumentSaveOptions p1)
	{
		return n_onDocumentSave (p0, p1);
	}

	private native boolean n_onDocumentSave (com.pspdfkit.document.PdfDocument p0, com.pspdfkit.document.DocumentSaveOptions p1);


	public void onDocumentSaveCancelled (com.pspdfkit.document.PdfDocument p0)
	{
		n_onDocumentSaveCancelled (p0);
	}

	private native void n_onDocumentSaveCancelled (com.pspdfkit.document.PdfDocument p0);


	public void onDocumentSaveFailed (com.pspdfkit.document.PdfDocument p0, java.lang.Throwable p1)
	{
		n_onDocumentSaveFailed (p0, p1);
	}

	private native void n_onDocumentSaveFailed (com.pspdfkit.document.PdfDocument p0, java.lang.Throwable p1);


	public void onDocumentSaved (com.pspdfkit.document.PdfDocument p0)
	{
		n_onDocumentSaved (p0);
	}

	private native void n_onDocumentSaved (com.pspdfkit.document.PdfDocument p0);


	public void onDocumentZoomed (com.pspdfkit.document.PdfDocument p0, int p1, float p2)
	{
		n_onDocumentZoomed (p0, p1, p2);
	}

	private native void n_onDocumentZoomed (com.pspdfkit.document.PdfDocument p0, int p1, float p2);


	public void onPageChanged (com.pspdfkit.document.PdfDocument p0, int p1)
	{
		n_onPageChanged (p0, p1);
	}

	private native void n_onPageChanged (com.pspdfkit.document.PdfDocument p0, int p1);


	public boolean onPageClick (com.pspdfkit.document.PdfDocument p0, int p1, android.view.MotionEvent p2, android.graphics.PointF p3, com.pspdfkit.annotations.Annotation p4)
	{
		return n_onPageClick (p0, p1, p2, p3, p4);
	}

	private native boolean n_onPageClick (com.pspdfkit.document.PdfDocument p0, int p1, android.view.MotionEvent p2, android.graphics.PointF p3, com.pspdfkit.annotations.Annotation p4);


	public void onPageUpdated (com.pspdfkit.document.PdfDocument p0, int p1)
	{
		n_onPageUpdated (p0, p1);
	}

	private native void n_onPageUpdated (com.pspdfkit.document.PdfDocument p0, int p1);

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
