package mono.com.pdftron.pdf.controls;


public class FormToolbar_FormToolbarListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.FormToolbar.FormToolbarListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFormToolbarWillClose:()V:GetOnFormToolbarWillCloseHandler:pdftron.PDF.Controls.FormToolbar/IFormToolbarListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.FormToolbar+IFormToolbarListenerImplementor, PDFViewCtrlTools", FormToolbar_FormToolbarListenerImplementor.class, __md_methods);
	}


	public FormToolbar_FormToolbarListenerImplementor ()
	{
		super ();
		if (getClass () == FormToolbar_FormToolbarListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.FormToolbar+IFormToolbarListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onFormToolbarWillClose ()
	{
		n_onFormToolbarWillClose ();
	}

	private native void n_onFormToolbarWillClose ();

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
