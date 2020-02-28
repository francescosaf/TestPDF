package mono.com.pspdfkit.ui.inspector;


public class PropertyInspectorCoordinatorLayoutController_PropertyInspectorLifecycleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.PropertyInspectorCoordinatorLayoutController.PropertyInspectorLifecycleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDisplayPropertyInspector:(Lcom/pspdfkit/ui/inspector/PropertyInspector;)V:GetOnDisplayPropertyInspector_Lcom_pspdfkit_ui_inspector_PropertyInspector_Handler:PSPDFKit.UI.Inspector.IPropertyInspectorCoordinatorLayoutControllerPropertyInspectorLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"n_onPreparePropertyInspector:(Lcom/pspdfkit/ui/inspector/PropertyInspector;)V:GetOnPreparePropertyInspector_Lcom_pspdfkit_ui_inspector_PropertyInspector_Handler:PSPDFKit.UI.Inspector.IPropertyInspectorCoordinatorLayoutControllerPropertyInspectorLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"n_onRemovePropertyInspector:(Lcom/pspdfkit/ui/inspector/PropertyInspector;)V:GetOnRemovePropertyInspector_Lcom_pspdfkit_ui_inspector_PropertyInspector_Handler:PSPDFKit.UI.Inspector.IPropertyInspectorCoordinatorLayoutControllerPropertyInspectorLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.IPropertyInspectorCoordinatorLayoutControllerPropertyInspectorLifecycleListenerImplementor, PSPDFKit.Android", PropertyInspectorCoordinatorLayoutController_PropertyInspectorLifecycleListenerImplementor.class, __md_methods);
	}


	public PropertyInspectorCoordinatorLayoutController_PropertyInspectorLifecycleListenerImplementor ()
	{
		super ();
		if (getClass () == PropertyInspectorCoordinatorLayoutController_PropertyInspectorLifecycleListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.IPropertyInspectorCoordinatorLayoutControllerPropertyInspectorLifecycleListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDisplayPropertyInspector (com.pspdfkit.ui.inspector.PropertyInspector p0)
	{
		n_onDisplayPropertyInspector (p0);
	}

	private native void n_onDisplayPropertyInspector (com.pspdfkit.ui.inspector.PropertyInspector p0);


	public void onPreparePropertyInspector (com.pspdfkit.ui.inspector.PropertyInspector p0)
	{
		n_onPreparePropertyInspector (p0);
	}

	private native void n_onPreparePropertyInspector (com.pspdfkit.ui.inspector.PropertyInspector p0);


	public void onRemovePropertyInspector (com.pspdfkit.ui.inspector.PropertyInspector p0)
	{
		n_onRemovePropertyInspector (p0);
	}

	private native void n_onRemovePropertyInspector (com.pspdfkit.ui.inspector.PropertyInspector p0);

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
