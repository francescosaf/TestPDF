package mono.com.pdftron.pdf.dialog;


public class PortfolioDialogFragment_PortfolioDialogFragmentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.dialog.PortfolioDialogFragment.PortfolioDialogFragmentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPortfolioDialogFragmentFileClicked:(ILcom/pdftron/pdf/dialog/PortfolioDialogFragment;Ljava/lang/String;)V:GetOnPortfolioDialogFragmentFileClicked_ILcom_pdftron_pdf_dialog_PortfolioDialogFragment_Ljava_lang_String_Handler:pdftron.PDF.Dialog.PortfolioDialogFragment/IPortfolioDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Dialog.PortfolioDialogFragment+IPortfolioDialogFragmentListenerImplementor, PDFViewCtrlTools", PortfolioDialogFragment_PortfolioDialogFragmentListenerImplementor.class, __md_methods);
	}


	public PortfolioDialogFragment_PortfolioDialogFragmentListenerImplementor ()
	{
		super ();
		if (getClass () == PortfolioDialogFragment_PortfolioDialogFragmentListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Dialog.PortfolioDialogFragment+IPortfolioDialogFragmentListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onPortfolioDialogFragmentFileClicked (int p0, com.pdftron.pdf.dialog.PortfolioDialogFragment p1, java.lang.String p2)
	{
		n_onPortfolioDialogFragmentFileClicked (p0, p1, p2);
	}

	private native void n_onPortfolioDialogFragmentFileClicked (int p0, com.pdftron.pdf.dialog.PortfolioDialogFragment p1, java.lang.String p2);

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
