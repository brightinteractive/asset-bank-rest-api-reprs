package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import java.net.URL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import org.codehaus.jackson.annotate.JsonValue;

/**
 * The URL of a REST resource (marshallable to XML or JSON).
 *
 * @author Bright Interactive
 */
@XmlRootElement(name="resource")
@XmlAccessorType(XmlAccessType.NONE)
public class ResourceRepr
{
	private String m_resource;

	public ResourceRepr()
	{
	}

	public ResourceRepr(String a_resource)
	{
		m_resource = a_resource;
	}

	public ResourceRepr(URL a_resourceURL)
	{
		this(a_resourceURL.toString());
	}

	@XmlValue
	@JsonValue
	public String getResource()
	{
		return m_resource;
	}
}
