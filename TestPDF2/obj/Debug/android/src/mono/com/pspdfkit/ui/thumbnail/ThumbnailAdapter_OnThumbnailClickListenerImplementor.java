package mono.com.pspdfkit.ui.thumbnail;


public class ThumbnailAdapter_OnThumbnailClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.thumbnail.ThumbnailAdapter.OnThumbnailClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onThumbnailChanged:(Landroid/view/View;I)V:GetOnThumbnailChanged_Landroid_view_View_IHandler:PSPDFKit.UI.Thumbnail.ThumbnailAdapter/IOnThumbnailClickListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Thumbnail.ThumbnailAdapter+IOnThumbnailClickListenerImplementor, PSPDFKit.Android", ThumbnailAdapter_OnThumbnailClickListenerImplementor.class, __md_methods);
	}


	public ThumbnailAdapter_OnThumbnailClickListenerImplementor ()
	{
		super ();
		if (getClass () == ThumbnailAdapter_OnThumbnailClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Thumbnail.ThumbnailAdapter+IOnThumbnailClickListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onThumbnailChanged (android.view.View p0, int p1)
	{
		n_onThumbnailChanged (p0, p1);
	}

	private native void n_onThumbnailChanged (android.view.View p0, int p1);

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
