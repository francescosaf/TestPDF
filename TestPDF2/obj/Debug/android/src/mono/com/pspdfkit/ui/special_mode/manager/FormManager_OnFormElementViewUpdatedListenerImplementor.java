package mono.com.pspdfkit.ui.special_mode.manager;


public class FormManager_OnFormElementViewUpdatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.FormManager.OnFormElementViewUpdatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFormElementValidationFailed:(Lcom/pspdfkit/forms/FormElement;Ljava/lang/String;)V:GetOnFormElementValidationFailed_Lcom_pspdfkit_forms_FormElement_Ljava_lang_String_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementViewUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"n_onFormElementValidationSuccess:(Lcom/pspdfkit/forms/FormElement;)V:GetOnFormElementValidationSuccess_Lcom_pspdfkit_forms_FormElement_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementViewUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"n_onFormElementViewUpdated:(Lcom/pspdfkit/forms/FormElement;)V:GetOnFormElementViewUpdated_Lcom_pspdfkit_forms_FormElement_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementViewUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementViewUpdatedListenerImplementor, PSPDFKit.Android", FormManager_OnFormElementViewUpdatedListenerImplementor.class, __md_methods);
	}


	public FormManager_OnFormElementViewUpdatedListenerImplementor ()
	{
		super ();
		if (getClass () == FormManager_OnFormElementViewUpdatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementViewUpdatedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFormElementValidationFailed (com.pspdfkit.forms.FormElement p0, java.lang.String p1)
	{
		n_onFormElementValidationFailed (p0, p1);
	}

	private native void n_onFormElementValidationFailed (com.pspdfkit.forms.FormElement p0, java.lang.String p1);


	public void onFormElementValidationSuccess (com.pspdfkit.forms.FormElement p0)
	{
		n_onFormElementValidationSuccess (p0);
	}

	private native void n_onFormElementValidationSuccess (com.pspdfkit.forms.FormElement p0);


	public void onFormElementViewUpdated (com.pspdfkit.forms.FormElement p0)
	{
		n_onFormElementViewUpdated (p0);
	}

	private native void n_onFormElementViewUpdated (com.pspdfkit.forms.FormElement p0);

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
