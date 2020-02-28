package mono.com.pspdfkit.ui.search;


public class PdfSearchViewLazy_OnViewReadyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.search.PdfSearchViewLazy.OnViewReadyListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onViewReady:(Lcom/pspdfkit/ui/search/PdfSearchViewLazy;Lcom/pspdfkit/ui/search/PdfSearchView;)V:GetOnViewReady_Lcom_pspdfkit_ui_search_PdfSearchViewLazy_Lcom_pspdfkit_ui_search_PdfSearchView_Handler:PSPDFKit.UI.Search.PdfSearchViewLazy/IOnViewReadyListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Search.PdfSearchViewLazy+IOnViewReadyListenerImplementor, PSPDFKit.Android", PdfSearchViewLazy_OnViewReadyListenerImplementor.class, __md_methods);
	}


	public PdfSearchViewLazy_OnViewReadyListenerImplementor ()
	{
		super ();
		if (getClass () == PdfSearchViewLazy_OnViewReadyListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Search.PdfSearchViewLazy+IOnViewReadyListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onViewReady (com.pspdfkit.ui.search.PdfSearchViewLazy p0, com.pspdfkit.ui.search.PdfSearchView p1)
	{
		n_onViewReady (p0, p1);
	}

	private native void n_onViewReady (com.pspdfkit.ui.search.PdfSearchViewLazy p0, com.pspdfkit.ui.search.PdfSearchView p1);

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
