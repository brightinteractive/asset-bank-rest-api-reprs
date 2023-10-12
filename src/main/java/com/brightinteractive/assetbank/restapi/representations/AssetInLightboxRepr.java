package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import jakarta.xml.bind.annotation.XmlRootElement;

@javax.xml.bind.annotation.XmlRootElement(name = "assetInLightbox")
@XmlRootElement(name = "assetInLightbox")
public class AssetInLightboxRepr {
  public URL assetInstanceUrl;
  public URL lightboxInstanceUrl;

  public AssetInLightboxRepr() {
  }

  public AssetInLightboxRepr(URL a_assetInstanceUrl, URL a_lightboxInstanceUrl) {
    assetInstanceUrl = a_assetInstanceUrl;
    lightboxInstanceUrl = a_lightboxInstanceUrl;
  }
}
