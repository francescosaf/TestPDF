package mono.com.pdftron.pdf.controls;


public class UserBookmarkDialogFragment_UserBookmarkDialogListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.UserBookmarkDialogFragment.UserBookmarkDialogListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUserBookmarkClicked:(I)V:GetOnUserBookmarkClicked_IHandler:pdftron.PDF.Controls.UserBookmarkDialogFragment/IUserBookmarkDialogListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.UserBookmarkDialogFragment+IUserBookmarkDialogListenerImplementor, PDFViewCtrlTools", UserBookmarkDialogFragment_UserBookmarkDialogListenerImplementor.class, __md_methods);
	}


	public UserBookmarkDialogFragment_UserBookmarkDialogListenerImplementor ()
	{
		super ();
		if (getClass () == UserBookmarkDialogFragment_UserBookmarkDialogListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.UserBookmarkDialogFragment+IUserBookmarkDialogListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onUserBookmarkClicked (int p0)
	{
		n_onUserBookmarkClicked (p0);
	}

	private native void n_onUserBookmarkClicked (int p0);

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
