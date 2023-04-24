package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Serializable Checkout model.
 * <p>
 * Implictly refers to a given asset.
 * Contains a userId which represents the user who currently has the asset checked out, or -1 if the asset is not checked out.
 * <p>
 * Example:
 * <p>
 * {
 * "userId": -1
 * }
 *
 * @author Bright
 */
@XmlRootElement(name = "checkout")
public class CheckoutRepr {

  public long userId;

  // just to make JAXB happy
  public CheckoutRepr() {
    userId = -1;
  }

  public CheckoutRepr(long a_userId) {
    userId = a_userId;
  }
}
