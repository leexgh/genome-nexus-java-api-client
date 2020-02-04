# LevelsApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**levelsGetUsingGET1**](LevelsApi.md#levelsGetUsingGET1) | **GET** /levels | levelsGet
[**levelsResistanceGetUsingGET1**](LevelsApi.md#levelsResistanceGetUsingGET1) | **GET** /levels/resistance | levelsResistanceGet
[**levelsSensitiveGetUsingGET1**](LevelsApi.md#levelsSensitiveGetUsingGET1) | **GET** /levels/sensitive | levelsSensitiveGet


<a name="levelsGetUsingGET1"></a>
# **levelsGetUsingGET1**
> Object levelsGetUsingGET1()

levelsGet

Get all levels.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.LevelsApi;


LevelsApi apiInstance = new LevelsApi();
try {
    Object result = apiInstance.levelsGetUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelsApi#levelsGetUsingGET1");
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

<a name="levelsResistanceGetUsingGET1"></a>
# **levelsResistanceGetUsingGET1**
> Object levelsResistanceGetUsingGET1()

levelsResistanceGet

Get all resistance levels.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.LevelsApi;


LevelsApi apiInstance = new LevelsApi();
try {
    Object result = apiInstance.levelsResistanceGetUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelsApi#levelsResistanceGetUsingGET1");
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

<a name="levelsSensitiveGetUsingGET1"></a>
# **levelsSensitiveGetUsingGET1**
> Object levelsSensitiveGetUsingGET1()

levelsSensitiveGet

Get all sensitive levels.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.LevelsApi;


LevelsApi apiInstance = new LevelsApi();
try {
    Object result = apiInstance.levelsSensitiveGetUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelsApi#levelsSensitiveGetUsingGET1");
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

