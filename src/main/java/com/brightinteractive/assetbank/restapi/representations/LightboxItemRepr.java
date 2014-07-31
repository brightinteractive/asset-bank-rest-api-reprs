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
	public long id;
	public String name;
	public long size;
	public URL lightboxContentsUrl;
	public URL lightboxInstanceUrl;
	public URL lightboxPublicUrl;

    public LightboxItemRepr()
    {
	}

	public LightboxItemRepr(
			long a_id,
			String a_name,
			long a_size,
			URL a_lightboxInstanceUrl,
			URL a_lightboxContentsUrl,
			URL a_lightboxPublicUrl
	)
	{
		id = a_id;
		name = a_name;
		size = a_size;
		lightboxInstanceUrl = a_lightboxInstanceUrl;
		lightboxContentsUrl = a_lightboxContentsUrl;
		lightboxPublicUrl = a_lightboxPublicUrl;
	}


}