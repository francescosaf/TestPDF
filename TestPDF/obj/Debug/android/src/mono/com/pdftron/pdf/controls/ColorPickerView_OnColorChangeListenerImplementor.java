package mono.com.pdftron.pdf.controls;


public class ColorPickerView_OnColorChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.ColorPickerView.OnColorChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_OnColorChanged:(Landroid/view/View;I)V:GetOnColorChanged_Landroid_view_View_IHandler:pdftron.PDF.Controls.ColorPickerView/IOnColorChangeListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.ColorPickerView+IOnColorChangeListenerImplementor, PDFViewCtrlTools", ColorPickerView_OnColorChangeListenerImplementor.class, __md_methods);
	}


	public ColorPickerView_OnColorChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ColorPickerView_OnColorChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.ColorPickerView+IOnColorChangeListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void OnColorChanged (android.view.View p0, int p1)
	{
		n_OnColorChanged (p0, p1);
	}

	private native void n_OnColorChanged (android.view.View p0, int p1);

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
