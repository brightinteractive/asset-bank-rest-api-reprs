package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.Collection;
import java.util.Collections;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.commons.collections.CollectionUtils;

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
	public URL url;
	public long id;
	public String name;
	public String description;
	public URL parent;
	public boolean isAlwaysAssignable;
	public boolean hasPermissions;
	public boolean isSelectedOnLoad;
	public boolean isBrowsable;
	public boolean showPromotedItems;
	public boolean showRecentItems;
	@XmlElementWrapper
	@XmlElement(name = "accessLevel")
	public Collection<AccessLevelRepr> children;

	public AccessLevelRepr() {}

	public void setChildren(Collection<AccessLevelRepr> children)
	{
		this.children = Collections.unmodifiableCollection(children);
	}

	public boolean hasParent ()
    {
    	return parent != null;
    }
    
    public boolean hasChildren()
    {
    	return !CollectionUtils.isEmpty(children);
    }
}
