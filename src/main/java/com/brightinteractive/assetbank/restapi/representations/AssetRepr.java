package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable asset model.
 *
 * @author Bright Interactive
 */
@XmlRootElement(name = "asset")
public class AssetRepr
{
	public URL url;
	public URL contentUrl;
	public URL displayUrl;
	@XmlElementWrapper
	@XmlElement(name = "attribute")
	public List<AttributeValueRepr> attributes;

    @SuppressWarnings("UnusedDeclaration") // needed to keep JAXB happy
	public AssetRepr() throws MalformedURLException
    {
    	attributes = new ArrayList<AttributeValueRepr>();
    }

	public AssetRepr(URL a_url, URL a_contentUrl, URL a_displayUrl, List<AttributeValueRepr> a_attributes)
	{
		url = a_url;
		contentUrl = a_contentUrl;
		displayUrl = a_displayUrl;
		attributes = Collections.unmodifiableList(a_attributes);
	}
}
