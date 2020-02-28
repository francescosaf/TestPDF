package mono.com.pdftron.pdf.controls;


public class ReflowControl_OnPostProcessColorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.ReflowControl.OnPostProcessColorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getPostProcessedColor:(Lcom/pdftron/pdf/ColorPt;)Lcom/pdftron/pdf/ColorPt;:GetGetPostProcessedColor_Lcom_pdftron_pdf_ColorPt_Handler:pdftron.PDF.Controls.NativeReflowControl/IOnPostProcessColorListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.NativeReflowControl+IOnPostProcessColorListenerImplementor, PDFViewCtrlTools", ReflowControl_OnPostProcessColorListenerImplementor.class, __md_methods);
	}


	public ReflowControl_OnPostProcessColorListenerImplementor ()
	{
		super ();
		if (getClass () == ReflowControl_OnPostProcessColorListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.NativeReflowControl+IOnPostProcessColorListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public com.pdftron.pdf.ColorPt getPostProcessedColor (com.pdftron.pdf.ColorPt p0)
	{
		return n_getPostProcessedColor (p0);
	}

	private native com.pdftron.pdf.ColorPt n_getPostProcessedColor (com.pdftron.pdf.ColorPt p0);

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
