package com.ccproject2.model.opendata.response;

import java.util.HashMap;
import java.util.Map;

public class RestaurantScoresResponse {

private String businessAddress;
private String businessCity;
private String businessId;
private String businessLatitude;
private BusinessLocation businessLocation;
private String businessLongitude;
private String businessName;
private String businessPostalCode;
private String businessState;
private String inspectionDate;
private String inspectionId;
private String inspectionScore;
private String inspectionType;
private String riskCategory;
private String violationDescription;
private String violationId;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();


public String getBusinessAddress() {
return businessAddress;
}

public void setBusinessAddress(String businessAddress) {
this.businessAddress = businessAddress;
}

public String getBusinessCity() {
return businessCity;
}

public void setBusinessCity(String businessCity) {
this.businessCity = businessCity;
}

public String getBusinessId() {
return businessId;
}

public void setBusinessId(String businessId) {
this.businessId = businessId;
}

public String getBusinessLatitude() {
return businessLatitude;
}

public void setBusinessLatitude(String businessLatitude) {
this.businessLatitude = businessLatitude;
}

public BusinessLocation getBusinessLocation() {
return businessLocation;
}

public void setBusinessLocation(BusinessLocation businessLocation) {
this.businessLocation = businessLocation;
}

public String getBusinessLongitude() {
return businessLongitude;
}

public void setBusinessLongitude(String businessLongitude) {
this.businessLongitude = businessLongitude;
}

public String getBusinessName() {
return businessName;
}

public void setBusinessName(String businessName) {
this.businessName = businessName;
}

public String getBusinessPostalCode() {
return businessPostalCode;
}

public void setBusinessPostalCode(String businessPostalCode) {
this.businessPostalCode = businessPostalCode;
}

public String getBusinessState() {
return businessState;
}

public void setBusinessState(String businessState) {
this.businessState = businessState;
}

public String getInspectionDate() {
return inspectionDate;
}

public void setInspectionDate(String inspectionDate) {
this.inspectionDate = inspectionDate;
}

public String getInspectionId() {
return inspectionId;
}

public void setInspectionId(String inspectionId) {
this.inspectionId = inspectionId;
}

public String getInspectionScore() {
return inspectionScore;
}

public void setInspectionScore(String inspectionScore) {
this.inspectionScore = inspectionScore;
}

public String getInspectionType() {
return inspectionType;
}

public void setInspectionType(String inspectionType) {
this.inspectionType = inspectionType;
}

public String getRiskCategory() {
return riskCategory;
}

public void setRiskCategory(String riskCategory) {
this.riskCategory = riskCategory;
}

public String getViolationDescription() {
return violationDescription;
}

public void setViolationDescription(String violationDescription) {
this.violationDescription = violationDescription;
}

public String getViolationId() {
return violationId;
}

public void setViolationId(String violationId) {
this.violationId = violationId;
}

}