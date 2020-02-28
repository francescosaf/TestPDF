package mono.com.pspdfkit.ui.actionmenu;


public class SharingMenu_SharingMenuListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.actionmenu.SharingMenu.SharingMenuListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_performShare:(Lcom/pspdfkit/document/sharing/ShareTarget;)V:GetPerformShare_Lcom_pspdfkit_document_sharing_ShareTarget_Handler:PSPDFKit.UI.ActionMenuSdk.SharingMenu/ISharingMenuListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.ActionMenuSdk.SharingMenu+ISharingMenuListenerImplementor, PSPDFKit.Android", SharingMenu_SharingMenuListenerImplementor.class, __md_methods);
	}


	public SharingMenu_SharingMenuListenerImplementor ()
	{
		super ();
		if (getClass () == SharingMenu_SharingMenuListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.ActionMenuSdk.SharingMenu+ISharingMenuListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void performShare (com.pspdfkit.document.sharing.ShareTarget p0)
	{
		n_performShare (p0);
	}

	private native void n_performShare (com.pspdfkit.document.sharing.ShareTarget p0);

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
