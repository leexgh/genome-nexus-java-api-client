/*
 * Genome Nexus API
 * Genome Nexus Variant Annotation API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import org.genome_nexus.ApiCallback;
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.ApiResponse;
import org.genome_nexus.Configuration;
import org.genome_nexus.Pair;
import org.genome_nexus.ProgressRequestBody;
import org.genome_nexus.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.genome_nexus.client.GenomicLocation;
import org.genome_nexus.client.VariantAnnotation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationControllerApi {
    private ApiClient apiClient;

    public AnnotationControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnnotationControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for fetchVariantAnnotationByGenomicLocationGET
     * @param genomicLocation A genomic location. For example 7,140453136,140453136,A,T (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationByGenomicLocationGETCall(String genomicLocation, String isoformOverrideSource, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/annotation/genomic/{genomicLocation}"
            .replaceAll("\\{" + "genomicLocation" + "\\}", apiClient.escapeString(genomicLocation.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isoformOverrideSource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isoformOverrideSource", isoformOverrideSource));
        if (fields != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fetchVariantAnnotationByGenomicLocationGETValidateBeforeCall(String genomicLocation, String isoformOverrideSource, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'genomicLocation' is set
        if (genomicLocation == null) {
            throw new ApiException("Missing the required parameter 'genomicLocation' when calling fetchVariantAnnotationByGenomicLocationGET(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchVariantAnnotationByGenomicLocationGETCall(genomicLocation, isoformOverrideSource, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves VEP annotation for the provided genomic location
     * 
     * @param genomicLocation A genomic location. For example 7,140453136,140453136,A,T (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @return VariantAnnotation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VariantAnnotation fetchVariantAnnotationByGenomicLocationGET(String genomicLocation, String isoformOverrideSource, List<String> fields) throws ApiException {
        ApiResponse<VariantAnnotation> resp = fetchVariantAnnotationByGenomicLocationGETWithHttpInfo(genomicLocation, isoformOverrideSource, fields);
        return resp.getData();
    }

    /**
     * Retrieves VEP annotation for the provided genomic location
     * 
     * @param genomicLocation A genomic location. For example 7,140453136,140453136,A,T (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @return ApiResponse&lt;VariantAnnotation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VariantAnnotation> fetchVariantAnnotationByGenomicLocationGETWithHttpInfo(String genomicLocation, String isoformOverrideSource, List<String> fields) throws ApiException {
        com.squareup.okhttp.Call call = fetchVariantAnnotationByGenomicLocationGETValidateBeforeCall(genomicLocation, isoformOverrideSource, fields, null, null);
        Type localVarReturnType = new TypeToken<VariantAnnotation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves VEP annotation for the provided genomic location (asynchronously)
     * 
     * @param genomicLocation A genomic location. For example 7,140453136,140453136,A,T (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationByGenomicLocationGETAsync(String genomicLocation, String isoformOverrideSource, List<String> fields, final ApiCallback<VariantAnnotation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = fetchVariantAnnotationByGenomicLocationGETValidateBeforeCall(genomicLocation, isoformOverrideSource, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VariantAnnotation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchVariantAnnotationByGenomicLocationPOST
     * @param genomicLocations List of Genomic Locations (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationByGenomicLocationPOSTCall(List<GenomicLocation> genomicLocations, String isoformOverrideSource, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = genomicLocations;

        // create path and map variables
        String localVarPath = "/annotation/genomic";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isoformOverrideSource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isoformOverrideSource", isoformOverrideSource));
        if (fields != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fetchVariantAnnotationByGenomicLocationPOSTValidateBeforeCall(List<GenomicLocation> genomicLocations, String isoformOverrideSource, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'genomicLocations' is set
        if (genomicLocations == null) {
            throw new ApiException("Missing the required parameter 'genomicLocations' when calling fetchVariantAnnotationByGenomicLocationPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchVariantAnnotationByGenomicLocationPOSTCall(genomicLocations, isoformOverrideSource, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves VEP annotation for the provided list of genomic locations
     * 
     * @param genomicLocations List of Genomic Locations (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @return List&lt;VariantAnnotation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<VariantAnnotation> fetchVariantAnnotationByGenomicLocationPOST(List<GenomicLocation> genomicLocations, String isoformOverrideSource, List<String> fields) throws ApiException {
        ApiResponse<List<VariantAnnotation>> resp = fetchVariantAnnotationByGenomicLocationPOSTWithHttpInfo(genomicLocations, isoformOverrideSource, fields);
        return resp.getData();
    }

    /**
     * Retrieves VEP annotation for the provided list of genomic locations
     * 
     * @param genomicLocations List of Genomic Locations (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @return ApiResponse&lt;List&lt;VariantAnnotation&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<VariantAnnotation>> fetchVariantAnnotationByGenomicLocationPOSTWithHttpInfo(List<GenomicLocation> genomicLocations, String isoformOverrideSource, List<String> fields) throws ApiException {
        com.squareup.okhttp.Call call = fetchVariantAnnotationByGenomicLocationPOSTValidateBeforeCall(genomicLocations, isoformOverrideSource, fields, null, null);
        Type localVarReturnType = new TypeToken<List<VariantAnnotation>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves VEP annotation for the provided list of genomic locations (asynchronously)
     * 
     * @param genomicLocations List of Genomic Locations (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationByGenomicLocationPOSTAsync(List<GenomicLocation> genomicLocations, String isoformOverrideSource, List<String> fields, final ApiCallback<List<VariantAnnotation>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = fetchVariantAnnotationByGenomicLocationPOSTValidateBeforeCall(genomicLocations, isoformOverrideSource, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<VariantAnnotation>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchVariantAnnotationGET
     * @param variant Variant. For example 17:g.41242962_41242963insGA (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationGETCall(String variant, String isoformOverrideSource, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/annotation/{variant}"
            .replaceAll("\\{" + "variant" + "\\}", apiClient.escapeString(variant.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isoformOverrideSource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isoformOverrideSource", isoformOverrideSource));
        if (fields != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fetchVariantAnnotationGETValidateBeforeCall(String variant, String isoformOverrideSource, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'variant' is set
        if (variant == null) {
            throw new ApiException("Missing the required parameter 'variant' when calling fetchVariantAnnotationGET(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchVariantAnnotationGETCall(variant, isoformOverrideSource, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves VEP annotation for the provided variant
     * 
     * @param variant Variant. For example 17:g.41242962_41242963insGA (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @return VariantAnnotation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VariantAnnotation fetchVariantAnnotationGET(String variant, String isoformOverrideSource, List<String> fields) throws ApiException {
        ApiResponse<VariantAnnotation> resp = fetchVariantAnnotationGETWithHttpInfo(variant, isoformOverrideSource, fields);
        return resp.getData();
    }

    /**
     * Retrieves VEP annotation for the provided variant
     * 
     * @param variant Variant. For example 17:g.41242962_41242963insGA (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @return ApiResponse&lt;VariantAnnotation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VariantAnnotation> fetchVariantAnnotationGETWithHttpInfo(String variant, String isoformOverrideSource, List<String> fields) throws ApiException {
        com.squareup.okhttp.Call call = fetchVariantAnnotationGETValidateBeforeCall(variant, isoformOverrideSource, fields, null, null);
        Type localVarReturnType = new TypeToken<VariantAnnotation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves VEP annotation for the provided variant (asynchronously)
     * 
     * @param variant Variant. For example 17:g.41242962_41242963insGA (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationGETAsync(String variant, String isoformOverrideSource, List<String> fields, final ApiCallback<VariantAnnotation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = fetchVariantAnnotationGETValidateBeforeCall(variant, isoformOverrideSource, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VariantAnnotation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchVariantAnnotationPOST
     * @param variants List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationPOSTCall(List<String> variants, String isoformOverrideSource, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = variants;

        // create path and map variables
        String localVarPath = "/annotation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isoformOverrideSource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isoformOverrideSource", isoformOverrideSource));
        if (fields != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fetchVariantAnnotationPOSTValidateBeforeCall(List<String> variants, String isoformOverrideSource, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'variants' is set
        if (variants == null) {
            throw new ApiException("Missing the required parameter 'variants' when calling fetchVariantAnnotationPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchVariantAnnotationPOSTCall(variants, isoformOverrideSource, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves VEP annotation for the provided list of variants
     * 
     * @param variants List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @return List&lt;VariantAnnotation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<VariantAnnotation> fetchVariantAnnotationPOST(List<String> variants, String isoformOverrideSource, List<String> fields) throws ApiException {
        ApiResponse<List<VariantAnnotation>> resp = fetchVariantAnnotationPOSTWithHttpInfo(variants, isoformOverrideSource, fields);
        return resp.getData();
    }

    /**
     * Retrieves VEP annotation for the provided list of variants
     * 
     * @param variants List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @return ApiResponse&lt;List&lt;VariantAnnotation&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<VariantAnnotation>> fetchVariantAnnotationPOSTWithHttpInfo(List<String> variants, String isoformOverrideSource, List<String> fields) throws ApiException {
        com.squareup.okhttp.Call call = fetchVariantAnnotationPOSTValidateBeforeCall(variants, isoformOverrideSource, fields, null, null);
        Type localVarReturnType = new TypeToken<List<VariantAnnotation>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves VEP annotation for the provided list of variants (asynchronously)
     * 
     * @param variants List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param fields Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor (optional, default to hotspots,mutation_assessor)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationPOSTAsync(List<String> variants, String isoformOverrideSource, List<String> fields, final ApiCallback<List<VariantAnnotation>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = fetchVariantAnnotationPOSTValidateBeforeCall(variants, isoformOverrideSource, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<VariantAnnotation>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
