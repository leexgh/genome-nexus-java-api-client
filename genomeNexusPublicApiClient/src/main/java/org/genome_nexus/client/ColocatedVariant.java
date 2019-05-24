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

/**
 * ColocatedVariant
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-24T00:42:20.801-04:00")
public class ColocatedVariant {
  @SerializedName("dbSnpId")
  private String dbSnpId = null;

  @SerializedName("gnomad_nfe_allele")
  private String gnomadNfeAllele = null;

  @SerializedName("gnomad_nfe_maf")
  private String gnomadNfeMaf = null;

  @SerializedName("gnomad_afr_allele")
  private String gnomadAfrAllele = null;

  @SerializedName("gnomad_afr_maf")
  private String gnomadAfrMaf = null;

  @SerializedName("gnomad_eas_allele")
  private String gnomadEasAllele = null;

  @SerializedName("gnomad_eas_maf")
  private String gnomadEasMaf = null;

  public ColocatedVariant dbSnpId(String dbSnpId) {
    this.dbSnpId = dbSnpId;
    return this;
  }

   /**
   * Get dbSnpId
   * @return dbSnpId
  **/
  @ApiModelProperty(value = "")
  public String getDbSnpId() {
    return dbSnpId;
  }

  public void setDbSnpId(String dbSnpId) {
    this.dbSnpId = dbSnpId;
  }

  public ColocatedVariant gnomadNfeAllele(String gnomadNfeAllele) {
    this.gnomadNfeAllele = gnomadNfeAllele;
    return this;
  }

   /**
   * GnomAD Non-Finnish European Allele
   * @return gnomadNfeAllele
  **/
  @ApiModelProperty(required = true, value = "GnomAD Non-Finnish European Allele")
  public String getGnomadNfeAllele() {
    return gnomadNfeAllele;
  }

  public void setGnomadNfeAllele(String gnomadNfeAllele) {
    this.gnomadNfeAllele = gnomadNfeAllele;
  }

  public ColocatedVariant gnomadNfeMaf(String gnomadNfeMaf) {
    this.gnomadNfeMaf = gnomadNfeMaf;
    return this;
  }

   /**
   * GnomAD Non-Finnish European MAF
   * @return gnomadNfeMaf
  **/
  @ApiModelProperty(required = true, value = "GnomAD Non-Finnish European MAF")
  public String getGnomadNfeMaf() {
    return gnomadNfeMaf;
  }

  public void setGnomadNfeMaf(String gnomadNfeMaf) {
    this.gnomadNfeMaf = gnomadNfeMaf;
  }

  public ColocatedVariant gnomadAfrAllele(String gnomadAfrAllele) {
    this.gnomadAfrAllele = gnomadAfrAllele;
    return this;
  }

   /**
   * GnomAD African/African American Allele
   * @return gnomadAfrAllele
  **/
  @ApiModelProperty(required = true, value = "GnomAD African/African American Allele")
  public String getGnomadAfrAllele() {
    return gnomadAfrAllele;
  }

  public void setGnomadAfrAllele(String gnomadAfrAllele) {
    this.gnomadAfrAllele = gnomadAfrAllele;
  }

  public ColocatedVariant gnomadAfrMaf(String gnomadAfrMaf) {
    this.gnomadAfrMaf = gnomadAfrMaf;
    return this;
  }

   /**
   * GnomAD African/African American MAF
   * @return gnomadAfrMaf
  **/
  @ApiModelProperty(required = true, value = "GnomAD African/African American MAF")
  public String getGnomadAfrMaf() {
    return gnomadAfrMaf;
  }

  public void setGnomadAfrMaf(String gnomadAfrMaf) {
    this.gnomadAfrMaf = gnomadAfrMaf;
  }

  public ColocatedVariant gnomadEasAllele(String gnomadEasAllele) {
    this.gnomadEasAllele = gnomadEasAllele;
    return this;
  }

   /**
   * GnomAD East Asian Allele
   * @return gnomadEasAllele
  **/
  @ApiModelProperty(required = true, value = "GnomAD East Asian Allele")
  public String getGnomadEasAllele() {
    return gnomadEasAllele;
  }

  public void setGnomadEasAllele(String gnomadEasAllele) {
    this.gnomadEasAllele = gnomadEasAllele;
  }

  public ColocatedVariant gnomadEasMaf(String gnomadEasMaf) {
    this.gnomadEasMaf = gnomadEasMaf;
    return this;
  }

   /**
   * GnomAD East Asian MAF
   * @return gnomadEasMaf
  **/
  @ApiModelProperty(required = true, value = "GnomAD East Asian MAF")
  public String getGnomadEasMaf() {
    return gnomadEasMaf;
  }

  public void setGnomadEasMaf(String gnomadEasMaf) {
    this.gnomadEasMaf = gnomadEasMaf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColocatedVariant colocatedVariant = (ColocatedVariant) o;
    return Objects.equals(this.dbSnpId, colocatedVariant.dbSnpId) &&
        Objects.equals(this.gnomadNfeAllele, colocatedVariant.gnomadNfeAllele) &&
        Objects.equals(this.gnomadNfeMaf, colocatedVariant.gnomadNfeMaf) &&
        Objects.equals(this.gnomadAfrAllele, colocatedVariant.gnomadAfrAllele) &&
        Objects.equals(this.gnomadAfrMaf, colocatedVariant.gnomadAfrMaf) &&
        Objects.equals(this.gnomadEasAllele, colocatedVariant.gnomadEasAllele) &&
        Objects.equals(this.gnomadEasMaf, colocatedVariant.gnomadEasMaf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbSnpId, gnomadNfeAllele, gnomadNfeMaf, gnomadAfrAllele, gnomadAfrMaf, gnomadEasAllele, gnomadEasMaf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColocatedVariant {\n");
    
    sb.append("    dbSnpId: ").append(toIndentedString(dbSnpId)).append("\n");
    sb.append("    gnomadNfeAllele: ").append(toIndentedString(gnomadNfeAllele)).append("\n");
    sb.append("    gnomadNfeMaf: ").append(toIndentedString(gnomadNfeMaf)).append("\n");
    sb.append("    gnomadAfrAllele: ").append(toIndentedString(gnomadAfrAllele)).append("\n");
    sb.append("    gnomadAfrMaf: ").append(toIndentedString(gnomadAfrMaf)).append("\n");
    sb.append("    gnomadEasAllele: ").append(toIndentedString(gnomadEasAllele)).append("\n");
    sb.append("    gnomadEasMaf: ").append(toIndentedString(gnomadEasMaf)).append("\n");
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

