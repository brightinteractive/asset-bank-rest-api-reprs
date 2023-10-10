/*Copyright 2015 Bright, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.net.URL;

@javax.xml.bind.annotation.XmlRootElement(name = "asset-type")
@XmlRootElement(name = "asset-type")
public class LightweightAssetEntityRepr {
  public long id;
  public String name;
}
