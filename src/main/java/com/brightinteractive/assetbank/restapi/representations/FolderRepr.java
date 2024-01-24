package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "accessLevel")
@XmlSeeAlso({ FolderWithCountRepr.class })
public class FolderRepr {
  public URL url;
  public long id;
  public String name;
  public String description;
  public URL parent;
  public URL imageUrl;
  public boolean isAlwaysAssignable;
  public boolean hasPermissions;
  public boolean isSelectedOnLoad;
  public boolean isBrowsable;
  public boolean showPromotedItems;
  public boolean showRecentItems;
  @XmlElementWrapper
  @XmlElement(name = "accessLevel")
  public Collection<FolderRepr> children;

  public FolderRepr() {
  }

  public void setChildren(Collection<FolderRepr> children) {
    this.children = Collections.unmodifiableCollection(children);
  }

  public boolean hasParent() {
    return parent != null;
  }

  public boolean hasChildren() {
    return children != null && !children.isEmpty();
  }
}
