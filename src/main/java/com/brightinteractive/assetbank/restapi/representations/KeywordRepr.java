package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2018 Bright Interactive, All Rights Reserved.
 */

import java.net.URL;
import java.util.Collection;
import java.util.Collections;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.collections.CollectionUtils;

@XmlRootElement(name="keyword")
public class KeywordRepr
{
	public URL url;
	public long id;
	public String name;
	public String synonyms;
	public URL parent;

	@XmlElementWrapper
	@XmlElement(name = "keyword")
	public Collection<KeywordRepr> children;

	public KeywordRepr()
    {
    }

    public KeywordRepr(URL url,
						long id,
    					String name,
    					String synonyms,
    					Collection<KeywordRepr> children,
    					URL parent)
	{
		this.url = url;
    	this.id = id;
    	this.name = name;
    	this.synonyms = synonyms;
    	this.children = Collections.unmodifiableCollection(children);
    	this.parent = parent;
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
