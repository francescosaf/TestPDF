package mono.com.pdftron.pdf.controls;


public class FindTextOverlay_FindTextOverlayListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.FindTextOverlay.FindTextOverlayListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGotoNextSearch:(Z)V:GetOnGotoNextSearch_ZHandler:pdftron.PDF.Controls.NativeFindTextOverlay/IFindTextOverlayListenerInvoker, PDFViewCtrlTools\n" +
			"n_onGotoPreviousSearch:(Z)V:GetOnGotoPreviousSearch_ZHandler:pdftron.PDF.Controls.NativeFindTextOverlay/IFindTextOverlayListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSearchProgressHide:()V:GetOnSearchProgressHideHandler:pdftron.PDF.Controls.NativeFindTextOverlay/IFindTextOverlayListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSearchProgressShow:()V:GetOnSearchProgressShowHandler:pdftron.PDF.Controls.NativeFindTextOverlay/IFindTextOverlayListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.NativeFindTextOverlay+IFindTextOverlayListenerImplementor, PDFViewCtrlTools", FindTextOverlay_FindTextOverlayListenerImplementor.class, __md_methods);
	}


	public FindTextOverlay_FindTextOverlayListenerImplementor ()
	{
		super ();
		if (getClass () == FindTextOverlay_FindTextOverlayListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.NativeFindTextOverlay+IFindTextOverlayListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onGotoNextSearch (boolean p0)
	{
		n_onGotoNextSearch (p0);
	}

	private native void n_onGotoNextSearch (boolean p0);


	public void onGotoPreviousSearch (boolean p0)
	{
		n_onGotoPreviousSearch (p0);
	}

	private native void n_onGotoPreviousSearch (boolean p0);


	public void onSearchProgressHide ()
	{
		n_onSearchProgressHide ();
	}

	private native void n_onSearchProgressHide ();


	public void onSearchProgressShow ()
	{
		n_onSearchProgressShow ();
	}

	private native void n_onSearchProgressShow ();

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
