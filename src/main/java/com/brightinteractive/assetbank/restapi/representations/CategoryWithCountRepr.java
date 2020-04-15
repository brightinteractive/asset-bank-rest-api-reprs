package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Extension of the standard category model including counts.
 * <p>
 * Eg
 * {
 * "name": "foobar",
 * "description": "desc"
 * <-- ETC -->
 * }
 *
 * @author Bright
 */
@XmlRootElement(name = "category")
public class CategoryWithCountRepr extends CategoryRepr {
  public int count;

  public CategoryWithCountRepr() {
  }

  public CategoryWithCountRepr(URL url,
      long id,
      String name,
      String description,
      Collection<CategoryRepr> children,
      URL parent,
      int count) {
    super(url, id, name, description, children, parent);
    this.count = count;
  }
}
