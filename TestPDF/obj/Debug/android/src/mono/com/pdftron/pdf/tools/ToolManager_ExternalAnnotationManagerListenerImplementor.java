package mono.com.pdftron.pdf.tools;


public class ToolManager_ExternalAnnotationManagerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.ExternalAnnotationManagerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGenerateKey:()Ljava/lang/String;:GetOnGenerateKeyHandler:pdftron.PDF.Tools.ToolManager/IExternalAnnotationManagerListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IExternalAnnotationManagerListenerImplementor, PDFViewCtrlTools", ToolManager_ExternalAnnotationManagerListenerImplementor.class, __md_methods);
	}


	public ToolManager_ExternalAnnotationManagerListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_ExternalAnnotationManagerListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IExternalAnnotationManagerListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public java.lang.String onGenerateKey ()
	{
		return n_onGenerateKey ();
	}

	private native java.lang.String n_onGenerateKey ();

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
