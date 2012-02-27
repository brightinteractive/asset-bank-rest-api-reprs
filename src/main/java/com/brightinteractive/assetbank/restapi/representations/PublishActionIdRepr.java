package com.brightinteractive.assetbank.restapi.representations;

/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p></p>Serializable publish action ID model.</p>
 *
 * <p>E.g.</p>
 * <pre>
 * {
 *     "publishActionId": 123
 * }
 * </pre>
 *
 * @author Bright Interactive
 */
@XmlRootElement(name="publishActionId")
public class PublishActionIdRepr
{
	public long publishActionId;
}
