package mono.com.pdftron.pdf.dialog;


public class CustomColorModeDialogFragment_CustomColorModeSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.dialog.CustomColorModeDialogFragment.CustomColorModeSelectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCustomColorModeSelected:(II)V:GetOnCustomColorModeSelected_IIHandler:pdftron.PDF.Dialog.CustomColorModeDialogFragment/ICustomColorModeSelectedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Dialog.CustomColorModeDialogFragment+ICustomColorModeSelectedListenerImplementor, PDFViewCtrlTools", CustomColorModeDialogFragment_CustomColorModeSelectedListenerImplementor.class, __md_methods);
	}


	public CustomColorModeDialogFragment_CustomColorModeSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == CustomColorModeDialogFragment_CustomColorModeSelectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Dialog.CustomColorModeDialogFragment+ICustomColorModeSelectedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onCustomColorModeSelected (int p0, int p1)
	{
		n_onCustomColorModeSelected (p0, p1);
	}

	private native void n_onCustomColorModeSelected (int p0, int p1);

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
