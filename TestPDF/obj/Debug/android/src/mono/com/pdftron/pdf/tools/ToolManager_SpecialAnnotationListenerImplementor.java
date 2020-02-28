package mono.com.pdftron.pdf.tools;


public class ToolManager_SpecialAnnotationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.SpecialAnnotationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_defineTranslateSelected:(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/Boolean;)V:GetDefineTranslateSelected_Ljava_lang_String_Landroid_graphics_RectF_Ljava_lang_Boolean_Handler:pdftron.PDF.Tools.ToolManager/ISpecialAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+ISpecialAnnotationListenerImplementor, PDFViewCtrlTools", ToolManager_SpecialAnnotationListenerImplementor.class, __md_methods);
	}


	public ToolManager_SpecialAnnotationListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_SpecialAnnotationListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+ISpecialAnnotationListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void defineTranslateSelected (java.lang.String p0, android.graphics.RectF p1, java.lang.Boolean p2)
	{
		n_defineTranslateSelected (p0, p1, p2);
	}

	private native void n_defineTranslateSelected (java.lang.String p0, android.graphics.RectF p1, java.lang.Boolean p2);

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
