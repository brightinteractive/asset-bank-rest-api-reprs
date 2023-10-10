/*Copyright 2015 Bright, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import jakarta.xml.bind.annotation.XmlRootElement;

@javax.xml.bind.annotation.XmlRootElement(name = "asset-type-relationship")
@XmlRootElement(name = "asset-type-relationship")
public class AssetEntityRelationshipRepr {
  public AssetEntityRelationshipRepr() {
  }

  public AssetEntityRelationshipRepr(URL relatesToAssetTypeId, long defaultRelationshipCategoryId,
      String relationshipDescriptionLabel, boolean includeChildrenInDownload) {

    this.relatesToAssetTypeUrl = relatesToAssetTypeId;
    this.defaultRelationshipCategoryId = defaultRelationshipCategoryId;
    this.relationshipDescriptionLabel = relationshipDescriptionLabel;
    this.includeChildrenInDownload = includeChildrenInDownload;
  }

  public URL relatesToAssetTypeUrl;
  public long defaultRelationshipCategoryId;
  public String relationshipDescriptionLabel;
  public boolean includeChildrenInDownload;
}
