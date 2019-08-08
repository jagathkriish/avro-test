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
@org.apache.avro.specific.AvroGenerated
public class InnerClass extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1499434706664971219L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InnerClass\",\"namespace\":\"com.vladkrava.converter.test.domain\",\"fields\":[{\"name\":\"testName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"testId\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<InnerClass> ENCODER =
      new BinaryMessageEncoder<InnerClass>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<InnerClass> DECODER =
      new BinaryMessageDecoder<InnerClass>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<InnerClass> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<InnerClass> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<InnerClass>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this InnerClass to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a InnerClass from a ByteBuffer. */
  public static InnerClass fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String testName;
   private long testId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InnerClass() {}

  /**
   * All-args constructor.
   * @param testName The new value for testName
   * @param testId The new value for testId
   */
  public InnerClass(java.lang.String testName, java.lang.Long testId) {
    this.testName = testName;
    this.testId = testId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return testName;
    case 1: return testId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: testName = (java.lang.String)value$; break;
    case 1: testId = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'testName' field.
   * @return The value of the 'testName' field.
   */
  public java.lang.String getTestName() {
    return testName;
  }


  /**
   * Gets the value of the 'testId' field.
   * @return The value of the 'testId' field.
   */
  public java.lang.Long getTestId() {
    return testId;
  }


  /**
   * Creates a new InnerClass RecordBuilder.
   * @return A new InnerClass RecordBuilder
   */
  public static com.vladkrava.converter.test.domain.InnerClass.Builder newBuilder() {
    return new com.vladkrava.converter.test.domain.InnerClass.Builder();
  }

  /**
   * Creates a new InnerClass RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InnerClass RecordBuilder
   */
  public static com.vladkrava.converter.test.domain.InnerClass.Builder newBuilder(com.vladkrava.converter.test.domain.InnerClass.Builder other) {
    return new com.vladkrava.converter.test.domain.InnerClass.Builder(other);
  }

  /**
   * Creates a new InnerClass RecordBuilder by copying an existing InnerClass instance.
   * @param other The existing instance to copy.
   * @return A new InnerClass RecordBuilder
   */
  public static com.vladkrava.converter.test.domain.InnerClass.Builder newBuilder(com.vladkrava.converter.test.domain.InnerClass other) {
    return new com.vladkrava.converter.test.domain.InnerClass.Builder(other);
  }

  /**
   * RecordBuilder for InnerClass instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InnerClass>
    implements org.apache.avro.data.RecordBuilder<InnerClass> {

    private java.lang.String testName;
    private long testId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.vladkrava.converter.test.domain.InnerClass.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.testName)) {
        this.testName = data().deepCopy(fields()[0].schema(), other.testName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.testId)) {
        this.testId = data().deepCopy(fields()[1].schema(), other.testId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing InnerClass instance
     * @param other The existing instance to copy.
     */
    private Builder(com.vladkrava.converter.test.domain.InnerClass other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.testName)) {
        this.testName = data().deepCopy(fields()[0].schema(), other.testName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.testId)) {
        this.testId = data().deepCopy(fields()[1].schema(), other.testId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'testName' field.
      * @return The value.
      */
    public java.lang.String getTestName() {
      return testName;
    }

    /**
      * Sets the value of the 'testName' field.
      * @param value The value of 'testName'.
      * @return This builder.
      */
    public com.vladkrava.converter.test.domain.InnerClass.Builder setTestName(java.lang.String value) {
      validate(fields()[0], value);
      this.testName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'testName' field has been set.
      * @return True if the 'testName' field has been set, false otherwise.
      */
    public boolean hasTestName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'testName' field.
      * @return This builder.
      */
    public com.vladkrava.converter.test.domain.InnerClass.Builder clearTestName() {
      testName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'testId' field.
      * @return The value.
      */
    public java.lang.Long getTestId() {
      return testId;
    }

    /**
      * Sets the value of the 'testId' field.
      * @param value The value of 'testId'.
      * @return This builder.
      */
    public com.vladkrava.converter.test.domain.InnerClass.Builder setTestId(long value) {
      validate(fields()[1], value);
      this.testId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'testId' field has been set.
      * @return True if the 'testId' field has been set, false otherwise.
      */
    public boolean hasTestId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'testId' field.
      * @return This builder.
      */
    public com.vladkrava.converter.test.domain.InnerClass.Builder clearTestId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public InnerClass build() {
      try {
        InnerClass record = new InnerClass();
        record.testName = fieldSetFlags()[0] ? this.testName : (java.lang.String) defaultValue(fields()[0]);
        record.testId = fieldSetFlags()[1] ? this.testId : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<InnerClass>
    WRITER$ = (org.apache.avro.io.DatumWriter<InnerClass>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<InnerClass>
    READER$ = (org.apache.avro.io.DatumReader<InnerClass>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}