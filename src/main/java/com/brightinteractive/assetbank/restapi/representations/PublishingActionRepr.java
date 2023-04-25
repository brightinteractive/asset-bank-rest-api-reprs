package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright, All Rights Reserved.
 */

import java.net.URL;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * XML/JSON-serializable publishing action model.
 *
 * @author Bright
 */
@XmlRootElement(name = "publishingAction")
public class PublishingActionRepr {
  public String name;
  public URL logUrl;
}
