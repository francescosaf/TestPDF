package mono.com.pspdfkit.document.download;


public class DownloadJob_ProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.document.download.DownloadJob.ProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onComplete:(Ljava/io/File;)V:GetOnComplete_Ljava_io_File_Handler:PSPDFKit.Document.Download.DownloadJob/IProgressListenerInvoker, PSPDFKit.Android\n" +
			"n_onError:(Ljava/lang/Throwable;)V:GetOnError_Ljava_lang_Throwable_Handler:PSPDFKit.Document.Download.DownloadJob/IProgressListenerInvoker, PSPDFKit.Android\n" +
			"n_onProgress:(Lcom/pspdfkit/document/download/Progress;)V:GetOnProgress_Lcom_pspdfkit_document_download_Progress_Handler:PSPDFKit.Document.Download.DownloadJob/IProgressListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Document.Download.DownloadJob+IProgressListenerImplementor, PSPDFKit.Android", DownloadJob_ProgressListenerImplementor.class, __md_methods);
	}


	public DownloadJob_ProgressListenerImplementor ()
	{
		super ();
		if (getClass () == DownloadJob_ProgressListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Document.Download.DownloadJob+IProgressListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onComplete (java.io.File p0)
	{
		n_onComplete (p0);
	}

	private native void n_onComplete (java.io.File p0);


	public void onError (java.lang.Throwable p0)
	{
		n_onError (p0);
	}

	private native void n_onError (java.lang.Throwable p0);


	public void onProgress (com.pspdfkit.document.download.Progress p0)
	{
		n_onProgress (p0);
	}

	private native void n_onProgress (com.pspdfkit.document.download.Progress p0);

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
