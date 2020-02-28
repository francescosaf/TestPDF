package mono.com.pspdfkit.ui.inspector.views;


public class ColorPickerInspectorView_ColorPickerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.views.ColorPickerInspectorView.ColorPickerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onColorPicked:(Lcom/pspdfkit/ui/inspector/PropertyInspectorView;I)V:GetOnColorPicked_Lcom_pspdfkit_ui_inspector_PropertyInspectorView_IHandler:PSPDFKit.UI.Inspector.Views.ColorPickerInspectorView/IColorPickerListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.Views.ColorPickerInspectorView+IColorPickerListenerImplementor, PSPDFKit.Android", ColorPickerInspectorView_ColorPickerListenerImplementor.class, __md_methods);
	}


	public ColorPickerInspectorView_ColorPickerListenerImplementor ()
	{
		super ();
		if (getClass () == ColorPickerInspectorView_ColorPickerListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.Views.ColorPickerInspectorView+IColorPickerListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onColorPicked (com.pspdfkit.ui.inspector.PropertyInspectorView p0, int p1)
	{
		n_onColorPicked (p0, p1);
	}

	private native void n_onColorPicked (com.pspdfkit.ui.inspector.PropertyInspectorView p0, int p1);

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
