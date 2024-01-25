package com.brightinteractive.assetbank.restapi.representations;

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "publishingLog")
public class PublishingLogRepr {
  @SuppressWarnings("unused")
  public PublishingLogRepr() {
  }

  public PublishingLogRepr(List<PublishingEventRepr> a_events, long a_nextStartSequence) {
    events = a_events;
    nextStartSequence = a_nextStartSequence;
  }

  @XmlElementWrapper
  @XmlElement(name = "event")
  public List<PublishingEventRepr> events;
  public long nextStartSequence;
}
