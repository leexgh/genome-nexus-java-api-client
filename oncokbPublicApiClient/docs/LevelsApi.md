# LevelsApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**levelsGetUsingGET**](LevelsApi.md#levelsGetUsingGET) | **GET** /levels | levelsGet
[**levelsResistanceGetUsingGET**](LevelsApi.md#levelsResistanceGetUsingGET) | **GET** /levels/resistance | levelsResistanceGet
[**levelsSensitiveGetUsingGET**](LevelsApi.md#levelsSensitiveGetUsingGET) | **GET** /levels/sensitive | levelsSensitiveGet


<a name="levelsGetUsingGET"></a>
# **levelsGetUsingGET**
> Object levelsGetUsingGET()

levelsGet

Get all levels.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.LevelsApi;


LevelsApi apiInstance = new LevelsApi();
try {
    Object result = apiInstance.levelsGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelsApi#levelsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="levelsResistanceGetUsingGET"></a>
# **levelsResistanceGetUsingGET**
> Object levelsResistanceGetUsingGET()

levelsResistanceGet

Get all resistance levels.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.LevelsApi;


LevelsApi apiInstance = new LevelsApi();
try {
    Object result = apiInstance.levelsResistanceGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelsApi#levelsResistanceGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="levelsSensitiveGetUsingGET"></a>
# **levelsSensitiveGetUsingGET**
> Object levelsSensitiveGetUsingGET()

levelsSensitiveGet

Get all sensitive levels.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.LevelsApi;


LevelsApi apiInstance = new LevelsApi();
try {
    Object result = apiInstance.levelsSensitiveGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelsApi#levelsSensitiveGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

