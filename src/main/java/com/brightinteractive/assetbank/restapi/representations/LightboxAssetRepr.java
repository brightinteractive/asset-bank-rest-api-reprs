package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
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

	public LightboxAssetRepr(URL assetInLightboxUrl,
							 URL url,
							 URL contentUrl,
							 URL contentUrlUrl,
							 URL displayUrl,
							 URL thumbnailUrl,
							 URL previewUrl,
							 URL fullSizePreviewUrl,
							 List<AttributeValueRepr> attributes,
							 boolean submitted,
							 boolean approved,
							 Collection<URL> parents,
							 String type)
	{
		super(url, contentUrl, contentUrlUrl, displayUrl, thumbnailUrl, previewUrl, fullSizePreviewUrl, attributes, submitted, approved, parents, type);
		this.assetInLightboxUrl = assetInLightboxUrl;
	}


}
