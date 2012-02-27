package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

/**
 * XML/JSON-serializable publishing event model.
 *
 * @author Bright Interactive
 */
public class PublishingEventRepr
{
	public long assetId;
	public PublishingEventType type;

	@SuppressWarnings("UnusedDeclaration")
	public PublishingEventRepr()
	{
	}

	@SuppressWarnings("UnusedDeclaration")
	public PublishingEventRepr(long a_assetId, PublishingEventType a_type)
	{
		assetId = a_assetId;
		type = a_type;
	}
}
