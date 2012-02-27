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
public class PublishActionIdReprTest
{
	@Test
	public void testPublishActionIdReprHasId()
	{
		PublishActionIdRepr publishActionIdRepr = new PublishActionIdRepr();
		publishActionIdRepr.publishActionId = 1234L;
	}

	@Test
	public void testPublishActionIdReprHasNoArgCtor()
	{
		new PublishActionIdRepr();
	}

	@Test
	public void testPublishActionIdReprHasIdCtor()
	{
		PublishActionIdRepr publishActionIdRepr = new PublishActionIdRepr(98765L);
		assertEquals(98765L, publishActionIdRepr.publishActionId);
	}

	@Test
	public void testPublishActionReprIdXmlRootElement()
	{
		assertXmlRootElementNameEquals("publishActionId", PublishActionIdRepr.class);
	}
}
