package mono.com.pspdfkit.ui.inspector.views;


public class FontPickerInspectorView_FontPickerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.inspector.views.FontPickerInspectorView.FontPickerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFontSelected:(Lcom/pspdfkit/ui/fonts/Font;)V:GetOnFontSelected_Lcom_pspdfkit_ui_fonts_Font_Handler:PSPDFKit.UI.Inspector.Views.FontPickerInspectorView/IFontPickerListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Inspector.Views.FontPickerInspectorView+IFontPickerListenerImplementor, PSPDFKit.Android", FontPickerInspectorView_FontPickerListenerImplementor.class, __md_methods);
	}


	public FontPickerInspectorView_FontPickerListenerImplementor ()
	{
		super ();
		if (getClass () == FontPickerInspectorView_FontPickerListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Inspector.Views.FontPickerInspectorView+IFontPickerListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFontSelected (com.pspdfkit.ui.fonts.Font p0)
	{
		n_onFontSelected (p0);
	}

	private native void n_onFontSelected (com.pspdfkit.ui.fonts.Font p0);

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
