package mono.com.pspdfkit.ui.inspector.views;


public class TextInputInspectorView_TextInputListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.views.TextInputInspectorView.TextInputListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onValuePicked:(Lcom/pspdfkit/ui/inspector/views/TextInputInspectorView;Ljava/lang/String;)V:GetOnValuePicked_Lcom_pspdfkit_ui_inspector_views_TextInputInspectorView_Ljava_lang_String_Handler:PSPDFKit.UI.Inspector.Views.TextInputInspectorView/ITextInputListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.Views.TextInputInspectorView+ITextInputListenerImplementor, PSPDFKit.Android", TextInputInspectorView_TextInputListenerImplementor.class, __md_methods);
	}


	public TextInputInspectorView_TextInputListenerImplementor ()
	{
		super ();
		if (getClass () == TextInputInspectorView_TextInputListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.Views.TextInputInspectorView+ITextInputListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onValuePicked (com.pspdfkit.ui.inspector.views.TextInputInspectorView p0, java.lang.String p1)
	{
		n_onValuePicked (p0, p1);
	}

	private native void n_onValuePicked (com.pspdfkit.ui.inspector.views.TextInputInspectorView p0, java.lang.String p1);

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
