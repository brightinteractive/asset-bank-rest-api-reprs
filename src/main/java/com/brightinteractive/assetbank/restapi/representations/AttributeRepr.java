package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable attribute model.
 * <p>
 * Eg
 * {
 * "label": "foobar",
 * <-- ETC -->
 * }
 *
 * @author Bright
 */
@XmlRootElement(name = "attribute")
public class AttributeRepr {
  public long id;
  public String label;
  public String staticName;
  public long typeId;
  public URL url;
  public URL listValuesUrl;
  public URL keywordsUrl;

  public AttributeRepr() throws MalformedURLException {
    url = new URL("http://example.com");
  }

  public AttributeRepr(long id,
      String label,
      long typeId,
      URL url,
      URL listValuesUrl,
      URL keywordsUrl) {
    this.id = id;
    this.label = label;
    this.staticName = null;
    this.typeId = typeId;
    this.url = url;
    this.listValuesUrl = listValuesUrl;
    this.keywordsUrl = keywordsUrl;
  }

  public AttributeRepr(long id,
      String label,
      String staticName,
      long typeId,
      URL url,
      URL listValuesUrl,
      URL keywordsUrl) {
    this(id, label, typeId, url, listValuesUrl, keywordsUrl);
    this.staticName = staticName;
  }
}