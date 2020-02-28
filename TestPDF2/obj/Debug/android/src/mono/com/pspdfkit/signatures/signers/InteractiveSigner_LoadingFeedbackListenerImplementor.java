package mono.com.pspdfkit.signatures.signers;


public class InteractiveSigner_LoadingFeedbackListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.signatures.signers.InteractiveSigner.LoadingFeedbackListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(Ljava/lang/String;Ljava/lang/Throwable;)V:GetOnError_Ljava_lang_String_Ljava_lang_Throwable_Handler:PSPDFKit.Signatures.Signers.IInteractiveSignerLoadingFeedbackListenerInvoker, PSPDFKit.Android\n" +
			"n_onInteractionRequired:(Lcom/pspdfkit/signatures/signers/InteractiveSigner$LoadingFeedbackListener$InteractionRequiredEvent;)V:GetOnInteractionRequired_Lcom_pspdfkit_signatures_signers_InteractiveSigner_LoadingFeedbackListener_InteractionRequiredEvent_Handler:PSPDFKit.Signatures.Signers.IInteractiveSignerLoadingFeedbackListenerInvoker, PSPDFKit.Android\n" +
			"n_onSuccess:()V:GetOnSuccessHandler:PSPDFKit.Signatures.Signers.IInteractiveSignerLoadingFeedbackListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Signatures.Signers.IInteractiveSignerLoadingFeedbackListenerImplementor, PSPDFKit.Android", InteractiveSigner_LoadingFeedbackListenerImplementor.class, __md_methods);
	}


	public InteractiveSigner_LoadingFeedbackListenerImplementor ()
	{
		super ();
		if (getClass () == InteractiveSigner_LoadingFeedbackListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Signatures.Signers.IInteractiveSignerLoadingFeedbackListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onError (java.lang.String p0, java.lang.Throwable p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (java.lang.String p0, java.lang.Throwable p1);


	public void onInteractionRequired (com.pspdfkit.signatures.signers.InteractiveSigner.LoadingFeedbackListener.InteractionRequiredEvent p0)
	{
		n_onInteractionRequired (p0);
	}

	private native void n_onInteractionRequired (com.pspdfkit.signatures.signers.InteractiveSigner.LoadingFeedbackListener.InteractionRequiredEvent p0);


	public void onSuccess ()
	{
		n_onSuccess ();
	}

	private native void n_onSuccess ();

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
