package mono.com.pdftron.pdf.controls;


public class ThumbnailSlider_OnThumbnailSliderTrackingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.ThumbnailSlider.OnThumbnailSliderTrackingListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onThumbSliderStartTrackingTouch:()V:GetOnThumbSliderStartTrackingTouchHandler:pdftron.PDF.Controls.NativeThumbnailSlider/IOnThumbnailSliderTrackingListenerInvoker, PDFViewCtrlTools\n" +
			"n_onThumbSliderStopTrackingTouch:(I)V:GetOnThumbSliderStopTrackingTouch_IHandler:pdftron.PDF.Controls.NativeThumbnailSlider/IOnThumbnailSliderTrackingListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.NativeThumbnailSlider+IOnThumbnailSliderTrackingListenerImplementor, PDFViewCtrlTools", ThumbnailSlider_OnThumbnailSliderTrackingListenerImplementor.class, __md_methods);
	}


	public ThumbnailSlider_OnThumbnailSliderTrackingListenerImplementor ()
	{
		super ();
		if (getClass () == ThumbnailSlider_OnThumbnailSliderTrackingListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.NativeThumbnailSlider+IOnThumbnailSliderTrackingListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onThumbSliderStartTrackingTouch ()
	{
		n_onThumbSliderStartTrackingTouch ();
	}

	private native void n_onThumbSliderStartTrackingTouch ();


	public void onThumbSliderStopTrackingTouch (int p0)
	{
		n_onThumbSliderStopTrackingTouch (p0);
	}

	private native void n_onThumbSliderStopTrackingTouch (int p0);

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
