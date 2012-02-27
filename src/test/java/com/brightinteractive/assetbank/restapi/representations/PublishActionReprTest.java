package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static org.junit.Assert.*;

import javax.xml.bind.annotation.XmlRootElement;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class PublishActionReprTest
{
	@Test
	public void testPublishActionReprHasLogUrl()
	{
		PublishActionRepr publishActionRepr = new PublishActionRepr();
		publishActionRepr.logUrl = "https://assetbank.acme.com/rest/publish-action/1/log";
	}

	@Test
	public void testPublishActionReprXmlRootElement()
	{
		String xmlRootElementName = PublishActionRepr.class.getAnnotation(XmlRootElement.class).name();
		assertEquals("publishAction", xmlRootElementName);
	}
}
