// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Process Response List
 * </pre>
 *
 * Protobuf type {@code data.ProcessResponseList}
 */
public  final class ProcessResponseList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ProcessResponseList)
    ProcessResponseListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProcessResponseList.newBuilder() to construct.
  private ProcessResponseList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProcessResponseList() {
    recordCount_ = 0L;
    responses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProcessResponseList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            recordCount_ = input.readInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              responses_ = new java.util.ArrayList<org.spin.grpc.util.ProcessResponse>();
              mutable_bitField0_ |= 0x00000002;
            }
            responses_.add(
                input.readMessage(org.spin.grpc.util.ProcessResponse.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        responses_ = java.util.Collections.unmodifiableList(responses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ProcessResponseList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ProcessResponseList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ProcessResponseList.class, org.spin.grpc.util.ProcessResponseList.Builder.class);
  }

  private int bitField0_;
  public static final int RECORDCOUNT_FIELD_NUMBER = 1;
  private long recordCount_;
  /**
   * <code>int64 recordCount = 1;</code>
   */
  public long getRecordCount() {
    return recordCount_;
  }

  public static final int RESPONSES_FIELD_NUMBER = 2;
  private java.util.List<org.spin.grpc.util.ProcessResponse> responses_;
  /**
   * <code>repeated .data.ProcessResponse responses = 2;</code>
   */
  public java.util.List<org.spin.grpc.util.ProcessResponse> getResponsesList() {
    return responses_;
  }
  /**
   * <code>repeated .data.ProcessResponse responses = 2;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.ProcessResponseOrBuilder> 
      getResponsesOrBuilderList() {
    return responses_;
  }
  /**
   * <code>repeated .data.ProcessResponse responses = 2;</code>
   */
  public int getResponsesCount() {
    return responses_.size();
  }
  /**
   * <code>repeated .data.ProcessResponse responses = 2;</code>
   */
  public org.spin.grpc.util.ProcessResponse getResponses(int index) {
    return responses_.get(index);
  }
  /**
   * <code>repeated .data.ProcessResponse responses = 2;</code>
   */
  public org.spin.grpc.util.ProcessResponseOrBuilder getResponsesOrBuilder(
      int index) {
    return responses_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (recordCount_ != 0L) {
      output.writeInt64(1, recordCount_);
    }
    for (int i = 0; i < responses_.size(); i++) {
      output.writeMessage(2, responses_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recordCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, recordCount_);
    }
    for (int i = 0; i < responses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, responses_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.spin.grpc.util.ProcessResponseList)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ProcessResponseList other = (org.spin.grpc.util.ProcessResponseList) obj;

    boolean result = true;
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getResponsesList()
        .equals(other.getResponsesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RECORDCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRecordCount());
    if (getResponsesCount() > 0) {
      hash = (37 * hash) + RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getResponsesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ProcessResponseList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ProcessResponseList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ProcessResponseList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ProcessResponseList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ProcessResponseList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ProcessResponseList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ProcessResponseList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ProcessResponseList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ProcessResponseList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ProcessResponseList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ProcessResponseList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ProcessResponseList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.spin.grpc.util.ProcessResponseList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Process Response List
   * </pre>
   *
   * Protobuf type {@code data.ProcessResponseList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ProcessResponseList)
      org.spin.grpc.util.ProcessResponseListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ProcessResponseList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ProcessResponseList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ProcessResponseList.class, org.spin.grpc.util.ProcessResponseList.Builder.class);
    }

    // Construct using org.spin.grpc.util.ProcessResponseList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getResponsesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recordCount_ = 0L;

      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ProcessResponseList_descriptor;
    }

    public org.spin.grpc.util.ProcessResponseList getDefaultInstanceForType() {
      return org.spin.grpc.util.ProcessResponseList.getDefaultInstance();
    }

    public org.spin.grpc.util.ProcessResponseList build() {
      org.spin.grpc.util.ProcessResponseList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ProcessResponseList buildPartial() {
      org.spin.grpc.util.ProcessResponseList result = new org.spin.grpc.util.ProcessResponseList(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.recordCount_ = recordCount_;
      if (responsesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          responses_ = java.util.Collections.unmodifiableList(responses_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.responses_ = responses_;
      } else {
        result.responses_ = responsesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.spin.grpc.util.ProcessResponseList) {
        return mergeFrom((org.spin.grpc.util.ProcessResponseList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ProcessResponseList other) {
      if (other == org.spin.grpc.util.ProcessResponseList.getDefaultInstance()) return this;
      if (other.getRecordCount() != 0L) {
        setRecordCount(other.getRecordCount());
      }
      if (responsesBuilder_ == null) {
        if (!other.responses_.isEmpty()) {
          if (responses_.isEmpty()) {
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureResponsesIsMutable();
            responses_.addAll(other.responses_);
          }
          onChanged();
        }
      } else {
        if (!other.responses_.isEmpty()) {
          if (responsesBuilder_.isEmpty()) {
            responsesBuilder_.dispose();
            responsesBuilder_ = null;
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000002);
            responsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResponsesFieldBuilder() : null;
          } else {
            responsesBuilder_.addAllMessages(other.responses_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.spin.grpc.util.ProcessResponseList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ProcessResponseList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long recordCount_ ;
    /**
     * <code>int64 recordCount = 1;</code>
     */
    public long getRecordCount() {
      return recordCount_;
    }
    /**
     * <code>int64 recordCount = 1;</code>
     */
    public Builder setRecordCount(long value) {
      
      recordCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 recordCount = 1;</code>
     */
    public Builder clearRecordCount() {
      
      recordCount_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<org.spin.grpc.util.ProcessResponse> responses_ =
      java.util.Collections.emptyList();
    private void ensureResponsesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        responses_ = new java.util.ArrayList<org.spin.grpc.util.ProcessResponse>(responses_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.ProcessResponse, org.spin.grpc.util.ProcessResponse.Builder, org.spin.grpc.util.ProcessResponseOrBuilder> responsesBuilder_;

    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.ProcessResponse> getResponsesList() {
      if (responsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(responses_);
      } else {
        return responsesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public int getResponsesCount() {
      if (responsesBuilder_ == null) {
        return responses_.size();
      } else {
        return responsesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public org.spin.grpc.util.ProcessResponse getResponses(int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);
      } else {
        return responsesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public Builder setResponses(
        int index, org.spin.grpc.util.ProcessResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.set(index, value);
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public Builder setResponses(
        int index, org.spin.grpc.util.ProcessResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.set(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public Builder addResponses(org.spin.grpc.util.ProcessResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public Builder addResponses(
        int index, org.spin.grpc.util.ProcessResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(index, value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public Builder addResponses(
        org.spin.grpc.util.ProcessResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public Builder addResponses(
        int index, org.spin.grpc.util.ProcessResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public Builder addAllResponses(
        java.lang.Iterable<? extends org.spin.grpc.util.ProcessResponse> values) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, responses_);
        onChanged();
      } else {
        responsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public Builder clearResponses() {
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public Builder removeResponses(int index) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.remove(index);
        onChanged();
      } else {
        responsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public org.spin.grpc.util.ProcessResponse.Builder getResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public org.spin.grpc.util.ProcessResponseOrBuilder getResponsesOrBuilder(
        int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);  } else {
        return responsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.ProcessResponseOrBuilder> 
         getResponsesOrBuilderList() {
      if (responsesBuilder_ != null) {
        return responsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(responses_);
      }
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public org.spin.grpc.util.ProcessResponse.Builder addResponsesBuilder() {
      return getResponsesFieldBuilder().addBuilder(
          org.spin.grpc.util.ProcessResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public org.spin.grpc.util.ProcessResponse.Builder addResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().addBuilder(
          index, org.spin.grpc.util.ProcessResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .data.ProcessResponse responses = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.ProcessResponse.Builder> 
         getResponsesBuilderList() {
      return getResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.ProcessResponse, org.spin.grpc.util.ProcessResponse.Builder, org.spin.grpc.util.ProcessResponseOrBuilder> 
        getResponsesFieldBuilder() {
      if (responsesBuilder_ == null) {
        responsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.ProcessResponse, org.spin.grpc.util.ProcessResponse.Builder, org.spin.grpc.util.ProcessResponseOrBuilder>(
                responses_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        responses_ = null;
      }
      return responsesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:data.ProcessResponseList)
  }

  // @@protoc_insertion_point(class_scope:data.ProcessResponseList)
  private static final org.spin.grpc.util.ProcessResponseList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ProcessResponseList();
  }

  public static org.spin.grpc.util.ProcessResponseList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessResponseList>
      PARSER = new com.google.protobuf.AbstractParser<ProcessResponseList>() {
    public ProcessResponseList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProcessResponseList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProcessResponseList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessResponseList> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ProcessResponseList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

