package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "publishingAction")
public class PublishingActionRepr {
  public String name;
  public URL logUrl;
}
