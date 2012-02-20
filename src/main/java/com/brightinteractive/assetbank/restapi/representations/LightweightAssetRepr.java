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
	public URL fullAssetUrl;
	public URL thumbnailUrl;
	@XmlElementWrapper
	@XmlElement(name = "displayAttribute")
	public List<DisplayAttributeRepr> displayAttributes = new ArrayList<DisplayAttributeRepr>();

    public LightweightAssetRepr() throws MalformedURLException 
    {
    }

	public LightweightAssetRepr(long a_id, URL a_fullAssetUrl)
	{
		id = a_id;
		fullAssetUrl = a_fullAssetUrl;
	}
}
