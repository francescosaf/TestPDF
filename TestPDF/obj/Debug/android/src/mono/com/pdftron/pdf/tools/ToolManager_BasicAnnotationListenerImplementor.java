package mono.com.pdftron.pdf.tools;


public class ToolManager_BasicAnnotationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.BasicAnnotationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationSelected:(Lcom/pdftron/pdf/Annot;I)V:GetOnAnnotationSelected_Lcom_pdftron_pdf_Annot_IHandler:pdftron.PDF.Tools.ToolManager/IBasicAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onAnnotationUnselected:()V:GetOnAnnotationUnselectedHandler:pdftron.PDF.Tools.ToolManager/IBasicAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onInterceptAnnotationHandling:(Lcom/pdftron/pdf/Annot;Landroid/os/Bundle;Lcom/pdftron/pdf/tools/ToolManager$ToolMode;)Z:GetOnInterceptAnnotationHandling_Lcom_pdftron_pdf_Annot_Landroid_os_Bundle_Lcom_pdftron_pdf_tools_ToolManager_ToolMode_Handler:pdftron.PDF.Tools.ToolManager/IBasicAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"n_onInterceptDialog:(Landroid/app/AlertDialog;)Z:GetOnInterceptDialog_Landroid_app_AlertDialog_Handler:pdftron.PDF.Tools.ToolManager/IBasicAnnotationListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IBasicAnnotationListenerImplementor, PDFViewCtrlTools", ToolManager_BasicAnnotationListenerImplementor.class, __md_methods);
	}


	public ToolManager_BasicAnnotationListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_BasicAnnotationListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IBasicAnnotationListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationSelected (com.pdftron.pdf.Annot p0, int p1)
	{
		n_onAnnotationSelected (p0, p1);
	}

	private native void n_onAnnotationSelected (com.pdftron.pdf.Annot p0, int p1);


	public void onAnnotationUnselected ()
	{
		n_onAnnotationUnselected ();
	}

	private native void n_onAnnotationUnselected ();


	public boolean onInterceptAnnotationHandling (com.pdftron.pdf.Annot p0, android.os.Bundle p1, com.pdftron.pdf.tools.ToolManager.ToolMode p2)
	{
		return n_onInterceptAnnotationHandling (p0, p1, p2);
	}

	private native boolean n_onInterceptAnnotationHandling (com.pdftron.pdf.Annot p0, android.os.Bundle p1, com.pdftron.pdf.tools.ToolManager.ToolMode p2);


	public boolean onInterceptDialog (android.app.AlertDialog p0)
	{
		return n_onInterceptDialog (p0);
	}

	private native boolean n_onInterceptDialog (android.app.AlertDialog p0);

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
