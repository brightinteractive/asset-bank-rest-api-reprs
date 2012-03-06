package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class PublishingActionReprTest
{
	@Test
	public void testPublishingActionReprHasName()
	{
		PublishingActionRepr publishingActionRepr = new PublishingActionRepr();
		publishingActionRepr.name = "Product images";
	}

	@Test
	public void testPublishingActionReprHasLogUrl() throws MalformedURLException
	{
		PublishingActionRepr publishingActionRepr = new PublishingActionRepr();
		publishingActionRepr.logUrl = new URL("https://assetbank.acme.com/rest/publishing-actions/1/log");
	}

	@Test
	public void testPublishingActionReprXmlRootElement()
	{
		assertXmlRootElementNameEquals("publishingAction", PublishingActionRepr.class);
	}
}
