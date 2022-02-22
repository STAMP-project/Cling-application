import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1L));
        float[] floatArray10 = new float[] { (byte) 10 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, (float) 35, (-1));
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (byte) 100);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray21, (float) (byte) -1);
        java.lang.Float[] floatArray31 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray31, 1.0f);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray24, floatArray33);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.clone(floatArray33);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hihiH", 244);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihiH" + "'", str2, "hihiH");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) 'a', 0);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 0, (int) ' ');
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 10);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(intArray4, 27);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) '4');
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, 14);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray4);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 52, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 52, 10, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 10, 52, -1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        java.lang.Boolean[] booleanArray28 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray28, false);
        java.lang.Long[] longArray37 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray37);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray37, (java.lang.Object) (short) 100);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray28, (java.lang.Object) longArray37);
        java.lang.Long[] longArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray37);
        java.lang.Long[] longArray43 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray37);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray43);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray23, longArray44);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray44);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.subarray(longArray44, 33, 96);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray44, (long) 37);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "h       HIHIHh  h", (java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "h       HIHIHh  h" + "'", charSequence2, "h       HIHIHh  h");
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                     aaaa1aaaa                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa1aaaa" + "'", str1, "aaaa1aaaa");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                 aAAAa                                                                                               aaaaaA", "                                                               AaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaAAAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaa                                                                                               AaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (short) 1);
        long[] longArray14 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) (short) 1);
        long[] longArray20 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(longArray20, (long) ' ');
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray16, longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray20);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray20, (long) '#', (int) (short) 100);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray20, 1L);
        long[] longArray35 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.add(longArray35, (long) (short) 1);
        long[] longArray43 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray45 = org.apache.commons.lang3.ArrayUtils.add(longArray43, (long) (short) 1);
        long[] longArray49 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.contains(longArray49, (long) ' ');
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.addAll(longArray45, longArray49);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray35, longArray49);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray35);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray54);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.subarray(longArray55, (int) (short) -1, 0);
        java.lang.Long[] longArray59 = org.apache.commons.lang3.ArrayUtils.toObject(longArray58);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray20, longArray58);
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray58);
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray58, 0L);
        java.lang.Long[] longArray64 = org.apache.commons.lang3.ArrayUtils.toObject(longArray58);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.contains(longArray58, (long) 1);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("10110010aa", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10110010aa                               " + "'", str2, "10110010aa                               ");
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "...feurteslafeslaf");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaa                                                        HIHIH                              ", "                                                                                                   ", "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa--------------------------------------------------------HIHIH------------------------------" + "'", str3, "aaa--------------------------------------------------------HIHIH------------------------------");
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                     aaaa1aaaa                     ", "              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       aaaa1aaaa       " + "'", str2, "       aaaa1aaaa       ");
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       aaa       aaa       aaa       aaa       aaa       aaa       aaa       aaa       aaa" + "'", str1, "       aaa       aaa       aaa       aaa       aaa       aaa       aaa       aaa       aaa");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17, (short) (byte) 1);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17, (short) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 10, 0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "           ...           ...           ...           ...           ...           ...           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                           AAA     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           AAA     " + "'", str1, "                           AAA     ");
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "IH", (java.lang.CharSequence) "{0.0,1.0,100.0,10.0,10.0,-1.0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("100", "                                 ", 6);
        long[] longArray9 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (long) (short) 1);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray9);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray12, (long) 42, 27);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) 27, 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 1, 3);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 0);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) -1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(intArray5, (int) '#');
        java.lang.Integer[] intArray13 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10, 1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        long[] longArray9 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (long) (short) 1);
        long[] longArray17 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.add(longArray17, (long) (short) 1);
        long[] longArray23 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(longArray23, (long) ' ');
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.addAll(longArray19, longArray23);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.addAll(longArray9, longArray23);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray9);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray28);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.subarray(longArray29, (int) (short) -1, 0);
        java.lang.Long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toObject(longArray32);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33, (long) (byte) 100);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray2, (java.lang.Object) longArray33);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 17);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 1.0]");
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "                                                                aaa                                 ", (int) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                 AAA                                                                                               aaaA", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                              HIHIH", strArray5);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aitrueaaah", 5, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aa" + "'", str3, "101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aa");
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, 13, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray8);
        float[] floatArray11 = new float[] { (byte) 10 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (int) (short) 0, (float) (short) -1);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray17, (float) (byte) -1);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray17);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray17, (float) 10L);
        float[] floatArray24 = new float[] { (byte) 10 };
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) (-1));
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray24, 0.0f, 100);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray24, (float) 0L);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray31, 10, (int) (byte) 10);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.clone(floatArray34);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray17, floatArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray36);
        java.lang.Float[] floatArray41 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray41);
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray42, (float) 100L);
        float[] floatArray46 = new float[] { (byte) 10 };
        float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.add(floatArray46, (float) (-1));
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray46, 0.0f, 100);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray46, (float) 0L);
        float[] floatArray56 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray53, 10, (int) (byte) 10);
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray53, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray59, (float) (short) 10);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray44, floatArray61);
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.add(floatArray61, (float) 13);
        float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray36, floatArray61);
        int int67 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray36, (float) (short) 10);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[13.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, (double) 0L);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 aaa                                                            aaaA", "true");
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) "                                 aaa                                                            aaaA", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray25, (long) 0);
        double[] doubleArray29 = new double[] { 1.0f };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray29);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray29, (int) (short) 10, (int) ' ');
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray27, (java.lang.Object) doubleArray29);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray27);
        long[] longArray41 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.add(longArray41, (long) (short) 1);
        long[] longArray49 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.add(longArray49, (long) (short) 1);
        long[] longArray55 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.contains(longArray55, (long) ' ');
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.addAll(longArray51, longArray55);
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.addAll(longArray41, longArray55);
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray55);
        java.lang.Long[] longArray61 = org.apache.commons.lang3.ArrayUtils.toObject(longArray55);
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray61);
        long[] longArray63 = org.apache.commons.lang3.ArrayUtils.addAll(longArray27, longArray62);
        java.lang.Long[] longArray64 = org.apache.commons.lang3.ArrayUtils.toObject(longArray63);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray64);
        java.lang.Class<?> wildcardClass66 = longArray64.getClass();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[97, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        byte[][][] byteArray0 = new byte[][][] {};
        double[] doubleArray4 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) 100);
        byte[][][] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (java.lang.Object) 100);
        byte[][][] byteArray10 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) ' ', (int) (short) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray0, (java.lang.Object) "aaa");
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        byte[][] byteArray19 = new byte[][] { byteArray18 };
        byte[][] byteArray20 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray19);
        byte[][][] byteArray21 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, byteArray20);
        java.io.Serializable[][] serializableArray22 = org.apache.commons.lang3.ArrayUtils.clone((java.io.Serializable[][]) byteArray21);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       aAA", "hi");
        byte[][][] byteArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (java.lang.Object) "       aAA");
        java.lang.Object[] objArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) byteArray21);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, -1, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(serializableArray22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[[[1, 0, -1, 0, 100]]]");
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("{-1.0,10.0,35.0}", "{-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...  4444444444444444444444444...  {-1.0,1...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray13);
        java.lang.Short[] shortArray17 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17, (short) 1);
        short[] shortArray26 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray26, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray26);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray19, shortArray26);
        java.lang.Short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray31);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32, (short) (byte) 0);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.add(shortArray34, (short) 0);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray34);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray13, shortArray34);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, (short) 10);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray40, (short) -1);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray42, (short) (byte) 1, 32);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, 0, 10, 1, 10, 0, 1, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, 0, 10, 1, 10, 0, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 0, 10, 1, 10, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 6 + "'", int45 == 6);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) -1);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray10, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, 1.0d);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, 0.0d, 1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0                                  ", "      aaa        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("eslafeurteurteurteslafeslafeurteslafeslaf", 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("------------aaa----------------------------------1.0", "-11001011000-11001011000-11001011000-11 aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11001011000-11001011000-11001011000-11 aa" + "'", str2, "11001011000-11001011000-11001011000-11 aa");
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", '#');
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray11, (short) (byte) -1);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray11, (short) (byte) 1);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) (byte) 1);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray20);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray4, (java.lang.Object) shortArray20);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "{-1,10,0,10,1,10,0,0}", 4);
        java.lang.String[] strArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray27);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.endsWithAny("falsefalsetruefalsefalsetruetruetruefalse", strArray28);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("{}", strArray4, strArray28);
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...a");
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaA", "{-1,-1,0}");
        boolean boolean38 = org.apache.commons.lang3.StringUtils.endsWithAny("hi...", strArray37);
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                             aaaA", "hi...", (int) (byte) -1);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray42, ' ');
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                  AAA       ", strArray37, strArray42);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.replaceEach("            hI             ", strArray32, strArray37);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "                             aaaA" + "'", str44, "                             aaaA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "                  AAA       " + "'", str45, "                  AAA       ");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "            hI             " + "'", str46, "            hI             ");
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                              AAA                              {#,4}                                                              AAA                              {#,4}                                                              AAA                              ", "aAAA1## AAAA1 ##1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444hiaaaaaaaa", "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0", "  10110010aa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444hiaaaaaaaa" + "'", str3, "44444444hiaaaaaaaa");
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                         HIHIH10     HIHIH0                                         ", "0.01a0.1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         HIHIH10     HIHIH0                                         " + "'", str2, "                                         HIHIH10     HIHIH0                                         ");
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray0 = new org.apache.commons.lang3.ArrayUtils[] {};
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray1 = new org.apache.commons.lang3.ArrayUtils[] {};
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray2 = new org.apache.commons.lang3.ArrayUtils[] {};
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray3 = new org.apache.commons.lang3.ArrayUtils[] {};
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray4 = new org.apache.commons.lang3.ArrayUtils[] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray5 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray0, arrayUtilsArray1, arrayUtilsArray2, arrayUtilsArray3, arrayUtilsArray4 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray6 = org.apache.commons.lang3.ArrayUtils.clone(arrayUtilsArray5);
        java.lang.Byte[] byteArray12 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray12, ' ');
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        java.lang.String str18 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray12, "10.0a1.");
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(arrayUtilsArray6, (java.lang.Object) "10.0a1.");
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray20 = org.apache.commons.lang3.ArrayUtils.clone(arrayUtilsArray6);
        org.junit.Assert.assertNotNull(arrayUtilsArray0);
        org.junit.Assert.assertNotNull(arrayUtilsArray1);
        org.junit.Assert.assertNotNull(arrayUtilsArray2);
        org.junit.Assert.assertNotNull(arrayUtilsArray3);
        org.junit.Assert.assertNotNull(arrayUtilsArray4);
        org.junit.Assert.assertNotNull(arrayUtilsArray5);
        org.junit.Assert.assertNotNull(arrayUtilsArray6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1 0 1 100 1" + "'", str15, "-1 0 1 100 1");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{-1,0,1,100,1}" + "'", str18, "{-1,0,1,100,1}");
        org.junit.Assert.assertNotNull(arrayUtilsArray19);
        org.junit.Assert.assertNotNull(arrayUtilsArray20);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       AAA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aAAaaahihi...aAAaaah...", strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, (float) (short) 100);
        java.lang.Float[] floatArray23 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray23, 1.0f);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray25);
        float[] floatArray28 = new float[] { (byte) 10 };
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray28, (float) (-1));
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray28);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (int) (short) 0, (float) (short) -1);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray34, (float) (byte) -1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray34);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray34, (float) 10L);
        float[] floatArray41 = new float[] { (byte) 10 };
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray41, (float) (-1));
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray41, 0.0f, 100);
        float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray41, (float) 0L);
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray48, 10, (int) (byte) 10);
        float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.clone(floatArray51);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray34, floatArray52);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray25, floatArray53);
        java.lang.Float[] floatArray58 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray58);
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray59, (float) 100L);
        float[] floatArray63 = new float[] { (byte) 10 };
        float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.add(floatArray63, (float) (-1));
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray63, 0.0f, 100);
        float[] floatArray70 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray63, (float) 0L);
        float[] floatArray73 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray70, 10, (int) (byte) 10);
        float[] floatArray76 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray70, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray78 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray76, (float) (short) 10);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray61, floatArray78);
        float[] floatArray81 = org.apache.commons.lang3.ArrayUtils.add(floatArray78, (float) 13);
        float[] floatArray82 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray53, floatArray78);
        float[] floatArray83 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray78);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray85 = org.apache.commons.lang3.ArrayUtils.remove(floatArray78, 139);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 139, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[]");
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[]");
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray78), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[13.0]");
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray83), "[]");
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("{0,10,10,0,0,-1,10,0,10,1,10,0,0}", "             aaA001Aaaa                            aaA1Aaaa                            aaA0Aaaa           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, '#');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, 'a', (-1));
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray10, ' ');
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, ' ', 2);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("falsefalsetruetruefalsetrue44444444444444444444444444444444444444", (int) 'a', "                                                                                              aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                falsefalsetruetruefalsetrue44444444444444444444444444444444444444" + "'", str3, "                                falsefalsetruetruefalsetrue44444444444444444444444444444444444444");
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("{3}", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}" + "'", str2, "{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}");
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                        aaa1.0a0." + "'", str1, "1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                        aaa1.0a0.");
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("{true,true,true,f lse}  ", "aaahihi#..                                                                     4444444444444444444444444...   ", 859, 23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{true,true,true,f lse} aaahihi#..                                                                     4444444444444444444444444...   " + "'", str4, "{true,true,true,f lse} aaahihi#..                                                                     4444444444444444444444444...   ");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.subarray(strArray2, (int) 'a', (int) '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!HI", "                                                                 AAA                                                                                               aaa");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("       AAA", strArray2, strArray8);
        float[] floatArray15 = new float[] { (-1L), 1.0f, 0L, 1, '#' };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray15);
        java.lang.Float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray8, (java.lang.Object[]) floatArray17);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray17, (float) 3);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray17);
        java.lang.Float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray17);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "       AAA" + "'", str9, "       AAA");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0, 1.0, 0.0, 1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0, 1.0, 0.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, 1.0, 0.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray22);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "101101100 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101101100 1" + "'", str1, "101101100 1");
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "  4444444444444444444444444...  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        java.lang.Byte[] byteArray3 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) 100 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray3, (byte) 1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100]");
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI", "true4true4true4false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI" + "'", str2, "HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI");
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 347, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                           " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("{Aaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{Aaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa}" + "'", str1, "{Aaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa}");
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                 aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 aAAAa                                                                                               aaaaaA" + "'", str1, "                                 aAAAa                                                                                               aaaaaA");
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) 10, 35);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray27);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray32);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray36, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray36);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray36);
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray41, (byte) 100, 0);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray32, byteArray41);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray32);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray32, (byte) 10);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray32, 432, 0);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray21, byteArray32);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("  4444444444444444444444444...   ", strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 28 + "'", int4 == 28);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...", "                                                                                                    ");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray16, 2, (short) 100);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.remove(shortArray16, 2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 10, 100, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 10, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0.0-------------------------------------------------");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray25, (int) (short) -1, 0);
        java.lang.Long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toObject(longArray28);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray29, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray29, "                                                                           ", 16, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("97 1 100 0 -1 -1 0", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       97 1 100 0 -1 -1 0" + "'", str2, "       97 1 100 0 -1 -1 0");
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) 0L);
        double[] doubleArray5 = new double[] {};
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) '4', (double) (byte) -1);
        double[] doubleArray13 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray13);
        double[] doubleArray20 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray20);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.add(doubleArray20, 1, (double) 0.0f);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray20);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 445, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray4, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 38, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".0a1.aaahaaahaaahaaahaaahaaaha", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "true4true4true4false");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".0a1.aaahaaahaaahaaahaaahaaaha" + "'", str3, ".0a1.aaahaaahaaahaaahaaahaaaha");
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        char[] charArray4 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray4, '4');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray4);
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                             ", charArray11);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6, (byte) -1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray8);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                  aaahihi#..    ", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("-152101-1521010", "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("a#a444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A#A444" + "'", str1, "A#A444");
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray16);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray16);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray18, (int) (short) 1);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray22, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.add(booleanArray22, 94, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 94, Length: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str17, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray8);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("            hI             ", 17, 871);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!H", "10.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA52.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA100.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        java.lang.Long[] longArray22 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray23);
        long[] longArray30 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.add(longArray30, (long) (short) 1);
        long[] longArray38 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.add(longArray38, (long) (short) 1);
        long[] longArray44 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(longArray44, (long) ' ');
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray44);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.addAll(longArray30, longArray44);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray30);
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray49);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray50, (long) 0);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray52);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.add(longArray53, 0L);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray55);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, -1, -1, 1, 0, 100, 1, 0, 97, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[100, 1, -1, 0, 1, 0, 97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[100, 1, -1, 0, 1, 0, 97, 1, 100, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) -1);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.clone(longArray26);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray27, (long) 57);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(longArray27, (long) 52);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0, -1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 0, 1, 100, 0, -1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("h aaahihi...", "truetruetruefalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, 1, (double) 0.0f);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray15, (double) 1.0f, (double) 19);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray15, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 36, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("true4true4true4false", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("10.0A1.10.0A1.10.0A1.10.0A1.10HI...", "      aaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("-1{-1,-1,0}11{-1,-1,0}{-1,-1,0}1{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444                                AAA444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1{-1,-1,0}11{-1,-1,0}{-1,-1,0}1{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "-1{-1,-1,0}11{-1,-1,0}{-1,-1,0}1{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, (int) (byte) 1, false);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray12);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444444444444444444444444444 AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "00101100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444 AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444444444444444444444444 AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1L));
        float[] floatArray10 = new float[] { (byte) 10 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray12);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, 35, 1);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray19);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray19, (float) 32);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, (int) (byte) 100, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (-1));
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray5);
        int[] intArray11 = new int[] { (-1), '4', (byte) 10, 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray11, (int) (short) 100, 100);
        int[] intArray15 = new int[] {};
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray15, (int) (short) 1);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.subarray(intArray15, (int) (short) 0, (int) (short) -1);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray11, intArray15);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray11, 0);
        int[] intArray24 = new int[] {};
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, (int) (short) 1);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray24, 100);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray24, (int) '#', 0);
        int[] intArray36 = new int[] { (-1), '4', (byte) 10, 1 };
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray36, (int) (short) 100, 100);
        int[] intArray40 = new int[] {};
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray40, (int) (short) 1);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.subarray(intArray40, (int) (short) 0, (int) (short) -1);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray36, intArray40);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.add(intArray36, 0);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray36, (int) 'a', 0);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.addAll(intArray24, intArray36);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray23, intArray24);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray23);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray23);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 52, 10, 1, 0]");
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HIHIH                                                        aaa##################", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHIH", strArray4, strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("1.0A0.0                              hihih                                                      ...", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("{0,10,10,0,0,-1,10,0,10,1,10,0,0}", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HIHIH" + "'", str6, "HIHIH");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA0Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA100Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1" + "'", str8, "-1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA0Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA100Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray37 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.add(longArray37, (long) (short) 1);
        long[] longArray43 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(longArray43, (long) ' ');
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.addAll(longArray39, longArray43);
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray43);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray43);
        java.lang.Long[] longArray49 = org.apache.commons.lang3.ArrayUtils.toObject(longArray43);
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray49);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray19, longArray50);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.subarray(longArray50, (int) (short) -1, 0);
        java.lang.Long[] longArray55 = org.apache.commons.lang3.ArrayUtils.toObject(longArray54);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray54, (long) 3);
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.add(longArray54, (long) 26);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[26]");
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray14, (byte) 0);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(byteArray14, (byte) -1);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray14, (byte) 0);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray21);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.clone(byteArray7);
        java.lang.Byte[] byteArray29 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray29);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray30, (byte) 0);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray30);
        java.lang.Byte[] byteArray39 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray39);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.add(byteArray40, (byte) 0);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray42);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray33, byteArray42);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.clone(byteArray44);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray44, (byte) -1, 0);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray44, (byte) -1, (int) (short) -1);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray44);
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 1 };
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray55, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray55);
        byte[] byteArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray55);
        byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray60);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray64, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray68 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray64);
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray64);
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray69, (byte) 100, 0);
        byte[] byteArray73 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray60, byteArray69);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray73, (byte) 10);
        byte[] byteArray78 = org.apache.commons.lang3.ArrayUtils.add(byteArray73, (int) (byte) 0, (byte) 0);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray78);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray78);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        java.lang.Float[] floatArray16 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, 1.0f);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16);
        java.lang.Float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray16);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray22, (float) (short) 0);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray25);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray25, (float) 4);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, 10.0, 10.0, 100.0, 1.0, 0.0, -1.0, 52.0, 2.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0, 10.0, 10.0, 100.0, 1.0, -1.0, 52.0, 2.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, 10.0, 10.0, 100.0, 1.0, -1.0, 52.0, 2.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.remove(longArray23, (int) (short) 1);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray23);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.add(longArray23, (long) (short) 0);
        long[] longArray29 = null;
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray29);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray23, (long) (short) 1, 99);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(longArray23, (long) 43);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 0, 1, 100, 0, -1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaA", 0, "                aAA         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaA" + "'", str3, "aaaaaaA");
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (-1));
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        int[] intArray12 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray13 = org.apache.commons.lang3.ArrayUtils.toObject(intArray12);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray13, (int) (byte) 0);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = org.apache.commons.lang3.ArrayUtils.add(intArray16, 96, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 96, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 10, 1, 1, 0]");
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 100);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 10);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray19, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray19);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray19);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray24);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray28, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray28);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray28);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 100, 0);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray24, byteArray33);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.remove(byteArray37, (int) (byte) 1);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 1 };
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray42, (byte) -1, (int) 'a');
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray42);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray42, (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray48);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray48, (byte) 1, 35);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray39, byteArray48);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray8, byteArray48);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.remove(byteArray48, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[10, 10, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, 1, (byte) 0);
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.clone(byteArray14);
        java.lang.Byte[] byteArray21 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray21);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.add(byteArray22, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray22);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray22);
        java.lang.Byte[] byteArray32 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray32);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.add(byteArray33, (byte) 0);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray33);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray22, byteArray37);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray41, (byte) -1, (int) 'a');
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray22, byteArray41);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains(byteArray41, (byte) 10);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.remove(byteArray15, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah", "aAAA1## AAAA1 ##1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0     HIHIH0     HIHIH10    {}", "  ...ihihaaa 11-00011010011-00011010011-00011010011-", 57);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap4 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '0     HIHIH0     HIHIH10    {}', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aAAaaahihi... aAAaaahihi... aAAaaaa                  ...... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAA", "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, 'a');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, ' ');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, 'a');
        java.lang.Integer[][][][][] intArray17 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][] intArray20 = org.apache.commons.lang3.ArrayUtils.subarray(intArray17, 139, 96);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) charArray9, (java.lang.Object) 96);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 94);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.add(intArray18, 516);
        int[] intArray25 = new int[] { (-1), '4', (byte) 10, 1 };
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray25, (int) (short) 100, 100);
        int[] intArray29 = new int[] {};
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray29, (int) (short) 1);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.subarray(intArray29, (int) (short) 0, (int) (short) -1);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray25, intArray29);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.add(intArray25, 0);
        int[] intArray38 = new int[] {};
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray38, (int) (short) 1);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray38, 100);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray38, (int) '#', 0);
        int[] intArray50 = new int[] { (-1), '4', (byte) 10, 1 };
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray50, (int) (short) 100, 100);
        int[] intArray54 = new int[] {};
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray54, (int) (short) 1);
        int[] intArray59 = org.apache.commons.lang3.ArrayUtils.subarray(intArray54, (int) (short) 0, (int) (short) -1);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray50, intArray54);
        int[] intArray62 = org.apache.commons.lang3.ArrayUtils.add(intArray50, 0);
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray50, (int) 'a', 0);
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.addAll(intArray38, intArray50);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray37, intArray38);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray37);
        java.lang.String str70 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray37, "                                                                AAA                                 ");
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray20, intArray37);
        int int72 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) intArray20);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 52, 10, 1, 94]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 52, 10, 1, 94, 516]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "{-1,52,10,1,0}" + "'", str70, "{-1,52,10,1,0}");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 6 + "'", int72 == 6);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray1, "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrAAArrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "", 405);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaa-1,52,10,1}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0.0--------------------0.00.0--------------------0.00.0--------------------0.0110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray21, "0");
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray21);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray24, false);
        double[] doubleArray28 = new double[] { 1 };
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray28, 0.0d);
        double[] doubleArray34 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray34, (double) 100);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray34, (double) 10L);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray38, 100.0d, 0);
        java.lang.Short[] shortArray44 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray44, (short) 1);
        short[] shortArray53 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray53, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray53);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray46, shortArray53);
        java.lang.Short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray58);
        java.lang.Short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray59);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray59);
        short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.remove(shortArray61, 2);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) doubleArray38, (java.lang.Object) 2);
        double[] doubleArray65 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray38);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray28, doubleArray65);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) booleanArray24, (java.lang.Object) doubleArray28);
        boolean[] booleanArray68 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "false0false0true0true0false0true" + "'", str23, "false0false0true0true0false0true");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray68), "[false, false, true, true, false, true]");
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 0);
        java.lang.Byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("Aaa                            aaaA", (java.lang.Object[]) byteArray10);
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray10);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) 0);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray17, (byte) 0);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray22, (byte) -1, (int) 'a');
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray22);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.clone(byteArray22);
        java.lang.Byte[] byteArray33 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray33);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.add(byteArray34, (byte) 0);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray34);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(byteArray34, (byte) -1);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray34, (byte) 0);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray27, byteArray41);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.clone(byteArray27);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.clone(byteArray27);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray17, byteArray27);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray27, 11, 69);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1" + "'", str14, "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[10, 1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Aaa444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaa4444444444-1a10a0a10a1a10a0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi", "hihi...                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi...                  " + "'", str2, "hihi...                  ");
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, 'a');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12, '#');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray15);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4, a]");
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15, (short) 1);
        short[] shortArray24 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray24, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray24);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray17, shortArray24);
        java.lang.Short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray29);
        java.lang.Short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray30);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.add(shortArray32, (short) 0);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray32);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray32);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.add(shortArray36, (short) 10);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray38);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HIHIH10     HIHIH0", "      A      A", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "444444444hihi...", (java.lang.CharSequence) "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444444hihi..." + "'", charSequence2, "444444444hihi...");
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0     HIHIH0     HIHIH10    {}444444444444444444444444444444444444444444444444444444444444444", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0     HIHIH0     HIHIH10    {}444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "0     HIHIH0     HIHIH10    {}444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAa", "          A#A444          {-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAa" + "'", str2, "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAa");
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " aaahihi... ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray14);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, 2, (short) (byte) 0);
        short[] shortArray20 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, (-1));
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) -1);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) 1);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray27, (short) (byte) 1, (int) ' ');
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, (short) 0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray32);
        java.lang.Short[] shortArray36 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36, (short) 1);
        short[] shortArray45 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray45, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray45);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray38, shortArray45);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray38, (short) 10);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray38);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray38);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray38, (short) (byte) -1);
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.clone(shortArray38);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.contains(shortArray57, (short) 10);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[10]");
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[10, -1]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        long[] longArray31 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray31, (long) (short) 1);
        long[] longArray37 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(longArray37, (long) ' ');
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray37);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray33);
        long[] longArray47 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.add(longArray47, (long) (short) 1);
        long[] longArray55 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.add(longArray55, (long) (short) 1);
        long[] longArray61 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(longArray61, (long) ' ');
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.addAll(longArray57, longArray61);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.addAll(longArray47, longArray61);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray47);
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray66);
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.subarray(longArray67, (int) (short) -1, 0);
        long[] longArray71 = org.apache.commons.lang3.ArrayUtils.addAll(longArray41, longArray67);
        int int73 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray41, (long) 24);
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.subarray(longArray41, (int) (short) 10, 2);
        java.lang.Long[] longArray77 = org.apache.commons.lang3.ArrayUtils.toObject(longArray41);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.subarray(longArray41, 93, 42);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[]");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("{-1,-1,0}", (int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA{1,100,1,-1} aaaA", ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA{1,100,1,-1} aaaA" + "'", str2, "AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA{1,100,1,-1} aaaA");
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "{1  ,1,-1, ,1, ,97, ,1,1  , ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        char[] charArray3 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 8, (int) ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, '#', 65);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 10.0f, (int) '4');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 1.0f };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray16);
        double[] doubleArray18 = new double[] {};
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray16, doubleArray18);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.add(doubleArray16, (double) (short) -1);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray16);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.add(doubleArray16, (double) 3);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray24, 10, (int) (byte) 10);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 10.0f, (double) 0L);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (double) 14);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.add(doubleArray32, 0.0d);
        java.lang.Double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray32);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray32);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray36, (double) 14, (double) 106);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray36, (double) 405, 7, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        byte[][][][][][] byteArray0 = null;
        byte[][][][][][] byteArray1 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                aaa                                 ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("10.041.0", strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", '#');
        short[] shortArray15 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray15, (short) (byte) 0, (-1));
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, (short) (byte) -1);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, (short) (byte) 1);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray22, (short) (byte) 1);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray24);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray8, (java.lang.Object) shortArray24);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1      AAAA1      AAAA1", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1      AAAA1      AAAA1" + "'", str27, "1      AAAA1      AAAA1");
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIHIH                                                        aaa##################", "                     aaaa1aaaa                     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("false", 3, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "se" + "'", str3, "se");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hihi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "101101011010110               aaahihi#..101101011010110", "{{{              1110               ,100,                              HIHIH}},{{              1110               ,100,                              HIHIH}}}", 23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#####...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        int[] intArray4 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray7);
        int[] intArray20 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, 100);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray20);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(intArray20, (int) (byte) 10);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray20);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.addAll(intArray15, intArray20);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray15, 2);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray15);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray31);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 1, 35, 10, 100, 1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 1, 35, 10]");
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray16);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray16);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray18, (int) (short) 1);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray18);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray18, true);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray18);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str17, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, true, false, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray7);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (float) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (byte) 10, 27);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray12);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray12, (float) 1L);
        float[] floatArray20 = new float[] { (byte) 10 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (-1));
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) '4');
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray22);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(floatArray22, (float) 99);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray22);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray22, (int) '#', 25);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) (short) 0);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray18, floatArray22);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[10.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray17 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray17, 'a');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, '#');
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray21, '4', (int) (byte) 10);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray10, charArray21);
        java.lang.Character[] charArray26 = org.apache.commons.lang3.ArrayUtils.toObject(charArray21);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray26, 'a');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, a, 4]");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0.1----------------------------------AAA----------------------------------------------------------------0.01---------------------------------AAA----------------------------------------------------------------0.01---------------------------------AAA----------------------------------------------------------------0.001---------------------------------AAA----------------------------------------------------------------0.1---------------------------------AAA----------------------------------------------------------------0.0", "   h                                                             ", 799);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("a                            hihi...                             #                            hihi...                             a                            hihi...                             4                            hihi...                             4                            hihi...                             4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a                            hihi...                             #                            hihi...                             a                            hihi...                             4                            hihi...                             4                            hihi...                             4" + "'", str1, "a                            hihi...                             #                            hihi...                             a                            hihi...                             4                            hihi...                             4                            hihi...                             4");
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1L));
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(floatArray9, (float) 28);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 3, 7, 28, 10 };
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 57, 165);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray9, 97, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[3, 7, 28, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[3, 7, 28, 10]");
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("{-1,0,1,100,1,0}", 0, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{-1,0,1,100,1,0}" + "'", str3, "{-1,0,1,100,1,0}");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAA1      AAAA", "trueaaahitrueaaahitrueaaahifalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA1      AAAA" + "'", str2, "AAAA1      AAAA");
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        char[] charArray1 = null;
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        java.lang.Character[] charArray17 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17, '4');
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray17);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray21);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.addAll(charArray10, charArray21);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray1, charArray24);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "trueaaahitrueaaahitrueaaahifalse", charArray25);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.add(charArray25, ' ');
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.subarray(charArray25, 19, 8);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray25, '4');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 aa4a444a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 aa4a444a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a,  ]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("... AA-11001011000-11001011000-11001011000-11 AAAHIHI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... aa-11001011000-11001011000-11001011000-11 aaahihi..." + "'", str1, "... aa-11001011000-11001011000-11001011000-11 aaahihi...");
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        java.lang.String[] strArray3 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray7 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray11 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray3, strArray7, strArray11 };
        java.lang.String[][] strArray13 = org.apache.commons.lang3.ArrayUtils.toArray(strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa", strArray18);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aAA");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("AAA                                                                                               aaaA", strArray18, strArray21);
        java.lang.Comparable<java.lang.String>[][] strComparableArray23 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.Comparable<java.lang.String>[][]) strArray12, (java.lang.Object) strArray18);
        boolean[] booleanArray30 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray37 = new boolean[] { false, false, true, true, false, true };
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray30, booleanArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray30);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray30, true, (int) '#');
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) booleanArray30, 33);
        java.lang.Integer[][][][][] intArray45 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][] intArray48 = org.apache.commons.lang3.ArrayUtils.subarray(intArray45, 139, 96);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray12, (java.lang.Object) intArray48);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AAA                                                                                               aaaA" + "'", str22, "AAA                                                                                               aaaA");
        org.junit.Assert.assertNotNull(strComparableArray23);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!H", "AAHIAAHIAAHIAAHIAAHIAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!H" + "'", str2, "Hi!H");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444AAAA1-1.0AAAA1AAAA110.01AAAA1AAAA110.01AAAA1AAAA1100.01AAAA1AAAA11.01AAAA10.01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444AAAA1-1.0AAAA1AAAA110.01AAAA1AAAA110.01AAAA1AAAA1100.01AAAA1AAAA11.01AAAA10.01" + "'", str1, "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444AAAA1-1.0AAAA1AAAA110.01AAAA1AAAA110.01AAAA1AAAA1100.01AAAA1AAAA11.01AAAA10.01");
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     HIHIH", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", (int) (byte) 1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaA", "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", 33);
        java.lang.String[] strArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444                                AAA44444444hi", strArray4, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 17, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "44444444444444444444444444444                                AAA44444444hi" + "'", str10, "44444444444444444444444444444                                AAA44444444hi");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih");
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("{-1,0,1,100,1}", "{{7,99,2,1000,10},{7,99,2,1000,10},{7,99,2,1000,10},{7,99,2,1000,10},{}}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,0,1,100,1}" + "'", str2, "{-1,0,1,100,1}");
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        float[] floatArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                             {}                                              ", "{1,100,1,-1}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             {}                                              " + "'", str2, "                                             {}                                              ");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray13);
        java.lang.Short[] shortArray17 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17, (short) 1);
        short[] shortArray26 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray26, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray26);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray19, shortArray26);
        java.lang.Short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray31);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32, (short) (byte) 0);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.add(shortArray34, (short) 0);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray34);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray13, shortArray34);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, (short) 10);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray40, (short) -1);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray42, (short) 1, 859);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, 0, 10, 1, 10, 0, 1, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, 0, 10, 1, 10, 0, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 0, 10, 1, 10, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray22 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray29 = new boolean[] { false, false, true, true, false, true };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray22);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray22, true, (int) '#');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray22);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray22, true);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray37, true);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray37);
        boolean[] booleanArray47 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray54 = new boolean[] { false, false, true, true, false, true };
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray47, booleanArray54);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray54, false);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray54, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray54);
        boolean[] booleanArray63 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray54, false);
        java.lang.Boolean[] booleanArray64 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray63);
        boolean[] booleanArray65 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray40, booleanArray63);
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray63, true, 0);
        boolean[] booleanArray75 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray82 = new boolean[] { false, false, true, true, false, true };
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray75, booleanArray82);
        boolean[] booleanArray84 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray82);
        int int87 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray84, false, 93);
        int int89 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray84, true);
        boolean[] booleanArray90 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray84);
        int int92 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray90, true);
        boolean[] booleanArray93 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray63, booleanArray90);
        int int95 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray63, true);
        boolean boolean96 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray63);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertNotNull(booleanArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray65), "[false, false, false, true, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(booleanArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray75), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray82), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(booleanArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray84), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 4 + "'", int87 == 4);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 5 + "'", int89 == 5);
        org.junit.Assert.assertNotNull(booleanArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray90), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 5 + "'", int92 == 5);
        org.junit.Assert.assertNotNull(booleanArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray93), "[false, true, true, false, true, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        boolean[] booleanArray5 = new boolean[] { true, false, false, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false, 1000);
        boolean[] booleanArray17 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray22 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray22, false);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray17, booleanArray24);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.add(booleanArray17, (int) (short) 1, false);
        float[] floatArray33 = new float[] { (byte) 10 };
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.add(floatArray33, (float) (-1));
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.add(floatArray35, (float) '4');
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) booleanArray31, (java.lang.Object) '4');
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray31, false);
        java.lang.Boolean[] booleanArray45 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray45, false);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray47);
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray47);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray49);
        boolean[] booleanArray57 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray64 = new boolean[] { false, false, true, true, false, true };
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray57, booleanArray64);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray64, false);
        int int70 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray64, false, (int) (short) 0);
        boolean[] booleanArray71 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray49, booleanArray64);
        int int74 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray71, false, 13);
        boolean[] booleanArray75 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray71);
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray31, booleanArray71);
        boolean[] booleanArray77 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray31);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray80 = org.apache.commons.lang3.ArrayUtils.add(booleanArray31, 8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray57), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray64), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(booleanArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray71), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(booleanArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray75), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(booleanArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray77), "[true, false, false, true, false, false, false, false, true, false, false]");
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray9, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      AAAA1      AAA", charArray14);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.subarray(charArray14, (int) (short) 1, 18);
        java.lang.Character[] charArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray22, '#');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray22, 'a');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray26);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("IH", charArray14);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) (-1));
        double[] doubleArray13 = new double[] {};
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (double) '4', (double) (byte) -1);
        double[] doubleArray21 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray13, doubleArray21);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 100, (double) 100);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray13, 0, 0);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray8, doubleArray13);
        java.lang.Double[] doubleArray32 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray32);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33, (double) 0L);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray29, doubleArray35);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray35, (-1.0d), (double) 10);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aAAaaahihi...aAAaaah...", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAaaahihi...aAAaaah..." + "'", str2, "aAAaaahihi...aAAaaah...");
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaa  aaaa10aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        int[] intArray0 = new int[] {};
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray4 = new int[] {};
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (int) (short) 1);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (-1));
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 27);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray4);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 3, 7, 28, 10 };
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray19, 57, 165);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray19);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray19);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[3, 7, 28, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[3, 7, 28, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) (byte) -1);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("      aaaA", "truetruetruefalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaA" + "'", str2, "      aaaA");
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10, (float) (byte) 100);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10);
        java.lang.Float[] floatArray21 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray21, 1.0f);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray21);
        java.lang.Float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray25, (float) (byte) 10);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray27);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray28, (float) 168);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray28, 0.0f, 0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAAA1-1.0AAAA1AAAA110.01AAAA1AAAA110.01AAAA1AAAA1100.01AAAA1AAAA11.01AAAA10.01", 0, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA1-1.0AAAA1AAAA1" + "'", str3, "AAAA1-1.0AAAA1AAAA1");
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("   {0,10,1,1,0}", "aaa                        hi!Haaa                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   {0,10,1,1,0}" + "'", str2, "   {0,10,1,1,0}");
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("{100,1,-1,0,1,0}", "       aaa                  ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{100,1,-1,0,1,0}" + "'", str3, "{100,1,-1,0,1,0}");
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA" + "'", str1, "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Hi", "Aa", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi" + "'", str3, "Hi");
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaha", "{35.0,0.0,100.0}", "Hihih 1 1HihihHihih 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaha" + "'", str3, "aaha");
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 0, 100);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 27, (int) (byte) 10);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, 100);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray0);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 209, 25);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      aaa        ", "                                                              AAA                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      aaa        " + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      aaa        ");
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0                                  ", "aaa                            aaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0.1-444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.01444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.01444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.001444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.1444444444444444444444444444444444aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaahihi#..");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                                        ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("{ ,4, ,a,a,4}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{ ,4, ,a,a,4}" + "'", str1, "{ ,4, ,a,a,4}");
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("###,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaaaaaaaaaaaa", "      aaaa            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (-1));
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray5);
        int[] intArray11 = new int[] { (-1), '4', (byte) 10, 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray11, (int) (short) 100, 100);
        int[] intArray15 = new int[] {};
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray15, (int) (short) 1);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.subarray(intArray15, (int) (short) 0, (int) (short) -1);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray11, intArray15);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray11, 0);
        int[] intArray24 = new int[] {};
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, (int) (short) 1);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray24, 100);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray24, (int) '#', 0);
        int[] intArray36 = new int[] { (-1), '4', (byte) 10, 1 };
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray36, (int) (short) 100, 100);
        int[] intArray40 = new int[] {};
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray40, (int) (short) 1);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.subarray(intArray40, (int) (short) 0, (int) (short) -1);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray36, intArray40);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.add(intArray36, 0);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray36, (int) 'a', 0);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.addAll(intArray24, intArray36);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray23, intArray24);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray23);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray55);
        int[] intArray57 = null;
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray56, intArray57);
        int[] intArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray56, (int) '#');
        int[] intArray63 = org.apache.commons.lang3.ArrayUtils.subarray(intArray56, (int) ' ', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray65 = org.apache.commons.lang3.ArrayUtils.remove(intArray63, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 51, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray23 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, (-1));
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray23);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray27, (int) 'a', 100);
        java.lang.Short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray30);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[]");
        org.junit.Assert.assertNotNull(shortArray31);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Aaa444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("{1  ,1,-1, ,1, ,97, ,1,1  , }                             ", "{35.0,0.0,100.0}", "AAa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        float[] floatArray6 = new float[] { 10.0f, (-1.0f), 10, ' ', (short) 10, 1L };
        float[] floatArray13 = new float[] { 10.0f, (-1.0f), 10, ' ', (short) 10, 1L };
        float[] floatArray20 = new float[] { 10.0f, (-1.0f), 10, ' ', (short) 10, 1L };
        float[] floatArray27 = new float[] { 10.0f, (-1.0f), 10, ' ', (short) 10, 1L };
        float[][] floatArray28 = new float[][] { floatArray6, floatArray13, floatArray20, floatArray27 };
        float[][] floatArray29 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray28);
        float[] floatArray36 = new float[] { 10.0f, (-1.0f), 10, ' ', (short) 10, 1L };
        float[] floatArray43 = new float[] { 10.0f, (-1.0f), 10, ' ', (short) 10, 1L };
        float[] floatArray50 = new float[] { 10.0f, (-1.0f), 10, ' ', (short) 10, 1L };
        float[] floatArray57 = new float[] { 10.0f, (-1.0f), 10, ' ', (short) 10, 1L };
        float[][] floatArray58 = new float[][] { floatArray36, floatArray43, floatArray50, floatArray57 };
        float[][] floatArray59 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray58);
        float[][] floatArray60 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray28, floatArray58);
        java.lang.Object obj61 = null;
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) floatArray60, obj61);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, -1.0, 10.0, 32.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0, 10.0, 32.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, -1.0, 10.0, 32.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, -1.0, 10.0, 32.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0, -1.0, 10.0, 32.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0, -1.0, 10.0, 32.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[10.0, -1.0, 10.0, 32.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[10.0, -1.0, 10.0, 32.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0.0A                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0A                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "0.0A                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1" + "'", str1, "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1");
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "                                                                aaa                                 ", (int) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10, (short) 1);
        short[] shortArray19 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray19);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray12, shortArray19);
        java.lang.Short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray24);
        java.lang.Short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray25);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.remove(shortArray27, 2);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray27);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray30);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray30);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) shortArray30);
        boolean boolean34 = org.apache.commons.lang3.StringUtils.startsWithAny("                                             aaa                                 ", strArray5);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("      1       ", strArray5, strArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 393");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi...", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      a444#a       ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("################################################################################################", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", (int) (byte) 10);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1      aaaa1      aaaa10", "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("2.052.0-1.0", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2.052.0-1.0" + "'", str8, "2.052.0-1.0");
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaa-1,52,10,1}", "-1Aaa                                                                   aAAAa                                                                                               aaaaaA            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaa-1,52,10,1}" + "'", str3, "aaaaaaaaaaaaaaaa-1,52,10,1}");
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("-1a10a0a10a1a10a0a", "1A10A0A0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaa                  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HIHIH                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", 58);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("aaa                            aaaA", "falsefalsetruefalsefalsetruetruetruefalse");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("              ", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 8 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("  hihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray11);
        char[] charArray19 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 'a');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, '#');
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray12, charArray23);
        java.lang.Character[] charArray32 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray32, '4');
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray32);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray32);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray36);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray36, 'a', (int) (short) 10);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray36, '4');
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.addAll(charArray23, charArray42);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray46 = org.apache.commons.lang3.ArrayUtils.add(charArray42, 57, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 57, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "##4a# 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "##4a# 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, #, 4, a, #,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "44a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "44a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), " 4 aa444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), " 4 aa444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ , 4,  , a, a, 4, 4, 4, a, #, a]");
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("a#a444 4 aa4a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a4aa 4 444a#a" + "'", str1, "a4aa 4 444a#a");
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) (byte) 100, 8);
        java.lang.Short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray19);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray23);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 10, 0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "#######################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 10);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaahihi... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1110", "       aAA", (-1));
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 27, (int) (byte) 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa", strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aAA");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("AAA                                                                                               aaaA", strArray14, strArray17);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        java.lang.String[] strArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray14);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("       AAA", strArray4, strArray14);
        java.lang.Byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray22, "aaaA");
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22, (byte) 0);
        java.lang.Byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray22);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray14, (java.lang.Object) byteArray22, 7);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AAA                                                                                               aaaA" + "'", str18, "AAA                                                                                               aaaA");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "       AAA" + "'", str21, "       AAA");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("{-1,52,10,1}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI!4HI! HI!AHI!AHI!4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 A1.0a0.0HIHIHaaa1.0a0.0HIHIHaaa1.0a0.0", "true,true,false}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 A1.0a0.0HIHIHaaa1.0a0.0HIHIHaaa1.0a0.0" + "'", str2, "11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 A1.0a0.0HIHIHaaa1.0a0.0HIHIHaaa1.0a0.0");
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray20);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray20, 1000, 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, 859, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 859, Length: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 1, 100, 1, 0, -1, 1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaa", "                                                                                              aaa", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaa" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaa");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false", (java.lang.CharSequence) "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("FALSE4FALSE4TRUE4TRUE4FALSE4TRUE...", 115);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) '#', 0);
        int[] intArray12 = new int[] { (-1), '4', (byte) 10, 1 };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, (int) (short) 100, 100);
        int[] intArray16 = new int[] {};
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray16, (int) (short) 1);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.subarray(intArray16, (int) (short) 0, (int) (short) -1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray12, intArray16);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.add(intArray12, 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, (int) 'a', 0);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray12);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, (int) ' ', 6);
        int[] intArray32 = new int[] {};
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.clone(intArray32);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.clone(intArray32);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.clone(intArray32);
        int[] intArray36 = new int[] {};
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray36, (int) (short) 1);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray36, (-1));
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray36);
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray36, 27);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.addAll(intArray32, intArray36);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray44);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray48 = org.apache.commons.lang3.ArrayUtils.add(intArray44, 73, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 73, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 52, 10, 1]");
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                  AAA       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "                                                   #");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("true", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                 AaaaA                                                                                               AAAAAaEAAAHFALSE", 209, 432);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 209");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0" + "'", str4, "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                        ", 17, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                        " + "'", str3, "                                                                                                                                                                                                        ");
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 100L);
        float[] floatArray8 = new float[] { (byte) 10 };
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (-1));
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, 0.0f, 100);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray8, (float) 0L);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, 10, (int) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray21, (float) (short) 10);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray23);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) 13);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray23);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray23, (float) 8);
        java.lang.Float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray23);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[13.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertNotNull(floatArray30);
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 106, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("         1A10A0A0", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        java.lang.Long[] longArray25 = org.apache.commons.lang3.ArrayUtils.toObject(longArray19);
        java.lang.Long[] longArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray26, (long) 19);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray30 = org.apache.commons.lang3.ArrayUtils.remove(longArray28, 445);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 445, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1, 0]");
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("      AAAA1      A", "0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAA1      A" + "'", str2, "      AAAA1      A");
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray5, (double) 10L);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aa", "a                            hihi...                             #                            hihi...                             a                            hihi...                             4                            hihi...                             4                            hihi...                             4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray16, (byte) 100, 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray16);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, (int) (short) 10, (int) (byte) 100);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, 52, 7);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, 6, 10);
        java.lang.Byte[] byteArray35 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray35);
        java.lang.Byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray35);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray35, (byte) -1);
        java.lang.Object[] objArray40 = null;
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray35, objArray40);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray35, (byte) 100);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray43, (byte) 0);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray43);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray43);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray16, byteArray43);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.add(byteArray43, (byte) 100);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray43, (byte) 100, 24);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray43);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, 1, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) 0);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, false);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray18, 0, 11);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, true, false, false]");
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(" Hihih 1 1HihihHihih 1", "111.0111100.011110.011110.01", 799);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 0, (short) 1, (short) 0, (short) 0 };
        java.lang.Short[][] shortArray5 = new java.lang.Short[][] { shortArray4 };
        java.lang.Short[][][] shortArray6 = new java.lang.Short[][][] { shortArray5 };
        java.lang.Short[][][] shortArray7 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray6);
        java.lang.Short[][][] shortArray8 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray6);
        java.lang.Class<?> wildcardClass9 = shortArray8.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray9);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray9);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray11, 'a');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray11, '#');
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("{a,#,a,4,4,4}", (java.lang.Object[]) charArray11);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "a{a,#,a,4,4,4}#{a,#,a,4,4,4}a{a,#,a,4,4,4}4{a,#,a,4,4,4}4{a,#,a,4,4,4}4" + "'", str17, "a{a,#,a,4,4,4}#{a,#,a,4,4,4}a{a,#,a,4,4,4}4{a,#,a,4,4,4}4{a,#,a,4,4,4}4");
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                 aaa", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "", 2, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str4, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray14);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray14, 42, (int) (short) 10);
        java.lang.Boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray14);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) (short) -1);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray26);
        int int30 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                aaa                                 ", strArray26);
        long[] longArray36 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.add(longArray36, (long) (short) 1);
        long[] longArray44 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.add(longArray44, (long) (short) 1);
        long[] longArray50 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.contains(longArray50, (long) ' ');
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray46, longArray50);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.addAll(longArray36, longArray50);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray36);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray55);
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray56);
        java.lang.Long[] longArray58 = org.apache.commons.lang3.ArrayUtils.toObject(longArray56);
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) longArray58, (int) (short) 100);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray26);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) booleanArray22, (java.lang.Object) strArray26);
        boolean boolean63 = org.apache.commons.lang3.StringUtils.startsWithAny("-,-,-", strArray26);
        java.lang.String[] strArray64 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray26);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strArray64);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Long[] longArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        java.lang.Long[] longArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray20);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] {};
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray22, 35);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray22, 3);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray20, (java.lang.Object) intArray22);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1001-1010" + "'", str21, "1001-1010");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15, (short) 1);
        short[] shortArray24 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray24, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray24);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray17, shortArray24);
        java.lang.Short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray29);
        java.lang.Short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray30);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.add(shortArray32, (short) 0);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray32);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray32);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray36, (short) 100, (int) (byte) -1);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray36, 32, 69);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[]");
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        java.lang.CharSequence charSequence0 = null;
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray12);
        char[] charArray20 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray20, 'a');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray20, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(charArray20, 'a');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.addAll(charArray12, charArray20);
        char[] charArray33 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray34 = org.apache.commons.lang3.ArrayUtils.toObject(charArray33);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray33, '4');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.clone(charArray33);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray37);
        int int39 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               HIHIH               ", charArray38);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray38);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray40);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.addAll(charArray28, charArray40);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray28);
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray43, ' ');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "a#a444 4 aa44# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "a#a444 4 aa44# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4, 4, #,  ]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "a#a4444 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "a#a4444 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[a, #, a, 4, 4, 4, 4,  , a, a, 4]");
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444", "2.052.0-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        long[] longArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                       AAa                          0.0       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 94 + "'", int1 == 94);
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaa                        hi!Haaa                        ", "###########################################################################################     ###h", "-1-110010110000-110010110001-11001011000100-110010110001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa                        hi!Haaa                        " + "'", str3, "aaa                        hi!Haaa                        ");
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###########################################################################################     ###h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################################################################     ###H" + "'", str1, "###########################################################################################     ###H");
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray7, (byte) 0);
        java.lang.Byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray10, "-11001011000");
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) 100);
        int[] intArray20 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.toObject(intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray22, (int) (short) 1);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray22, (-1));
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(intArray22, 0);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray22);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.addAll(intArray20, intArray22);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(intArray22, (int) (short) 0);
        java.lang.Integer[] intArray33 = org.apache.commons.lang3.ArrayUtils.toObject(intArray22);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray10, (java.lang.Object[]) intArray33);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1-110010110000-110010110001-11001011000100-110010110001" + "'", str12, "-1-110010110000-110010110001-11001011000100-110010110001");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        float[] floatArray0 = null;
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, 142, 99);
        org.junit.Assert.assertNull(floatArray3);
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.clone(longArray7);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 17);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray13 = org.apache.commons.lang3.ArrayUtils.remove(longArray8, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 93, 93, 33, 93, 94, 3 };
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray8, 209);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[93, 93, 33, 93, 94, 3]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[93, 93, 33, 93, 94, 3, 209]");
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi...", "10.01.0                                                                                                   ");
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, true);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray13);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray24, true, 6);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray24, true);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray24, true);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray11, (byte) 1, (int) (short) 10);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (int) (byte) 0, (byte) -1);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray20);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 100);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray11, byteArray20);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) charArray10, (java.lang.Object) byteArray20);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        java.lang.Character[][][][][] charArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray15 = new char[] { '4', ' ', ' ' };
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray15);
        java.lang.Character[] charArray23 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray23, '4');
        java.lang.Character[] charArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray26);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray26);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray26, '#');
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray26);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray31);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray31, '#');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4, 4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " 4 aa4a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " 4 aa4a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , 4,  , a, a, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        char[] charArray2 = new char[] { ' ', '#' };
        char[] charArray5 = new char[] { ' ', '#' };
        char[] charArray8 = new char[] { ' ', '#' };
        char[] charArray11 = new char[] { ' ', '#' };
        char[][] charArray12 = new char[][] { charArray2, charArray5, charArray8, charArray11 };
        // The following exception was thrown during execution in test generation
        try {
            char[][] charArray14 = org.apache.commons.lang3.ArrayUtils.remove(charArray12, 164);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 164, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , #]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #]");
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) 42, 27);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray8);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray8);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444444444444444444444444444444444444444", "IH", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#", "hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("{0,0,10,1,10,0,1,0}", "aaahihi...", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        char[] charArray1 = null;
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        java.lang.Character[] charArray17 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17, '4');
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray17);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray21);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.addAll(charArray10, charArray21);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray1, charArray24);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "trueaaahitrueaaahitrueaaahifalse", charArray25);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.add(charArray25, ' ');
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray28);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 aa4a444a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 aa4a444a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0" + "'", str1, "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        long[] longArray0 = null;
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray7, (java.lang.Object) (short) 100);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray12);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (long) 6);
        int[] intArray20 = new int[] { (-1), '4', (byte) 10, 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, (int) (short) 100, 100);
        int[] intArray24 = new int[] {};
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, (int) (short) 1);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.subarray(intArray24, (int) (short) 0, (int) (short) -1);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray20, intArray24);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray24, (int) ' ', 10);
        java.lang.Integer[] intArray34 = org.apache.commons.lang3.ArrayUtils.toObject(intArray24);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray34);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray34, 35);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.subarray(intArray37, (int) (short) 100, (int) '4');
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.add(intArray37, (int) '#');
        int[] intArray47 = new int[] { (-1), '4', (byte) 10, 1 };
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray47, (int) (short) 100, 100);
        int[] intArray51 = new int[] {};
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray51, (int) (short) 1);
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.subarray(intArray51, (int) (short) 0, (int) (short) -1);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray47, intArray51);
        int[] intArray59 = org.apache.commons.lang3.ArrayUtils.add(intArray47, 0);
        int[] intArray61 = org.apache.commons.lang3.ArrayUtils.add(intArray47, 94);
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray47, (int) (byte) -1);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray42, intArray47);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray15, (java.lang.Object) intArray47);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[6]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[35]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 52, 10, 1, 94]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '4', 'a' };
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2, 'a');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray5, 859, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 859, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a]");
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, (int) (short) 0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 10);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.clone(byteArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) -1, (int) 'a');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray15);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.remove(byteArray15, 1);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) 0);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray11, byteArray21);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray11, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 10, 10]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 10]");
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...              false4fa...", "1000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray1, (int) 'a', 3);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.clone(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0404104141040");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404104141040" + "'", str1, "0404104141040");
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("trueaaa                                                                                             ", "    aAAaaahihi... aAAaaah...    ", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray5, ' ');
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray5, "10.0a1.");
        java.lang.Byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 0);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 0 1 100 1" + "'", str8, "-1 0 1 100 1");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{-1,0,1,100,1}" + "'", str11, "{-1,0,1,100,1}");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = new double[] {};
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 3, (double) 1L);
        double[] doubleArray12 = new double[] {};
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, (double) '4', (double) (byte) -1);
        double[] doubleArray20 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray8, doubleArray20);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (double) 100L);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray7, doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray8, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray8, (byte) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray8, (byte) 0);
        java.lang.Byte[] byteArray18 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.add(byteArray19, (byte) 0);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray19);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(byteArray19, (byte) -1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray19, (byte) 0);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray26);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray26, (byte) 0);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.add(byteArray29, (byte) 0);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, 516, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 516, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, -1, 1, 100, 1, 0]");
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "HIHIH");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 96);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0.0--------------------0.0       0.0--------------------0.0       0.0--------------------0.0       110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "aahi", 19);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        int[] intArray4 = new int[] {};
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (int) (short) 1);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) '#', 0);
        int[] intArray16 = new int[] { (-1), '4', (byte) 10, 1 };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, (int) (short) 100, 100);
        int[] intArray20 = new int[] {};
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray20, (int) (short) 1);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.subarray(intArray20, (int) (short) 0, (int) (short) -1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray16, intArray20);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.add(intArray16, 0);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray16, (int) 'a', 0);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray16);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray2, (java.lang.Object) intArray32);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, 516, 3);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray32, 3, 98);
        java.lang.Integer[] intArray40 = org.apache.commons.lang3.ArrayUtils.toObject(intArray32);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) shortArray17, (java.lang.Object[]) strArray20);
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17, (short) (byte) 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray24, (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray13, false);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray22);
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray23);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) -1, (int) 'a');
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray27, (byte) 10);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.add(byteArray33, (byte) -1);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray33, (int) (short) -1, 0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray41, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray41);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray45, (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray47);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray33, byteArray47);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.contains(byteArray47, (byte) 100);
        byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray47);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(byteArray47, (byte) 0);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray23, (java.lang.Object) byteArray47);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}", (java.lang.CharSequence) "-1-10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 226 + "'", int2 == 226);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(intArray4, (-1));
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.add(intArray4, (int) (byte) 1, 100);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray19);
        int[] intArray26 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray27 = org.apache.commons.lang3.ArrayUtils.toObject(intArray26);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, (int) (byte) 0);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.subarray(intArray29, 9, (-1));
        int[] intArray37 = new int[] { (-1), '4', (byte) 10, 1 };
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray37, (int) (short) 100, 100);
        int[] intArray41 = new int[] {};
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray41, (int) (short) 1);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.subarray(intArray41, (int) (short) 0, (int) (short) -1);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray37, intArray41);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.add(intArray37, 0);
        int[] intArray50 = new int[] {};
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray50, (int) (short) 1);
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray50, 100);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray50, (int) '#', 0);
        int[] intArray62 = new int[] { (-1), '4', (byte) 10, 1 };
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray62, (int) (short) 100, 100);
        int[] intArray66 = new int[] {};
        int[] intArray68 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray66, (int) (short) 1);
        int[] intArray71 = org.apache.commons.lang3.ArrayUtils.subarray(intArray66, (int) (short) 0, (int) (short) -1);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray62, intArray66);
        int[] intArray74 = org.apache.commons.lang3.ArrayUtils.add(intArray62, 0);
        int int77 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray62, (int) 'a', 0);
        int[] intArray78 = org.apache.commons.lang3.ArrayUtils.addAll(intArray50, intArray62);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray49, intArray50);
        int[] intArray81 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray50, 35);
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.contains(intArray50, 35);
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray29, intArray50);
        int[] intArray87 = org.apache.commons.lang3.ArrayUtils.subarray(intArray50, 1, (int) 'a');
        int[] intArray88 = org.apache.commons.lang3.ArrayUtils.addAll(intArray20, intArray87);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 100, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 100, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1, 100, 52, 10, 1]");
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444" + "'", str1, "aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahi", "AAAA1      AAAA", 5);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", (java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.CharSequence[]) strArray4, 516);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 516, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aahi" + "'", str5, "aahi");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                      4!iha!iha!ih !ih4!ih                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAa", "1.0a0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0a0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0a0", "       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiAAA                                                                                               aaaAhihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi1      aaaA1      aaaA10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA", "                      hi!4hi! hi!ahi!ahi!4                      ", 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaahi######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaahi######################" + "'", str1, "aaahi######################");
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        java.lang.reflect.Type[][][] typeArray0 = null;
        java.lang.reflect.Type[][][] typeArray1 = org.apache.commons.lang3.ArrayUtils.toArray(typeArray0);
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 1, (int) (short) 10);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) (byte) 0, (byte) -1);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray9);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray9, (byte) 100);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray9);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray9);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray21, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray21);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray25, (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 0, 10);
        java.lang.Byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray27);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray9, byteArray27);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!ih", "                                                                                              aaa", 4);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray40, (byte) -1, (int) 'a');
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray40, (byte) 10);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray40);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.add(byteArray46, (byte) -1);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray46, (int) (short) -1, 0);
        java.lang.Byte[] byteArray57 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray57);
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray46, byteArray58);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray37, (java.lang.Object) byteArray58, 24);
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray58, (byte) 100);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray27, byteArray58);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[10, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, (int) ' ', 0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray17);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray17, 57, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 57, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("00-------------------------------------------------", "-1.0                                                                                                    5.0                                                                                                    100.0                                                                                                    -1.0                                                                                                    1.0                                                                                                    10.0                                                                                                    0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        float[] floatArray0 = new float[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#####...", 12, "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    #####..." + "'", str3, "    #####...");
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,", "..ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaaH.ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) (byte) -1, "                                                               AaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaAAAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaa                                                                                               AaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.subarray(charArray11, 8, 5);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...     aAA       aAA       aAA       a...", charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray16);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[][] shortArray12 = new java.lang.Short[][] { shortArray3, shortArray7, shortArray11 };
        java.lang.Short[][] shortArray13 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray12);
        float[] floatArray15 = new float[] { (byte) 10 };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, (float) (-1));
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) '4');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray19);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(floatArray19, (float) 10);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray19, 10.0f, (int) (byte) 10);
        java.lang.Short[][] shortArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (java.lang.Object) floatArray19);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.clone(floatArray19);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray27, (float) 57, 65);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAa", 165);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("h  ", (java.lang.Object[]) charArray7);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '#');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ah  #h  ah  4h  4h  4" + "'", str11, "ah  #h  ah  4h  4h  4");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{-1.0,10.0}", "{true,false,false,f   h", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "       AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 0.0d, 10.0d };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray4 = new double[] {};
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) '4', (double) (byte) -1);
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        double[] doubleArray19 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray19);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray19);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.add(doubleArray19, 1, (double) 0.0f);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 0.0f, 8);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 22, 24);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 10.0, -1.0, 0.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ", "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        java.lang.Long[] longArray22 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray23);
        long[] longArray30 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.add(longArray30, (long) (short) 1);
        long[] longArray38 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.add(longArray38, (long) (short) 1);
        long[] longArray44 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(longArray44, (long) ' ');
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray44);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.addAll(longArray30, longArray44);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray30);
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray49);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray50, (long) 0);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray52);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.clone(longArray53);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.remove(longArray53, 0);
        java.lang.Long[] longArray57 = org.apache.commons.lang3.ArrayUtils.toObject(longArray56);
        java.lang.Long[] longArray58 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray57);
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray58);
        java.lang.Long[] longArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray58);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, -1, -1, 1, 0, 100, 1, 0, 97, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[100, 1, -1, 0, 1, 0, 97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[100, 1, -1, 0, 1, 0, 97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[1, -1, 0, 1, 0, 97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[1, -1, 0, 1, 0, 97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray60);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1", "{}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hiaaaaaaaa", "aaa");
        float[] floatArray4 = new float[] { (-1L) };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) 100);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray2, (java.lang.Object) floatArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("              aaa        ", 4, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "-1a10a0.0-------------------------------------------------", "", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  HIHIH", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HIHIH " + "'", str2, "  HIHIH ");
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 19);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 6, (int) (byte) 10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        java.lang.Float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(floatArray12, (float) 1000);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "                                                                aaa                                 ", (int) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("1.0A0.0                              hihih                                                      ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0" + "'", str3, "############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0");
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1 0 1 100 1", "aaaA");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(byteArray17, (byte) 10);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray2, byteArray20);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray20);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1, (int) (byte) -1);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(byteArray20, (byte) -1);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hihih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", (int) (short) 0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, false, 35);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray14);
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray25, false);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  aahaA", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0.0       ", "{100,1,-1,0,1,0,97,0,1,100,0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{100,1,-1,0,1,0,97,0,1,100,0}" + "'", str2, "{100,1,-1,0,1,0,97,0,1,100,0}");
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", " aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aitrueaaah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("{hihih}", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{hihih}" + "'", str2, "{hihih}");
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HIHI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHI..." + "'", str1, "HIHI...");
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, 2, (short) (byte) 0);
        short[] shortArray20 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, (-1));
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) -1);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) 1);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray27, (short) (byte) 1, (int) ' ');
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, (short) 0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray32);
        java.lang.Short[] shortArray36 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36, (short) 1);
        short[] shortArray45 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray45, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray45);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray38, shortArray45);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray38, (short) 10);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray38);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.clone(shortArray38);
        long[] longArray60 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.add(longArray60, (long) (short) 1);
        long[] longArray68 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.add(longArray68, (long) (short) 1);
        long[] longArray74 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.contains(longArray74, (long) ' ');
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.addAll(longArray70, longArray74);
        long[] longArray78 = org.apache.commons.lang3.ArrayUtils.addAll(longArray60, longArray74);
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray74);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray79);
        int int83 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray79, (long) 516, (int) ' ');
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) shortArray38, (java.lang.Object) 516);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[0, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, 100);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, (int) '#', 0);
        int[] intArray19 = new int[] { (-1), '4', (byte) 10, 1 };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray19, (int) (short) 100, 100);
        int[] intArray23 = new int[] {};
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray23, (int) (short) 1);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.subarray(intArray23, (int) (short) 0, (int) (short) -1);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray19, intArray23);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.add(intArray19, 0);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray19, (int) 'a', 0);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.addAll(intArray7, intArray19);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray5, (java.lang.Object) intArray35);
        int int37 = org.apache.commons.lang3.StringUtils.indexOfAny("IH!ih", strArray5);
        boolean boolean38 = org.apache.commons.lang3.StringUtils.endsWithAny("0.0a1.0", strArray5);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444");
        int int41 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray18 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray18, 'a');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray18, '#');
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray22, '4', (int) (byte) 10);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray22);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("                                aaa", charArray22);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray30 = org.apache.commons.lang3.ArrayUtils.add(charArray22, 27, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 27, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aa-10110010", "  hihih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray15 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, '4');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray17);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, '#', (int) 'a');
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray17, 'a', (int) (byte) 100);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(charArray17, 'a');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray17);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "      aAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray2);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, (int) '4');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) -1);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 100, 5);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("{}", "aaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaaaa1aaaaaa10.0a1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.remove(longArray23, (int) (short) 1);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray23);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.add(longArray23, (long) (short) 0);
        java.lang.Class<?> wildcardClass29 = longArray28.getClass();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 0, 1, 100, 0, -1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        double[] doubleArray4 = new double[] { (byte) -1, 10, 28, 7 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        double[][] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toArray(doubleArray5);
        java.lang.Byte[] byteArray12 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray12);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, (byte) 0);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 0);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray16, byteArray25);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.clone(byteArray27);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray5, (java.lang.Object) byteArray27);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 1, 96);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 100, 64);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 10.0, 28.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaahiaaa", "                ...", 626);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaahiaaa" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaahiaaa");
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1L));
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.remove(floatArray9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0, -1.0, 52.0, -1.0]");
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        float[][] floatArray0 = new float[][] {};
        float[][] floatArray1 = new float[][] {};
        float[][][] floatArray2 = new float[][][] { floatArray0, floatArray1 };
        float[][] floatArray3 = new float[][] {};
        float[][] floatArray4 = new float[][] {};
        float[][][] floatArray5 = new float[][][] { floatArray3, floatArray4 };
        float[][] floatArray6 = new float[][] {};
        float[][] floatArray7 = new float[][] {};
        float[][][] floatArray8 = new float[][][] { floatArray6, floatArray7 };
        float[][] floatArray9 = new float[][] {};
        float[][] floatArray10 = new float[][] {};
        float[][][] floatArray11 = new float[][][] { floatArray9, floatArray10 };
        float[][] floatArray12 = new float[][] {};
        float[][] floatArray13 = new float[][] {};
        float[][][] floatArray14 = new float[][][] { floatArray12, floatArray13 };
        float[][][][] floatArray15 = new float[][][][] { floatArray2, floatArray5, floatArray8, floatArray11, floatArray14 };
        float[][] floatArray16 = new float[][] {};
        float[][] floatArray17 = new float[][] {};
        float[][][] floatArray18 = new float[][][] { floatArray16, floatArray17 };
        float[][] floatArray19 = new float[][] {};
        float[][] floatArray20 = new float[][] {};
        float[][][] floatArray21 = new float[][][] { floatArray19, floatArray20 };
        float[][] floatArray22 = new float[][] {};
        float[][] floatArray23 = new float[][] {};
        float[][][] floatArray24 = new float[][][] { floatArray22, floatArray23 };
        float[][] floatArray25 = new float[][] {};
        float[][] floatArray26 = new float[][] {};
        float[][][] floatArray27 = new float[][][] { floatArray25, floatArray26 };
        float[][] floatArray28 = new float[][] {};
        float[][] floatArray29 = new float[][] {};
        float[][][] floatArray30 = new float[][][] { floatArray28, floatArray29 };
        float[][][][] floatArray31 = new float[][][][] { floatArray18, floatArray21, floatArray24, floatArray27, floatArray30 };
        float[][] floatArray32 = new float[][] {};
        float[][] floatArray33 = new float[][] {};
        float[][][] floatArray34 = new float[][][] { floatArray32, floatArray33 };
        float[][] floatArray35 = new float[][] {};
        float[][] floatArray36 = new float[][] {};
        float[][][] floatArray37 = new float[][][] { floatArray35, floatArray36 };
        float[][] floatArray38 = new float[][] {};
        float[][] floatArray39 = new float[][] {};
        float[][][] floatArray40 = new float[][][] { floatArray38, floatArray39 };
        float[][] floatArray41 = new float[][] {};
        float[][] floatArray42 = new float[][] {};
        float[][][] floatArray43 = new float[][][] { floatArray41, floatArray42 };
        float[][] floatArray44 = new float[][] {};
        float[][] floatArray45 = new float[][] {};
        float[][][] floatArray46 = new float[][][] { floatArray44, floatArray45 };
        float[][][][] floatArray47 = new float[][][][] { floatArray34, floatArray37, floatArray40, floatArray43, floatArray46 };
        float[][][][][] floatArray48 = new float[][][][][] { floatArray15, floatArray31, floatArray47 };
        float[][][][][] floatArray49 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray48);
        java.lang.Boolean[] booleanArray54 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray54, false);
        java.lang.Long[] longArray63 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray63);
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray63, (java.lang.Object) (short) 100);
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray54, (java.lang.Object) longArray63);
        java.lang.Boolean[] booleanArray68 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray54);
        boolean[] booleanArray69 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray68);
        boolean[] booleanArray71 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray68, false);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray71);
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray71, true);
        int int75 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray48, (java.lang.Object) int74);
        java.lang.Object[][][] objArray78 = org.apache.commons.lang3.ArrayUtils.subarray((java.lang.Object[][][]) floatArray48, 33, 82);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertNotNull(booleanArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray69), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray71), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                 aaa                                             ", "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("#######################", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("------------aaa----------------------------------1.0", 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, 'a');
        java.lang.Object[] objArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) charArray9);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, a, 4, 4, 4]");
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("0HIHIH0H0aaa       10HIHIH0", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (short) 1);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 98, 65, (double) 96);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, (int) ' ', 10);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.toObject(intArray8);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18, 35);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.subarray(intArray21, (int) (short) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = org.apache.commons.lang3.ArrayUtils.add(intArray24, 200, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 200, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aAa       .0 AAA 100.0 AAA 10.0 AAA 10.0 A", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "#####################AAa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(charArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, ' ');
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, 2, 99);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, ' ');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray6);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ', 9);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, ' ');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAA", 142, 165);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     aAAaaahihi...     " + "'", str3, "     aAAaaahihi...     ");
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 10.0f, (int) '4');
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (-1), (-1), 10.0d);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray18);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray19);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray20);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) 516, (double) (byte) 10);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray20);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray12, 0.0f);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray12);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray12);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("h   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 100, 9);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray9);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0.0A                                                                AAA                          ", (java.lang.CharSequence) "444444444hihi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("##                                                                                                ", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##                                                                        " + "'", str2, "##                                                                        ");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa", 405);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        java.lang.Character[] charArray7 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, ' ');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray12, '#');
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1110", charArray14);
        char[] charArray23 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray23, '#');
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.subarray(charArray23, (int) 'a', 35);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                aaa", charArray23);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray23);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "{-1,10,0,10,1,10,0,0}", charArray23);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "##4a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "##4a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, 4, a, #, #]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ , 4,  , a, a, 4]");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, '4', 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, 1, (double) 0.0f);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray23, (double) 55, (double) 74);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray23, 0.0d);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray23, 10.0d, (double) 19);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                   ", "         1A10A0A0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   " + "'", str2, "                                                   ");
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray13, (short) (byte) 1, (int) ' ');
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, (short) 0);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray13);
        java.lang.Short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray13);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray20);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("1.0a0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0a0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0a0", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0..." + "'", str2, "1.0...");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaa  aaaa10aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaa 100.0 aaa 10.0 aaa 10.0 aaa -1." + "'", charSequence2, "aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a', 115, 1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray16);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray16);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str17, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, false, false, true, true, true, false]");
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                     aaaa1aaaa                      ", "aAA", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1      aaaA1      aaaA10", "-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "10.01.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("       aaaa1aaaa       ", 445);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                             aaaa1aaaa       " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                             aaaa1aaaa       ");
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        float[] floatArray5 = new float[] { (byte) 10 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray5, 0.0f, 100);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray5, (float) 0L);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray5, (int) 'a', 3);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray15, (float) (byte) 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) floatArray15);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("eaaahfalse trueaaahtru");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA", strArray3, strArray20);
        int int22 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("1a0.01", strArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA" + "'", str21, "1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa", "       aaa       aaa       aaa       aaa       aaa       aaa       aaa       aaa       aaa", "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa" + "'", str3, "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa");
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaahiaaa", "       aaaa1aaaa       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h h h h h h h h h aaa AAA", "aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1L));
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        char[] charArray17 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.toObject(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("aaaA", charArray19);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, '#');
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.044444444444444444444444444444                                AAA44444444hiaaaaaaaa1.0444444444444444...", charArray19);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, '4');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 'a');
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray11, (java.lang.Object) charArray27, (int) '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, #,  , a]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        java.lang.Long[] longArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ih44444444AAA44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih44444444AAA44444444444444444444444444444" + "'", str1, "ih44444444AAA44444444444444444444444444444");
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 33);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (short) 10, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray13, (int) (byte) 0, 100);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray13);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.subarray(intArray13, 27, (int) (byte) 10);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray13, 100);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.addAll(intArray6, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = org.apache.commons.lang3.ArrayUtils.add(intArray22, 97, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, (int) (byte) 0);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, 42);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(booleanArray23);
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444AAAA1-1.0AAAA1AAAA110.01AAAA1AAAA110.01AAAA1AAAA1100.01AAAA1AAAA11.01AAAA10.01", 209);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi... ", "{3}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "0.0a");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaah");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str4, "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str1, "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        java.lang.Float[] floatArray14 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray14, 1.0f);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray14);
        java.lang.Float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray14);
        java.lang.Float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray18);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray18);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray20);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray4, (float) 32);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.clone(floatArray23);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0]");
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("trueaaahtrueaaahtrueaaahfalse                                ", "                                                                                              aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtrueaaahtrueaaahfalse                                " + "'", str2, "trueaaahtrueaaahtrueaaahfalse                                ");
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0HIHIH0H0aaa       10HIHIH0", 96, "false0false0true0true0false0true");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "false0false0true0true0false0truefalse0false0true0true0false0truefalse0HIHIH0H0aaa       10HIHIH0" + "'", str3, "false0false0true0true0false0truefalse0false0true0true0false0truefalse0HIHIH0H0aaa       10HIHIH0");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444444444hihi...", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray13);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray13);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        java.lang.Byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 100, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 100, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                   ", "###10110110110110110110110110110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 35, 94);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, '4');
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("{-1,10,10,1,10,0,0}", charArray9);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, '#', (int) (short) 100);
        long[] longArray25 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.add(longArray25, (long) (short) 1);
        long[] longArray33 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.add(longArray33, (long) (short) 1);
        long[] longArray39 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains(longArray39, (long) ' ');
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.addAll(longArray35, longArray39);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray39);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        long[] longArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray44);
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray45);
        char[] charArray49 = new char[] { ' ', '#' };
        char[] charArray52 = new char[] { ' ', '#' };
        char[] charArray55 = new char[] { ' ', '#' };
        char[] charArray58 = new char[] { ' ', '#' };
        char[][] charArray59 = new char[][] { charArray49, charArray52, charArray55, charArray58 };
        char[] charArray66 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray68 = org.apache.commons.lang3.ArrayUtils.add(charArray66, 'a');
        char[] charArray70 = org.apache.commons.lang3.ArrayUtils.add(charArray66, ' ');
        char[] charArray77 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray79 = org.apache.commons.lang3.ArrayUtils.add(charArray77, 'a');
        char[] charArray81 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray77, '#');
        boolean boolean82 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray81);
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray66, charArray81);
        char[][] charArray84 = org.apache.commons.lang3.ArrayUtils.add(charArray59, charArray81);
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) longArray46, (java.lang.Object) charArray84);
        long[] longArray88 = org.apache.commons.lang3.ArrayUtils.subarray(longArray46, 28, 93);
        long[] longArray89 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray46);
        boolean boolean90 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) '#', (java.lang.Object) longArray89);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray92 = org.apache.commons.lang3.ArrayUtils.remove(longArray89, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 37, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ , #]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ , #]");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[ , #]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[ , #]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, ' ');
        boolean[] booleanArray15 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray22 = new boolean[] { false, false, true, true, false, true };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray15, booleanArray22);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray22, false);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray22, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray22);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray6, (java.lang.Object) booleanArray29, (int) (byte) -1);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.concatWith("                              HIHIH                                                        aaa", (java.lang.Object[]) charArray6);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray6, "trueaaahtru   eaaahfalse", 405, 5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#" + "'", str33, "#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.lang.Character[] charArray17 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17, '4');
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray17);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray21);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray21, 'a', (int) (short) 10);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray10, charArray21);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray21);
        java.lang.Character[] charArray28 = org.apache.commons.lang3.ArrayUtils.toObject(charArray21);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray31 = org.apache.commons.lang3.ArrayUtils.add(charArray21, 799, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 799, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 94);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray21);
        int[] intArray23 = new int[] {};
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray23, (int) (short) 1);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray23, 100);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray23, (int) '#', 0);
        int[] intArray35 = new int[] { (-1), '4', (byte) 10, 1 };
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray35, (int) (short) 100, 100);
        int[] intArray39 = new int[] {};
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray39, (int) (short) 1);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.subarray(intArray39, (int) (short) 0, (int) (short) -1);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray35, intArray39);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.add(intArray35, 0);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray35, (int) 'a', 0);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.addAll(intArray23, intArray35);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray21, (java.lang.Object) intArray51);
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray51, (int) ' ', (int) 'a');
        int[] intArray58 = org.apache.commons.lang3.ArrayUtils.add(intArray51, (int) (byte) 0, (int) (byte) -1);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray51);
        java.lang.Integer[] intArray60 = org.apache.commons.lang3.ArrayUtils.toObject(intArray51);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] {};
        int[] intArray63 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray61, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray63);
        int[] intArray67 = org.apache.commons.lang3.ArrayUtils.subarray(intArray63, 28, (int) ' ');
        int[] intArray70 = org.apache.commons.lang3.ArrayUtils.subarray(intArray63, (int) (byte) 10, (int) '#');
        int[] intArray71 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray63);
        int[] intArray72 = org.apache.commons.lang3.ArrayUtils.clone(intArray71);
        int[] intArray74 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray71, 24);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray74);
        int[] intArray76 = org.apache.commons.lang3.ArrayUtils.clone(intArray74);
        int int78 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray74, (int) (byte) 0);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray51, intArray74);
        int[] intArray82 = org.apache.commons.lang3.ArrayUtils.subarray(intArray51, 28, 27);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 52, 10, 1, 94]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, -1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "TRUE   HITRUE   HITRUE   HIF LSE", 17, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str3, "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray16 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray23 = new boolean[] { false, false, true, true, false, true };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray16, booleanArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, false);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray23, false, (int) (short) 0);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray8, booleanArray23);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.add(booleanArray23, true);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray23);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray33);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, true, true, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, true, true, false, true]");
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("     HIHIHfalsefalsetru", 0, 405);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     HIHIHfalsefalsetru" + "'", str3, "     HIHIHfalsefalsetru");
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("  10110010AA", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  aaahi   ", "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa", 82);
        java.lang.String str4 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa" + "'", str4, "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa");
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, true);
        boolean[] booleanArray24 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray29 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray29, false);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray31);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray31);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray24, booleanArray31);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray34, true);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray34);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray37, true);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray37, false);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray37, true, (int) 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray37);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, true, true, true, false, false, true, false, false, false, true, true, true, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 17 + "'", int41 == 17);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        boolean[] booleanArray22 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray27 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray27, false);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray29);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray29);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray22, booleanArray29);
        java.lang.Boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray33);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray33);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray35);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray35);
        java.lang.Boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str34, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, true, true, true, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, true, true, false, true, false, true, true, true, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray38);
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, 100);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, (int) '#', 0);
        int[] intArray20 = new int[] { (-1), '4', (byte) 10, 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, (int) (short) 100, 100);
        int[] intArray24 = new int[] {};
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, (int) (short) 1);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.subarray(intArray24, (int) (short) 0, (int) (short) -1);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray20, intArray24);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.add(intArray20, 0);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, (int) 'a', 0);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.addAll(intArray8, intArray20);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.addAll(intArray7, intArray36);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.clone(intArray36);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray36, 32);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray40);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.contains(intArray40, 27);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.subarray(intArray40, 516, (int) (short) 0);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray40);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                             ...ihihaaa 11-00011010011-00011010011-00011010011-                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...ihihaaa11-00011010011-00011010011-00011010011-" + "'", str1, "...ihihaaa11-00011010011-00011010011-00011010011-");
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#################################aaa############################################################aaa1", "-10110010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        boolean[] booleanArray14 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray21 = new boolean[] { false, false, true, true, false, true };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray21, false);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray21, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray21);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray5, (java.lang.Object) booleanArray28, (int) (byte) -1);
        java.lang.Boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray28);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray31);
        java.lang.Long[] longArray33 = null;
        java.lang.Long[] longArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray33);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray34, (long) 55);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray31, (java.lang.Object) longArray36, (int) (byte) 0);
        java.lang.Boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray31);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(booleanArray39);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, ' ');
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, '#', 28);
        java.lang.Character[] charArray25 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray25, '4');
        java.lang.Character[] charArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray25);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray25);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray25);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray25, '4');
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.addAll(charArray9, charArray32);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, '#', 1000);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, #, a, 4, 4, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                   ", "HIHIH######################", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray5, (-1L), 4);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', 12, 3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa AAAHIHI...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AaaaaaAAaaaaaAAatrueaaaaAAaaaaaAAaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa AAAHIHI...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa AAAHIHI...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        char[] charArray3 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        java.lang.Integer[][] intArray7 = new java.lang.Integer[][] {};
        java.lang.Integer[] intArray8 = new java.lang.Integer[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray8, 35);
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray8);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray8);
        java.lang.Integer[] intArray13 = org.apache.commons.lang3.ArrayUtils.toObject(intArray12);
        java.lang.Integer[][] intArray14 = org.apache.commons.lang3.ArrayUtils.add(intArray7, intArray13);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        java.lang.Long[] longArray28 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray28);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray28, (java.lang.Object) (short) 100);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray19, (java.lang.Object) longArray28);
        java.lang.Boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray19);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19);
        java.lang.Integer[][] intArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray14, (java.lang.Object) booleanArray34);
        char[] charArray43 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.add(charArray43, 'a');
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray43, '#');
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.subarray(charArray43, (int) 'a', 35);
        int int51 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                aaa", charArray43);
        char[] charArray52 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray53 = org.apache.commons.lang3.ArrayUtils.addAll(charArray43, charArray52);
        java.lang.Integer[][] intArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray14, (java.lang.Object) charArray52);
        char[] charArray57 = org.apache.commons.lang3.ArrayUtils.subarray(charArray52, 0, 65);
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray52);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, 'a', 2);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, '4');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, #,  ]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[]");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aAA");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("AAA                                                                                               aaaA", strArray5, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny(" 1      AAAA1      AAAA1                                                                                                                                                                                                                            ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AAA                                                                                               aaaA" + "'", str9, "AAA                                                                                               aaaA");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaA", "{-1,-1,0}");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("hi...", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                             aaaA", "hi...", (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                  AAA       ", strArray5, strArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("-1#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                             aaaA" + "'", str12, "                             aaaA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                  AAA       " + "'", str13, "                  AAA       ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 100.0d, (-1.0d), (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, (double) 21);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray5, '#', 36, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, -1.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, -1.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (byte) 0, (double) 10L);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (short) -1, (double) 10L);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100.0f, 14, (double) (byte) 10);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 16);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[16.0]");
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(byteArray17, (byte) 10);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray2, byteArray20);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 0);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) 100);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray28, (byte) -1, (int) 'a');
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray28);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.clone(byteArray28);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 10, (-1));
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray33, 2, 35);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray39);
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!ih", "                                                                                              aaa", 4);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1 };
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray47, (byte) -1, (int) 'a');
        byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray47, (byte) 10);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray47);
        byte[] byteArray55 = org.apache.commons.lang3.ArrayUtils.add(byteArray53, (byte) -1);
        byte[] byteArray58 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray53, (int) (short) -1, 0);
        java.lang.Byte[] byteArray64 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray65 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray64);
        byte[] byteArray66 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray53, byteArray65);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray44, (java.lang.Object) byteArray65, 24);
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray65, (byte) 100);
        byte[] byteArray71 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray39, byteArray65);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray39);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[10, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaahihi#..                                                                     4444444444444444444444444...   ", "1001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-1010", "-1#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahihi#..                                                                     4444444444444444444444444...   " + "'", str3, "aaahihi#..                                                                     4444444444444444444444444...   ");
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("itrueaaah", 200, "1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                        aaa1.0a0.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                itrueaaah" + "'", str3, "1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                itrueaaah");
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray10);
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13, '4');
        short[] shortArray18 = new short[] { (byte) -1, (short) 1 };
        short[] shortArray21 = new short[] { (byte) -1, (short) 1 };
        short[] shortArray24 = new short[] { (byte) -1, (short) 1 };
        short[] shortArray27 = new short[] { (byte) -1, (short) 1 };
        short[] shortArray30 = new short[] { (byte) -1, (short) 1 };
        short[] shortArray33 = new short[] { (byte) -1, (short) 1 };
        short[][] shortArray34 = new short[][] { shortArray18, shortArray21, shortArray24, shortArray27, shortArray30, shortArray33 };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray34);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) shortArray34);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray13, (java.lang.Object) shortArray34, 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 1]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[-1, 1]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[-1, 1]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int[] intArray17 = new int[] {};
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, (int) (short) 1);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, 100);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray17, (int) '#', 0);
        int[] intArray29 = new int[] { (-1), '4', (byte) 10, 1 };
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray29, (int) (short) 100, 100);
        int[] intArray33 = new int[] {};
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray33, (int) (short) 1);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.subarray(intArray33, (int) (short) 0, (int) (short) -1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray29, intArray33);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.add(intArray29, 0);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray29, (int) 'a', 0);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.addAll(intArray17, intArray29);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray16, intArray17);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray17, (int) ' ');
        int[] intArray49 = new int[] {};
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray49, (int) (short) 1);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray49, 100);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.add(intArray49, (int) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray55);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray55, 4, 4);
        int[] intArray60 = org.apache.commons.lang3.ArrayUtils.addAll(intArray17, intArray55);
        int[] intArray63 = org.apache.commons.lang3.ArrayUtils.subarray(intArray17, 74, 65);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[52]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[52]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                               a                                                               ", 37, "AaaaA AAAAAaEAAAHFALSE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               a                                                               " + "'", str3, "                                                                                               a                                                               ");
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("{a,#,a,4,4,4}", "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a,#,a,4,4,4}" + "'", str2, "{a,#,a,4,4,4}");
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("......", 859);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......" + "'", str2, "......");
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "393933393943793933393943289393339394310", (java.lang.CharSequence) "10.01.0                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                 ", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("{-1,52,10,1,0}", strArray4);
        long[] longArray16 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.add(longArray16, (long) (short) 1);
        long[] longArray22 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(longArray22, (long) ' ');
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray18, longArray22);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.add(longArray22, (long) (-1));
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray27);
        java.lang.Long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toObject(longArray27);
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray29);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concatWith("...ihihaaa 11-00011010011-00011010011-00011010011-", (java.lang.Object[]) longArray29);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray4, (java.lang.Object) longArray29, 97);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, -1, 0, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1, 0, -1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1...ihihaaa 11-00011010011-00011010011-00011010011--1...ihihaaa 11-00011010011-00011010011-00011010011-0...ihihaaa 11-00011010011-00011010011-00011010011--1" + "'", str31, "-1...ihihaaa 11-00011010011-00011010011-00011010011--1...ihihaaa 11-00011010011-00011010011-00011010011-0...ihihaaa 11-00011010011-00011010011-00011010011--1");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "h h h h h h h h h aaa AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str2, "ihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("-101100", "h       HIHIHh  h", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray16, (byte) 100, 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray16);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray7);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) -1);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray7, (byte) 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, 0.0d, (double) (-1.0f));
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray11, (double) 22, (double) 2);
        java.lang.String str20 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int19);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1" + "'", str20, "-1");
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aAAA1## AAAA1 ##1", "10.041.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0.140.01", 226);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) -1);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray19, 33, (-1));
        short[] shortArray31 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) (byte) 0, (-1));
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray31);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray31);
        java.lang.Short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray31);
        java.lang.Short[] shortArray40 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray40, (short) 1);
        short[] shortArray49 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray49, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray49);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray42, shortArray49);
        java.lang.Short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray54);
        java.lang.Short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray55);
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray56);
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.add(shortArray57, (short) 0);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray57);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray31, shortArray57);
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray61);
        short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.remove(shortArray62, 12);
        short[] shortArray65 = null;
        short[] shortArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray65);
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.add(shortArray66, (short) 0);
        short[] shortArray69 = org.apache.commons.lang3.ArrayUtils.clone(shortArray66);
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.clone(shortArray69);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray62, shortArray70);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray70);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.contains(shortArray70, (short) (byte) 100);
        short[] shortArray81 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int84 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray81, (short) (byte) 0, (-1));
        short[] shortArray86 = org.apache.commons.lang3.ArrayUtils.add(shortArray81, (short) (byte) 1);
        short[] shortArray89 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray81, 58, 0);
        short[] shortArray90 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray70, shortArray81);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[]");
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[0]");
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[]");
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray86), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray89), "[]");
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray90), "[0, 0, 10, 1, 10, 0]");
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("      aaaa            ", "##                                                                                                ", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "101101");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha" + "'", str2, "aaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha");
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("true                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0true                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0true                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0false", "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 0);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, 32, 65);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) 21);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (double) 69);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        boolean[] booleanArray5 = new boolean[] { true, false, false, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false, 1000);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(".0a0.", (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaahihi... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAA1      AAAA             ", "{aaa                                 1.010.0a1.0100.010.0a1.010.010.0a1.010.010.0a1.0-1.0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, '4');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray10, 'a');
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, '#');
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray10);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray10, '4');
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa10", charArray19);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray19);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray23 = org.apache.commons.lang3.ArrayUtils.remove(charArray19, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 96, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#a44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#a44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #, a, 4, 4]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("{-1,10,10,1,10,0,0}{-1,10,10,1,10Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-1,10,10,1,10,0,0}{-1,10,10,1,10Hi" + "'", str1, "{-1,10,10,1,10,0,0}{-1,10,10,1,10Hi");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("-1#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10hi1", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "-1#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        int[] intArray4 = new int[] {};
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (int) (short) 1);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) '#', 0);
        int[] intArray16 = new int[] { (-1), '4', (byte) 10, 1 };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, (int) (short) 100, 100);
        int[] intArray20 = new int[] {};
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray20, (int) (short) 1);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.subarray(intArray20, (int) (short) 0, (int) (short) -1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray16, intArray20);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.add(intArray16, 0);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray16, (int) 'a', 0);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray16);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray2, (java.lang.Object) intArray32);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, (int) ' ', (int) 'a');
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.add(intArray32, (int) (byte) 0, (int) (byte) -1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains(intArray39, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = org.apache.commons.lang3.ArrayUtils.add(intArray39, 1000, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1000, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, -1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray6, (java.lang.Object) (short) 100);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray16 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.add(longArray16, (long) (short) 1);
        long[] longArray22 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(longArray22, (long) ' ');
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray18, longArray22);
        java.lang.Long[] longArray32 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray32);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray33);
        long[] longArray40 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.add(longArray40, (long) (short) 1);
        long[] longArray48 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.add(longArray48, (long) (short) 1);
        long[] longArray54 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(longArray54, (long) ' ');
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.addAll(longArray50, longArray54);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray54);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray40, (-1L), 4);
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray40);
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.add(longArray62, (long) (byte) 0);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.addAll(longArray10, longArray62);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray62, (long) 7, (int) 'a');
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.remove(longArray62, (int) (byte) 0);
        int int73 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray62, (long) 64, (int) (short) -1);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray62);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray77 = org.apache.commons.lang3.ArrayUtils.add(longArray62, 96, (long) 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 96, Length: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[100, 1, -1, 0, 1, 0, 100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "{-1.0,10.0,35.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI", "-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI" + "'", str2, "HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI");
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        int[] intArray6 = new int[] { (short) -1, '4', 3, 7, (short) 10, 10 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (byte) 10, 13);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 52, 3, 7, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        java.lang.Long[] longArray22 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray23);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray23, (long) 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray30 = org.apache.commons.lang3.ArrayUtils.add(longArray23, 38, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 38, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, -1, -1, 1, 0, 100, 1, 0, 97, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray5, (int) (byte) 100, (int) (byte) 100);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 0.0d, 10.0d };
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11);
        double[] doubleArray13 = new double[] {};
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (double) '4', (double) (byte) -1);
        double[] doubleArray21 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray13, doubleArray21);
        double[] doubleArray28 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray28);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray13, doubleArray28);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray28, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.add(doubleArray28, 1, (double) 0.0f);
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray12, doubleArray36);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 52, (int) (byte) 0);
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray8, doubleArray12);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray41, (double) (byte) -1, 12, (double) 52);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 10.0, -1.0, 0.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "{1  ,1,-1, ,1, ,97, ,1,1  , }");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray9, '4');
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.toObject(charArray9);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13, ' ');
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                aaa", charArray16);
        java.lang.Character[] charArray25 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray25, '4');
        java.lang.Character[] charArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray25);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray28);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray28);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.clone(charArray30);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray30, '4');
        int int34 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", charArray30);
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.addAll(charArray16, charArray30);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray30);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[a, #, a, 4, 4, 4, a, #, a, 4, 4, 4]");
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  hihih", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hihih" + "'", str2, "  hihih");
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray4, (short) 10);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray4);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray4, (short) (byte) 0, (int) (short) -1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray4, 17, 13);
        short[] shortArray22 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray22, (short) (byte) 0, (-1));
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray22);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray22);
        java.lang.Short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray22);
        java.lang.Short[] shortArray31 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31, (short) 1);
        short[] shortArray40 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray40, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray40);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray33, shortArray40);
        java.lang.Short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray45);
        java.lang.Short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray46);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray47);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.add(shortArray48, (short) 0);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray48);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray22, shortArray48);
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray48, (short) (byte) -1, 100);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray48);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[-1, 10, 0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1      aaaA1      aaaA1", "10.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA52.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA100.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA1.0", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                              ", "                                                                 AAA                                                                                               aaa");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("aaa                                                        HIHIH                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray20);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray20, 27, 13);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray25);
        java.lang.Byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray25);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 1, 100, 1, 0, -1, 1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("true   hitrue   hitrue   hif lse", "100 1TRUE   HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true   hitrue   hitrue   hif lse" + "'", str2, "true   hitrue   hitrue   hif lse");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  1.0100.010.010.0-1.0  ", "10               HIHIH               1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAA                                                                                               aaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA                                                                                               aaaA" + "'", str1, "AAA                                                                                               aaaA");
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("     AAAH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     AAAH" + "'", str1, "     AAAH");
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("          ", "......aaahi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, '#');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, (int) 'a', 35);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                aaa", charArray7);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray16);
        java.lang.Character[] charArray24 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray24, '4');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray26);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.add(charArray26, '4');
        java.lang.Character[] charArray36 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray36, '4');
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray38);
        java.lang.Character[] charArray40 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.addAll(charArray29, charArray38);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.addAll(charArray17, charArray29);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, #, a, 4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "a#a4444a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "a#a4444a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[a, #, a, 4, 4, 4, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " 4 aa4a#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " 4 aa4a#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , 4,  , a, a, 4, a, #, a, 4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ , 4,  , a, a, 4]");
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (short) -1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 106);
        java.lang.Double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", 82, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str3, "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) 100L, (double) 33);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 64, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 879);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("{true,false,false,false,true,false}");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi", "hi!");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{true,false,false,false,true,false}" + "'", str2, "{true,false,false,false,true,false}");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{true,false,false,false,true,false}" + "'", str8, "{true,false,false,false,true,false}");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("{0,0,10,1,10,0}", "{100,1,-1,0,1,0,97,0,1,100,0}", "0.01.0100.010.010.0-1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00.0..0....0.0" + "'", str3, "00.0..0....0.0");
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray16, (byte) 100, 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray16);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, (int) (short) 10, (int) (byte) 100);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, 52, 7);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, 6, 10);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray29, (byte) 0, 6);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.add(byteArray29, (byte) 10);
        boolean[] booleanArray35 = null;
        boolean[] booleanArray42 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray49 = new boolean[] { false, false, true, true, false, true };
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray42, booleanArray49);
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray49);
        boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.add(booleanArray49, false);
        boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray35, booleanArray49);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray49, false, 35);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.add(booleanArray49, true);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) byteArray34, (java.lang.Object) booleanArray59);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray34);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray34, (byte) -1);
        java.lang.Byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray34);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[false, false, true, true, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(byteArray64);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("A#A444", "ih44444444AAA44444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray9, (float) (short) -1);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, 115, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 115, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 1.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0, 10.0, 10.0]");
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray25, (int) (short) -1, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray25);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray25, (long) 139);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray35 = org.apache.commons.lang3.ArrayUtils.add(longArray32, 100, (long) 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[0, 100, 1, 0, 97]");
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(",aaaaaaaaaaaaaaaaaaaaaaaa...", "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a#a444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "------------aaa----------------------------------1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#a444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "a#a444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray6, (java.lang.Object) (short) 100);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray16 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.add(longArray16, (long) (short) 1);
        long[] longArray22 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(longArray22, (long) ' ');
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray18, longArray22);
        java.lang.Long[] longArray32 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray32);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray33);
        long[] longArray40 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.add(longArray40, (long) (short) 1);
        long[] longArray48 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.add(longArray48, (long) (short) 1);
        long[] longArray54 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(longArray54, (long) ' ');
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.addAll(longArray50, longArray54);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray54);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray40, (-1L), 4);
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray40);
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.add(longArray62, (long) (byte) 0);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.addAll(longArray10, longArray62);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray62, (long) 7, (int) 'a');
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.remove(longArray62, (int) (byte) 0);
        int int73 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray62, (long) 64, (int) (short) -1);
        long[] longArray75 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray62, (long) 55);
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray62);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[100, 1, -1, 0, 1, 0, 100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                              ", "-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-101144444444444444444444444444444 AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0aaa                                10aaa                                1aaa                                1aaa                                0", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, 2, (short) (byte) 0);
        short[] shortArray20 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, (-1));
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) -1);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) 1);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray27, (short) (byte) 1, (int) ' ');
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, (short) 0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray32);
        java.lang.Short[] shortArray36 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36, (short) 1);
        short[] shortArray45 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray45, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray45);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray38, shortArray45);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray38, (short) 10);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray38);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray38);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray38, (short) (byte) -1);
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.clone(shortArray38);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray38);
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.add(shortArray38, (short) 1);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[10]");
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[10, -1, 1]");
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...", "0.044444444444444444444444444444                                AAA44444444hiaaaaaaaa1.0444444444444444...", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##                                                                                                ", "                                                                           ", 23);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("{-1,10,10,1,10,0,0}", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAtruetruetruet");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                          ", "hi!H");
        org.junit.Assert.assertNotNull(strArray2);
    }
}

