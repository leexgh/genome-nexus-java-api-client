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


import org.genome_nexus.client.PostTranslationalModification;
import org.genome_nexus.client.PtmFilter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PtmControllerApi {
    private ApiClient apiClient;

    public PtmControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PtmControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for fetchPostTranslationalModificationsByPtmFilterPOST
     * @param ptmFilter List of Ensembl transcript IDs. For example [\&quot;ENST00000420316\&quot;, \&quot;ENST00000646891\&quot;, \&quot;ENST00000371953\&quot;] (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchPostTranslationalModificationsByPtmFilterPOSTCall(PtmFilter ptmFilter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = ptmFilter;

        // create path and map variables
        String localVarPath = "/ptm/experimental";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call fetchPostTranslationalModificationsByPtmFilterPOSTValidateBeforeCall(PtmFilter ptmFilter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ptmFilter' is set
        if (ptmFilter == null) {
            throw new ApiException("Missing the required parameter 'ptmFilter' when calling fetchPostTranslationalModificationsByPtmFilterPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchPostTranslationalModificationsByPtmFilterPOSTCall(ptmFilter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves PTM entries by Ensembl Transcript IDs
     * 
     * @param ptmFilter List of Ensembl transcript IDs. For example [\&quot;ENST00000420316\&quot;, \&quot;ENST00000646891\&quot;, \&quot;ENST00000371953\&quot;] (required)
     * @return List&lt;PostTranslationalModification&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PostTranslationalModification> fetchPostTranslationalModificationsByPtmFilterPOST(PtmFilter ptmFilter) throws ApiException {
        ApiResponse<List<PostTranslationalModification>> resp = fetchPostTranslationalModificationsByPtmFilterPOSTWithHttpInfo(ptmFilter);
        return resp.getData();
    }

    /**
     * Retrieves PTM entries by Ensembl Transcript IDs
     * 
     * @param ptmFilter List of Ensembl transcript IDs. For example [\&quot;ENST00000420316\&quot;, \&quot;ENST00000646891\&quot;, \&quot;ENST00000371953\&quot;] (required)
     * @return ApiResponse&lt;List&lt;PostTranslationalModification&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PostTranslationalModification>> fetchPostTranslationalModificationsByPtmFilterPOSTWithHttpInfo(PtmFilter ptmFilter) throws ApiException {
        com.squareup.okhttp.Call call = fetchPostTranslationalModificationsByPtmFilterPOSTValidateBeforeCall(ptmFilter, null, null);
        Type localVarReturnType = new TypeToken<List<PostTranslationalModification>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves PTM entries by Ensembl Transcript IDs (asynchronously)
     * 
     * @param ptmFilter List of Ensembl transcript IDs. For example [\&quot;ENST00000420316\&quot;, \&quot;ENST00000646891\&quot;, \&quot;ENST00000371953\&quot;] (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchPostTranslationalModificationsByPtmFilterPOSTAsync(PtmFilter ptmFilter, final ApiCallback<List<PostTranslationalModification>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchPostTranslationalModificationsByPtmFilterPOSTValidateBeforeCall(ptmFilter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PostTranslationalModification>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchPostTranslationalModificationsGET
     * @param ensemblTranscriptId Ensembl Transcript ID. For example ENST00000646891 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchPostTranslationalModificationsGETCall(String ensemblTranscriptId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/ptm/experimental";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ensemblTranscriptId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ensemblTranscriptId", ensemblTranscriptId));

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
    private com.squareup.okhttp.Call fetchPostTranslationalModificationsGETValidateBeforeCall(String ensemblTranscriptId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = fetchPostTranslationalModificationsGETCall(ensemblTranscriptId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves PTM entries by Ensembl Transcript ID
     * 
     * @param ensemblTranscriptId Ensembl Transcript ID. For example ENST00000646891 (optional)
     * @return List&lt;PostTranslationalModification&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PostTranslationalModification> fetchPostTranslationalModificationsGET(String ensemblTranscriptId) throws ApiException {
        ApiResponse<List<PostTranslationalModification>> resp = fetchPostTranslationalModificationsGETWithHttpInfo(ensemblTranscriptId);
        return resp.getData();
    }

    /**
     * Retrieves PTM entries by Ensembl Transcript ID
     * 
     * @param ensemblTranscriptId Ensembl Transcript ID. For example ENST00000646891 (optional)
     * @return ApiResponse&lt;List&lt;PostTranslationalModification&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PostTranslationalModification>> fetchPostTranslationalModificationsGETWithHttpInfo(String ensemblTranscriptId) throws ApiException {
        com.squareup.okhttp.Call call = fetchPostTranslationalModificationsGETValidateBeforeCall(ensemblTranscriptId, null, null);
        Type localVarReturnType = new TypeToken<List<PostTranslationalModification>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves PTM entries by Ensembl Transcript ID (asynchronously)
     * 
     * @param ensemblTranscriptId Ensembl Transcript ID. For example ENST00000646891 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchPostTranslationalModificationsGETAsync(String ensemblTranscriptId, final ApiCallback<List<PostTranslationalModification>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchPostTranslationalModificationsGETValidateBeforeCall(ensemblTranscriptId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PostTranslationalModification>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
