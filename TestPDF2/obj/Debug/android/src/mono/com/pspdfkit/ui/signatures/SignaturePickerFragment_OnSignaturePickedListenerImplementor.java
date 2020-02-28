package mono.com.pspdfkit.ui.signatures;


public class SignaturePickerFragment_OnSignaturePickedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.signatures.SignaturePickerFragment.OnSignaturePickedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDismiss:()V:GetOnDismissHandler:PSPDFKit.UI.Signatures.SignaturePickerFragment/IOnSignaturePickedListenerInvoker, PSPDFKit.Android\n" +
			"n_onSignaturePicked:(Lcom/pspdfkit/signatures/Signature;)V:GetOnSignaturePicked_Lcom_pspdfkit_signatures_Signature_Handler:PSPDFKit.UI.Signatures.SignaturePickerFragment/IOnSignaturePickedListenerInvoker, PSPDFKit.Android\n" +
			"n_onSignatureCreated:(Lcom/pspdfkit/signatures/Signature;Z)V:GetOnSignatureCreated_Lcom_pspdfkit_signatures_Signature_ZHandler:PSPDFKit.UI.Signatures.SignaturePickerFragment.IOnSignaturePickedListener, PSPDFKit.Android\n" +
			"n_onSignatureUiDataCollected:(Lcom/pspdfkit/signatures/Signature;Lcom/pspdfkit/ui/signatures/SignaturePickerFragment$SignatureUiData;)V:GetOnSignatureUiDataCollected_Lcom_pspdfkit_signatures_Signature_Lcom_pspdfkit_ui_signatures_SignaturePickerFragment_SignatureUiData_Handler:PSPDFKit.UI.Signatures.SignaturePickerFragment.IOnSignaturePickedListener, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Signatures.SignaturePickerFragment+IOnSignaturePickedListenerImplementor, PSPDFKit.Android", SignaturePickerFragment_OnSignaturePickedListenerImplementor.class, __md_methods);
	}


	public SignaturePickerFragment_OnSignaturePickedListenerImplementor ()
	{
		super ();
		if (getClass () == SignaturePickerFragment_OnSignaturePickedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Signatures.SignaturePickerFragment+IOnSignaturePickedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDismiss ()
	{
		n_onDismiss ();
	}

	private native void n_onDismiss ();


	public void onSignaturePicked (com.pspdfkit.signatures.Signature p0)
	{
		n_onSignaturePicked (p0);
	}

	private native void n_onSignaturePicked (com.pspdfkit.signatures.Signature p0);


	public void onSignatureCreated (com.pspdfkit.signatures.Signature p0, boolean p1)
	{
		n_onSignatureCreated (p0, p1);
	}

	private native void n_onSignatureCreated (com.pspdfkit.signatures.Signature p0, boolean p1);


	public void onSignatureUiDataCollected (com.pspdfkit.signatures.Signature p0, com.pspdfkit.ui.signatures.SignaturePickerFragment.SignatureUiData p1)
	{
		n_onSignatureUiDataCollected (p0, p1);
	}

	private native void n_onSignatureUiDataCollected (com.pspdfkit.signatures.Signature p0, com.pspdfkit.ui.signatures.SignaturePickerFragment.SignatureUiData p1);

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
