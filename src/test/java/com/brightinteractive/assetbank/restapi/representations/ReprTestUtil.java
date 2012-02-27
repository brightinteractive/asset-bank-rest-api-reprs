package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import static org.junit.Assert.*;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Bright Interactive
 */
public class ReprTestUtil
{
	public static void assertXmlRootElementNameEquals(String a_expectedXmlRootElementName, Class<?> a_reprClass)
	{
		String xmlRootElementName = a_reprClass.getAnnotation(XmlRootElement.class).name();
		assertEquals(a_expectedXmlRootElementName, xmlRootElementName);
	}
}
