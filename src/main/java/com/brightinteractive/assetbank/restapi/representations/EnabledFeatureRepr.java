/*Copyright 2017 Bright Interactive, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="enabledFeature")
public class EnabledFeatureRepr
{
	public String featureIdentifier;
	public String entryPointUrl;
	public String configUrl;

	public EnabledFeatureRepr()
	{

	}

	public EnabledFeatureRepr(String featureIdentifier,
							  String entryPointUrl,
							  String configUrl)
	{
		this.featureIdentifier = featureIdentifier;
		this.entryPointUrl = entryPointUrl;
		this.configUrl = configUrl;
	}
}
