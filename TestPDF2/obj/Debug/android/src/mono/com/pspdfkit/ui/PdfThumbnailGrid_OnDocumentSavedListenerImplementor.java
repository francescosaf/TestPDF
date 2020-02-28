package mono.com.pspdfkit.ui;


public class PdfThumbnailGrid_OnDocumentSavedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.PdfThumbnailGrid.OnDocumentSavedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentExported:(Landroid/net/Uri;)V:GetOnDocumentExported_Landroid_net_Uri_Handler:PSPDFKit.UI.PdfThumbnailGrid/IOnDocumentSavedListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentSaved:()V:GetOnDocumentSavedHandler:PSPDFKit.UI.PdfThumbnailGrid/IOnDocumentSavedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.PdfThumbnailGrid+IOnDocumentSavedListenerImplementor, PSPDFKit.Android", PdfThumbnailGrid_OnDocumentSavedListenerImplementor.class, __md_methods);
	}


	public PdfThumbnailGrid_OnDocumentSavedListenerImplementor ()
	{
		super ();
		if (getClass () == PdfThumbnailGrid_OnDocumentSavedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.PdfThumbnailGrid+IOnDocumentSavedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDocumentExported (android.net.Uri p0)
	{
		n_onDocumentExported (p0);
	}

	private native void n_onDocumentExported (android.net.Uri p0);


	public void onDocumentSaved ()
	{
		n_onDocumentSaved ();
	}

	private native void n_onDocumentSaved ();

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
