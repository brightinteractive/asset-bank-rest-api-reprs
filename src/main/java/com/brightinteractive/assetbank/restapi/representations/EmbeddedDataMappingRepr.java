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
	public String displayName = "";
	public String tagName = "";
	public String mappingDirection = "";
	public URL attributeUrl;
	public String attributeLabel = "";

	public EmbeddedDataMappingRepr()
	{
	}

	public EmbeddedDataMappingRepr(URL url,
								   String type,
								   String displayName,
								   String tagName,
								   String mappingDirection,
								   URL attributeUrl,
								   String attributeLabel)
	{
		this.url = url;
		this.type = type;
		this.displayName = displayName;
		this.tagName = tagName;
		this.mappingDirection = mappingDirection;
		this.attributeUrl = attributeUrl;
		this.attributeLabel = attributeLabel;
	}
}
