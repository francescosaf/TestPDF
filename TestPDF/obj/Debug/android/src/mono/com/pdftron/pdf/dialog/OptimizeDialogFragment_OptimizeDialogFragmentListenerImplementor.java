package mono.com.pdftron.pdf.dialog;


public class OptimizeDialogFragment_OptimizeDialogFragmentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.dialog.OptimizeDialogFragment.OptimizeDialogFragmentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onOptimizeClicked:(Lcom/pdftron/pdf/model/OptimizeParams;)V:GetOnOptimizeClicked_Lcom_pdftron_pdf_model_OptimizeParams_Handler:pdftron.PDF.Dialog.OptimizeDialogFragment/IOptimizeDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Dialog.OptimizeDialogFragment+IOptimizeDialogFragmentListenerImplementor, PDFViewCtrlTools", OptimizeDialogFragment_OptimizeDialogFragmentListenerImplementor.class, __md_methods);
	}


	public OptimizeDialogFragment_OptimizeDialogFragmentListenerImplementor ()
	{
		super ();
		if (getClass () == OptimizeDialogFragment_OptimizeDialogFragmentListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Dialog.OptimizeDialogFragment+IOptimizeDialogFragmentListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onOptimizeClicked (com.pdftron.pdf.model.OptimizeParams p0)
	{
		n_onOptimizeClicked (p0);
	}

	private native void n_onOptimizeClicked (com.pdftron.pdf.model.OptimizeParams p0);

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
