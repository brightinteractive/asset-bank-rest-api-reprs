package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CreateAssetRequestReprTest
{
	@Test
	public void constructCreateAssetRequestReprTestSubmittDefaultsToTrue()
	{
		CreateAssetRequestRepr rep = new CreateAssetRequestRepr(new ArrayList<AccessLevelRepr>());
		assertTrue(rep.submit);
	}	
}