package mono.com.pspdfkit.ui.special_mode.manager;


public class FormManager_OnFormElementDeselectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.manager.FormManager.OnFormElementDeselectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFormElementDeselected:(Lcom/pspdfkit/forms/FormElement;Z)V:GetOnFormElementDeselected_Lcom_pspdfkit_forms_FormElement_ZHandler:PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementDeselectedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementDeselectedListenerImplementor, PSPDFKit.Android", FormManager_OnFormElementDeselectedListenerImplementor.class, __md_methods);
	}


	public FormManager_OnFormElementDeselectedListenerImplementor ()
	{
		super ();
		if (getClass () == FormManager_OnFormElementDeselectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Manager.IFormManagerOnFormElementDeselectedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFormElementDeselected (com.pspdfkit.forms.FormElement p0, boolean p1)
	{
		n_onFormElementDeselected (p0, p1);
	}

	private native void n_onFormElementDeselected (com.pspdfkit.forms.FormElement p0, boolean p1);

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
