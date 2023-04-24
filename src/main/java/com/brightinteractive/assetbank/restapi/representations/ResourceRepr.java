package com.brightinteractive.assetbank.restapi.representations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

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
