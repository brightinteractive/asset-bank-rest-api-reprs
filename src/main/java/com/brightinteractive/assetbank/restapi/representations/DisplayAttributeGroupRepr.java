package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="displayAttributeGroup")
public class DisplayAttributeGroupRepr 
{
	public URL url;
	
	@XmlElementWrapper
    @XmlElement(name = "attribute")
    public List<AttributeRepr> attributes;
	public String name = null;
	public long id;
	public long displayAreaId;
	public long entityId;

	public DisplayAttributeGroupRepr() throws MalformedURLException 
    {
    	url = new URL("http://example.com");
    }

	public DisplayAttributeGroupRepr(URL a_url,
					List<AttributeRepr> a_attributes,
					String a_name,
					long a_id,
					long a_displayAreaId,
					long a_entityId) throws MalformedURLException 
	{
		url = a_url;
		attributes = a_attributes;
		name = a_name;
		id = a_id;
		displayAreaId = a_displayAreaId;
		entityId = a_entityId;
	}
}