package mono.com.pdftron.pdf.interfaces;


public class OnCustomStampChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.interfaces.OnCustomStampChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCustomStampCreated:(Landroid/graphics/Bitmap;)V:GetOnCustomStampCreated_Landroid_graphics_Bitmap_Handler:pdftron.PDF.Interfaces.IOnCustomStampChangedListenerInvoker, PDFViewCtrlTools\n" +
			"n_onCustomStampUpdated:(Landroid/graphics/Bitmap;I)V:GetOnCustomStampUpdated_Landroid_graphics_Bitmap_IHandler:pdftron.PDF.Interfaces.IOnCustomStampChangedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Interfaces.IOnCustomStampChangedListenerImplementor, PDFViewCtrlTools", OnCustomStampChangedListenerImplementor.class, __md_methods);
	}


	public OnCustomStampChangedListenerImplementor ()
	{
		super ();
		if (getClass () == OnCustomStampChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Interfaces.IOnCustomStampChangedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onCustomStampCreated (android.graphics.Bitmap p0)
	{
		n_onCustomStampCreated (p0);
	}

	private native void n_onCustomStampCreated (android.graphics.Bitmap p0);


	public void onCustomStampUpdated (android.graphics.Bitmap p0, int p1)
	{
		n_onCustomStampUpdated (p0, p1);
	}

	private native void n_onCustomStampUpdated (android.graphics.Bitmap p0, int p1);

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
