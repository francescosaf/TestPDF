package mono.com.pdftron.pdf.widget;


public class RotateHandleView_RotateHandleViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.widget.RotateHandleView.RotateHandleViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDown:(FF)V:GetOnDown_FFHandler:pdftron.PDF.Widget.RotateHandleView/IRotateHandleViewListenerInvoker, PDFViewCtrlTools\n" +
			"n_onMove:(FF)V:GetOnMove_FFHandler:pdftron.PDF.Widget.RotateHandleView/IRotateHandleViewListenerInvoker, PDFViewCtrlTools\n" +
			"n_onUp:(FFFF)V:GetOnUp_FFFFHandler:pdftron.PDF.Widget.RotateHandleView/IRotateHandleViewListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Widget.RotateHandleView+IRotateHandleViewListenerImplementor, PDFViewCtrlTools", RotateHandleView_RotateHandleViewListenerImplementor.class, __md_methods);
	}


	public RotateHandleView_RotateHandleViewListenerImplementor ()
	{
		super ();
		if (getClass () == RotateHandleView_RotateHandleViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Widget.RotateHandleView+IRotateHandleViewListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onDown (float p0, float p1)
	{
		n_onDown (p0, p1);
	}

	private native void n_onDown (float p0, float p1);


	public void onMove (float p0, float p1)
	{
		n_onMove (p0, p1);
	}

	private native void n_onMove (float p0, float p1);


	public void onUp (float p0, float p1, float p2, float p3)
	{
		n_onUp (p0, p1, p2, p3);
	}

	private native void n_onUp (float p0, float p1, float p2, float p3);

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
