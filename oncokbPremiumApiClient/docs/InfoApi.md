# InfoApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infoGetUsingGET1**](InfoApi.md#infoGetUsingGET1) | **GET** /info | infoGet


<a name="infoGetUsingGET1"></a>
# **infoGetUsingGET1**
> OncoKBInfo infoGetUsingGET1()

infoGet

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.InfoApi;


InfoApi apiInstance = new InfoApi();
try {
    OncoKBInfo result = apiInstance.infoGetUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoApi#infoGetUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OncoKBInfo**](OncoKBInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

