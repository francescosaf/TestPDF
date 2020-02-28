package mono.com.pspdfkit.ui;


public class DocumentCoordinator_OnDocumentCoordinatorEmptyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.DocumentCoordinator.OnDocumentCoordinatorEmptyListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentCoordinatorEmpty:()V:GetOnDocumentCoordinatorEmptyHandler:PSPDFKit.UI.IDocumentCoordinatorOnDocumentCoordinatorEmptyListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.IDocumentCoordinatorOnDocumentCoordinatorEmptyListenerImplementor, PSPDFKit.Android", DocumentCoordinator_OnDocumentCoordinatorEmptyListenerImplementor.class, __md_methods);
	}


	public DocumentCoordinator_OnDocumentCoordinatorEmptyListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentCoordinator_OnDocumentCoordinatorEmptyListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.IDocumentCoordinatorOnDocumentCoordinatorEmptyListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDocumentCoordinatorEmpty ()
	{
		n_onDocumentCoordinatorEmpty ();
	}

	private native void n_onDocumentCoordinatorEmpty ();

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
