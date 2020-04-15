package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright, All Rights Reserved.
 */

/**
 * XML/JSON-serializable publishing event model.
 *
 * @author Bright
 */
public class PublishingEventRepr {
  public long assetId;
  public PublishingEventType type;

  @SuppressWarnings("unused")
  public PublishingEventRepr() {
  }

  @SuppressWarnings("unused")
  public PublishingEventRepr(long a_assetId, PublishingEventType a_type) {
    assetId = a_assetId;
    type = a_type;
  }
}
