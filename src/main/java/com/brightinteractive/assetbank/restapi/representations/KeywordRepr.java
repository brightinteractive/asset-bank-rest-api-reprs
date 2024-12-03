package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2018 Bright, All Rights Reserved.
 */

import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "keyword")
public class KeywordRepr {
  public URL url;
  public long id;
  public String name;
  public String synonyms;
  public URL parent;

  @XmlElementWrapper
  @XmlElement(name = "children")
  public Collection<KeywordRepr> children;

  public KeywordRepr() {
  }

  public KeywordRepr(URL url,
      long id,
      String name,
      String synonyms,
      Collection<KeywordRepr> children,
      URL parent) {
    this.url = url;
    this.id = id;
    this.name = name;
    this.synonyms = synonyms;
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
