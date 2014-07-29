package com.brightinteractive.assetbank.restapi.representations;

import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AssetInLightboxReprTest
{
	@Test
	public void canConstructUsingAssetInstanceUrlAndLightboxInstanceUrl()
			throws MalformedURLException
	{
		URL lightboxInstanceUrl = new URL("http://lightbox.com");
		URL assetInstanceUrl = new URL("http://asset.com");
		AssetInLightboxRepr assetInLightboxRepr = new AssetInLightboxRepr(
				assetInstanceUrl,
				lightboxInstanceUrl
		);

		Assert.assertEquals(lightboxInstanceUrl, assetInLightboxRepr.lightboxInstanceUrl);
		Assert.assertEquals(assetInstanceUrl, assetInLightboxRepr.assetInstanceUrl);
	}
}
