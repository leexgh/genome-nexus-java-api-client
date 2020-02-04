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
import java.util.ArrayList;
import java.util.List;
import org.oncokb.client.Geneset;

/**
 * Gene
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:44:58.277-05:00")
public class Gene {
  @SerializedName("curatedIsoform")
  private String curatedIsoform = null;

  @SerializedName("curatedRefSeq")
  private String curatedRefSeq = null;

  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("geneAliases")
  private List<String> geneAliases = null;

  @SerializedName("genesets")
  private List<Geneset> genesets = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("oncogene")
  private Boolean oncogene = null;

  @SerializedName("tsg")
  private Boolean tsg = null;

  public Gene curatedIsoform(String curatedIsoform) {
    this.curatedIsoform = curatedIsoform;
    return this;
  }

   /**
   * Get curatedIsoform
   * @return curatedIsoform
  **/
  @ApiModelProperty(value = "")
  public String getCuratedIsoform() {
    return curatedIsoform;
  }

  public void setCuratedIsoform(String curatedIsoform) {
    this.curatedIsoform = curatedIsoform;
  }

  public Gene curatedRefSeq(String curatedRefSeq) {
    this.curatedRefSeq = curatedRefSeq;
    return this;
  }

   /**
   * Get curatedRefSeq
   * @return curatedRefSeq
  **/
  @ApiModelProperty(value = "")
  public String getCuratedRefSeq() {
    return curatedRefSeq;
  }

  public void setCuratedRefSeq(String curatedRefSeq) {
    this.curatedRefSeq = curatedRefSeq;
  }

  public Gene entrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Get entrezGeneId
   * @return entrezGeneId
  **/
  @ApiModelProperty(value = "")
  public Integer getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  public Gene geneAliases(List<String> geneAliases) {
    this.geneAliases = geneAliases;
    return this;
  }

  public Gene addGeneAliasesItem(String geneAliasesItem) {
    if (this.geneAliases == null) {
      this.geneAliases = new ArrayList<String>();
    }
    this.geneAliases.add(geneAliasesItem);
    return this;
  }

   /**
   * Get geneAliases
   * @return geneAliases
  **/
  @ApiModelProperty(value = "")
  public List<String> getGeneAliases() {
    return geneAliases;
  }

  public void setGeneAliases(List<String> geneAliases) {
    this.geneAliases = geneAliases;
  }

  public Gene genesets(List<Geneset> genesets) {
    this.genesets = genesets;
    return this;
  }

  public Gene addGenesetsItem(Geneset genesetsItem) {
    if (this.genesets == null) {
      this.genesets = new ArrayList<Geneset>();
    }
    this.genesets.add(genesetsItem);
    return this;
  }

   /**
   * Get genesets
   * @return genesets
  **/
  @ApiModelProperty(value = "")
  public List<Geneset> getGenesets() {
    return genesets;
  }

  public void setGenesets(List<Geneset> genesets) {
    this.genesets = genesets;
  }

  public Gene hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Get hugoSymbol
   * @return hugoSymbol
  **/
  @ApiModelProperty(value = "")
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }

  public Gene name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gene oncogene(Boolean oncogene) {
    this.oncogene = oncogene;
    return this;
  }

   /**
   * Get oncogene
   * @return oncogene
  **/
  @ApiModelProperty(value = "")
  public Boolean isOncogene() {
    return oncogene;
  }

  public void setOncogene(Boolean oncogene) {
    this.oncogene = oncogene;
  }

  public Gene tsg(Boolean tsg) {
    this.tsg = tsg;
    return this;
  }

   /**
   * Get tsg
   * @return tsg
  **/
  @ApiModelProperty(value = "")
  public Boolean isTsg() {
    return tsg;
  }

  public void setTsg(Boolean tsg) {
    this.tsg = tsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gene gene = (Gene) o;
    return Objects.equals(this.curatedIsoform, gene.curatedIsoform) &&
        Objects.equals(this.curatedRefSeq, gene.curatedRefSeq) &&
        Objects.equals(this.entrezGeneId, gene.entrezGeneId) &&
        Objects.equals(this.geneAliases, gene.geneAliases) &&
        Objects.equals(this.genesets, gene.genesets) &&
        Objects.equals(this.hugoSymbol, gene.hugoSymbol) &&
        Objects.equals(this.name, gene.name) &&
        Objects.equals(this.oncogene, gene.oncogene) &&
        Objects.equals(this.tsg, gene.tsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(curatedIsoform, curatedRefSeq, entrezGeneId, geneAliases, genesets, hugoSymbol, name, oncogene, tsg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gene {\n");
    
    sb.append("    curatedIsoform: ").append(toIndentedString(curatedIsoform)).append("\n");
    sb.append("    curatedRefSeq: ").append(toIndentedString(curatedRefSeq)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    geneAliases: ").append(toIndentedString(geneAliases)).append("\n");
    sb.append("    genesets: ").append(toIndentedString(genesets)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oncogene: ").append(toIndentedString(oncogene)).append("\n");
    sb.append("    tsg: ").append(toIndentedString(tsg)).append("\n");
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
