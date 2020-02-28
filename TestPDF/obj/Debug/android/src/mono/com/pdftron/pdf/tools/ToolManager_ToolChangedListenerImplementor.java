package mono.com.pdftron.pdf.tools;


public class ToolManager_ToolChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.ToolChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_toolChanged:(Lcom/pdftron/pdf/tools/ToolManager$Tool;Lcom/pdftron/pdf/tools/ToolManager$Tool;)V:GetToolChanged_Lcom_pdftron_pdf_tools_ToolManager_Tool_Lcom_pdftron_pdf_tools_ToolManager_Tool_Handler:pdftron.PDF.Tools.ToolManager/IToolChangedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IToolChangedListenerImplementor, PDFViewCtrlTools", ToolManager_ToolChangedListenerImplementor.class, __md_methods);
	}


	public ToolManager_ToolChangedListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_ToolChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IToolChangedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void toolChanged (com.pdftron.pdf.tools.ToolManager.Tool p0, com.pdftron.pdf.tools.ToolManager.Tool p1)
	{
		n_toolChanged (p0, p1);
	}

	private native void n_toolChanged (com.pdftron.pdf.tools.ToolManager.Tool p0, com.pdftron.pdf.tools.ToolManager.Tool p1);

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
