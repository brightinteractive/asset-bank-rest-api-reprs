package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

@javax.xml.bind.annotation.XmlRootElement(name = "attribute")
@XmlRootElement(name = "attribute")
public class SearchAttributeValueRepr {
  public String name;
  public String value;

  public SearchAttributeValueRepr() {}

  public SearchAttributeValueRepr(String name, String value) {
    this.name = name;
    this.value = value;
  }
}
