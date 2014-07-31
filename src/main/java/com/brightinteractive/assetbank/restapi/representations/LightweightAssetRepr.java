package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable LightweightAsset model.
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="assetSummary")
public class LightweightAssetRepr 
{
	public long id=0;
	public String originalFilename;
	public URL fullAssetUrl;
	public URL thumbnailUrl;
	
	@XmlElementWrapper
	@XmlElement(name = "displayAttribute")
	public List<DisplayAttributeRepr> displayAttributes = new ArrayList<DisplayAttributeRepr>();

    public LightweightAssetRepr() throws MalformedURLException 
    {
    }

	public LightweightAssetRepr(long a_id, URL a_fullAssetUrl, String a_originalFilename)
	{
		id = a_id;
		fullAssetUrl = a_fullAssetUrl;
		originalFilename = a_originalFilename;
	}

	public int getNumberOfDisplayAttributesWithLabel(String a_label)
	{
		return getDisplayAttributeValuesWithLabel(a_label).size();
	}

	public boolean hasDisplayAttributeWithLabel(String a_label)
	{
		return getNumberOfDisplayAttributesWithLabel(a_label) > 0;
	}

	public List<String> getDisplayAttributeValuesWithLabel(String a_label)
	{
		List<String> values = new ArrayList<String>();
		for (DisplayAttributeRepr attribute : displayAttributes)
		{
			if (attribute.label.equals(a_label))
			{
				values.add(attribute.value);
			}
		}

		return values;
	}

	public String getFirstDisplayAttributeValueWithLabel(String a_label)
	{
		List<String> values = getDisplayAttributeValuesWithLabel(a_label);

		return values.isEmpty() ? null: values.get(0);
	}
}
