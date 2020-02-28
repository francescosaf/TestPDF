package mono.com.pspdfkit.forms;


public class FormListeners_OnButtonFormFieldUpdatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.forms.FormListeners.OnButtonFormFieldUpdatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onButtonSelected:(Lcom/pspdfkit/forms/EditableButtonFormField;Lcom/pspdfkit/forms/EditableButtonFormElement;Z)V:GetOnButtonSelected_Lcom_pspdfkit_forms_EditableButtonFormField_Lcom_pspdfkit_forms_EditableButtonFormElement_ZHandler:PSPDFKit.Forms.IFormListenersOnButtonFormFieldUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Forms.IFormListenersOnButtonFormFieldUpdatedListenerImplementor, PSPDFKit.Android", FormListeners_OnButtonFormFieldUpdatedListenerImplementor.class, __md_methods);
	}


	public FormListeners_OnButtonFormFieldUpdatedListenerImplementor ()
	{
		super ();
		if (getClass () == FormListeners_OnButtonFormFieldUpdatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Forms.IFormListenersOnButtonFormFieldUpdatedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onButtonSelected (com.pspdfkit.forms.EditableButtonFormField p0, com.pspdfkit.forms.EditableButtonFormElement p1, boolean p2)
	{
		n_onButtonSelected (p0, p1, p2);
	}

	private native void n_onButtonSelected (com.pspdfkit.forms.EditableButtonFormField p0, com.pspdfkit.forms.EditableButtonFormElement p1, boolean p2);

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
