package com.brightinteractive.assetbank.restapi.representations;

import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.assertXmlRootElementNameEquals;

import org.junit.jupiter.api.Test;

public class CategoryWithCountReprTest {
	@Test
	public void testCategoryWithCountReprHasCount() {
		CategoryWithCountRepr repr = new  CategoryWithCountRepr();
		repr.count = 1;
	}

	@Test
	public void testCategoryWithCountReprXmlRootElement() {
		assertXmlRootElementNameEquals("category", CategoryWithCountRepr.class);
	}
}
