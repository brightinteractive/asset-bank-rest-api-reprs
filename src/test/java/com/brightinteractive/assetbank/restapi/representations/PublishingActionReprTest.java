package com.brightinteractive.assetbank.restapi.representations;


import static com.brightinteractive.assetbank.restapi.representations.ReprTestUtil.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;

public class PublishingActionReprTest {
	@Test
	public void testPublishingActionIdReprHasNoArgCtor() {
		new PublishingActionIdRepr();
	}

	@Test
	public void testPublishingActionIdReprHasIdCtor() {
		PublishingActionIdRepr publishingActionIdRepr = new PublishingActionIdRepr(98765L);
		assertEquals(98765L, publishingActionIdRepr.publishingActionId);
	}

	@Test
	public void testPublishingActionReprIdXmlRootElement() {
		assertXmlRootElementNameEquals("publishingActionId", PublishingActionIdRepr.class);
	}
	@Test
	public void testPublishingActionReprHasName() {
		PublishingActionRepr publishingActionRepr = new PublishingActionRepr();
		publishingActionRepr.name = "Product images";
	}

	@Test
	public void testPublishingActionReprHasLogUrl() throws MalformedURLException {
		PublishingActionRepr publishingActionRepr = new PublishingActionRepr();
		publishingActionRepr.logUrl = new URL("https://assetbank.acme.com/rest/publishing-actions/1/log");
	}

	@Test
	public void testPublishingActionReprXmlRootElement() {
		assertXmlRootElementNameEquals("publishingAction", PublishingActionRepr.class);
	}
}
