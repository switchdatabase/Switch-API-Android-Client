# AuthorizationApi

All URIs are relative to *http://tr02.switchapi.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenGet**](AuthorizationApi.md#tokenGet) | **GET** /Token | Generate Access Token


<a name="tokenGet"></a>
# **tokenGet**
> String tokenGet(aPIKey, signature, expire)

Generate Access Token

For generating Access Token, you need API Key and API Secret parameters that are provided from the developer portal. At the request, API Key that will be sent by using header is generated as portal API Key and Signature parameter is generated as md5(APISecret + ExpireTimestamp) format. At Expire parameter, token&#39;s expire date and time information must be proper to ISO 8601 standarts and Unix Time format with msec information. 

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthorizationApi;

AuthorizationApi apiInstance = new AuthorizationApi();
String aPIKey = "aPIKey_example"; // String | Your Switch API Key.
String signature = "signature_example"; // String | Signature parameter is generated as md5(APISecret + ExpireTimestamp) format.
Long expire = 789L; // Long | Expire parameter, token's expire date and time information must be proper to ISO 8601 standarts and Unix Time format with msec information.
try {
    String result = apiInstance.tokenGet(aPIKey, signature, expire);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#tokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aPIKey** | **String**| Your Switch API Key. |
 **signature** | **String**| Signature parameter is generated as md5(APISecret + ExpireTimestamp) format. |
 **expire** | **Long**| Expire parameter, token&#39;s expire date and time information must be proper to ISO 8601 standarts and Unix Time format with msec information. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

