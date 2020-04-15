package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2013 Bright, All Rights Reserved.
 */
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "createAttribute")
public class CreateAttributeRequestRepr {
  public long typeId;
  public String label;
  public boolean keywordSearchable = false;
  public boolean mandatory = false;
  public boolean mandatoryOnBulkUpload = false;
  public boolean requiredForCompleteness = false;

  public CreateAttributeRequestRepr() {
  }
}
