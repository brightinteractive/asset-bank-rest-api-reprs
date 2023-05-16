/*Copyright 2015 Bright, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "asset-type")
public class LightweightAssetEntityRepr {
  public long id;
  public String name;
}
