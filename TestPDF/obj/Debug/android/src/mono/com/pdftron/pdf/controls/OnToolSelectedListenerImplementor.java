package mono.com.pdftron.pdf.controls;


public class OnToolSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.OnToolSelectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClearSelected:()V:GetOnClearSelectedHandler:pdftron.PDF.Controls.IOnToolSelectedListenerInvoker, PDFViewCtrlTools\n" +
			"n_onCloseSelected:()V:GetOnCloseSelectedHandler:pdftron.PDF.Controls.IOnToolSelectedListenerInvoker, PDFViewCtrlTools\n" +
			"n_onDrawSelected:(IZLandroid/view/View;)V:GetOnDrawSelected_IZLandroid_view_View_Handler:pdftron.PDF.Controls.IOnToolSelectedListenerInvoker, PDFViewCtrlTools\n" +
			"n_onEraserSelected:(ZLandroid/view/View;)V:GetOnEraserSelected_ZLandroid_view_View_Handler:pdftron.PDF.Controls.IOnToolSelectedListenerInvoker, PDFViewCtrlTools\n" +
			"n_onRedoSelected:()V:GetOnRedoSelectedHandler:pdftron.PDF.Controls.IOnToolSelectedListenerInvoker, PDFViewCtrlTools\n" +
			"n_onUndoSelected:()V:GetOnUndoSelectedHandler:pdftron.PDF.Controls.IOnToolSelectedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.IOnToolSelectedListenerImplementor, PDFViewCtrlTools", OnToolSelectedListenerImplementor.class, __md_methods);
	}


	public OnToolSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == OnToolSelectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.IOnToolSelectedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onClearSelected ()
	{
		n_onClearSelected ();
	}

	private native void n_onClearSelected ();


	public void onCloseSelected ()
	{
		n_onCloseSelected ();
	}

	private native void n_onCloseSelected ();


	public void onDrawSelected (int p0, boolean p1, android.view.View p2)
	{
		n_onDrawSelected (p0, p1, p2);
	}

	private native void n_onDrawSelected (int p0, boolean p1, android.view.View p2);


	public void onEraserSelected (boolean p0, android.view.View p1)
	{
		n_onEraserSelected (p0, p1);
	}

	private native void n_onEraserSelected (boolean p0, android.view.View p1);


	public void onRedoSelected ()
	{
		n_onRedoSelected ();
	}

	private native void n_onRedoSelected ();


	public void onUndoSelected ()
	{
		n_onUndoSelected ();
	}

	private native void n_onUndoSelected ();

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
