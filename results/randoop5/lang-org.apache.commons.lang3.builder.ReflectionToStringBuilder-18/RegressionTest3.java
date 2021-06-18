import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder9.append("", (double) 10.0f);
        int[] intArray19 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = toStringBuilder9.append(intArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = toStringBuilder9.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = toStringBuilder22.append("<null>", (float) 10);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder25);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder16 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder16.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.lang.String str25 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray24);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder26 = reflectionToStringBuilder16.setExcludeFieldNames(strArray24);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder26.append("hi!", 'a');
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.lang.String str35 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray34);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder29.append("hi!", (java.lang.Object[]) strArray34);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = reflectionToStringBuilder11.setExcludeFieldNames(strArray34);
        java.lang.String[] strArray38 = reflectionToStringBuilder11.getExcludeFieldNames();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = reflectionToStringBuilder11.append((double) (-1.0f));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder43 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray50 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = reflectionToStringBuilder43.append(booleanArray50);
        float[] floatArray53 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = reflectionToStringBuilder43.append("hi!", floatArray53);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder40.append("hi!", floatArray53);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder40.append("", false);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder26);
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder51);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(toStringBuilder58);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = toStringBuilder12.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = toStringBuilder14.append((int) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = toStringBuilder14.append("<null>", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder19.appendToString("hi!");
        java.lang.Class<?> wildcardClass22 = toStringBuilder21.getClass();
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertNotNull(toStringBuilder19);
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray16 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = reflectionToStringBuilder8.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder1.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder22 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder22.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray32 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder26.append("", shortArray32, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder1.append(shortArray32);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = toStringBuilder35.append("", (float) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = toStringBuilder35.append("<null>", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = toStringBuilder41.append("<null>", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = toStringBuilder44.append("hi!", (short) (byte) 100);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(toStringBuilder38);
        org.junit.Assert.assertNotNull(toStringBuilder41);
        org.junit.Assert.assertNotNull(toStringBuilder44);
        org.junit.Assert.assertNotNull(toStringBuilder47);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray25 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder18.append(booleanArray25);
        float[] floatArray28 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder18.append("hi!", floatArray28);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder18.append('4');
        long[] longArray33 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder31.append("hi!", longArray33);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = reflectionToStringBuilder1.append("hi!", longArray33, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = toStringBuilder36.append("", (double) 10L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray50 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder42.append("hi!", doubleArray50, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder53 = toStringBuilder36.append("hi!", doubleArray50);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder53.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder57 = toStringBuilder55.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = toStringBuilder57.append(100);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(toStringBuilder39);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder53);
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(toStringBuilder57);
        org.junit.Assert.assertNotNull(toStringBuilder59);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder14.append("", 10);
        float[] floatArray21 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(floatArray21);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder1.append("", floatArray21, true);
        java.lang.Class<?> wildcardClass25 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder1.append("hi!", (int) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder1.append((float) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = reflectionToStringBuilder1.append("", '4');
        byte[] byteArray34 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder1.append(byteArray34);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle36 = reflectionToStringBuilder1.getStyle();
        java.lang.StringBuffer stringBuffer37 = reflectionToStringBuilder1.getStringBuffer();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(toStringStyle36);
        org.junit.Assert.assertNotNull(stringBuffer37);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder16 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder16.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.lang.String str25 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray24);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder26 = reflectionToStringBuilder16.setExcludeFieldNames(strArray24);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder26.append("hi!", 'a');
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.lang.String str35 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray34);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder29.append("hi!", (java.lang.Object[]) strArray34);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = reflectionToStringBuilder11.setExcludeFieldNames(strArray34);
        java.lang.String[] strArray38 = reflectionToStringBuilder11.getExcludeFieldNames();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = reflectionToStringBuilder11.append((double) (-1.0f));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder11.append(true);
        boolean boolean43 = reflectionToStringBuilder11.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = reflectionToStringBuilder11.append((byte) -1);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder26);
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(toStringBuilder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(toStringBuilder45);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = toStringBuilder14.append("hi!", 0.0d);
        java.lang.Object obj19 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder17.append("hi!", obj19, true);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(toStringBuilder21);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder14.append("", 10);
        float[] floatArray21 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(floatArray21);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder1.append("", floatArray21, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder1.append("", (float) (short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder1.append("<null>", (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder1.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = toStringBuilder32.append("hi!", (int) (byte) 100);
        java.lang.StringBuffer stringBuffer36 = toStringBuilder32.getStringBuffer();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder38 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = reflectionToStringBuilder38.append("", 10);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder41);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder44 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray51 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder44.append(booleanArray51);
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder52.append("", doubleArray56, false);
        char[] charArray63 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = toStringBuilder52.append("", charArray63);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = reflectionToStringBuilder42.append(charArray63);
        int[] intArray73 = new int[] { (short) 100, '4', '#', (byte) 1, 1, '#' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = reflectionToStringBuilder42.append("hi!", intArray73, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder76 = toStringBuilder32.append(intArray73);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(toStringBuilder27);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(stringBuffer36);
        org.junit.Assert.assertNotNull(toStringBuilder41);
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder58);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[4, #, 4]");
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(toStringBuilder65);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 52, 35, 1, 1, 35]");
        org.junit.Assert.assertNotNull(toStringBuilder75);
        org.junit.Assert.assertNotNull(toStringBuilder76);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder7.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray22 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder14.append("hi!", shortArray22, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder7.append("hi!", shortArray22, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = toStringBuilder26.append('#');
        boolean[] booleanArray35 = new boolean[] { false, true, true, true, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder28.append("", booleanArray35);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = reflectionToStringBuilder1.append(booleanArray35);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = toStringBuilder37.append('a');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray50 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder42.append("hi!", doubleArray50, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = reflectionToStringBuilder42.appendToString("<null>");
        java.lang.String str55 = reflectionToStringBuilder42.toString();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder57 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = reflectionToStringBuilder57.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder63 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray71 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = reflectionToStringBuilder63.append("hi!", doubleArray71, true);
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!" };
        java.lang.String str78 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray77);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder79 = reflectionToStringBuilder63.setExcludeFieldNames(strArray77);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = reflectionToStringBuilder57.appendAsObjectToString((java.lang.Object) reflectionToStringBuilder79);
        boolean boolean81 = reflectionToStringBuilder79.isAppendTransients();
        long[] longArray84 = new long[] { 'a' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = reflectionToStringBuilder79.append("hi!", longArray84, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder87 = reflectionToStringBuilder42.append(longArray84);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder88 = toStringBuilder37.append("hi!", longArray84);
        java.lang.String str89 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder88);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, true, true, true, true]");
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(toStringBuilder39);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertNotNull(toStringBuilder61);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder73);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder79);
        org.junit.Assert.assertNotNull(toStringBuilder80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[97]");
        org.junit.Assert.assertNotNull(toStringBuilder86);
        org.junit.Assert.assertNotNull(toStringBuilder87);
        org.junit.Assert.assertNotNull(toStringBuilder88);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder9.append("", (double) 10.0f);
        int[] intArray19 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = toStringBuilder9.append(intArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = toStringBuilder9.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = toStringBuilder22.append((double) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder27 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray35 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = reflectionToStringBuilder27.append("hi!", shortArray35, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = toStringBuilder24.append("", shortArray35);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = toStringBuilder24.append("hi!", (int) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder43 = toStringBuilder41.appendToString("");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(toStringBuilder38);
        org.junit.Assert.assertNotNull(toStringBuilder41);
        org.junit.Assert.assertNotNull(toStringBuilder43);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        double[] doubleArray11 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("", doubleArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", (double) (short) 0);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray26 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder18.append("hi!", doubleArray26, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = toStringBuilder15.append("hi!", doubleArray26);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = toStringBuilder15.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder31.append("", (float) ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray44 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = reflectionToStringBuilder37.append(booleanArray44);
        double[] doubleArray49 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = toStringBuilder45.append("", doubleArray49, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = toStringBuilder45.append("", (double) 10.0f);
        java.lang.String str55 = toStringBuilder54.build();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder57 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = reflectionToStringBuilder57.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!" };
        java.lang.String str66 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray65);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder67 = reflectionToStringBuilder57.setExcludeFieldNames(strArray65);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = reflectionToStringBuilder67.append("hi!", 'a');
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!" };
        java.lang.String str76 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray75);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = toStringBuilder70.append("hi!", (java.lang.Object[]) strArray75);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = toStringBuilder70.append("", (float) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder83 = toStringBuilder80.append("hi!", (float) (byte) 10);
        long[] longArray88 = new long[] { 0, 1L, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder90 = toStringBuilder83.append("", longArray88, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder91 = toStringBuilder54.append(longArray88);
        java.lang.String str92 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) longArray88);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder94 = toStringBuilder34.append("", longArray88, false);
        java.lang.String str95 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder45);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder51);
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertNotNull(toStringBuilder61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder67);
        org.junit.Assert.assertNotNull(toStringBuilder70);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(toStringBuilder77);
        org.junit.Assert.assertNotNull(toStringBuilder80);
        org.junit.Assert.assertNotNull(toStringBuilder83);
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[0, 1, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder90);
        org.junit.Assert.assertNotNull(toStringBuilder91);
        org.junit.Assert.assertNotNull(toStringBuilder94);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        java.lang.String str5 = reflectionToStringBuilder1.toString();
        boolean[] booleanArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(booleanArray6);
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder10 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder10.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.lang.String str19 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray18);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = reflectionToStringBuilder10.setExcludeFieldNames(strArray18);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = reflectionToStringBuilder20.append("hi!", 'a');
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.lang.String str29 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray28);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = toStringBuilder23.append("hi!", (java.lang.Object[]) strArray28);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder23.append("", (float) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder33.append("hi!", (float) (byte) 10);
        long[] longArray41 = new long[] { 0, 1L, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder43 = toStringBuilder36.append("", longArray41, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder46 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = reflectionToStringBuilder46.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray56 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder50.append("", shortArray56, true);
        int[] intArray62 = new int[] { (short) 1, ' ', (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = toStringBuilder58.append(intArray62);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = toStringBuilder43.append("<null>", intArray62, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder68 = toStringBuilder65.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle69 = toStringBuilder68.getStyle();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder70 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) wildcardClass8, toStringStyle69);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(toStringBuilder7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[0, 1, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder43);
        org.junit.Assert.assertNotNull(toStringBuilder50);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder58);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 32, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder63);
        org.junit.Assert.assertNotNull(toStringBuilder65);
        org.junit.Assert.assertNotNull(toStringBuilder68);
        org.junit.Assert.assertNotNull(toStringStyle69);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray9 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", shortArray9, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = toStringBuilder11.append("hi!", (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = toStringBuilder14.append('4');
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder16.appendAsObjectToString(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder16);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder9.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder21 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray28 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder21.append(booleanArray28);
        double[] doubleArray33 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = toStringBuilder29.append("", doubleArray33, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder9.append("", doubleArray33);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder39 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray49 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = reflectionToStringBuilder42.append(booleanArray49);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = reflectionToStringBuilder39.append("", booleanArray49);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder53 = toStringBuilder9.append("hi!", booleanArray49, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder56 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = reflectionToStringBuilder56.append("", 10);
        double[] doubleArray66 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = reflectionToStringBuilder56.append("", doubleArray66);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder68 = toStringBuilder53.append("hi!", (java.lang.Object) "");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = toStringBuilder68.appendSuper("");
        java.lang.String str71 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder70);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder50);
        org.junit.Assert.assertNotNull(toStringBuilder51);
        org.junit.Assert.assertNotNull(toStringBuilder53);
        org.junit.Assert.assertNotNull(toStringBuilder59);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder67);
        org.junit.Assert.assertNotNull(toStringBuilder68);
        org.junit.Assert.assertNotNull(toStringBuilder70);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("<null>", (long) (byte) -1);
        boolean boolean16 = reflectionToStringBuilder1.isAppendStatics();
        boolean boolean17 = reflectionToStringBuilder1.isAppendTransients();
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder16 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder16.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.lang.String str25 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray24);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder26 = reflectionToStringBuilder16.setExcludeFieldNames(strArray24);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder26.append("hi!", 'a');
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.lang.String str35 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray34);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder29.append("hi!", (java.lang.Object[]) strArray34);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = reflectionToStringBuilder11.setExcludeFieldNames(strArray34);
        java.lang.String[] strArray38 = reflectionToStringBuilder11.getExcludeFieldNames();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = reflectionToStringBuilder11.append((double) (-1.0f));
        java.lang.String str41 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder11);
        reflectionToStringBuilder11.setAppendTransients(true);
        java.lang.String str44 = reflectionToStringBuilder11.toString();
        reflectionToStringBuilder11.setAppendStatics(false);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder26);
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(toStringBuilder40);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("", (short) (byte) -1);
        java.lang.Class<?> wildcardClass15 = reflectionToStringBuilder11.getUpToClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder17 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = reflectionToStringBuilder17.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.lang.String str26 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray25);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder27 = reflectionToStringBuilder17.setExcludeFieldNames(strArray25);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = reflectionToStringBuilder11.setExcludeFieldNames(strArray25);
        java.lang.String[] strArray29 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder30 = reflectionToStringBuilder11.setExcludeFieldNames(strArray29);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder11.append((byte) 100);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder27);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder28);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder32);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = toStringBuilder13.append("", (short) 100);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(toStringBuilder16);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray11 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = toStringBuilder5.append("", shortArray11, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder5.append((float) (-1L));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = reflectionToStringBuilder18.append("", 10);
        double[] doubleArray28 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder18.append("", doubleArray28);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder18.append("hi!", (double) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder15.append("hi!", (java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder33.append("", (int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = toStringBuilder36.append((double) (byte) 10);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(toStringBuilder38);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray11 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = toStringBuilder5.append("", shortArray11, true);
        int[] intArray17 = new int[] { (short) 1, ' ', (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder13.append(intArray17);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray27 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder20.append(booleanArray27);
        double[] doubleArray32 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder28.append("", doubleArray32, false);
        char[] charArray39 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = toStringBuilder28.append("", charArray39);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder43 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = reflectionToStringBuilder43.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.lang.String str52 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray51);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = reflectionToStringBuilder43.setExcludeFieldNames(strArray51);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder53.append("hi!", 'a');
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.lang.String str62 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray61);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = toStringBuilder56.append("hi!", (java.lang.Object[]) strArray61);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = toStringBuilder28.append("hi!", (java.lang.Object[]) strArray61, false);
        java.lang.String str66 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) intArray17, strArray61);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 32, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4, #, 4]");
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder53);
        org.junit.Assert.assertNotNull(toStringBuilder56);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(toStringBuilder63);
        org.junit.Assert.assertNotNull(toStringBuilder65);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray11 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = toStringBuilder5.append("", shortArray11, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder16 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray24 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder16.append("hi!", doubleArray24, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder16.appendToString("<null>");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder31 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray38 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = reflectionToStringBuilder31.append(booleanArray38);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = toStringBuilder39.append("", doubleArray43, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder39.append("", (double) 10.0f);
        int[] intArray49 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = toStringBuilder39.append(intArray49);
        char[] charArray52 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder53 = toStringBuilder50.append("", charArray52);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = toStringBuilder28.append("hi!", charArray52);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder13.append("hi!", charArray52);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder57 = toStringBuilder13.append(0.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder60 = toStringBuilder13.append("", (int) (short) 10);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder39);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder45);
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder50);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder53);
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(toStringBuilder57);
        org.junit.Assert.assertNotNull(toStringBuilder60);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.lang.String str16 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray15);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder17 = reflectionToStringBuilder1.setExcludeFieldNames(strArray15);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray28 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder20.append("hi!", doubleArray28, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder17.append("", doubleArray28);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder32 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder31);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder33 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder31);
        boolean boolean34 = reflectionToStringBuilder33.isAppendStatics();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder17);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        double[] doubleArray11 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("", doubleArray11);
        char[] charArray15 = new char[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = toStringBuilder12.append("", charArray15);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder16.appendToString("hi!");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder20.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.lang.String str29 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray28);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder30 = reflectionToStringBuilder20.setExcludeFieldNames(strArray28);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = reflectionToStringBuilder30.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder35 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = reflectionToStringBuilder35.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.lang.String str44 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray43);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder45 = reflectionToStringBuilder35.setExcludeFieldNames(strArray43);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = reflectionToStringBuilder45.append("hi!", 'a');
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.lang.String str54 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray53);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder48.append("hi!", (java.lang.Object[]) strArray53);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder56 = reflectionToStringBuilder30.setExcludeFieldNames(strArray53);
        java.lang.String[] strArray57 = reflectionToStringBuilder30.getExcludeFieldNames();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = reflectionToStringBuilder30.append((double) (-1.0f));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder62 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray69 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = reflectionToStringBuilder62.append(booleanArray69);
        float[] floatArray72 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = reflectionToStringBuilder62.append("hi!", floatArray72);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder74 = toStringBuilder59.append("hi!", floatArray72);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = toStringBuilder18.append(floatArray72);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ]");
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder45);
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(toStringBuilder59);
        org.junit.Assert.assertNotNull(booleanArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray69), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder70);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder73);
        org.junit.Assert.assertNotNull(toStringBuilder74);
        org.junit.Assert.assertNotNull(toStringBuilder75);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("<null>", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = toStringBuilder15.append((byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder19 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder22 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray29 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder22.append(booleanArray29);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder19.append("", booleanArray29);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle32 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder33 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) booleanArray29, toStringStyle32);
        boolean boolean34 = reflectionToStringBuilder33.isAppendStatics();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = reflectionToStringBuilder37.append("", 10);
        double[] doubleArray47 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = reflectionToStringBuilder37.append("", doubleArray47);
        char[] charArray51 = new char[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = toStringBuilder48.append("", charArray51);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder48.append("", (short) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder57 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray65 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = reflectionToStringBuilder57.append("hi!", shortArray65, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder68 = toStringBuilder48.append(shortArray65);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = reflectionToStringBuilder33.append("", shortArray65, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = reflectionToStringBuilder33.append("", (double) (byte) 0);
        boolean boolean74 = reflectionToStringBuilder33.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder76 = reflectionToStringBuilder33.append((short) (byte) -1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle77 = reflectionToStringBuilder33.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = toStringBuilder15.appendAsObjectToString((java.lang.Object) reflectionToStringBuilder33);
        java.lang.String str79 = reflectionToStringBuilder33.toString();
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ ]");
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder67);
        org.junit.Assert.assertNotNull(toStringBuilder68);
        org.junit.Assert.assertNotNull(toStringBuilder70);
        org.junit.Assert.assertNotNull(toStringBuilder73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(toStringBuilder76);
        org.junit.Assert.assertNotNull(toStringStyle77);
        org.junit.Assert.assertNotNull(toStringBuilder78);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        java.lang.Class<?> wildcardClass14 = reflectionToStringBuilder1.getUpToClass();
        boolean boolean15 = reflectionToStringBuilder1.isAppendTransients();
        java.lang.String str16 = reflectionToStringBuilder1.build();
        boolean boolean17 = reflectionToStringBuilder1.isAppendTransients();
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.lang.String str16 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray15);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder17 = reflectionToStringBuilder1.setExcludeFieldNames(strArray15);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray28 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder20.append("hi!", doubleArray28, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder17.append("", doubleArray28);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder32 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder31);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder33 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder31);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.lang.String str40 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 1.0f, (java.util.Collection<java.lang.String>) strList38);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle41 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0f, toStringStyle41);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder44 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = reflectionToStringBuilder44.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder51 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray59 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = reflectionToStringBuilder51.append("hi!", shortArray59, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = reflectionToStringBuilder44.append("hi!", shortArray59, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder65 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder69 = reflectionToStringBuilder65.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!" };
        java.lang.String str74 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray73);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder75 = reflectionToStringBuilder65.setExcludeFieldNames(strArray73);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = reflectionToStringBuilder75.append("hi!", 'a');
        java.lang.String[] strArray83 = new java.lang.String[] { "", "hi!" };
        java.lang.String str84 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray83);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder85 = toStringBuilder78.append("hi!", (java.lang.Object[]) strArray83);
        java.lang.String str86 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) shortArray59, strArray83);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder87 = reflectionToStringBuilder42.append((java.lang.Object[]) strArray83);
        java.lang.String str88 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) reflectionToStringBuilder33, strArray83);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder91 = reflectionToStringBuilder33.append("hi!", (float) (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder17);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder61);
        org.junit.Assert.assertNotNull(toStringBuilder63);
        org.junit.Assert.assertNotNull(toStringBuilder69);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder75);
        org.junit.Assert.assertNotNull(toStringBuilder78);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(toStringBuilder85);
        org.junit.Assert.assertNotNull(toStringBuilder87);
        org.junit.Assert.assertNotNull(toStringBuilder91);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray9 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder10 = reflectionToStringBuilder2.append(booleanArray9);
        float[] floatArray12 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder2.append("hi!", floatArray12);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = null;
        java.lang.String str15 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder2, toStringStyle14);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = reflectionToStringBuilder2.getStyle();
        java.lang.String str17 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle16);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder10);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<null>" + "'", str17, "<null>");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray16 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = reflectionToStringBuilder8.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder1.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder22 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder22.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray32 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder26.append("", shortArray32, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder1.append(shortArray32);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = reflectionToStringBuilder37.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray47 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = toStringBuilder41.append("", shortArray47, true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle50 = null;
        java.lang.String str53 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) shortArray47, toStringStyle50, false, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = toStringBuilder35.appendAsObjectToString((java.lang.Object) true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder56 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray63 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder56.append(booleanArray63);
        double[] doubleArray68 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = toStringBuilder64.append("", doubleArray68, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = toStringBuilder64.append("", (double) 10.0f);
        int[] intArray74 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = toStringBuilder64.append(intArray74);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = toStringBuilder64.append(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle78 = toStringBuilder64.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle78);
        java.lang.String str82 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder35, toStringStyle78, true, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder84 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder88 = reflectionToStringBuilder84.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray92 = new java.lang.String[] { "", "hi!" };
        java.lang.String str93 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray92);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder94 = reflectionToStringBuilder84.setExcludeFieldNames(strArray92);
        boolean boolean95 = reflectionToStringBuilder94.isAppendStatics();
        java.lang.String[] strArray96 = reflectionToStringBuilder94.getExcludeFieldNames();
        java.lang.String str97 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle78, strArray96);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(toStringBuilder41);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder49);
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder70);
        org.junit.Assert.assertNotNull(toStringBuilder73);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder75);
        org.junit.Assert.assertNotNull(toStringBuilder77);
        org.junit.Assert.assertNotNull(toStringStyle78);
        org.junit.Assert.assertNotNull(toStringBuilder88);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strArray96);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("hi!", 'a');
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.lang.String str20 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder14.append("hi!", (java.lang.Object[]) strArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = toStringBuilder21.append((int) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = toStringBuilder23.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = toStringBuilder23.appendToString("");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder29 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder29.append("", 10);
        double[] doubleArray39 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = reflectionToStringBuilder29.append("", doubleArray39);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder43 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = reflectionToStringBuilder43.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.lang.String str52 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray51);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = reflectionToStringBuilder43.setExcludeFieldNames(strArray51);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder56 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray63 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder56.append(booleanArray63);
        double[] doubleArray68 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = toStringBuilder64.append("", doubleArray68, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = toStringBuilder64.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder76 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray83 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder84 = reflectionToStringBuilder76.append(booleanArray83);
        double[] doubleArray88 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder90 = toStringBuilder84.append("", doubleArray88, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder91 = toStringBuilder64.append("", doubleArray88);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder92 = reflectionToStringBuilder43.append("", doubleArray88);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder93 = toStringBuilder40.append("", doubleArray88);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder94 = toStringBuilder27.append(doubleArray88);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(toStringBuilder23);
        org.junit.Assert.assertNotNull(toStringBuilder25);
        org.junit.Assert.assertNotNull(toStringBuilder27);
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder53);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder70);
        org.junit.Assert.assertNotNull(toStringBuilder73);
        org.junit.Assert.assertNotNull(booleanArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray83), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder84);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder90);
        org.junit.Assert.assertNotNull(toStringBuilder91);
        org.junit.Assert.assertNotNull(toStringBuilder92);
        org.junit.Assert.assertNotNull(toStringBuilder93);
        org.junit.Assert.assertNotNull(toStringBuilder94);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = toStringBuilder15.append((float) 10);
        java.lang.String str18 = toStringBuilder17.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder17.append("hi!", 'a');
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(toStringBuilder21);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray23 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = reflectionToStringBuilder15.append("hi!", shortArray23, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder28.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.lang.String str37 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray36);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder38 = reflectionToStringBuilder28.setExcludeFieldNames(strArray36);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder41 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray48 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = reflectionToStringBuilder41.append(booleanArray48);
        double[] doubleArray53 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder49.append("", doubleArray53, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder49.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder61 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray68 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder69 = reflectionToStringBuilder61.append(booleanArray68);
        double[] doubleArray73 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = toStringBuilder69.append("", doubleArray73, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder76 = toStringBuilder49.append("", doubleArray73);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = reflectionToStringBuilder28.append("", doubleArray73);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = toStringBuilder25.append("", (java.lang.Object) doubleArray73);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = reflectionToStringBuilder1.append("hi!", doubleArray73, true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle81 = null;
        java.lang.String str83 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1, toStringStyle81, false);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder25);
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder38);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder49);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(toStringBuilder58);
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray68), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder69);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder75);
        org.junit.Assert.assertNotNull(toStringBuilder76);
        org.junit.Assert.assertNotNull(toStringBuilder77);
        org.junit.Assert.assertNotNull(toStringBuilder78);
        org.junit.Assert.assertNotNull(toStringBuilder80);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = toStringBuilder12.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = toStringBuilder12.append("hi!", 'a');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder20.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.lang.String str29 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray28);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder30 = reflectionToStringBuilder20.setExcludeFieldNames(strArray28);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = reflectionToStringBuilder30.append("hi!", 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder33.append("hi!", (float) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder39 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray46 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = reflectionToStringBuilder39.append(booleanArray46);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = toStringBuilder33.append("", booleanArray46, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder52 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = reflectionToStringBuilder52.append("", 10);
        double[] doubleArray62 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = reflectionToStringBuilder52.append("", doubleArray62);
        char[] charArray66 = new char[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = toStringBuilder63.append("", charArray66);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder69 = toStringBuilder49.append("", charArray66, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder71 = toStringBuilder17.append("<null>", charArray66, true);
        java.lang.Class<?> wildcardClass72 = charArray66.getClass();
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNotNull(toStringBuilder49);
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder63);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[ ]");
        org.junit.Assert.assertNotNull(toStringBuilder67);
        org.junit.Assert.assertNotNull(toStringBuilder69);
        org.junit.Assert.assertNotNull(toStringBuilder71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = toStringBuilder12.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = toStringBuilder14.append((int) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = toStringBuilder16.append("hi!", (float) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder19.append('4');
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertNotNull(toStringBuilder19);
        org.junit.Assert.assertNotNull(toStringBuilder21);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.StringBuffer stringBuffer6 = toStringBuilder4.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("", (double) (-1L));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = toStringBuilder4.append("", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = toStringBuilder4.append((float) 0L);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer6);
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder14);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = reflectionToStringBuilder11.append(0);
        boolean boolean17 = reflectionToStringBuilder11.isAppendStatics();
        reflectionToStringBuilder11.setAppendTransients(true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder21 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = reflectionToStringBuilder21.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder27 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray35 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = reflectionToStringBuilder27.append("hi!", doubleArray35, true);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.lang.String str42 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray41);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder43 = reflectionToStringBuilder27.setExcludeFieldNames(strArray41);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = reflectionToStringBuilder21.appendAsObjectToString((java.lang.Object) reflectionToStringBuilder43);
        boolean boolean45 = reflectionToStringBuilder43.isAppendTransients();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder48.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.lang.String str57 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray56);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder58 = reflectionToStringBuilder48.setExcludeFieldNames(strArray56);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = reflectionToStringBuilder58.append("hi!", 'a');
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!" };
        java.lang.String str67 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray66);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder68 = toStringBuilder61.append("hi!", (java.lang.Object[]) strArray66);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder69 = reflectionToStringBuilder43.append("", (java.lang.Object[]) strArray66);
        boolean boolean70 = reflectionToStringBuilder43.isAppendStatics();
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = reflectionToStringBuilder43.append("hi!", byteArray76, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder81 = toStringBuilder78.append("", (double) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder83 = toStringBuilder78.append((short) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = toStringBuilder78.append("hi!", (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder87 = reflectionToStringBuilder11.appendAsObjectToString((java.lang.Object) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder89 = toStringBuilder87.appendToString("<null>");
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(toStringBuilder25);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder43);
        org.junit.Assert.assertNotNull(toStringBuilder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder58);
        org.junit.Assert.assertNotNull(toStringBuilder61);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(toStringBuilder68);
        org.junit.Assert.assertNotNull(toStringBuilder69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[1, -1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder78);
        org.junit.Assert.assertNotNull(toStringBuilder81);
        org.junit.Assert.assertNotNull(toStringBuilder83);
        org.junit.Assert.assertNotNull(toStringBuilder86);
        org.junit.Assert.assertNotNull(toStringBuilder87);
        org.junit.Assert.assertNotNull(toStringBuilder89);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder9.append("", (double) 10.0f);
        int[] intArray19 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = toStringBuilder9.append(intArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = toStringBuilder20.append("hi!", (short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = toStringBuilder20.append((short) 0);
        java.lang.String str26 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder25);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder23);
        org.junit.Assert.assertNotNull(toStringBuilder25);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder16 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder16.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.lang.String str25 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray24);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder26 = reflectionToStringBuilder16.setExcludeFieldNames(strArray24);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder26.append("hi!", 'a');
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.lang.String str35 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray34);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder29.append("hi!", (java.lang.Object[]) strArray34);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = reflectionToStringBuilder11.setExcludeFieldNames(strArray34);
        java.lang.String[] strArray38 = reflectionToStringBuilder11.getExcludeFieldNames();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = reflectionToStringBuilder11.append((double) (-1.0f));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder11.append(true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder44 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray51 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder44.append(booleanArray51);
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder52.append("", doubleArray56, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = toStringBuilder52.append("", (double) 10.0f);
        int[] intArray62 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = toStringBuilder52.append(intArray62);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = toStringBuilder52.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = toStringBuilder65.append((double) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder69 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray76 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = reflectionToStringBuilder69.append(booleanArray76);
        double[] doubleArray81 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder83 = toStringBuilder77.append("", doubleArray81, false);
        char[] charArray88 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder89 = toStringBuilder77.append("", charArray88);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder90 = toStringBuilder65.append(charArray88);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder91 = toStringBuilder42.append((java.lang.Object) charArray88);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder93 = toStringBuilder91.appendToString("");
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder26);
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(toStringBuilder42);
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder58);
        org.junit.Assert.assertNotNull(toStringBuilder61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder63);
        org.junit.Assert.assertNotNull(toStringBuilder65);
        org.junit.Assert.assertNotNull(toStringBuilder67);
        org.junit.Assert.assertNotNull(booleanArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray76), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder77);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder83);
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray88), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray88), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray88), "[4, #, 4]");
        org.junit.Assert.assertNotNull(toStringBuilder89);
        org.junit.Assert.assertNotNull(toStringBuilder90);
        org.junit.Assert.assertNotNull(toStringBuilder91);
        org.junit.Assert.assertNotNull(toStringBuilder93);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray15 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder7.append("hi!", doubleArray15, true);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.lang.String str22 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray21);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder23 = reflectionToStringBuilder7.setExcludeFieldNames(strArray21);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder1.appendAsObjectToString((java.lang.Object) reflectionToStringBuilder23);
        boolean boolean25 = reflectionToStringBuilder23.isAppendTransients();
        reflectionToStringBuilder23.setAppendStatics(false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder30 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = reflectionToStringBuilder30.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!" };
        java.lang.String str39 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray38);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder40 = reflectionToStringBuilder30.setExcludeFieldNames(strArray38);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder43 = reflectionToStringBuilder40.append("hi!", 'a');
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.lang.String str49 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray48);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = toStringBuilder43.append("hi!", (java.lang.Object[]) strArray48);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = toStringBuilder50.append((int) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder52.append("", (int) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder52.append("<null>", 10.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = toStringBuilder58.append("<null>", 'a');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder63 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray71 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = reflectionToStringBuilder63.append("hi!", shortArray71, true);
        byte[] byteArray75 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = reflectionToStringBuilder63.append("", byteArray75, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder80 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray88 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder90 = reflectionToStringBuilder80.append("hi!", shortArray88, true);
        byte[] byteArray92 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder94 = reflectionToStringBuilder80.append("", byteArray92, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder95 = reflectionToStringBuilder63.append("hi!", byteArray92);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder96 = toStringBuilder58.append(byteArray92);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder97 = reflectionToStringBuilder23.append("<null>", byteArray92);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder99 = reflectionToStringBuilder23.append(true);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder23);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder40);
        org.junit.Assert.assertNotNull(toStringBuilder43);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(toStringBuilder50);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(toStringBuilder58);
        org.junit.Assert.assertNotNull(toStringBuilder61);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder73);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder77);
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray88), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder90);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray92), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder94);
        org.junit.Assert.assertNotNull(toStringBuilder95);
        org.junit.Assert.assertNotNull(toStringBuilder96);
        org.junit.Assert.assertNotNull(toStringBuilder97);
        org.junit.Assert.assertNotNull(toStringBuilder99);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder1.append('4');
        long[] longArray16 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = toStringBuilder14.append("hi!", longArray16);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = toStringBuilder14.append("<null>", (float) (short) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder23 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder23.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder30 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray38 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = reflectionToStringBuilder30.append("hi!", shortArray38, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder23.append("hi!", shortArray38, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder44 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = reflectionToStringBuilder44.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.lang.String str53 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray52);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder54 = reflectionToStringBuilder44.setExcludeFieldNames(strArray52);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder57 = reflectionToStringBuilder54.append("hi!", 'a');
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!" };
        java.lang.String str63 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray62);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = toStringBuilder57.append("hi!", (java.lang.Object[]) strArray62);
        java.lang.String str65 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) shortArray38, strArray62);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = toStringBuilder14.append("", (java.lang.Object[]) strArray62, true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder27);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(toStringBuilder42);
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder54);
        org.junit.Assert.assertNotNull(toStringBuilder57);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(toStringBuilder67);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = toStringBuilder12.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = toStringBuilder14.append((int) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = toStringBuilder16.append("hi!", (float) '#');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder22 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray30 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder22.append("hi!", doubleArray30, true);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.lang.String str37 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray36);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder38 = reflectionToStringBuilder22.setExcludeFieldNames(strArray36);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder41 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray49 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = reflectionToStringBuilder41.append("hi!", doubleArray49, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder38.append("", doubleArray49);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder53 = toStringBuilder19.append("", doubleArray49);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertNotNull(toStringBuilder19);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder38);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder51);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder53);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray11 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = toStringBuilder5.append("", shortArray11, true);
        int[] intArray17 = new int[] { (short) 1, ' ', (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder13.append(intArray17);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder21 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = reflectionToStringBuilder21.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray31 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder25.append("", shortArray31, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = toStringBuilder25.append((float) (-1L));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray44 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = reflectionToStringBuilder37.append(booleanArray44);
        double[] doubleArray49 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = toStringBuilder45.append("", doubleArray49, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = toStringBuilder45.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder56 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder54, toStringStyle55);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = reflectionToStringBuilder56.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = toStringBuilder25.append((java.lang.Object) toStringBuilder58);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder61 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray69 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder71 = reflectionToStringBuilder61.append("hi!", shortArray69, true);
        byte[] byteArray73 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = reflectionToStringBuilder61.append("", byteArray73, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder76 = toStringBuilder59.append(byteArray73);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = toStringBuilder13.append("hi!", byteArray73);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder79 = toStringBuilder13.append((int) (byte) 0);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 32, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(toStringBuilder25);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder45);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder51);
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertNotNull(toStringBuilder58);
        org.junit.Assert.assertNotNull(toStringBuilder59);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder71);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder75);
        org.junit.Assert.assertNotNull(toStringBuilder76);
        org.junit.Assert.assertNotNull(toStringBuilder77);
        org.junit.Assert.assertNotNull(toStringBuilder79);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) booleanArray11, toStringStyle14);
        java.lang.String str16 = reflectionToStringBuilder15.build();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder19 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = reflectionToStringBuilder19.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray29 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = toStringBuilder23.append("", shortArray29, true);
        int[] intArray35 = new int[] { (short) 1, ' ', (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder31.append(intArray35);
        short[] shortArray44 = new short[] { (byte) 10, (byte) -1, (short) 1, (byte) 100, (byte) -1, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = toStringBuilder36.append("<null>", shortArray44);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = reflectionToStringBuilder15.append("<null>", shortArray44);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray55 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder48.append(booleanArray55);
        float[] floatArray58 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = reflectionToStringBuilder48.append("hi!", floatArray58);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = reflectionToStringBuilder48.append('4');
        long[] longArray63 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = toStringBuilder61.append("hi!", longArray63);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = reflectionToStringBuilder15.append(longArray63);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(toStringBuilder23);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 32, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[10, -1, 1, 100, -1, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder45);
        org.junit.Assert.assertNotNull(toStringBuilder46);
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder56);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder59);
        org.junit.Assert.assertNotNull(toStringBuilder61);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(toStringBuilder65);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder1.append('4');
        long[] longArray16 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = toStringBuilder14.append("hi!", longArray16);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder19 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray26 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder19.append(booleanArray26);
        double[] doubleArray31 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder27.append("", doubleArray31, false);
        char[] charArray38 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = toStringBuilder27.append("", charArray38);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = toStringBuilder17.append(charArray38);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = toStringBuilder17.append(10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = toStringBuilder42.append("<null>", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder42.append("hi!", 1.0f);
        java.lang.String str49 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder42);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder27);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4, #, 4]");
        org.junit.Assert.assertNotNull(toStringBuilder39);
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(toStringBuilder42);
        org.junit.Assert.assertNotNull(toStringBuilder45);
        org.junit.Assert.assertNotNull(toStringBuilder48);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        double[] doubleArray11 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("", doubleArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", (int) (byte) 10);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder17 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1, toStringStyle16);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray16 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = reflectionToStringBuilder8.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder1.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder22 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder22.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray32 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder26.append("", shortArray32, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder1.append(shortArray32);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = toStringBuilder35.append("", (float) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = toStringBuilder35.append("<null>", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = toStringBuilder41.append("<null>", false);
        java.lang.String str46 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) false, "");
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(toStringBuilder38);
        org.junit.Assert.assertNotNull(toStringBuilder41);
        org.junit.Assert.assertNotNull(toStringBuilder44);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        char[] charArray20 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder9.append("", charArray20);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder24 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder24.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.lang.String str33 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray32);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = reflectionToStringBuilder24.setExcludeFieldNames(strArray32);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = reflectionToStringBuilder34.append("hi!", 'a');
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.lang.String str43 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray42);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = toStringBuilder37.append("hi!", (java.lang.Object[]) strArray42);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = toStringBuilder9.append("hi!", (java.lang.Object[]) strArray42, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder46.append((double) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = toStringBuilder48.append("hi!", (byte) -1);
        short[] shortArray53 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder48.append("hi!", shortArray53, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder58 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder62 = reflectionToStringBuilder58.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!" };
        java.lang.String str67 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray66);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder68 = reflectionToStringBuilder58.setExcludeFieldNames(strArray66);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder71 = reflectionToStringBuilder68.append("hi!", 'a');
        java.lang.String[] strArray76 = new java.lang.String[] { "", "hi!" };
        java.lang.String str77 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray76);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = toStringBuilder71.append("hi!", (java.lang.Object[]) strArray76);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder81 = toStringBuilder71.append("", (float) (byte) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder82 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder81);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder84 = toStringBuilder48.append("hi!", (java.lang.Object) toStringBuilder81, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder87 = toStringBuilder84.append("", 0L);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, #, 4]");
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(toStringBuilder44);
        org.junit.Assert.assertNotNull(toStringBuilder46);
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(toStringBuilder51);
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(toStringBuilder62);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder68);
        org.junit.Assert.assertNotNull(toStringBuilder71);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(toStringBuilder78);
        org.junit.Assert.assertNotNull(toStringBuilder81);
        org.junit.Assert.assertNotNull(toStringBuilder84);
        org.junit.Assert.assertNotNull(toStringBuilder87);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        boolean boolean14 = reflectionToStringBuilder1.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = reflectionToStringBuilder1.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder1.append("", (int) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder1.append("", (int) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = toStringBuilder22.appendToString("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = toStringBuilder22.append("<null>", (byte) 0);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertNotNull(toStringBuilder19);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(toStringBuilder27);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        char[] charArray20 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder9.append("", charArray20);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder24 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder24.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.lang.String str33 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray32);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = reflectionToStringBuilder24.setExcludeFieldNames(strArray32);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = reflectionToStringBuilder34.append("hi!", 'a');
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.lang.String str43 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray42);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = toStringBuilder37.append("hi!", (java.lang.Object[]) strArray42);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = toStringBuilder9.append("hi!", (java.lang.Object[]) strArray42, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder46.append((double) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = toStringBuilder46.appendAsObjectToString((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = toStringBuilder46.appendSuper("");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder52);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder56 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray63 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder56.append(booleanArray63);
        float[] floatArray66 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = reflectionToStringBuilder56.append("hi!", floatArray66);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder69 = toStringBuilder67.appendToString("");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder72 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray79 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = reflectionToStringBuilder72.append(booleanArray79);
        double[] doubleArray84 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = toStringBuilder80.append("", doubleArray84, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder89 = toStringBuilder80.append("", (double) 10.0f);
        int[] intArray90 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder91 = toStringBuilder80.append(intArray90);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder93 = toStringBuilder67.append("hi!", intArray90, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder95 = reflectionToStringBuilder53.append("hi!", intArray90, false);
        boolean boolean96 = reflectionToStringBuilder53.isAppendStatics();
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, #, 4]");
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(toStringBuilder44);
        org.junit.Assert.assertNotNull(toStringBuilder46);
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(toStringBuilder50);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder67);
        org.junit.Assert.assertNotNull(toStringBuilder69);
        org.junit.Assert.assertNotNull(booleanArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray79), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder80);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder86);
        org.junit.Assert.assertNotNull(toStringBuilder89);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder91);
        org.junit.Assert.assertNotNull(toStringBuilder93);
        org.junit.Assert.assertNotNull(toStringBuilder95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder14.append("", 10);
        float[] floatArray21 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(floatArray21);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder1.append("", floatArray21, true);
        java.lang.Class<?> wildcardClass25 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder1.append("hi!", (int) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder1.append((float) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = reflectionToStringBuilder1.append("", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = reflectionToStringBuilder1.append("<null>", false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder36);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.StringBuffer stringBuffer6 = toStringBuilder4.getStringBuffer();
        boolean[] booleanArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(booleanArray7);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray18 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder11.append(booleanArray18);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = toStringBuilder19.append("", doubleArray23, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = toStringBuilder19.append("", (double) 10.0f);
        java.lang.String str29 = toStringBuilder28.build();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder32 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder32.append("", 10);
        float[] floatArray39 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = reflectionToStringBuilder32.append(floatArray39);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = reflectionToStringBuilder42.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray52 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = toStringBuilder46.append("", shortArray52, true);
        int[] intArray58 = new int[] { (short) 1, ' ', (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = toStringBuilder54.append(intArray58);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder60 = toStringBuilder40.append((java.lang.Object) toStringBuilder54);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder62 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder66 = reflectionToStringBuilder62.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray72 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder74 = toStringBuilder66.append("", shortArray72, true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle75 = null;
        java.lang.String str78 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) shortArray72, toStringStyle75, false, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder79 = toStringBuilder54.append(shortArray72);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder81 = toStringBuilder28.append("<null>", shortArray72, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder83 = toStringBuilder4.append("", shortArray72, false);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer6);
        org.junit.Assert.assertNotNull(toStringBuilder8);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder19);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder25);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(toStringBuilder46);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 32, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder59);
        org.junit.Assert.assertNotNull(toStringBuilder60);
        org.junit.Assert.assertNotNull(toStringBuilder66);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder74);
        org.junit.Assert.assertNotNull(toStringBuilder79);
        org.junit.Assert.assertNotNull(toStringBuilder81);
        org.junit.Assert.assertNotNull(toStringBuilder83);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        double[] doubleArray11 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("", doubleArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", (double) (short) 0);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray26 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder18.append("hi!", doubleArray26, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = toStringBuilder15.append("hi!", doubleArray26);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = toStringBuilder15.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder31.append("", (float) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder31.append((long) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder38 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray45 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = reflectionToStringBuilder38.append(booleanArray45);
        double[] doubleArray50 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = toStringBuilder46.append("", doubleArray50, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder46.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder58 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray65 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder66 = reflectionToStringBuilder58.append(booleanArray65);
        double[] doubleArray70 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder72 = toStringBuilder66.append("", doubleArray70, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = toStringBuilder46.append("", doubleArray70);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder75 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray83 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder85 = reflectionToStringBuilder75.append("hi!", shortArray83, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder88 = toStringBuilder85.append("hi!", (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder89 = toStringBuilder73.append((java.lang.Object) toStringBuilder85);
        boolean[] booleanArray91 = new boolean[] { true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder92 = toStringBuilder89.append(booleanArray91);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder93 = toStringBuilder36.append((java.lang.Object) toStringBuilder89);
        java.lang.StringBuffer stringBuffer94 = toStringBuilder36.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder96 = toStringBuilder36.appendToString("hi!");
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder46);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(booleanArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray65), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder66);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder72);
        org.junit.Assert.assertNotNull(toStringBuilder73);
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray83), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder85);
        org.junit.Assert.assertNotNull(toStringBuilder88);
        org.junit.Assert.assertNotNull(toStringBuilder89);
        org.junit.Assert.assertNotNull(booleanArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray91), "[true]");
        org.junit.Assert.assertNotNull(toStringBuilder92);
        org.junit.Assert.assertNotNull(toStringBuilder93);
        org.junit.Assert.assertNotNull(stringBuffer94);
        org.junit.Assert.assertNotNull(toStringBuilder96);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder14.append("", 10);
        float[] floatArray21 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(floatArray21);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder1.append("", floatArray21, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = toStringBuilder24.append("hi!", (long) ' ');
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(toStringBuilder27);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append((long) (byte) 0);
        boolean boolean16 = reflectionToStringBuilder1.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = reflectionToStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder18.append("hi!", '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = toStringBuilder18.append("", (long) (byte) 1);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(toStringBuilder24);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        double[] doubleArray11 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("", doubleArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", (int) (byte) 10);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder17 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray25 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder17.append("hi!", doubleArray25, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder17.append("hi!", (float) (byte) 0);
        java.lang.String str31 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder30);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder30.append((int) (byte) 1);
        java.lang.String str34 = toStringBuilder33.build();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder36 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = reflectionToStringBuilder36.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.lang.String str45 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray44);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder46 = reflectionToStringBuilder36.setExcludeFieldNames(strArray44);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = reflectionToStringBuilder46.append("hi!", 'a');
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.lang.String str55 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray54);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = toStringBuilder49.append("hi!", (java.lang.Object[]) strArray54);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = toStringBuilder49.append("", (float) (byte) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder61 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray68 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder69 = reflectionToStringBuilder61.append(booleanArray68);
        double[] doubleArray73 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = toStringBuilder69.append("", doubleArray73, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = toStringBuilder69.append("", (double) 10.0f);
        int[] intArray79 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = toStringBuilder69.append(intArray79);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder82 = toStringBuilder69.append(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle83 = toStringBuilder82.getStyle();
        java.lang.String str84 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 100, toStringStyle83);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder85 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder33, toStringStyle83);
        java.lang.String str87 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) "hi!", toStringStyle83, true);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder27);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder46);
        org.junit.Assert.assertNotNull(toStringBuilder49);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(toStringBuilder56);
        org.junit.Assert.assertNotNull(toStringBuilder59);
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray68), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder69);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder75);
        org.junit.Assert.assertNotNull(toStringBuilder78);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder80);
        org.junit.Assert.assertNotNull(toStringBuilder82);
        org.junit.Assert.assertNotNull(toStringStyle83);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = null;
        java.lang.String str14 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder1, toStringStyle13);
        boolean boolean15 = reflectionToStringBuilder1.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder1.append((short) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder20.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray30 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = toStringBuilder24.append("", shortArray30, true);
        int[] intArray36 = new int[] { (short) 1, ' ', (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = toStringBuilder32.append(intArray36);
        short[] shortArray45 = new short[] { (byte) 10, (byte) -1, (short) 1, (byte) 100, (byte) -1, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = toStringBuilder37.append("<null>", shortArray45);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = reflectionToStringBuilder1.append("", shortArray45);
        java.lang.String str48 = reflectionToStringBuilder1.build();
        java.lang.Class<?> wildcardClass49 = reflectionToStringBuilder1.getUpToClass();
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 32, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[10, -1, 1, 100, -1, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder46);
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNull(wildcardClass49);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("<null>", (long) (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder18.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.lang.String str27 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray26);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = reflectionToStringBuilder18.setExcludeFieldNames(strArray26);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder28.append("hi!", 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder31.append("hi!", (float) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray44 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = reflectionToStringBuilder37.append(booleanArray44);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = toStringBuilder31.append("", booleanArray44, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = toStringBuilder15.append("<null>", booleanArray44, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = toStringBuilder49.append("", (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder49.append("", (byte) 100);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder45);
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNotNull(toStringBuilder49);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder55);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("<null>", (long) (byte) -1);
        boolean boolean16 = reflectionToStringBuilder1.isAppendStatics();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray25 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder18.append(booleanArray25);
        double[] doubleArray30 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = toStringBuilder26.append("", doubleArray30, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = toStringBuilder26.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle36 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder35, toStringStyle36);
        java.lang.Object obj38 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder40 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = reflectionToStringBuilder40.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.lang.String str49 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray48);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder50 = reflectionToStringBuilder40.setExcludeFieldNames(strArray48);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder53 = reflectionToStringBuilder50.append("hi!", 'a');
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        java.lang.String str59 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray58);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder60 = toStringBuilder53.append("hi!", (java.lang.Object[]) strArray58);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder62 = toStringBuilder60.append((int) (short) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder64 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray71 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder72 = reflectionToStringBuilder64.append(booleanArray71);
        double[] doubleArray76 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = toStringBuilder72.append("", doubleArray76, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder81 = toStringBuilder72.append("", (double) 10.0f);
        int[] intArray82 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder83 = toStringBuilder72.append(intArray82);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder85 = toStringBuilder72.append(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle86 = toStringBuilder85.getStyle();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder87 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder62, toStringStyle86);
        java.lang.String str89 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(obj38, toStringStyle86, false);
        java.lang.String str91 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder35, toStringStyle86, false);
        java.lang.String str93 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1, toStringStyle86, false);
        java.lang.String str94 = reflectionToStringBuilder1.toString();
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(toStringBuilder44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder50);
        org.junit.Assert.assertNotNull(toStringBuilder53);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(toStringBuilder60);
        org.junit.Assert.assertNotNull(toStringBuilder62);
        org.junit.Assert.assertNotNull(booleanArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray71), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder72);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder78);
        org.junit.Assert.assertNotNull(toStringBuilder81);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder83);
        org.junit.Assert.assertNotNull(toStringBuilder85);
        org.junit.Assert.assertNotNull(toStringStyle86);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "<null>" + "'", str89, "<null>");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder7.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray22 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder14.append("hi!", shortArray22, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder7.append("hi!", shortArray22, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = toStringBuilder26.append('#');
        boolean[] booleanArray35 = new boolean[] { false, true, true, true, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder28.append("", booleanArray35);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = reflectionToStringBuilder1.append(booleanArray35);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = toStringBuilder37.append('a');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray50 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder42.append("hi!", doubleArray50, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = reflectionToStringBuilder42.appendToString("<null>");
        java.lang.String str55 = reflectionToStringBuilder42.toString();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder57 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = reflectionToStringBuilder57.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder63 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray71 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = reflectionToStringBuilder63.append("hi!", doubleArray71, true);
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!" };
        java.lang.String str78 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray77);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder79 = reflectionToStringBuilder63.setExcludeFieldNames(strArray77);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = reflectionToStringBuilder57.appendAsObjectToString((java.lang.Object) reflectionToStringBuilder79);
        boolean boolean81 = reflectionToStringBuilder79.isAppendTransients();
        long[] longArray84 = new long[] { 'a' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = reflectionToStringBuilder79.append("hi!", longArray84, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder87 = reflectionToStringBuilder42.append(longArray84);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder88 = toStringBuilder37.append("hi!", longArray84);
        int[] intArray90 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder92 = toStringBuilder88.append("<null>", intArray90, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder95 = toStringBuilder88.append("", (byte) -1);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, true, true, true, true]");
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(toStringBuilder39);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertNotNull(toStringBuilder61);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder73);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder79);
        org.junit.Assert.assertNotNull(toStringBuilder80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[97]");
        org.junit.Assert.assertNotNull(toStringBuilder86);
        org.junit.Assert.assertNotNull(toStringBuilder87);
        org.junit.Assert.assertNotNull(toStringBuilder88);
        org.junit.Assert.assertNotNull(toStringBuilder92);
        org.junit.Assert.assertNotNull(toStringBuilder95);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder1.append("hi!", (float) (byte) 0);
        java.lang.Class<?> wildcardClass15 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder18.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.lang.String str27 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray26);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = reflectionToStringBuilder18.setExcludeFieldNames(strArray26);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder28.append("hi!", 'a');
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.lang.String str37 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray36);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = toStringBuilder31.append("hi!", (java.lang.Object[]) strArray36);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = toStringBuilder31.append("", (float) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = toStringBuilder41.append("hi!", (float) (byte) 10);
        long[] longArray49 = new long[] { 0, 1L, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = toStringBuilder44.append("", longArray49, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder1.append("", longArray49);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = reflectionToStringBuilder1.appendSuper("");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(toStringBuilder38);
        org.junit.Assert.assertNotNull(toStringBuilder41);
        org.junit.Assert.assertNotNull(toStringBuilder44);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[0, 1, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder51);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder54);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = reflectionToStringBuilder1.append("", false);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder23 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray30 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder23.append(booleanArray30);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder20.append("", booleanArray30);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) booleanArray30, toStringStyle33);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder1.append(booleanArray30);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = reflectionToStringBuilder1.append("hi!", (byte) -1);
        boolean boolean39 = reflectionToStringBuilder1.isAppendTransients();
        java.lang.Class<?> wildcardClass40 = reflectionToStringBuilder1.getUpToClass();
        java.lang.String str41 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(toStringBuilder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(wildcardClass40);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        float[] floatArray8 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(floatArray8);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray19 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = reflectionToStringBuilder11.append("hi!", shortArray19, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = toStringBuilder21.append("hi!", (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder27 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder27.append("", 10);
        float[] floatArray34 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder27.append(floatArray34);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder24.append("", floatArray34);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = toStringBuilder9.append(floatArray34);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = toStringBuilder37.append("", true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder43 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray51 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder53 = reflectionToStringBuilder43.append("hi!", doubleArray51, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder56 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = reflectionToStringBuilder56.append("", 10);
        float[] floatArray63 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder56.append(floatArray63);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder66 = reflectionToStringBuilder43.append("", floatArray63, true);
        java.lang.Class<?> wildcardClass67 = reflectionToStringBuilder43.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = reflectionToStringBuilder43.append("hi!", (int) (short) 10);
        boolean boolean71 = reflectionToStringBuilder43.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = toStringBuilder40.append("hi!", (java.lang.Object) boolean71, false);
        java.lang.String str74 = toStringBuilder40.build();
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder53);
        org.junit.Assert.assertNotNull(toStringBuilder59);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(toStringBuilder66);
        org.junit.Assert.assertNull(wildcardClass67);
        org.junit.Assert.assertNotNull(toStringBuilder70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(toStringBuilder73);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder9.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder18, toStringStyle19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder20.append((long) (short) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder25 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray35 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = reflectionToStringBuilder28.append(booleanArray35);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = reflectionToStringBuilder25.append("", booleanArray35);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder39 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) booleanArray35, toStringStyle38);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = toStringBuilder22.append("", booleanArray35);
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = toStringBuilder40.append("<null>", byteArray44);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder46 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder45);
        boolean boolean47 = reflectionToStringBuilder46.isAppendStatics();
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 1]");
        org.junit.Assert.assertNotNull(toStringBuilder45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray21 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(booleanArray21);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = toStringBuilder22.append("", doubleArray26, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = toStringBuilder22.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray41 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder34.append(booleanArray41);
        double[] doubleArray46 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder42.append("", doubleArray46, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = toStringBuilder22.append("", doubleArray46);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = reflectionToStringBuilder1.append("", doubleArray46);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder52 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder52.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        java.lang.String str61 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray60);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder62 = reflectionToStringBuilder52.setExcludeFieldNames(strArray60);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = reflectionToStringBuilder1.append((java.lang.Object[]) strArray60);
        boolean boolean64 = reflectionToStringBuilder1.isAppendTransients();
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder42);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(toStringBuilder49);
        org.junit.Assert.assertNotNull(toStringBuilder50);
        org.junit.Assert.assertNotNull(toStringBuilder56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder62);
        org.junit.Assert.assertNotNull(toStringBuilder63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder9.append("", (double) 10.0f);
        int[] intArray19 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = toStringBuilder9.append(intArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = toStringBuilder9.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = toStringBuilder22.append((double) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder26 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray33 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = reflectionToStringBuilder26.append(booleanArray33);
        double[] doubleArray38 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = toStringBuilder34.append("", doubleArray38, false);
        char[] charArray45 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = toStringBuilder34.append("", charArray45);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = toStringBuilder22.append(charArray45);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder50 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray58 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder60 = reflectionToStringBuilder50.append("hi!", shortArray58, true);
        byte[] byteArray62 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder50.append("", byteArray62, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = toStringBuilder22.append("", byteArray62);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder67 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray74 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = reflectionToStringBuilder67.append(booleanArray74);
        float[] floatArray77 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = reflectionToStringBuilder67.append("hi!", floatArray77);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder81 = reflectionToStringBuilder67.append("<null>", (long) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder84 = reflectionToStringBuilder67.append("<null>", (double) 100L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = toStringBuilder84.append((long) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder87 = toStringBuilder65.append((java.lang.Object) toStringBuilder86);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder40);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4, #, 4]");
        org.junit.Assert.assertNotNull(toStringBuilder46);
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder60);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(toStringBuilder65);
        org.junit.Assert.assertNotNull(booleanArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray74), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder75);
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray77), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder78);
        org.junit.Assert.assertNotNull(toStringBuilder81);
        org.junit.Assert.assertNotNull(toStringBuilder84);
        org.junit.Assert.assertNotNull(toStringBuilder86);
        org.junit.Assert.assertNotNull(toStringBuilder87);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) booleanArray11, toStringStyle14);
        boolean boolean16 = reflectionToStringBuilder15.isAppendStatics();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder19 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder19.append("", 10);
        double[] doubleArray29 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder19.append("", doubleArray29);
        char[] charArray33 = new char[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder30.append("", charArray33);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = toStringBuilder30.append("", (short) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder39 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray47 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = reflectionToStringBuilder39.append("hi!", shortArray47, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = toStringBuilder30.append(shortArray47);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder15.append("", shortArray47, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = reflectionToStringBuilder15.append(false);
        boolean boolean55 = reflectionToStringBuilder15.isAppendTransients();
        java.lang.StringBuffer stringBuffer56 = reflectionToStringBuilder15.getStringBuffer();
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ ]");
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder49);
        org.junit.Assert.assertNotNull(toStringBuilder50);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(stringBuffer56);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray16 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = reflectionToStringBuilder8.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder1.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder1.appendSuper("");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder24 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder24.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.lang.String str33 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray32);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = reflectionToStringBuilder24.setExcludeFieldNames(strArray32);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = reflectionToStringBuilder34.append("hi!", 'a');
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.lang.String str43 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray42);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = toStringBuilder37.append("hi!", (java.lang.Object[]) strArray42);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = toStringBuilder44.append((int) (short) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray55 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder48.append(booleanArray55);
        double[] doubleArray60 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder62 = toStringBuilder56.append("", doubleArray60, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = toStringBuilder56.append("", (double) 10.0f);
        int[] intArray66 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = toStringBuilder56.append(intArray66);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder69 = toStringBuilder56.append(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = toStringBuilder69.getStyle();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder71 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder46, toStringStyle70);
        java.lang.String str72 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder22, toStringStyle70);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder74 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray81 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder82 = reflectionToStringBuilder74.append(booleanArray81);
        float[] floatArray84 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder85 = reflectionToStringBuilder74.append("hi!", floatArray84);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder87 = toStringBuilder85.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder89 = toStringBuilder87.append((int) '#');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle90 = toStringBuilder87.getStyle();
        java.lang.String str91 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder22, toStringStyle90);
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(toStringBuilder44);
        org.junit.Assert.assertNotNull(toStringBuilder46);
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder56);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder62);
        org.junit.Assert.assertNotNull(toStringBuilder65);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder67);
        org.junit.Assert.assertNotNull(toStringBuilder69);
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertNotNull(booleanArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray81), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder82);
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray84), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder85);
        org.junit.Assert.assertNotNull(toStringBuilder87);
        org.junit.Assert.assertNotNull(toStringBuilder89);
        org.junit.Assert.assertNotNull(toStringStyle90);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = null;
        java.lang.String str14 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder1, toStringStyle13);
        int[] intArray15 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = reflectionToStringBuilder1.append(intArray15);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder19 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray26 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder19.append(booleanArray26);
        double[] doubleArray31 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder27.append("", doubleArray31, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder27.append("", (double) 10.0f);
        int[] intArray37 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = toStringBuilder27.append(intArray37);
        char[] charArray40 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = toStringBuilder38.append("", charArray40);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder43 = toStringBuilder38.append((byte) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder45 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray53 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = reflectionToStringBuilder45.append("hi!", doubleArray53, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder57 = reflectionToStringBuilder45.appendToString("<null>");
        java.lang.Object obj58 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder60 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder60.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.lang.String str69 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray68);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder70 = reflectionToStringBuilder60.setExcludeFieldNames(strArray68);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = reflectionToStringBuilder70.append("", (short) (byte) -1);
        java.lang.Class<?> wildcardClass74 = reflectionToStringBuilder70.getUpToClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder76 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = reflectionToStringBuilder76.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "hi!" };
        java.lang.String str85 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray84);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder86 = reflectionToStringBuilder76.setExcludeFieldNames(strArray84);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder87 = reflectionToStringBuilder70.setExcludeFieldNames(strArray84);
        java.lang.String str88 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(obj58, strArray84);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder89 = reflectionToStringBuilder45.setExcludeFieldNames(strArray84);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder90 = toStringBuilder38.append((java.lang.Object[]) strArray84);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder91 = toStringBuilder16.append("hi!", (java.lang.Object[]) strArray84);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder27);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder38);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder41);
        org.junit.Assert.assertNotNull(toStringBuilder43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder55);
        org.junit.Assert.assertNotNull(toStringBuilder57);
        org.junit.Assert.assertNotNull(toStringBuilder64);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder70);
        org.junit.Assert.assertNotNull(toStringBuilder73);
        org.junit.Assert.assertNull(wildcardClass74);
        org.junit.Assert.assertNotNull(toStringBuilder80);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder86);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "<null>" + "'", str88, "<null>");
        org.junit.Assert.assertNotNull(reflectionToStringBuilder89);
        org.junit.Assert.assertNotNull(toStringBuilder90);
        org.junit.Assert.assertNotNull(toStringBuilder91);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append((long) 'a');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray16 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder9.append(booleanArray16);
        double[] doubleArray21 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = toStringBuilder17.append("", doubleArray21, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = toStringBuilder17.append("", (double) 10.0f);
        int[] intArray27 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = toStringBuilder17.append(intArray27);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = toStringBuilder17.append(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = toStringBuilder30.getStyle();
        java.lang.String str33 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder4, toStringStyle31, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = toStringBuilder4.append((int) '#');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray45 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = reflectionToStringBuilder37.append("hi!", doubleArray45, true);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.lang.String str52 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray51);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = reflectionToStringBuilder37.setExcludeFieldNames(strArray51);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder56 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray64 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder66 = reflectionToStringBuilder56.append("hi!", doubleArray64, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = reflectionToStringBuilder53.append("", doubleArray64);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder68 = toStringBuilder35.append(doubleArray64);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(toStringBuilder7);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder23);
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertNotNull(toStringBuilder35);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder53);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder66);
        org.junit.Assert.assertNotNull(toStringBuilder67);
        org.junit.Assert.assertNotNull(toStringBuilder68);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("hi!", 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = toStringBuilder14.append("hi!", (float) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray27 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder20.append(booleanArray27);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = toStringBuilder14.append("", booleanArray27, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder31 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder30);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder33 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray40 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = reflectionToStringBuilder33.append(booleanArray40);
        float[] floatArray43 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = reflectionToStringBuilder33.append("hi!", floatArray43);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = reflectionToStringBuilder33.append("<null>", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = reflectionToStringBuilder33.append(1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder51 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray58 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = reflectionToStringBuilder51.append(booleanArray58);
        double[] doubleArray63 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = toStringBuilder59.append("", doubleArray63, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder68 = toStringBuilder59.append("", (double) 10.0f);
        int[] intArray69 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = toStringBuilder59.append(intArray69);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder72 = toStringBuilder59.append(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle73 = toStringBuilder72.getStyle();
        java.lang.String str75 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder33, toStringStyle73, true);
        java.lang.String str77 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder31, toStringStyle73, true);
        java.lang.String str78 = reflectionToStringBuilder31.toString();
        boolean boolean79 = reflectionToStringBuilder31.isAppendStatics();
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder41);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder44);
        org.junit.Assert.assertNotNull(toStringBuilder47);
        org.junit.Assert.assertNotNull(toStringBuilder49);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder59);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder65);
        org.junit.Assert.assertNotNull(toStringBuilder68);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder70);
        org.junit.Assert.assertNotNull(toStringBuilder72);
        org.junit.Assert.assertNotNull(toStringStyle73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder13 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder13.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.lang.String str22 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray21);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder23 = reflectionToStringBuilder13.setExcludeFieldNames(strArray21);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder23.append("hi!", 'a');
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.lang.String str32 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray31);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder26.append("hi!", (java.lang.Object[]) strArray31);
        java.lang.String str34 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) reflectionToStringBuilder1, strArray31);
        java.lang.String str36 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) reflectionToStringBuilder1, "<null>");
        java.lang.Class<?> wildcardClass37 = reflectionToStringBuilder1.getClass();
        org.junit.Assert.assertNotNull(toStringBuilder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder23);
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        float[] floatArray8 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(floatArray8);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder11.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray21 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = toStringBuilder15.append("", shortArray21, true);
        int[] intArray27 = new int[] { (short) 1, ' ', (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = toStringBuilder23.append(intArray27);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = toStringBuilder9.append((java.lang.Object) toStringBuilder23);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = toStringBuilder29.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder31.append((float) '4');
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder23);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 32, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(toStringBuilder33);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        double[] doubleArray11 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("", doubleArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", (double) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(true);
        long[] longArray22 = new long[] { '#', (byte) -1, 1, (byte) 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = reflectionToStringBuilder1.append(longArray22);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = reflectionToStringBuilder1.append((double) 'a');
        java.lang.String str26 = reflectionToStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder1.append("", 100.0f);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[35, -1, 1, 1]");
        org.junit.Assert.assertNotNull(toStringBuilder23);
        org.junit.Assert.assertNotNull(toStringBuilder25);
        org.junit.Assert.assertNotNull(toStringBuilder29);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = null;
        java.lang.String str14 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder1, toStringStyle13);
        boolean boolean15 = reflectionToStringBuilder1.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder1.append((short) (byte) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder20.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray30 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = toStringBuilder24.append("", shortArray30, true);
        int[] intArray36 = new int[] { (short) 1, ' ', (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = toStringBuilder32.append(intArray36);
        short[] shortArray45 = new short[] { (byte) 10, (byte) -1, (short) 1, (byte) 100, (byte) -1, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = toStringBuilder37.append("<null>", shortArray45);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = reflectionToStringBuilder1.append("", shortArray45);
        java.lang.String str48 = reflectionToStringBuilder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray49 = reflectionToStringBuilder1.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(toStringBuilder17);
        org.junit.Assert.assertNotNull(toStringBuilder24);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 32, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder37);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[10, -1, 1, 100, -1, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder46);
        org.junit.Assert.assertNotNull(toStringBuilder47);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        double[] doubleArray11 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("", doubleArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", (int) (byte) 10);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder17 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = reflectionToStringBuilder17.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.lang.String str26 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray25);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder27 = reflectionToStringBuilder17.setExcludeFieldNames(strArray25);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder27.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder32 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = reflectionToStringBuilder32.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        java.lang.String str41 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray40);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = reflectionToStringBuilder32.setExcludeFieldNames(strArray40);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = reflectionToStringBuilder42.append("hi!", 'a');
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.lang.String str51 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray50);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = toStringBuilder45.append("hi!", (java.lang.Object[]) strArray50);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = reflectionToStringBuilder27.setExcludeFieldNames(strArray50);
        java.lang.String[] strArray54 = reflectionToStringBuilder27.getExcludeFieldNames();
        java.lang.String[] strArray55 = reflectionToStringBuilder27.getExcludeFieldNames();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = toStringBuilder15.append((java.lang.Object[]) strArray55);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder27);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder42);
        org.junit.Assert.assertNotNull(toStringBuilder45);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(toStringBuilder56);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder1.append('4');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder17 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = reflectionToStringBuilder17.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.lang.String str26 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray25);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder27 = reflectionToStringBuilder17.setExcludeFieldNames(strArray25);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder27.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder32 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = reflectionToStringBuilder32.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        java.lang.String str41 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray40);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = reflectionToStringBuilder32.setExcludeFieldNames(strArray40);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = reflectionToStringBuilder42.append("hi!", 'a');
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.lang.String str51 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray50);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = toStringBuilder45.append("hi!", (java.lang.Object[]) strArray50);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = reflectionToStringBuilder27.setExcludeFieldNames(strArray50);
        java.lang.String[] strArray54 = reflectionToStringBuilder27.getExcludeFieldNames();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder27.append((double) (-1.0f));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder59 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = reflectionToStringBuilder59.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray69 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder71 = toStringBuilder63.append("", shortArray69, true);
        int[] intArray75 = new int[] { (short) 1, ' ', (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder76 = toStringBuilder71.append(intArray75);
        short[] shortArray84 = new short[] { (byte) 10, (byte) -1, (short) 1, (byte) 100, (byte) -1, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder85 = toStringBuilder76.append("<null>", shortArray84);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = toStringBuilder56.append("<null>", shortArray84);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder88 = reflectionToStringBuilder1.append("", shortArray84, false);
        java.lang.Object obj90 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder91 = toStringBuilder88.append("hi!", obj90);
        java.lang.Object obj92 = toStringBuilder91.getObject();
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder14);
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder27);
        org.junit.Assert.assertNotNull(toStringBuilder30);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder42);
        org.junit.Assert.assertNotNull(toStringBuilder45);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(toStringBuilder56);
        org.junit.Assert.assertNotNull(toStringBuilder63);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder71);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 32, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder76);
        org.junit.Assert.assertNotNull(shortArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray84), "[10, -1, 1, 100, -1, 0]");
        org.junit.Assert.assertNotNull(toStringBuilder85);
        org.junit.Assert.assertNotNull(toStringBuilder86);
        org.junit.Assert.assertNotNull(toStringBuilder88);
        org.junit.Assert.assertNotNull(toStringBuilder91);
        org.junit.Assert.assertEquals("'" + obj92 + "' != '" + 100.0f + "'", obj92, 100.0f);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = reflectionToStringBuilder1.append("", false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = toStringBuilder16.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = toStringBuilder16.append((long) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = toStringBuilder19.append("", 0L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder25 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder25.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.lang.String str34 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray33);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder35 = reflectionToStringBuilder25.setExcludeFieldNames(strArray33);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = reflectionToStringBuilder35.append("", (short) (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder40 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = reflectionToStringBuilder40.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.lang.String str49 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray48);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder50 = reflectionToStringBuilder40.setExcludeFieldNames(strArray48);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder53 = reflectionToStringBuilder50.append("hi!", 'a');
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        java.lang.String str59 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray58);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder60 = toStringBuilder53.append("hi!", (java.lang.Object[]) strArray58);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder61 = reflectionToStringBuilder35.setExcludeFieldNames(strArray58);
        java.lang.String[] strArray62 = reflectionToStringBuilder61.getExcludeFieldNames();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = toStringBuilder19.append("hi!", (java.lang.Object[]) strArray62, true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(toStringBuilder16);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertNotNull(toStringBuilder19);
        org.junit.Assert.assertNotNull(toStringBuilder22);
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder35);
        org.junit.Assert.assertNotNull(toStringBuilder38);
        org.junit.Assert.assertNotNull(toStringBuilder44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder50);
        org.junit.Assert.assertNotNull(toStringBuilder53);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(toStringBuilder60);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(toStringBuilder64);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append('4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append((byte) 0);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray25 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder18.append(booleanArray25);
        float[] floatArray28 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder18.append("hi!", floatArray28);
        java.lang.String str30 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) floatArray28);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder1.append("", floatArray28);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder31.append("<null>", 0.0f);
        byte[] byteArray36 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = toStringBuilder34.append("hi!", byteArray36);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(toStringBuilder13);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder26);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder29);
        org.junit.Assert.assertNotNull(toStringBuilder31);
        org.junit.Assert.assertNotNull(toStringBuilder34);
        org.junit.Assert.assertNotNull(toStringBuilder37);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder9.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = toStringBuilder18.append((float) 0);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder23 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder23.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.lang.String str32 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray31);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder33 = reflectionToStringBuilder23.setExcludeFieldNames(strArray31);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = reflectionToStringBuilder33.append("hi!", 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = toStringBuilder36.append("hi!", (float) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray49 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = reflectionToStringBuilder42.append(booleanArray49);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = toStringBuilder36.append("", booleanArray49, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder55 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = reflectionToStringBuilder55.append("", 10);
        double[] doubleArray65 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder66 = reflectionToStringBuilder55.append("", doubleArray65);
        char[] charArray69 = new char[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = toStringBuilder66.append("", charArray69);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder72 = toStringBuilder52.append("", charArray69, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder74 = toStringBuilder20.append("hi!", charArray69, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = toStringBuilder74.append("<null>", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = toStringBuilder74.append("", '#');
        int[] intArray84 = new int[] { (byte) -1, (-1) };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = toStringBuilder74.append("hi!", intArray84, true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder18);
        org.junit.Assert.assertNotNull(toStringBuilder20);
        org.junit.Assert.assertNotNull(toStringBuilder27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder33);
        org.junit.Assert.assertNotNull(toStringBuilder36);
        org.junit.Assert.assertNotNull(toStringBuilder39);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder50);
        org.junit.Assert.assertNotNull(toStringBuilder52);
        org.junit.Assert.assertNotNull(toStringBuilder58);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 0.0, 1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder66);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[ ]");
        org.junit.Assert.assertNotNull(toStringBuilder70);
        org.junit.Assert.assertNotNull(toStringBuilder72);
        org.junit.Assert.assertNotNull(toStringBuilder74);
        org.junit.Assert.assertNotNull(toStringBuilder77);
        org.junit.Assert.assertNotNull(toStringBuilder80);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, -1]");
        org.junit.Assert.assertNotNull(toStringBuilder86);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", false);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder1.append((short) (byte) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder21 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = reflectionToStringBuilder21.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.lang.String str30 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray29);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder31 = reflectionToStringBuilder21.setExcludeFieldNames(strArray29);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray41 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder34.append(booleanArray41);
        double[] doubleArray46 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder42.append("", doubleArray46, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = toStringBuilder42.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder54 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray61 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder62 = reflectionToStringBuilder54.append(booleanArray61);
        double[] doubleArray66 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder68 = toStringBuilder62.append("", doubleArray66, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder69 = toStringBuilder42.append("", doubleArray66);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = reflectionToStringBuilder21.append("", doubleArray66);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder72 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder76 = reflectionToStringBuilder72.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "hi!" };
        java.lang.String str81 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray80);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder82 = reflectionToStringBuilder72.setExcludeFieldNames(strArray80);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder83 = reflectionToStringBuilder21.append((java.lang.Object[]) strArray80);
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        java.lang.String str88 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) strArray80, (java.util.Collection<java.lang.String>) strList86);
        java.lang.String str89 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) reflectionToStringBuilder1, (java.util.Collection<java.lang.String>) strList86);
        reflectionToStringBuilder1.setAppendTransients(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder93 = reflectionToStringBuilder1.append((int) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder96 = toStringBuilder93.append("hi!", (float) (short) 0);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder12);
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(toStringBuilder19);
        org.junit.Assert.assertNotNull(toStringBuilder25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder31);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder42);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(toStringBuilder51);
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray61), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder62);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder68);
        org.junit.Assert.assertNotNull(toStringBuilder69);
        org.junit.Assert.assertNotNull(toStringBuilder70);
        org.junit.Assert.assertNotNull(toStringBuilder76);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(reflectionToStringBuilder82);
        org.junit.Assert.assertNotNull(toStringBuilder83);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(toStringBuilder93);
        org.junit.Assert.assertNotNull(toStringBuilder96);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray9 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", shortArray9, true);
        byte[] byteArray13 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("", byteArray13, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray26 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder18.append("hi!", shortArray26, true);
        byte[] byteArray30 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder18.append("", byteArray30, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = reflectionToStringBuilder1.append("hi!", byteArray30);
        double[] doubleArray38 = new double[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = toStringBuilder33.append("", doubleArray38);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder42 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray49 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = reflectionToStringBuilder42.append(booleanArray49);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = toStringBuilder50.append("", doubleArray54, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = toStringBuilder50.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle60 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder61 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder59, toStringStyle60);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = reflectionToStringBuilder61.append((long) (short) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder66 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder69 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray76 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = reflectionToStringBuilder69.append(booleanArray76);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = reflectionToStringBuilder66.append("", booleanArray76);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle79 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder80 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) booleanArray76, toStringStyle79);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder81 = toStringBuilder63.append("", booleanArray76);
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = toStringBuilder81.append("<null>", byteArray85);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder88 = toStringBuilder33.append("", (java.lang.Object) toStringBuilder86, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder91 = toStringBuilder33.append("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[1, 100, -1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(toStringBuilder33);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(toStringBuilder39);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder50);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder56);
        org.junit.Assert.assertNotNull(toStringBuilder59);
        org.junit.Assert.assertNotNull(toStringBuilder63);
        org.junit.Assert.assertNotNull(booleanArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray76), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder77);
        org.junit.Assert.assertNotNull(toStringBuilder78);
        org.junit.Assert.assertNotNull(toStringBuilder81);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[1, 1]");
        org.junit.Assert.assertNotNull(toStringBuilder86);
        org.junit.Assert.assertNotNull(toStringBuilder88);
        org.junit.Assert.assertNotNull(toStringBuilder91);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder4);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray14 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder7.append(booleanArray14);
        double[] doubleArray19 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder15.append("", doubleArray19, false);
        char[] charArray26 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = toStringBuilder15.append("", charArray26);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder5.append(charArray26);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder30 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder30.append(true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray41 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder34.append(booleanArray41);
        double[] doubleArray46 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder42.append("", doubleArray46, false);
        char[] charArray53 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = toStringBuilder42.append("", charArray53);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder57 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray64 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = reflectionToStringBuilder57.append(booleanArray64);
        float[] floatArray67 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder68 = reflectionToStringBuilder57.append("hi!", floatArray67);
        java.lang.String str69 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) floatArray67);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder71 = toStringBuilder42.append("hi!", floatArray67, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder72 = reflectionToStringBuilder30.append(floatArray67);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = toStringBuilder28.append((java.lang.Object) floatArray67);
        java.lang.String str74 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder4);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder21);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, #, 4]");
        org.junit.Assert.assertNotNull(toStringBuilder27);
        org.junit.Assert.assertNotNull(toStringBuilder28);
        org.junit.Assert.assertNotNull(toStringBuilder32);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder42);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(toStringBuilder48);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[4, #, 4]");
        org.junit.Assert.assertNotNull(toStringBuilder54);
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray64), "[true, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(toStringBuilder65);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[]");
        org.junit.Assert.assertNotNull(toStringBuilder68);
        org.junit.Assert.assertNotNull(toStringBuilder71);
        org.junit.Assert.assertNotNull(toStringBuilder72);
        org.junit.Assert.assertNotNull(toStringBuilder73);
    }
}

