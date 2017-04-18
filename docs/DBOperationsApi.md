# DBOperationsApi

All URIs are relative to *http://tr02.switchapi.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPost**](DBOperationsApi.md#addPost) | **POST** /Add | Add is used for adding a data object to the list created at Switch DB.
[**listPost**](DBOperationsApi.md#listPost) | **POST** /List | It&#39;s used for listing a data added before.
[**setDelete**](DBOperationsApi.md#setDelete) | **DELETE** /Set | It&#39;s used for deleting a data added before at Switch DB.
[**setPost**](DBOperationsApi.md#setPost) | **POST** /Set | It&#39;s used for updating a data object that is already added to Switch DB.


<a name="addPost"></a>
# **addPost**
> AddResponse addPost(aPIKey, accessToken, list, body)

Add is used for adding a data object to the list created at Switch DB.

You can choose the list that will be added tha data set to with List parameter that will be sent to Header. It&#39;s equal to INSERT query at the relational databases model. The data set that will be added to the database is transmited at request body. For versions upper than v1.2.1, if the data sent is an array, all items in the array are added one by one, so they are added as a whole. 

### Example
```java
// Import classes:
//import io.swagger.client.api.DBOperationsApi;

DBOperationsApi apiInstance = new DBOperationsApi();
String aPIKey = "aPIKey_example"; // String | Your Switch API Key.
String accessToken = "accessToken_example"; // String | Your Access Token.
String list = "list_example"; // String | Your data list name.
String body = "body_example"; // String | Your new value JSON.
try {
    AddResponse result = apiInstance.addPost(aPIKey, accessToken, list, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DBOperationsApi#addPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aPIKey** | **String**| Your Switch API Key. |
 **accessToken** | **String**| Your Access Token. |
 **list** | **String**| Your data list name. |
 **body** | **String**| Your new value JSON. |

### Return type

[**AddResponse**](AddResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPost"></a>
# **listPost**
> listPost(aPIKey, accessToken, list, body)

It&#39;s used for listing a data added before.

List parameter sent remarks the list that will be do listing work on at Header. It&#39;s equal to SELECT query at relational databases. 

### Example
```java
// Import classes:
//import io.swagger.client.api.DBOperationsApi;

DBOperationsApi apiInstance = new DBOperationsApi();
String aPIKey = "aPIKey_example"; // String | Your Switch API Key.
String accessToken = "accessToken_example"; // String | Your Access Token.
String list = "list_example"; // String | Your data list name.
Body body = new Body(); // Body | Your Switch DB Query.
try {
    apiInstance.listPost(aPIKey, accessToken, list, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DBOperationsApi#listPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aPIKey** | **String**| Your Switch API Key. |
 **accessToken** | **String**| Your Access Token. |
 **list** | **String**| Your data list name. |
 **body** | [**Body**](Body.md)| Your Switch DB Query. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setDelete"></a>
# **setDelete**
> SetResponse setDelete(aPIKey, accessToken, list, listItemId)

It&#39;s used for deleting a data added before at Switch DB.

List parameter sent remarks the list that will be deleted data from at Header and ListItemId parameter remarks the ID consisted by Switch DB for the data that will be deleted. It&#39;s equal to DELETE query at relational databases. 

### Example
```java
// Import classes:
//import io.swagger.client.api.DBOperationsApi;

DBOperationsApi apiInstance = new DBOperationsApi();
String aPIKey = "aPIKey_example"; // String | Your Switch API Key.
String accessToken = "accessToken_example"; // String | Your Access Token.
String list = "list_example"; // String | Your data list name.
String listItemId = "listItemId_example"; // String | Your list item id.
try {
    SetResponse result = apiInstance.setDelete(aPIKey, accessToken, list, listItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DBOperationsApi#setDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aPIKey** | **String**| Your Switch API Key. |
 **accessToken** | **String**| Your Access Token. |
 **list** | **String**| Your data list name. |
 **listItemId** | **String**| Your list item id. |

### Return type

[**SetResponse**](SetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setPost"></a>
# **setPost**
> SetResponse setPost(aPIKey, accessToken, list, listItemId, body)

It&#39;s used for updating a data object that is already added to Switch DB.

In order to UPDATE a object, Listname and ListItemId parameters should be sent in the Header of the REQUEST as \&quot;List\&quot;, \&quot;ListItemId\&quot;, respectively, as shown in the example below. It&#39;s equal to UPDATE query at relational databases. The data set that will be edited is transmited to the database at request body. 

### Example
```java
// Import classes:
//import io.swagger.client.api.DBOperationsApi;

DBOperationsApi apiInstance = new DBOperationsApi();
String aPIKey = "aPIKey_example"; // String | Your Switch API Key.
String accessToken = "accessToken_example"; // String | Your Access Token.
String list = "list_example"; // String | Your data list name.
String listItemId = "listItemId_example"; // String | Your list item id.
String body = "body_example"; // String | Your new value JSON.
try {
    SetResponse result = apiInstance.setPost(aPIKey, accessToken, list, listItemId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DBOperationsApi#setPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aPIKey** | **String**| Your Switch API Key. |
 **accessToken** | **String**| Your Access Token. |
 **list** | **String**| Your data list name. |
 **listItemId** | **String**| Your list item id. |
 **body** | **String**| Your new value JSON. |

### Return type

[**SetResponse**](SetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

