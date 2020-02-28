package mono.com.pdftron.pdf.controls;


public class ThumbnailSlider_OnMenuItemClickedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.ThumbnailSlider.OnMenuItemClickedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMenuItemClicked:(I)V:GetOnMenuItemClicked_IHandler:pdftron.PDF.Controls.NativeThumbnailSlider/IOnMenuItemClickedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.NativeThumbnailSlider+IOnMenuItemClickedListenerImplementor, PDFViewCtrlTools", ThumbnailSlider_OnMenuItemClickedListenerImplementor.class, __md_methods);
	}


	public ThumbnailSlider_OnMenuItemClickedListenerImplementor ()
	{
		super ();
		if (getClass () == ThumbnailSlider_OnMenuItemClickedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.NativeThumbnailSlider+IOnMenuItemClickedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onMenuItemClicked (int p0)
	{
		n_onMenuItemClicked (p0);
	}

	private native void n_onMenuItemClicked (int p0);

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
