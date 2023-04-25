package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Serializable user id model.
 * <p>
 * Eg
 * {
 * "userId": 1
 * }
 *
 * @author Bright
 */
@XmlRootElement(name = "userId")
public class UserIdRepr {

  public long userId;

  // just to make JAXB happy
  public UserIdRepr() {
    userId = 0;
  }

  ;

  public UserIdRepr(long a_userId) {
    userId = a_userId;
  }
}
