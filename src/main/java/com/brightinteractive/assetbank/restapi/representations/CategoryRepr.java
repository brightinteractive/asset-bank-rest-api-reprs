package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Serializable category info models.
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
@XmlSeeAlso({ CategoryWithCountRepr.class })
public class CategoryRepr {
  public URL url;
  public long id;
  public String name;
  public String description;
  public URL parent;

  @XmlElementWrapper
  @XmlElement(name = "category")
  public Collection<CategoryRepr> children;

  public CategoryRepr() {
  }

  public CategoryRepr(URL url,
      long id,
      String name,
      String description,
      Collection<CategoryRepr> children,
      URL parent) {
    this.url = url;
    this.id = id;
    this.name = name;
    this.description = description;
    this.children = Collections.unmodifiableCollection(children);
    this.parent = parent;
  }

  public boolean hasParent() {
    return parent != null;
  }

  public boolean hasChildren() {
    return children != null && !children.isEmpty();
  }
}
