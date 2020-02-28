package mono.com.pdftron.pdf.controls;


public class AnnotStyleView_OnPresetSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.AnnotStyleView.OnPresetSelectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPresetDeselected:(Lcom/pdftron/pdf/model/AnnotStyle;)V:GetOnPresetDeselected_Lcom_pdftron_pdf_model_AnnotStyle_Handler:pdftron.PDF.Controls.AnnotStyleView/IOnPresetSelectedListenerInvoker, PDFViewCtrlTools\n" +
			"n_onPresetSelected:(Lcom/pdftron/pdf/model/AnnotStyle;)V:GetOnPresetSelected_Lcom_pdftron_pdf_model_AnnotStyle_Handler:pdftron.PDF.Controls.AnnotStyleView/IOnPresetSelectedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.AnnotStyleView+IOnPresetSelectedListenerImplementor, PDFViewCtrlTools", AnnotStyleView_OnPresetSelectedListenerImplementor.class, __md_methods);
	}


	public AnnotStyleView_OnPresetSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotStyleView_OnPresetSelectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.AnnotStyleView+IOnPresetSelectedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onPresetDeselected (com.pdftron.pdf.model.AnnotStyle p0)
	{
		n_onPresetDeselected (p0);
	}

	private native void n_onPresetDeselected (com.pdftron.pdf.model.AnnotStyle p0);


	public void onPresetSelected (com.pdftron.pdf.model.AnnotStyle p0)
	{
		n_onPresetSelected (p0);
	}

	private native void n_onPresetSelected (com.pdftron.pdf.model.AnnotStyle p0);

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
