/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.vladkrava.converter.test.domain;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Dummy Object with multi leveled array structures */
@org.apache.avro.specific.AvroGenerated
public class DummyArrays extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7824338581610242484L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DummyArrays\",\"namespace\":\"com.vladkrava.converter.test.domain\",\"doc\":\"Dummy Object with multi leveled array structures\",\"fields\":[{\"name\":\"testArrayLevel1\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}}},{\"name\":\"testArrayMap\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":\"long\",\"avro.java.string\":\"String\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DummyArrays> ENCODER =
      new BinaryMessageEncoder<DummyArrays>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DummyArrays> DECODER =
      new BinaryMessageDecoder<DummyArrays>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<DummyArrays> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<DummyArrays> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DummyArrays>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this DummyArrays to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a DummyArrays from a ByteBuffer. */
  public static DummyArrays fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.List<java.util.List<java.util.List<java.lang.String>>> testArrayLevel1;
   private java.util.List<java.util.Map<java.lang.String,java.lang.Long>> testArrayMap;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DummyArrays() {}

  /**
   * All-args constructor.
   * @param testArrayLevel1 The new value for testArrayLevel1
   * @param testArrayMap The new value for testArrayMap
   */
  public DummyArrays(java.util.List<java.util.List<java.util.List<java.lang.String>>> testArrayLevel1, java.util.List<java.util.Map<java.lang.String,java.lang.Long>> testArrayMap) {
    this.testArrayLevel1 = testArrayLevel1;
    this.testArrayMap = testArrayMap;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return testArrayLevel1;
    case 1: return testArrayMap;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: testArrayLevel1 = (java.util.List<java.util.List<java.util.List<java.lang.String>>>)value$; break;
    case 1: testArrayMap = (java.util.List<java.util.Map<java.lang.String,java.lang.Long>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'testArrayLevel1' field.
   * @return The value of the 'testArrayLevel1' field.
   */
  public java.util.List<java.util.List<java.util.List<java.lang.String>>> getTestArrayLevel1() {
    return testArrayLevel1;
  }


  /**
   * Gets the value of the 'testArrayMap' field.
   * @return The value of the 'testArrayMap' field.
   */
  public java.util.List<java.util.Map<java.lang.String,java.lang.Long>> getTestArrayMap() {
    return testArrayMap;
  }


  /**
   * Creates a new DummyArrays RecordBuilder.
   * @return A new DummyArrays RecordBuilder
   */
  public static com.vladkrava.converter.test.domain.DummyArrays.Builder newBuilder() {
    return new com.vladkrava.converter.test.domain.DummyArrays.Builder();
  }

  /**
   * Creates a new DummyArrays RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DummyArrays RecordBuilder
   */
  public static com.vladkrava.converter.test.domain.DummyArrays.Builder newBuilder(com.vladkrava.converter.test.domain.DummyArrays.Builder other) {
    return new com.vladkrava.converter.test.domain.DummyArrays.Builder(other);
  }

  /**
   * Creates a new DummyArrays RecordBuilder by copying an existing DummyArrays instance.
   * @param other The existing instance to copy.
   * @return A new DummyArrays RecordBuilder
   */
  public static com.vladkrava.converter.test.domain.DummyArrays.Builder newBuilder(com.vladkrava.converter.test.domain.DummyArrays other) {
    return new com.vladkrava.converter.test.domain.DummyArrays.Builder(other);
  }

  /**
   * RecordBuilder for DummyArrays instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DummyArrays>
    implements org.apache.avro.data.RecordBuilder<DummyArrays> {

    private java.util.List<java.util.List<java.util.List<java.lang.String>>> testArrayLevel1;
    private java.util.List<java.util.Map<java.lang.String,java.lang.Long>> testArrayMap;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.vladkrava.converter.test.domain.DummyArrays.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.testArrayLevel1)) {
        this.testArrayLevel1 = data().deepCopy(fields()[0].schema(), other.testArrayLevel1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.testArrayMap)) {
        this.testArrayMap = data().deepCopy(fields()[1].schema(), other.testArrayMap);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DummyArrays instance
     * @param other The existing instance to copy.
     */
    private Builder(com.vladkrava.converter.test.domain.DummyArrays other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.testArrayLevel1)) {
        this.testArrayLevel1 = data().deepCopy(fields()[0].schema(), other.testArrayLevel1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.testArrayMap)) {
        this.testArrayMap = data().deepCopy(fields()[1].schema(), other.testArrayMap);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'testArrayLevel1' field.
      * @return The value.
      */
    public java.util.List<java.util.List<java.util.List<java.lang.String>>> getTestArrayLevel1() {
      return testArrayLevel1;
    }

    /**
      * Sets the value of the 'testArrayLevel1' field.
      * @param value The value of 'testArrayLevel1'.
      * @return This builder.
      */
    public com.vladkrava.converter.test.domain.DummyArrays.Builder setTestArrayLevel1(java.util.List<java.util.List<java.util.List<java.lang.String>>> value) {
      validate(fields()[0], value);
      this.testArrayLevel1 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'testArrayLevel1' field has been set.
      * @return True if the 'testArrayLevel1' field has been set, false otherwise.
      */
    public boolean hasTestArrayLevel1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'testArrayLevel1' field.
      * @return This builder.
      */
    public com.vladkrava.converter.test.domain.DummyArrays.Builder clearTestArrayLevel1() {
      testArrayLevel1 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'testArrayMap' field.
      * @return The value.
      */
    public java.util.List<java.util.Map<java.lang.String,java.lang.Long>> getTestArrayMap() {
      return testArrayMap;
    }

    /**
      * Sets the value of the 'testArrayMap' field.
      * @param value The value of 'testArrayMap'.
      * @return This builder.
      */
    public com.vladkrava.converter.test.domain.DummyArrays.Builder setTestArrayMap(java.util.List<java.util.Map<java.lang.String,java.lang.Long>> value) {
      validate(fields()[1], value);
      this.testArrayMap = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'testArrayMap' field has been set.
      * @return True if the 'testArrayMap' field has been set, false otherwise.
      */
    public boolean hasTestArrayMap() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'testArrayMap' field.
      * @return This builder.
      */
    public com.vladkrava.converter.test.domain.DummyArrays.Builder clearTestArrayMap() {
      testArrayMap = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DummyArrays build() {
      try {
        DummyArrays record = new DummyArrays();
        record.testArrayLevel1 = fieldSetFlags()[0] ? this.testArrayLevel1 : (java.util.List<java.util.List<java.util.List<java.lang.String>>>) defaultValue(fields()[0]);
        record.testArrayMap = fieldSetFlags()[1] ? this.testArrayMap : (java.util.List<java.util.Map<java.lang.String,java.lang.Long>>) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DummyArrays>
    WRITER$ = (org.apache.avro.io.DatumWriter<DummyArrays>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DummyArrays>
    READER$ = (org.apache.avro.io.DatumReader<DummyArrays>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
