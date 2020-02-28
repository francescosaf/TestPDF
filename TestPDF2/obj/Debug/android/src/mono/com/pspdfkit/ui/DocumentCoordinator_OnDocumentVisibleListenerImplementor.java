package mono.com.pspdfkit.ui;


public class DocumentCoordinator_OnDocumentVisibleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.DocumentCoordinator.OnDocumentVisibleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentVisible:(Lcom/pspdfkit/ui/DocumentDescriptor;)V:GetOnDocumentVisible_Lcom_pspdfkit_ui_DocumentDescriptor_Handler:PSPDFKit.UI.IDocumentCoordinatorOnDocumentVisibleListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.IDocumentCoordinatorOnDocumentVisibleListenerImplementor, PSPDFKit.Android", DocumentCoordinator_OnDocumentVisibleListenerImplementor.class, __md_methods);
	}


	public DocumentCoordinator_OnDocumentVisibleListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentCoordinator_OnDocumentVisibleListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.IDocumentCoordinatorOnDocumentVisibleListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDocumentVisible (com.pspdfkit.ui.DocumentDescriptor p0)
	{
		n_onDocumentVisible (p0);
	}

	private native void n_onDocumentVisible (com.pspdfkit.ui.DocumentDescriptor p0);

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
