package mono.com.pdftron.pdf.controls;


public class UserCropSelectionDialogFragment_UserCropSelectionDialogFragmentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.UserCropSelectionDialogFragment.UserCropSelectionDialogFragmentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUserCropMethodSelected:(I)V:GetOnUserCropMethodSelected_IHandler:pdftron.PDF.Controls.UserCropSelectionDialogFragment/IUserCropSelectionDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"n_onUserCropSelectionDialogFragmentDismiss:()V:GetOnUserCropSelectionDialogFragmentDismissHandler:pdftron.PDF.Controls.UserCropSelectionDialogFragment/IUserCropSelectionDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.UserCropSelectionDialogFragment+IUserCropSelectionDialogFragmentListenerImplementor, PDFViewCtrlTools", UserCropSelectionDialogFragment_UserCropSelectionDialogFragmentListenerImplementor.class, __md_methods);
	}


	public UserCropSelectionDialogFragment_UserCropSelectionDialogFragmentListenerImplementor ()
	{
		super ();
		if (getClass () == UserCropSelectionDialogFragment_UserCropSelectionDialogFragmentListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.UserCropSelectionDialogFragment+IUserCropSelectionDialogFragmentListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onUserCropMethodSelected (int p0)
	{
		n_onUserCropMethodSelected (p0);
	}

	private native void n_onUserCropMethodSelected (int p0);


	public void onUserCropSelectionDialogFragmentDismiss ()
	{
		n_onUserCropSelectionDialogFragmentDismiss ();
	}

	private native void n_onUserCropSelectionDialogFragmentDismiss ();

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
