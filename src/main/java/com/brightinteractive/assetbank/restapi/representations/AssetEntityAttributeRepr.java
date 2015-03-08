/*Copyright 2015 Bright Interactive, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="asset-type-attribute")
public class AssetEntityAttributeRepr
{	
	public URL attributeUrl;
	public boolean visibleOnAdd;
	public String valueIfNotVisible;
}
