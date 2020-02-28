package mono.com.pspdfkit.document.image;


public class ImagePicker_OnImagePickedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.document.image.ImagePicker.OnImagePickedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraPermissionDeclined:(Z)V:GetOnCameraPermissionDeclined_ZHandler:PSPDFKit.Document.Image.ImagePicker/IOnImagePickedListenerInvoker, PSPDFKit.Android\n" +
			"n_onImagePicked:(Landroid/net/Uri;)V:GetOnImagePicked_Landroid_net_Uri_Handler:PSPDFKit.Document.Image.ImagePicker/IOnImagePickedListenerInvoker, PSPDFKit.Android\n" +
			"n_onImagePickerCancelled:()V:GetOnImagePickerCancelledHandler:PSPDFKit.Document.Image.ImagePicker/IOnImagePickedListenerInvoker, PSPDFKit.Android\n" +
			"n_onImagePickerUnknownError:()V:GetOnImagePickerUnknownErrorHandler:PSPDFKit.Document.Image.ImagePicker/IOnImagePickedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Document.Image.ImagePicker+IOnImagePickedListenerImplementor, PSPDFKit.Android", ImagePicker_OnImagePickedListenerImplementor.class, __md_methods);
	}


	public ImagePicker_OnImagePickedListenerImplementor ()
	{
		super ();
		if (getClass () == ImagePicker_OnImagePickedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Document.Image.ImagePicker+IOnImagePickedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCameraPermissionDeclined (boolean p0)
	{
		n_onCameraPermissionDeclined (p0);
	}

	private native void n_onCameraPermissionDeclined (boolean p0);


	public void onImagePicked (android.net.Uri p0)
	{
		n_onImagePicked (p0);
	}

	private native void n_onImagePicked (android.net.Uri p0);


	public void onImagePickerCancelled ()
	{
		n_onImagePickerCancelled ();
	}

	private native void n_onImagePickerCancelled ();


	public void onImagePickerUnknownError ()
	{
		n_onImagePickerUnknownError ();
	}

	private native void n_onImagePickerUnknownError ();

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
