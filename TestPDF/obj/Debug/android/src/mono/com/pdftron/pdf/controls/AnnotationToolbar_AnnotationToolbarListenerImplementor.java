package mono.com.pdftron.pdf.controls;


public class AnnotationToolbar_AnnotationToolbarListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.AnnotationToolbar.AnnotationToolbarListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationToolbarClosed:()V:GetOnAnnotationToolbarClosedHandler:pdftron.PDF.Controls.NativeAnnotationToolbar/IAnnotationToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_onAnnotationToolbarShown:()V:GetOnAnnotationToolbarShownHandler:pdftron.PDF.Controls.NativeAnnotationToolbar/IAnnotationToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_onShowAnnotationToolbarByShortcut:(I)V:GetOnShowAnnotationToolbarByShortcut_IHandler:pdftron.PDF.Controls.NativeAnnotationToolbar/IAnnotationToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.NativeAnnotationToolbar+IAnnotationToolbarListenerImplementor, PDFViewCtrlTools", AnnotationToolbar_AnnotationToolbarListenerImplementor.class, __md_methods);
	}


	public AnnotationToolbar_AnnotationToolbarListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationToolbar_AnnotationToolbarListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.NativeAnnotationToolbar+IAnnotationToolbarListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationToolbarClosed ()
	{
		n_onAnnotationToolbarClosed ();
	}

	private native void n_onAnnotationToolbarClosed ();


	public void onAnnotationToolbarShown ()
	{
		n_onAnnotationToolbarShown ();
	}

	private native void n_onAnnotationToolbarShown ();


	public void onShowAnnotationToolbarByShortcut (int p0)
	{
		n_onShowAnnotationToolbarByShortcut (p0);
	}

	private native void n_onShowAnnotationToolbarByShortcut (int p0);

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
