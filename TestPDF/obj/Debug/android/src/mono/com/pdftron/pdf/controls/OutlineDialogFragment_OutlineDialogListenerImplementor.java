package mono.com.pdftron.pdf.controls;


public class OutlineDialogFragment_OutlineDialogListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.OutlineDialogFragment.OutlineDialogListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onOutlineClicked:(Lcom/pdftron/pdf/Bookmark;Lcom/pdftron/pdf/Bookmark;)V:GetOnOutlineClicked_Lcom_pdftron_pdf_Bookmark_Lcom_pdftron_pdf_Bookmark_Handler:pdftron.PDF.Controls.OutlineDialogFragment/IOutlineDialogListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.OutlineDialogFragment+IOutlineDialogListenerImplementor, PDFViewCtrlTools", OutlineDialogFragment_OutlineDialogListenerImplementor.class, __md_methods);
	}


	public OutlineDialogFragment_OutlineDialogListenerImplementor ()
	{
		super ();
		if (getClass () == OutlineDialogFragment_OutlineDialogListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.OutlineDialogFragment+IOutlineDialogListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onOutlineClicked (com.pdftron.pdf.Bookmark p0, com.pdftron.pdf.Bookmark p1)
	{
		n_onOutlineClicked (p0, p1);
	}

	private native void n_onOutlineClicked (com.pdftron.pdf.Bookmark p0, com.pdftron.pdf.Bookmark p1);

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
