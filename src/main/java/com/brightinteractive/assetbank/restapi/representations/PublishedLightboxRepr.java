package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Bright Interactive
 */
@XmlRootElement(name="publishedLightbox")
public class PublishedLightboxRepr 
{
	public URL publishedLightboxUrl;

    public PublishedLightboxRepr()
    {
	}

	public PublishedLightboxRepr(URL publishedLightboxUrl
	)
	{
		this.publishedLightboxUrl = publishedLightboxUrl;
	}
}