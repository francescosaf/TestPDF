package mono.com.pspdfkit.document.library;


public class LibraryIndexingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.document.library.LibraryIndexingListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_enableOnPageIndexedEvents:()Z:GetEnableOnPageIndexedEventsHandler:PSPDFKit.Document.Library.ILibraryIndexingListenerInvoker, PSPDFKit.Android\n" +
			"n_onFinishIndexingDocument:(Ljava/lang/String;Z)V:GetOnFinishIndexingDocument_Ljava_lang_String_ZHandler:PSPDFKit.Document.Library.ILibraryIndexingListenerInvoker, PSPDFKit.Android\n" +
			"n_onPageIndexed:(Ljava/lang/String;ILjava/lang/String;)V:GetOnPageIndexed_Ljava_lang_String_ILjava_lang_String_Handler:PSPDFKit.Document.Library.ILibraryIndexingListenerInvoker, PSPDFKit.Android\n" +
			"n_onStartIndexingDocument:(Ljava/lang/String;)V:GetOnStartIndexingDocument_Ljava_lang_String_Handler:PSPDFKit.Document.Library.ILibraryIndexingListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Document.Library.ILibraryIndexingListenerImplementor, PSPDFKit.Android", LibraryIndexingListenerImplementor.class, __md_methods);
	}


	public LibraryIndexingListenerImplementor ()
	{
		super ();
		if (getClass () == LibraryIndexingListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Document.Library.ILibraryIndexingListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean enableOnPageIndexedEvents ()
	{
		return n_enableOnPageIndexedEvents ();
	}

	private native boolean n_enableOnPageIndexedEvents ();


	public void onFinishIndexingDocument (java.lang.String p0, boolean p1)
	{
		n_onFinishIndexingDocument (p0, p1);
	}

	private native void n_onFinishIndexingDocument (java.lang.String p0, boolean p1);


	public void onPageIndexed (java.lang.String p0, int p1, java.lang.String p2)
	{
		n_onPageIndexed (p0, p1, p2);
	}

	private native void n_onPageIndexed (java.lang.String p0, int p1, java.lang.String p2);


	public void onStartIndexingDocument (java.lang.String p0)
	{
		n_onStartIndexingDocument (p0);
	}

	private native void n_onStartIndexingDocument (java.lang.String p0);

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
