package mono.com.pspdfkit.ui.inspector.views;


public class ZIndexInspectorView_ZIndexChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.views.ZIndexInspectorView.ZIndexChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMoveExecuted:(Lcom/pspdfkit/ui/inspector/views/ZIndexInspectorView;Lcom/pspdfkit/annotations/AnnotationZIndexMove;)V:GetOnMoveExecuted_Lcom_pspdfkit_ui_inspector_views_ZIndexInspectorView_Lcom_pspdfkit_annotations_AnnotationZIndexMove_Handler:PSPDFKit.UI.Inspector.Views.ZIndexInspectorView/IZIndexChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.Views.ZIndexInspectorView+IZIndexChangeListenerImplementor, PSPDFKit.Android", ZIndexInspectorView_ZIndexChangeListenerImplementor.class, __md_methods);
	}


	public ZIndexInspectorView_ZIndexChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ZIndexInspectorView_ZIndexChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.Views.ZIndexInspectorView+IZIndexChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onMoveExecuted (com.pspdfkit.ui.inspector.views.ZIndexInspectorView p0, com.pspdfkit.annotations.AnnotationZIndexMove p1)
	{
		n_onMoveExecuted (p0, p1);
	}

	private native void n_onMoveExecuted (com.pspdfkit.ui.inspector.views.ZIndexInspectorView p0, com.pspdfkit.annotations.AnnotationZIndexMove p1);

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
