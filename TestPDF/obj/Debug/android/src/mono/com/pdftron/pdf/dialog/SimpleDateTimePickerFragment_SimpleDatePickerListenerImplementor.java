package mono.com.pdftron.pdf.dialog;


public class SimpleDateTimePickerFragment_SimpleDatePickerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.dialog.SimpleDateTimePickerFragment.SimpleDatePickerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClear:()V:GetOnClearHandler:pdftron.PDF.Dialog.SimpleDateTimePickerFragment/ISimpleDatePickerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onDateSet:(Landroid/widget/DatePicker;III)V:GetOnDateSet_Landroid_widget_DatePicker_IIIHandler:pdftron.PDF.Dialog.SimpleDateTimePickerFragment/ISimpleDatePickerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onDismiss:(ZZ)V:GetOnDismiss_ZZHandler:pdftron.PDF.Dialog.SimpleDateTimePickerFragment/ISimpleDatePickerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onTimeSet:(Landroid/widget/TimePicker;II)V:GetOnTimeSet_Landroid_widget_TimePicker_IIHandler:pdftron.PDF.Dialog.SimpleDateTimePickerFragment/ISimpleDatePickerListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Dialog.SimpleDateTimePickerFragment+ISimpleDatePickerListenerImplementor, PDFViewCtrlTools", SimpleDateTimePickerFragment_SimpleDatePickerListenerImplementor.class, __md_methods);
	}


	public SimpleDateTimePickerFragment_SimpleDatePickerListenerImplementor ()
	{
		super ();
		if (getClass () == SimpleDateTimePickerFragment_SimpleDatePickerListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Dialog.SimpleDateTimePickerFragment+ISimpleDatePickerListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onClear ()
	{
		n_onClear ();
	}

	private native void n_onClear ();


	public void onDateSet (android.widget.DatePicker p0, int p1, int p2, int p3)
	{
		n_onDateSet (p0, p1, p2, p3);
	}

	private native void n_onDateSet (android.widget.DatePicker p0, int p1, int p2, int p3);


	public void onDismiss (boolean p0, boolean p1)
	{
		n_onDismiss (p0, p1);
	}

	private native void n_onDismiss (boolean p0, boolean p1);


	public void onTimeSet (android.widget.TimePicker p0, int p1, int p2)
	{
		n_onTimeSet (p0, p1, p2);
	}

	private native void n_onTimeSet (android.widget.TimePicker p0, int p1, int p2);

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
