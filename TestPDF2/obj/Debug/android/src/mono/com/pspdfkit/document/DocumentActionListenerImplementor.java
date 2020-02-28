package mono.com.pspdfkit.document;


public class DocumentActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.document.DocumentActionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onExecuteAction:(Lcom/pspdfkit/annotations/actions/Action;)Z:GetOnExecuteAction_Lcom_pspdfkit_annotations_actions_Action_Handler:PSPDFKit.Document.IDocumentActionListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Document.IDocumentActionListenerImplementor, PSPDFKit.Android", DocumentActionListenerImplementor.class, __md_methods);
	}


	public DocumentActionListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentActionListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Document.IDocumentActionListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onExecuteAction (com.pspdfkit.annotations.actions.Action p0)
	{
		return n_onExecuteAction (p0);
	}

	private native boolean n_onExecuteAction (com.pspdfkit.annotations.actions.Action p0);

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
