package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.jupiter.api.Test;

public class AssetInLightboxReprTest {

	@Test
	public void canConstructUsingAssetInstanceUrlAndLightboxInstanceUrl()
			throws MalformedURLException {
		URL lightboxInstanceUrl = new URL("https://lightbox.com");
		URL assetInstanceUrl = new URL("https://asset.com");
		AssetInLightboxRepr assetInLightboxRepr = new AssetInLightboxRepr(
				assetInstanceUrl,
				lightboxInstanceUrl
		);

		assertEquals(lightboxInstanceUrl, assetInLightboxRepr.lightboxInstanceUrl);
		assertEquals(assetInstanceUrl, assetInLightboxRepr.assetInstanceUrl);
	}

	@Test
	public void hasDefaultConstructor() {
		new AssetInLightboxRepr();
	}

	@Test
	public void hasXMLRootAnnotation() {
		assertTrue(AssetInLightboxRepr.class.isAnnotationPresent(XmlRootElement.class));
	}
}
