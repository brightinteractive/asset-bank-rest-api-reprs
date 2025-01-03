package com.brightinteractive.assetbank.restapi.representations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class UserRepr {
  public URL url;
  public URL lightboxUrl;
  public long id;
  public String username = null;
  public String forename = null;
  public String surname = null;
  public String emailAddress = null;
  @XmlElementWrapper
  @XmlElement(name = "groupId")
  @JsonProperty("groupIds")
  public Collection<Long> groupIds = null;
  public boolean isAdmin = false;
  public boolean isOrgUnitAdmin = false;

  public UserRepr() throws MalformedURLException {
    url = new URL("http://example.com");
  }

  public UserRepr(URL a_url,
      URL lightboxUrl,
      long id,
      String username,
      String forename,
      String surname,
      String emailAddress,
      Collection<Long> groupIds,
      boolean isAdmin,
      boolean isOrgUnitAdmin) {
    url = a_url;
    this.lightboxUrl = lightboxUrl;
    this.id = id;
    this.username = username;
    this.forename = forename;
    this.surname = surname;
    this.emailAddress = emailAddress;
    this.groupIds = groupIds;
    this.isAdmin = isAdmin;
    this.isOrgUnitAdmin = isOrgUnitAdmin;
  }
}
