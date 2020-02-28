package mono.com.pdftron.pdf.controls;


public class AddPageDialogFragment_OnAddNewPagesListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.AddPageDialogFragment.OnAddNewPagesListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAddNewPages:([Lcom/pdftron/pdf/Page;)V:GetOnAddNewPages_arrayLcom_pdftron_pdf_Page_Handler:pdftron.PDF.Controls.AddPageDialogFragment/IOnAddNewPagesListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.AddPageDialogFragment+IOnAddNewPagesListenerImplementor, PDFViewCtrlTools", AddPageDialogFragment_OnAddNewPagesListenerImplementor.class, __md_methods);
	}


	public AddPageDialogFragment_OnAddNewPagesListenerImplementor ()
	{
		super ();
		if (getClass () == AddPageDialogFragment_OnAddNewPagesListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.AddPageDialogFragment+IOnAddNewPagesListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAddNewPages (com.pdftron.pdf.Page[] p0)
	{
		n_onAddNewPages (p0);
	}

	private native void n_onAddNewPages (com.pdftron.pdf.Page[] p0);

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
