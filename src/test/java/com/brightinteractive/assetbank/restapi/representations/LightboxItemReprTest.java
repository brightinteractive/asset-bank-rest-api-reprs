package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.Assert.*;
import org.junit.Test;

import java.net.MalformedURLException;

public class LightboxItemReprTest
{
	@Test
	public void lightBoxHasSeparateContentAndInstanceUrls()
			throws MalformedURLException
	{
		LightboxItemRepr lightbox = new LightboxItemRepr();
		assertNotNull(lightbox.lightboxContentsUrl);
		assertNotNull(lightbox.lightboxInstanceUrl);
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
