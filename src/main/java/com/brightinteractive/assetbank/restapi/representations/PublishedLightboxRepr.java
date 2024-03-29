package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "publishedLightbox")
public class PublishedLightboxRepr {
  public URL publishedLightboxUrl;

  public PublishedLightboxRepr() {
  }

  public PublishedLightboxRepr(URL publishedLightboxUrl) {
    this.publishedLightboxUrl = publishedLightboxUrl;
  }
}
