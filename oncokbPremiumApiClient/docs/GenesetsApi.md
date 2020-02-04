# GenesetsApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genesetsGetUsingGET**](GenesetsApi.md#genesetsGetUsingGET) | **GET** /genesets | genesetsGet
[**genesetsUuidGetUsingGET**](GenesetsApi.md#genesetsUuidGetUsingGET) | **GET** /genesets/{uuid} | genesetsUuidGet


<a name="genesetsGetUsingGET"></a>
# **genesetsGetUsingGET**
> List&lt;Geneset&gt; genesetsGetUsingGET()

genesetsGet

Get list of currently curated genesets.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.GenesetsApi;


GenesetsApi apiInstance = new GenesetsApi();
try {
    List<Geneset> result = apiInstance.genesetsGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenesetsApi#genesetsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Geneset&gt;**](Geneset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genesetsUuidGetUsingGET"></a>
# **genesetsUuidGetUsingGET**
> Geneset genesetsUuidGetUsingGET(uuid)

genesetsUuidGet

Find geneset by uuid

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.GenesetsApi;


GenesetsApi apiInstance = new GenesetsApi();
String uuid = "uuid_example"; // String | Geneset UUID
try {
    Geneset result = apiInstance.genesetsUuidGetUsingGET(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenesetsApi#genesetsUuidGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| Geneset UUID |

### Return type

[**Geneset**](Geneset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

