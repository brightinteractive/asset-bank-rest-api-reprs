package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable attribute list value model.
 * 
 * Eg
 * {
 *     "value": "foobar"
 *     <-- ETC -->
 * }
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="listAttributeValue")
public class ListAttributeValueRepr
{
	public URL url;
	public String value;
	public String additionalValue;

    public ListAttributeValueRepr()
    {
    	value = "";
    	additionalValue = "";
    }

    public ListAttributeValueRepr(URL a_url,
								  String a_value,
								  String a_additionalValue)
	{
		url = a_url;
    	value = a_value;
    	additionalValue = a_additionalValue;
	}
}
