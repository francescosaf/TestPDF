package mono.com.pspdfkit.ui.forms;


public class FormEditingBar_OnFormEditingBarLifecycleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.forms.FormEditingBar.OnFormEditingBarLifecycleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDisplayFormEditingBar:(Lcom/pspdfkit/ui/forms/FormEditingBar;)V:GetOnDisplayFormEditingBar_Lcom_pspdfkit_ui_forms_FormEditingBar_Handler:PSPDFKit.UI.Forms.FormEditingBar/IOnFormEditingBarLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"n_onPrepareFormEditingBar:(Lcom/pspdfkit/ui/forms/FormEditingBar;)V:GetOnPrepareFormEditingBar_Lcom_pspdfkit_ui_forms_FormEditingBar_Handler:PSPDFKit.UI.Forms.FormEditingBar/IOnFormEditingBarLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"n_onRemoveFormEditingBar:(Lcom/pspdfkit/ui/forms/FormEditingBar;)V:GetOnRemoveFormEditingBar_Lcom_pspdfkit_ui_forms_FormEditingBar_Handler:PSPDFKit.UI.Forms.FormEditingBar/IOnFormEditingBarLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Forms.FormEditingBar+IOnFormEditingBarLifecycleListenerImplementor, PSPDFKit.Android", FormEditingBar_OnFormEditingBarLifecycleListenerImplementor.class, __md_methods);
	}


	public FormEditingBar_OnFormEditingBarLifecycleListenerImplementor ()
	{
		super ();
		if (getClass () == FormEditingBar_OnFormEditingBarLifecycleListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Forms.FormEditingBar+IOnFormEditingBarLifecycleListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDisplayFormEditingBar (com.pspdfkit.ui.forms.FormEditingBar p0)
	{
		n_onDisplayFormEditingBar (p0);
	}

	private native void n_onDisplayFormEditingBar (com.pspdfkit.ui.forms.FormEditingBar p0);


	public void onPrepareFormEditingBar (com.pspdfkit.ui.forms.FormEditingBar p0)
	{
		n_onPrepareFormEditingBar (p0);
	}

	private native void n_onPrepareFormEditingBar (com.pspdfkit.ui.forms.FormEditingBar p0);


	public void onRemoveFormEditingBar (com.pspdfkit.ui.forms.FormEditingBar p0)
	{
		n_onRemoveFormEditingBar (p0);
	}

	private native void n_onRemoveFormEditingBar (com.pspdfkit.ui.forms.FormEditingBar p0);

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
