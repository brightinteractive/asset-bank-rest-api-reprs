package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;

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
