package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;

public class AssetInLightboxRepr
{
	public URL assetInstanceUrl;
	public URL lightboxInstanceUrl;

	public AssetInLightboxRepr(URL a_assetInstanceUrl, URL a_lightboxInstanceUrl)
	{
		assetInstanceUrl = a_assetInstanceUrl;
		lightboxInstanceUrl = a_lightboxInstanceUrl;
	}
}
