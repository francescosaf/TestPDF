package mono.com.pspdfkit.ui.navigation;


public class NavigationBackStack_BackStackListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.navigation.NavigationBackStack.BackStackListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBackStackChanged:()V:GetOnBackStackChangedHandler:PSPDFKit.UI.Navigation.NavigationBackStack/IBackStackListenerInvoker, PSPDFKit.Android\n" +
			"n_visitedItem:(Ljava/lang/Object;)V:GetVisitedItem_Ljava_lang_Object_Handler:PSPDFKit.UI.Navigation.NavigationBackStack/IBackStackListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Navigation.NavigationBackStack+IBackStackListenerImplementor, PSPDFKit.Android", NavigationBackStack_BackStackListenerImplementor.class, __md_methods);
	}


	public NavigationBackStack_BackStackListenerImplementor ()
	{
		super ();
		if (getClass () == NavigationBackStack_BackStackListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Navigation.NavigationBackStack+IBackStackListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onBackStackChanged ()
	{
		n_onBackStackChanged ();
	}

	private native void n_onBackStackChanged ();


	public void visitedItem (java.lang.Object p0)
	{
		n_visitedItem (p0);
	}

	private native void n_visitedItem (java.lang.Object p0);

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
