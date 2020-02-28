package mono.com.pspdfkit.ui.special_mode.controller;


public class TextSelectionController_OnSearchSelectedTextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.special_mode.controller.TextSelectionController.OnSearchSelectedTextListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSearchSelectedText:(Ljava/lang/String;)V:GetOnSearchSelectedText_Ljava_lang_String_Handler:PSPDFKit.UI.SpecialMode.Controller.ITextSelectionControllerOnSearchSelectedTextListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.SpecialMode.Controller.ITextSelectionControllerOnSearchSelectedTextListenerImplementor, PSPDFKit.Android", TextSelectionController_OnSearchSelectedTextListenerImplementor.class, __md_methods);
	}


	public TextSelectionController_OnSearchSelectedTextListenerImplementor ()
	{
		super ();
		if (getClass () == TextSelectionController_OnSearchSelectedTextListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.SpecialMode.Controller.ITextSelectionControllerOnSearchSelectedTextListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onSearchSelectedText (java.lang.String p0)
	{
		n_onSearchSelectedText (p0);
	}

	private native void n_onSearchSelectedText (java.lang.String p0);

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
