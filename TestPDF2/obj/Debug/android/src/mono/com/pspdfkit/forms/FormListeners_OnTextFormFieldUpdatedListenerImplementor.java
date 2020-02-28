package mono.com.pspdfkit.forms;


public class FormListeners_OnTextFormFieldUpdatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.forms.FormListeners.OnTextFormFieldUpdatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMaxLengthChanged:(Lcom/pspdfkit/forms/TextFormField;Lcom/pspdfkit/forms/TextFormElement;I)V:GetOnMaxLengthChanged_Lcom_pspdfkit_forms_TextFormField_Lcom_pspdfkit_forms_TextFormElement_IHandler:PSPDFKit.Forms.IFormListenersOnTextFormFieldUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"n_onRichTextChanged:(Lcom/pspdfkit/forms/TextFormField;Lcom/pspdfkit/forms/TextFormElement;Ljava/lang/String;)V:GetOnRichTextChanged_Lcom_pspdfkit_forms_TextFormField_Lcom_pspdfkit_forms_TextFormElement_Ljava_lang_String_Handler:PSPDFKit.Forms.IFormListenersOnTextFormFieldUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"n_onTextChanged:(Lcom/pspdfkit/forms/TextFormField;Lcom/pspdfkit/forms/TextFormElement;Ljava/lang/String;)V:GetOnTextChanged_Lcom_pspdfkit_forms_TextFormField_Lcom_pspdfkit_forms_TextFormElement_Ljava_lang_String_Handler:PSPDFKit.Forms.IFormListenersOnTextFormFieldUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Forms.IFormListenersOnTextFormFieldUpdatedListenerImplementor, PSPDFKit.Android", FormListeners_OnTextFormFieldUpdatedListenerImplementor.class, __md_methods);
	}


	public FormListeners_OnTextFormFieldUpdatedListenerImplementor ()
	{
		super ();
		if (getClass () == FormListeners_OnTextFormFieldUpdatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Forms.IFormListenersOnTextFormFieldUpdatedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onMaxLengthChanged (com.pspdfkit.forms.TextFormField p0, com.pspdfkit.forms.TextFormElement p1, int p2)
	{
		n_onMaxLengthChanged (p0, p1, p2);
	}

	private native void n_onMaxLengthChanged (com.pspdfkit.forms.TextFormField p0, com.pspdfkit.forms.TextFormElement p1, int p2);


	public void onRichTextChanged (com.pspdfkit.forms.TextFormField p0, com.pspdfkit.forms.TextFormElement p1, java.lang.String p2)
	{
		n_onRichTextChanged (p0, p1, p2);
	}

	private native void n_onRichTextChanged (com.pspdfkit.forms.TextFormField p0, com.pspdfkit.forms.TextFormElement p1, java.lang.String p2);


	public void onTextChanged (com.pspdfkit.forms.TextFormField p0, com.pspdfkit.forms.TextFormElement p1, java.lang.String p2)
	{
		n_onTextChanged (p0, p1, p2);
	}

	private native void n_onTextChanged (com.pspdfkit.forms.TextFormField p0, com.pspdfkit.forms.TextFormElement p1, java.lang.String p2);

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
