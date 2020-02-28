package mono.com.pspdfkit.ui;


public class PdfThumbnailBar_OnPageChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.PdfThumbnailBar.OnPageChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPageChanged:(Lcom/pspdfkit/ui/thumbnail/PdfThumbnailBarController;I)V:GetOnPageChanged_Lcom_pspdfkit_ui_thumbnail_PdfThumbnailBarController_IHandler:PSPDFKit.UI.PdfThumbnailBar/IOnPageChangedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.PdfThumbnailBar+IOnPageChangedListenerImplementor, PSPDFKit.Android", PdfThumbnailBar_OnPageChangedListenerImplementor.class, __md_methods);
	}


	public PdfThumbnailBar_OnPageChangedListenerImplementor ()
	{
		super ();
		if (getClass () == PdfThumbnailBar_OnPageChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.PdfThumbnailBar+IOnPageChangedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onPageChanged (com.pspdfkit.ui.thumbnail.PdfThumbnailBarController p0, int p1)
	{
		n_onPageChanged (p0, p1);
	}

	private native void n_onPageChanged (com.pspdfkit.ui.thumbnail.PdfThumbnailBarController p0, int p1);

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
