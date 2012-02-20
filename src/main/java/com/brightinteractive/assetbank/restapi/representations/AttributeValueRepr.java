package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable attribute value info model.
 * 
 * Eg
 * {
 *     "name": "foo",
 *     "value": "bar"
 *     <-- ETC -->
 * }
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="attributeValue")
public class AttributeValueRepr 
{
	public Long id;
	public String name;
	public String value;

    public AttributeValueRepr() 
    {
    	id = 0L;
    	name = "";
    	value = "";
    }

	public AttributeValueRepr(Long a_key, String a_name, String a_value) {
		id = a_key;
		name = a_name;
		value = a_value;
	}
}