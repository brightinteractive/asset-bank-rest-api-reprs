package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LightboxItemReprTest {
	@Test
	public void lightBoxHasSeparateContentAndInstanceUrls()
			throws MalformedURLException {
		LightboxItemRepr lightbox = new LightboxItemRepr();
		lightbox.lightboxContentsUrl = new URL("https://example.com");
		lightbox.lightboxInstanceUrl = new URL("https://example.com");
		assertNotSame(lightbox.lightboxContentsUrl, lightbox.lightboxInstanceUrl);
	}
}
