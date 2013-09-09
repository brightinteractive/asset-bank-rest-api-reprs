package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.assertXmlRootElementNameEquals;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class AccessLevelWithCountReprTest
{
	@Test
	public void testAccessLevelWithCountReprHasCount()
	{
		AccessLevelWithCountRepr repr = new  AccessLevelWithCountRepr();
		repr.count = 1;
	}

	@Test
	public void testAccessLevelWithCountReprXmlRootElement()
	{
		assertXmlRootElementNameEquals("accessLevel", AccessLevelWithCountRepr.class);
	}
}
