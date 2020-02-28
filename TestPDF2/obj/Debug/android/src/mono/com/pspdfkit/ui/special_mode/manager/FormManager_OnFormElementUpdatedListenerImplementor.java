package mono.com.pspdfkit.ui.special_mode.manager;


public class FormManager_OnFormElementUpdatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.FormManager.OnFormElementUpdatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFormElementUpdated:(Lcom/pspdfkit/forms/FormElement;)V:GetOnFormElementUpdated_Lcom_pspdfkit_forms_FormElement_Handler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementUpdatedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementUpdatedListenerImplementor, PSPDFKit.Android", FormManager_OnFormElementUpdatedListenerImplementor.class, __md_methods);
	}


	public FormManager_OnFormElementUpdatedListenerImplementor ()
	{
		super ();
		if (getClass () == FormManager_OnFormElementUpdatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementUpdatedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFormElementUpdated (com.pspdfkit.forms.FormElement p0)
	{
		n_onFormElementUpdated (p0);
	}

	private native void n_onFormElementUpdated (com.pspdfkit.forms.FormElement p0);

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
