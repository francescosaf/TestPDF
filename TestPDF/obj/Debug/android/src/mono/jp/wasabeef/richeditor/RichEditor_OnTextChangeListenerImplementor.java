package mono.jp.wasabeef.richeditor;


public class RichEditor_OnTextChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		jp.wasabeef.richeditor.RichEditor.OnTextChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTextChange:(Ljava/lang/String;)V:GetOnTextChange_Ljava_lang_String_Handler:JP.Wasabeef.Richeditor.RichEditor/IOnTextChangeListenerInvoker, RicheditorAndroid\n" +
			"";
		mono.android.Runtime.register ("JP.Wasabeef.Richeditor.RichEditor+IOnTextChangeListenerImplementor, RicheditorAndroid", RichEditor_OnTextChangeListenerImplementor.class, __md_methods);
	}


	public RichEditor_OnTextChangeListenerImplementor ()
	{
		super ();
		if (getClass () == RichEditor_OnTextChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("JP.Wasabeef.Richeditor.RichEditor+IOnTextChangeListenerImplementor, RicheditorAndroid", "", this, new java.lang.Object[] {  });
	}


	public void onTextChange (java.lang.String p0)
	{
		n_onTextChange (p0);
	}

	private native void n_onTextChange (java.lang.String p0);

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
