package com.mycompany.app;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Val}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVal.builder()}.
 */
@Generated(from = "Val", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
final class ImmutableVal implements Val {
  private final int a;
  private final String b;

  private ImmutableVal(int a, String b) {
    this.a = a;
    this.b = b;
  }

  /**
   * @return The value of the {@code a} attribute
   */
  @JsonProperty("a")
  @Override
  public int a() {
    return a;
  }

  /**
   * @return The value of the {@code b} attribute
   */
  @JsonProperty("b")
  @Override
  public String b() {
    return b;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Val#a() a} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for a
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVal withA(int value) {
    if (this.a == value) return this;
    return new ImmutableVal(value, this.b);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Val#b() b} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for b
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVal withB(String value) {
    String newValue = Objects.requireNonNull(value, "b");
    if (this.b.equals(newValue)) return this;
    return new ImmutableVal(this.a, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVal} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVal
        && equalTo((ImmutableVal) another);
  }

  private boolean equalTo(ImmutableVal another) {
    return a == another.a
        && b.equals(another.b);
  }

  /**
   * Computes a hash code from attributes: {@code a}, {@code b}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + a;
    h += (h << 5) + b.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Val} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Val{"
        + "a=" + a
        + ", b=" + b
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Val", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Val {
    int a;
    boolean aIsSet;
    String b;
    @JsonProperty("a")
    public void setA(int a) {
      this.a = a;
      this.aIsSet = true;
    }
    @JsonProperty("b")
    public void setB(String b) {
      this.b = b;
    }
    @Override
    public int a() { throw new UnsupportedOperationException(); }
    @Override
    public String b() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableVal fromJson(Json json) {
    ImmutableVal.Builder builder = ImmutableVal.builder();
    if (json.aIsSet) {
      builder.a(json.a);
    }
    if (json.b != null) {
      builder.b(json.b);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Val} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Val instance
   */
  public static ImmutableVal copyOf(Val instance) {
    if (instance instanceof ImmutableVal) {
      return (ImmutableVal) instance;
    }
    return ImmutableVal.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableVal ImmutableVal}.
   * <pre>
   * ImmutableVal.builder()
   *    .a(int) // required {@link Val#a() a}
   *    .b(String) // required {@link Val#b() b}
   *    .build();
   * </pre>
   * @return A new ImmutableVal builder
   */
  public static ImmutableVal.Builder builder() {
    return new ImmutableVal.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableVal ImmutableVal}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Val", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_A = 0x1L;
    private static final long INIT_BIT_B = 0x2L;
    private long initBits = 0x3L;

    private int a;
    private String b;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Val} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Val instance) {
      Objects.requireNonNull(instance, "instance");
      a(instance.a());
      b(instance.b());
      return this;
    }

    /**
     * Initializes the value for the {@link Val#a() a} attribute.
     * @param a The value for a 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("a")
    public final Builder a(int a) {
      this.a = a;
      initBits &= ~INIT_BIT_A;
      return this;
    }

    /**
     * Initializes the value for the {@link Val#b() b} attribute.
     * @param b The value for b 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("b")
    public final Builder b(String b) {
      this.b = Objects.requireNonNull(b, "b");
      initBits &= ~INIT_BIT_B;
      return this;
    }

    /**
     * Builds a new {@link ImmutableVal ImmutableVal}.
     * @return An immutable instance of Val
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableVal build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableVal(a, b);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_A) != 0) attributes.add("a");
      if ((initBits & INIT_BIT_B) != 0) attributes.add("b");
      return "Cannot build Val, some of required attributes are not set " + attributes;
    }
  }
}
