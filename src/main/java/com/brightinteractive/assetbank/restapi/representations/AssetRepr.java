package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
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
	public boolean submitted;
	public boolean approved;
	public String type;
	public Collection<URL> parents;
	
	public URL url;
	public URL contentUrl;
	public URL contentUrlUrl;
	public URL displayUrl;
	public URL thumbnailUrl;
	public URL previewUrl;
	public URL fullSizePreviewUrl;

	@XmlElementWrapper
	@XmlElement(name = "attribute")
	public List<AttributeValueRepr> attributes;

    @SuppressWarnings("unused") // needed to keep JAXB happy
	public AssetRepr() throws MalformedURLException
    {
    	attributes = new ArrayList<AttributeValueRepr>();
    }

	public AssetRepr(URL url, 
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
		this.submitted = submitted;
		this.approved = approved;
		this.url = url;
		this.contentUrl = contentUrl;
		this.contentUrlUrl = contentUrlUrl;
		this.displayUrl = displayUrl;
		this.thumbnailUrl = thumbnailUrl;
		this.previewUrl = previewUrl;
		this.fullSizePreviewUrl = fullSizePreviewUrl;
		this.attributes = Collections.unmodifiableList(attributes);
		this.parents = parents;
		this.type = type;
	}
	
	
	public boolean hasParentsSpecified()
	{
		return parents != null;
	}
	
	
	
	public String getAttributeValue(long attributeId)
	{
		for (AttributeValueRepr attributeValue : attributes)
		{
			if (attributeValue.id == attributeId)
			{
				return attributeValue.value;
			}
		}
		return null;
	}
	
	
	public void updateAttributeValue(long attributeId, String newAttributeValue)
	{
		for (AttributeValueRepr attributeValue : attributes)
		{
			if (attributeValue.id == attributeId)
			{
				attributeValue.value = newAttributeValue;
				break;
			}
		}
	}
}
