package mono.jp.wasabeef.richeditor;


public class RichEditor_AfterInitialLoadListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		jp.wasabeef.richeditor.RichEditor.AfterInitialLoadListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAfterInitialLoad:(Z)V:GetOnAfterInitialLoad_ZHandler:JP.Wasabeef.Richeditor.RichEditor/IAfterInitialLoadListenerInvoker, RicheditorAndroid\n" +
			"";
		mono.android.Runtime.register ("JP.Wasabeef.Richeditor.RichEditor+IAfterInitialLoadListenerImplementor, RicheditorAndroid", RichEditor_AfterInitialLoadListenerImplementor.class, __md_methods);
	}


	public RichEditor_AfterInitialLoadListenerImplementor ()
	{
		super ();
		if (getClass () == RichEditor_AfterInitialLoadListenerImplementor.class)
			mono.android.TypeManager.Activate ("JP.Wasabeef.Richeditor.RichEditor+IAfterInitialLoadListenerImplementor, RicheditorAndroid", "", this, new java.lang.Object[] {  });
	}


	public void onAfterInitialLoad (boolean p0)
	{
		n_onAfterInitialLoad (p0);
	}

	private native void n_onAfterInitialLoad (boolean p0);

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
