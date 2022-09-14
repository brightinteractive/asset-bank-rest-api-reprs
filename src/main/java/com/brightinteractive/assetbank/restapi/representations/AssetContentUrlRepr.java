package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "contentUrl")
public class AssetContentUrlRepr {
  public long assetId;
  public URL contentUrl;

  public AssetContentUrlRepr() {
  }
}
