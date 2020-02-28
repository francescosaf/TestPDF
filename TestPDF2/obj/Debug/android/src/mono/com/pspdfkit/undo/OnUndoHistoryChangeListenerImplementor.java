package mono.com.pspdfkit.undo;


public class OnUndoHistoryChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.undo.OnUndoHistoryChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUndoHistoryChanged:(Lcom/pspdfkit/undo/UndoManager;)V:GetOnUndoHistoryChanged_Lcom_pspdfkit_undo_UndoManager_Handler:PSPDFKit.Undo.IOnUndoHistoryChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Undo.IOnUndoHistoryChangeListenerImplementor, PSPDFKit.Android", OnUndoHistoryChangeListenerImplementor.class, __md_methods);
	}


	public OnUndoHistoryChangeListenerImplementor ()
	{
		super ();
		if (getClass () == OnUndoHistoryChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Undo.IOnUndoHistoryChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onUndoHistoryChanged (com.pspdfkit.undo.UndoManager p0)
	{
		n_onUndoHistoryChanged (p0);
	}

	private native void n_onUndoHistoryChanged (com.pspdfkit.undo.UndoManager p0);

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
