package crc64297ac394a17a5c95;


public class CustomRelativeLayout
	extends com.pdftron.pdf.tools.CustomRelativeLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.CustomRelativeLayout, PDFViewCtrlTools", CustomRelativeLayout.class, __md_methods);
	}


	public CustomRelativeLayout (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CustomRelativeLayout.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.CustomRelativeLayout, PDFViewCtrlTools", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public CustomRelativeLayout (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CustomRelativeLayout.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.CustomRelativeLayout, PDFViewCtrlTools", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public CustomRelativeLayout (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CustomRelativeLayout.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.CustomRelativeLayout, PDFViewCtrlTools", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CustomRelativeLayout (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == CustomRelativeLayout.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.CustomRelativeLayout, PDFViewCtrlTools", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public CustomRelativeLayout (android.content.Context p0, com.pdftron.pdf.PDFViewCtrl p1, double p2, double p3, int p4)
	{
		super (p0, p1, p2, p3, p4);
		if (getClass () == CustomRelativeLayout.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.CustomRelativeLayout, PDFViewCtrlTools", "Android.Content.Context, Mono.Android:pdftronprivate.PDF.PDFViewCtrl, PDFNetAndroid:System.Double, mscorlib:System.Double, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
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
