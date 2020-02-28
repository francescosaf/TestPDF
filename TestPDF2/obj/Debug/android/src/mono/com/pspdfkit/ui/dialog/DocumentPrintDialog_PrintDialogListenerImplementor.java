package mono.com.pspdfkit.ui.dialog;


public class DocumentPrintDialog_PrintDialogListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.dialog.DocumentPrintDialog.PrintDialogListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAccept:(Lcom/pspdfkit/document/printing/PrintOptions;)V:GetOnAccept_Lcom_pspdfkit_document_printing_PrintOptions_Handler:PSPDFKit.UI.Dialog.DocumentPrintDialog/IPrintDialogListenerInvoker, PSPDFKit.Android\n" +
			"n_onDismiss:()V:GetOnDismissHandler:PSPDFKit.UI.Dialog.DocumentPrintDialog/IPrintDialogListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Dialog.DocumentPrintDialog+IPrintDialogListenerImplementor, PSPDFKit.Android", DocumentPrintDialog_PrintDialogListenerImplementor.class, __md_methods);
	}


	public DocumentPrintDialog_PrintDialogListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentPrintDialog_PrintDialogListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Dialog.DocumentPrintDialog+IPrintDialogListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAccept (com.pspdfkit.document.printing.PrintOptions p0)
	{
		n_onAccept (p0);
	}

	private native void n_onAccept (com.pspdfkit.document.printing.PrintOptions p0);


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
