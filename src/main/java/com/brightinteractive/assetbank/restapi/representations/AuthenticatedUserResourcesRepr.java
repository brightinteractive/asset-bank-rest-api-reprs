package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "authenticatedUserResources")
public class AuthenticatedUserResourcesRepr
{
	public URL url;

	public URL lightboxesUrl;

	// just to make JAXB happy
	public AuthenticatedUserResourcesRepr()
	{
	}

	public AuthenticatedUserResourcesRepr(URL url,
										  URL lightboxesUrl)
	{
		this.url = url;
		this.lightboxesUrl = lightboxesUrl;
	}
}
