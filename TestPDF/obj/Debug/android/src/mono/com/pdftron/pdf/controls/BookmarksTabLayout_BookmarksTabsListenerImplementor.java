package mono.com.pdftron.pdf.controls;


public class BookmarksTabLayout_BookmarksTabsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.BookmarksTabLayout.BookmarksTabsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationClicked:(Lcom/pdftron/pdf/Annot;I)V:GetOnAnnotationClicked_Lcom_pdftron_pdf_Annot_IHandler:pdftron.PDF.Controls.BookmarksTabLayout/IBookmarksTabsListenerInvoker, PDFViewCtrlTools\n" +
			"n_onExportAnnotations:(Lcom/pdftron/pdf/PDFDoc;)V:GetOnExportAnnotations_Lcom_pdftron_pdf_PDFDoc_Handler:pdftron.PDF.Controls.BookmarksTabLayout/IBookmarksTabsListenerInvoker, PDFViewCtrlTools\n" +
			"n_onOutlineClicked:(Lcom/pdftron/pdf/Bookmark;Lcom/pdftron/pdf/Bookmark;)V:GetOnOutlineClicked_Lcom_pdftron_pdf_Bookmark_Lcom_pdftron_pdf_Bookmark_Handler:pdftron.PDF.Controls.BookmarksTabLayout/IBookmarksTabsListenerInvoker, PDFViewCtrlTools\n" +
			"n_onUserBookmarkClick:(I)V:GetOnUserBookmarkClick_IHandler:pdftron.PDF.Controls.BookmarksTabLayout/IBookmarksTabsListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.BookmarksTabLayout+IBookmarksTabsListenerImplementor, PDFViewCtrlTools", BookmarksTabLayout_BookmarksTabsListenerImplementor.class, __md_methods);
	}


	public BookmarksTabLayout_BookmarksTabsListenerImplementor ()
	{
		super ();
		if (getClass () == BookmarksTabLayout_BookmarksTabsListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.BookmarksTabLayout+IBookmarksTabsListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationClicked (com.pdftron.pdf.Annot p0, int p1)
	{
		n_onAnnotationClicked (p0, p1);
	}

	private native void n_onAnnotationClicked (com.pdftron.pdf.Annot p0, int p1);


	public void onExportAnnotations (com.pdftron.pdf.PDFDoc p0)
	{
		n_onExportAnnotations (p0);
	}

	private native void n_onExportAnnotations (com.pdftron.pdf.PDFDoc p0);


	public void onOutlineClicked (com.pdftron.pdf.Bookmark p0, com.pdftron.pdf.Bookmark p1)
	{
		n_onOutlineClicked (p0, p1);
	}

	private native void n_onOutlineClicked (com.pdftron.pdf.Bookmark p0, com.pdftron.pdf.Bookmark p1);


	public void onUserBookmarkClick (int p0)
	{
		n_onUserBookmarkClick (p0);
	}

	private native void n_onUserBookmarkClick (int p0);

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
