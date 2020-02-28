package mono.com.pspdfkit.ui.inspector.views;


public class LineEndTypePickerInspectorView_LineEndTypePickerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.views.LineEndTypePickerInspectorView.LineEndTypePickerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLineEndTypePicked:(Lcom/pspdfkit/ui/inspector/views/LineEndTypePickerInspectorView;Lcom/pspdfkit/annotations/LineEndType;)V:GetOnLineEndTypePicked_Lcom_pspdfkit_ui_inspector_views_LineEndTypePickerInspectorView_Lcom_pspdfkit_annotations_LineEndType_Handler:PSPDFKit.UI.Inspector.Views.LineEndTypePickerInspectorView/ILineEndTypePickerListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.Views.LineEndTypePickerInspectorView+ILineEndTypePickerListenerImplementor, PSPDFKit.Android", LineEndTypePickerInspectorView_LineEndTypePickerListenerImplementor.class, __md_methods);
	}


	public LineEndTypePickerInspectorView_LineEndTypePickerListenerImplementor ()
	{
		super ();
		if (getClass () == LineEndTypePickerInspectorView_LineEndTypePickerListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.Views.LineEndTypePickerInspectorView+ILineEndTypePickerListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onLineEndTypePicked (com.pspdfkit.ui.inspector.views.LineEndTypePickerInspectorView p0, com.pspdfkit.annotations.LineEndType p1)
	{
		n_onLineEndTypePicked (p0, p1);
	}

	private native void n_onLineEndTypePicked (com.pspdfkit.ui.inspector.views.LineEndTypePickerInspectorView p0, com.pspdfkit.annotations.LineEndType p1);

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
