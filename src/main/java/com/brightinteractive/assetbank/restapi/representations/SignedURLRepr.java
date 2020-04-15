package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable signed url model.
 *
 * @author Bright
 */
@XmlRootElement(name = "signedURL")
public class SignedURLRepr {

  public URL url;
  public long expirySeconds;

  // just to make JAXB happy
  public SignedURLRepr() {
    url = null;
    expirySeconds = 0;
  }

  ;

  public SignedURLRepr(URL a_url, long a_expirySeconds) {
    url = a_url;
    expirySeconds = a_expirySeconds;
  }
}