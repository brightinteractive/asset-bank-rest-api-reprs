package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable Asset ID model.
 * 
 * Eg
 * 
 * {
 *     "assetId": 123
 * }
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="assetId")
public class AssetIdRepr
{

	public long assetId;

    // just to make JAXB happy
    public AssetIdRepr()
    {
    	assetId = 0;
    }

	public AssetIdRepr(long a_assetId) 
	{
		assetId = a_assetId;
	}
}
