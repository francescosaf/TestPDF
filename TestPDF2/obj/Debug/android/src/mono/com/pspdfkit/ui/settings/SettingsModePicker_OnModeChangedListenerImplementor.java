package mono.com.pspdfkit.ui.settings;


public class SettingsModePicker_OnModeChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.ui.settings.SettingsModePicker.OnModeChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_OnPageLayoutChange:(Lcom/pspdfkit/configuration/page/PageLayoutMode;)V:GetOnPageLayoutChange_Lcom_pspdfkit_configuration_page_PageLayoutMode_Handler:PSPDFKit.UI.Settings.SettingsModePicker/IOnModeChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_OnScreenTimeoutChange:(J)V:GetOnScreenTimeoutChange_JHandler:PSPDFKit.UI.Settings.SettingsModePicker/IOnModeChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_OnScrollDirectionChange:(Lcom/pspdfkit/configuration/page/PageScrollDirection;)V:GetOnScrollDirectionChange_Lcom_pspdfkit_configuration_page_PageScrollDirection_Handler:PSPDFKit.UI.Settings.SettingsModePicker/IOnModeChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_OnScrollModeChange:(Lcom/pspdfkit/configuration/page/PageScrollMode;)V:GetOnScrollModeChange_Lcom_pspdfkit_configuration_page_PageScrollMode_Handler:PSPDFKit.UI.Settings.SettingsModePicker/IOnModeChangedListenerInvoker, PSPDFKit.Android\n" +
			"n_OnThemeChange:(Lcom/pspdfkit/configuration/theming/ThemeMode;)V:GetOnThemeChange_Lcom_pspdfkit_configuration_theming_ThemeMode_Handler:PSPDFKit.UI.Settings.SettingsModePicker/IOnModeChangedListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.UI.Settings.SettingsModePicker+IOnModeChangedListenerImplementor, PSPDFKit.Android", SettingsModePicker_OnModeChangedListenerImplementor.class, __md_methods);
	}


	public SettingsModePicker_OnModeChangedListenerImplementor ()
	{
		super ();
		if (getClass () == SettingsModePicker_OnModeChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.UI.Settings.SettingsModePicker+IOnModeChangedListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public void OnPageLayoutChange (com.pspdfkit.configuration.page.PageLayoutMode p0)
	{
		n_OnPageLayoutChange (p0);
	}

	private native void n_OnPageLayoutChange (com.pspdfkit.configuration.page.PageLayoutMode p0);


	public void OnScreenTimeoutChange (long p0)
	{
		n_OnScreenTimeoutChange (p0);
	}

	private native void n_OnScreenTimeoutChange (long p0);


	public void OnScrollDirectionChange (com.pspdfkit.configuration.page.PageScrollDirection p0)
	{
		n_OnScrollDirectionChange (p0);
	}

	private native void n_OnScrollDirectionChange (com.pspdfkit.configuration.page.PageScrollDirection p0);


	public void OnScrollModeChange (com.pspdfkit.configuration.page.PageScrollMode p0)
	{
		n_OnScrollModeChange (p0);
	}

	private native void n_OnScrollModeChange (com.pspdfkit.configuration.page.PageScrollMode p0);


	public void OnThemeChange (com.pspdfkit.configuration.theming.ThemeMode p0)
	{
		n_OnThemeChange (p0);
	}

	private native void n_OnThemeChange (com.pspdfkit.configuration.theming.ThemeMode p0);

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
