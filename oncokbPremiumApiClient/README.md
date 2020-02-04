# oncokbInternalApiClient

OncoKB APIs for Premium Users
- API version: v1.0.0
  - Build date: 2020-02-04T16:44:58.277-05:00

These endpoints are designed for premium users. Please contact OncoKB team(contact@oncokb.org) if you want to be upgraded.

  For more information, please visit [https://www.oncokb.org](https://www.oncokb.org)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.oncokb.client</groupId>
  <artifactId>oncokbInternalApiClient</artifactId>
  <version>1.1.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.oncokb.client:oncokbInternalApiClient:1.1.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/oncokbInternalApiClient-1.1.1-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.oncokb.*;
import org.oncokb.auth.*;
import org.oncokb.client.*;
import org.oncokb.client.AnnotationsApi;

import java.io.File;
import java.util.*;

public class AnnotationsApiExample {

    public static void main(String[] args) {
        
        AnnotationsApi apiInstance = new AnnotationsApi();
        String copyNameAlterationType = "copyNameAlterationType_example"; // String | Copy number alteration type
        String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation. Example: BRAF
        Integer entrezGeneId = 56; // Integer | The entrez gene ID. (Higher priority than hugoSymbol). Example: 673
        String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
        try {
            IndicatorQueryResp result = apiInstance.annotateCopyNumberAlterationsGetUsingGET1(copyNameAlterationType, hugoSymbol, entrezGeneId, tumorType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#annotateCopyNumberAlterationsGetUsingGET1");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://oncokb-core:8888/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnnotationsApi* | [**annotateCopyNumberAlterationsGetUsingGET1**](docs/AnnotationsApi.md#annotateCopyNumberAlterationsGetUsingGET1) | **GET** /annotate/copyNumberAlterations | annotateCopyNumberAlterationsGet
*AnnotationsApi* | [**annotateCopyNumberAlterationsPostUsingPOST1**](docs/AnnotationsApi.md#annotateCopyNumberAlterationsPostUsingPOST1) | **POST** /annotate/copyNumberAlterations | annotateCopyNumberAlterationsPost
*AnnotationsApi* | [**annotateMutationsByGenomicChangeGetUsingGET1**](docs/AnnotationsApi.md#annotateMutationsByGenomicChangeGetUsingGET1) | **GET** /annotate/mutations/byGenomicChange | annotateMutationsByGenomicChangeGet
*AnnotationsApi* | [**annotateMutationsByGenomicChangePostUsingPOST1**](docs/AnnotationsApi.md#annotateMutationsByGenomicChangePostUsingPOST1) | **POST** /annotate/mutations/byGenomicChange | annotateMutationsByGenomicChangePost
*AnnotationsApi* | [**annotateMutationsByHGVSgGetUsingGET1**](docs/AnnotationsApi.md#annotateMutationsByHGVSgGetUsingGET1) | **GET** /annotate/mutations/byHGVSg | annotateMutationsByHGVSgGet
*AnnotationsApi* | [**annotateMutationsByHGVSgPostUsingPOST1**](docs/AnnotationsApi.md#annotateMutationsByHGVSgPostUsingPOST1) | **POST** /annotate/mutations/byHGVSg | annotateMutationsByHGVSgPost
*AnnotationsApi* | [**annotateMutationsByProteinChangeGetUsingGET1**](docs/AnnotationsApi.md#annotateMutationsByProteinChangeGetUsingGET1) | **GET** /annotate/mutations/byProteinChange | annotateMutationsByProteinChangeGet
*AnnotationsApi* | [**annotateMutationsByProteinChangePostUsingPOST1**](docs/AnnotationsApi.md#annotateMutationsByProteinChangePostUsingPOST1) | **POST** /annotate/mutations/byProteinChange | annotateMutationsByProteinChangePost
*AnnotationsApi* | [**annotateStructuralVariantsGetUsingGET1**](docs/AnnotationsApi.md#annotateStructuralVariantsGetUsingGET1) | **GET** /annotate/structuralVariants | annotateStructuralVariantsGet
*AnnotationsApi* | [**annotateStructuralVariantsPostUsingPOST1**](docs/AnnotationsApi.md#annotateStructuralVariantsPostUsingPOST1) | **POST** /annotate/structuralVariants | annotateStructuralVariantsPost
*CancerGenesApi* | [**utilsAllActionableVariantsGetUsingGET**](docs/CancerGenesApi.md#utilsAllActionableVariantsGetUsingGET) | **GET** /utils/allActionableVariants | utilsAllActionableVariantsGet
*CancerGenesApi* | [**utilsAllActionableVariantsTxtGetUsingGET**](docs/CancerGenesApi.md#utilsAllActionableVariantsTxtGetUsingGET) | **GET** /utils/allActionableVariants.txt | utilsAllActionableVariantsTxtGet
*CancerGenesApi* | [**utilsAllAnnotatedVariantsGetUsingGET**](docs/CancerGenesApi.md#utilsAllAnnotatedVariantsGetUsingGET) | **GET** /utils/allAnnotatedVariants | utilsAllAnnotatedVariantsGet
*CancerGenesApi* | [**utilsAllAnnotatedVariantsTxtGetUsingGET**](docs/CancerGenesApi.md#utilsAllAnnotatedVariantsTxtGetUsingGET) | **GET** /utils/allAnnotatedVariants.txt | utilsAllAnnotatedVariantsTxtGet
*CancerGenesApi* | [**utilsAllCuratedGenesGetUsingGET**](docs/CancerGenesApi.md#utilsAllCuratedGenesGetUsingGET) | **GET** /utils/allCuratedGenes | utilsAllCuratedGenesGet
*CancerGenesApi* | [**utilsAllCuratedGenesTxtGetUsingGET**](docs/CancerGenesApi.md#utilsAllCuratedGenesTxtGetUsingGET) | **GET** /utils/allCuratedGenes.txt | utilsAllCuratedGenesTxtGet
*CancerGenesApi* | [**utilsCancerGeneListGetUsingGET1**](docs/CancerGenesApi.md#utilsCancerGeneListGetUsingGET1) | **GET** /utils/cancerGeneList | utilsCancerGeneListGet
*CancerGenesApi* | [**utilsCancerGeneListTxtGetUsingGET1**](docs/CancerGenesApi.md#utilsCancerGeneListTxtGetUsingGET1) | **GET** /utils/cancerGeneList.txt | utilsCancerGeneListTxtGet
*ClassificationApi* | [**classificationVariantsGetUsingGET**](docs/ClassificationApi.md#classificationVariantsGetUsingGET) | **GET** /classification/variants | classificationVariantsGet
*DrugsApi* | [**drugsGetUsingGET**](docs/DrugsApi.md#drugsGetUsingGET) | **GET** /drugs | Get all curated drugs.
*DrugsApi* | [**drugsLookupGetUsingGET**](docs/DrugsApi.md#drugsLookupGetUsingGET) | **GET** /drugs/lookup | Search drugs.
*EvidencesApi* | [**evidencesLookupGetUsingGET**](docs/EvidencesApi.md#evidencesLookupGetUsingGET) | **GET** /evidences/lookup | evidencesLookupGet
*EvidencesApi* | [**evidencesLookupPostUsingPOST**](docs/EvidencesApi.md#evidencesLookupPostUsingPOST) | **POST** /evidences/lookup | evidencesLookupPost
*EvidencesApi* | [**evidencesUUIDGetUsingGET**](docs/EvidencesApi.md#evidencesUUIDGetUsingGET) | **GET** /evidences/{uuid} | evidencesUUIDGet
*EvidencesApi* | [**evidencesUUIDsGetUsingPOST**](docs/EvidencesApi.md#evidencesUUIDsGetUsingPOST) | **POST** /evidences | evidencesUUIDsGet
*GenesApi* | [**genesEntrezGeneIdEvidencesGetUsingGET**](docs/GenesApi.md#genesEntrezGeneIdEvidencesGetUsingGET) | **GET** /genes/{entrezGeneId}/evidences | genesEntrezGeneIdEvidencesGet
*GenesApi* | [**genesEntrezGeneIdGetUsingGET**](docs/GenesApi.md#genesEntrezGeneIdGetUsingGET) | **GET** /genes/{entrezGeneId} | genesEntrezGeneIdGet
*GenesApi* | [**genesEntrezGeneIdVariantsGetUsingGET**](docs/GenesApi.md#genesEntrezGeneIdVariantsGetUsingGET) | **GET** /genes/{entrezGeneId}/variants | genesEntrezGeneIdVariantsGet
*GenesApi* | [**genesGetUsingGET**](docs/GenesApi.md#genesGetUsingGET) | **GET** /genes | genesGet
*GenesApi* | [**genesLookupGetUsingGET**](docs/GenesApi.md#genesLookupGetUsingGET) | **GET** /genes/lookup | genesLookupGet
*GenesApi* | [**utilsAllCuratedGenesGetUsingGET**](docs/GenesApi.md#utilsAllCuratedGenesGetUsingGET) | **GET** /utils/allCuratedGenes | utilsAllCuratedGenesGet
*GenesApi* | [**utilsAllCuratedGenesTxtGetUsingGET**](docs/GenesApi.md#utilsAllCuratedGenesTxtGetUsingGET) | **GET** /utils/allCuratedGenes.txt | utilsAllCuratedGenesTxtGet
*GenesetsApi* | [**genesetsGetUsingGET**](docs/GenesetsApi.md#genesetsGetUsingGET) | **GET** /genesets | genesetsGet
*GenesetsApi* | [**genesetsUuidGetUsingGET**](docs/GenesetsApi.md#genesetsUuidGetUsingGET) | **GET** /genesets/{uuid} | genesetsUuidGet
*InfoApi* | [**infoGetUsingGET1**](docs/InfoApi.md#infoGetUsingGET1) | **GET** /info | infoGet
*LevelsApi* | [**levelsGetUsingGET1**](docs/LevelsApi.md#levelsGetUsingGET1) | **GET** /levels | levelsGet
*LevelsApi* | [**levelsResistanceGetUsingGET1**](docs/LevelsApi.md#levelsResistanceGetUsingGET1) | **GET** /levels/resistance | levelsResistanceGet
*LevelsApi* | [**levelsSensitiveGetUsingGET1**](docs/LevelsApi.md#levelsSensitiveGetUsingGET1) | **GET** /levels/sensitive | levelsSensitiveGet
*SearchApi* | [**searchGetUsingGET**](docs/SearchApi.md#searchGetUsingGET) | **GET** /search | searchGet
*SearchApi* | [**searchPostUsingPOST**](docs/SearchApi.md#searchPostUsingPOST) | **POST** /search | searchPost
*VariantsApi* | [**utilsAllActionableVariantsGetUsingGET**](docs/VariantsApi.md#utilsAllActionableVariantsGetUsingGET) | **GET** /utils/allActionableVariants | utilsAllActionableVariantsGet
*VariantsApi* | [**utilsAllActionableVariantsTxtGetUsingGET**](docs/VariantsApi.md#utilsAllActionableVariantsTxtGetUsingGET) | **GET** /utils/allActionableVariants.txt | utilsAllActionableVariantsTxtGet
*VariantsApi* | [**utilsAllAnnotatedVariantsGetUsingGET**](docs/VariantsApi.md#utilsAllAnnotatedVariantsGetUsingGET) | **GET** /utils/allAnnotatedVariants | utilsAllAnnotatedVariantsGet
*VariantsApi* | [**utilsAllAnnotatedVariantsTxtGetUsingGET**](docs/VariantsApi.md#utilsAllAnnotatedVariantsTxtGetUsingGET) | **GET** /utils/allAnnotatedVariants.txt | utilsAllAnnotatedVariantsTxtGet
*VariantsApi* | [**variantsGetUsingGET**](docs/VariantsApi.md#variantsGetUsingGET) | **GET** /variants | variantsGet
*VariantsApi* | [**variantsLookupGetUsingGET**](docs/VariantsApi.md#variantsLookupGetUsingGET) | **GET** /variants/lookup | variantsLookupGet
*VariantsApi* | [**variantsLookupPostUsingPOST**](docs/VariantsApi.md#variantsLookupPostUsingPOST) | **POST** /variants/lookup | variantsLookupPost


## Documentation for Models

 - [ActionableGene](docs/ActionableGene.md)
 - [Alteration](docs/Alteration.md)
 - [AnnotateCopyNumberAlterationQuery](docs/AnnotateCopyNumberAlterationQuery.md)
 - [AnnotateMutationByGenomicChangeQuery](docs/AnnotateMutationByGenomicChangeQuery.md)
 - [AnnotateMutationByHGVSgQuery](docs/AnnotateMutationByHGVSgQuery.md)
 - [AnnotateMutationByProteinChangeQuery](docs/AnnotateMutationByProteinChangeQuery.md)
 - [AnnotateStructuralVariantQuery](docs/AnnotateStructuralVariantQuery.md)
 - [AnnotatedVariant](docs/AnnotatedVariant.md)
 - [Article](docs/Article.md)
 - [ArticleAbstract](docs/ArticleAbstract.md)
 - [CancerGene](docs/CancerGene.md)
 - [Citations](docs/Citations.md)
 - [CuratedGene](docs/CuratedGene.md)
 - [Drug](docs/Drug.md)
 - [Evidence](docs/Evidence.md)
 - [EvidenceQueries](docs/EvidenceQueries.md)
 - [EvidenceQueryRes](docs/EvidenceQueryRes.md)
 - [Gene](docs/Gene.md)
 - [GeneEvidence](docs/GeneEvidence.md)
 - [Geneset](docs/Geneset.md)
 - [Implication](docs/Implication.md)
 - [IndicatorQueryResp](docs/IndicatorQueryResp.md)
 - [IndicatorQueryTreatment](docs/IndicatorQueryTreatment.md)
 - [InfoLevel](docs/InfoLevel.md)
 - [MainType](docs/MainType.md)
 - [MutationEffectResp](docs/MutationEffectResp.md)
 - [OncoKBInfo](docs/OncoKBInfo.md)
 - [Query](docs/Query.md)
 - [QueryGene](docs/QueryGene.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [Treatment](docs/Treatment.md)
 - [TreatmentDrug](docs/TreatmentDrug.md)
 - [TreatmentDrugId](docs/TreatmentDrugId.md)
 - [TumorType](docs/TumorType.md)
 - [VariantConsequence](docs/VariantConsequence.md)
 - [VariantSearchQuery](docs/VariantSearchQuery.md)
 - [Version](docs/Version.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@oncokb.org
