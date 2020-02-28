package mono.com.pspdfkit.ui;


public class DocumentCoordinator_OnDocumentsChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.DocumentCoordinator.OnDocumentsChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentAdded:(Lcom/pspdfkit/ui/DocumentDescriptor;)V:GetOnDocumentAdded_Lcom_pspdfkit_ui_DocumentDescriptor_Handler:PSPDFKit.UI.IDocumentCoordinatorOnDocumentsChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentMoved:(Lcom/pspdfkit/ui/DocumentDescriptor;I)V:GetOnDocumentMoved_Lcom_pspdfkit_ui_DocumentDescriptor_IHandler:PSPDFKit.UI.IDocumentCoordinatorOnDocumentsChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentRemoved:(Lcom/pspdfkit/ui/DocumentDescriptor;)V:GetOnDocumentRemoved_Lcom_pspdfkit_ui_DocumentDescriptor_Handler:PSPDFKit.UI.IDocumentCoordinatorOnDocumentsChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentReplaced:(Lcom/pspdfkit/ui/DocumentDescriptor;Lcom/pspdfkit/ui/DocumentDescriptor;)V:GetOnDocumentReplaced_Lcom_pspdfkit_ui_DocumentDescriptor_Lcom_pspdfkit_ui_DocumentDescriptor_Handler:PSPDFKit.UI.IDocumentCoordinatorOnDocumentsChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentUpdated:(Lcom/pspdfkit/ui/DocumentDescriptor;)V:GetOnDocumentUpdated_Lcom_pspdfkit_ui_DocumentDescriptor_Handler:PSPDFKit.UI.IDocumentCoordinatorOnDocumentsChangedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.IDocumentCoordinatorOnDocumentsChangedListenerImplementor, PSPDFKit.Android", DocumentCoordinator_OnDocumentsChangedListenerImplementor.class, __md_methods);
	}


	public DocumentCoordinator_OnDocumentsChangedListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentCoordinator_OnDocumentsChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.IDocumentCoordinatorOnDocumentsChangedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDocumentAdded (com.pspdfkit.ui.DocumentDescriptor p0)
	{
		n_onDocumentAdded (p0);
	}

	private native void n_onDocumentAdded (com.pspdfkit.ui.DocumentDescriptor p0);


	public void onDocumentMoved (com.pspdfkit.ui.DocumentDescriptor p0, int p1)
	{
		n_onDocumentMoved (p0, p1);
	}

	private native void n_onDocumentMoved (com.pspdfkit.ui.DocumentDescriptor p0, int p1);


	public void onDocumentRemoved (com.pspdfkit.ui.DocumentDescriptor p0)
	{
		n_onDocumentRemoved (p0);
	}

	private native void n_onDocumentRemoved (com.pspdfkit.ui.DocumentDescriptor p0);


	public void onDocumentReplaced (com.pspdfkit.ui.DocumentDescriptor p0, com.pspdfkit.ui.DocumentDescriptor p1)
	{
		n_onDocumentReplaced (p0, p1);
	}

	private native void n_onDocumentReplaced (com.pspdfkit.ui.DocumentDescriptor p0, com.pspdfkit.ui.DocumentDescriptor p1);


	public void onDocumentUpdated (com.pspdfkit.ui.DocumentDescriptor p0)
	{
		n_onDocumentUpdated (p0);
	}

	private native void n_onDocumentUpdated (com.pspdfkit.ui.DocumentDescriptor p0);

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
