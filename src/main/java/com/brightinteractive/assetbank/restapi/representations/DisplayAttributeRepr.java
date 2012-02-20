package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable LightweightAsset model.
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="displayAttribute")
public class DisplayAttributeRepr 
{
	public String label="";
	public String value="";

    public DisplayAttributeRepr()
    {	
    	/* Empty */
    }
    
    public DisplayAttributeRepr(String a_sLabel, String a_sValue)
    {	
    	label = a_sLabel;
    	value = a_sValue;
    }    

}