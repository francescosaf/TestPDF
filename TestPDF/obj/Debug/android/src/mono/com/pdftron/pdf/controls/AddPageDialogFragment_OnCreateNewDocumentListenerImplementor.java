package mono.com.pdftron.pdf.controls;


public class AddPageDialogFragment_OnCreateNewDocumentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.AddPageDialogFragment.OnCreateNewDocumentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateNewDocument:(Lcom/pdftron/pdf/PDFDoc;Ljava/lang/String;)V:GetOnCreateNewDocument_Lcom_pdftron_pdf_PDFDoc_Ljava_lang_String_Handler:pdftron.PDF.Controls.AddPageDialogFragment/IOnCreateNewDocumentListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.AddPageDialogFragment+IOnCreateNewDocumentListenerImplementor, PDFViewCtrlTools", AddPageDialogFragment_OnCreateNewDocumentListenerImplementor.class, __md_methods);
	}


	public AddPageDialogFragment_OnCreateNewDocumentListenerImplementor ()
	{
		super ();
		if (getClass () == AddPageDialogFragment_OnCreateNewDocumentListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.AddPageDialogFragment+IOnCreateNewDocumentListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onCreateNewDocument (com.pdftron.pdf.PDFDoc p0, java.lang.String p1)
	{
		n_onCreateNewDocument (p0, p1);
	}

	private native void n_onCreateNewDocument (com.pdftron.pdf.PDFDoc p0, java.lang.String p1);

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
