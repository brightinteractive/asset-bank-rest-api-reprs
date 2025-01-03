package com.brightinteractive.assetbank.restapi.representations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "assetContentUrls")
public class BatchContentUrlRepr {
  @XmlElementWrapper
  @XmlElement(name = "contentUrl")
  @JsonProperty("contentUrls")
  public List<AssetContentUrlRepr> contentUrls;

  public BatchContentUrlRepr() {
  }
}
