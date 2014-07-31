package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.Assert.*;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LightboxItemReprTest
{
	@Test
	public void lightBoxHasSeparateContentAndInstanceUrls()
			throws MalformedURLException
	{
		LightboxItemRepr lightbox = new LightboxItemRepr();
		lightbox.lightboxContentsUrl = new URL("http://example.com");
		lightbox.lightboxInstanceUrl = new URL("http://example.com");
		assertNotSame(lightbox.lightboxContentsUrl, lightbox.lightboxInstanceUrl);
	}

	@Test
	public void lightBoxItemReprHasIdAttribute()
			throws MalformedURLException
	{
		LightboxItemRepr lightbox = new LightboxItemRepr();
		assertNotNull(lightbox.id);
	}
}
