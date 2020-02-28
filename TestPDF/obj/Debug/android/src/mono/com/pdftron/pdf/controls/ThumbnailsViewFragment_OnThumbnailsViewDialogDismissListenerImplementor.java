package mono.com.pdftron.pdf.controls;


public class ThumbnailsViewFragment_OnThumbnailsViewDialogDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.ThumbnailsViewFragment.OnThumbnailsViewDialogDismissListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onThumbnailsViewDialogDismiss:(IZ)V:GetOnThumbnailsViewDialogDismiss_IZHandler:pdftron.PDF.Controls.ThumbnailsViewFragment/IOnThumbnailsViewDialogDismissListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.ThumbnailsViewFragment+IOnThumbnailsViewDialogDismissListenerImplementor, PDFViewCtrlTools", ThumbnailsViewFragment_OnThumbnailsViewDialogDismissListenerImplementor.class, __md_methods);
	}


	public ThumbnailsViewFragment_OnThumbnailsViewDialogDismissListenerImplementor ()
	{
		super ();
		if (getClass () == ThumbnailsViewFragment_OnThumbnailsViewDialogDismissListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.ThumbnailsViewFragment+IOnThumbnailsViewDialogDismissListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onThumbnailsViewDialogDismiss (int p0, boolean p1)
	{
		n_onThumbnailsViewDialogDismiss (p0, p1);
	}

	private native void n_onThumbnailsViewDialogDismiss (int p0, boolean p1);

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
