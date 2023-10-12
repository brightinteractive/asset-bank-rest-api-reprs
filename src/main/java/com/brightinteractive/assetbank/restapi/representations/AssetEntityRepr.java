/*Copyright 2015 Bright, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.net.URL;
import java.util.List;

@javax.xml.bind.annotation.XmlRootElement(name = "asset-type")
@XmlRootElement(name = "asset-type")
public class AssetEntityRepr extends LightweightAssetEntityRepr {
  public URL url;
  public List<String> allowableMediaTypes;
  public String includedFileFormats;
  public String excludedFileFormats;

  @javax.xml.bind.annotation.XmlElementWrapper
  @XmlElementWrapper
  @javax.xml.bind.annotation.XmlElement(name = "allowableAttribute")
  @XmlElement(name = "allowableAttribute")
  public List<AssetEntityAttributeRepr> allowableAttributes;
  public boolean showAttributeLabels;
  public URL matchOnAttributeUrl;

  public boolean allowChildren;
  @javax.xml.bind.annotation.XmlElementWrapper
  @XmlElementWrapper
  @javax.xml.bind.annotation.XmlElement(name = "childRelationships")
  @XmlElement(name = "childRelationships")
  public List<AssetEntityRelationshipRepr> childRelationships;
  public String childRelationshipToName;
  public String childRelationshipToNamePlural;

  public boolean allowPeers;
  @javax.xml.bind.annotation.XmlElementWrapper
  @XmlElementWrapper
  @javax.xml.bind.annotation.XmlElement(name = "peerRelationships")
  @XmlElement(name = "peerRelationships")
  public List<AssetEntityRelationshipRepr> peerRelationships;
  public String peerRelationshipToName;
  public String peerRelationshipToNamePlural;

  public boolean mustHaveParent;
  public String childRelationshipFromName;
  public String childRelationshipFromNamePlural;
  public String termForSiblings;
  public String termForSibling;

  public boolean canDownloadChildrenFromParent;

  public long defaultCategoryId;
  public boolean onlyAllowDefaultCategory;
  public long rootCategoryId;
  public boolean categoryExtension;

  public boolean showOnDescendantCategories;

  public boolean isSearchable;
  public boolean isQuickSearchable;
  public boolean isArticle;

  public boolean canCopyAssets;

  public long unrestrictedAgreementId;
  public long restrictedAgreementId;
}
