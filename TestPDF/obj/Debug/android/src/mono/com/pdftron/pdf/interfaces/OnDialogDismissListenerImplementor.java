package mono.com.pdftron.pdf.interfaces;


public class OnDialogDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.interfaces.OnDialogDismissListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDialogDismiss:()V:GetOnDialogDismissHandler:pdftron.PDF.Interfaces.IOnDialogDismissListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Interfaces.IOnDialogDismissListenerImplementor, PDFViewCtrlTools", OnDialogDismissListenerImplementor.class, __md_methods);
	}


	public OnDialogDismissListenerImplementor ()
	{
		super ();
		if (getClass () == OnDialogDismissListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Interfaces.IOnDialogDismissListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onDialogDismiss ()
	{
		n_onDialogDismiss ();
	}

	private native void n_onDialogDismiss ();

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
