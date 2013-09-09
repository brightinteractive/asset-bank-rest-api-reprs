package com.brightinteractive.assetbank.restapi.representations;

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

    public AccessLevelWithCountRepr(long a_id,
						   String a_name,
						   String a_description,
						   Collection<AccessLevelRepr> a_children,
						   int a_count)
	{
		super(a_id, a_name, a_description, a_children);
		this.count = a_count;
	}
}
