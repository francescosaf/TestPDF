package mono.com.pspdfkit.forms;


public class FormListeners_OnFormTabOrderUpdatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.forms.FormListeners.OnFormTabOrderUpdatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFormTabOrderUpdated:()V:GetOnFormTabOrderUpdatedHandler:PSPDFKit.Forms.IFormListenersOnFormTabOrderUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Forms.IFormListenersOnFormTabOrderUpdatedListenerImplementor, PSPDFKit.Android", FormListeners_OnFormTabOrderUpdatedListenerImplementor.class, __md_methods);
	}


	public FormListeners_OnFormTabOrderUpdatedListenerImplementor ()
	{
		super ();
		if (getClass () == FormListeners_OnFormTabOrderUpdatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Forms.IFormListenersOnFormTabOrderUpdatedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFormTabOrderUpdated ()
	{
		n_onFormTabOrderUpdated ();
	}

	private native void n_onFormTabOrderUpdated ();

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
