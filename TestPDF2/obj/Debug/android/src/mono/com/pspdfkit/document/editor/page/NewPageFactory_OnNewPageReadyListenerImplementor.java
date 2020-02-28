package mono.com.pspdfkit.document.editor.page;


public class NewPageFactory_OnNewPageReadyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.document.editor.page.NewPageFactory.OnNewPageReadyListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancelled:()V:GetOnCancelledHandler:PSPDFKit.Document.Editor.Page.INewPageFactoryOnNewPageReadyListenerInvoker, PSPDFKit.Android\n" +
			"n_onNewPageReady:(Lcom/pspdfkit/document/processor/NewPage;)V:GetOnNewPageReady_Lcom_pspdfkit_document_processor_NewPage_Handler:PSPDFKit.Document.Editor.Page.INewPageFactoryOnNewPageReadyListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Document.Editor.Page.INewPageFactoryOnNewPageReadyListenerImplementor, PSPDFKit.Android", NewPageFactory_OnNewPageReadyListenerImplementor.class, __md_methods);
	}


	public NewPageFactory_OnNewPageReadyListenerImplementor ()
	{
		super ();
		if (getClass () == NewPageFactory_OnNewPageReadyListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Document.Editor.Page.INewPageFactoryOnNewPageReadyListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCancelled ()
	{
		n_onCancelled ();
	}

	private native void n_onCancelled ();


	public void onNewPageReady (com.pspdfkit.document.processor.NewPage p0)
	{
		n_onNewPageReady (p0);
	}

	private native void n_onNewPageReady (com.pspdfkit.document.processor.NewPage p0);

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
