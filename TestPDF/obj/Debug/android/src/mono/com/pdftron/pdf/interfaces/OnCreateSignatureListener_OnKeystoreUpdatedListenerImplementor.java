package mono.com.pdftron.pdf.interfaces;


public class OnCreateSignatureListener_OnKeystoreUpdatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.interfaces.OnCreateSignatureListener.OnKeystoreUpdatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onKeystoreFileUpdated:(Landroid/net/Uri;)V:GetOnKeystoreFileUpdated_Landroid_net_Uri_Handler:pdftron.PDF.Interfaces.IOnCreateSignatureListenerOnKeystoreUpdatedListenerInvoker, PDFViewCtrlTools\n" +
			"n_onKeystorePasswordUpdated:(Ljava/lang/String;)V:GetOnKeystorePasswordUpdated_Ljava_lang_String_Handler:pdftron.PDF.Interfaces.IOnCreateSignatureListenerOnKeystoreUpdatedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Interfaces.IOnCreateSignatureListenerOnKeystoreUpdatedListenerImplementor, PDFViewCtrlTools", OnCreateSignatureListener_OnKeystoreUpdatedListenerImplementor.class, __md_methods);
	}


	public OnCreateSignatureListener_OnKeystoreUpdatedListenerImplementor ()
	{
		super ();
		if (getClass () == OnCreateSignatureListener_OnKeystoreUpdatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Interfaces.IOnCreateSignatureListenerOnKeystoreUpdatedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onKeystoreFileUpdated (android.net.Uri p0)
	{
		n_onKeystoreFileUpdated (p0);
	}

	private native void n_onKeystoreFileUpdated (android.net.Uri p0);


	public void onKeystorePasswordUpdated (java.lang.String p0)
	{
		n_onKeystorePasswordUpdated (p0);
	}

	private native void n_onKeystorePasswordUpdated (java.lang.String p0);

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
