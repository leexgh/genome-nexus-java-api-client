# EvidencesApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evidencesLookupGetUsingGET**](EvidencesApi.md#evidencesLookupGetUsingGET) | **GET** /evidences/lookup | evidencesLookupGet
[**evidencesLookupPostUsingPOST**](EvidencesApi.md#evidencesLookupPostUsingPOST) | **POST** /evidences/lookup | evidencesLookupPost
[**evidencesUUIDGetUsingGET**](EvidencesApi.md#evidencesUUIDGetUsingGET) | **GET** /evidences/{uuid} | evidencesUUIDGet
[**evidencesUUIDsGetUsingPOST**](EvidencesApi.md#evidencesUUIDsGetUsingPOST) | **POST** /evidences | evidencesUUIDsGet


<a name="evidencesLookupGetUsingGET"></a>
# **evidencesLookupGetUsingGET**
> List&lt;Evidence&gt; evidencesLookupGetUsingGET(entrezGeneId, hugoSymbol, variant, tumorType, consequence, proteinStart, proteinEnd, source, highestLevelOnly, levelOfEvidence, evidenceTypes, fields)

evidencesLookupGet

Search evidences. Multi-queries are supported.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.EvidencesApi;


EvidencesApi apiInstance = new EvidencesApi();
Integer entrezGeneId = 56; // Integer | The entrez gene ID.
String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation.
String variant = "variant_example"; // String | Variant name.
String tumorType = "tumorType_example"; // String | Tumor type name. OncoTree code is supported.
String consequence = "consequence_example"; // String | Consequence. Possible value: feature_truncation, frameshift_variant, inframe_deletion, inframe_insertion, start_lost, missense_variant, splice_region_variant, stop_gained, synonymous_variant
String proteinStart = "proteinStart_example"; // String | Protein Start.
String proteinEnd = "proteinEnd_example"; // String | Protein End.
String source = "oncotree"; // String | Tumor type source. OncoTree tumor types are the default setting. We may have customized version, like Quest.
Boolean highestLevelOnly = false; // Boolean | Only show highest level evidences
String levelOfEvidence = "levelOfEvidence_example"; // String | Separate by comma. LEVEL_1, LEVEL_2A, LEVEL_2B, LEVEL_3A, LEVEL_3B, LEVEL_4, LEVEL_R1, LEVEL_R2, LEVEL_R3
String evidenceTypes = "evidenceTypes_example"; // String | Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND, MUTATION_SUMMARY, ONCOGENIC, MUTATION_EFFECT, VUS, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, TUMOR_TYPE_SUMMARY, DIAGNOSTIC_SUMMARY, PROGNOSTIC_SUMMARY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE
String fields = "fields_example"; // String | The fields to be returned.
try {
    List<Evidence> result = apiInstance.evidencesLookupGetUsingGET(entrezGeneId, hugoSymbol, variant, tumorType, consequence, proteinStart, proteinEnd, source, highestLevelOnly, levelOfEvidence, evidenceTypes, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvidencesApi#evidencesLookupGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entrezGeneId** | **Integer**| The entrez gene ID. | [optional]
 **hugoSymbol** | **String**| The gene symbol used in Human Genome Organisation. | [optional]
 **variant** | **String**| Variant name. | [optional]
 **tumorType** | **String**| Tumor type name. OncoTree code is supported. | [optional]
 **consequence** | **String**| Consequence. Possible value: feature_truncation, frameshift_variant, inframe_deletion, inframe_insertion, start_lost, missense_variant, splice_region_variant, stop_gained, synonymous_variant | [optional]
 **proteinStart** | **String**| Protein Start. | [optional]
 **proteinEnd** | **String**| Protein End. | [optional]
 **source** | **String**| Tumor type source. OncoTree tumor types are the default setting. We may have customized version, like Quest. | [optional] [default to oncotree]
 **highestLevelOnly** | **Boolean**| Only show highest level evidences | [optional] [default to false]
 **levelOfEvidence** | **String**| Separate by comma. LEVEL_1, LEVEL_2A, LEVEL_2B, LEVEL_3A, LEVEL_3B, LEVEL_4, LEVEL_R1, LEVEL_R2, LEVEL_R3 | [optional]
 **evidenceTypes** | **String**| Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND, MUTATION_SUMMARY, ONCOGENIC, MUTATION_EFFECT, VUS, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, TUMOR_TYPE_SUMMARY, DIAGNOSTIC_SUMMARY, PROGNOSTIC_SUMMARY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE | [optional]
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;Evidence&gt;**](Evidence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="evidencesLookupPostUsingPOST"></a>
# **evidencesLookupPostUsingPOST**
> List&lt;EvidenceQueryRes&gt; evidencesLookupPostUsingPOST(body, fields)

evidencesLookupPost

Search evidences.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.EvidencesApi;


EvidencesApi apiInstance = new EvidencesApi();
EvidenceQueries body = new EvidenceQueries(); // EvidenceQueries | List of queries. Please see swagger.json for request body format. Please use JSON string.
String fields = "fields_example"; // String | The fields to be returned.
try {
    List<EvidenceQueryRes> result = apiInstance.evidencesLookupPostUsingPOST(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvidencesApi#evidencesLookupPostUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EvidenceQueries**](EvidenceQueries.md)| List of queries. Please see swagger.json for request body format. Please use JSON string. |
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;EvidenceQueryRes&gt;**](EvidenceQueryRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="evidencesUUIDGetUsingGET"></a>
# **evidencesUUIDGetUsingGET**
> Evidence evidencesUUIDGetUsingGET(uuid, fields)

evidencesUUIDGet

Get specific evidence.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.EvidencesApi;


EvidencesApi apiInstance = new EvidencesApi();
String uuid = "uuid_example"; // String | Unique identifier.
String fields = "fields_example"; // String | The fields to be returned.
try {
    Evidence result = apiInstance.evidencesUUIDGetUsingGET(uuid, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvidencesApi#evidencesUUIDGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| Unique identifier. |
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**Evidence**](Evidence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="evidencesUUIDsGetUsingPOST"></a>
# **evidencesUUIDsGetUsingPOST**
> Evidence evidencesUUIDsGetUsingPOST(uuids, fields)

evidencesUUIDsGet

Get specific evidences.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.EvidencesApi;


EvidencesApi apiInstance = new EvidencesApi();
List<String> uuids = Arrays.asList(new List<String>()); // List<String> | Unique identifier list.
String fields = "fields_example"; // String | The fields to be returned.
try {
    Evidence result = apiInstance.evidencesUUIDsGetUsingPOST(uuids, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvidencesApi#evidencesUUIDsGetUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuids** | **List&lt;String&gt;**| Unique identifier list. |
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**Evidence**](Evidence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

