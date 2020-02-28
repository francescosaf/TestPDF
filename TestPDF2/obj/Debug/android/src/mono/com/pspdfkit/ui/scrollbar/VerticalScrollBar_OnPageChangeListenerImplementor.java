package mono.com.pspdfkit.ui.scrollbar;


public class VerticalScrollBar_OnPageChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.scrollbar.VerticalScrollBar.OnPageChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPageChanged:(Lcom/pspdfkit/ui/scrollbar/VerticalScrollBar;I)V:GetOnPageChanged_Lcom_pspdfkit_ui_scrollbar_VerticalScrollBar_IHandler:PSPDFKit.UI.Scrollbar.VerticalScrollBar/IOnPageChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Scrollbar.VerticalScrollBar+IOnPageChangeListenerImplementor, PSPDFKit.Android", VerticalScrollBar_OnPageChangeListenerImplementor.class, __md_methods);
	}


	public VerticalScrollBar_OnPageChangeListenerImplementor ()
	{
		super ();
		if (getClass () == VerticalScrollBar_OnPageChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Scrollbar.VerticalScrollBar+IOnPageChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onPageChanged (com.pspdfkit.ui.scrollbar.VerticalScrollBar p0, int p1)
	{
		n_onPageChanged (p0, p1);
	}

	private native void n_onPageChanged (com.pspdfkit.ui.scrollbar.VerticalScrollBar p0, int p1);

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
