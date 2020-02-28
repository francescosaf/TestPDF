package mono.com.pspdfkit.document.sharing;


public class DocumentSharingProviderProcessor_PdfProcessorProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.document.sharing.DocumentSharingProviderProcessor.PdfProcessorProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProcessorProgress:(Lcom/pspdfkit/document/processor/PdfProcessor$ProcessorProgress;)V:GetOnProcessorProgress_Lcom_pspdfkit_document_processor_PdfProcessor_ProcessorProgress_Handler:PSPDFKit.Document.Sharing.DocumentSharingProviderProcessor/IPdfProcessorProgressListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Document.Sharing.DocumentSharingProviderProcessor+IPdfProcessorProgressListenerImplementor, PSPDFKit.Android", DocumentSharingProviderProcessor_PdfProcessorProgressListenerImplementor.class, __md_methods);
	}


	public DocumentSharingProviderProcessor_PdfProcessorProgressListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentSharingProviderProcessor_PdfProcessorProgressListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Document.Sharing.DocumentSharingProviderProcessor+IPdfProcessorProgressListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onProcessorProgress (com.pspdfkit.document.processor.PdfProcessor.ProcessorProgress p0)
	{
		n_onProcessorProgress (p0);
	}

	private native void n_onProcessorProgress (com.pspdfkit.document.processor.PdfProcessor.ProcessorProgress p0);

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
