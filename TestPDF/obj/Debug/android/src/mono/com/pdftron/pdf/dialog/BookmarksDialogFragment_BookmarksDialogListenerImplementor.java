package mono.com.pdftron.pdf.dialog;


public class BookmarksDialogFragment_BookmarksDialogListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.dialog.BookmarksDialogFragment.BookmarksDialogListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBookmarksDialogDismissed:(I)V:GetOnBookmarksDialogDismissed_IHandler:pdftron.PDF.Dialog.BookmarksDialogFragment/IBookmarksDialogListenerInvoker, PDFViewCtrlTools\n" +
			"n_onBookmarksDialogWillDismiss:(I)V:GetOnBookmarksDialogWillDismiss_IHandler:pdftron.PDF.Dialog.BookmarksDialogFragment/IBookmarksDialogListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Dialog.BookmarksDialogFragment+IBookmarksDialogListenerImplementor, PDFViewCtrlTools", BookmarksDialogFragment_BookmarksDialogListenerImplementor.class, __md_methods);
	}


	public BookmarksDialogFragment_BookmarksDialogListenerImplementor ()
	{
		super ();
		if (getClass () == BookmarksDialogFragment_BookmarksDialogListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Dialog.BookmarksDialogFragment+IBookmarksDialogListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onBookmarksDialogDismissed (int p0)
	{
		n_onBookmarksDialogDismissed (p0);
	}

	private native void n_onBookmarksDialogDismissed (int p0);


	public void onBookmarksDialogWillDismiss (int p0)
	{
		n_onBookmarksDialogWillDismiss (p0);
	}

	private native void n_onBookmarksDialogWillDismiss (int p0);

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
