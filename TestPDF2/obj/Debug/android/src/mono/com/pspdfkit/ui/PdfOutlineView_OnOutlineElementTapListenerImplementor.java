package mono.com.pspdfkit.ui;


public class PdfOutlineView_OnOutlineElementTapListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.PdfOutlineView.OnOutlineElementTapListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onOutlineElementTap:(Lcom/pspdfkit/ui/PdfOutlineView;Lcom/pspdfkit/document/OutlineElement;)V:GetOnOutlineElementTap_Lcom_pspdfkit_ui_PdfOutlineView_Lcom_pspdfkit_document_OutlineElement_Handler:PSPDFKit.UI.PdfOutlineView/IOnOutlineElementTapListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.PdfOutlineView+IOnOutlineElementTapListenerImplementor, PSPDFKit.Android", PdfOutlineView_OnOutlineElementTapListenerImplementor.class, __md_methods);
	}


	public PdfOutlineView_OnOutlineElementTapListenerImplementor ()
	{
		super ();
		if (getClass () == PdfOutlineView_OnOutlineElementTapListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.PdfOutlineView+IOnOutlineElementTapListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onOutlineElementTap (com.pspdfkit.ui.PdfOutlineView p0, com.pspdfkit.document.OutlineElement p1)
	{
		n_onOutlineElementTap (p0, p1);
	}

	private native void n_onOutlineElementTap (com.pspdfkit.ui.PdfOutlineView p0, com.pspdfkit.document.OutlineElement p1);

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
