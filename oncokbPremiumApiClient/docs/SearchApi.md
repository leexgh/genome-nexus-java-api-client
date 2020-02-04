# SearchApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchGetUsingGET**](SearchApi.md#searchGetUsingGET) | **GET** /search | searchGet
[**searchPostUsingPOST**](SearchApi.md#searchPostUsingPOST) | **POST** /search | searchPost


<a name="searchGetUsingGET"></a>
# **searchGetUsingGET**
> IndicatorQueryResp searchGetUsingGET(id, hugoSymbol, entrezGeneId, variant, variantType, svType, consequence, proteinStart, proteinEnd, tumorType, source, levels, highestLevelOnly, queryType, evidenceType, hgvs, fields)

searchGet

General search for possible combinations.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.SearchApi;


SearchApi apiInstance = new SearchApi();
String id = "id_example"; // String | The query ID
String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation.
Integer entrezGeneId = 56; // Integer | The entrez gene ID.
String variant = "variant_example"; // String | Variant name.
String variantType = "variantType_example"; // String | Variant type.
String svType = "svType_example"; // String | Structural Variant Type.
String consequence = "consequence_example"; // String | Consequence
Integer proteinStart = 56; // Integer | Protein Start
Integer proteinEnd = 56; // Integer | Protein End
String tumorType = "tumorType_example"; // String | Tumor type name. OncoTree code is supported.
String source = "oncotree"; // String | Tumor type source. OncoTree tumor types are the default setting. We may have customized version, like Quest.
String levels = "levels_example"; // String | Level of evidences.
Boolean highestLevelOnly = false; // Boolean | Only show treatments of highest level
String queryType = "regular"; // String | Query type. There maybe slight differences between different query types. Currently support web or regular.
String evidenceType = "evidenceType_example"; // String | Evidence type.
String hgvs = "hgvs_example"; // String | HGVS varaint. Its priority is higher than entrezGeneId/hugoSymbol + variant combination
String fields = "fields_example"; // String | The fields to be returned.
try {
    IndicatorQueryResp result = apiInstance.searchGetUsingGET(id, hugoSymbol, entrezGeneId, variant, variantType, svType, consequence, proteinStart, proteinEnd, tumorType, source, levels, highestLevelOnly, queryType, evidenceType, hgvs, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The query ID | [optional]
 **hugoSymbol** | **String**| The gene symbol used in Human Genome Organisation. | [optional]
 **entrezGeneId** | **Integer**| The entrez gene ID. | [optional]
 **variant** | **String**| Variant name. | [optional]
 **variantType** | **String**| Variant type. | [optional]
 **svType** | **String**| Structural Variant Type. | [optional] [enum: DELETION, TRANSLOCATION, DUPLICATION, INSERTION, INVERSION, FUSION, UNKNOWN]
 **consequence** | **String**| Consequence | [optional]
 **proteinStart** | **Integer**| Protein Start | [optional]
 **proteinEnd** | **Integer**| Protein End | [optional]
 **tumorType** | **String**| Tumor type name. OncoTree code is supported. | [optional]
 **source** | **String**| Tumor type source. OncoTree tumor types are the default setting. We may have customized version, like Quest. | [optional] [default to oncotree]
 **levels** | **String**| Level of evidences. | [optional]
 **highestLevelOnly** | **Boolean**| Only show treatments of highest level | [optional] [default to false]
 **queryType** | **String**| Query type. There maybe slight differences between different query types. Currently support web or regular. | [optional] [default to regular]
 **evidenceType** | **String**| Evidence type. | [optional]
 **hgvs** | **String**| HGVS varaint. Its priority is higher than entrezGeneId/hugoSymbol + variant combination | [optional]
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchPostUsingPOST"></a>
# **searchPostUsingPOST**
> List&lt;IndicatorQueryResp&gt; searchPostUsingPOST(body, fields)

searchPost

General search for possible combinations.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.SearchApi;


SearchApi apiInstance = new SearchApi();
EvidenceQueries body = new EvidenceQueries(); // EvidenceQueries | List of queries. Please see swagger.json for request body format.
String fields = "fields_example"; // String | The fields to be returned.
try {
    List<IndicatorQueryResp> result = apiInstance.searchPostUsingPOST(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchPostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EvidenceQueries**](EvidenceQueries.md)| List of queries. Please see swagger.json for request body format. |
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

