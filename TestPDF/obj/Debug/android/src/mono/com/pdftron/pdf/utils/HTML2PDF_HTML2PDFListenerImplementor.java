package mono.com.pdftron.pdf.utils;


public class HTML2PDF_HTML2PDFListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.utils.HTML2PDF.HTML2PDFListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConversionFailed:(Ljava/lang/String;)V:GetOnConversionFailed_Ljava_lang_String_Handler:pdftron.PDF.Tools.Utils.HTML2PDF/IHTML2PDFListenerInvoker, PDFViewCtrlTools\n" +
			"n_onConversionFinished:(Ljava/lang/String;Z)V:GetOnConversionFinished_Ljava_lang_String_ZHandler:pdftron.PDF.Tools.Utils.HTML2PDF/IHTML2PDFListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.Utils.HTML2PDF+IHTML2PDFListenerImplementor, PDFViewCtrlTools", HTML2PDF_HTML2PDFListenerImplementor.class, __md_methods);
	}


	public HTML2PDF_HTML2PDFListenerImplementor ()
	{
		super ();
		if (getClass () == HTML2PDF_HTML2PDFListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.Utils.HTML2PDF+IHTML2PDFListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onConversionFailed (java.lang.String p0)
	{
		n_onConversionFailed (p0);
	}

	private native void n_onConversionFailed (java.lang.String p0);


	public void onConversionFinished (java.lang.String p0, boolean p1)
	{
		n_onConversionFinished (p0, p1);
	}

	private native void n_onConversionFinished (java.lang.String p0, boolean p1);

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
