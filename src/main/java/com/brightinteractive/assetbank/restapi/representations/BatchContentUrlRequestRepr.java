package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.List;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "assetIds")
public class BatchContentUrlRequestRepr {
  public List<Long> assetIds;

  public BatchContentUrlRequestRepr() {
  }
}
