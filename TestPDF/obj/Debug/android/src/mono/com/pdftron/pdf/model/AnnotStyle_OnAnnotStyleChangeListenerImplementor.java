package mono.com.pdftron.pdf.model;


public class AnnotStyle_OnAnnotStyleChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.model.AnnotStyle.OnAnnotStyleChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChangeAnnotFillColor:(I)V:GetOnChangeAnnotFillColor_IHandler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeAnnotFont:(Lcom/pdftron/pdf/model/FontResource;)V:GetOnChangeAnnotFont_Lcom_pdftron_pdf_model_FontResource_Handler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeAnnotIcon:(Ljava/lang/String;)V:GetOnChangeAnnotIcon_Ljava_lang_String_Handler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeAnnotOpacity:(FZ)V:GetOnChangeAnnotOpacity_FZHandler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeAnnotStrokeColor:(I)V:GetOnChangeAnnotStrokeColor_IHandler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeAnnotTextColor:(I)V:GetOnChangeAnnotTextColor_IHandler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeAnnotTextSize:(FZ)V:GetOnChangeAnnotTextSize_FZHandler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeAnnotThickness:(FZ)V:GetOnChangeAnnotThickness_FZHandler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeOverlayText:(Ljava/lang/String;)V:GetOnChangeOverlayText_Ljava_lang_String_Handler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeRichContentEnabled:(Z)V:GetOnChangeRichContentEnabled_ZHandler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeRulerProperty:(Lcom/pdftron/pdf/model/RulerItem;)V:GetOnChangeRulerProperty_Lcom_pdftron_pdf_model_RulerItem_Handler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"n_onChangeSnapping:(Z)V:GetOnChangeSnapping_ZHandler:pdftron.PDF.Model.AnnotStyle/IOnAnnotStyleChangeListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Model.AnnotStyle+IOnAnnotStyleChangeListenerImplementor, PDFViewCtrlTools", AnnotStyle_OnAnnotStyleChangeListenerImplementor.class, __md_methods);
	}


	public AnnotStyle_OnAnnotStyleChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotStyle_OnAnnotStyleChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Model.AnnotStyle+IOnAnnotStyleChangeListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onChangeAnnotFillColor (int p0)
	{
		n_onChangeAnnotFillColor (p0);
	}

	private native void n_onChangeAnnotFillColor (int p0);


	public void onChangeAnnotFont (com.pdftron.pdf.model.FontResource p0)
	{
		n_onChangeAnnotFont (p0);
	}

	private native void n_onChangeAnnotFont (com.pdftron.pdf.model.FontResource p0);


	public void onChangeAnnotIcon (java.lang.String p0)
	{
		n_onChangeAnnotIcon (p0);
	}

	private native void n_onChangeAnnotIcon (java.lang.String p0);


	public void onChangeAnnotOpacity (float p0, boolean p1)
	{
		n_onChangeAnnotOpacity (p0, p1);
	}

	private native void n_onChangeAnnotOpacity (float p0, boolean p1);


	public void onChangeAnnotStrokeColor (int p0)
	{
		n_onChangeAnnotStrokeColor (p0);
	}

	private native void n_onChangeAnnotStrokeColor (int p0);


	public void onChangeAnnotTextColor (int p0)
	{
		n_onChangeAnnotTextColor (p0);
	}

	private native void n_onChangeAnnotTextColor (int p0);


	public void onChangeAnnotTextSize (float p0, boolean p1)
	{
		n_onChangeAnnotTextSize (p0, p1);
	}

	private native void n_onChangeAnnotTextSize (float p0, boolean p1);


	public void onChangeAnnotThickness (float p0, boolean p1)
	{
		n_onChangeAnnotThickness (p0, p1);
	}

	private native void n_onChangeAnnotThickness (float p0, boolean p1);


	public void onChangeOverlayText (java.lang.String p0)
	{
		n_onChangeOverlayText (p0);
	}

	private native void n_onChangeOverlayText (java.lang.String p0);


	public void onChangeRichContentEnabled (boolean p0)
	{
		n_onChangeRichContentEnabled (p0);
	}

	private native void n_onChangeRichContentEnabled (boolean p0);


	public void onChangeRulerProperty (com.pdftron.pdf.model.RulerItem p0)
	{
		n_onChangeRulerProperty (p0);
	}

	private native void n_onChangeRulerProperty (com.pdftron.pdf.model.RulerItem p0);


	public void onChangeSnapping (boolean p0)
	{
		n_onChangeSnapping (p0);
	}

	private native void n_onChangeSnapping (boolean p0);

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
