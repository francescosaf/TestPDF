package mono.com.pdftron.pdf.controls;


public class UndoRedoPopupWindow_OnUndoRedoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.UndoRedoPopupWindow.OnUndoRedoListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUndoRedoCalled:()V:GetOnUndoRedoCalledHandler:pdftron.PDF.Controls.UndoRedoPopupWindow/IOnUndoRedoListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.UndoRedoPopupWindow+IOnUndoRedoListenerImplementor, PDFViewCtrlTools", UndoRedoPopupWindow_OnUndoRedoListenerImplementor.class, __md_methods);
	}


	public UndoRedoPopupWindow_OnUndoRedoListenerImplementor ()
	{
		super ();
		if (getClass () == UndoRedoPopupWindow_OnUndoRedoListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.UndoRedoPopupWindow+IOnUndoRedoListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onUndoRedoCalled ()
	{
		n_onUndoRedoCalled ();
	}

	private native void n_onUndoRedoCalled ();

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
