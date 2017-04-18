# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AuthorizationApi;

public class AuthorizationApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://tr02.switchapi.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorizationApi* | [**tokenGet**](docs/AuthorizationApi.md#tokenGet) | **GET** /Token | Generate Access Token
*DBOperationsApi* | [**addPost**](docs/DBOperationsApi.md#addPost) | **POST** /Add | Add is used for adding a data object to the list created at Switch DB.
*DBOperationsApi* | [**listPost**](docs/DBOperationsApi.md#listPost) | **POST** /List | It&#39;s used for listing a data added before.
*DBOperationsApi* | [**setDelete**](docs/DBOperationsApi.md#setDelete) | **DELETE** /Set | It&#39;s used for deleting a data added before at Switch DB.
*DBOperationsApi* | [**setPost**](docs/DBOperationsApi.md#setPost) | **POST** /Set | It&#39;s used for updating a data object that is already added to Switch DB.


## Documentation for Models

 - [AddResponse](docs/AddResponse.md)
 - [Body](docs/Body.md)
 - [Error](docs/Error.md)
 - [ListOrder](docs/ListOrder.md)
 - [SetResponse](docs/SetResponse.md)
 - [WhereItem](docs/WhereItem.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



