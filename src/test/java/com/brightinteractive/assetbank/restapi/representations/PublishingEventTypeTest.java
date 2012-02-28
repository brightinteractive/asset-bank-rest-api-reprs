package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class PublishingEventTypeTest
{
	@Test
	public void testToString()
	{
		assertEquals("PUBLISH", PublishingEventType.PUBLISH.toString());
		assertEquals("UNPUBLISH", PublishingEventType.UNPUBLISH.toString());
	}
}
