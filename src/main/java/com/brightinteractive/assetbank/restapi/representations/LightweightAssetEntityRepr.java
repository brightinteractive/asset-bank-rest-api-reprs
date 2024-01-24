package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "asset-type")
public class LightweightAssetEntityRepr {
  public long id;
  public String name;
}
