package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.assertXmlRootElementNameEquals;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class CategoryWithCountReprTest
{
	@Test
	public void testCategoryWithCountReprHasCount()
	{
		CategoryWithCountRepr repr = new  CategoryWithCountRepr();
		repr.count = 1;
	}

	@Test
	public void testCategoryWithCountReprXmlRootElement()
	{
		assertXmlRootElementNameEquals("category", CategoryWithCountRepr.class);
	}
}
