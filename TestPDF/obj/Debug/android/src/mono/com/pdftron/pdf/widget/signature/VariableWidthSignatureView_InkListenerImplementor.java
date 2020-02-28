package mono.com.pdftron.pdf.widget.signature;


public class VariableWidthSignatureView_InkListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.widget.signature.VariableWidthSignatureView.InkListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInkCompleted:(Ljava/util/List;)V:GetOnInkCompleted_Ljava_util_List_Handler:pdftron.PDF.Widget.Signature.VariableWidthSignatureView/IInkListenerInvoker, PDFViewCtrlTools\n" +
			"n_onInkStarted:()V:GetOnInkStartedHandler:pdftron.PDF.Widget.Signature.VariableWidthSignatureView/IInkListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Widget.Signature.VariableWidthSignatureView+IInkListenerImplementor, PDFViewCtrlTools", VariableWidthSignatureView_InkListenerImplementor.class, __md_methods);
	}


	public VariableWidthSignatureView_InkListenerImplementor ()
	{
		super ();
		if (getClass () == VariableWidthSignatureView_InkListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Widget.Signature.VariableWidthSignatureView+IInkListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onInkCompleted (java.util.List p0)
	{
		n_onInkCompleted (p0);
	}

	private native void n_onInkCompleted (java.util.List p0);


	public void onInkStarted ()
	{
		n_onInkStarted ();
	}

	private native void n_onInkStarted ();

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
