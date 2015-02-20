package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2013 Bright Interactive, All Rights Reserved.
 */

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>The data needed to create an asset.</p>
 *
 * <p>This is kept to a minimum - the usual process is that an asset is created
 * and then immediately updated, instead of being created fully populated.</p>
 *
 * @author Bright Interactive
 */
@XmlRootElement(name="createAsset")
public class CreateAssetRequestRepr
{
	public boolean submit = true;
	
	@XmlElementWrapper
	@XmlElement(name = "accessLevel")
	public List<AccessLevelRepr> accessLevels;

	public CreateAssetRequestRepr(List<AccessLevelRepr> a_accessLevels)
	{
		accessLevels = a_accessLevels;
	}

	public CreateAssetRequestRepr()
	{
	}
}
