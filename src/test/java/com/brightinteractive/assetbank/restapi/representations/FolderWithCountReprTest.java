package com.brightinteractive.assetbank.restapi.representations;

import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.assertXmlRootElementNameEquals;

import org.junit.jupiter.api.Test;

public class FolderWithCountReprTest {
	@Test
	public void testAccessLevelWithCountReprHasCount() {
		FolderWithCountRepr repr = new  FolderWithCountRepr();
		repr.count = 1;
	}

	@Test
	public void testAccessLevelWithCountReprXmlRootElement() {
		assertXmlRootElementNameEquals("accessLevel", FolderWithCountRepr.class);
	}
}
