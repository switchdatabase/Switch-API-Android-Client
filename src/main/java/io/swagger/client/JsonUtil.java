/**
 * Switch Database REST API
 * Switch API is the primary endpoint of data sevices and Switch DB's platform. You can do adding, editing, deleting or listing data works to your database with query operations by using this low-level API based on HTTP.
 *
 * OpenAPI spec version: 1.2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AddResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddResponse>>(){}.getType();
    }
    
    if ("Body".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body>>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<List<Error>>(){}.getType();
    }
    
    if ("ListOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListOrder>>(){}.getType();
    }
    
    if ("SetResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SetResponse>>(){}.getType();
    }
    
    if ("WhereItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<WhereItem>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AddResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AddResponse>(){}.getType();
    }
    
    if ("Body".equalsIgnoreCase(className)) {
      return new TypeToken<Body>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<Error>(){}.getType();
    }
    
    if ("ListOrder".equalsIgnoreCase(className)) {
      return new TypeToken<ListOrder>(){}.getType();
    }
    
    if ("SetResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SetResponse>(){}.getType();
    }
    
    if ("WhereItem".equalsIgnoreCase(className)) {
      return new TypeToken<WhereItem>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
