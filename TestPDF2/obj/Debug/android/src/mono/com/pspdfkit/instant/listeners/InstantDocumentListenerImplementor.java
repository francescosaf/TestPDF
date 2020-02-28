package mono.com.pspdfkit.instant.listeners;


public class InstantDocumentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.instant.listeners.InstantDocumentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuthenticationFailed:(Lcom/pspdfkit/instant/document/InstantPdfDocument;Lcom/pspdfkit/instant/exceptions/InstantException;)V:GetOnAuthenticationFailed_Lcom_pspdfkit_instant_document_InstantPdfDocument_Lcom_pspdfkit_instant_exceptions_InstantException_Handler:PSPDFKit.Instant.IInstantDocumentListenerInvoker, PSPDFKit.Android\n" +
			"n_onAuthenticationFinished:(Lcom/pspdfkit/instant/document/InstantPdfDocument;Ljava/lang/String;)V:GetOnAuthenticationFinished_Lcom_pspdfkit_instant_document_InstantPdfDocument_Ljava_lang_String_Handler:PSPDFKit.Instant.IInstantDocumentListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentCorrupted:(Lcom/pspdfkit/instant/document/InstantPdfDocument;)V:GetOnDocumentCorrupted_Lcom_pspdfkit_instant_document_InstantPdfDocument_Handler:PSPDFKit.Instant.IInstantDocumentListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentInvalidated:(Lcom/pspdfkit/instant/document/InstantPdfDocument;)V:GetOnDocumentInvalidated_Lcom_pspdfkit_instant_document_InstantPdfDocument_Handler:PSPDFKit.Instant.IInstantDocumentListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentStateChanged:(Lcom/pspdfkit/instant/document/InstantPdfDocument;Lcom/pspdfkit/instant/document/InstantDocumentState;)V:GetOnDocumentStateChanged_Lcom_pspdfkit_instant_document_InstantPdfDocument_Lcom_pspdfkit_instant_document_InstantDocumentState_Handler:PSPDFKit.Instant.IInstantDocumentListenerInvoker, PSPDFKit.Android\n" +
			"n_onSyncError:(Lcom/pspdfkit/instant/document/InstantPdfDocument;Lcom/pspdfkit/instant/exceptions/InstantException;)V:GetOnSyncError_Lcom_pspdfkit_instant_document_InstantPdfDocument_Lcom_pspdfkit_instant_exceptions_InstantException_Handler:PSPDFKit.Instant.IInstantDocumentListenerInvoker, PSPDFKit.Android\n" +
			"n_onSyncFinished:(Lcom/pspdfkit/instant/document/InstantPdfDocument;)V:GetOnSyncFinished_Lcom_pspdfkit_instant_document_InstantPdfDocument_Handler:PSPDFKit.Instant.IInstantDocumentListenerInvoker, PSPDFKit.Android\n" +
			"n_onSyncStarted:(Lcom/pspdfkit/instant/document/InstantPdfDocument;)V:GetOnSyncStarted_Lcom_pspdfkit_instant_document_InstantPdfDocument_Handler:PSPDFKit.Instant.IInstantDocumentListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Instant.IInstantDocumentListenerImplementor, PSPDFKit.Android", InstantDocumentListenerImplementor.class, __md_methods);
	}


	public InstantDocumentListenerImplementor ()
	{
		super ();
		if (getClass () == InstantDocumentListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Instant.IInstantDocumentListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAuthenticationFailed (com.pspdfkit.instant.document.InstantPdfDocument p0, com.pspdfkit.instant.exceptions.InstantException p1)
	{
		n_onAuthenticationFailed (p0, p1);
	}

	private native void n_onAuthenticationFailed (com.pspdfkit.instant.document.InstantPdfDocument p0, com.pspdfkit.instant.exceptions.InstantException p1);


	public void onAuthenticationFinished (com.pspdfkit.instant.document.InstantPdfDocument p0, java.lang.String p1)
	{
		n_onAuthenticationFinished (p0, p1);
	}

	private native void n_onAuthenticationFinished (com.pspdfkit.instant.document.InstantPdfDocument p0, java.lang.String p1);


	public void onDocumentCorrupted (com.pspdfkit.instant.document.InstantPdfDocument p0)
	{
		n_onDocumentCorrupted (p0);
	}

	private native void n_onDocumentCorrupted (com.pspdfkit.instant.document.InstantPdfDocument p0);


	public void onDocumentInvalidated (com.pspdfkit.instant.document.InstantPdfDocument p0)
	{
		n_onDocumentInvalidated (p0);
	}

	private native void n_onDocumentInvalidated (com.pspdfkit.instant.document.InstantPdfDocument p0);


	public void onDocumentStateChanged (com.pspdfkit.instant.document.InstantPdfDocument p0, com.pspdfkit.instant.document.InstantDocumentState p1)
	{
		n_onDocumentStateChanged (p0, p1);
	}

	private native void n_onDocumentStateChanged (com.pspdfkit.instant.document.InstantPdfDocument p0, com.pspdfkit.instant.document.InstantDocumentState p1);


	public void onSyncError (com.pspdfkit.instant.document.InstantPdfDocument p0, com.pspdfkit.instant.exceptions.InstantException p1)
	{
		n_onSyncError (p0, p1);
	}

	private native void n_onSyncError (com.pspdfkit.instant.document.InstantPdfDocument p0, com.pspdfkit.instant.exceptions.InstantException p1);


	public void onSyncFinished (com.pspdfkit.instant.document.InstantPdfDocument p0)
	{
		n_onSyncFinished (p0);
	}

	private native void n_onSyncFinished (com.pspdfkit.instant.document.InstantPdfDocument p0);


	public void onSyncStarted (com.pspdfkit.instant.document.InstantPdfDocument p0)
	{
		n_onSyncStarted (p0);
	}

	private native void n_onSyncStarted (com.pspdfkit.instant.document.InstantPdfDocument p0);

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
