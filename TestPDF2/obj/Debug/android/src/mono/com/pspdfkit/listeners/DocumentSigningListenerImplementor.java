package mono.com.pspdfkit.listeners;


public class DocumentSigningListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.listeners.DocumentSigningListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentSigned:(Landroid/net/Uri;)V:GetOnDocumentSigned_Landroid_net_Uri_Handler:PSPDFKit.Listeners.IDocumentSigningListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentSigningError:(Ljava/lang/Throwable;)V:GetOnDocumentSigningError_Ljava_lang_Throwable_Handler:PSPDFKit.Listeners.IDocumentSigningListenerInvoker, PSPDFKit.Android\n" +
			"n_onSigningCancelled:()V:GetOnSigningCancelledHandler:PSPDFKit.Listeners.IDocumentSigningListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Listeners.IDocumentSigningListenerImplementor, PSPDFKit.Android", DocumentSigningListenerImplementor.class, __md_methods);
	}


	public DocumentSigningListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentSigningListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Listeners.IDocumentSigningListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDocumentSigned (android.net.Uri p0)
	{
		n_onDocumentSigned (p0);
	}

	private native void n_onDocumentSigned (android.net.Uri p0);


	public void onDocumentSigningError (java.lang.Throwable p0)
	{
		n_onDocumentSigningError (p0);
	}

	private native void n_onDocumentSigningError (java.lang.Throwable p0);


	public void onSigningCancelled ()
	{
		n_onSigningCancelled ();
	}

	private native void n_onSigningCancelled ();

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
