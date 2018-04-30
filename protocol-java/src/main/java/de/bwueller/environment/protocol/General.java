// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: general.proto

package de.bwueller.environment.protocol;

public final class General {
  private General() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UUIDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UUID)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes value = 1;</code>
     */
    com.google.protobuf.ByteString getValue();
  }
  /**
   * Protobuf type {@code UUID}
   */
  public  static final class UUID extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UUID)
      UUIDOrBuilder {
    // Use UUID.newBuilder() to construct.
    private UUID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UUID() {
      value_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private UUID(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {

              value_ = input.readBytes();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.bwueller.environment.protocol.General.internal_static_UUID_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.bwueller.environment.protocol.General.internal_static_UUID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.bwueller.environment.protocol.General.UUID.class, de.bwueller.environment.protocol.General.UUID.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString value_;
    /**
     * <code>optional bytes value = 1;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
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
      if (!value_.isEmpty()) {
        output.writeBytes(1, value_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!value_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, value_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof de.bwueller.environment.protocol.General.UUID)) {
        return super.equals(obj);
      }
      de.bwueller.environment.protocol.General.UUID other = (de.bwueller.environment.protocol.General.UUID) obj;

      boolean result = true;
      result = result && getValue()
          .equals(other.getValue());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static de.bwueller.environment.protocol.General.UUID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.bwueller.environment.protocol.General.UUID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.bwueller.environment.protocol.General.UUID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.bwueller.environment.protocol.General.UUID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.bwueller.environment.protocol.General.UUID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.bwueller.environment.protocol.General.UUID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.bwueller.environment.protocol.General.UUID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static de.bwueller.environment.protocol.General.UUID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.bwueller.environment.protocol.General.UUID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.bwueller.environment.protocol.General.UUID parseFrom(
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
    public static Builder newBuilder(de.bwueller.environment.protocol.General.UUID prototype) {
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
     * Protobuf type {@code UUID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UUID)
        de.bwueller.environment.protocol.General.UUIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return de.bwueller.environment.protocol.General.internal_static_UUID_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return de.bwueller.environment.protocol.General.internal_static_UUID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                de.bwueller.environment.protocol.General.UUID.class, de.bwueller.environment.protocol.General.UUID.Builder.class);
      }

      // Construct using de.bwueller.environment.protocol.General.UUID.newBuilder()
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
        }
      }
      public Builder clear() {
        super.clear();
        value_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return de.bwueller.environment.protocol.General.internal_static_UUID_descriptor;
      }

      public de.bwueller.environment.protocol.General.UUID getDefaultInstanceForType() {
        return de.bwueller.environment.protocol.General.UUID.getDefaultInstance();
      }

      public de.bwueller.environment.protocol.General.UUID build() {
        de.bwueller.environment.protocol.General.UUID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public de.bwueller.environment.protocol.General.UUID buildPartial() {
        de.bwueller.environment.protocol.General.UUID result = new de.bwueller.environment.protocol.General.UUID(this);
        result.value_ = value_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof de.bwueller.environment.protocol.General.UUID) {
          return mergeFrom((de.bwueller.environment.protocol.General.UUID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(de.bwueller.environment.protocol.General.UUID other) {
        if (other == de.bwueller.environment.protocol.General.UUID.getDefaultInstance()) return this;
        if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
          setValue(other.getValue());
        }
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
        de.bwueller.environment.protocol.General.UUID parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (de.bwueller.environment.protocol.General.UUID) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes value = 1;</code>
       */
      public com.google.protobuf.ByteString getValue() {
        return value_;
      }
      /**
       * <code>optional bytes value = 1;</code>
       */
      public Builder setValue(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes value = 1;</code>
       */
      public Builder clearValue() {
        
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:UUID)
    }

    // @@protoc_insertion_point(class_scope:UUID)
    private static final de.bwueller.environment.protocol.General.UUID DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new de.bwueller.environment.protocol.General.UUID();
    }

    public static de.bwueller.environment.protocol.General.UUID getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UUID>
        PARSER = new com.google.protobuf.AbstractParser<UUID>() {
      public UUID parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new UUID(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UUID> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UUID> getParserForType() {
      return PARSER;
    }

    public de.bwueller.environment.protocol.General.UUID getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UUID_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UUID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rgeneral.proto\"\025\n\004UUID\022\r\n\005value\030\001 \001(\014B\"" +
      "\n de.bwueller.environment.protocolb\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_UUID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UUID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UUID_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
