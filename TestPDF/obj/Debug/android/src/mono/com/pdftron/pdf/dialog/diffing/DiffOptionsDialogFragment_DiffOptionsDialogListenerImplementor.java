package mono.com.pdftron.pdf.dialog.diffing;


public class DiffOptionsDialogFragment_DiffOptionsDialogListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.dialog.diffing.DiffOptionsDialogFragment.DiffOptionsDialogListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDiffOptionsConfirmed:(III)V:GetOnDiffOptionsConfirmed_IIIHandler:pdftron.PDF.Dialog.Diffing.DiffOptionsDialogFragment/IDiffOptionsDialogListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Dialog.Diffing.DiffOptionsDialogFragment+IDiffOptionsDialogListenerImplementor, PDFViewCtrlTools", DiffOptionsDialogFragment_DiffOptionsDialogListenerImplementor.class, __md_methods);
	}


	public DiffOptionsDialogFragment_DiffOptionsDialogListenerImplementor ()
	{
		super ();
		if (getClass () == DiffOptionsDialogFragment_DiffOptionsDialogListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Dialog.Diffing.DiffOptionsDialogFragment+IDiffOptionsDialogListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onDiffOptionsConfirmed (int p0, int p1, int p2)
	{
		n_onDiffOptionsConfirmed (p0, p1, p2);
	}

	private native void n_onDiffOptionsConfirmed (int p0, int p1, int p2);

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
