package mono.com.pdftron.pdf.controls;


public class PasswordDialogFragment_PasswordDialogFragmentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.PasswordDialogFragment.PasswordDialogFragmentListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPasswordDialogDismiss:(Z)V:GetOnPasswordDialogDismiss_ZHandler:pdftron.PDF.Controls.PasswordDialogFragment/IPasswordDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"n_onPasswordDialogNegativeClick:(ILjava/io/File;Ljava/lang/String;)V:GetOnPasswordDialogNegativeClick_ILjava_io_File_Ljava_lang_String_Handler:pdftron.PDF.Controls.PasswordDialogFragment/IPasswordDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"n_onPasswordDialogPositiveClick:(ILjava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V:GetOnPasswordDialogPositiveClick_ILjava_io_File_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Handler:pdftron.PDF.Controls.PasswordDialogFragment/IPasswordDialogFragmentListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.PasswordDialogFragment+IPasswordDialogFragmentListenerImplementor, PDFViewCtrlTools", PasswordDialogFragment_PasswordDialogFragmentListenerImplementor.class, __md_methods);
	}


	public PasswordDialogFragment_PasswordDialogFragmentListenerImplementor ()
	{
		super ();
		if (getClass () == PasswordDialogFragment_PasswordDialogFragmentListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.PasswordDialogFragment+IPasswordDialogFragmentListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onPasswordDialogDismiss (boolean p0)
	{
		n_onPasswordDialogDismiss (p0);
	}

	private native void n_onPasswordDialogDismiss (boolean p0);


	public void onPasswordDialogNegativeClick (int p0, java.io.File p1, java.lang.String p2)
	{
		n_onPasswordDialogNegativeClick (p0, p1, p2);
	}

	private native void n_onPasswordDialogNegativeClick (int p0, java.io.File p1, java.lang.String p2);


	public void onPasswordDialogPositiveClick (int p0, java.io.File p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)
	{
		n_onPasswordDialogPositiveClick (p0, p1, p2, p3, p4);
	}

	private native void n_onPasswordDialogPositiveClick (int p0, java.io.File p1, java.lang.String p2, java.lang.String p3, java.lang.String p4);

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
