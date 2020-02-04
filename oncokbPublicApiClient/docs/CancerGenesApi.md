# CancerGenesApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**utilsCancerGeneListGetUsingGET**](CancerGenesApi.md#utilsCancerGeneListGetUsingGET) | **GET** /utils/cancerGeneList | utilsCancerGeneListGet
[**utilsCancerGeneListTxtGetUsingGET**](CancerGenesApi.md#utilsCancerGeneListTxtGetUsingGET) | **GET** /utils/cancerGeneList.txt | utilsCancerGeneListTxtGet


<a name="utilsCancerGeneListGetUsingGET"></a>
# **utilsCancerGeneListGetUsingGET**
> List&lt;CancerGene&gt; utilsCancerGeneListGetUsingGET(version)

utilsCancerGeneListGet

Get cancer gene list

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.CancerGenesApi;


CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    List<CancerGene> result = apiInstance.utilsCancerGeneListGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;CancerGene&gt;**](CancerGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsCancerGeneListTxtGetUsingGET"></a>
# **utilsCancerGeneListTxtGetUsingGET**
> String utilsCancerGeneListTxtGetUsingGET(version)

utilsCancerGeneListTxtGet

Get cancer gene list in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.CancerGenesApi;


CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsCancerGeneListTxtGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListTxtGetUsingGET");
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

