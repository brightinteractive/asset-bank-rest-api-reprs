package com.brightinteractive.assetbank.restapi.representations;

import java.util.List;
import jakarta.xml.bind.annotation.XmlRootElement;

@javax.xml.bind.annotation.XmlRootElement(name = "assetIds")
@XmlRootElement(name = "assetIds")
public class BatchContentUrlRequestRepr {
  public List<Long> assetIds;

  public BatchContentUrlRequestRepr() {
  }
}
