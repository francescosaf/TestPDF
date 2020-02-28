package mono.com.pdftron.pdf.widget;


public class DiffOptionsView_DiffOptionsViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.widget.DiffOptionsView.DiffOptionsViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCompareFiles:(Ljava/util/ArrayList;)V:GetOnCompareFiles_Ljava_util_ArrayList_Handler:pdftron.PDF.Widget.DiffOptionsView/IDiffOptionsViewListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSelectFile:(Landroid/view/View;)V:GetOnSelectFile_Landroid_view_View_Handler:pdftron.PDF.Widget.DiffOptionsView/IDiffOptionsViewListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Widget.DiffOptionsView+IDiffOptionsViewListenerImplementor, PDFViewCtrlTools", DiffOptionsView_DiffOptionsViewListenerImplementor.class, __md_methods);
	}


	public DiffOptionsView_DiffOptionsViewListenerImplementor ()
	{
		super ();
		if (getClass () == DiffOptionsView_DiffOptionsViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Widget.DiffOptionsView+IDiffOptionsViewListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onCompareFiles (java.util.ArrayList p0)
	{
		n_onCompareFiles (p0);
	}

	private native void n_onCompareFiles (java.util.ArrayList p0);


	public void onSelectFile (android.view.View p0)
	{
		n_onSelectFile (p0);
	}

	private native void n_onSelectFile (android.view.View p0);

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
