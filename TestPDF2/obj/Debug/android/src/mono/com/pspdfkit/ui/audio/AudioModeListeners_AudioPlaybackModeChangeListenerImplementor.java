package mono.com.pspdfkit.ui.audio;


public class AudioModeListeners_AudioPlaybackModeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.audio.AudioModeListeners.AudioPlaybackModeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChangeAudioPlaybackMode:(Lcom/pspdfkit/ui/audio/AudioPlaybackController;)V:GetOnChangeAudioPlaybackMode_Lcom_pspdfkit_ui_audio_AudioPlaybackController_Handler:PSPDFKit.UI.Audio.IAudioModeListenersAudioPlaybackModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onEnterAudioPlaybackMode:(Lcom/pspdfkit/ui/audio/AudioPlaybackController;)V:GetOnEnterAudioPlaybackMode_Lcom_pspdfkit_ui_audio_AudioPlaybackController_Handler:PSPDFKit.UI.Audio.IAudioModeListenersAudioPlaybackModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onExitAudioPlaybackMode:(Lcom/pspdfkit/ui/audio/AudioPlaybackController;)V:GetOnExitAudioPlaybackMode_Lcom_pspdfkit_ui_audio_AudioPlaybackController_Handler:PSPDFKit.UI.Audio.IAudioModeListenersAudioPlaybackModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Audio.IAudioModeListenersAudioPlaybackModeChangeListenerImplementor, PSPDFKit.Android", AudioModeListeners_AudioPlaybackModeChangeListenerImplementor.class, __md_methods);
	}


	public AudioModeListeners_AudioPlaybackModeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AudioModeListeners_AudioPlaybackModeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Audio.IAudioModeListenersAudioPlaybackModeChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onChangeAudioPlaybackMode (com.pspdfkit.ui.audio.AudioPlaybackController p0)
	{
		n_onChangeAudioPlaybackMode (p0);
	}

	private native void n_onChangeAudioPlaybackMode (com.pspdfkit.ui.audio.AudioPlaybackController p0);


	public void onEnterAudioPlaybackMode (com.pspdfkit.ui.audio.AudioPlaybackController p0)
	{
		n_onEnterAudioPlaybackMode (p0);
	}

	private native void n_onEnterAudioPlaybackMode (com.pspdfkit.ui.audio.AudioPlaybackController p0);


	public void onExitAudioPlaybackMode (com.pspdfkit.ui.audio.AudioPlaybackController p0)
	{
		n_onExitAudioPlaybackMode (p0);
	}

	private native void n_onExitAudioPlaybackMode (com.pspdfkit.ui.audio.AudioPlaybackController p0);

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
