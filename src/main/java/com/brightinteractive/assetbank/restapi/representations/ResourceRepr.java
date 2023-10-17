package com.brightinteractive.assetbank.restapi.representations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@javax.xml.bind.annotation.XmlRootElement(name = "resource")
@XmlRootElement(name = "resource")
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
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

  @javax.xml.bind.annotation.XmlValue
  @XmlValue
  @org.codehaus.jackson.annotate.JsonValue
  @JsonValue
  public String getResource() {
    return resource;
  }

  @org.codehaus.jackson.annotate.JsonCreator
  @JsonCreator
  public void setResource(String resource) {
    this.resource = resource;
  }
}
