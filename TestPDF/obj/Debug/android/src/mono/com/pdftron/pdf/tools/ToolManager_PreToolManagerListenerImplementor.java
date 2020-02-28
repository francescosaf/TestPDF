package mono.com.pdftron.pdf.tools;


public class ToolManager_PreToolManagerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.ToolManager.PreToolManagerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDoubleTap:(Landroid/view/MotionEvent;)Z:GetOnDoubleTap_Landroid_view_MotionEvent_Handler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onDown:(Landroid/view/MotionEvent;)Z:GetOnDown_Landroid_view_MotionEvent_Handler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onKeyUp:(ILandroid/view/KeyEvent;)Z:GetOnKeyUp_ILandroid_view_KeyEvent_Handler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onLongPress:(Landroid/view/MotionEvent;)Z:GetOnLongPress_Landroid_view_MotionEvent_Handler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onMove:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z:GetOnMove_Landroid_view_MotionEvent_Landroid_view_MotionEvent_FFHandler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onScale:(FF)Z:GetOnScale_FFHandler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onScaleBegin:(FF)Z:GetOnScaleBegin_FFHandler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onScaleEnd:(FF)Z:GetOnScaleEnd_FFHandler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onScrollChanged:(IIII)V:GetOnScrollChanged_IIIIHandler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onSingleTapConfirmed:(Landroid/view/MotionEvent;)Z:GetOnSingleTapConfirmed_Landroid_view_MotionEvent_Handler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"n_onUp:(Landroid/view/MotionEvent;Lcom/pdftron/pdf/PDFViewCtrl$PriorEventMode;)Z:GetOnUp_Landroid_view_MotionEvent_Lcom_pdftron_pdf_PDFViewCtrl_PriorEventMode_Handler:pdftron.PDF.Tools.ToolManager/IPreToolManagerListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.ToolManager+IPreToolManagerListenerImplementor, PDFViewCtrlTools", ToolManager_PreToolManagerListenerImplementor.class, __md_methods);
	}


	public ToolManager_PreToolManagerListenerImplementor ()
	{
		super ();
		if (getClass () == ToolManager_PreToolManagerListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.ToolManager+IPreToolManagerListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public boolean onDoubleTap (android.view.MotionEvent p0)
	{
		return n_onDoubleTap (p0);
	}

	private native boolean n_onDoubleTap (android.view.MotionEvent p0);


	public boolean onDown (android.view.MotionEvent p0)
	{
		return n_onDown (p0);
	}

	private native boolean n_onDown (android.view.MotionEvent p0);


	public boolean onKeyUp (int p0, android.view.KeyEvent p1)
	{
		return n_onKeyUp (p0, p1);
	}

	private native boolean n_onKeyUp (int p0, android.view.KeyEvent p1);


	public boolean onLongPress (android.view.MotionEvent p0)
	{
		return n_onLongPress (p0);
	}

	private native boolean n_onLongPress (android.view.MotionEvent p0);


	public boolean onMove (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3)
	{
		return n_onMove (p0, p1, p2, p3);
	}

	private native boolean n_onMove (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);


	public boolean onScale (float p0, float p1)
	{
		return n_onScale (p0, p1);
	}

	private native boolean n_onScale (float p0, float p1);


	public boolean onScaleBegin (float p0, float p1)
	{
		return n_onScaleBegin (p0, p1);
	}

	private native boolean n_onScaleBegin (float p0, float p1);


	public boolean onScaleEnd (float p0, float p1)
	{
		return n_onScaleEnd (p0, p1);
	}

	private native boolean n_onScaleEnd (float p0, float p1);


	public void onScrollChanged (int p0, int p1, int p2, int p3)
	{
		n_onScrollChanged (p0, p1, p2, p3);
	}

	private native void n_onScrollChanged (int p0, int p1, int p2, int p3);


	public boolean onSingleTapConfirmed (android.view.MotionEvent p0)
	{
		return n_onSingleTapConfirmed (p0);
	}

	private native boolean n_onSingleTapConfirmed (android.view.MotionEvent p0);


	public boolean onUp (android.view.MotionEvent p0, com.pdftron.pdf.PDFViewCtrl.PriorEventMode p1)
	{
		return n_onUp (p0, p1);
	}

	private native boolean n_onUp (android.view.MotionEvent p0, com.pdftron.pdf.PDFViewCtrl.PriorEventMode p1);

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
