package mono.com.pdftron.pdf.dialog;


public class ViewModePickerDialogFragment_ViewModePickerDialogFragmentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.dialog.ViewModePickerDialogFragment.ViewModePickerDialogFragmentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_checkTabConversionAndAlert:(IZ)Z:GetCheckTabConversionAndAlert_IZHandler:pdftron.PDF.Dialog.ViewModePickerDialogFragment/IViewModePickerDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"n_onCustomColorModeSelected:(II)Z:GetOnCustomColorModeSelected_IIHandler:pdftron.PDF.Dialog.ViewModePickerDialogFragment/IViewModePickerDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"n_onReflowZoomInOut:(Z)I:GetOnReflowZoomInOut_ZHandler:pdftron.PDF.Dialog.ViewModePickerDialogFragment/IViewModePickerDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"n_onViewModeColorSelected:(I)Z:GetOnViewModeColorSelected_IHandler:pdftron.PDF.Dialog.ViewModePickerDialogFragment/IViewModePickerDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"n_onViewModePickerDialogFragmentDismiss:()V:GetOnViewModePickerDialogFragmentDismissHandler:pdftron.PDF.Dialog.ViewModePickerDialogFragment/IViewModePickerDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"n_onViewModeSelected:(Ljava/lang/String;)V:GetOnViewModeSelected_Ljava_lang_String_Handler:pdftron.PDF.Dialog.ViewModePickerDialogFragment/IViewModePickerDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Dialog.ViewModePickerDialogFragment+IViewModePickerDialogFragmentListenerImplementor, PDFViewCtrlTools", ViewModePickerDialogFragment_ViewModePickerDialogFragmentListenerImplementor.class, __md_methods);
	}


	public ViewModePickerDialogFragment_ViewModePickerDialogFragmentListenerImplementor ()
	{
		super ();
		if (getClass () == ViewModePickerDialogFragment_ViewModePickerDialogFragmentListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Dialog.ViewModePickerDialogFragment+IViewModePickerDialogFragmentListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public boolean checkTabConversionAndAlert (int p0, boolean p1)
	{
		return n_checkTabConversionAndAlert (p0, p1);
	}

	private native boolean n_checkTabConversionAndAlert (int p0, boolean p1);


	public boolean onCustomColorModeSelected (int p0, int p1)
	{
		return n_onCustomColorModeSelected (p0, p1);
	}

	private native boolean n_onCustomColorModeSelected (int p0, int p1);


	public int onReflowZoomInOut (boolean p0)
	{
		return n_onReflowZoomInOut (p0);
	}

	private native int n_onReflowZoomInOut (boolean p0);


	public boolean onViewModeColorSelected (int p0)
	{
		return n_onViewModeColorSelected (p0);
	}

	private native boolean n_onViewModeColorSelected (int p0);


	public void onViewModePickerDialogFragmentDismiss ()
	{
		n_onViewModePickerDialogFragmentDismiss ();
	}

	private native void n_onViewModePickerDialogFragmentDismiss ();


	public void onViewModeSelected (java.lang.String p0)
	{
		n_onViewModeSelected (p0);
	}

	private native void n_onViewModeSelected (java.lang.String p0);

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
