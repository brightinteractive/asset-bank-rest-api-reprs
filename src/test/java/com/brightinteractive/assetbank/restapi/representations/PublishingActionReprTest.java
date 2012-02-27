package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.*;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class PublishingActionReprTest
{
	@Test
	public void testPublishingActionReprHasLogUrl()
	{
		PublishingActionRepr publishingActionRepr = new PublishingActionRepr();
		publishingActionRepr.logUrl = "https://assetbank.acme.com/rest/publishing-actions/1/log";
	}

	@Test
	public void testPublishingActionReprXmlRootElement()
	{
		assertXmlRootElementNameEquals("publishingAction", PublishingActionRepr.class);
	}
}
