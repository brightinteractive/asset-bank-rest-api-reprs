package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@javax.xml.bind.annotation.XmlRootElement(name = "assetSummary")
@XmlRootElement(name = "assetSummary")
public class LightweightAssetRepr {
  public long id = 0;
  public String originalFilename;
  public URL fullAssetUrl;
  public URL thumbnailUrl;
  public URL previewUrl;
  public URL unwatermarkedLargeImageUrl;
  public Long dateLastModifiedTimestamp;
  public boolean approved;
  public long typeId;
  public String typeName;
  public String accessLevelIds;

  @javax.xml.bind.annotation.XmlElementWrapper
  @XmlElementWrapper
  @javax.xml.bind.annotation.XmlElement(name = "displayAttribute")
  @XmlElement(name = "displayAttribute")
  public List<DisplayAttributeRepr> displayAttributes = new ArrayList<>();

  @javax.xml.bind.annotation.XmlElementWrapper
  @XmlElementWrapper
  @javax.xml.bind.annotation.XmlElement(name = "attribute")
  @XmlElement(name = "attribute")
  public List<SearchAttributeValueRepr> attributes;

  public LightweightAssetRepr() {
  }

  public LightweightAssetRepr(long id,
                              URL fullAssetUrl,
                              String originalFilename,
                              boolean approved,
                              List<SearchAttributeValueRepr> attributes) {
    this.id = id;
    this.fullAssetUrl = fullAssetUrl;
    this.originalFilename = originalFilename;
    this.approved = approved;
    this.attributes = Collections.unmodifiableList(attributes);
  }

  public int getNumberOfDisplayAttributesWithLabel(String label) {
    return getDisplayAttributeValuesWithLabel(label).size();
  }

  public boolean hasDisplayAttributeWithLabel(String label) {
    return getNumberOfDisplayAttributesWithLabel(label) > 0;
  }

  public List<String> getDisplayAttributeValuesWithLabel(String label) {
    List<String> values = new ArrayList<>();
    for (DisplayAttributeRepr attribute : displayAttributes) {
      if (attribute.label.equals(label)) {
        values.add(attribute.value);
      }
    }

    return values;
  }

  public String getFirstDisplayAttributeValueWithLabel(String label) {
    List<String> values = getDisplayAttributeValuesWithLabel(label);

    return values.isEmpty() ? null : values.get(0);
  }
}
