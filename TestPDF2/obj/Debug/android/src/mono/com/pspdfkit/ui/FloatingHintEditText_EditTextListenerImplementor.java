package mono.com.pspdfkit.ui;


public class FloatingHintEditText_EditTextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.FloatingHintEditText.EditTextListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_afterTextChanged:(Landroid/text/Editable;)V:GetAfterTextChanged_Landroid_text_Editable_Handler:PSPDFKit.UI.FloatingHintEditText/IEditTextListenerInvoker, PSPDFKit.Android\n" +
			"n_onErrorDismissed:()V:GetOnErrorDismissedHandler:PSPDFKit.UI.FloatingHintEditText/IEditTextListenerInvoker, PSPDFKit.Android\n" +
			"n_onKeyPress:(ILandroid/view/KeyEvent;)V:GetOnKeyPress_ILandroid_view_KeyEvent_Handler:PSPDFKit.UI.FloatingHintEditText/IEditTextListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.FloatingHintEditText+IEditTextListenerImplementor, PSPDFKit.Android", FloatingHintEditText_EditTextListenerImplementor.class, __md_methods);
	}


	public FloatingHintEditText_EditTextListenerImplementor ()
	{
		super ();
		if (getClass () == FloatingHintEditText_EditTextListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.FloatingHintEditText+IEditTextListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void afterTextChanged (android.text.Editable p0)
	{
		n_afterTextChanged (p0);
	}

	private native void n_afterTextChanged (android.text.Editable p0);


	public void onErrorDismissed ()
	{
		n_onErrorDismissed ();
	}

	private native void n_onErrorDismissed ();


	public void onKeyPress (int p0, android.view.KeyEvent p1)
	{
		n_onKeyPress (p0, p1);
	}

	private native void n_onKeyPress (int p0, android.view.KeyEvent p1);

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
