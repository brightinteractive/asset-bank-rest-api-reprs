package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CreateAssetRequestReprTest
{
	@Test
	public void constructCreateAssetRequestReprTestSubmitDefaultsToTrue()
	{
		CreateAssetRequestRepr rep = new CreateAssetRequestRepr(new ArrayList<FolderRepr>());
		assertTrue(rep.submit);
	}	
}