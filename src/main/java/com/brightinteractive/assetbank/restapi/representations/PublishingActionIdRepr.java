package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "publishingActionId")
public class PublishingActionIdRepr {
  public long publishingActionId;

  public PublishingActionIdRepr() {
  }

  public PublishingActionIdRepr(long a_publishingActionId) {
    publishingActionId = a_publishingActionId;
  }
}
