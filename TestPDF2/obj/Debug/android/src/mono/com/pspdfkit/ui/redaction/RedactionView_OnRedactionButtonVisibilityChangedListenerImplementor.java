package mono.com.pspdfkit.ui.redaction;


public class RedactionView_OnRedactionButtonVisibilityChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.redaction.RedactionView.OnRedactionButtonVisibilityChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRedactionButtonCollapsing:()V:GetOnRedactionButtonCollapsingHandler:PSPDFKit.UI.Redaction.RedactionView/IOnRedactionButtonVisibilityChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_onRedactionButtonExpanding:()V:GetOnRedactionButtonExpandingHandler:PSPDFKit.UI.Redaction.RedactionView/IOnRedactionButtonVisibilityChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_onRedactionButtonSlidingInside:()V:GetOnRedactionButtonSlidingInsideHandler:PSPDFKit.UI.Redaction.RedactionView/IOnRedactionButtonVisibilityChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_onRedactionButtonSlidingOutside:()V:GetOnRedactionButtonSlidingOutsideHandler:PSPDFKit.UI.Redaction.RedactionView/IOnRedactionButtonVisibilityChangedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Redaction.RedactionView+IOnRedactionButtonVisibilityChangedListenerImplementor, PSPDFKit.Android", RedactionView_OnRedactionButtonVisibilityChangedListenerImplementor.class, __md_methods);
	}


	public RedactionView_OnRedactionButtonVisibilityChangedListenerImplementor ()
	{
		super ();
		if (getClass () == RedactionView_OnRedactionButtonVisibilityChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Redaction.RedactionView+IOnRedactionButtonVisibilityChangedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onRedactionButtonCollapsing ()
	{
		n_onRedactionButtonCollapsing ();
	}

	private native void n_onRedactionButtonCollapsing ();


	public void onRedactionButtonExpanding ()
	{
		n_onRedactionButtonExpanding ();
	}

	private native void n_onRedactionButtonExpanding ();


	public void onRedactionButtonSlidingInside ()
	{
		n_onRedactionButtonSlidingInside ();
	}

	private native void n_onRedactionButtonSlidingInside ();


	public void onRedactionButtonSlidingOutside ()
	{
		n_onRedactionButtonSlidingOutside ();
	}

	private native void n_onRedactionButtonSlidingOutside ();

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
