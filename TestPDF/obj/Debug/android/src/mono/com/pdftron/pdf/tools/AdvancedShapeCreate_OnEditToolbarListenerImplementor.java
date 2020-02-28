package mono.com.pdftron.pdf.tools;


public class AdvancedShapeCreate_OnEditToolbarListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.AdvancedShapeCreate.OnEditToolbarListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_closeEditToolbar:()V:GetCloseEditToolbarHandler:pdftron.PDF.Tools.AdvancedShapeCreate/IOnEditToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"n_showEditToolbar:(Lcom/pdftron/pdf/tools/ToolManager$ToolMode;Lcom/pdftron/pdf/Annot;I)V:GetShowEditToolbar_Lcom_pdftron_pdf_tools_ToolManager_ToolMode_Lcom_pdftron_pdf_Annot_IHandler:pdftron.PDF.Tools.AdvancedShapeCreate/IOnEditToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.AdvancedShapeCreate+IOnEditToolbarListenerImplementor, PDFViewCtrlTools", AdvancedShapeCreate_OnEditToolbarListenerImplementor.class, __md_methods);
	}


	public AdvancedShapeCreate_OnEditToolbarListenerImplementor ()
	{
		super ();
		if (getClass () == AdvancedShapeCreate_OnEditToolbarListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.AdvancedShapeCreate+IOnEditToolbarListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void closeEditToolbar ()
	{
		n_closeEditToolbar ();
	}

	private native void n_closeEditToolbar ();


	public void showEditToolbar (com.pdftron.pdf.tools.ToolManager.ToolMode p0, com.pdftron.pdf.Annot p1, int p2)
	{
		n_showEditToolbar (p0, p1, p2);
	}

	private native void n_showEditToolbar (com.pdftron.pdf.tools.ToolManager.ToolMode p0, com.pdftron.pdf.Annot p1, int p2);

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
