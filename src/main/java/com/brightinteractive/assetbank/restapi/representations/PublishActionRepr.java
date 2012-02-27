package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import javax.xml.bind.annotation.XmlRootElement;

/**
 * XML/JSON-serializable publish action model.
 *
 * @author Bright Interactive
 */
@XmlRootElement(name="publishAction")
public class PublishActionRepr
{
	public String logUrl;
}
