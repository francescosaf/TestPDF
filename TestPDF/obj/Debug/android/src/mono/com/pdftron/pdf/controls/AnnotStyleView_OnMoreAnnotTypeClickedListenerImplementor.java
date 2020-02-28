package mono.com.pdftron.pdf.controls;


public class AnnotStyleView_OnMoreAnnotTypeClickedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.AnnotStyleView.OnMoreAnnotTypeClickedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotTypeClicked:(I)V:GetOnAnnotTypeClicked_IHandler:pdftron.PDF.Controls.AnnotStyleView/IOnMoreAnnotTypeClickedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.AnnotStyleView+IOnMoreAnnotTypeClickedListenerImplementor, PDFViewCtrlTools", AnnotStyleView_OnMoreAnnotTypeClickedListenerImplementor.class, __md_methods);
	}


	public AnnotStyleView_OnMoreAnnotTypeClickedListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotStyleView_OnMoreAnnotTypeClickedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.AnnotStyleView+IOnMoreAnnotTypeClickedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotTypeClicked (int p0)
	{
		n_onAnnotTypeClicked (p0);
	}

	private native void n_onAnnotTypeClicked (int p0);

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
