package mono.com.pdftron.pdf.widget;


public class SignatureView_SignatureViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.widget.SignatureView.SignatureViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:()V:GetOnErrorHandler:pdftron.PDF.Widget.SignatureView/ISignatureViewListenerInvoker, PDFViewCtrlTools\n" +
			"n_onTouchStart:(FF)V:GetOnTouchStart_FFHandler:pdftron.PDF.Widget.SignatureView/ISignatureViewListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Widget.SignatureView+ISignatureViewListenerImplementor, PDFViewCtrlTools", SignatureView_SignatureViewListenerImplementor.class, __md_methods);
	}


	public SignatureView_SignatureViewListenerImplementor ()
	{
		super ();
		if (getClass () == SignatureView_SignatureViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Widget.SignatureView+ISignatureViewListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onError ()
	{
		n_onError ();
	}

	private native void n_onError ();


	public void onTouchStart (float p0, float p1)
	{
		n_onTouchStart (p0, p1);
	}

	private native void n_onTouchStart (float p0, float p1);

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
