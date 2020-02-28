package mono.com.pspdfkit.ui.dialog;


public class DocumentSharingDialog_SharingDialogListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.dialog.DocumentSharingDialog.SharingDialogListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAccept:(Lcom/pspdfkit/document/sharing/SharingOptions;)V:GetOnAccept_Lcom_pspdfkit_document_sharing_SharingOptions_Handler:PSPDFKit.UI.Dialog.DocumentSharingDialog/ISharingDialogListenerInvoker, PSPDFKit.Android\n" +
			"n_onDismiss:()V:GetOnDismissHandler:PSPDFKit.UI.Dialog.DocumentSharingDialog/ISharingDialogListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Dialog.DocumentSharingDialog+ISharingDialogListenerImplementor, PSPDFKit.Android", DocumentSharingDialog_SharingDialogListenerImplementor.class, __md_methods);
	}


	public DocumentSharingDialog_SharingDialogListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentSharingDialog_SharingDialogListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Dialog.DocumentSharingDialog+ISharingDialogListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAccept (com.pspdfkit.document.sharing.SharingOptions p0)
	{
		n_onAccept (p0);
	}

	private native void n_onAccept (com.pspdfkit.document.sharing.SharingOptions p0);


	public void onDismiss ()
	{
		n_onDismiss ();
	}

	private native void n_onDismiss ();

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
