package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.Assert.*;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LightboxAssetReprTest
{
	@Test
	public void lightboxAssetReprIncludesAssetInLightboxUrlInAdditionToAssetReprValues()
			throws MalformedURLException
	{
		URL assetInLightboxUrl = new URL("http://asset.in.lightbox.url/");
		URL url = new URL("http://url.com/");
		URL contentUrl = new URL("http://content.url/");
		URL displayUrl = new URL("http://display.url/");
		List<AttributeValueRepr> attributes = new ArrayList<AttributeValueRepr>();

		LightboxAssetRepr lightboxAssetRepr = new LightboxAssetRepr(
				assetInLightboxUrl,
				url,
				contentUrl,
				displayUrl,
				attributes
		);

		assertEquals(assetInLightboxUrl, lightboxAssetRepr.assetInLightboxUrl);
		assertEquals(url, lightboxAssetRepr.url);
		assertEquals(contentUrl, lightboxAssetRepr.contentUrl);
		assertEquals(displayUrl, lightboxAssetRepr.displayUrl);
		assertEquals(attributes, lightboxAssetRepr.attributes);

	}
}