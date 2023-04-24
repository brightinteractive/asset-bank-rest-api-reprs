package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2013 Bright, All Rights Reserved.
 */

import java.net.URL;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * <p>The data needed to create an Folder.</p>
 *
 * <p>This is kept to a minimum - the usual process is that an folder is created
 * and then immediately updated, instead of being created fully populated.</p>
 *
 * @author Bright
 */
@XmlRootElement(name = "createAccessLevel")
public class CreateFolderRequestRepr {
  public String name;
  public URL parent;
  public boolean isAlwaysAssignable;
  public boolean hasPermissions;

  public CreateFolderRequestRepr() {
  }
}
