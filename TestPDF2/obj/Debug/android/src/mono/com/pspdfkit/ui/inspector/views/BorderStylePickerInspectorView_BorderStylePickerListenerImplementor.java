package mono.com.pspdfkit.ui.inspector.views;


public class BorderStylePickerInspectorView_BorderStylePickerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.views.BorderStylePickerInspectorView.BorderStylePickerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBorderStylePicked:(Lcom/pspdfkit/ui/inspector/views/BorderStylePickerInspectorView;Lcom/pspdfkit/ui/inspector/views/BorderStylePreset;)V:GetOnBorderStylePicked_Lcom_pspdfkit_ui_inspector_views_BorderStylePickerInspectorView_Lcom_pspdfkit_ui_inspector_views_BorderStylePreset_Handler:PSPDFKit.UI.Inspector.Views.BorderStylePickerInspectorView/IBorderStylePickerListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.Views.BorderStylePickerInspectorView+IBorderStylePickerListenerImplementor, PSPDFKit.Android", BorderStylePickerInspectorView_BorderStylePickerListenerImplementor.class, __md_methods);
	}


	public BorderStylePickerInspectorView_BorderStylePickerListenerImplementor ()
	{
		super ();
		if (getClass () == BorderStylePickerInspectorView_BorderStylePickerListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.Views.BorderStylePickerInspectorView+IBorderStylePickerListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onBorderStylePicked (com.pspdfkit.ui.inspector.views.BorderStylePickerInspectorView p0, com.pspdfkit.ui.inspector.views.BorderStylePreset p1)
	{
		n_onBorderStylePicked (p0, p1);
	}

	private native void n_onBorderStylePicked (com.pspdfkit.ui.inspector.views.BorderStylePickerInspectorView p0, com.pspdfkit.ui.inspector.views.BorderStylePreset p1);

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
