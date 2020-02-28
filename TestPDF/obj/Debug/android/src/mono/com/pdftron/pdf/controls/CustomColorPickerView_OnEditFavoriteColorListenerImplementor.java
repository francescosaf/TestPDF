package mono.com.pdftron.pdf.controls;


public class CustomColorPickerView_OnEditFavoriteColorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.CustomColorPickerView.OnEditFavoriteColorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEditFavoriteColorDismissed:()V:GetOnEditFavoriteColorDismissedHandler:pdftron.PDF.Controls.CustomColorPickerView/IOnEditFavoriteColorListenerInvoker, PDFViewCtrlTools\n" +
			"n_onEditFavoriteItemSelected:(I)V:GetOnEditFavoriteItemSelected_IHandler:pdftron.PDF.Controls.CustomColorPickerView/IOnEditFavoriteColorListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.CustomColorPickerView+IOnEditFavoriteColorListenerImplementor, PDFViewCtrlTools", CustomColorPickerView_OnEditFavoriteColorListenerImplementor.class, __md_methods);
	}


	public CustomColorPickerView_OnEditFavoriteColorListenerImplementor ()
	{
		super ();
		if (getClass () == CustomColorPickerView_OnEditFavoriteColorListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.CustomColorPickerView+IOnEditFavoriteColorListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onEditFavoriteColorDismissed ()
	{
		n_onEditFavoriteColorDismissed ();
	}

	private native void n_onEditFavoriteColorDismissed ();


	public void onEditFavoriteItemSelected (int p0)
	{
		n_onEditFavoriteItemSelected (p0);
	}

	private native void n_onEditFavoriteItemSelected (int p0);

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
