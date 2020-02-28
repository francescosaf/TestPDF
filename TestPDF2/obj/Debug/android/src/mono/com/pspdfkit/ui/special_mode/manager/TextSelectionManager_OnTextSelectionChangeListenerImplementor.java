package mono.com.pspdfkit.ui.special_mode.manager;


public class TextSelectionManager_OnTextSelectionChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.TextSelectionManager.OnTextSelectionChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAfterTextSelectionChange:(Lcom/pspdfkit/datastructures/TextSelection;Lcom/pspdfkit/datastructures/TextSelection;)V:GetOnAfterTextSelectionChange_Lcom_pspdfkit_datastructures_TextSelection_Lcom_pspdfkit_datastructures_TextSelection_Handler:PSPDFKit.UI.SpecialMode.Manager.ITextSelectionManagerOnTextSelectionChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onBeforeTextSelectionChange:(Lcom/pspdfkit/datastructures/TextSelection;Lcom/pspdfkit/datastructures/TextSelection;)Z:GetOnBeforeTextSelectionChange_Lcom_pspdfkit_datastructures_TextSelection_Lcom_pspdfkit_datastructures_TextSelection_Handler:PSPDFKit.UI.SpecialMode.Manager.ITextSelectionManagerOnTextSelectionChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.ITextSelectionManagerOnTextSelectionChangeListenerImplementor, PSPDFKit.Android", TextSelectionManager_OnTextSelectionChangeListenerImplementor.class, __md_methods);
	}


	public TextSelectionManager_OnTextSelectionChangeListenerImplementor ()
	{
		super ();
		if (getClass () == TextSelectionManager_OnTextSelectionChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.ITextSelectionManagerOnTextSelectionChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAfterTextSelectionChange (com.pspdfkit.datastructures.TextSelection p0, com.pspdfkit.datastructures.TextSelection p1)
	{
		n_onAfterTextSelectionChange (p0, p1);
	}

	private native void n_onAfterTextSelectionChange (com.pspdfkit.datastructures.TextSelection p0, com.pspdfkit.datastructures.TextSelection p1);


	public boolean onBeforeTextSelectionChange (com.pspdfkit.datastructures.TextSelection p0, com.pspdfkit.datastructures.TextSelection p1)
	{
		return n_onBeforeTextSelectionChange (p0, p1);
	}

	private native boolean n_onBeforeTextSelectionChange (com.pspdfkit.datastructures.TextSelection p0, com.pspdfkit.datastructures.TextSelection p1);

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
