package mono.com.pdftron.pdf.controls;


public class FavoriteColorDialogFragment_OnEditFinishedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.FavoriteColorDialogFragment.OnEditFinishedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEditFinished:(Ljava/util/ArrayList;I)V:GetOnEditFinished_Ljava_util_ArrayList_IHandler:pdftron.PDF.Controls.FavoriteColorDialogFragment/IOnEditFinishedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.FavoriteColorDialogFragment+IOnEditFinishedListenerImplementor, PDFViewCtrlTools", FavoriteColorDialogFragment_OnEditFinishedListenerImplementor.class, __md_methods);
	}


	public FavoriteColorDialogFragment_OnEditFinishedListenerImplementor ()
	{
		super ();
		if (getClass () == FavoriteColorDialogFragment_OnEditFinishedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.FavoriteColorDialogFragment+IOnEditFinishedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onEditFinished (java.util.ArrayList p0, int p1)
	{
		n_onEditFinished (p0, p1);
	}

	private native void n_onEditFinished (java.util.ArrayList p0, int p1);

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
