package mono.com.pspdfkit.ui.audio;


public class AudioPlaybackController_AudioPlaybackListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.audio.AudioPlaybackController.AudioPlaybackListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(Lcom/pspdfkit/ui/audio/AudioPlaybackController;Ljava/lang/Throwable;)V:GetOnError_Lcom_pspdfkit_ui_audio_AudioPlaybackController_Ljava_lang_Throwable_Handler:PSPDFKit.UI.Audio.IAudioPlaybackControllerAudioPlaybackListenerInvoker, PSPDFKit.Android\n" +
			"n_onPause:(Lcom/pspdfkit/ui/audio/AudioPlaybackController;)V:GetOnPause_Lcom_pspdfkit_ui_audio_AudioPlaybackController_Handler:PSPDFKit.UI.Audio.IAudioPlaybackControllerAudioPlaybackListenerInvoker, PSPDFKit.Android\n" +
			"n_onPlay:(Lcom/pspdfkit/ui/audio/AudioPlaybackController;)V:GetOnPlay_Lcom_pspdfkit_ui_audio_AudioPlaybackController_Handler:PSPDFKit.UI.Audio.IAudioPlaybackControllerAudioPlaybackListenerInvoker, PSPDFKit.Android\n" +
			"n_onReady:(Lcom/pspdfkit/ui/audio/AudioPlaybackController;)V:GetOnReady_Lcom_pspdfkit_ui_audio_AudioPlaybackController_Handler:PSPDFKit.UI.Audio.IAudioPlaybackControllerAudioPlaybackListenerInvoker, PSPDFKit.Android\n" +
			"n_onStop:(Lcom/pspdfkit/ui/audio/AudioPlaybackController;)V:GetOnStop_Lcom_pspdfkit_ui_audio_AudioPlaybackController_Handler:PSPDFKit.UI.Audio.IAudioPlaybackControllerAudioPlaybackListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Audio.IAudioPlaybackControllerAudioPlaybackListenerImplementor, PSPDFKit.Android", AudioPlaybackController_AudioPlaybackListenerImplementor.class, __md_methods);
	}


	public AudioPlaybackController_AudioPlaybackListenerImplementor ()
	{
		super ();
		if (getClass () == AudioPlaybackController_AudioPlaybackListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Audio.IAudioPlaybackControllerAudioPlaybackListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onError (com.pspdfkit.ui.audio.AudioPlaybackController p0, java.lang.Throwable p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (com.pspdfkit.ui.audio.AudioPlaybackController p0, java.lang.Throwable p1);


	public void onPause (com.pspdfkit.ui.audio.AudioPlaybackController p0)
	{
		n_onPause (p0);
	}

	private native void n_onPause (com.pspdfkit.ui.audio.AudioPlaybackController p0);


	public void onPlay (com.pspdfkit.ui.audio.AudioPlaybackController p0)
	{
		n_onPlay (p0);
	}

	private native void n_onPlay (com.pspdfkit.ui.audio.AudioPlaybackController p0);


	public void onReady (com.pspdfkit.ui.audio.AudioPlaybackController p0)
	{
		n_onReady (p0);
	}

	private native void n_onReady (com.pspdfkit.ui.audio.AudioPlaybackController p0);


	public void onStop (com.pspdfkit.ui.audio.AudioPlaybackController p0)
	{
		n_onStop (p0);
	}

	private native void n_onStop (com.pspdfkit.ui.audio.AudioPlaybackController p0);

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
