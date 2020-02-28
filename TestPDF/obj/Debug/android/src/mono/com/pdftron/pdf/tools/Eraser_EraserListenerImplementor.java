package mono.com.pdftron.pdf.tools;


public class Eraser_EraserListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.Eraser.EraserListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_strokeErased:()V:GetStrokeErasedHandler:pdftron.PDF.Tools.Eraser/IEraserListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.Eraser+IEraserListenerImplementor, PDFViewCtrlTools", Eraser_EraserListenerImplementor.class, __md_methods);
	}


	public Eraser_EraserListenerImplementor ()
	{
		super ();
		if (getClass () == Eraser_EraserListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.Eraser+IEraserListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void strokeErased ()
	{
		n_strokeErased ();
	}

	private native void n_strokeErased ();

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
