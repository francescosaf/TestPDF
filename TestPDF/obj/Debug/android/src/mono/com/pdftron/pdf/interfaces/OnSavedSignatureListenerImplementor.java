package mono.com.pdftron.pdf.interfaces;


public class OnSavedSignatureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.interfaces.OnSavedSignatureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateSignatureClicked:()V:GetOnCreateSignatureClickedHandler:pdftron.PDF.Interfaces.IOnSavedSignatureListenerInvoker, PDFViewCtrlTools\n" +
			"n_onEditModeChanged:(Z)V:GetOnEditModeChanged_ZHandler:pdftron.PDF.Interfaces.IOnSavedSignatureListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSignatureSelected:(Ljava/lang/String;)V:GetOnSignatureSelected_Ljava_lang_String_Handler:pdftron.PDF.Interfaces.IOnSavedSignatureListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Interfaces.IOnSavedSignatureListenerImplementor, PDFViewCtrlTools", OnSavedSignatureListenerImplementor.class, __md_methods);
	}


	public OnSavedSignatureListenerImplementor ()
	{
		super ();
		if (getClass () == OnSavedSignatureListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Interfaces.IOnSavedSignatureListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onCreateSignatureClicked ()
	{
		n_onCreateSignatureClicked ();
	}

	private native void n_onCreateSignatureClicked ();


	public void onEditModeChanged (boolean p0)
	{
		n_onEditModeChanged (p0);
	}

	private native void n_onEditModeChanged (boolean p0);


	public void onSignatureSelected (java.lang.String p0)
	{
		n_onSignatureSelected (p0);
	}

	private native void n_onSignatureSelected (java.lang.String p0);

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
