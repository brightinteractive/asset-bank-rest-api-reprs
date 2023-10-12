package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import jakarta.xml.bind.annotation.XmlRootElement;

@javax.xml.bind.annotation.XmlRootElement(name = "contentUrl")
@XmlRootElement(name = "contentUrl")
public class AssetContentUrlRepr {
  public long assetId;
  public URL contentUrl;

  public AssetContentUrlRepr() {
  }
}
