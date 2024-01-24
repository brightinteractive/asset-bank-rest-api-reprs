package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createAccessLevel")
public class CreateFolderRequestRepr {
  public String name;
  public URL parent;
  public boolean isAlwaysAssignable;
  public boolean hasPermissions;

  public CreateFolderRequestRepr() {
  }
}
