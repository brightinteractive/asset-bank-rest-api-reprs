package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable attribute model.
 * 
 * Eg
 * {
 *     "label": "foobar",
 *     <-- ETC -->
 * }
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="attribute")
public class AttributeRepr 
{
	public long id;
	public String label;
	public long typeId;
	public URL url;
	public URL listValuesUrl;
	
    public AttributeRepr() throws MalformedURLException
    {
    	url = new URL("http://example.com");
    }

	public AttributeRepr(long a_id,
						 String a_label,
						 long a_typeId,
						 URL a_url,
						 URL a_listValuesUrl)
	{
		id = a_id;
		label = a_label;
		typeId = a_typeId;
		url = a_url;
		listValuesUrl = a_listValuesUrl;
	}
}