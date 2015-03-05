package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "asset")
public class LightboxAssetRepr extends AssetRepr
{

	public URL assetInLightboxUrl;

	@SuppressWarnings("unused") // needed to keep JAXB happy
	public LightboxAssetRepr() throws MalformedURLException
	{
		super();
	}

	public LightboxAssetRepr(URL a_assetInLightboxUrl, URL a_url, URL a_contentUrl, URL a_displayUrl, List<AttributeValueRepr> a_attributes, boolean submitted, Collection<Long> parentIds)
	{
		super(a_url, a_contentUrl, a_displayUrl, a_attributes, submitted, parentIds);
		assetInLightboxUrl = a_assetInLightboxUrl;
	}


}
