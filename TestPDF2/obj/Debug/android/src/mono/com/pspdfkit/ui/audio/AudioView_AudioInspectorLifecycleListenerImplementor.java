package mono.com.pspdfkit.ui.audio;


public class AudioView_AudioInspectorLifecycleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.audio.AudioView.AudioInspectorLifecycleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDisplayAudioInspector:(Lcom/pspdfkit/ui/audio/AudioView;)V:GetOnDisplayAudioInspector_Lcom_pspdfkit_ui_audio_AudioView_Handler:PSPDFKit.UI.Audio.AudioView/IAudioInspectorLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"n_onPrepareAudioInspector:(Lcom/pspdfkit/ui/audio/AudioView;)V:GetOnPrepareAudioInspector_Lcom_pspdfkit_ui_audio_AudioView_Handler:PSPDFKit.UI.Audio.AudioView/IAudioInspectorLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"n_onRemoveAudioInspector:(Lcom/pspdfkit/ui/audio/AudioView;)V:GetOnRemoveAudioInspector_Lcom_pspdfkit_ui_audio_AudioView_Handler:PSPDFKit.UI.Audio.AudioView/IAudioInspectorLifecycleListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Audio.AudioView+IAudioInspectorLifecycleListenerImplementor, PSPDFKit.Android", AudioView_AudioInspectorLifecycleListenerImplementor.class, __md_methods);
	}


	public AudioView_AudioInspectorLifecycleListenerImplementor ()
	{
		super ();
		if (getClass () == AudioView_AudioInspectorLifecycleListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Audio.AudioView+IAudioInspectorLifecycleListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void onDisplayAudioInspector (com.pspdfkit.ui.audio.AudioView p0)
	{
		n_onDisplayAudioInspector (p0);
	}

	private native void n_onDisplayAudioInspector (com.pspdfkit.ui.audio.AudioView p0);


	public void onPrepareAudioInspector (com.pspdfkit.ui.audio.AudioView p0)
	{
		n_onPrepareAudioInspector (p0);
	}

	private native void n_onPrepareAudioInspector (com.pspdfkit.ui.audio.AudioView p0);


	public void onRemoveAudioInspector (com.pspdfkit.ui.audio.AudioView p0)
	{
		n_onRemoveAudioInspector (p0);
	}

	private native void n_onRemoveAudioInspector (com.pspdfkit.ui.audio.AudioView p0);

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
