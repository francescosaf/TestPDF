package mono.com.pdftron.pdf.widget;


public class CheckableRelativeLayout_OnCheckedChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.widget.CheckableRelativeLayout.OnCheckedChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCheckedChanged:(Lcom/pdftron/pdf/widget/CheckableRelativeLayout;Z)V:GetOnCheckedChanged_Lcom_pdftron_pdf_widget_CheckableRelativeLayout_ZHandler:pdftron.PDF.Widget.CheckableRelativeLayout/IOnCheckedChangeListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Widget.CheckableRelativeLayout+IOnCheckedChangeListenerImplementor, PDFViewCtrlTools", CheckableRelativeLayout_OnCheckedChangeListenerImplementor.class, __md_methods);
	}


	public CheckableRelativeLayout_OnCheckedChangeListenerImplementor ()
	{
		super ();
		if (getClass () == CheckableRelativeLayout_OnCheckedChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Widget.CheckableRelativeLayout+IOnCheckedChangeListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onCheckedChanged (com.pdftron.pdf.widget.CheckableRelativeLayout p0, boolean p1)
	{
		n_onCheckedChanged (p0, p1);
	}

	private native void n_onCheckedChanged (com.pdftron.pdf.widget.CheckableRelativeLayout p0, boolean p1);

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
