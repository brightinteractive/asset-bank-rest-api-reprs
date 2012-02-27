package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p></p>Serializable publishing action ID model.</p>
 *
 * <p>E.g.</p>
 * <pre>
 * {
 *     "publishingActionId": 123
 * }
 * </pre>
 *
 * @author Bright Interactive
 */
@XmlRootElement(name="publishingActionId")
public class PublishingActionIdRepr
{
	public long publishingActionId;

	public PublishingActionIdRepr()
	{
	}

	public PublishingActionIdRepr(long a_publishingActionId)
	{
		publishingActionId = a_publishingActionId;
	}
}
