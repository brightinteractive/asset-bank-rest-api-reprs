package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable user model.
 * 
 * Eg
 * {
 *     "username": "foo",
 *     "forname": "bar"
 *     <-- ETC -->
 * }
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="user")
public class UserRepr 
{
	public URL url;
	public URL lightboxUrl;
	public String username = null;
	public String forename = null;
	public String surname = null;
	public String emailAddress = null;
	@XmlElementWrapper
	@XmlElement(name = "groupId")
	public Collection<Long> groupIds = null;
	
	
	public UserRepr() throws MalformedURLException 
    {
    	url = new URL("http://example.com");
    }

	public UserRepr(URL a_url,
					URL a_lightboxUrl,
					String a_username,
					String a_forename,
					String a_surname,
					String a_emailAddress,
					Collection<Long> a_groupIds) throws MalformedURLException 
	{
		url = a_url;
		lightboxUrl = a_lightboxUrl;
		username = a_username;
		forename = a_forename;
		surname = a_surname;
		emailAddress = a_emailAddress;
		groupIds = a_groupIds;
	}
}