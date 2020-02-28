package mono.com.pspdfkit.ui.audio;


public class AudioModeListeners_AudioRecordingModeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.audio.AudioModeListeners.AudioRecordingModeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChangeAudioRecordingMode:(Lcom/pspdfkit/ui/audio/AudioRecordingController;)V:GetOnChangeAudioRecordingMode_Lcom_pspdfkit_ui_audio_AudioRecordingController_Handler:PSPDFKit.UI.Audio.IAudioModeListenersAudioRecordingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onEnterAudioRecordingMode:(Lcom/pspdfkit/ui/audio/AudioRecordingController;)V:GetOnEnterAudioRecordingMode_Lcom_pspdfkit_ui_audio_AudioRecordingController_Handler:PSPDFKit.UI.Audio.IAudioModeListenersAudioRecordingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"n_onExitAudioRecordingMode:(Lcom/pspdfkit/ui/audio/AudioRecordingController;)V:GetOnExitAudioRecordingMode_Lcom_pspdfkit_ui_audio_AudioRecordingController_Handler:PSPDFKit.UI.Audio.IAudioModeListenersAudioRecordingModeChangeListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Audio.IAudioModeListenersAudioRecordingModeChangeListenerImplementor, PSPDFKit.Android", AudioModeListeners_AudioRecordingModeChangeListenerImplementor.class, __md_methods);
	}


	public AudioModeListeners_AudioRecordingModeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AudioModeListeners_AudioRecordingModeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Audio.IAudioModeListenersAudioRecordingModeChangeListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onChangeAudioRecordingMode (com.pspdfkit.ui.audio.AudioRecordingController p0)
	{
		n_onChangeAudioRecordingMode (p0);
	}

	private native void n_onChangeAudioRecordingMode (com.pspdfkit.ui.audio.AudioRecordingController p0);


	public void onEnterAudioRecordingMode (com.pspdfkit.ui.audio.AudioRecordingController p0)
	{
		n_onEnterAudioRecordingMode (p0);
	}

	private native void n_onEnterAudioRecordingMode (com.pspdfkit.ui.audio.AudioRecordingController p0);


	public void onExitAudioRecordingMode (com.pspdfkit.ui.audio.AudioRecordingController p0)
	{
		n_onExitAudioRecordingMode (p0);
	}

	private native void n_onExitAudioRecordingMode (com.pspdfkit.ui.audio.AudioRecordingController p0);

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
