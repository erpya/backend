// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

public interface ListActivitiesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListActivitiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 recordCount = 1;</code>
   */
  long getRecordCount();

  /**
   * <code>repeated .data.BusinessProcess responses = 2;</code>
   */
  java.util.List<org.spin.grpc.util.BusinessProcess> 
      getResponsesList();
  /**
   * <code>repeated .data.BusinessProcess responses = 2;</code>
   */
  org.spin.grpc.util.BusinessProcess getResponses(int index);
  /**
   * <code>repeated .data.BusinessProcess responses = 2;</code>
   */
  int getResponsesCount();
  /**
   * <code>repeated .data.BusinessProcess responses = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.BusinessProcessOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <code>repeated .data.BusinessProcess responses = 2;</code>
   */
  org.spin.grpc.util.BusinessProcessOrBuilder getResponsesOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 3;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
