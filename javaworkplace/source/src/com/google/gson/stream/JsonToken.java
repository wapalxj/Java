/*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.stream;

/**
 * A structure, name or value type in a JSON-encoded string.
 *
 * @author Jesse Wilson
 * @since 1.6
 */
public enum JsonToken {

  /**
   * The opening of a JSON array. Written using {@link JsonWriter#beginArray}
   * and read using {@link JsonReader#beginArray}.
   */
  BEGIN_ARRAY,//JSON array开始

  /**
   * The closing of a JSON array. Written using {@link JsonWriter#endArray}
   * and read using {@link JsonReader#endArray}.
   */
  END_ARRAY,//JSON array结束

  /**
   * The opening of a JSON object. Written using {@link JsonWriter#beginObject}
   * and read using {@link JsonReader#beginObject}.
   */
  BEGIN_OBJECT,//JSON object开始

  /**
   * The closing of a JSON object. Written using {@link JsonWriter#endObject}
   * and read using {@link JsonReader#endObject}.
   */
  END_OBJECT,//JSON object结束

  /**
   * A JSON property name. Within objects, tokens alternate between names and
   * their values. Written using {@link JsonWriter#name} and read using {@link
   * JsonReader#nextName}
   */
  NAME,//JSON 属性名,JsonReader#nextName/JsonWriter#name

  /**
   * A JSON string.
   */
  STRING,//JSON 字符串

  /**
   * A JSON number represented in this API by a Java {@code double}, {@code
   * long}, or {@code int}.
   */
  NUMBER,//JSON 数字，代表java中double,long,int

  /**
   * A JSON {@code true} or {@code false}.
   */
  BOOLEAN,//JSON 布尔值

  /**
   * A JSON {@code null}.
   */
  NULL,//表示 null

  /**
   * The end of the JSON stream. This sentinel value is returned by {@link
   * JsonReader#peek()} to signal that the JSON-encoded value has no more
   * tokens.
   */
  END_DOCUMENT//表示JSON流的结尾
}
