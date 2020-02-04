/*
 * OncoKB APIs for Premium Users
 * These endpoints are designed for premium users. Please contact OncoKB team(contact@oncokb.org) if you want to be upgraded.
 *
 * OpenAPI spec version: v1.0.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.oncokb.client;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VariantConsequence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:44:58.277-05:00")
public class VariantConsequence {
  @SerializedName("description")
  private String description = null;

  @SerializedName("isGenerallyTruncating")
  private Boolean isGenerallyTruncating = null;

  @SerializedName("term")
  private String term = null;

  public VariantConsequence description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VariantConsequence isGenerallyTruncating(Boolean isGenerallyTruncating) {
    this.isGenerallyTruncating = isGenerallyTruncating;
    return this;
  }

   /**
   * Get isGenerallyTruncating
   * @return isGenerallyTruncating
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsGenerallyTruncating() {
    return isGenerallyTruncating;
  }

  public void setIsGenerallyTruncating(Boolean isGenerallyTruncating) {
    this.isGenerallyTruncating = isGenerallyTruncating;
  }

  public VariantConsequence term(String term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(value = "")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantConsequence variantConsequence = (VariantConsequence) o;
    return Objects.equals(this.description, variantConsequence.description) &&
        Objects.equals(this.isGenerallyTruncating, variantConsequence.isGenerallyTruncating) &&
        Objects.equals(this.term, variantConsequence.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isGenerallyTruncating, term);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantConsequence {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isGenerallyTruncating: ").append(toIndentedString(isGenerallyTruncating)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

