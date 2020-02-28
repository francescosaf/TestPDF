package mono.com.pdftron.pdf.controls;


public class UserCropDialogFragment_OnUserCropDialogDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.UserCropDialogFragment.OnUserCropDialogDismissListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUserCropDialogDismiss:(I)V:GetOnUserCropDialogDismiss_IHandler:pdftron.PDF.Controls.UserCropDialogFragment/IOnUserCropDialogDismissListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.UserCropDialogFragment+IOnUserCropDialogDismissListenerImplementor, PDFViewCtrlTools", UserCropDialogFragment_OnUserCropDialogDismissListenerImplementor.class, __md_methods);
	}


	public UserCropDialogFragment_OnUserCropDialogDismissListenerImplementor ()
	{
		super ();
		if (getClass () == UserCropDialogFragment_OnUserCropDialogDismissListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.UserCropDialogFragment+IOnUserCropDialogDismissListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onUserCropDialogDismiss (int p0)
	{
		n_onUserCropDialogDismiss (p0);
	}

	private native void n_onUserCropDialogDismiss (int p0);

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
