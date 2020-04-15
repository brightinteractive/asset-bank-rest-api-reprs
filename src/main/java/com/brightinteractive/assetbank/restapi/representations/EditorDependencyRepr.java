package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "editorDependency")
public class EditorDependencyRepr {
  public URL url;
  public String originalFilename;

}
