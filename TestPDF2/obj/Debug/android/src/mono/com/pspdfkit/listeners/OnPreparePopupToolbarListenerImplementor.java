package mono.com.pspdfkit.listeners;


public class OnPreparePopupToolbarListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.listeners.OnPreparePopupToolbarListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrepareTextSelectionPopupToolbar:(Lcom/pspdfkit/ui/toolbar/popup/PdfTextSelectionPopupToolbar;)V:GetOnPrepareTextSelectionPopupToolbar_Lcom_pspdfkit_ui_toolbar_popup_PdfTextSelectionPopupToolbar_Handler:PSPDFKit.Listeners.IOnPreparePopupToolbarListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Listeners.IOnPreparePopupToolbarListenerImplementor, PSPDFKit.Android", OnPreparePopupToolbarListenerImplementor.class, __md_methods);
	}


	public OnPreparePopupToolbarListenerImplementor ()
	{
		super ();
		if (getClass () == OnPreparePopupToolbarListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Listeners.IOnPreparePopupToolbarListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onPrepareTextSelectionPopupToolbar (com.pspdfkit.ui.toolbar.popup.PdfTextSelectionPopupToolbar p0)
	{
		n_onPrepareTextSelectionPopupToolbar (p0);
	}

	private native void n_onPrepareTextSelectionPopupToolbar (com.pspdfkit.ui.toolbar.popup.PdfTextSelectionPopupToolbar p0);

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
