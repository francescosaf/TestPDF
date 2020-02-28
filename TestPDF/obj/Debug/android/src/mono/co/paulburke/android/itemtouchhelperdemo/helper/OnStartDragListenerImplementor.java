package mono.co.paulburke.android.itemtouchhelperdemo.helper;


public class OnStartDragListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		co.paulburke.android.itemtouchhelperdemo.helper.OnStartDragListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStartDrag:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V:GetOnStartDrag_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Handler:CO.Paulburke.Android.Itemtouchhelperdemo.Helper.IOnStartDragListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("CO.Paulburke.Android.Itemtouchhelperdemo.Helper.IOnStartDragListenerImplementor, PDFViewCtrlTools", OnStartDragListenerImplementor.class, __md_methods);
	}


	public OnStartDragListenerImplementor ()
	{
		super ();
		if (getClass () == OnStartDragListenerImplementor.class)
			mono.android.TypeManager.Activate ("CO.Paulburke.Android.Itemtouchhelperdemo.Helper.IOnStartDragListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onStartDrag (androidx.recyclerview.widget.RecyclerView.ViewHolder p0)
	{
		n_onStartDrag (p0);
	}

	private native void n_onStartDrag (androidx.recyclerview.widget.RecyclerView.ViewHolder p0);

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
