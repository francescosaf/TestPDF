package mono.com.pspdfkit.ui.audio;


public class AudioRecordingController_AudioRecordingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.audio.AudioRecordingController.AudioRecordingListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(Lcom/pspdfkit/ui/audio/AudioRecordingController;Ljava/lang/Throwable;)V:GetOnError_Lcom_pspdfkit_ui_audio_AudioRecordingController_Ljava_lang_Throwable_Handler:PSPDFKit.UI.Audio.IAudioRecordingControllerAudioRecordingListenerInvoker, PSPDFKit.Android\n" +
			"n_onPause:(Lcom/pspdfkit/ui/audio/AudioRecordingController;)V:GetOnPause_Lcom_pspdfkit_ui_audio_AudioRecordingController_Handler:PSPDFKit.UI.Audio.IAudioRecordingControllerAudioRecordingListenerInvoker, PSPDFKit.Android\n" +
			"n_onReady:(Lcom/pspdfkit/ui/audio/AudioRecordingController;)V:GetOnReady_Lcom_pspdfkit_ui_audio_AudioRecordingController_Handler:PSPDFKit.UI.Audio.IAudioRecordingControllerAudioRecordingListenerInvoker, PSPDFKit.Android\n" +
			"n_onRecord:(Lcom/pspdfkit/ui/audio/AudioRecordingController;)V:GetOnRecord_Lcom_pspdfkit_ui_audio_AudioRecordingController_Handler:PSPDFKit.UI.Audio.IAudioRecordingControllerAudioRecordingListenerInvoker, PSPDFKit.Android\n" +
			"n_onSave:(Lcom/pspdfkit/ui/audio/AudioRecordingController;)V:GetOnSave_Lcom_pspdfkit_ui_audio_AudioRecordingController_Handler:PSPDFKit.UI.Audio.IAudioRecordingControllerAudioRecordingListenerInvoker, PSPDFKit.Android\n" +
			"n_onStop:(Lcom/pspdfkit/ui/audio/AudioRecordingController;)V:GetOnStop_Lcom_pspdfkit_ui_audio_AudioRecordingController_Handler:PSPDFKit.UI.Audio.IAudioRecordingControllerAudioRecordingListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Audio.IAudioRecordingControllerAudioRecordingListenerImplementor, PSPDFKit.Android", AudioRecordingController_AudioRecordingListenerImplementor.class, __md_methods);
	}


	public AudioRecordingController_AudioRecordingListenerImplementor ()
	{
		super ();
		if (getClass () == AudioRecordingController_AudioRecordingListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Audio.IAudioRecordingControllerAudioRecordingListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onError (com.pspdfkit.ui.audio.AudioRecordingController p0, java.lang.Throwable p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (com.pspdfkit.ui.audio.AudioRecordingController p0, java.lang.Throwable p1);


	public void onPause (com.pspdfkit.ui.audio.AudioRecordingController p0)
	{
		n_onPause (p0);
	}

	private native void n_onPause (com.pspdfkit.ui.audio.AudioRecordingController p0);


	public void onReady (com.pspdfkit.ui.audio.AudioRecordingController p0)
	{
		n_onReady (p0);
	}

	private native void n_onReady (com.pspdfkit.ui.audio.AudioRecordingController p0);


	public void onRecord (com.pspdfkit.ui.audio.AudioRecordingController p0)
	{
		n_onRecord (p0);
	}

	private native void n_onRecord (com.pspdfkit.ui.audio.AudioRecordingController p0);


	public void onSave (com.pspdfkit.ui.audio.AudioRecordingController p0)
	{
		n_onSave (p0);
	}

	private native void n_onSave (com.pspdfkit.ui.audio.AudioRecordingController p0);


	public void onStop (com.pspdfkit.ui.audio.AudioRecordingController p0)
	{
		n_onStop (p0);
	}

	private native void n_onStop (com.pspdfkit.ui.audio.AudioRecordingController p0);

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
