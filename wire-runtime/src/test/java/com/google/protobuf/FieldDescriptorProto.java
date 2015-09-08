// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 99:1
package com.google.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * Describes a field within a message.
 */
public final class FieldDescriptorProto extends Message<FieldDescriptorProto> {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_DOC = "";

  public static final Integer DEFAULT_NUMBER = 0;

  public static final Label DEFAULT_LABEL = Label.LABEL_OPTIONAL;

  public static final Type DEFAULT_TYPE = Type.TYPE_DOUBLE;

  public static final String DEFAULT_TYPE_NAME = "";

  public static final String DEFAULT_EXTENDEE = "";

  public static final String DEFAULT_DEFAULT_VALUE = "";

  @ProtoField(
      tag = 1,
      type = "string"
  )
  public final String name;

  /**
   * Doc string for generated code.
   */
  @ProtoField(
      tag = 9,
      type = "string"
  )
  public final String doc;

  @ProtoField(
      tag = 3,
      type = "int32"
  )
  public final Integer number;

  @ProtoField(
      tag = 4,
      type = "google.protobuf.FieldDescriptorProto.Label"
  )
  public final Label label;

  /**
   * If type_name is set, this need not be set.  If both this and type_name
   * are set, this must be either TYPE_ENUM or TYPE_MESSAGE.
   */
  @ProtoField(
      tag = 5,
      type = "google.protobuf.FieldDescriptorProto.Type"
  )
  public final Type type;

  /**
   * For message and enum types, this is the name of the type.  If the name
   * starts with a '.', it is fully-qualified.  Otherwise, C++-like scoping
   * rules are used to find the type (i.e. first the nested types within this
   * message are searched, then within the parent, on up to the root
   * namespace).
   */
  @ProtoField(
      tag = 6,
      type = "string"
  )
  public final String type_name;

  /**
   * For extensions, this is the name of the type being extended.  It is
   * resolved in the same manner as type_name.
   */
  @ProtoField(
      tag = 2,
      type = "string"
  )
  public final String extendee;

  /**
   * For numeric types, contains the original text representation of the value.
   * For booleans, "true" or "false".
   * For strings, contains the default text contents (not escaped in any way).
   * For bytes, contains the C escaped value.  All bytes >= 128 are escaped.
   * TODO(kenton):  Base-64 encode?
   */
  @ProtoField(
      tag = 7,
      type = "string"
  )
  public final String default_value;

  @ProtoField(
      tag = 8,
      type = "google.protobuf.FieldOptions"
  )
  public final FieldOptions options;

  public FieldDescriptorProto(String name, String doc, Integer number, Label label, Type type, String type_name, String extendee, String default_value, FieldOptions options) {
    this.name = name;
    this.doc = doc;
    this.number = number;
    this.label = label;
    this.type = type;
    this.type_name = type_name;
    this.extendee = extendee;
    this.default_value = default_value;
    this.options = options;
  }

  private FieldDescriptorProto(Builder builder) {
    this(builder.name, builder.doc, builder.number, builder.label, builder.type, builder.type_name, builder.extendee, builder.default_value, builder.options);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FieldDescriptorProto)) return false;
    FieldDescriptorProto o = (FieldDescriptorProto) other;
    return equals(name, o.name)
        && equals(doc, o.doc)
        && equals(number, o.number)
        && equals(label, o.label)
        && equals(type, o.type)
        && equals(type_name, o.type_name)
        && equals(extendee, o.extendee)
        && equals(default_value, o.default_value)
        && equals(options, o.options);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = name != null ? name.hashCode() : 0;
      result = result * 37 + (doc != null ? doc.hashCode() : 0);
      result = result * 37 + (number != null ? number.hashCode() : 0);
      result = result * 37 + (label != null ? label.hashCode() : 0);
      result = result * 37 + (type != null ? type.hashCode() : 0);
      result = result * 37 + (type_name != null ? type_name.hashCode() : 0);
      result = result * 37 + (extendee != null ? extendee.hashCode() : 0);
      result = result * 37 + (default_value != null ? default_value.hashCode() : 0);
      result = result * 37 + (options != null ? options.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<FieldDescriptorProto, Builder> {
    public String name;

    public String doc;

    public Integer number;

    public Label label;

    public Type type;

    public String type_name;

    public String extendee;

    public String default_value;

    public FieldOptions options;

    public Builder() {
    }

    public Builder(FieldDescriptorProto message) {
      super(message);
      if (message == null) return;
      this.name = message.name;
      this.doc = message.doc;
      this.number = message.number;
      this.label = message.label;
      this.type = message.type;
      this.type_name = message.type_name;
      this.extendee = message.extendee;
      this.default_value = message.default_value;
      this.options = message.options;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Doc string for generated code.
     */
    public Builder doc(String doc) {
      this.doc = doc;
      return this;
    }

    public Builder number(Integer number) {
      this.number = number;
      return this;
    }

    public Builder label(Label label) {
      this.label = label;
      return this;
    }

    /**
     * If type_name is set, this need not be set.  If both this and type_name
     * are set, this must be either TYPE_ENUM or TYPE_MESSAGE.
     */
    public Builder type(Type type) {
      this.type = type;
      return this;
    }

    /**
     * For message and enum types, this is the name of the type.  If the name
     * starts with a '.', it is fully-qualified.  Otherwise, C++-like scoping
     * rules are used to find the type (i.e. first the nested types within this
     * message are searched, then within the parent, on up to the root
     * namespace).
     */
    public Builder type_name(String type_name) {
      this.type_name = type_name;
      return this;
    }

    /**
     * For extensions, this is the name of the type being extended.  It is
     * resolved in the same manner as type_name.
     */
    public Builder extendee(String extendee) {
      this.extendee = extendee;
      return this;
    }

    /**
     * For numeric types, contains the original text representation of the value.
     * For booleans, "true" or "false".
     * For strings, contains the default text contents (not escaped in any way).
     * For bytes, contains the C escaped value.  All bytes >= 128 are escaped.
     * TODO(kenton):  Base-64 encode?
     */
    public Builder default_value(String default_value) {
      this.default_value = default_value;
      return this;
    }

    public Builder options(FieldOptions options) {
      this.options = options;
      return this;
    }

    @Override
    public FieldDescriptorProto build() {
      return new FieldDescriptorProto(this);
    }
  }

  public enum Type implements ProtoEnum {
    /**
     * 0 is reserved for errors.
     * Order is weird for historical reasons.
     */
    TYPE_DOUBLE(1),

    TYPE_FLOAT(2),

    /**
     * Not ZigZag encoded.  Negative numbers
     */
    TYPE_INT64(3),

    /**
     * take 10 bytes.  Use TYPE_SINT64 if negative
     * values are likely.
     */
    TYPE_UINT64(4),

    /**
     * Not ZigZag encoded.  Negative numbers
     */
    TYPE_INT32(5),

    /**
     * take 10 bytes.  Use TYPE_SINT32 if negative
     * values are likely.
     */
    TYPE_FIXED64(6),

    TYPE_FIXED32(7),

    TYPE_BOOL(8),

    TYPE_STRING(9),

    /**
     * Tag-delimited aggregate.
     */
    TYPE_GROUP(10),

    /**
     * Length-delimited aggregate.
     */
    TYPE_MESSAGE(11),

    /**
     * New in version 2.
     */
    TYPE_BYTES(12),

    TYPE_UINT32(13),

    TYPE_ENUM(14),

    TYPE_SFIXED32(15),

    TYPE_SFIXED64(16),

    /**
     * Uses ZigZag encoding.
     */
    TYPE_SINT32(17),

    /**
     * Uses ZigZag encoding.
     */
    TYPE_SINT64(18);

    private final int value;

    Type(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  public enum Label implements ProtoEnum {
    /**
     * 0 is reserved for errors
     */
    LABEL_OPTIONAL(1),

    LABEL_REQUIRED(2),

    LABEL_REPEATED(3);

    private final int value;

    Label(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
