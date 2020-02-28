package mono.com.pdftron.pdf.controls;


public class ThumbnailsViewFragment_OnExportThumbnailsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.ThumbnailsViewFragment.OnExportThumbnailsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onExportThumbnails:(Landroid/util/SparseBooleanArray;)V:GetOnExportThumbnails_Landroid_util_SparseBooleanArray_Handler:pdftron.PDF.Controls.ThumbnailsViewFragment/IOnExportThumbnailsListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.ThumbnailsViewFragment+IOnExportThumbnailsListenerImplementor, PDFViewCtrlTools", ThumbnailsViewFragment_OnExportThumbnailsListenerImplementor.class, __md_methods);
	}


	public ThumbnailsViewFragment_OnExportThumbnailsListenerImplementor ()
	{
		super ();
		if (getClass () == ThumbnailsViewFragment_OnExportThumbnailsListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.ThumbnailsViewFragment+IOnExportThumbnailsListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onExportThumbnails (android.util.SparseBooleanArray p0)
	{
		n_onExportThumbnails (p0);
	}

	private native void n_onExportThumbnails (android.util.SparseBooleanArray p0);

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
