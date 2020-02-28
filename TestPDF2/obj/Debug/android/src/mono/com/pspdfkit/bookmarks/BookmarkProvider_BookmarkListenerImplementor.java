package mono.com.pspdfkit.bookmarks;


public class BookmarkProvider_BookmarkListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.bookmarks.BookmarkProvider.BookmarkListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBookmarksChanged:(Ljava/util/List;)V:GetOnBookmarksChanged_Ljava_util_List_Handler:PSPDFKit.Bookmarks.IBookmarkProviderBookmarkListenerInvoker, PSPDFKit.Android\n" +
			"n_onBookmarkAdded:(Lcom/pspdfkit/bookmarks/Bookmark;)V:GetOnBookmarkAdded_Lcom_pspdfkit_bookmarks_Bookmark_Handler:PSPDFKit.Bookmarks.IBookmarkProviderBookmarkListener, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Bookmarks.IBookmarkProviderBookmarkListenerImplementor, PSPDFKit.Android", BookmarkProvider_BookmarkListenerImplementor.class, __md_methods);
	}


	public BookmarkProvider_BookmarkListenerImplementor ()
	{
		super ();
		if (getClass () == BookmarkProvider_BookmarkListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Bookmarks.IBookmarkProviderBookmarkListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onBookmarksChanged (java.util.List p0)
	{
		n_onBookmarksChanged (p0);
	}

	private native void n_onBookmarksChanged (java.util.List p0);


	public void onBookmarkAdded (com.pspdfkit.bookmarks.Bookmark p0)
	{
		n_onBookmarkAdded (p0);
	}

	private native void n_onBookmarkAdded (com.pspdfkit.bookmarks.Bookmark p0);

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
