package mono.com.pspdfkit.ui.special_mode.manager;


public class FormManager_OnFormElementSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.FormManager.OnFormElementSelectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFormElementSelected:(Lcom/pspdfkit/forms/FormElement;)V:GetOnFormElementSelected_Lcom_pspdfkit_forms_FormElement_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementSelectedListenerInvoker, PSPDFKit.Android\n" +
			"n_onPrepareFormElementSelection:(Lcom/pspdfkit/forms/FormElement;)Z:GetOnPrepareFormElementSelection_Lcom_pspdfkit_forms_FormElement_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementSelectedListener, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementSelectedListenerImplementor, PSPDFKit.Android", FormManager_OnFormElementSelectedListenerImplementor.class, __md_methods);
	}


	public FormManager_OnFormElementSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == FormManager_OnFormElementSelectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementSelectedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFormElementSelected (com.pspdfkit.forms.FormElement p0)
	{
		n_onFormElementSelected (p0);
	}

	private native void n_onFormElementSelected (com.pspdfkit.forms.FormElement p0);


	public boolean onPrepareFormElementSelection (com.pspdfkit.forms.FormElement p0)
	{
		return n_onPrepareFormElementSelection (p0);
	}

	private native boolean n_onPrepareFormElementSelection (com.pspdfkit.forms.FormElement p0);

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
