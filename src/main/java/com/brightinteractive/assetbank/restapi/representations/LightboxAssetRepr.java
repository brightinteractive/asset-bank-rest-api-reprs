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

	public LightboxAssetRepr(URL assetInLightboxUrl, URL url, URL contentUrl, URL displayUrl, List<AttributeValueRepr> attributes, boolean submitted, Collection<URL> parents)
	{
		super(url, contentUrl, displayUrl, attributes, submitted, parents);
		this.assetInLightboxUrl = assetInLightboxUrl;
	}


}
