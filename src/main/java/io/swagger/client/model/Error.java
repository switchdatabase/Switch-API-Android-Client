/**
 * Switch Database REST API
 * Switch API is the primary endpoint of data sevices and Switch DB's platform. You can do adding, editing, deleting or listing data works to your database with query operations by using this low-level API based on HTTP.
 *
 * OpenAPI spec version: 1.2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Error {
  
  @SerializedName("ResponseTime")
  private Long responseTime = null;
  @SerializedName("Response")
  private String response = null;
  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getResponseTime() {
    return responseTime;
  }
  public void setResponseTime(Long responseTime) {
    this.responseTime = responseTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getResponse() {
    return response;
  }
  public void setResponse(String response) {
    this.response = response;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return (this.responseTime == null ? error.responseTime == null : this.responseTime.equals(error.responseTime)) &&
        (this.response == null ? error.response == null : this.response.equals(error.response)) &&
        (this.errorMessage == null ? error.errorMessage == null : this.errorMessage.equals(error.errorMessage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.responseTime == null ? 0: this.responseTime.hashCode());
    result = 31 * result + (this.response == null ? 0: this.response.hashCode());
    result = 31 * result + (this.errorMessage == null ? 0: this.errorMessage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  responseTime: ").append(responseTime).append("\n");
    sb.append("  response: ").append(response).append("\n");
    sb.append("  errorMessage: ").append(errorMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}