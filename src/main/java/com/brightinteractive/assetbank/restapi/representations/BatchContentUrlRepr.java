package com.brightinteractive.assetbank.restapi.representations;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "batchContentUrls")
public class BatchContentUrlRepr {
  @XmlElementWrapper
  @XmlElement(name = "contentUrl")
  public List<AssetContentUrlRepr> contentUrls;

  public BatchContentUrlRepr() {
  }
}
