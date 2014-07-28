package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable Lightbox info model.
 * 
 * Eg
 * {
 *     "name": "foobar",
 *     "size": 3
 *     <-- ETC -->
 * }
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="lightboxItem")
public class LightboxItemRepr 
{
	public String name;
	public long size;
	public URL lightboxContentsUrl;
	public URL lightboxInstanceUrl;
	public URL lightboxPublicUrl;

    // just to make JAXB happy
    public LightboxItemRepr() throws MalformedURLException 
    {
    	name = new String();
    	size = 0;
    	lightboxContentsUrl = new URL("http://example.com");
    	lightboxInstanceUrl = new URL("http://example.com");
    	lightboxPublicUrl = new URL("http://example.com");
    }

	public LightboxItemRepr(
			String a_name,
			long a_size,
			URL a_lightboxInstanceUrl,
			URL a_lightboxContentsUrl,
			URL a_lightboxPublicUrl
	)
	{
		name = a_name;
		size = a_size;
		lightboxInstanceUrl = a_lightboxInstanceUrl;
		lightboxContentsUrl = a_lightboxContentsUrl;
		lightboxPublicUrl = a_lightboxPublicUrl;
	}


}