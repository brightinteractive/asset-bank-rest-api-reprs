/*Copyright 2015 Bright Interactive, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "asset-type-relationship")
public class AssetEntityRelationshipRepr
{
	public AssetEntityRelationshipRepr()
	{
	}

	public AssetEntityRelationshipRepr(URL relatesToAssetTypeId, long defaultRelationshipCategoryId, String relationshipDescriptionLabel, boolean includeChildrenInDownload)
	{
	
		this.relatesToAssetTypeId = relatesToAssetTypeId;
		this.defaultRelationshipCategoryId = defaultRelationshipCategoryId;
		this.relationshipDescriptionLabel = relationshipDescriptionLabel;
		this.includeChildrenInDownload = includeChildrenInDownload;
	}

	public URL relatesToAssetTypeId;
	public long defaultRelationshipCategoryId;
	public String relationshipDescriptionLabel;
	public boolean includeChildrenInDownload;
}
