package mono.com.pspdfkit.ui.search;


public class PdfSearchView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.search.PdfSearchView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMoreSearchResults:(Ljava/util/List;)V:GetOnMoreSearchResults_Ljava_util_List_Handler:PSPDFKit.UI.Search.IPdfSearchViewListenerInvoker, PSPDFKit.Android\n" +
			"n_onSearchCleared:()V:GetOnSearchClearedHandler:PSPDFKit.UI.Search.IPdfSearchViewListenerInvoker, PSPDFKit.Android\n" +
			"n_onSearchCompleted:()V:GetOnSearchCompletedHandler:PSPDFKit.UI.Search.IPdfSearchViewListenerInvoker, PSPDFKit.Android\n" +
			"n_onSearchError:(Ljava/lang/Throwable;)V:GetOnSearchError_Ljava_lang_Throwable_Handler:PSPDFKit.UI.Search.IPdfSearchViewListenerInvoker, PSPDFKit.Android\n" +
			"n_onSearchResultSelected:(Lcom/pspdfkit/document/search/SearchResult;)V:GetOnSearchResultSelected_Lcom_pspdfkit_document_search_SearchResult_Handler:PSPDFKit.UI.Search.IPdfSearchViewListenerInvoker, PSPDFKit.Android\n" +
			"n_onSearchStarted:(Ljava/lang/String;)V:GetOnSearchStarted_Ljava_lang_String_Handler:PSPDFKit.UI.Search.IPdfSearchViewListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Search.IPdfSearchViewListenerImplementor, PSPDFKit.Android", PdfSearchView_ListenerImplementor.class, __md_methods);
	}


	public PdfSearchView_ListenerImplementor ()
	{
		super ();
		if (getClass () == PdfSearchView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Search.IPdfSearchViewListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onMoreSearchResults (java.util.List p0)
	{
		n_onMoreSearchResults (p0);
	}

	private native void n_onMoreSearchResults (java.util.List p0);


	public void onSearchCleared ()
	{
		n_onSearchCleared ();
	}

	private native void n_onSearchCleared ();


	public void onSearchCompleted ()
	{
		n_onSearchCompleted ();
	}

	private native void n_onSearchCompleted ();


	public void onSearchError (java.lang.Throwable p0)
	{
		n_onSearchError (p0);
	}

	private native void n_onSearchError (java.lang.Throwable p0);


	public void onSearchResultSelected (com.pspdfkit.document.search.SearchResult p0)
	{
		n_onSearchResultSelected (p0);
	}

	private native void n_onSearchResultSelected (com.pspdfkit.document.search.SearchResult p0);


	public void onSearchStarted (java.lang.String p0)
	{
		n_onSearchStarted (p0);
	}

	private native void n_onSearchStarted (java.lang.String p0);

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
