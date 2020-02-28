package mono.com.pdftron.pdf.controls;


public class EditToolbarImpl_OnEditToolbarListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.EditToolbarImpl.OnEditToolbarListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEditToolbarDismissed:()V:GetOnEditToolbarDismissedHandler:pdftron.PDF.Controls.EditToolbarImpl/IOnEditToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.EditToolbarImpl+IOnEditToolbarListenerImplementor, PDFViewCtrlTools", EditToolbarImpl_OnEditToolbarListenerImplementor.class, __md_methods);
	}


	public EditToolbarImpl_OnEditToolbarListenerImplementor ()
	{
		super ();
		if (getClass () == EditToolbarImpl_OnEditToolbarListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.EditToolbarImpl+IOnEditToolbarListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onEditToolbarDismissed ()
	{
		n_onEditToolbarDismissed ();
	}

	private native void n_onEditToolbarDismissed ();

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
