package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@XmlRootElement(name = "asset")
public class LightboxAssetRepr extends AssetRepr
{

	public URL assetInLightboxUrl;

	@SuppressWarnings("unused") // needed to keep JAXB happy
	public LightboxAssetRepr() throws MalformedURLException
	{
		super();
	}

	public LightboxAssetRepr(URL a_assetInLightboxUrl, URL a_url, URL a_contentUrl, URL a_displayUrl, List<AttributeValueRepr> a_attributes, boolean submitted)
	{
		super(a_url, a_contentUrl, a_displayUrl, a_attributes, submitted);
		assetInLightboxUrl = a_assetInLightboxUrl;
	}


}
