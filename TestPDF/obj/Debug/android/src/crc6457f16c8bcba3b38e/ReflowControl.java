package crc6457f16c8bcba3b38e;


public class ReflowControl
	extends com.pdftron.pdf.controls.ReflowControl
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_cleanUp:()V:GetCleanUpHandler\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.ReflowControl, PDFViewCtrlTools", ReflowControl.class, __md_methods);
	}


	public ReflowControl (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ReflowControl.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.ReflowControl, PDFViewCtrlTools", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ReflowControl (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ReflowControl.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.ReflowControl, PDFViewCtrlTools", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public void cleanUp ()
	{
		n_cleanUp ();
	}

	private native void n_cleanUp ();

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
