package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Jersey API Root URL - Points to service resources.
 * Includes API versioning to allow for future compatability.
 * <p>
 * Eg
 * <p>
 * {
 * "api_name": "AssetBank RESTful API"
 * "api_version_1_1": {
 * "checkoutUrl": "http://..."
 * "lightboxesUrl": "http://..."
 * "assetsUrl": "http://..."
 * "signingUrl": "http://...."
 * }
 * }
 * <p>
 * Clients may read (GET) from this resource.
 * They should check that the api_name matches "AssetBank RESTful API" as expected,
 * and then use the sub-resources denoted in "api_version_1_1" (or another version as appropriate)
 *
 * @author Bright
 */
@XmlRootElement(name = "root")
public class RootRepr {
  private static String API_NAME = "AssetBank RESTful API";

  public static class RootServices_v_1_1 {
    public URL checkoutUrl;
    public URL lightboxesUrl;
    public URL assetsUrl;
    public URL signingUrl;
  }

  public static class RootServices_v_1_2 {
    public URL checkoutUrl;
    public URL lightboxesUrl;
    public URL assetsUrl;
    public URL usersUrl;
    public URL userSearchUrl;
    public URL attributesUrl;
    public URL categorySearchUrl;
    public URL accessLevelSearchUrl;
    public URL signingUrl;
    public URL assetSearchUrl;
    public URL publishingActionsUrl;
    public URL displayAttributeGroupUrl;
  }

  public static class RootServices_v_1_3 {
    public URL checkoutUrl;
    public URL lightboxesUrl;
    public URL assetsUrl;
    public URL usersUrl;
    public URL userSearchUrl;
    public URL attributesUrl;
    public URL categorySearchUrl;
    public URL accessLevelSearchUrl;
    public URL signingUrl;
    public URL assetSearchUrl;
    public URL publishingActionsUrl;
    public URL displayAttributeGroupUrl;
    public URL tempChunkedFilesUrl;
    public URL assetTypesUrl;
    public URL accessLevelsUrl;
    public URL categoriesUrl;
    public URL pendingUploadApprovalsUrl;
    public URL pendingEditApprovalsUrl;
    public URL authenticatedUserUrl;
    public URL embeddedDataMappingsUrl;
  }

  public String api_name;
  public RootServices_v_1_1 api_version_1_1;
  public RootServices_v_1_2 api_version_1_2;
  public RootServices_v_1_3 api_version_1_3;
  public static final String LATEST_API_VERSION = "api_version_1_3";

  // just to make JAXB happy
  public RootRepr() {
  }

  public RootRepr(URL checkoutUrl,
      URL lightboxesUrl,
      URL lightboxes_v1_1_Url,
      URL assetsUrl,
      URL assets_v1_2_Url,
      URL usersUrl,
      URL userSearchUrl,
      URL attributesUrl,
      URL categorySearchUrl,
      URL folderSearchUrl,
      URL signingUrl,
      URL assetSearchUrl,
      URL publishingActionsUrl,
      URL displayAttributeGroupUrl,
      URL tempChunkedFilesUrl,
      URL assetTypesUrl,
      URL foldersUrl,
      URL categoriesUrl,
      URL pendingUploadApprovalsUrl,
      URL pendingEditApprovalsUrl,
      URL authenticatedUserUrl,
      URL embeddedDataMappingsUrl) {
    api_name = API_NAME;

    //build the 1.1 version...
    api_version_1_1 = new RootServices_v_1_1();
    api_version_1_1.checkoutUrl = checkoutUrl;
    api_version_1_1.lightboxesUrl = lightboxes_v1_1_Url;
    api_version_1_1.assetsUrl = assets_v1_2_Url;
    api_version_1_1.signingUrl = signingUrl;

    //and now the 1.2...
    api_version_1_2 = new RootServices_v_1_2();
    api_version_1_2.checkoutUrl = checkoutUrl;
    api_version_1_2.lightboxesUrl = lightboxesUrl;
    api_version_1_2.assetsUrl = assets_v1_2_Url;
    api_version_1_2.usersUrl = usersUrl;
    api_version_1_2.userSearchUrl = userSearchUrl;
    api_version_1_2.attributesUrl = attributesUrl;
    api_version_1_2.categorySearchUrl = categorySearchUrl;
    api_version_1_2.accessLevelSearchUrl = folderSearchUrl;
    api_version_1_2.signingUrl = signingUrl;
    api_version_1_2.assetSearchUrl = assetSearchUrl;
    api_version_1_2.publishingActionsUrl = publishingActionsUrl;
    api_version_1_2.displayAttributeGroupUrl = displayAttributeGroupUrl;

    //and now the 1.3...
    api_version_1_3 = new RootServices_v_1_3();
    api_version_1_3.checkoutUrl = checkoutUrl;
    api_version_1_3.lightboxesUrl = lightboxesUrl;
    api_version_1_3.assetsUrl = assetsUrl;
    api_version_1_3.usersUrl = usersUrl;
    api_version_1_3.userSearchUrl = userSearchUrl;
    api_version_1_3.attributesUrl = attributesUrl;
    api_version_1_3.categorySearchUrl = categorySearchUrl;
    api_version_1_3.accessLevelSearchUrl = folderSearchUrl;
    api_version_1_3.signingUrl = signingUrl;
    api_version_1_3.assetSearchUrl = assetSearchUrl;
    api_version_1_3.publishingActionsUrl = publishingActionsUrl;
    api_version_1_3.displayAttributeGroupUrl = displayAttributeGroupUrl;
    api_version_1_3.tempChunkedFilesUrl = tempChunkedFilesUrl;
    api_version_1_3.assetTypesUrl = assetTypesUrl;
    api_version_1_3.accessLevelsUrl = foldersUrl;
    api_version_1_3.categoriesUrl = categoriesUrl;
    api_version_1_3.pendingUploadApprovalsUrl = pendingUploadApprovalsUrl;
    api_version_1_3.pendingEditApprovalsUrl = pendingEditApprovalsUrl;
    api_version_1_3.authenticatedUserUrl = authenticatedUserUrl;
    api_version_1_3.embeddedDataMappingsUrl = embeddedDataMappingsUrl;
  }
}
