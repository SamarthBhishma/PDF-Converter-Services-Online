/*
 * Muhimbi PDF
 * Convert, Merge, Watermark, Secure and OCR files.
 *
 * OpenAPI spec version: 9.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.muhimbi.online.client.api;

import com.muhimbi.online.client.ApiCallback;
import com.muhimbi.online.client.ApiClient;
import com.muhimbi.online.client.ApiException;
import com.muhimbi.online.client.ApiResponse;
import com.muhimbi.online.client.Configuration;
import com.muhimbi.online.client.Pair;
import com.muhimbi.online.client.ProgressRequestBody;
import com.muhimbi.online.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.muhimbi.online.client.model.MergeToPdfData;
import com.muhimbi.online.client.model.OperationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeApi {
    private ApiClient apiClient;

    public MergeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MergeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for mergeToPdf */
    private com.squareup.okhttp.Call mergeToPdfCall(MergeToPdfData inputData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = inputData;
        
        // create path and map variables
        String localVarPath = "/v1/operations/merge_to_pdf".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "oauth2_auth", "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call mergeToPdfValidateBeforeCall(MergeToPdfData inputData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'inputData' is set
        if (inputData == null) {
            throw new ApiException("Missing the required parameter 'inputData' when calling mergeToPdf(Async)");
        }
        
        
        com.squareup.okhttp.Call call = mergeToPdfCall(inputData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Merge documents
     * Merge multiple files into a single PDF.
     * @param inputData  (required)
     * @return OperationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OperationResponse mergeToPdf(MergeToPdfData inputData) throws ApiException {
        ApiResponse<OperationResponse> resp = mergeToPdfWithHttpInfo(inputData);
        return resp.getData();
    }

    /**
     * Merge documents
     * Merge multiple files into a single PDF.
     * @param inputData  (required)
     * @return ApiResponse&lt;OperationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OperationResponse> mergeToPdfWithHttpInfo(MergeToPdfData inputData) throws ApiException {
        com.squareup.okhttp.Call call = mergeToPdfValidateBeforeCall(inputData, null, null);
        Type localVarReturnType = new TypeToken<OperationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Merge documents (asynchronously)
     * Merge multiple files into a single PDF.
     * @param inputData  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call mergeToPdfAsync(MergeToPdfData inputData, final ApiCallback<OperationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = mergeToPdfValidateBeforeCall(inputData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OperationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
