package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LightboxAssetReprTest {
	@Test
	public void lightboxAssetReprIncludesAssetInLightboxUrlInAdditionToAssetReprValues()
			throws MalformedURLException {
		URL assetInLightboxUrl = new URL("http://asset.in.lightbox.url/");
		URL url = new URL("https://url.com/");
		URL contentUrl = new URL("https://content.url/");
		URL contentUrlUrl = new URL("https://contentUrl.url/");
		URL displayUrl = new URL("https://display.url/");
		URL thumbnailUrl = new URL("https://thumbnail.url/");
		URL previewUrl = new URL("https://preview.url/");
		URL unwatermarkedLargeImageUrl = new URL("https://unwatermarked-large.url/");
		URL conversionUrl = new URL("https://conversion.url/");
		List<AttributeValueRepr> attributes = new ArrayList<>();
		Collection<URL> parents = new ArrayList<>();
		String type = "type";
		String accessLevelIds = "1,2";
		String dateAdded = "1667824456000";
		String dateLastModified = "1667824915000";

		LightboxAssetRepr lightboxAssetRepr = new LightboxAssetRepr(
				assetInLightboxUrl,
				url,
				contentUrl,
				contentUrlUrl,
				displayUrl,
				thumbnailUrl,
				previewUrl,
				unwatermarkedLargeImageUrl,
				conversionUrl,
				attributes,
				true,
				true,
				parents,
				type,
				accessLevelIds,
				dateAdded,
				dateLastModified
		);

		assertEquals(assetInLightboxUrl, lightboxAssetRepr.assetInLightboxUrl);
		assertEquals(url, lightboxAssetRepr.url);
		assertEquals(contentUrl, lightboxAssetRepr.contentUrl);
		assertEquals(contentUrlUrl, lightboxAssetRepr.contentUrlUrl);
		assertEquals(displayUrl, lightboxAssetRepr.displayUrl);
		assertEquals(thumbnailUrl, lightboxAssetRepr.thumbnailUrl);
		assertEquals(previewUrl, lightboxAssetRepr.previewUrl);
		assertEquals(unwatermarkedLargeImageUrl, lightboxAssetRepr.unwatermarkedLargeImageUrl);
		assertEquals(conversionUrl, lightboxAssetRepr.conversionUrl);
		assertEquals(attributes, lightboxAssetRepr.attributes);
		assertEquals(type, lightboxAssetRepr.type);
		assertEquals(accessLevelIds, lightboxAssetRepr.accessLevelIds);
		assertEquals(dateAdded, lightboxAssetRepr.dateAdded);
		assertEquals(dateLastModified, lightboxAssetRepr.dateLastModified);
	}
}
