package mono.com.pspdfkit.ui.documentinfo;


public class OnDocumentInfoViewSaveListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.documentinfo.OnDocumentInfoViewSaveListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentInfoChangesSaved:(Lcom/pspdfkit/document/PdfDocument;)V:GetOnDocumentInfoChangesSaved_Lcom_pspdfkit_document_PdfDocument_Handler:PSPDFKit.UI.Documentinfo.IOnDocumentInfoViewSaveListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Documentinfo.IOnDocumentInfoViewSaveListenerImplementor, PSPDFKit.Android", OnDocumentInfoViewSaveListenerImplementor.class, __md_methods);
	}


	public OnDocumentInfoViewSaveListenerImplementor ()
	{
		super ();
		if (getClass () == OnDocumentInfoViewSaveListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Documentinfo.IOnDocumentInfoViewSaveListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDocumentInfoChangesSaved (com.pspdfkit.document.PdfDocument p0)
	{
		n_onDocumentInfoChangesSaved (p0);
	}

	private native void n_onDocumentInfoChangesSaved (com.pspdfkit.document.PdfDocument p0);

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
