package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable attribute value info model.
 * <p>
 * Eg
 * {
 * "name": "foo",
 * "value": "bar"
 * <-- ETC -->
 * }
 *
 * @author Bright
 */
@XmlRootElement(name = "attributeValue")
public class AttributeValueRepr {
  public Long id;
  public String name;
  public String value;
  public String label;

  public AttributeValueRepr() {
    id = 0L;
    name = "";
    value = "";
    label = "";
  }

  public AttributeValueRepr(Long a_key, String a_name, String a_value) {
    id = a_key;
    name = a_name;
    value = a_value;
  }

  public AttributeValueRepr(Long a_key, String a_name, String a_value, String label) {
    id = a_key;
    name = a_name;
    value = a_value;
    this.label = label;
  }
}