package com.brightinteractive.assetbank.restapi.representations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CreateAssetRequestReprTest {
	@Test
	public void constructCreateAssetRequestReprTestSubmitDefaultsToTrue() {
		CreateAssetRequestRepr rep = new CreateAssetRequestRepr(new ArrayList<FolderRepr>());
		assertTrue(rep.submit);
	}
}
