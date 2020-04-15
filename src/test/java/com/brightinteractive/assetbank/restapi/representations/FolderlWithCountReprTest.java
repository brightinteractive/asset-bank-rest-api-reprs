package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.assertXmlRootElementNameEquals;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class FolderlWithCountReprTest
{
	@Test
	public void testAccessLevelWithCountReprHasCount()
	{
		FolderWithCountRepr repr = new  FolderWithCountRepr();
		repr.count = 1;
	}

	@Test
	public void testAccessLevelWithCountReprXmlRootElement()
	{
		assertXmlRootElementNameEquals("accessLevel", FolderWithCountRepr.class);
	}
}
