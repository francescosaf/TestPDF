package mono.com.pdftron.pdf.dialog.menueditor;


public class MenuEditorDialogFragment_MenuEditorDialogFragmentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.dialog.menueditor.MenuEditorDialogFragment.MenuEditorDialogFragmentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMenuEditorDialogDismiss:()V:GetOnMenuEditorDialogDismissHandler:pdftron.PDF.Dialog.MenuEditor.MenuEditorDialogFragment/IMenuEditorDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Dialog.MenuEditor.MenuEditorDialogFragment+IMenuEditorDialogFragmentListenerImplementor, PDFViewCtrlTools", MenuEditorDialogFragment_MenuEditorDialogFragmentListenerImplementor.class, __md_methods);
	}


	public MenuEditorDialogFragment_MenuEditorDialogFragmentListenerImplementor ()
	{
		super ();
		if (getClass () == MenuEditorDialogFragment_MenuEditorDialogFragmentListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Dialog.MenuEditor.MenuEditorDialogFragment+IMenuEditorDialogFragmentListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onMenuEditorDialogDismiss ()
	{
		n_onMenuEditorDialogDismiss ();
	}

	private native void n_onMenuEditorDialogDismiss ();

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
