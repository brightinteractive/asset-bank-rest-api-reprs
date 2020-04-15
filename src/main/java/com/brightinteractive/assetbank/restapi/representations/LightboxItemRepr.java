package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable Lightbox info model.
 * <p>
 * Eg
 * {
 * "name": "foobar",
 * "size": 3
 * <-- ETC -->
 * }
 *
 * @author Bright
 */
@XmlRootElement(name = "lightboxItem")
public class LightboxItemRepr {
  public long id;
  public String name;
  public long size;
  public URL lightboxContentsUrl;
  public URL lightboxInstanceUrl;
  public URL lightboxPublicUrl;
  public String description;

  public LightboxItemRepr() {
  }

  public LightboxItemRepr(
      long id,
      String name,
      long size,
      URL lightboxInstanceUrl,
      URL lightboxContentsUrl,
      URL lightboxPublicUrl,
      String description
  ) {
    this.id = id;
    this.name = name;
    this.size = size;
    this.lightboxInstanceUrl = lightboxInstanceUrl;
    this.lightboxContentsUrl = lightboxContentsUrl;
    this.lightboxPublicUrl = lightboxPublicUrl;
    this.description = description;
  }


}
