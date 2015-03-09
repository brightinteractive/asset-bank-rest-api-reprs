/*Copyright 2015 Bright Interactive, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="asset-type-relationship")
public class AssetEntityRelationshipRepr
{
	public URL relatesToAssetTypeId;
	public long defaultRelationshipCategoryId;
	public String relationshipDescriptionLabel;
	public boolean includeChildrenInDownload;	
}
