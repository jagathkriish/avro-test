package com.vladkrava.converter;

import static org.junit.Assert.assertEquals;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import com.vladkrava.converter.serialization.DataSerializationException;
import com.vladkrava.converter.test.domain.DummyObject;
import com.vladkrava.converter.test.domain.DummyObjectComplex;
import com.vladkrava.converter.test.domain.DummyObjectPrimitives;
import com.vladkrava.converter.test.domain.InnerClass;
import com.vladkrava.converter.test.domain.TestEnum;

/**
 * @author Vlad Krava - vkrava4@gmail.com
 * @since 0.1-SNAPSHOT
 */
public class JsonToAvroConverterTest {
    private static final String TEST_ENCODING = "UTF-8";

    private static final String EXPECTED_DUMMY_FILE_NAME = "json/given-dummy.json";
    private static final String EXPECTED_DUMMY_PRIMITIVES_FILE_NAME = "json/dummy-primitives.json";
    private static final String EXPECTED_DUMMY_FORMATTED_FILE_NAME = "json/given-formatted-dummy.json";
    private static final String EXPECTED_DUMMY_COMPLEX_FILE_NAME = "json/dummy-complex.json";
    private static final String BROKEN_DUMMY_FILE_NAME = "json/broken-dummy.json";
    private static final String BROKEN_JSON_FILE_NAME = "json/broken.json";

//    DUMMY
    private DummyObject expectedDummyObject;
    private JsonToAvroConverter<DummyObject> jsonToAvro;

//    PRIMITIVES
    private DummyObjectPrimitives expectedDummyObjectPrimitives;
    private JsonToAvroConverter<DummyObjectPrimitives> jsonToAvroPrimitives;

//    COMPLEX
    private DummyObjectComplex expectedDummyComplexObject;
    private JsonToAvroConverter<DummyObjectComplex> jsonToAvroComplex;


    @Before
    public void setup() {
        setupDummyTestData();
        setupDummyPrimitivesTestData();
        setupDummyComplexTestData();
    }


    @Test
    public void convertDummyTest() throws Exception {
        final String givenJson = IOUtils.toString(Objects.requireNonNull(getClass().getClassLoader()
                .getResourceAsStream(EXPECTED_DUMMY_FILE_NAME)), TEST_ENCODING);

        assertEquals(this.expectedDummyObject, jsonToAvro.convert(givenJson, DummyObject.class));
    }


    @Test
    public void convertDummyPrimitivesTest() throws Exception {
        final String givenJson = IOUtils.toString(Objects.requireNonNull(getClass().getClassLoader()
                .getResourceAsStream(EXPECTED_DUMMY_PRIMITIVES_FILE_NAME)), TEST_ENCODING);

        assertEquals(this.expectedDummyObjectPrimitives, jsonToAvroPrimitives.convert(givenJson, DummyObjectPrimitives.class));
    }


    @Test
    public void convertFormattedDummyTest() throws Exception {
        final String givenJson = IOUtils.toString(Objects.requireNonNull(getClass().getClassLoader()
                .getResourceAsStream(EXPECTED_DUMMY_FORMATTED_FILE_NAME)), TEST_ENCODING);

        assertEquals(this.expectedDummyObject, jsonToAvro.convert(givenJson, DummyObject.class));
    }

    @Test
    public void convertComplexDummyTest() throws Exception {
        final String givenJson = IOUtils.toString(Objects.requireNonNull(getClass().getClassLoader()
                .getResourceAsStream(EXPECTED_DUMMY_COMPLEX_FILE_NAME)), TEST_ENCODING);

        System.out.println(givenJson);

        assertEquals(this.expectedDummyComplexObject, jsonToAvroComplex.convert(givenJson, DummyObjectComplex.class));
    }


    @Test(expected = DataSerializationException.class)
    public void convertBrokenDummyTest() throws Exception {
        final String givenJson = IOUtils.toString(Objects.requireNonNull(getClass().getClassLoader()
                .getResourceAsStream(BROKEN_DUMMY_FILE_NAME)), TEST_ENCODING);

        assertEquals(this.expectedDummyObject, jsonToAvro.convert(givenJson, DummyObject.class));
    }

    @Test(expected = DataSerializationException.class)
    public void convertBrokenJsonTest() throws Exception {
        final String givenJson = IOUtils.toString(Objects.requireNonNull(getClass().getClassLoader()
                .getResourceAsStream(BROKEN_JSON_FILE_NAME)), TEST_ENCODING);

        assertEquals(this.expectedDummyObject, jsonToAvro.convert(givenJson, DummyObject.class));
    }

    private void setupDummyTestData() {
        this.jsonToAvro = new JsonToAvroConverter<>();
        this.expectedDummyObject = DummyObject.newBuilder()
                .setTestInt(1)
                .setTestString1("TEST_STRING")
                .setTestString2("TEST_STRING_2")
                .setTestArray(Arrays.asList("1", "2", "3"))
                .build();

    }

    private void setupDummyPrimitivesTestData() {
        this.jsonToAvroPrimitives = new JsonToAvroConverter<>();
        this.expectedDummyObjectPrimitives = DummyObjectPrimitives.newBuilder()
                .setTestInt(1)
                .setTestDouble(2d)
                .setTestFloat(3f)
                .setTestLong(4L)
                .setTestBoolean(true)
                .setTestString("TEST")
                .setTestBytes(ByteBuffer.wrap("TEST_BYTES".getBytes()))
                .build();
    }

    private void setupDummyComplexTestData() {
        final Map<String, Float> testMap = new LinkedHashMap<>();
        testMap.put("TEST_MAP_VALUE1", 99.99f);
        testMap.put("TEST_MAP_VALUE2", 299.99f);

        this.jsonToAvroComplex = new JsonToAvroConverter<>();
        final DummyObjectPrimitives.Builder primitivesBuilder = DummyObjectPrimitives.newBuilder()
                .setTestInt(1)
                .setTestDouble(2d)
                .setTestFloat(3f)
                .setTestLong(4L)
                .setTestBoolean(true)
                .setTestString("TEST_STRING_PRIMITIVES")
                .setTestBytes(ByteBuffer.wrap("TEST_BYTES".getBytes()));

        this.expectedDummyComplexObject = DummyObjectComplex.newBuilder()
                .setTestString("TEST_STRING_1")
                .setTestEnum(TestEnum.YES)
                .setTestList(Arrays.asList(InnerClass.newBuilder().setTestId(10L).setTestName("TEST_STRING_INNER_CLASS_1").build(),
                        InnerClass.newBuilder().setTestId(20L).setTestName("TEST_STRING_INNER_CLASS_2").build()))
                .setTestMap(testMap)
                .setTestPrimitivesBuilder(primitivesBuilder).build();
    }
}