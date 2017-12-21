package com.brightinteractive.assetbank.restapi.representations;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Editor dependencies info model.
 * 
 * @author Bright Interactive
 */
@XmlRootElement(name="editorDependencies")
public class EditorDependenciesRepr 
{
	public EditorDependencyRepr primaryEditorDependency;

	@XmlElementWrapper
	@XmlElement(name = "secondaryDependency")
	public List<EditorDependencyRepr> secondaryEditorDependencies;

	public Collection<UIMessage> messages = new ArrayList<UIMessage>();
	
    // just to make JAXB happy
    public EditorDependenciesRepr()
	{

	}

	public EditorDependenciesRepr(
			EditorDependencyRepr a_primaryEditorDependency,
			List<EditorDependencyRepr> a_secondaryEditorDependencies)
	{
		primaryEditorDependency = a_primaryEditorDependency;
		secondaryEditorDependencies = a_secondaryEditorDependencies;
	}
	
	public void addMessage(UIMessage a_message)
	{
		messages.add(a_message);
	}
}