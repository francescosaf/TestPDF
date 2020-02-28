package mono.com.pspdfkit.forms;


public class FormListeners_OnFormFieldUpdatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.forms.FormListeners.OnFormFieldUpdatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFormFieldReset:(Lcom/pspdfkit/forms/FormField;Lcom/pspdfkit/forms/FormElement;)V:GetOnFormFieldReset_Lcom_pspdfkit_forms_FormField_Lcom_pspdfkit_forms_FormElement_Handler:PSPDFKit.Forms.IFormListenersOnFormFieldUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"n_onFormFieldUpdated:(Lcom/pspdfkit/forms/FormField;)V:GetOnFormFieldUpdated_Lcom_pspdfkit_forms_FormField_Handler:PSPDFKit.Forms.IFormListenersOnFormFieldUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Forms.IFormListenersOnFormFieldUpdatedListenerImplementor, PSPDFKit.Android", FormListeners_OnFormFieldUpdatedListenerImplementor.class, __md_methods);
	}


	public FormListeners_OnFormFieldUpdatedListenerImplementor ()
	{
		super ();
		if (getClass () == FormListeners_OnFormFieldUpdatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Forms.IFormListenersOnFormFieldUpdatedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFormFieldReset (com.pspdfkit.forms.FormField p0, com.pspdfkit.forms.FormElement p1)
	{
		n_onFormFieldReset (p0, p1);
	}

	private native void n_onFormFieldReset (com.pspdfkit.forms.FormField p0, com.pspdfkit.forms.FormElement p1);


	public void onFormFieldUpdated (com.pspdfkit.forms.FormField p0)
	{
		n_onFormFieldUpdated (p0);
	}

	private native void n_onFormFieldUpdated (com.pspdfkit.forms.FormField p0);

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
