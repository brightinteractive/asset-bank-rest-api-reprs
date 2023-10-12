package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2018 Bright, All Rights Reserved.
 */

import java.net.URL;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlRootElement;


@javax.xml.bind.annotation.XmlRootElement(name = "keyword")
@XmlRootElement(name = "keyword")
public class KeywordWithCountRepr extends KeywordRepr {
  public int count;

  public KeywordWithCountRepr() {
  }

  public KeywordWithCountRepr(URL url,
      long id,
      String name,
      String synonyms,
      Collection<KeywordRepr> children,
      URL parent,
      int count) {
    super(url, id, name, synonyms, children, parent);
    this.count = count;
  }
}
