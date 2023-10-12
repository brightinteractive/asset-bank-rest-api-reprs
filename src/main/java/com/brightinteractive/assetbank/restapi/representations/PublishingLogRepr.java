package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright, All Rights Reserved.
 */

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * XML/JSON-serializable publish action log model.
 *
 * @author Bright
 */
@javax.xml.bind.annotation.XmlRootElement(name = "publishingLog")
@XmlRootElement(name = "publishingLog")
public class PublishingLogRepr {
  @SuppressWarnings("unused")
  public PublishingLogRepr() {
  }

  public PublishingLogRepr(List<PublishingEventRepr> a_events, long a_nextStartSequence) {
    events = a_events;
    nextStartSequence = a_nextStartSequence;
  }

  @javax.xml.bind.annotation.XmlElementWrapper
  @XmlElementWrapper
  @javax.xml.bind.annotation.XmlElement(name = "event")
  @XmlElement(name = "event")
  public List<PublishingEventRepr> events;
  public long nextStartSequence;
}
