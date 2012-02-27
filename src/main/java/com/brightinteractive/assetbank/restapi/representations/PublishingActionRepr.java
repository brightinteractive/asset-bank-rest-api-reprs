package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * XML/JSON-serializable publish action model.
 *
 * @author Bright Interactive
 */
@XmlRootElement(name="publishingAction")
public class PublishingActionRepr
{
	public URL logUrl;
}
