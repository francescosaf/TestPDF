package mono.com.pdftron.pdf.interfaces;


public class OnSoundRecordedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.interfaces.OnSoundRecordedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSoundRecorded:(Landroid/graphics/PointF;ILjava/lang/String;)V:GetOnSoundRecorded_Landroid_graphics_PointF_ILjava_lang_String_Handler:pdftron.PDF.Interfaces.IOnSoundRecordedListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Interfaces.IOnSoundRecordedListenerImplementor, PDFViewCtrlTools", OnSoundRecordedListenerImplementor.class, __md_methods);
	}


	public OnSoundRecordedListenerImplementor ()
	{
		super ();
		if (getClass () == OnSoundRecordedListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Interfaces.IOnSoundRecordedListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onSoundRecorded (android.graphics.PointF p0, int p1, java.lang.String p2)
	{
		n_onSoundRecorded (p0, p1, p2);
	}

	private native void n_onSoundRecorded (android.graphics.PointF p0, int p1, java.lang.String p2);

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
