package mono.com.pdftron.pdf.controls;


public class PdfViewCtrlTabHostFragment_TabHostListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pdftron.pdf.controls.PdfViewCtrlTabHostFragment.TabHostListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_canRecreateActivity:()Z:GetCanRecreateActivityHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_canShowFileCloseSnackbar:()Z:GetCanShowFileCloseSnackbarHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_canShowFileInFolder:()Z:GetCanShowFileInFolderHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onExitSearchMode:()V:GetOnExitSearchModeHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onJumpToSdCardFolder:()V:GetOnJumpToSdCardFolderHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onLastTabClosed:()V:GetOnLastTabClosedHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onNavButtonPressed:()V:GetOnNavButtonPressedHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onOpenDocError:()V:GetOnOpenDocErrorHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onShowFileInFolder:(Ljava/lang/String;Ljava/lang/String;I)V:GetOnShowFileInFolder_Ljava_lang_String_Ljava_lang_String_IHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onStartSearchMode:()V:GetOnStartSearchModeHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onTabChanged:(Ljava/lang/String;)V:GetOnTabChanged_Ljava_lang_String_Handler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onTabDocumentLoaded:(Ljava/lang/String;)V:GetOnTabDocumentLoaded_Ljava_lang_String_Handler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onTabHostHidden:()V:GetOnTabHostHiddenHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onTabHostShown:()V:GetOnTabHostShownHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onTabPaused:(Lcom/pdftron/pdf/model/FileInfo;Z)V:GetOnTabPaused_Lcom_pdftron_pdf_model_FileInfo_ZHandler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onToolbarCreateOptionsMenu:(Landroid/view/Menu;Landroid/view/MenuInflater;)Z:GetOnToolbarCreateOptionsMenu_Landroid_view_Menu_Landroid_view_MenuInflater_Handler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onToolbarOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnToolbarOptionsItemSelected_Landroid_view_MenuItem_Handler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"n_onToolbarPrepareOptionsMenu:(Landroid/view/Menu;)Z:GetOnToolbarPrepareOptionsMenu_Landroid_view_Menu_Handler:pdftron.PDF.Controls.PdfViewCtrlTabHostFragment/ITabHostListenerInvoker, PDFViewCtrlTools\n" +
			"";
		mono.android.Runtime.register ("pdftron.PDF.Controls.PdfViewCtrlTabHostFragment+ITabHostListenerImplementor, PDFViewCtrlTools", PdfViewCtrlTabHostFragment_TabHostListenerImplementor.class, __md_methods);
	}


	public PdfViewCtrlTabHostFragment_TabHostListenerImplementor ()
	{
		super ();
		if (getClass () == PdfViewCtrlTabHostFragment_TabHostListenerImplementor.class)
			mono.android.TypeManager.Activate ("pdftron.PDF.Controls.PdfViewCtrlTabHostFragment+ITabHostListenerImplementor, PDFViewCtrlTools", "", this, new java.lang.Object[] {  });
	}


	public boolean canRecreateActivity ()
	{
		return n_canRecreateActivity ();
	}

	private native boolean n_canRecreateActivity ();


	public boolean canShowFileCloseSnackbar ()
	{
		return n_canShowFileCloseSnackbar ();
	}

	private native boolean n_canShowFileCloseSnackbar ();


	public boolean canShowFileInFolder ()
	{
		return n_canShowFileInFolder ();
	}

	private native boolean n_canShowFileInFolder ();


	public void onExitSearchMode ()
	{
		n_onExitSearchMode ();
	}

	private native void n_onExitSearchMode ();


	public void onJumpToSdCardFolder ()
	{
		n_onJumpToSdCardFolder ();
	}

	private native void n_onJumpToSdCardFolder ();


	public void onLastTabClosed ()
	{
		n_onLastTabClosed ();
	}

	private native void n_onLastTabClosed ();


	public void onNavButtonPressed ()
	{
		n_onNavButtonPressed ();
	}

	private native void n_onNavButtonPressed ();


	public void onOpenDocError ()
	{
		n_onOpenDocError ();
	}

	private native void n_onOpenDocError ();


	public void onShowFileInFolder (java.lang.String p0, java.lang.String p1, int p2)
	{
		n_onShowFileInFolder (p0, p1, p2);
	}

	private native void n_onShowFileInFolder (java.lang.String p0, java.lang.String p1, int p2);


	public void onStartSearchMode ()
	{
		n_onStartSearchMode ();
	}

	private native void n_onStartSearchMode ();


	public void onTabChanged (java.lang.String p0)
	{
		n_onTabChanged (p0);
	}

	private native void n_onTabChanged (java.lang.String p0);


	public void onTabDocumentLoaded (java.lang.String p0)
	{
		n_onTabDocumentLoaded (p0);
	}

	private native void n_onTabDocumentLoaded (java.lang.String p0);


	public void onTabHostHidden ()
	{
		n_onTabHostHidden ();
	}

	private native void n_onTabHostHidden ();


	public void onTabHostShown ()
	{
		n_onTabHostShown ();
	}

	private native void n_onTabHostShown ();


	public void onTabPaused (com.pdftron.pdf.model.FileInfo p0, boolean p1)
	{
		n_onTabPaused (p0, p1);
	}

	private native void n_onTabPaused (com.pdftron.pdf.model.FileInfo p0, boolean p1);


	public boolean onToolbarCreateOptionsMenu (android.view.Menu p0, android.view.MenuInflater p1)
	{
		return n_onToolbarCreateOptionsMenu (p0, p1);
	}

	private native boolean n_onToolbarCreateOptionsMenu (android.view.Menu p0, android.view.MenuInflater p1);


	public boolean onToolbarOptionsItemSelected (android.view.MenuItem p0)
	{
		return n_onToolbarOptionsItemSelected (p0);
	}

	private native boolean n_onToolbarOptionsItemSelected (android.view.MenuItem p0);


	public boolean onToolbarPrepareOptionsMenu (android.view.Menu p0)
	{
		return n_onToolbarPrepareOptionsMenu (p0);
	}

	private native boolean n_onToolbarPrepareOptionsMenu (android.view.Menu p0);

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
