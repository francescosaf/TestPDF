package mono.com.pspdfkit.listeners.scrolling;


public class DocumentScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.listeners.scrolling.DocumentScrollListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentScrolled:(Lcom/pspdfkit/ui/PdfFragment;IIIIII)V:GetOnDocumentScrolled_Lcom_pspdfkit_ui_PdfFragment_IIIIIIHandler:PSPDFKit.Listeners.Scrolling.IDocumentScrollListenerInvoker, PSPDFKit.Android\n" +
			"n_onScrollStateChanged:(Lcom/pspdfkit/ui/PdfFragment;Lcom/pspdfkit/listeners/scrolling/ScrollState;)V:GetOnScrollStateChanged_Lcom_pspdfkit_ui_PdfFragment_Lcom_pspdfkit_listeners_scrolling_ScrollState_Handler:PSPDFKit.Listeners.Scrolling.IDocumentScrollListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Listeners.Scrolling.IDocumentScrollListenerImplementor, PSPDFKit.Android", DocumentScrollListenerImplementor.class, __md_methods);
	}


	public DocumentScrollListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentScrollListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Listeners.Scrolling.IDocumentScrollListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDocumentScrolled (com.pspdfkit.ui.PdfFragment p0, int p1, int p2, int p3, int p4, int p5, int p6)
	{
		n_onDocumentScrolled (p0, p1, p2, p3, p4, p5, p6);
	}

	private native void n_onDocumentScrolled (com.pspdfkit.ui.PdfFragment p0, int p1, int p2, int p3, int p4, int p5, int p6);


	public void onScrollStateChanged (com.pspdfkit.ui.PdfFragment p0, com.pspdfkit.listeners.scrolling.ScrollState p1)
	{
		n_onScrollStateChanged (p0, p1);
	}

	private native void n_onScrollStateChanged (com.pspdfkit.ui.PdfFragment p0, com.pspdfkit.listeners.scrolling.ScrollState p1);

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
