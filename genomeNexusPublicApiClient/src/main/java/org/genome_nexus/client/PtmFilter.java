/*
 * Genome Nexus API
 * Genome Nexus Variant Annotation API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PtmFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-24T00:42:20.801-04:00")
public class PtmFilter {
  @SerializedName("transcriptIds")
  private List<String> transcriptIds = null;

  public PtmFilter transcriptIds(List<String> transcriptIds) {
    this.transcriptIds = transcriptIds;
    return this;
  }

  public PtmFilter addTranscriptIdsItem(String transcriptIdsItem) {
    if (this.transcriptIds == null) {
      this.transcriptIds = new ArrayList<String>();
    }
    this.transcriptIds.add(transcriptIdsItem);
    return this;
  }

   /**
   * List of Ensembl transcript IDs. For example [\&quot;ENST00000361390\&quot;, \&quot;ENST00000361453\&quot;, \&quot;ENST00000361624\&quot;]
   * @return transcriptIds
  **/
  @ApiModelProperty(value = "List of Ensembl transcript IDs. For example [\"ENST00000361390\", \"ENST00000361453\", \"ENST00000361624\"]")
  public List<String> getTranscriptIds() {
    return transcriptIds;
  }

  public void setTranscriptIds(List<String> transcriptIds) {
    this.transcriptIds = transcriptIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtmFilter ptmFilter = (PtmFilter) o;
    return Objects.equals(this.transcriptIds, ptmFilter.transcriptIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcriptIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtmFilter {\n");
    
    sb.append("    transcriptIds: ").append(toIndentedString(transcriptIds)).append("\n");
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
