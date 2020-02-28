package mono.com.pdftron.pdf.dialog;


public class CustomColorModeDialogFragment_PresetRecyclerAdapterListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.dialog.CustomColorModeDialogFragment.PresetRecyclerAdapterListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPositionSelected:(I)V:GetOnPositionSelected_IHandler:pdftron.PDF.Dialog.CustomColorModeDialogFragment/IPresetRecyclerAdapterListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Dialog.CustomColorModeDialogFragment+IPresetRecyclerAdapterListenerImplementor, PDFViewCtrlTools", CustomColorModeDialogFragment_PresetRecyclerAdapterListenerImplementor.class, __md_methods);
	}


	public CustomColorModeDialogFragment_PresetRecyclerAdapterListenerImplementor ()
	{
		super ();
		if (getClass () == CustomColorModeDialogFragment_PresetRecyclerAdapterListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Dialog.CustomColorModeDialogFragment+IPresetRecyclerAdapterListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onPositionSelected (int p0)
	{
		n_onPositionSelected (p0);
	}

	private native void n_onPositionSelected (int p0);

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
