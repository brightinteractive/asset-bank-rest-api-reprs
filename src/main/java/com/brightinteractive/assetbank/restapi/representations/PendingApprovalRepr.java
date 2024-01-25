/*Copyright 2015 Bright, All Rights Reserved.*/
package com.brightinteractive.assetbank.restapi.representations;

import java.net.URL;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pendingApproval")
public class PendingApprovalRepr {
  public URL assetInstanceUrl;
  public URL assetApprovalUrl;

  public PendingApprovalRepr() {
  }

  public PendingApprovalRepr(URL assetInstanceUrl, URL assetApprovalUrl) {
    this.assetInstanceUrl = assetInstanceUrl;
    this.assetApprovalUrl = assetApprovalUrl;
  }
}
