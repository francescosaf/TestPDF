package mono.com.pspdfkit.ui.special_mode.manager;


public class FormManager_OnFormElementClickedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.FormManager.OnFormElementClickedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFormElementClicked:(Lcom/pspdfkit/forms/FormElement;)Z:GetOnFormElementClicked_Lcom_pspdfkit_forms_FormElement_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementClickedListenerInvoker, PSPDFKit.Android\n" +
			"n_isFormElementClickable:(Lcom/pspdfkit/forms/FormElement;)Z:GetIsFormElementClickable_Lcom_pspdfkit_forms_FormElement_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementClickedListener, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementClickedListenerImplementor, PSPDFKit.Android", FormManager_OnFormElementClickedListenerImplementor.class, __md_methods);
	}


	public FormManager_OnFormElementClickedListenerImplementor ()
	{
		super ();
		if (getClass () == FormManager_OnFormElementClickedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementClickedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onFormElementClicked (com.pspdfkit.forms.FormElement p0)
	{
		return n_onFormElementClicked (p0);
	}

	private native boolean n_onFormElementClicked (com.pspdfkit.forms.FormElement p0);


	public boolean isFormElementClickable (com.pspdfkit.forms.FormElement p0)
	{
		return n_isFormElementClickable (p0);
	}

	private native boolean n_isFormElementClickable (com.pspdfkit.forms.FormElement p0);

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
