package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2013 Bright, All Rights Reserved.
 */

import java.net.URL;
import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * <p>The data needed to create an asset.</p>
 *
 * <p>This is kept to a minimum - the usual process is that an asset is created
 * and then immediately updated, instead of being created fully populated.</p>
 *
 * @author Bright
 */
@XmlRootElement(name = "createAsset")
public class CreateAssetRequestRepr {
  public boolean submit = true;
  public boolean populateDefaults = false;
  public long createAsUserId = -1;
  public URL assetTypeUrl;

  @XmlElementWrapper
  @XmlElement(name = "accessLevel")
  public List<FolderRepr> accessLevels;

  public CreateAssetRequestRepr(List<FolderRepr> accessLevels) {
    this.accessLevels = accessLevels;
  }

  public CreateAssetRequestRepr() {
  }
}
