package mono.com.pdftron.pdf.controls;


public class SearchResultsView_SearchResultsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.SearchResultsView.SearchResultsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFullTextSearchStart:()V:GetOnFullTextSearchStartHandler:pdftron.PDF.Controls.SearchResultsView/ISearchResultsListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSearchResultClicked:(Lcom/pdftron/pdf/TextSearchResult;)V:GetOnSearchResultClicked_Lcom_pdftron_pdf_TextSearchResult_Handler:pdftron.PDF.Controls.SearchResultsView/ISearchResultsListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSearchResultFound:(Lcom/pdftron/pdf/TextSearchResult;)V:GetOnSearchResultFound_Lcom_pdftron_pdf_TextSearchResult_Handler:pdftron.PDF.Controls.SearchResultsView/ISearchResultsListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.SearchResultsView+ISearchResultsListenerImplementor, PDFViewCtrlTools", SearchResultsView_SearchResultsListenerImplementor.class, __md_methods);
	}


	public SearchResultsView_SearchResultsListenerImplementor ()
	{
		super ();
		if (getClass () == SearchResultsView_SearchResultsListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.SearchResultsView+ISearchResultsListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onFullTextSearchStart ()
	{
		n_onFullTextSearchStart ();
	}

	private native void n_onFullTextSearchStart ();


	public void onSearchResultClicked (com.pdftron.pdf.TextSearchResult p0)
	{
		n_onSearchResultClicked (p0);
	}

	private native void n_onSearchResultClicked (com.pdftron.pdf.TextSearchResult p0);


	public void onSearchResultFound (com.pdftron.pdf.TextSearchResult p0)
	{
		n_onSearchResultFound (p0);
	}

	private native void n_onSearchResultFound (com.pdftron.pdf.TextSearchResult p0);

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
