package mono.com.pspdfkit.document.library;


public class QueryResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.document.library.QueryResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSearchCompleted:(Ljava/lang/String;Ljava/util/Map;)V:GetOnSearchCompleted_Ljava_lang_String_Ljava_util_Map_Handler:PSPDFKit.Document.Library.IQueryResultListenerInvoker, PSPDFKit.Android\n" +
			"n_onSearchPreviewsGenerated:(Ljava/lang/String;Ljava/util/Map;)V:GetOnSearchPreviewsGenerated_Ljava_lang_String_Ljava_util_Map_Handler:PSPDFKit.Document.Library.IQueryResultListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Document.Library.IQueryResultListenerImplementor, PSPDFKit.Android", QueryResultListenerImplementor.class, __md_methods);
	}


	public QueryResultListenerImplementor ()
	{
		super ();
		if (getClass () == QueryResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Document.Library.IQueryResultListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onSearchCompleted (java.lang.String p0, java.util.Map p1)
	{
		n_onSearchCompleted (p0, p1);
	}

	private native void n_onSearchCompleted (java.lang.String p0, java.util.Map p1);


	public void onSearchPreviewsGenerated (java.lang.String p0, java.util.Map p1)
	{
		n_onSearchPreviewsGenerated (p0, p1);
	}

	private native void n_onSearchPreviewsGenerated (java.lang.String p0, java.util.Map p1);

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
