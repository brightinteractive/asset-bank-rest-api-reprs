package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "accessLevel")
public class FolderWithCountRepr extends FolderRepr {
  public int count;

  public FolderWithCountRepr() {
    super();
  }

}
