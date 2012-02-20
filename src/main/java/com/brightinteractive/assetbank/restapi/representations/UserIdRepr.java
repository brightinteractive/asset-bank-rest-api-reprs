package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable user id model.
 * 
 * Eg
 * {
 *     "userId": 1
 * }
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="userId")
public class UserIdRepr {

	public long userId;

    // just to make JAXB happy
    public UserIdRepr()
    {
    	userId = 0;
    };

	public UserIdRepr(long a_userId) 
	{
		userId = a_userId;
	}
}