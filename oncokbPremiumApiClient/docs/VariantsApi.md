# VariantsApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**utilsAllActionableVariantsGetUsingGET**](VariantsApi.md#utilsAllActionableVariantsGetUsingGET) | **GET** /utils/allActionableVariants | utilsAllActionableVariantsGet
[**utilsAllActionableVariantsTxtGetUsingGET**](VariantsApi.md#utilsAllActionableVariantsTxtGetUsingGET) | **GET** /utils/allActionableVariants.txt | utilsAllActionableVariantsTxtGet
[**utilsAllAnnotatedVariantsGetUsingGET**](VariantsApi.md#utilsAllAnnotatedVariantsGetUsingGET) | **GET** /utils/allAnnotatedVariants | utilsAllAnnotatedVariantsGet
[**utilsAllAnnotatedVariantsTxtGetUsingGET**](VariantsApi.md#utilsAllAnnotatedVariantsTxtGetUsingGET) | **GET** /utils/allAnnotatedVariants.txt | utilsAllAnnotatedVariantsTxtGet
[**variantsGetUsingGET**](VariantsApi.md#variantsGetUsingGET) | **GET** /variants | variantsGet
[**variantsLookupGetUsingGET**](VariantsApi.md#variantsLookupGetUsingGET) | **GET** /variants/lookup | variantsLookupGet
[**variantsLookupPostUsingPOST**](VariantsApi.md#variantsLookupPostUsingPOST) | **POST** /variants/lookup | variantsLookupPost


<a name="utilsAllActionableVariantsGetUsingGET"></a>
# **utilsAllActionableVariantsGetUsingGET**
> List&lt;ActionableGene&gt; utilsAllActionableVariantsGetUsingGET(version)

utilsAllActionableVariantsGet

Get All Actionable Variants.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.VariantsApi;


VariantsApi apiInstance = new VariantsApi();
String version = "version_example"; // String | version
try {
    List<ActionableGene> result = apiInstance.utilsAllActionableVariantsGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantsApi#utilsAllActionableVariantsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;ActionableGene&gt;**](ActionableGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsAllActionableVariantsTxtGetUsingGET"></a>
# **utilsAllActionableVariantsTxtGetUsingGET**
> String utilsAllActionableVariantsTxtGetUsingGET(version)

utilsAllActionableVariantsTxtGet

Get All Actionable Variants in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.VariantsApi;


VariantsApi apiInstance = new VariantsApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsAllActionableVariantsTxtGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantsApi#utilsAllActionableVariantsTxtGetUsingGET");
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

<a name="utilsAllAnnotatedVariantsGetUsingGET"></a>
# **utilsAllAnnotatedVariantsGetUsingGET**
> List&lt;AnnotatedVariant&gt; utilsAllAnnotatedVariantsGetUsingGET(version)

utilsAllAnnotatedVariantsGet

Get All Annotated Variants.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.VariantsApi;


VariantsApi apiInstance = new VariantsApi();
String version = "version_example"; // String | version
try {
    List<AnnotatedVariant> result = apiInstance.utilsAllAnnotatedVariantsGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantsApi#utilsAllAnnotatedVariantsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;AnnotatedVariant&gt;**](AnnotatedVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsAllAnnotatedVariantsTxtGetUsingGET"></a>
# **utilsAllAnnotatedVariantsTxtGetUsingGET**
> String utilsAllAnnotatedVariantsTxtGetUsingGET(version)

utilsAllAnnotatedVariantsTxtGet

Get All Annotated Variants in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.VariantsApi;


VariantsApi apiInstance = new VariantsApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsAllAnnotatedVariantsTxtGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantsApi#utilsAllAnnotatedVariantsTxtGetUsingGET");
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

<a name="variantsGetUsingGET"></a>
# **variantsGetUsingGET**
> List&lt;Alteration&gt; variantsGetUsingGET(fields)

variantsGet

Get all annotated variants.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.VariantsApi;


VariantsApi apiInstance = new VariantsApi();
String fields = "fields_example"; // String | The fields to be returned.
try {
    List<Alteration> result = apiInstance.variantsGetUsingGET(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantsApi#variantsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;Alteration&gt;**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="variantsLookupGetUsingGET"></a>
# **variantsLookupGetUsingGET**
> List&lt;Alteration&gt; variantsLookupGetUsingGET(entrezGeneId, hugoSymbol, variant, variantType, consequence, proteinStart, proteinEnd, hgvs, fields)

variantsLookupGet

Search for variants.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.VariantsApi;


VariantsApi apiInstance = new VariantsApi();
Integer entrezGeneId = 56; // Integer | The entrez gene ID. entrezGeneId is prioritize than hugoSymbol if both parameters have been defined
String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation.
String variant = "variant_example"; // String | variant name.
String variantType = "variantType_example"; // String | variantType
String consequence = "consequence_example"; // String | consequence
Integer proteinStart = 56; // Integer | proteinStart
Integer proteinEnd = 56; // Integer | proteinEnd
String hgvs = "hgvs_example"; // String | HGVS varaint. Its priority is higher than entrezGeneId/hugoSymbol + variant combination
String fields = "fields_example"; // String | The fields to be returned.
try {
    List<Alteration> result = apiInstance.variantsLookupGetUsingGET(entrezGeneId, hugoSymbol, variant, variantType, consequence, proteinStart, proteinEnd, hgvs, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantsApi#variantsLookupGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entrezGeneId** | **Integer**| The entrez gene ID. entrezGeneId is prioritize than hugoSymbol if both parameters have been defined | [optional]
 **hugoSymbol** | **String**| The gene symbol used in Human Genome Organisation. | [optional]
 **variant** | **String**| variant name. | [optional]
 **variantType** | **String**| variantType | [optional]
 **consequence** | **String**| consequence | [optional]
 **proteinStart** | **Integer**| proteinStart | [optional]
 **proteinEnd** | **Integer**| proteinEnd | [optional]
 **hgvs** | **String**| HGVS varaint. Its priority is higher than entrezGeneId/hugoSymbol + variant combination | [optional]
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;Alteration&gt;**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="variantsLookupPostUsingPOST"></a>
# **variantsLookupPostUsingPOST**
> List&lt;List&lt;Object&gt;&gt; variantsLookupPostUsingPOST(body, fields)

variantsLookupPost

Search for variants.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.VariantsApi;


VariantsApi apiInstance = new VariantsApi();
List<VariantSearchQuery> body = Arrays.asList(new VariantSearchQuery()); // List<VariantSearchQuery> | List of queries.
String fields = "fields_example"; // String | The fields to be returned.
try {
    List<List<Object>> result = apiInstance.variantsLookupPostUsingPOST(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantsApi#variantsLookupPostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;VariantSearchQuery&gt;**](VariantSearchQuery.md)| List of queries. |
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;List&lt;Object&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

