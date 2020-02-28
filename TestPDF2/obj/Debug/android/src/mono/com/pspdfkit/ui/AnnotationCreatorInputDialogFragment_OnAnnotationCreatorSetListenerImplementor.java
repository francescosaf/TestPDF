package mono.com.pspdfkit.ui;


public class AnnotationCreatorInputDialogFragment_OnAnnotationCreatorSetListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.AnnotationCreatorInputDialogFragment.OnAnnotationCreatorSetListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAbort:()V:GetOnAbortHandler:PSPDFKit.UI.AnnotationCreatorInputDialogFragment/IOnAnnotationCreatorSetListenerInvoker, PSPDFKit.Android\n" +
			"n_onAnnotationCreatorSet:(Ljava/lang/String;)V:GetOnAnnotationCreatorSet_Ljava_lang_String_Handler:PSPDFKit.UI.AnnotationCreatorInputDialogFragment/IOnAnnotationCreatorSetListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.AnnotationCreatorInputDialogFragment+IOnAnnotationCreatorSetListenerImplementor, PSPDFKit.Android", AnnotationCreatorInputDialogFragment_OnAnnotationCreatorSetListenerImplementor.class, __md_methods);
	}


	public AnnotationCreatorInputDialogFragment_OnAnnotationCreatorSetListenerImplementor ()
	{
		super ();
		if (getClass () == AnnotationCreatorInputDialogFragment_OnAnnotationCreatorSetListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.AnnotationCreatorInputDialogFragment+IOnAnnotationCreatorSetListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAbort ()
	{
		n_onAbort ();
	}

	private native void n_onAbort ();


	public void onAnnotationCreatorSet (java.lang.String p0)
	{
		n_onAnnotationCreatorSet (p0);
	}

	private native void n_onAnnotationCreatorSet (java.lang.String p0);

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
