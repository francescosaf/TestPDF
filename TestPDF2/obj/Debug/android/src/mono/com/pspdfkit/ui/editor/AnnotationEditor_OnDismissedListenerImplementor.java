package mono.com.pspdfkit.ui.editor;


public class AnnotationEditor_OnDismissedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.editor.AnnotationEditor.OnDismissedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationEditorDismissed:(Lcom/pspdfkit/ui/editor/AnnotationEditor;Z)V:GetOnAnnotationEditorDismissed_Lcom_pspdfkit_ui_editor_AnnotationEditor_ZHandler:PSPDFKit.UI.Editor.AnnotationEditor/IOnDismissedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Editor.AnnotationEditor+IOnDismissedListenerImplementor, PSPDFKit.Android", AnnotationEditor_OnDismissedListenerImplementor.class, __md_methods);
	}


	public AnnotationEditor_OnDismissedListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationEditor_OnDismissedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Editor.AnnotationEditor+IOnDismissedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationEditorDismissed (com.pspdfkit.ui.editor.AnnotationEditor p0, boolean p1)
	{
		n_onAnnotationEditorDismissed (p0, p1);
	}

	private native void n_onAnnotationEditorDismissed (com.pspdfkit.ui.editor.AnnotationEditor p0, boolean p1);

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
