package mono.jp.wasabeef.richeditor;


public class RichEditor_OnDecorationStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		jp.wasabeef.richeditor.RichEditor.OnDecorationStateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStateChangeListener:(Ljava/lang/String;Ljava/util/List;)V:GetOnStateChangeListener_Ljava_lang_String_Ljava_util_List_Handler:JP.Wasabeef.Richeditor.RichEditor/IOnDecorationStateListenerInvoker, RicheditorAndroid\n" +
			"";
		mono.android.Runtime.register ("JP.Wasabeef.Richeditor.RichEditor+IOnDecorationStateListenerImplementor, RicheditorAndroid", RichEditor_OnDecorationStateListenerImplementor.class, __md_methods);
	}


	public RichEditor_OnDecorationStateListenerImplementor ()
	{
		super ();
		if (getClass () == RichEditor_OnDecorationStateListenerImplementor.class)
			mono.android.TypeManager.Activate ("JP.Wasabeef.Richeditor.RichEditor+IOnDecorationStateListenerImplementor, RicheditorAndroid", "", this, new java.lang.Object[] {  });
	}


	public void onStateChangeListener (java.lang.String p0, java.util.List p1)
	{
		n_onStateChangeListener (p0, p1);
	}

	private native void n_onStateChangeListener (java.lang.String p0, java.util.List p1);

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
