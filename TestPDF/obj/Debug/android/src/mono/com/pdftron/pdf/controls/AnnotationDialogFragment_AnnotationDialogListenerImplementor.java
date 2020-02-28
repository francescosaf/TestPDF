package mono.com.pdftron.pdf.controls;


public class AnnotationDialogFragment_AnnotationDialogListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.AnnotationDialogFragment.AnnotationDialogListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationClicked:(Lcom/pdftron/pdf/Annot;I)V:GetOnAnnotationClicked_Lcom_pdftron_pdf_Annot_IHandler:pdftron.PDF.Controls.AnnotationDialogFragment/IAnnotationDialogListenerInvoker, PDFViewCtrlTools\n" +
			"n_onExportAnnotations:(Lcom/pdftron/pdf/PDFDoc;)V:GetOnExportAnnotations_Lcom_pdftron_pdf_PDFDoc_Handler:pdftron.PDF.Controls.AnnotationDialogFragment/IAnnotationDialogListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.AnnotationDialogFragment+IAnnotationDialogListenerImplementor, PDFViewCtrlTools", AnnotationDialogFragment_AnnotationDialogListenerImplementor.class, __md_methods);
	}


	public AnnotationDialogFragment_AnnotationDialogListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationDialogFragment_AnnotationDialogListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.AnnotationDialogFragment+IAnnotationDialogListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationClicked (com.pdftron.pdf.Annot p0, int p1)
	{
		n_onAnnotationClicked (p0, p1);
	}

	private native void n_onAnnotationClicked (com.pdftron.pdf.Annot p0, int p1);


	public void onExportAnnotations (com.pdftron.pdf.PDFDoc p0)
	{
		n_onExportAnnotations (p0);
	}

	private native void n_onExportAnnotations (com.pdftron.pdf.PDFDoc p0);

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
