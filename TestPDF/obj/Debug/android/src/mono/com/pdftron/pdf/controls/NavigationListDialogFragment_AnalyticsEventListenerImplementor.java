package mono.com.pdftron.pdf.controls;


public class NavigationListDialogFragment_AnalyticsEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.NavigationListDialogFragment.AnalyticsEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEventAction:()V:GetOnEventActionHandler:pdftron.PDF.Controls.NavigationListDialogFragment/IAnalyticsEventListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.NavigationListDialogFragment+IAnalyticsEventListenerImplementor, PDFViewCtrlTools", NavigationListDialogFragment_AnalyticsEventListenerImplementor.class, __md_methods);
	}


	public NavigationListDialogFragment_AnalyticsEventListenerImplementor ()
	{
		super ();
		if (getClass () == NavigationListDialogFragment_AnalyticsEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.NavigationListDialogFragment+IAnalyticsEventListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onEventAction ()
	{
		n_onEventAction ();
	}

	private native void n_onEventAction ();

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
