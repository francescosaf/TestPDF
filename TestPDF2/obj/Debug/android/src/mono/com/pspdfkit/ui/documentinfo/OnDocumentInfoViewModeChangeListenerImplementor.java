package mono.com.pspdfkit.ui.documentinfo;


public class OnDocumentInfoViewModeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.documentinfo.OnDocumentInfoViewModeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentInfoViewEditingModeEnter:()Z:GetOnDocumentInfoViewEditingModeEnterHandler:PSPDFKit.UI.Documentinfo.IOnDocumentInfoViewModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onDocumentInfoViewEditingModeExit:()Z:GetOnDocumentInfoViewEditingModeExitHandler:PSPDFKit.UI.Documentinfo.IOnDocumentInfoViewModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Documentinfo.IOnDocumentInfoViewModeChangeListenerImplementor, PSPDFKit.Android", OnDocumentInfoViewModeChangeListenerImplementor.class, __md_methods);
	}


	public OnDocumentInfoViewModeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == OnDocumentInfoViewModeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Documentinfo.IOnDocumentInfoViewModeChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onDocumentInfoViewEditingModeEnter ()
	{
		return n_onDocumentInfoViewEditingModeEnter ();
	}

	private native boolean n_onDocumentInfoViewEditingModeEnter ();


	public boolean onDocumentInfoViewEditingModeExit ()
	{
		return n_onDocumentInfoViewEditingModeExit ();
	}

	private native boolean n_onDocumentInfoViewEditingModeExit ();

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
