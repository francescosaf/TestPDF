package mono.com.pspdfkit.ui.editor;


public class UnitSelectionEditText_UnitSelectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.editor.UnitSelectionEditText.UnitSelectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onValueSet:(Lcom/pspdfkit/ui/editor/UnitSelectionEditText;I)V:GetOnValueSet_Lcom_pspdfkit_ui_editor_UnitSelectionEditText_IHandler:PSPDFKit.UI.Editor.UnitSelectionEditText/IUnitSelectionListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Editor.UnitSelectionEditText+IUnitSelectionListenerImplementor, PSPDFKit.Android", UnitSelectionEditText_UnitSelectionListenerImplementor.class, __md_methods);
	}


	public UnitSelectionEditText_UnitSelectionListenerImplementor ()
	{
		super ();
		if (getClass () == UnitSelectionEditText_UnitSelectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Editor.UnitSelectionEditText+IUnitSelectionListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onValueSet (com.pspdfkit.ui.editor.UnitSelectionEditText p0, int p1)
	{
		n_onValueSet (p0, p1);
	}

	private native void n_onValueSet (com.pspdfkit.ui.editor.UnitSelectionEditText p0, int p1);

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
