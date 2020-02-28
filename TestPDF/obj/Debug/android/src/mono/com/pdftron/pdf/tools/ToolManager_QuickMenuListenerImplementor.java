package mono.com.pdftron.pdf.tools;


public class ToolManager_QuickMenuListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.QuickMenuListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onQuickMenuClicked:(Lcom/pdftron/pdf/tools/QuickMenuItem;)Z:GetOnQuickMenuClicked_Lcom_pdftron_pdf_tools_QuickMenuItem_Handler:pdftron.PDF.Tools.ToolManager/IQuickMenuListenerInvoker, PDFViewCtrlTools\n" +
			"n_onQuickMenuDismissed:()V:GetOnQuickMenuDismissedHandler:pdftron.PDF.Tools.ToolManager/IQuickMenuListenerInvoker, PDFViewCtrlTools\n" +
			"n_onQuickMenuShown:()V:GetOnQuickMenuShownHandler:pdftron.PDF.Tools.ToolManager/IQuickMenuListenerInvoker, PDFViewCtrlTools\n" +
			"n_onShowQuickMenu:(Lcom/pdftron/pdf/tools/QuickMenu;Lcom/pdftron/pdf/Annot;)Z:GetOnShowQuickMenu_Lcom_pdftron_pdf_tools_QuickMenu_Lcom_pdftron_pdf_Annot_Handler:pdftron.PDF.Tools.ToolManager/IQuickMenuListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IQuickMenuListenerImplementor, PDFViewCtrlTools", ToolManager_QuickMenuListenerImplementor.class, __md_methods);
	}


	public ToolManager_QuickMenuListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_QuickMenuListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IQuickMenuListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public boolean onQuickMenuClicked (com.pdftron.pdf.tools.QuickMenuItem p0)
	{
		return n_onQuickMenuClicked (p0);
	}

	private native boolean n_onQuickMenuClicked (com.pdftron.pdf.tools.QuickMenuItem p0);


	public void onQuickMenuDismissed ()
	{
		n_onQuickMenuDismissed ();
	}

	private native void n_onQuickMenuDismissed ();


	public void onQuickMenuShown ()
	{
		n_onQuickMenuShown ();
	}

	private native void n_onQuickMenuShown ();


	public boolean onShowQuickMenu (com.pdftron.pdf.tools.QuickMenu p0, com.pdftron.pdf.Annot p1)
	{
		return n_onShowQuickMenu (p0, p1);
	}

	private native boolean n_onShowQuickMenu (com.pdftron.pdf.tools.QuickMenu p0, com.pdftron.pdf.Annot p1);

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
