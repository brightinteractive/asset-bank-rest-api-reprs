package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PublishingEventTypeTest {
	@Test
	public void testToString() {
		assertEquals("PUBLISH", PublishingEventType.PUBLISH.toString());
		assertEquals("UNPUBLISH", PublishingEventType.UNPUBLISH.toString());
	}
}
