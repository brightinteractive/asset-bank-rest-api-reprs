package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Sub class of the standard access level model to include count
 * 
 * Eg
 * {
 *     "name": "foobar",
 *     "description": "desc"
 *     <-- ETC -->
 * }
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="accessLevel")
public class AccessLevelWithCountRepr extends AccessLevelRepr
{
	public int count;
	
	public AccessLevelWithCountRepr()
    {
    }

    public AccessLevelWithCountRepr(URL url,
									long id,
									String name,
									String description,
									Collection<AccessLevelRepr> children,
									URL parent,
									int count)
	{
		super(url, id, name, description, children, parent);
		this.count = count;
	}
}
