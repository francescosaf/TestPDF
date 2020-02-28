package mono.com.pspdfkit.ui.inspector;


public class PropertyInspector_OnCancelListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.PropertyInspector.OnCancelListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancel:(Lcom/pspdfkit/ui/inspector/PropertyInspector;)V:GetOnCancel_Lcom_pspdfkit_ui_inspector_PropertyInspector_Handler:PSPDFKit.UI.Inspector.PropertyInspector/IOnCancelListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.PropertyInspector+IOnCancelListenerImplementor, PSPDFKit.Android", PropertyInspector_OnCancelListenerImplementor.class, __md_methods);
	}


	public PropertyInspector_OnCancelListenerImplementor ()
	{
		super ();
		if (getClass () == PropertyInspector_OnCancelListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.PropertyInspector+IOnCancelListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCancel (com.pspdfkit.ui.inspector.PropertyInspector p0)
	{
		n_onCancel (p0);
	}

	private native void n_onCancel (com.pspdfkit.ui.inspector.PropertyInspector p0);

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
