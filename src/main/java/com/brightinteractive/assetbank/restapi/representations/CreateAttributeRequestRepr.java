package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2013 Bright, All Rights Reserved.
 */
import jakarta.xml.bind.annotation.XmlRootElement;

@javax.xml.bind.annotation.XmlRootElement(name = "createAttribute")
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
