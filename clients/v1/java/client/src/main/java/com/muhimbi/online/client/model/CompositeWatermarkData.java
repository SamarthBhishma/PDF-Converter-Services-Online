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
import com.muhimbi.online.client.model.SharepointFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Parameters for CompositeWatermark operation
 */
@ApiModel(description = "Parameters for CompositeWatermark operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-17T11:28:12.598Z")
public class CompositeWatermarkData {
  @SerializedName("source_file_name")
  private String sourceFileName = null;

  @SerializedName("use_async_pattern")
  private Boolean useAsyncPattern = false;

  @SerializedName("source_file_content")
  private String sourceFileContent = null;

  @SerializedName("sharepoint_file")
  private SharepointFile sharepointFile = null;

  @SerializedName("watermark_data")
  private String watermarkData = null;

  @SerializedName("fail_on_error")
  private Boolean failOnError = true;

  public CompositeWatermarkData sourceFileName(String sourceFileName) {
    this.sourceFileName = sourceFileName;
    return this;
  }

   /**
   * Optional file name (for logging purposes)
   * @return sourceFileName
  **/
  @ApiModelProperty(example = "null", value = "Optional file name (for logging purposes)")
  public String getSourceFileName() {
    return sourceFileName;
  }

  public void setSourceFileName(String sourceFileName) {
    this.sourceFileName = sourceFileName;
  }

  public CompositeWatermarkData useAsyncPattern(Boolean useAsyncPattern) {
    this.useAsyncPattern = useAsyncPattern;
    return this;
  }

   /**
   * Use async behaviour for API request
   * @return useAsyncPattern
  **/
  @ApiModelProperty(example = "null", value = "Use async behaviour for API request")
  public Boolean getUseAsyncPattern() {
    return useAsyncPattern;
  }

  public void setUseAsyncPattern(Boolean useAsyncPattern) {
    this.useAsyncPattern = useAsyncPattern;
  }

  public CompositeWatermarkData sourceFileContent(String sourceFileContent) {
    this.sourceFileContent = sourceFileContent;
    return this;
  }

   /**
   * Content of the file to watermark
   * @return sourceFileContent
  **/
  @ApiModelProperty(example = "null", required = true, value = "Content of the file to watermark")
  public String getSourceFileContent() {
    return sourceFileContent;
  }

  public void setSourceFileContent(String sourceFileContent) {
    this.sourceFileContent = sourceFileContent;
  }

  public CompositeWatermarkData sharepointFile(SharepointFile sharepointFile) {
    this.sharepointFile = sharepointFile;
    return this;
  }

   /**
   * Get sharepointFile
   * @return sharepointFile
  **/
  @ApiModelProperty(example = "null", value = "")
  public SharepointFile getSharepointFile() {
    return sharepointFile;
  }

  public void setSharepointFile(SharepointFile sharepointFile) {
    this.sharepointFile = sharepointFile;
  }

  public CompositeWatermarkData watermarkData(String watermarkData) {
    this.watermarkData = watermarkData;
    return this;
  }

   /**
   * Watermark data in Muhimbi XML format
   * @return watermarkData
  **/
  @ApiModelProperty(example = "null", required = true, value = "Watermark data in Muhimbi XML format")
  public String getWatermarkData() {
    return watermarkData;
  }

  public void setWatermarkData(String watermarkData) {
    this.watermarkData = watermarkData;
  }

  public CompositeWatermarkData failOnError(Boolean failOnError) {
    this.failOnError = failOnError;
    return this;
  }

   /**
   * Fail on error
   * @return failOnError
  **/
  @ApiModelProperty(example = "null", value = "Fail on error")
  public Boolean getFailOnError() {
    return failOnError;
  }

  public void setFailOnError(Boolean failOnError) {
    this.failOnError = failOnError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeWatermarkData compositeWatermarkData = (CompositeWatermarkData) o;
    return Objects.equals(this.sourceFileName, compositeWatermarkData.sourceFileName) &&
        Objects.equals(this.useAsyncPattern, compositeWatermarkData.useAsyncPattern) &&
        Objects.equals(this.sourceFileContent, compositeWatermarkData.sourceFileContent) &&
        Objects.equals(this.sharepointFile, compositeWatermarkData.sharepointFile) &&
        Objects.equals(this.watermarkData, compositeWatermarkData.watermarkData) &&
        Objects.equals(this.failOnError, compositeWatermarkData.failOnError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFileName, useAsyncPattern, sourceFileContent, sharepointFile, watermarkData, failOnError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeWatermarkData {\n");
    
    sb.append("    sourceFileName: ").append(toIndentedString(sourceFileName)).append("\n");
    sb.append("    useAsyncPattern: ").append(toIndentedString(useAsyncPattern)).append("\n");
    sb.append("    sourceFileContent: ").append(toIndentedString(sourceFileContent)).append("\n");
    sb.append("    sharepointFile: ").append(toIndentedString(sharepointFile)).append("\n");
    sb.append("    watermarkData: ").append(toIndentedString(watermarkData)).append("\n");
    sb.append("    failOnError: ").append(toIndentedString(failOnError)).append("\n");
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

