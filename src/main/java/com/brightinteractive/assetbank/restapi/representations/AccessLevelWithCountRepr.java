package com.brightinteractive.assetbank.restapi.representations;

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
		super();
	}

}
