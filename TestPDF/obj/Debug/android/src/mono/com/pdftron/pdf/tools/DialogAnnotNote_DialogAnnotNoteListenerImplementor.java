package mono.com.pdftron.pdf.tools;


public class DialogAnnotNote_DialogAnnotNoteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.tools.DialogAnnotNote.DialogAnnotNoteListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotButtonPressed:(I)V:GetOnAnnotButtonPressed_IHandler:pdftron.PDF.Tools.DialogAnnotNote/IDialogAnnotNoteListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Tools.DialogAnnotNote+IDialogAnnotNoteListenerImplementor, PDFViewCtrlTools", DialogAnnotNote_DialogAnnotNoteListenerImplementor.class, __md_methods);
	}


	public DialogAnnotNote_DialogAnnotNoteListenerImplementor ()
	{
		super ();
		if (getClass () == DialogAnnotNote_DialogAnnotNoteListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Tools.DialogAnnotNote+IDialogAnnotNoteListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotButtonPressed (int p0)
	{
		n_onAnnotButtonPressed (p0);
	}

	private native void n_onAnnotButtonPressed (int p0);

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
