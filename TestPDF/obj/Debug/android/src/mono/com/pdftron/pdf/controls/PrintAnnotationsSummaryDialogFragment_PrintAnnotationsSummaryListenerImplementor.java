package mono.com.pdftron.pdf.controls;


public class PrintAnnotationsSummaryDialogFragment_PrintAnnotationsSummaryListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.PrintAnnotationsSummaryDialogFragment.PrintAnnotationsSummaryListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConfirmPrintAnnotationSummary:(ZZZ)V:GetOnConfirmPrintAnnotationSummary_ZZZHandler:pdftron.PDF.Controls.PrintAnnotationsSummaryDialogFragment/IPrintAnnotationsSummaryListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.PrintAnnotationsSummaryDialogFragment+IPrintAnnotationsSummaryListenerImplementor, PDFViewCtrlTools", PrintAnnotationsSummaryDialogFragment_PrintAnnotationsSummaryListenerImplementor.class, __md_methods);
	}


	public PrintAnnotationsSummaryDialogFragment_PrintAnnotationsSummaryListenerImplementor ()
	{
		super ();
		if (getClass () == PrintAnnotationsSummaryDialogFragment_PrintAnnotationsSummaryListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.PrintAnnotationsSummaryDialogFragment+IPrintAnnotationsSummaryListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onConfirmPrintAnnotationSummary (boolean p0, boolean p1, boolean p2)
	{
		n_onConfirmPrintAnnotationSummary (p0, p1, p2);
	}

	private native void n_onConfirmPrintAnnotationSummary (boolean p0, boolean p1, boolean p2);

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
