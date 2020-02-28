package mono.com.pdftron.pdf.controls;


public class AnnotStyleView_OnColorLayoutClickedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.AnnotStyleView.OnColorLayoutClickedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onColorLayoutClicked:(I)V:GetOnColorLayoutClicked_IHandler:pdftron.PDF.Controls.AnnotStyleView/IOnColorLayoutClickedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.AnnotStyleView+IOnColorLayoutClickedListenerImplementor, PDFViewCtrlTools", AnnotStyleView_OnColorLayoutClickedListenerImplementor.class, __md_methods);
	}


	public AnnotStyleView_OnColorLayoutClickedListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotStyleView_OnColorLayoutClickedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.AnnotStyleView+IOnColorLayoutClickedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onColorLayoutClicked (int p0)
	{
		n_onColorLayoutClicked (p0);
	}

	private native void n_onColorLayoutClicked (int p0);

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
