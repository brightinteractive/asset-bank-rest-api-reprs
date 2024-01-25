package com.brightinteractive.assetbank.restapi.representations;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "saveStatus")
public class SaveStatusRepr {

  private static final String k_sSuccess = "Success";
  private static final String k_sFailure = "Failure";
  private static final String k_sPending = "Pending";

  public String status;
  public String message;

  public static SaveStatusRepr success() {
    return new SaveStatusRepr(k_sSuccess, "");
  }

  public static SaveStatusRepr pending() {
    return new SaveStatusRepr(k_sPending, "");
  }

  public static SaveStatusRepr failure(String a_sMessage) {
    return new SaveStatusRepr(k_sFailure, a_sMessage);
  }

  public static SaveStatusRepr failure() {
    return new SaveStatusRepr(k_sFailure, "");
  }

  public SaveStatusRepr() {
  }

  public SaveStatusRepr(String a_status, String a_message) {
    status = a_status;
    message = a_message;
  }

  public boolean equals(SaveStatusRepr a_compareTo) {
    if (a_compareTo.status.equals(this.status)) {
      return true;
    }

    return false;
  }
}
