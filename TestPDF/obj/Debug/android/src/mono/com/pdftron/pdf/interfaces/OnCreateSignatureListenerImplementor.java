package mono.com.pdftron.pdf.interfaces;


public class OnCreateSignatureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.interfaces.OnCreateSignatureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotStyleDialogFragmentDismissed:(Lcom/pdftron/pdf/controls/AnnotStyleDialogFragment;)V:GetOnAnnotStyleDialogFragmentDismissed_Lcom_pdftron_pdf_controls_AnnotStyleDialogFragment_Handler:pdftron.PDF.Interfaces.IOnCreateSignatureListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSignatureCreated:(Ljava/lang/String;)V:GetOnSignatureCreated_Ljava_lang_String_Handler:pdftron.PDF.Interfaces.IOnCreateSignatureListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSignatureFromImage:(Landroid/graphics/PointF;ILjava/lang/Long;)V:GetOnSignatureFromImage_Landroid_graphics_PointF_ILjava_lang_Long_Handler:pdftron.PDF.Interfaces.IOnCreateSignatureListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Interfaces.IOnCreateSignatureListenerImplementor, PDFViewCtrlTools", OnCreateSignatureListenerImplementor.class, __md_methods);
	}


	public OnCreateSignatureListenerImplementor ()
	{
		super ();
		if (getClass () == OnCreateSignatureListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Interfaces.IOnCreateSignatureListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotStyleDialogFragmentDismissed (com.pdftron.pdf.controls.AnnotStyleDialogFragment p0)
	{
		n_onAnnotStyleDialogFragmentDismissed (p0);
	}

	private native void n_onAnnotStyleDialogFragmentDismissed (com.pdftron.pdf.controls.AnnotStyleDialogFragment p0);


	public void onSignatureCreated (java.lang.String p0)
	{
		n_onSignatureCreated (p0);
	}

	private native void n_onSignatureCreated (java.lang.String p0);


	public void onSignatureFromImage (android.graphics.PointF p0, int p1, java.lang.Long p2)
	{
		n_onSignatureFromImage (p0, p1, p2);
	}

	private native void n_onSignatureFromImage (android.graphics.PointF p0, int p1, java.lang.Long p2);

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
