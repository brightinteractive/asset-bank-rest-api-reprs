/*Copyright 2015 Bright, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "asset-type-attribute")
public class AssetEntityAttributeRepr {
  public AssetEntityAttributeRepr() {
  }

  public AssetEntityAttributeRepr(URL attributeUrl, boolean visibleOnAdd,
      String valueIfNotVisible) {
    this.attributeUrl = attributeUrl;
    this.visibleOnAdd = visibleOnAdd;
    this.valueIfNotVisible = valueIfNotVisible;
  }

  public URL attributeUrl;
  public boolean visibleOnAdd;
  public String valueIfNotVisible;
}
