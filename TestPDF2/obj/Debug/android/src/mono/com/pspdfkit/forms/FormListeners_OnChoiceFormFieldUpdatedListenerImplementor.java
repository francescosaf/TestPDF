package mono.com.pspdfkit.forms;


public class FormListeners_OnChoiceFormFieldUpdatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.forms.FormListeners.OnChoiceFormFieldUpdatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCustomOptionSet:(Lcom/pspdfkit/forms/ChoiceFormField;Lcom/pspdfkit/forms/ChoiceFormElement;Ljava/lang/String;)V:GetOnCustomOptionSet_Lcom_pspdfkit_forms_ChoiceFormField_Lcom_pspdfkit_forms_ChoiceFormElement_Ljava_lang_String_Handler:PSPDFKit.Forms.IFormListenersOnChoiceFormFieldUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"n_onOptionSelected:(Lcom/pspdfkit/forms/ChoiceFormField;Lcom/pspdfkit/forms/ChoiceFormElement;Ljava/util/List;)V:GetOnOptionSelected_Lcom_pspdfkit_forms_ChoiceFormField_Lcom_pspdfkit_forms_ChoiceFormElement_Ljava_util_List_Handler:PSPDFKit.Forms.IFormListenersOnChoiceFormFieldUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Forms.IFormListenersOnChoiceFormFieldUpdatedListenerImplementor, PSPDFKit.Android", FormListeners_OnChoiceFormFieldUpdatedListenerImplementor.class, __md_methods);
	}


	public FormListeners_OnChoiceFormFieldUpdatedListenerImplementor ()
	{
		super ();
		if (getClass () == FormListeners_OnChoiceFormFieldUpdatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Forms.IFormListenersOnChoiceFormFieldUpdatedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCustomOptionSet (com.pspdfkit.forms.ChoiceFormField p0, com.pspdfkit.forms.ChoiceFormElement p1, java.lang.String p2)
	{
		n_onCustomOptionSet (p0, p1, p2);
	}

	private native void n_onCustomOptionSet (com.pspdfkit.forms.ChoiceFormField p0, com.pspdfkit.forms.ChoiceFormElement p1, java.lang.String p2);


	public void onOptionSelected (com.pspdfkit.forms.ChoiceFormField p0, com.pspdfkit.forms.ChoiceFormElement p1, java.util.List p2)
	{
		n_onOptionSelected (p0, p1, p2);
	}

	private native void n_onOptionSelected (com.pspdfkit.forms.ChoiceFormField p0, com.pspdfkit.forms.ChoiceFormElement p1, java.util.List p2);

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
