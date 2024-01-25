package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "assetId")
public class AssetIdRepr {

  public long assetId;

  // just to make JAXB happy
  public AssetIdRepr() {
    assetId = 0;
  }

  public AssetIdRepr(long a_assetId) {
    assetId = a_assetId;
  }
}
