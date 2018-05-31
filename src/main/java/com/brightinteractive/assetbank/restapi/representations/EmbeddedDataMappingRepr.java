package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;

/**
 * @author Bright Interactive
 */
@XmlRootElement(name = "embeddedDataMapping")
public class EmbeddedDataMappingRepr
{
	public URL url;
	public String type = "";
	public String name = "";
	public String expression = "";
	public String mappingDirection = "";
	public URL attributeUrl;
	public String attributeLabel = "";

	public EmbeddedDataMappingRepr()
	{
	}

	public EmbeddedDataMappingRepr(URL url,
								   String type,
								   String name,
								   String expression,
								   String mappingDirection,
								   URL attributeUrl,
								   String attributeLabel)
	{
		this.url = url;
		this.type = type;
		this.name = name;
		this.expression = expression;
		this.mappingDirection = mappingDirection;
		this.attributeUrl = attributeUrl;
		this.attributeLabel = attributeLabel;
	}
}
