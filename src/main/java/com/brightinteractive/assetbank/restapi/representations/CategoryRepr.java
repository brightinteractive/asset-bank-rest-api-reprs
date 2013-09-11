package com.brightinteractive.assetbank.restapi.representations;

import java.util.Collection;
import java.util.Collections;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Serializable category info models.
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
@XmlRootElement(name="category")
@XmlSeeAlso({CategoryWithCountRepr.class})
public class CategoryRepr
{
	public long id;
	public String name;
	public String description;
	@XmlElementWrapper
	@XmlElement(name = "category")
	public Collection<CategoryRepr> children;

	public CategoryRepr()
    {
    }

    public CategoryRepr(long a_id,
    					String a_name,
    					String a_description,
    					Collection<CategoryRepr> a_children)
	{
    	id = a_id;
    	name = a_name;
    	description = a_description;
    	children = Collections.unmodifiableCollection(a_children);
	}
}
