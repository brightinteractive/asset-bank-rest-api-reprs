package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Sub class of the standard folder model to include count
 * <p>
 * Eg
 * {
 * "name": "foobar",
 * "description": "desc"
 * <-- ETC -->
 * }
 *
 * @author Bright
 */
@javax.xml.bind.annotation.XmlRootElement(name = "accessLevel")
@XmlRootElement(name = "accessLevel")
public class FolderWithCountRepr extends FolderRepr {
  public int count;

  public FolderWithCountRepr() {
    super();
  }

}
