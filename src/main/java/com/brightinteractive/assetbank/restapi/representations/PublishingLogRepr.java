package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * XML/JSON-serializable publish action log model.
 *
 * @author Bright Interactive
 */
@XmlRootElement(name = "publishingLog")
public class PublishingLogRepr
{
	@SuppressWarnings("unused")
	public PublishingLogRepr()
	{
	}

	public PublishingLogRepr(List<PublishingEventRepr> a_events, long a_nextStartSequence)
	{
		events = a_events;
		nextStartSequence = a_nextStartSequence;
	}

	@XmlElementWrapper
	@XmlElement(name = "event")
	public List<PublishingEventRepr> events;
	public long nextStartSequence;
}
