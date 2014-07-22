package com.brightinteractive.assetbank.restapi.representations;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LightweightAssetReprTest
{
	public static final String LABEL = "label";
	public static final String LABEL_1 = "label1";
	public static final String VALUE_1 = "value1";
	public static final String LABEL_2 = "label2";
	public static final String VALUE_2_A = "value2a";
	public static final String VALUE_2_B = "value2b";

	LightweightAssetRepr asset;

	@Before
	public void setup() throws Exception
	{
		asset = new LightweightAssetRepr();
		asset.displayAttributes.add(new DisplayAttributeRepr(LABEL_1, VALUE_1));
		asset.displayAttributes.add(new DisplayAttributeRepr(LABEL_2, VALUE_2_A));
		asset.displayAttributes.add(new DisplayAttributeRepr(LABEL_2, VALUE_2_B));
	}

	@Test
	public void testGetNumberOfDisplayAttributesWithLabel() throws Exception
	{
		assertEquals(0, asset.getNumberOfDisplayAttributesWithLabel(LABEL));
		assertEquals(1, asset.getNumberOfDisplayAttributesWithLabel(LABEL_1));
		assertEquals(2, asset.getNumberOfDisplayAttributesWithLabel(LABEL_2));
	}

	@Test
	public void testHasDisplayAttributeWithLabel() throws Exception
	{
		assertFalse(asset.hasDisplayAttributeWithLabel("label"));
		assertTrue(asset.hasDisplayAttributeWithLabel(LABEL_1));
	}

	@Test
	public void testGetDisplayAttributeValuesWithLabel() throws Exception
	{
		List<String> values = asset.getDisplayAttributeValuesWithLabel(LABEL_2);
		assertTrue(values.contains(VALUE_2_A));
		assertTrue(values.contains(VALUE_2_B));
	}

	@Test
	public void testGetFirstDisplayAttributeValueWithLabel() throws Exception
	{
		assertEquals(VALUE_2_A, asset.getFirstDisplayAttributeValueWithLabel(LABEL_2));
	}
}