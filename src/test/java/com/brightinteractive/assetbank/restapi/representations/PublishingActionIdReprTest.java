package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class PublishingActionIdReprTest
{
	@Test
	public void testPublishingActionIdReprHasId()
	{
		PublishingActionIdRepr publishingActionIdRepr = new PublishingActionIdRepr();
		publishingActionIdRepr.publishingActionId = 1234L;
	}

	@Test
	public void testPublishingActionIdReprHasNoArgCtor()
	{
		new PublishingActionIdRepr();
	}

	@Test
	public void testPublishingActionIdReprHasIdCtor()
	{
		PublishingActionIdRepr publishingActionIdRepr = new PublishingActionIdRepr(98765L);
		assertEquals(98765L, publishingActionIdRepr.publishingActionId);
	}

	@Test
	public void testPublishingActionReprIdXmlRootElement()
	{
		assertXmlRootElementNameEquals("publishingActionId", PublishingActionIdRepr.class);
	}
}
