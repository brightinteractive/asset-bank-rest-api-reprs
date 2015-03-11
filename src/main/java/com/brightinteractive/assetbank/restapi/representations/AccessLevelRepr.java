package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.Collection;
import java.util.Collections;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

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
@XmlSeeAlso({AccessLevelWithCountRepr.class})
public class AccessLevelRepr
{
	public long id;
	public String name;
	public String description;
	public URL parent;
	@XmlElementWrapper
	@XmlElement(name = "accessLevel")
	public Collection<AccessLevelRepr> children;

	public AccessLevelRepr()
    {
    }

    public AccessLevelRepr(long id,
						   String name,
						   String description,
						   Collection<AccessLevelRepr> children,
						   URL parent)
	{
    	this.id = id;
    	this.name = name;
    	this.description = description;
    	this.children = Collections.unmodifiableCollection(children);
    	this.parent = parent;
	}
}
