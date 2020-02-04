# DrugsApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**drugsGetUsingGET**](DrugsApi.md#drugsGetUsingGET) | **GET** /drugs | Get all curated drugs.
[**drugsLookupGetUsingGET**](DrugsApi.md#drugsLookupGetUsingGET) | **GET** /drugs/lookup | Search drugs.


<a name="drugsGetUsingGET"></a>
# **drugsGetUsingGET**
> List&lt;Drug&gt; drugsGetUsingGET()

Get all curated drugs.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.DrugsApi;


DrugsApi apiInstance = new DrugsApi();
try {
    List<Drug> result = apiInstance.drugsGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugsApi#drugsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Drug&gt;**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="drugsLookupGetUsingGET"></a>
# **drugsLookupGetUsingGET**
> List&lt;Drug&gt; drugsLookupGetUsingGET(exactMatch, name, ncitCode, synonym)

Search drugs.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.DrugsApi;


DrugsApi apiInstance = new DrugsApi();
Boolean exactMatch = true; // Boolean | Exactly Match
String name = "name_example"; // String | Drug Name
String ncitCode = "ncitCode_example"; // String | NCI Thesaurus Code
String synonym = "synonym_example"; // String | Drug Synonyms
try {
    List<Drug> result = apiInstance.drugsLookupGetUsingGET(exactMatch, name, ncitCode, synonym);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugsApi#drugsLookupGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exactMatch** | **Boolean**| Exactly Match | [default to true]
 **name** | **String**| Drug Name | [optional]
 **ncitCode** | **String**| NCI Thesaurus Code | [optional]
 **synonym** | **String**| Drug Synonyms | [optional]

### Return type

[**List&lt;Drug&gt;**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

