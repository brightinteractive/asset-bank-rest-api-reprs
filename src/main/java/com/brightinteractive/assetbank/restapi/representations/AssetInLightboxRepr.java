package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;

@XmlRootElement(name="assetInLightbox")
public class AssetInLightboxRepr
{
	public URL assetInstanceUrl;
	public URL lightboxInstanceUrl;

	public AssetInLightboxRepr()
	{
	}

	public AssetInLightboxRepr(URL a_assetInstanceUrl, URL a_lightboxInstanceUrl)
	{
		assetInstanceUrl = a_assetInstanceUrl;
		lightboxInstanceUrl = a_lightboxInstanceUrl;
	}
}
