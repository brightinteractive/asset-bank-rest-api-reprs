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

	public LightboxAssetRepr(URL assetInLightboxUrl, URL url, URL contentUrl, URL contentUrlUrl, URL displayUrl, List<AttributeValueRepr> attributes, boolean submitted, boolean approved, Collection<URL> parents)
	{
		super(url, contentUrl, contentUrlUrl, displayUrl, attributes, submitted, approved, parents);
		this.assetInLightboxUrl = assetInLightboxUrl;
	}


}
