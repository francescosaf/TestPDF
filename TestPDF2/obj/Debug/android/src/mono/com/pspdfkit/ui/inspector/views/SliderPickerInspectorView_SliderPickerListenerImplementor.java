package mono.com.pspdfkit.ui.inspector.views;


public class SliderPickerInspectorView_SliderPickerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.views.SliderPickerInspectorView.SliderPickerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onValuePicked:(Lcom/pspdfkit/ui/inspector/views/SliderPickerInspectorView;I)V:GetOnValuePicked_Lcom_pspdfkit_ui_inspector_views_SliderPickerInspectorView_IHandler:PSPDFKit.UI.Inspector.Views.SliderPickerInspectorView/ISliderPickerListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.Views.SliderPickerInspectorView+ISliderPickerListenerImplementor, PSPDFKit.Android", SliderPickerInspectorView_SliderPickerListenerImplementor.class, __md_methods);
	}


	public SliderPickerInspectorView_SliderPickerListenerImplementor ()
	{
		super ();
		if (getClass () == SliderPickerInspectorView_SliderPickerListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.Views.SliderPickerInspectorView+ISliderPickerListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onValuePicked (com.pspdfkit.ui.inspector.views.SliderPickerInspectorView p0, int p1)
	{
		n_onValuePicked (p0, p1);
	}

	private native void n_onValuePicked (com.pspdfkit.ui.inspector.views.SliderPickerInspectorView p0, int p1);

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
