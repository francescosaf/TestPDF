package crc6457f16c8bcba3b38e;


public class FindTextOverlay
	extends com.pdftron.pdf.controls.FindTextOverlay
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.FindTextOverlay, PDFViewCtrlTools", FindTextOverlay.class, __md_methods);
	}


	public FindTextOverlay (android.content.Context p0)
	{
		super (p0);
		if (getClass () == FindTextOverlay.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.FindTextOverlay, PDFViewCtrlTools", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public FindTextOverlay (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == FindTextOverlay.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.FindTextOverlay, PDFViewCtrlTools", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public FindTextOverlay (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == FindTextOverlay.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.FindTextOverlay, PDFViewCtrlTools", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

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
