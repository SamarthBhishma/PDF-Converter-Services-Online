/*
 * Muhimbi PDF
 * Convert, Merge, Watermark, Secure and OCR files.
 *
 * OpenAPI spec version: 9.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.muhimbi.online.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Response data for all operations
 */
@ApiModel(description = "Response data for all operations")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-17T11:28:12.598Z")
public class OperationResponse {
  @SerializedName("processed_file_content")
  private String processedFileContent = null;

  @SerializedName("base_file_name")
  private String baseFileName = null;

  /**
   * Operation result code.
   */
  public enum ResultCodeEnum {
    @SerializedName("Success")
    SUCCESS("Success"),
    
    @SerializedName("ProcessingError")
    PROCESSINGERROR("ProcessingError"),
    
    @SerializedName("SubscriptionNotFound")
    SUBSCRIPTIONNOTFOUND("SubscriptionNotFound"),
    
    @SerializedName("SubscriptionExpired")
    SUBSCRIPTIONEXPIRED("SubscriptionExpired"),
    
    @SerializedName("ActivationPending")
    ACTIVATIONPENDING("ActivationPending"),
    
    @SerializedName("TrialExpired")
    TRIALEXPIRED("TrialExpired"),
    
    @SerializedName("OperationSizeExceeded")
    OPERATIONSIZEEXCEEDED("OperationSizeExceeded"),
    
    @SerializedName("OperationsExceeded")
    OPERATIONSEXCEEDED("OperationsExceeded"),
    
    @SerializedName("InputFileTypeNotSupported")
    INPUTFILETYPENOTSUPPORTED("InputFileTypeNotSupported"),
    
    @SerializedName("OutputFileTypeNotSupported")
    OUTPUTFILETYPENOTSUPPORTED("OutputFileTypeNotSupported"),
    
    @SerializedName("OperationNotSupported")
    OPERATIONNOTSUPPORTED("OperationNotSupported"),
    
    @SerializedName("Accepted")
    ACCEPTED("Accepted"),
    
    @SerializedName("AccessDenied")
    ACCESSDENIED("AccessDenied");

    private String value;

    ResultCodeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("result_code")
  private ResultCodeEnum resultCode = null;

  @SerializedName("result_details")
  private String resultDetails = null;

  public OperationResponse processedFileContent(String processedFileContent) {
    this.processedFileContent = processedFileContent;
    return this;
  }

   /**
   * File generated by the Muhimbi converter.
   * @return processedFileContent
  **/
  @ApiModelProperty(example = "null", value = "File generated by the Muhimbi converter.")
  public String getProcessedFileContent() {
    return processedFileContent;
  }

  public void setProcessedFileContent(String processedFileContent) {
    this.processedFileContent = processedFileContent;
  }

  public OperationResponse baseFileName(String baseFileName) {
    this.baseFileName = baseFileName;
    return this;
  }

   /**
   * Name of the input file without the extension.
   * @return baseFileName
  **/
  @ApiModelProperty(example = "null", value = "Name of the input file without the extension.")
  public String getBaseFileName() {
    return baseFileName;
  }

  public void setBaseFileName(String baseFileName) {
    this.baseFileName = baseFileName;
  }

  public OperationResponse resultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Operation result code.
   * @return resultCode
  **/
  @ApiModelProperty(example = "null", value = "Operation result code.")
  public ResultCodeEnum getResultCode() {
    return resultCode;
  }

  public void setResultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
  }

  public OperationResponse resultDetails(String resultDetails) {
    this.resultDetails = resultDetails;
    return this;
  }

   /**
   * Operation result details.
   * @return resultDetails
  **/
  @ApiModelProperty(example = "null", value = "Operation result details.")
  public String getResultDetails() {
    return resultDetails;
  }

  public void setResultDetails(String resultDetails) {
    this.resultDetails = resultDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResponse operationResponse = (OperationResponse) o;
    return Objects.equals(this.processedFileContent, operationResponse.processedFileContent) &&
        Objects.equals(this.baseFileName, operationResponse.baseFileName) &&
        Objects.equals(this.resultCode, operationResponse.resultCode) &&
        Objects.equals(this.resultDetails, operationResponse.resultDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processedFileContent, baseFileName, resultCode, resultDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResponse {\n");
    
    sb.append("    processedFileContent: ").append(toIndentedString(processedFileContent)).append("\n");
    sb.append("    baseFileName: ").append(toIndentedString(baseFileName)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultDetails: ").append(toIndentedString(resultDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
