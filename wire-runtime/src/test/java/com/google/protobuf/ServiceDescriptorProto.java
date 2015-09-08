// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 187:1
package com.google.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;

/**
 * Describes a service.
 */
public final class ServiceDescriptorProto extends Message<ServiceDescriptorProto> {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_DOC = "";

  @ProtoField(
      tag = 1,
      type = "string"
  )
  public final String name;

  @ProtoField(
      tag = 2,
      type = "google.protobuf.MethodDescriptorProto",
      label = Message.Label.REPEATED
  )
  public final List<MethodDescriptorProto> method;

  /**
   * Doc string for generated code.
   */
  @ProtoField(
      tag = 4,
      type = "string"
  )
  public final String doc;

  @ProtoField(
      tag = 3,
      type = "google.protobuf.ServiceOptions"
  )
  public final ServiceOptions options;

  public ServiceDescriptorProto(String name, List<MethodDescriptorProto> method, String doc, ServiceOptions options) {
    this.name = name;
    this.method = immutableCopyOf(method);
    this.doc = doc;
    this.options = options;
  }

  private ServiceDescriptorProto(Builder builder) {
    this(builder.name, builder.method, builder.doc, builder.options);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ServiceDescriptorProto)) return false;
    ServiceDescriptorProto o = (ServiceDescriptorProto) other;
    return equals(name, o.name)
        && equals(method, o.method)
        && equals(doc, o.doc)
        && equals(options, o.options);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = name != null ? name.hashCode() : 0;
      result = result * 37 + (method != null ? method.hashCode() : 1);
      result = result * 37 + (doc != null ? doc.hashCode() : 0);
      result = result * 37 + (options != null ? options.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<ServiceDescriptorProto, Builder> {
    public String name;

    public List<MethodDescriptorProto> method = Collections.emptyList();

    public String doc;

    public ServiceOptions options;

    public Builder() {
    }

    public Builder(ServiceDescriptorProto message) {
      super(message);
      if (message == null) return;
      this.name = message.name;
      this.method = copyOf(message.method);
      this.doc = message.doc;
      this.options = message.options;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder method(List<MethodDescriptorProto> method) {
      this.method = canonicalizeList(method);
      return this;
    }

    /**
     * Doc string for generated code.
     */
    public Builder doc(String doc) {
      this.doc = doc;
      return this;
    }

    public Builder options(ServiceOptions options) {
      this.options = options;
      return this;
    }

    @Override
    public ServiceDescriptorProto build() {
      return new ServiceDescriptorProto(this);
    }
  }
}
