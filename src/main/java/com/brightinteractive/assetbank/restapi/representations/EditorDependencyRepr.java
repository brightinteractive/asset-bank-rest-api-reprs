package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;

@XmlRootElement(name="editorDependency")
public class EditorDependencyRepr
{
	public URL url;
	public String originalFilename;

}
