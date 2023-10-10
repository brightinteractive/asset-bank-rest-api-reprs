package com.brightinteractive.assetbank.restapi.representations;

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@javax.xml.bind.annotation.XmlRootElement(name = "assetContentUrls")
@XmlRootElement(name = "assetContentUrls")
public class BatchContentUrlRepr {
  @javax.xml.bind.annotation.XmlElementWrapper
  @XmlElementWrapper
  @javax.xml.bind.annotation.XmlElement(name = "contentUrl")
  @XmlElement(name = "contentUrl")
  public List<AssetContentUrlRepr> contentUrls;

  public BatchContentUrlRepr() {
  }
}
