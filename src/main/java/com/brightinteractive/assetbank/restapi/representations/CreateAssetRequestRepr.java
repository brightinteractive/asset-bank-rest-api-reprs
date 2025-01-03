package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2013 Bright, All Rights Reserved.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;
import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createAsset")
public class CreateAssetRequestRepr {
  public boolean submit = true;
  public boolean populateDefaults = false;
  public long createAsUserId = -1;
  public URL assetTypeUrl;

  @XmlElementWrapper
  @XmlElement(name = "accessLevel")
  @JsonProperty("accessLevels")
  public List<FolderRepr> accessLevels;

  public CreateAssetRequestRepr(List<FolderRepr> accessLevels) {
    this.accessLevels = accessLevels;
  }

  public CreateAssetRequestRepr() {
  }
}
