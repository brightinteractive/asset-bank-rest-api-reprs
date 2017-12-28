package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2013 Bright Interactive, All Rights Reserved.
 */

import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>The data needed to create an Access Level.</p>
 *
 * <p>This is kept to a minimum - the usual process is that an access level is created
 * and then immediately updated, instead of being created fully populated.</p>
 *
 * @author Bright Interactive
 */
@XmlRootElement(name="createAccessLevel")
public class CreateAccessLevelRequestRepr
{
	public String name;
	public URL parent;
	public boolean isAlwaysAssignable;
	public boolean hasPermissions;

	public CreateAccessLevelRequestRepr()
	{
	}
}
