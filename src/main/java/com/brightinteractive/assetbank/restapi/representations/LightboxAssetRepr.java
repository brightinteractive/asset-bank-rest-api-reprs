package com.brightinteractive.assetbank.restapi.representations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "asset")
public class LightboxAssetRepr extends AssetRepr {

  public URL assetInLightboxUrl;
  public String dateAdded;
  public String dateLastModified;

  @SuppressWarnings("unused") // needed to keep JAXB happy
  public LightboxAssetRepr() throws MalformedURLException {
    super();
  }

  public LightboxAssetRepr(URL assetInLightboxUrl,
      URL url,
      URL contentUrl,
      URL contentUrlUrl,
      URL displayUrl,
      URL thumbnailUrl,
      URL previewUrl,
      URL unwatermarkedLargeImageUrl,
      URL conversionUrl,
      List<AttributeValueRepr> attributes,
      boolean submitted,
      boolean approved,
      Collection<URL> parents,
      String type,
      String accessLevelIds,
      String dateAdded,
      String dateLastModified) {
    super(url, contentUrl, contentUrlUrl, displayUrl, thumbnailUrl, previewUrl,
        unwatermarkedLargeImageUrl, conversionUrl, attributes, submitted, approved, parents, type, accessLevelIds);
    this.assetInLightboxUrl = assetInLightboxUrl;
    this.dateAdded = dateAdded;
    this.dateLastModified = dateLastModified;
  }


}
