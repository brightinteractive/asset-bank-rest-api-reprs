package com.brightinteractive.assetbank.restapi.representations;

import java.util.Collection;
import java.util.Collections;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable access level info models.
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
public class AccessLevelRepr
{
	public long id;
	public String name;
	public String description;
	@XmlElementWrapper
	@XmlElement(name = "accessLevel")
	public Collection<AccessLevelRepr> children;

	public AccessLevelRepr()
    {
    }

    public AccessLevelRepr(long a_id,
						   String a_name,
						   String a_description,
						   Collection<AccessLevelRepr> a_children)
	{
		id = a_id;
		name = a_name;
		description = a_description;
		children = Collections.unmodifiableCollection(a_children);
	}
}
