# AnnotationsApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annotateCopyNumberAlterationsGetUsingGET**](AnnotationsApi.md#annotateCopyNumberAlterationsGetUsingGET) | **GET** /annotate/copyNumberAlterations | annotateCopyNumberAlterationsGet
[**annotateCopyNumberAlterationsPostUsingPOST**](AnnotationsApi.md#annotateCopyNumberAlterationsPostUsingPOST) | **POST** /annotate/copyNumberAlterations | annotateCopyNumberAlterationsPost
[**annotateMutationsByGenomicChangeGetUsingGET**](AnnotationsApi.md#annotateMutationsByGenomicChangeGetUsingGET) | **GET** /annotate/mutations/byGenomicChange | annotateMutationsByGenomicChangeGet
[**annotateMutationsByGenomicChangePostUsingPOST**](AnnotationsApi.md#annotateMutationsByGenomicChangePostUsingPOST) | **POST** /annotate/mutations/byGenomicChange | annotateMutationsByGenomicChangePost
[**annotateMutationsByHGVSgGetUsingGET**](AnnotationsApi.md#annotateMutationsByHGVSgGetUsingGET) | **GET** /annotate/mutations/byHGVSg | annotateMutationsByHGVSgGet
[**annotateMutationsByHGVSgPostUsingPOST**](AnnotationsApi.md#annotateMutationsByHGVSgPostUsingPOST) | **POST** /annotate/mutations/byHGVSg | annotateMutationsByHGVSgPost
[**annotateMutationsByProteinChangeGetUsingGET**](AnnotationsApi.md#annotateMutationsByProteinChangeGetUsingGET) | **GET** /annotate/mutations/byProteinChange | annotateMutationsByProteinChangeGet
[**annotateMutationsByProteinChangePostUsingPOST**](AnnotationsApi.md#annotateMutationsByProteinChangePostUsingPOST) | **POST** /annotate/mutations/byProteinChange | annotateMutationsByProteinChangePost
[**annotateStructuralVariantsGetUsingGET**](AnnotationsApi.md#annotateStructuralVariantsGetUsingGET) | **GET** /annotate/structuralVariants | annotateStructuralVariantsGet
[**annotateStructuralVariantsPostUsingPOST**](AnnotationsApi.md#annotateStructuralVariantsPostUsingPOST) | **POST** /annotate/structuralVariants | annotateStructuralVariantsPost


<a name="annotateCopyNumberAlterationsGetUsingGET"></a>
# **annotateCopyNumberAlterationsGetUsingGET**
> IndicatorQueryResp annotateCopyNumberAlterationsGetUsingGET(copyNameAlterationType, hugoSymbol, entrezGeneId, tumorType)

annotateCopyNumberAlterationsGet

Annotate copy number alteration.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
String copyNameAlterationType = "copyNameAlterationType_example"; // String | Copy number alteration type
String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation. Example: BRAF
Integer entrezGeneId = 56; // Integer | The entrez gene ID. (Higher priority than hugoSymbol). Example: 673
String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
try {
    IndicatorQueryResp result = apiInstance.annotateCopyNumberAlterationsGetUsingGET(copyNameAlterationType, hugoSymbol, entrezGeneId, tumorType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateCopyNumberAlterationsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **copyNameAlterationType** | **String**| Copy number alteration type | [enum: AMPLIFICATION, DELETION, GAIN, LOSS]
 **hugoSymbol** | **String**| The gene symbol used in Human Genome Organisation. Example: BRAF | [optional]
 **entrezGeneId** | **Integer**| The entrez gene ID. (Higher priority than hugoSymbol). Example: 673 | [optional]
 **tumorType** | **String**| OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotateCopyNumberAlterationsPostUsingPOST"></a>
# **annotateCopyNumberAlterationsPostUsingPOST**
> List&lt;IndicatorQueryResp&gt; annotateCopyNumberAlterationsPostUsingPOST(body)

annotateCopyNumberAlterationsPost

Annotate copy number alterations.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
List<AnnotateCopyNumberAlterationQuery> body = Arrays.asList(new AnnotateCopyNumberAlterationQuery()); // List<AnnotateCopyNumberAlterationQuery> | List of queries. Please see swagger.json for request body format.
try {
    List<IndicatorQueryResp> result = apiInstance.annotateCopyNumberAlterationsPostUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateCopyNumberAlterationsPostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;AnnotateCopyNumberAlterationQuery&gt;**](AnnotateCopyNumberAlterationQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotateMutationsByGenomicChangeGetUsingGET"></a>
# **annotateMutationsByGenomicChangeGetUsingGET**
> IndicatorQueryResp annotateMutationsByGenomicChangeGetUsingGET(genomicLocation, tumorType)

annotateMutationsByGenomicChangeGet

Annotate mutation by genomic change.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
String genomicLocation = "genomicLocation_example"; // String | Genomic location. Example: 7,140453136,140453136,A,T
String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
try {
    IndicatorQueryResp result = apiInstance.annotateMutationsByGenomicChangeGetUsingGET(genomicLocation, tumorType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateMutationsByGenomicChangeGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **genomicLocation** | **String**| Genomic location. Example: 7,140453136,140453136,A,T |
 **tumorType** | **String**| OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotateMutationsByGenomicChangePostUsingPOST"></a>
# **annotateMutationsByGenomicChangePostUsingPOST**
> List&lt;IndicatorQueryResp&gt; annotateMutationsByGenomicChangePostUsingPOST(body)

annotateMutationsByGenomicChangePost

Annotate mutations by genomic change.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
List<AnnotateMutationByGenomicChangeQuery> body = Arrays.asList(new AnnotateMutationByGenomicChangeQuery()); // List<AnnotateMutationByGenomicChangeQuery> | List of queries. Please see swagger.json for request body format.
try {
    List<IndicatorQueryResp> result = apiInstance.annotateMutationsByGenomicChangePostUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateMutationsByGenomicChangePostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;AnnotateMutationByGenomicChangeQuery&gt;**](AnnotateMutationByGenomicChangeQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotateMutationsByHGVSgGetUsingGET"></a>
# **annotateMutationsByHGVSgGetUsingGET**
> IndicatorQueryResp annotateMutationsByHGVSgGetUsingGET(hgvsg, tumorType)

annotateMutationsByHGVSgGet

Annotate mutation by HGVSg.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
String hgvsg = "hgvsg_example"; // String | HGVS genomic format. Example: 7:g.140453136A>T
String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
try {
    IndicatorQueryResp result = apiInstance.annotateMutationsByHGVSgGetUsingGET(hgvsg, tumorType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateMutationsByHGVSgGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hgvsg** | **String**| HGVS genomic format. Example: 7:g.140453136A&gt;T |
 **tumorType** | **String**| OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotateMutationsByHGVSgPostUsingPOST"></a>
# **annotateMutationsByHGVSgPostUsingPOST**
> List&lt;IndicatorQueryResp&gt; annotateMutationsByHGVSgPostUsingPOST(body)

annotateMutationsByHGVSgPost

Annotate mutations by genomic change.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
List<AnnotateMutationByHGVSgQuery> body = Arrays.asList(new AnnotateMutationByHGVSgQuery()); // List<AnnotateMutationByHGVSgQuery> | List of queries. Please see swagger.json for request body format.
try {
    List<IndicatorQueryResp> result = apiInstance.annotateMutationsByHGVSgPostUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateMutationsByHGVSgPostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;AnnotateMutationByHGVSgQuery&gt;**](AnnotateMutationByHGVSgQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotateMutationsByProteinChangeGetUsingGET"></a>
# **annotateMutationsByProteinChangeGetUsingGET**
> IndicatorQueryResp annotateMutationsByProteinChangeGetUsingGET(hugoSymbol, entrezGeneId, alteration, consequence, proteinStart, proteinEnd, tumorType)

annotateMutationsByProteinChangeGet

Annotate mutation by protein change.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation. Example: BRAF
Integer entrezGeneId = 56; // Integer | The entrez gene ID. (Higher priority than hugoSymbol). Example: 673
String alteration = "alteration_example"; // String | Protein Change. Example: V600E
String consequence = "consequence_example"; // String | Consequence. Exacmple: missense_variant
Integer proteinStart = 56; // Integer | Protein Start. Example: 600
Integer proteinEnd = 56; // Integer | Protein End. Example: 600
String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
try {
    IndicatorQueryResp result = apiInstance.annotateMutationsByProteinChangeGetUsingGET(hugoSymbol, entrezGeneId, alteration, consequence, proteinStart, proteinEnd, tumorType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateMutationsByProteinChangeGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbol** | **String**| The gene symbol used in Human Genome Organisation. Example: BRAF | [optional]
 **entrezGeneId** | **Integer**| The entrez gene ID. (Higher priority than hugoSymbol). Example: 673 | [optional]
 **alteration** | **String**| Protein Change. Example: V600E | [optional]
 **consequence** | **String**| Consequence. Exacmple: missense_variant | [optional] [enum: feature_truncation, frameshift_variant, inframe_deletion, inframe_insertion, start_lost, missense_variant, splice_region_variant, stop_gained, synonymous_variant]
 **proteinStart** | **Integer**| Protein Start. Example: 600 | [optional]
 **proteinEnd** | **Integer**| Protein End. Example: 600 | [optional]
 **tumorType** | **String**| OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotateMutationsByProteinChangePostUsingPOST"></a>
# **annotateMutationsByProteinChangePostUsingPOST**
> List&lt;IndicatorQueryResp&gt; annotateMutationsByProteinChangePostUsingPOST(body)

annotateMutationsByProteinChangePost

Annotate mutations by protein change.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
List<AnnotateMutationByProteinChangeQuery> body = Arrays.asList(new AnnotateMutationByProteinChangeQuery()); // List<AnnotateMutationByProteinChangeQuery> | List of queries. Please see swagger.json for request body format.
try {
    List<IndicatorQueryResp> result = apiInstance.annotateMutationsByProteinChangePostUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateMutationsByProteinChangePostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;AnnotateMutationByProteinChangeQuery&gt;**](AnnotateMutationByProteinChangeQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotateStructuralVariantsGetUsingGET"></a>
# **annotateStructuralVariantsGetUsingGET**
> IndicatorQueryResp annotateStructuralVariantsGetUsingGET(structuralVariantType, isFunctionalFusion, hugoSymbolA, entrezGeneIdA, hugoSymbolB, entrezGeneIdB, tumorType)

annotateStructuralVariantsGet

Annotate structural variant.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
String structuralVariantType = "structuralVariantType_example"; // String | Structural variant type
Boolean isFunctionalFusion = false; // Boolean | Whether is functional fusion
String hugoSymbolA = "hugoSymbolA_example"; // String | The gene symbol A used in Human Genome Organisation. Example: ABL1
Integer entrezGeneIdA = 56; // Integer | The entrez gene ID A. (Higher priority than hugoSymbolA) Example: 25
String hugoSymbolB = "hugoSymbolB_example"; // String | The gene symbol B used in Human Genome Organisation.Example: BCR 
Integer entrezGeneIdB = 56; // Integer | The entrez gene ID B. (Higher priority than hugoSymbolB) Example: 613
String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
try {
    IndicatorQueryResp result = apiInstance.annotateStructuralVariantsGetUsingGET(structuralVariantType, isFunctionalFusion, hugoSymbolA, entrezGeneIdA, hugoSymbolB, entrezGeneIdB, tumorType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateStructuralVariantsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **structuralVariantType** | **String**| Structural variant type | [enum: DELETION, TRANSLOCATION, DUPLICATION, INSERTION, INVERSION, FUSION, UNKNOWN]
 **isFunctionalFusion** | **Boolean**| Whether is functional fusion | [default to false]
 **hugoSymbolA** | **String**| The gene symbol A used in Human Genome Organisation. Example: ABL1 | [optional]
 **entrezGeneIdA** | **Integer**| The entrez gene ID A. (Higher priority than hugoSymbolA) Example: 25 | [optional]
 **hugoSymbolB** | **String**| The gene symbol B used in Human Genome Organisation.Example: BCR  | [optional]
 **entrezGeneIdB** | **Integer**| The entrez gene ID B. (Higher priority than hugoSymbolB) Example: 613 | [optional]
 **tumorType** | **String**| OncoTree(http://oncotree.mskcc.org) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotateStructuralVariantsPostUsingPOST"></a>
# **annotateStructuralVariantsPostUsingPOST**
> List&lt;IndicatorQueryResp&gt; annotateStructuralVariantsPostUsingPOST(body)

annotateStructuralVariantsPost

Annotate structural variants.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AnnotationsApi;


AnnotationsApi apiInstance = new AnnotationsApi();
List<AnnotateStructuralVariantQuery> body = Arrays.asList(new AnnotateStructuralVariantQuery()); // List<AnnotateStructuralVariantQuery> | List of queries. Please see swagger.json for request body format.
try {
    List<IndicatorQueryResp> result = apiInstance.annotateStructuralVariantsPostUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#annotateStructuralVariantsPostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;AnnotateStructuralVariantQuery&gt;**](AnnotateStructuralVariantQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

