package mono.com.pspdfkit.listeners;


public class LocalizationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.pspdfkit.listeners.LocalizationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getLocalizedQuantityString:(Landroid/content/Context;ILjava/util/Locale;Landroid/view/View;I[Ljava/lang/Object;)Ljava/lang/String;:GetGetLocalizedQuantityString_Landroid_content_Context_ILjava_util_Locale_Landroid_view_View_IarrayLjava_lang_Object_Handler:PSPDFKit.Listeners.ILocalizationListenerInvoker, PSPDFKit.Android\n" +
			"n_getLocalizedString:(Landroid/content/Context;ILjava/util/Locale;Landroid/view/View;)Ljava/lang/String;:GetGetLocalizedString_Landroid_content_Context_ILjava_util_Locale_Landroid_view_View_Handler:PSPDFKit.Listeners.ILocalizationListenerInvoker, PSPDFKit.Android\n" +
			"n_getLocalizedString:(Landroid/content/Context;ILjava/util/Locale;Landroid/view/View;[Ljava/lang/Object;)Ljava/lang/String;:GetGetLocalizedStr_Landroid_content_Context_ILjava_util_Locale_Landroid_view_View_arrayLjava_lang_Object_Handler:PSPDFKit.Listeners.ILocalizationListenerInvoker, PSPDFKit.Android\n" +
			"";
		mono.android.Runtime.register ("PSPDFKit.Listeners.ILocalizationListenerImplementor, PSPDFKit.Android", LocalizationListenerImplementor.class, __md_methods);
	}


	public LocalizationListenerImplementor ()
	{
		super ();
		if (getClass () == LocalizationListenerImplementor.class)
			mono.android.TypeManager.Activate ("PSPDFKit.Listeners.ILocalizationListenerImplementor, PSPDFKit.Android", "", this, new java.lang.Object[] {  });
	}


	public java.lang.String getLocalizedQuantityString (android.content.Context p0, int p1, java.util.Locale p2, android.view.View p3, int p4, java.lang.Object[] p5)
	{
		return n_getLocalizedQuantityString (p0, p1, p2, p3, p4, p5);
	}

	private native java.lang.String n_getLocalizedQuantityString (android.content.Context p0, int p1, java.util.Locale p2, android.view.View p3, int p4, java.lang.Object[] p5);


	public java.lang.String getLocalizedString (android.content.Context p0, int p1, java.util.Locale p2, android.view.View p3)
	{
		return n_getLocalizedString (p0, p1, p2, p3);
	}

	private native java.lang.String n_getLocalizedString (android.content.Context p0, int p1, java.util.Locale p2, android.view.View p3);


	public java.lang.String getLocalizedString (android.content.Context p0, int p1, java.util.Locale p2, android.view.View p3, java.lang.Object[] p4)
	{
		return n_getLocalizedString (p0, p1, p2, p3, p4);
	}

	private native java.lang.String n_getLocalizedString (android.content.Context p0, int p1, java.util.Locale p2, android.view.View p3, java.lang.Object[] p4);

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
