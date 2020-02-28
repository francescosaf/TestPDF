package mono.com.pspdfkit.ui.redaction;


public class RedactionView_RedactionViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.redaction.RedactionView.RedactionViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPreviewModeChanged:(Z)V:GetOnPreviewModeChanged_ZHandler:PSPDFKit.UI.Redaction.RedactionView/IRedactionViewListenerInvoker, PSPDFKit.Android\n" +
			"n_onRedactionsApplied:()V:GetOnRedactionsAppliedHandler:PSPDFKit.UI.Redaction.RedactionView/IRedactionViewListenerInvoker, PSPDFKit.Android\n" +
			"n_onRedactionsCleared:()V:GetOnRedactionsClearedHandler:PSPDFKit.UI.Redaction.RedactionView/IRedactionViewListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Redaction.RedactionView+IRedactionViewListenerImplementor, PSPDFKit.Android", RedactionView_RedactionViewListenerImplementor.class, __md_methods);
	}


	public RedactionView_RedactionViewListenerImplementor ()
	{
		super ();
		if (getClass () == RedactionView_RedactionViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Redaction.RedactionView+IRedactionViewListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onPreviewModeChanged (boolean p0)
	{
		n_onPreviewModeChanged (p0);
	}

	private native void n_onPreviewModeChanged (boolean p0);


	public void onRedactionsApplied ()
	{
		n_onRedactionsApplied ();
	}

	private native void n_onRedactionsApplied ();


	public void onRedactionsCleared ()
	{
		n_onRedactionsCleared ();
	}

	private native void n_onRedactionsCleared ();

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
