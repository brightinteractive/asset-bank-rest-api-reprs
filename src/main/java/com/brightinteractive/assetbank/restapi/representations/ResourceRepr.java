package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright, All Rights Reserved.
 */

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * The URL of a REST resource (marshallable to XML or JSON).
 *
 * @author Bright
 */
@XmlRootElement(name = "resource")
@XmlAccessorType(XmlAccessType.NONE)
public class ResourceRepr {
  private String resource;

  public ResourceRepr() {
  }

  public ResourceRepr(String resource) {
    this.resource = resource;
  }

  public ResourceRepr(URL resourceURL) {
    this(resourceURL.toString());
  }

  @XmlValue
  @JsonValue
  public String getResource() {
    return resource;
  }


  @JsonCreator
  public void setResource(String resource) {
    this.resource = resource;
  }
}
