# ClassificationApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**classificationVariantsGetUsingGET**](ClassificationApi.md#classificationVariantsGetUsingGET) | **GET** /classification/variants | classificationVariantsGet


<a name="classificationVariantsGetUsingGET"></a>
# **classificationVariantsGetUsingGET**
> List&lt;String&gt; classificationVariantsGetUsingGET()

classificationVariantsGet

Get All OncoKB Variant Classification.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.ClassificationApi;


ClassificationApi apiInstance = new ClassificationApi();
try {
    List<String> result = apiInstance.classificationVariantsGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationApi#classificationVariantsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

