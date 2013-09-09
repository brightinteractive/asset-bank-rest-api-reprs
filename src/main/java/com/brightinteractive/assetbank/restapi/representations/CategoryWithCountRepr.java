package com.brightinteractive.assetbank.restapi.representations;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Extension of the standard category model including counts.
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
public class CategoryWithCountRepr extends CategoryRepr
{
	public int count;

	public CategoryWithCountRepr()
    {
    }

    public CategoryWithCountRepr(long a_id,
    							 String a_name,
    							 String a_description,
    							 Collection<CategoryRepr> a_children,
    							 int a_count)
	{
    	super(a_id, a_name, a_description, a_children);
    	count = a_count;
	}
}
