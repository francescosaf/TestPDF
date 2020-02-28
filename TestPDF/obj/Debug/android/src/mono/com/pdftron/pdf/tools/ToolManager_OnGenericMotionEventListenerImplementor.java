package mono.com.pdftron.pdf.tools;


public class ToolManager_OnGenericMotionEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.OnGenericMotionEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChangePointerIcon:(Landroid/view/PointerIcon;)V:GetOnChangePointerIcon_Landroid_view_PointerIcon_Handler:pdftron.PDF.Tools.ToolManager/IOnGenericMotionEventListenerInvoker, PDFViewCtrlTools\n" +
			"n_onGenericMotionEvent:(Landroid/view/MotionEvent;)V:GetOnGenericMotionEvent_Landroid_view_MotionEvent_Handler:pdftron.PDF.Tools.ToolManager/IOnGenericMotionEventListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IOnGenericMotionEventListenerImplementor, PDFViewCtrlTools", ToolManager_OnGenericMotionEventListenerImplementor.class, __md_methods);
	}


	public ToolManager_OnGenericMotionEventListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_OnGenericMotionEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IOnGenericMotionEventListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onChangePointerIcon (android.view.PointerIcon p0)
	{
		n_onChangePointerIcon (p0);
	}

	private native void n_onChangePointerIcon (android.view.PointerIcon p0);


	public void onGenericMotionEvent (android.view.MotionEvent p0)
	{
		n_onGenericMotionEvent (p0);
	}

	private native void n_onGenericMotionEvent (android.view.MotionEvent p0);

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
