package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "contentUrl")
public class AssetContentUrlRepr {
  public long assetId;
  public URL contentUrl;

  public AssetContentUrlRepr() {
  }
}
