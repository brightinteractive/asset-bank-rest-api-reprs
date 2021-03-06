package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class LightboxAssetReprTest
{
	@Test
	public void lightboxAssetReprIncludesAssetInLightboxUrlInAdditionToAssetReprValues()
			throws MalformedURLException
	{
		URL assetInLightboxUrl = new URL("http://asset.in.lightbox.url/");
		URL url = new URL("http://url.com/");
		URL contentUrl = new URL("http://content.url/");
		URL contentUrlUrl = new URL("http://contentUrl.url/");
		URL displayUrl = new URL("http://display.url/");
		URL thumbnailUrl = new URL("http://thumbnail.url/");
		URL previewUrl = new URL("http://preview.url/");
		URL unwatermarkedLargeImageUrl = new URL("http://unwatermarked-large.url/");
		URL conversionUrl = new URL("http://conversion.url/");
		List<AttributeValueRepr> attributes = new ArrayList<AttributeValueRepr>();
		Collection<URL> parents = new ArrayList<URL>();
		String type = "type";
		String accessLevelIds = "1,2";

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
				accessLevelIds
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
	}
}
