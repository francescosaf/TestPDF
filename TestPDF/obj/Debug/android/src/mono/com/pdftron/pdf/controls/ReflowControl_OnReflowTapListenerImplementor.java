package mono.com.pdftron.pdf.controls;


public class ReflowControl_OnReflowTapListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.ReflowControl.OnReflowTapListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReflowSingleTapUp:(Landroid/view/MotionEvent;)V:GetOnReflowSingleTapUp_Landroid_view_MotionEvent_Handler:pdftron.PDF.Controls.NativeReflowControl/IOnReflowTapListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.NativeReflowControl+IOnReflowTapListenerImplementor, PDFViewCtrlTools", ReflowControl_OnReflowTapListenerImplementor.class, __md_methods);
	}


	public ReflowControl_OnReflowTapListenerImplementor ()
	{
		super ();
		if (getClass () == ReflowControl_OnReflowTapListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.NativeReflowControl+IOnReflowTapListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onReflowSingleTapUp (android.view.MotionEvent p0)
	{
		n_onReflowSingleTapUp (p0);
	}

	private native void n_onReflowSingleTapUp (android.view.MotionEvent p0);

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
