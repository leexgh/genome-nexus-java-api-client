# GenesApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genesEntrezGeneIdEvidencesGetUsingGET**](GenesApi.md#genesEntrezGeneIdEvidencesGetUsingGET) | **GET** /genes/{entrezGeneId}/evidences | genesEntrezGeneIdEvidencesGet
[**genesEntrezGeneIdGetUsingGET**](GenesApi.md#genesEntrezGeneIdGetUsingGET) | **GET** /genes/{entrezGeneId} | genesEntrezGeneIdGet
[**genesEntrezGeneIdVariantsGetUsingGET**](GenesApi.md#genesEntrezGeneIdVariantsGetUsingGET) | **GET** /genes/{entrezGeneId}/variants | genesEntrezGeneIdVariantsGet
[**genesGetUsingGET**](GenesApi.md#genesGetUsingGET) | **GET** /genes | genesGet
[**genesLookupGetUsingGET**](GenesApi.md#genesLookupGetUsingGET) | **GET** /genes/lookup | genesLookupGet
[**utilsAllCuratedGenesGetUsingGET**](GenesApi.md#utilsAllCuratedGenesGetUsingGET) | **GET** /utils/allCuratedGenes | utilsAllCuratedGenesGet
[**utilsAllCuratedGenesTxtGetUsingGET**](GenesApi.md#utilsAllCuratedGenesTxtGetUsingGET) | **GET** /utils/allCuratedGenes.txt | utilsAllCuratedGenesTxtGet


<a name="genesEntrezGeneIdEvidencesGetUsingGET"></a>
# **genesEntrezGeneIdEvidencesGetUsingGET**
> List&lt;GeneEvidence&gt; genesEntrezGeneIdEvidencesGetUsingGET(entrezGeneId, evidenceTypes)

genesEntrezGeneIdEvidencesGet

Get list of evidences for specific gene.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.GenesApi;


GenesApi apiInstance = new GenesApi();
Integer entrezGeneId = 56; // Integer | The entrez gene ID.
String evidenceTypes = "evidenceTypes_example"; // String | Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND
try {
    List<GeneEvidence> result = apiInstance.genesEntrezGeneIdEvidencesGetUsingGET(entrezGeneId, evidenceTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenesApi#genesEntrezGeneIdEvidencesGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entrezGeneId** | **Integer**| The entrez gene ID. |
 **evidenceTypes** | **String**| Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND | [optional]

### Return type

[**List&lt;GeneEvidence&gt;**](GeneEvidence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genesEntrezGeneIdGetUsingGET"></a>
# **genesEntrezGeneIdGetUsingGET**
> Gene genesEntrezGeneIdGetUsingGET(entrezGeneId, fields)

genesEntrezGeneIdGet

Get specific gene information.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.GenesApi;


GenesApi apiInstance = new GenesApi();
Integer entrezGeneId = 56; // Integer | The entrez gene ID.
String fields = "fields_example"; // String | The fields to be returned.
try {
    Gene result = apiInstance.genesEntrezGeneIdGetUsingGET(entrezGeneId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenesApi#genesEntrezGeneIdGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entrezGeneId** | **Integer**| The entrez gene ID. |
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**Gene**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genesEntrezGeneIdVariantsGetUsingGET"></a>
# **genesEntrezGeneIdVariantsGetUsingGET**
> List&lt;Alteration&gt; genesEntrezGeneIdVariantsGetUsingGET(entrezGeneId, fields)

genesEntrezGeneIdVariantsGet

Get list of variants for specific gene.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.GenesApi;


GenesApi apiInstance = new GenesApi();
Integer entrezGeneId = 56; // Integer | The entrez gene ID.
String fields = "fields_example"; // String | The fields to be returned.
try {
    List<Alteration> result = apiInstance.genesEntrezGeneIdVariantsGetUsingGET(entrezGeneId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenesApi#genesEntrezGeneIdVariantsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entrezGeneId** | **Integer**| The entrez gene ID. |
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;Alteration&gt;**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genesGetUsingGET"></a>
# **genesGetUsingGET**
> List&lt;Gene&gt; genesGetUsingGET(fields)

genesGet

Get list of currently curated genes.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.GenesApi;


GenesApi apiInstance = new GenesApi();
String fields = "fields_example"; // String | The fields to be returned.
try {
    List<Gene> result = apiInstance.genesGetUsingGET(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenesApi#genesGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;Gene&gt;**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genesLookupGetUsingGET"></a>
# **genesLookupGetUsingGET**
> List&lt;Gene&gt; genesLookupGetUsingGET(hugoSymbol, entrezGeneId, query, fields)

genesLookupGet

Search gene.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.GenesApi;


GenesApi apiInstance = new GenesApi();
String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation. (Deprecated, use query instead)
Integer entrezGeneId = 56; // Integer | The entrez gene ID. (Deprecated, use query instead)
String query = "query_example"; // String | The search query, it could be hugoSymbol or entrezGeneId.
String fields = "fields_example"; // String | The fields to be returned.
try {
    List<Gene> result = apiInstance.genesLookupGetUsingGET(hugoSymbol, entrezGeneId, query, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenesApi#genesLookupGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbol** | **String**| The gene symbol used in Human Genome Organisation. (Deprecated, use query instead) | [optional]
 **entrezGeneId** | **Integer**| The entrez gene ID. (Deprecated, use query instead) | [optional]
 **query** | **String**| The search query, it could be hugoSymbol or entrezGeneId. | [optional]
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;Gene&gt;**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsAllCuratedGenesGetUsingGET"></a>
# **utilsAllCuratedGenesGetUsingGET**
> List&lt;CuratedGene&gt; utilsAllCuratedGenesGetUsingGET(version)

utilsAllCuratedGenesGet

Get list of genes OncoKB curated

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.GenesApi;


GenesApi apiInstance = new GenesApi();
String version = "version_example"; // String | version
try {
    List<CuratedGene> result = apiInstance.utilsAllCuratedGenesGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenesApi#utilsAllCuratedGenesGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;CuratedGene&gt;**](CuratedGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsAllCuratedGenesTxtGetUsingGET"></a>
# **utilsAllCuratedGenesTxtGetUsingGET**
> String utilsAllCuratedGenesTxtGetUsingGET(version)

utilsAllCuratedGenesTxtGet

Get list of genes OncoKB curated in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.GenesApi;


GenesApi apiInstance = new GenesApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsAllCuratedGenesTxtGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenesApi#utilsAllCuratedGenesTxtGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

