package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.*;

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
	public void testPublishActionReprIdXmlRootElement()
	{
		assertXmlRootElementNameEquals("publishActionId", PublishActionIdRepr.class);
	}
}
