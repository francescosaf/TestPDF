package mono.com.pdftron.pdf.controls;


public class OnToolbarStateUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.OnToolbarStateUpdateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onToolbarStateUpdated:()V:GetOnToolbarStateUpdatedHandler:pdftron.PDF.Controls.IOnToolbarStateUpdateListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.IOnToolbarStateUpdateListenerImplementor, PDFViewCtrlTools", OnToolbarStateUpdateListenerImplementor.class, __md_methods);
	}


	public OnToolbarStateUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == OnToolbarStateUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.IOnToolbarStateUpdateListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onToolbarStateUpdated ()
	{
		n_onToolbarStateUpdated ();
	}

	private native void n_onToolbarStateUpdated ();

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
