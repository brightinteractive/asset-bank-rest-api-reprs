package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import jakarta.xml.bind.annotation.XmlRootElement;

public class ReprTestUtil {
	public static void assertXmlRootElementNameEquals(String a_expectedXmlRootElementName, Class<?> a_reprClass) {
		String xmlRootElementName = a_reprClass.getAnnotation(XmlRootElement.class).name();
		assertEquals(a_expectedXmlRootElementName, xmlRootElementName);
	}
}
