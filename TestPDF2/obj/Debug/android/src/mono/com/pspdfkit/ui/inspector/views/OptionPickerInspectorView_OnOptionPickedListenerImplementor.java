package mono.com.pspdfkit.ui.inspector.views;


public class OptionPickerInspectorView_OnOptionPickedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.views.OptionPickerInspectorView.OnOptionPickedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCustomValueChanged:(Ljava/lang/String;)V:GetOnCustomValueChanged_Ljava_lang_String_Handler:PSPDFKit.UI.Inspector.Views.OptionPickerInspectorView/IOnOptionPickedListenerInvoker, PSPDFKit.Android\n" +
			"n_onOptionsSelected:(Lcom/pspdfkit/ui/inspector/views/OptionPickerInspectorView;Ljava/util/List;)V:GetOnOptionsSelected_Lcom_pspdfkit_ui_inspector_views_OptionPickerInspectorView_Ljava_util_List_Handler:PSPDFKit.UI.Inspector.Views.OptionPickerInspectorView/IOnOptionPickedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.Views.OptionPickerInspectorView+IOnOptionPickedListenerImplementor, PSPDFKit.Android", OptionPickerInspectorView_OnOptionPickedListenerImplementor.class, __md_methods);
	}


	public OptionPickerInspectorView_OnOptionPickedListenerImplementor ()
	{
		super ();
		if (getClass () == OptionPickerInspectorView_OnOptionPickedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.Views.OptionPickerInspectorView+IOnOptionPickedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCustomValueChanged (java.lang.String p0)
	{
		n_onCustomValueChanged (p0);
	}

	private native void n_onCustomValueChanged (java.lang.String p0);


	public void onOptionsSelected (com.pspdfkit.ui.inspector.views.OptionPickerInspectorView p0, java.util.List p1)
	{
		n_onOptionsSelected (p0, p1);
	}

	private native void n_onOptionsSelected (com.pspdfkit.ui.inspector.views.OptionPickerInspectorView p0, java.util.List p1);

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
