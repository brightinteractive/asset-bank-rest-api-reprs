package com.brightinteractive.assetbank.restapi.representations;

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "assetContentUrls")
public class BatchContentUrlRepr {
  @XmlElementWrapper
  @XmlElement(name = "contentUrl")
  public List<AssetContentUrlRepr> contentUrls;

  public BatchContentUrlRepr() {
  }
}
