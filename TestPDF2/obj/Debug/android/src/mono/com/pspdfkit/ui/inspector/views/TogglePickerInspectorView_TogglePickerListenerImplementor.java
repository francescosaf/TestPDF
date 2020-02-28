package mono.com.pspdfkit.ui.inspector.views;


public class TogglePickerInspectorView_TogglePickerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.views.TogglePickerInspectorView.TogglePickerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelectionChanged:(Lcom/pspdfkit/ui/inspector/views/TogglePickerInspectorView;Z)V:GetOnSelectionChanged_Lcom_pspdfkit_ui_inspector_views_TogglePickerInspectorView_ZHandler:PSPDFKit.UI.Inspector.Views.TogglePickerInspectorView/ITogglePickerListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.Views.TogglePickerInspectorView+ITogglePickerListenerImplementor, PSPDFKit.Android", TogglePickerInspectorView_TogglePickerListenerImplementor.class, __md_methods);
	}


	public TogglePickerInspectorView_TogglePickerListenerImplementor ()
	{
		super ();
		if (getClass () == TogglePickerInspectorView_TogglePickerListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.Views.TogglePickerInspectorView+ITogglePickerListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onSelectionChanged (com.pspdfkit.ui.inspector.views.TogglePickerInspectorView p0, boolean p1)
	{
		n_onSelectionChanged (p0, p1);
	}

	private native void n_onSelectionChanged (com.pspdfkit.ui.inspector.views.TogglePickerInspectorView p0, boolean p1);

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
