package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serializable LightweightAsset model.
 *
 * @author Bright
 */
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
  public long fileSizeInBytes;

  @XmlElementWrapper
  @XmlElement(name = "displayAttribute")
  public List<DisplayAttributeRepr> displayAttributes = new ArrayList<>();

  public LightweightAssetRepr() {
  }

  public LightweightAssetRepr(long id, URL fullAssetUrl, String originalFilename, boolean approved, long fileSizeInBytes) {
    this.id = id;
    this.fullAssetUrl = fullAssetUrl;
    this.originalFilename = originalFilename;
    this.approved = approved;
    this.fileSizeInBytes = fileSizeInBytes;
  }

  public int getNumberOfDisplayAttributesWithLabel(String label) {
    return getDisplayAttributeValuesWithLabel(label).size();
  }

  public boolean hasDisplayAttributeWithLabel(String label) {
    return getNumberOfDisplayAttributesWithLabel(label) > 0;
  }

  public List<String> getDisplayAttributeValuesWithLabel(String label) {
    List<String> values = new ArrayList<String>();
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
