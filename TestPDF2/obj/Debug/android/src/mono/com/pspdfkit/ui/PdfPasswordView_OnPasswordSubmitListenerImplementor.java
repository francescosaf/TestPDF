package mono.com.pspdfkit.ui;


public class PdfPasswordView_OnPasswordSubmitListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.PdfPasswordView.OnPasswordSubmitListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPasswordSubmit:(Lcom/pspdfkit/ui/PdfPasswordView;Ljava/lang/String;)V:GetOnPasswordSubmit_Lcom_pspdfkit_ui_PdfPasswordView_Ljava_lang_String_Handler:PSPDFKit.UI.PdfPasswordView/IOnPasswordSubmitListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.PdfPasswordView+IOnPasswordSubmitListenerImplementor, PSPDFKit.Android", PdfPasswordView_OnPasswordSubmitListenerImplementor.class, __md_methods);
	}


	public PdfPasswordView_OnPasswordSubmitListenerImplementor ()
	{
		super ();
		if (getClass () == PdfPasswordView_OnPasswordSubmitListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.PdfPasswordView+IOnPasswordSubmitListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onPasswordSubmit (com.pspdfkit.ui.PdfPasswordView p0, java.lang.String p1)
	{
		n_onPasswordSubmit (p0, p1);
	}

	private native void n_onPasswordSubmit (com.pspdfkit.ui.PdfPasswordView p0, java.lang.String p1);

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
