package mono.com.pdftron.pdf.controls;


public class ThumbnailsViewFragment_OnThumbnailsEditAttemptWhileReadOnlyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.ThumbnailsViewFragment.OnThumbnailsEditAttemptWhileReadOnlyListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onThumbnailsEditAttemptWhileReadOnly:()V:GetOnThumbnailsEditAttemptWhileReadOnlyHandler:pdftron.PDF.Controls.ThumbnailsViewFragment/IOnThumbnailsEditAttemptWhileReadOnlyListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.ThumbnailsViewFragment+IOnThumbnailsEditAttemptWhileReadOnlyListenerImplementor, PDFViewCtrlTools", ThumbnailsViewFragment_OnThumbnailsEditAttemptWhileReadOnlyListenerImplementor.class, __md_methods);
	}


	public ThumbnailsViewFragment_OnThumbnailsEditAttemptWhileReadOnlyListenerImplementor ()
	{
		super ();
		if (getClass () == ThumbnailsViewFragment_OnThumbnailsEditAttemptWhileReadOnlyListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.ThumbnailsViewFragment+IOnThumbnailsEditAttemptWhileReadOnlyListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onThumbnailsEditAttemptWhileReadOnly ()
	{
		n_onThumbnailsEditAttemptWhileReadOnly ();
	}

	private native void n_onThumbnailsEditAttemptWhileReadOnly ();

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
