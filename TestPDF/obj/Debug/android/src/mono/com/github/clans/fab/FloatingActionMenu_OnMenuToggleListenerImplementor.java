package mono.com.github.clans.fab;


public class FloatingActionMenu_OnMenuToggleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.github.clans.fab.FloatingActionMenu.OnMenuToggleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMenuToggle:(Z)V:GetOnMenuToggle_ZHandler:Com.Github.Clans.Fab.FloatingActionMenu/IOnMenuToggleListenerInvoker, FloatingActionButton\n" +
			"";
		mono.android.Runtime.register ("Com.Github.Clans.Fab.FloatingActionMenu+IOnMenuToggleListenerImplementor, FloatingActionButton", FloatingActionMenu_OnMenuToggleListenerImplementor.class, __md_methods);
	}


	public FloatingActionMenu_OnMenuToggleListenerImplementor ()
	{
		super ();
		if (getClass () == FloatingActionMenu_OnMenuToggleListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Github.Clans.Fab.FloatingActionMenu+IOnMenuToggleListenerImplementor, FloatingActionButton", "", this, new java.lang.Object[] {  });
	}


	public void onMenuToggle (boolean p0)
	{
		n_onMenuToggle (p0);
	}

	private native void n_onMenuToggle (boolean p0);

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
