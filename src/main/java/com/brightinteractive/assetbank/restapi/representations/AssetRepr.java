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
	public Collection<Long> parentIds;
	
	public URL url;
	public URL contentUrl;
	public URL displayUrl;
	@XmlElementWrapper
	@XmlElement(name = "attribute")
	public List<AttributeValueRepr> attributes;

    @SuppressWarnings("unused") // needed to keep JAXB happy
	public AssetRepr() throws MalformedURLException
    {
    	attributes = new ArrayList<AttributeValueRepr>();
    }

	public AssetRepr(URL url, URL contentUrl, URL displayUrl, List<AttributeValueRepr> attributes, boolean submitted, Collection<Long> parentIds)
	{
		this.submitted = submitted;
		this.url = url;
		this.contentUrl = contentUrl;
		this.displayUrl = displayUrl;
		this.attributes = Collections.unmodifiableList(attributes);
		this.parentIds = parentIds;
	}
	
	
	public boolean hasParentIdsSpecified()
	{
		return parentIds != null;
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
