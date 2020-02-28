package mono.com.pdftron.pdf.controls;


public class SearchToolbar_SearchToolbarListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.SearchToolbar.SearchToolbarListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClearSearchQuery:()V:GetOnClearSearchQueryHandler:pdftron.PDF.Controls.NativeSearchToolbar/ISearchToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_onExitSearch:()V:GetOnExitSearchHandler:pdftron.PDF.Controls.NativeSearchToolbar/ISearchToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSearchOptionsItemSelected:(Landroid/view/MenuItem;Ljava/lang/String;)V:GetOnSearchOptionsItemSelected_Landroid_view_MenuItem_Ljava_lang_String_Handler:pdftron.PDF.Controls.NativeSearchToolbar/ISearchToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSearchQueryChange:(Ljava/lang/String;)V:GetOnSearchQueryChange_Ljava_lang_String_Handler:pdftron.PDF.Controls.NativeSearchToolbar/ISearchToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSearchQuerySubmit:(Ljava/lang/String;)V:GetOnSearchQuerySubmit_Ljava_lang_String_Handler:pdftron.PDF.Controls.NativeSearchToolbar/ISearchToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.NativeSearchToolbar+ISearchToolbarListenerImplementor, PDFViewCtrlTools", SearchToolbar_SearchToolbarListenerImplementor.class, __md_methods);
	}


	public SearchToolbar_SearchToolbarListenerImplementor ()
	{
		super ();
		if (getClass () == SearchToolbar_SearchToolbarListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.NativeSearchToolbar+ISearchToolbarListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onClearSearchQuery ()
	{
		n_onClearSearchQuery ();
	}

	private native void n_onClearSearchQuery ();


	public void onExitSearch ()
	{
		n_onExitSearch ();
	}

	private native void n_onExitSearch ();


	public void onSearchOptionsItemSelected (android.view.MenuItem p0, java.lang.String p1)
	{
		n_onSearchOptionsItemSelected (p0, p1);
	}

	private native void n_onSearchOptionsItemSelected (android.view.MenuItem p0, java.lang.String p1);


	public void onSearchQueryChange (java.lang.String p0)
	{
		n_onSearchQueryChange (p0);
	}

	private native void n_onSearchQueryChange (java.lang.String p0);


	public void onSearchQuerySubmit (java.lang.String p0)
	{
		n_onSearchQuerySubmit (p0);
	}

	private native void n_onSearchQuerySubmit (java.lang.String p0);

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
