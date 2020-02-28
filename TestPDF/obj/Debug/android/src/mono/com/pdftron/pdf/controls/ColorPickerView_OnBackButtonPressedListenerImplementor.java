package mono.com.pdftron.pdf.controls;


public class ColorPickerView_OnBackButtonPressedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.ColorPickerView.OnBackButtonPressedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBackPressed:()V:GetOnBackPressedHandler:pdftron.PDF.Controls.ColorPickerView/IOnBackButtonPressedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.ColorPickerView+IOnBackButtonPressedListenerImplementor, PDFViewCtrlTools", ColorPickerView_OnBackButtonPressedListenerImplementor.class, __md_methods);
	}


	public ColorPickerView_OnBackButtonPressedListenerImplementor ()
	{
		super ();
		if (getClass () == ColorPickerView_OnBackButtonPressedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.ColorPickerView+IOnBackButtonPressedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();

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
