package mono.com.pspdfkit.listeners;


public class OnVisibilityChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.listeners.OnVisibilityChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHide:(Landroid/view/View;)V:GetOnHide_Landroid_view_View_Handler:PSPDFKit.Listeners.IOnVisibilityChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_onShow:(Landroid/view/View;)V:GetOnShow_Landroid_view_View_Handler:PSPDFKit.Listeners.IOnVisibilityChangedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Listeners.IOnVisibilityChangedListenerImplementor, PSPDFKit.Android", OnVisibilityChangedListenerImplementor.class, __md_methods);
	}


	public OnVisibilityChangedListenerImplementor ()
	{
		super ();
		if (getClass () == OnVisibilityChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Listeners.IOnVisibilityChangedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onHide (android.view.View p0)
	{
		n_onHide (p0);
	}

	private native void n_onHide (android.view.View p0);


	public void onShow (android.view.View p0)
	{
		n_onShow (p0);
	}

	private native void n_onShow (android.view.View p0);

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
