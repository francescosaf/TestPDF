package mono.com.pspdfkit.ui;


public class PdfThumbnailGrid_OnPageClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.PdfThumbnailGrid.OnPageClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPageClick:(Lcom/pspdfkit/ui/PdfThumbnailGrid;I)V:GetOnPageClick_Lcom_pspdfkit_ui_PdfThumbnailGrid_IHandler:PSPDFKit.UI.PdfThumbnailGrid/IOnPageClickListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.PdfThumbnailGrid+IOnPageClickListenerImplementor, PSPDFKit.Android", PdfThumbnailGrid_OnPageClickListenerImplementor.class, __md_methods);
	}


	public PdfThumbnailGrid_OnPageClickListenerImplementor ()
	{
		super ();
		if (getClass () == PdfThumbnailGrid_OnPageClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.PdfThumbnailGrid+IOnPageClickListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onPageClick (com.pspdfkit.ui.PdfThumbnailGrid p0, int p1)
	{
		n_onPageClick (p0, p1);
	}

	private native void n_onPageClick (com.pspdfkit.ui.PdfThumbnailGrid p0, int p1);

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
