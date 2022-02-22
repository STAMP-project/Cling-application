import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("##   ", "   ", 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##   " + "'", str3, "##   ");
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        java.lang.Byte[] byteArray26 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 0);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray27);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray27);
        java.lang.Byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray32);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray33, (byte) 10);
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
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("       aAA", "                                    ##1      AAAA1      AAAA1##                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       aAA" + "'", str2, "       aAA");
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" ", "  10110010aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("{-1,0,1,100,1}", "###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,0,1,100,1}" + "'", str2, "{-1,0,1,100,1}");
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "trueaaahtru   eaaahfalse");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        long[] longArray0 = null;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Long[] longArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19);
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap22 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray21);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aahi", "                       AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi" + "'", str2, "aahi");
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray11);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "  10110010AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) '4', (int) (short) 100, (double) 4);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1 };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray17, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray17);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray21, (java.lang.Object) 1.0d, (int) (byte) 100);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray21);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) doubleArray8, (java.lang.Object) byteArray21);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray8);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) 98);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("trueaaahtrueaaahtrueaaahfalse                                ", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str2, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.reflect.Type[]) wildcardClassArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray3, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray3);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray3);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 1 };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray17, (byte) 100, 0);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray17);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.remove(byteArray21, (int) (byte) 1);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray23);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("   h", "{}0.0----------------------------------------------------------------aaa----------------------");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   h" + "'", str2, "   h");
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("1110");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1110" + "'", str1, "1110");
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1      aaaa1      aaaa10", "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAA1      AAAA", (int) (short) -1, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        java.lang.Byte[] byteArray26 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 0);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray27);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray27);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray32, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.add(byteArray32, 24, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Length: 16");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("{97,0,1,100,0}", "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("        {}         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aaaaaa                                                                                               aAAAa", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray18 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) (byte) 0, (-1));
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray18);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray24, (short) 10);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray24);
        java.lang.Short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray24);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 0, 10, 10, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 0, 10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray28);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("10.0a1", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ", "0.0A                                                                AAA                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("{true,true,true,false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{true,true,true,false}" + "'", str1, "{true,true,true,false}");
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah");
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                 ", 9, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaahihi..");
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray2, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[aaahihi, ..]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[aaahihi, ..]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaahihi#.." + "'", str4, "aaahihi#..");
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("a#a444", "                                                                 AAA                                                                                               aaaA", "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 'a', 5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray11, '#');
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1110", charArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = org.apache.commons.lang3.ArrayUtils.remove(charArray13, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##4a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##4a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, 4, a, #, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
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
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 10);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray20, 0, 27);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.remove(byteArray25, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1, 10, 1]");
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                aAA         ", "93933393943");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray8, '4');
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = org.apache.commons.lang3.ArrayUtils.remove(charArray8, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 0);
        java.lang.Byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("Aaa                            aaaA", (java.lang.Object[]) byteArray10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10);
        short[] shortArray22 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray22, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray22);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray22, (short) 10);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.clone(shortArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray29);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray29, (short) 1);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray10, (java.lang.Object) (short) 1, 0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0, 10, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("true", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("H", 98, "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi.." + "'", str3, "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..");
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                    ", 8, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}", "0.0a1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}" + "'", str2, "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "ahaaahaaahaaahaaahaaahaaa.1a0.01", (java.lang.CharSequence) "aaaa1      aaaa            ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ahaaahaaahaaahaaahaaahaaa.1a0.01" + "'", charSequence2, "ahaaahaaahaaahaaahaaahaaa.1a0.01");
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hi", "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi" + "'", str2, "Hi");
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                 aaa                                                            aaaA", "{-1,52,10,1,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0.0 1.0 100.0 10.0 10.0 -1.0", "10.0a1.10.0a1.10.0a1.10.0a1.10hi...", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("{100,1,-1,0,1,", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a#a444", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          a#a444          " + "'", str2, "          a#a444          ");
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, ' ', 8);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = org.apache.commons.lang3.ArrayUtils.remove(charArray14, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 6");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray6, (java.lang.Object) (short) 100);
        java.lang.Long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray13 = org.apache.commons.lang3.ArrayUtils.remove(longArray11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 1, -1, 0, 1, 0]");
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("{-1,10,10,1,10,0,0}", "       aAA", (-1), 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       aAA" + "'", str4, "       aAA");
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str1, "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444                                AAA44444444hiaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444                                AAA44444444hi" + "'", str2, "44444444444444444444444444444                                AAA44444444hi");
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("-1 0 1 100 1", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAA", 42, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA");
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                              HIHIH", strArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray3);
        double[] doubleArray7 = new double[] {};
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) '4', (double) (byte) -1);
        double[] doubleArray15 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray7, doubleArray15);
        double[] doubleArray22 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray7, doubleArray22);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) 12);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 28 + "'", int4 == 28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                aaa                                 ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray8 = org.apache.commons.lang3.ArrayUtils.subarray(strArray5, (int) 'a', (int) '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  ...ihihaaa 11-00011010011-00011010011-00011010011-" + "'", str1, "  ...ihihaaa 11-00011010011-00011010011-00011010011-");
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0.0a", "                                                               Hi", "aaa                                                                                               aaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "10.0a1", (java.lang.CharSequence) "0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0.1a0.01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.1A0.01" + "'", str1, "0.1A0.01");
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "100.00.0-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("-1 0 1 100 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 0 1 100 1" + "'", str1, "-1 0 1 100 1");
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 58 + "'", int1 == 58);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10.0a1.0", 0, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, 0.0f, 7);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) 2);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) (byte) -1, 18);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", 64, "  HIHIH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0" + "'", str3, "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0");
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("A1A10A0A0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a1a10a0a0" + "'", str1, "a1a10a0a0");
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  10110010AA", "  aaaa10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("               HIHIH               ", "{0,0,10,1,10,0}", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("          ", "a444#a", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "{-1,0,1,100,1}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAA                                                                                               aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray68 = org.apache.commons.lang3.ArrayUtils.add(booleanArray40, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
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
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hihi...", 52, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", "a1a10a0a0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa" + "'", str2, "...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa");
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(" aaahihi... ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) " aaahihi... ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray0, (java.lang.Object) charArray8);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray16);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray17, (double) 33);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray19, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
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
        long[] longArray34 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.add(longArray34, (long) (short) 1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray28, longArray36);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray36);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray36);
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
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[1, 0, 100, 1, 0, 97]");
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HIHIH                              ", "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, '4');
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!H", (int) ' ', "0.0 1.0 100.0 10.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0 1.0 100.0 hi!H0.0 1.0 100.0 " + "'", str3, "0.0 1.0 100.0 hi!H0.0 1.0 100.0 ");
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 35, (double) 99);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray8, true);
        java.lang.Class<?> wildcardClass11 = booleanArray8.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, '4');
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("{-1,10,10,1,10,0,0}", charArray9);
        java.lang.Object obj17 = null;
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) "{-1,10,10,1,10,0,0}", obj17);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("###", "aaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 0, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ", "hi!HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       " + "'", str2, "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ");
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "  HIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" AAAHIHI...  ", "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " AAAHIHI...  " + "'", str2, " AAAHIHI...  ");
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray1, (byte) 1, (int) (short) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray1, (int) (byte) 0, (byte) -1);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray8, "aaaA");
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray8, (byte) 10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray1, byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.remove(byteArray1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("              1110               ", (int) (short) 100, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                              HIHIH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                           ", "  10110010AA", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                 aaa                                                            aaaA", "ahaaahaaahaaahaaahaaahaaa.1a0.01", 0, 94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA" + "'", str4, "ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA");
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaa4444444444-1a10a0a10a1a10a0a0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("{                                                                                              }", "1      AAAA1      AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                    ", ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("true", 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray13, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray23, true, 7);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" + "'", str2, "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0.0a1.0", (int) (short) 1, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0a1.0" + "'", str3, "0.0a1.0");
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hihih", "HIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihih" + "'", str2, "hihih");
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAa       ", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                       AAa       " + "'", str2, "                                                       AAa       ");
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        char[] charArray3 = new char[] { ' ', '#' };
        char[] charArray6 = new char[] { ' ', '#' };
        char[] charArray9 = new char[] { ' ', '#' };
        char[] charArray12 = new char[] { ' ', '#' };
        char[][] charArray13 = new char[][] { charArray3, charArray6, charArray9, charArray12 };
        char[] charArray20 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray20, 'a');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray20, ' ');
        char[] charArray31 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.add(charArray31, 'a');
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray31, '#');
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray20, charArray35);
        char[][] charArray38 = org.apache.commons.lang3.ArrayUtils.add(charArray13, charArray35);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.add(charArray35, 'a');
        int int41 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                 AAAAA                                                                                               AAAAAAEAAAHFALSE", charArray35);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #]");
        org.junit.Assert.assertNotNull(charArray13);
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
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 65 + "'", int41 == 65);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
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
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 52, 10, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("aaah", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IH!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI                        " + "'", str2, "HI                        ");
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("truetruetruefalse", (int) (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "truetruetruefalse" + "'", str3, "truetruetruefalse");
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("       aaa                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa" + "'", str1, "aaa");
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        java.lang.Integer[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 4);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                 ", 58, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI                        ", "                                                                 AAA                                                                                               aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", "aaa                  ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, (int) (byte) 0, 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray7);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (byte) -1, 10);
        java.lang.Integer[] intArray16 = org.apache.commons.lang3.ArrayUtils.toObject(intArray6);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 7, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("{true,false,false,false,true,false}", (int) (short) 0, "        {}         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{true,false,false,false,true,false}" + "'", str3, "{true,false,false,false,true,false}");
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        java.lang.Character[][] charArray0 = new java.lang.Character[][] {};
        java.lang.Character[] charArray2 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray4 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray6 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray8 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray10 = new java.lang.Character[] { ' ' };
        java.lang.Character[][] charArray11 = new java.lang.Character[][] { charArray2, charArray4, charArray6, charArray8, charArray10 };
        java.lang.Character[][] charArray12 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray11);
        java.lang.Character[] charArray20 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray20, '4');
        java.lang.Character[] charArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray20);
        java.lang.Character[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character[][] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray0, (int) (short) 100, charArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 6, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
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
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray23, (-1), (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaah");
        java.lang.String[] strArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray1);
        double[] doubleArray3 = new double[] {};
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) '4', (double) (byte) -1);
        double[] doubleArray11 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 10.0f, (int) '4');
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) -1);
        double[] doubleArray19 = new double[] { 1.0f };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray19);
        double[] doubleArray21 = new double[] {};
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray19, doubleArray21);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.add(doubleArray19, (double) (short) -1);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray19);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.add(doubleArray19, (double) 3);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray27, 10, (int) (byte) 10);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 3, (int) (byte) 1, (double) 0.0f);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) doubleArray27, 5);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) 10L, (double) (-1L));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-11001011000", "hi!H", "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-11001011000" + "'", str3, "-11001011000");
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                 aAAAa                                                                                               aaaaaAeaaahfalse", "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-10110010", (java.lang.CharSequence) "1      AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "a#a444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH", "                              HIHIH", "AAA4444444444-1A10A0A10A1A10A0A0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH");
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "                           ", "##   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("trueaaahtrueaaahtrueaaahfalse", "                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtrueaaahtrueaaahfalse" + "'", str2, "trueaaahtrueaaahtrueaaahfalse");
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###", "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihih", 52);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah", "HIHIH                                                        aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str3, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        int[] intArray6 = new int[] { (short) -1, '4', 3, 7, (short) 10, 10 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.remove(intArray6, 82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 82, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 52, 3, 7, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                              HIHIH                                                        aaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              HIHIH                                                        aaa" + "'", str2, "                              HIHIH                                                        aaa");
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAA                                                                                               aaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA                                                                                               aaa" + "'", str2, "AAA                                                                                               aaa");
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("10.0a1.", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0a1." + "'", str2, "10.0a1.");
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
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
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI", "1      aaaA1      aaaA10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("     Hi      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi" + "'", str1, "Hi");
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 10);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.clone(byteArray8);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray8, (byte) -1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.", "-1 0 1 100 1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("      a444#a       ", "          a#a444          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) 1);
        short[] shortArray27 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray27, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray27);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray20, shortArray27);
        java.lang.Short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray32);
        java.lang.Short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray33);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray34);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.add(shortArray35, (short) 0);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray35);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray15, shortArray35);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray15, (short) (byte) -1, (int) (byte) 100);
        java.lang.Short[] shortArray45 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray45, (short) 1);
        short[] shortArray54 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray54, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray54);
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray47, shortArray54);
        java.lang.Short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray59);
        java.lang.Short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray60);
        java.lang.Short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray60);
        short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray60);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray63);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray15, shortArray63);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" AAAHIHI...  ", "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa", 26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " AAAHIHI...  " + "'", str4, " AAAHIHI...  ");
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        double[] doubleArray5 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 42);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1.0a0.0                              HIHIH                                                      ...", 10, "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0a0.0                              HIHIH                                                      ..." + "'", str3, "1.0a0.0                              HIHIH                                                      ...");
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str1, "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
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
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 8);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (double) 94);
        double[] doubleArray34 = new double[] {};
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray34, (double) '4', (double) (byte) -1);
        double[] doubleArray42 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray34, doubleArray42);
        double[] doubleArray49 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray50 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray49);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray34, doubleArray49);
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray34);
        double[] doubleArray53 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray52);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray53, (double) 93, (double) 13);
        double[] doubleArray57 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray8, doubleArray53);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.add(doubleArray57, 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 35.0, 94.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, -1.0, 10.0, 35.0]");
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                 aaa                                                            aaaA", 28, "        {}         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 aaa                                                            aaaA" + "'", str3, "                                 aaa                                                            aaaA");
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi..", "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}" + "'", str2, "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "{-1,52,10,1,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444                                AAA444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA" + "'", str1, "44444444444444444444444444444                                AAA444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) " 100 1", (java.lang.CharSequence) "       AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) (short) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, 139, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaa444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa444" + "'", str2, "aaa444");
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) (byte) 0);
        float[] floatArray11 = new float[] { (byte) 10 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (int) (short) 0, (float) (short) -1);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray17, (float) 1L);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray17);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray17, 0.0f, (int) (short) -1);
        java.lang.String str25 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int23, "          ");
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1" + "'", str25, "-1");
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str1, "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.add(doubleArray1, (double) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) (byte) 1, 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###", 0, 1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0.0 1.0 100.0 10.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaa1      aaaa            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAA                                                                                               aaaA", 82, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA                                                                                               aaaA" + "'", str3, "AAA                                                                                               aaaA");
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("10.0a1.aaahaaahaaahaaahaaahaaaha");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0a1.aaahaaahaaahaaahaaahaaaha" + "'", str1, "10.0a1.aaahaaahaaahaaahaaahaaaha");
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        java.lang.Object obj0 = null;
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, '4');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameType(obj0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.remove(shortArray19, 2);
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray21);
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
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("h", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
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
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, 35, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaHihih", "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" AAAHIHI...  ", "{-1,-1,0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " AAAHIHI...  " + "'", str2, " AAAHIHI...  ");
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA" + "'", str1, "AAA");
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAA", "                                AAA", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray13, true, 27);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, false, true, true, false, false]");
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "0.0 1.0 100.0 hi!H0.0 1.0 100.0 ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("... aaa", "AAa       ", 82);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[][] byteArray3 = new byte[][] { byteArray2 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) -1, (int) 'a');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray7);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.clone(byteArray7);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, 26, byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 26, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1]");
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        long[] longArray20 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, (long) (short) 1);
        long[] longArray28 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.add(longArray28, (long) (short) 1);
        long[] longArray34 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(longArray34, (long) ' ');
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.addAll(longArray30, longArray34);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.addAll(longArray20, longArray34);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray20);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray39);
        long[] longArray46 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.add(longArray46, (long) (short) 1);
        long[] longArray52 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(longArray52, (long) ' ');
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.addAll(longArray48, longArray52);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray48);
        long[] longArray62 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.add(longArray62, (long) (short) 1);
        long[] longArray70 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray72 = org.apache.commons.lang3.ArrayUtils.add(longArray70, (long) (short) 1);
        long[] longArray76 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.contains(longArray76, (long) ' ');
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.addAll(longArray72, longArray76);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.addAll(longArray62, longArray76);
        long[] longArray81 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray62);
        long[] longArray82 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray81);
        long[] longArray85 = org.apache.commons.lang3.ArrayUtils.subarray(longArray82, (int) (short) -1, 0);
        long[] longArray86 = org.apache.commons.lang3.ArrayUtils.addAll(longArray56, longArray82);
        long[] longArray87 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray82);
        long[] longArray88 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray90 = org.apache.commons.lang3.ArrayUtils.remove(longArray88, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 9");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        char[] charArray2 = new char[] { ' ', '#' };
        char[] charArray5 = new char[] { ' ', '#' };
        char[] charArray8 = new char[] { ' ', '#' };
        char[] charArray11 = new char[] { ' ', '#' };
        char[][] charArray12 = new char[][] { charArray2, charArray5, charArray8, charArray11 };
        char[] charArray19 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 'a');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray19, ' ');
        char[] charArray30 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray30, 'a');
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray30, '#');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray34);
        char[][] charArray37 = org.apache.commons.lang3.ArrayUtils.add(charArray12, charArray34);
        long[] longArray43 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray45 = org.apache.commons.lang3.ArrayUtils.add(longArray43, (long) (short) 1);
        long[] longArray51 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.add(longArray51, (long) (short) 1);
        long[] longArray57 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.contains(longArray57, (long) ' ');
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.addAll(longArray53, longArray57);
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.addAll(longArray43, longArray57);
        long[] longArray67 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray69 = org.apache.commons.lang3.ArrayUtils.add(longArray67, (long) (short) 1);
        long[] longArray75 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.add(longArray75, (long) (short) 1);
        long[] longArray81 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.contains(longArray81, (long) ' ');
        long[] longArray84 = org.apache.commons.lang3.ArrayUtils.addAll(longArray77, longArray81);
        long[] longArray85 = org.apache.commons.lang3.ArrayUtils.addAll(longArray67, longArray81);
        long[] longArray86 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray81);
        java.lang.Long[] longArray87 = org.apache.commons.lang3.ArrayUtils.toObject(longArray81);
        long[] longArray88 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray87);
        boolean boolean89 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray57, longArray88);
        long[] longArray92 = org.apache.commons.lang3.ArrayUtils.subarray(longArray88, (int) (short) -1, 0);
        java.lang.Long[] longArray93 = org.apache.commons.lang3.ArrayUtils.toObject(longArray92);
        char[][] charArray94 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, (java.lang.Object) longArray92);
        boolean boolean95 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray92);
        int int98 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray92, (long) (short) 0, 7);
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[]");
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertNotNull(charArray94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray11, 99, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                               AAA                                                                                               aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                               AAA                                                                                               aaa" + "'", str1, "                                                               AAA                                                                                               aaa");
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray9 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray14 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[][] floatArray15 = new java.lang.Float[][] { floatArray4, floatArray9, floatArray14 };
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray23 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray27 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray31 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray35 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[][] floatArray36 = new java.lang.Float[][] { floatArray19, floatArray23, floatArray27, floatArray31, floatArray35 };
        java.lang.Float[][] floatArray37 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray15, floatArray36);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray36, 'a');
        java.lang.Object obj40 = null;
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) floatArray36, obj40, 52);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) ",", (java.lang.CharSequence) "               HIHIH               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("truetruetruefalse", "0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ", "0", 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "truetruetruefalse" + "'", str4, "truetruetruefalse");
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  aaaa10", (int) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  aaaa10" + "'", str3, "  aaaa10");
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray8, (byte) 10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                               AAA                                                                                               aaa", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               AAA                                                                                               aaa" + "'", str3, "                                                               AAA                                                                                               aaa");
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "0.01.0100.010.010.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi...", "hihih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" 100 1", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.remove(shortArray6, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.remove(longArray24, (int) (byte) 1);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray24, (long) 100, 28);
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
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("trueaaahtrueaaahtrueaaahfalse", "  ...ihihaaa 11-00011010011-00011010011-00011010011-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtrueaaahtrueaaahfalse" + "'", str2, "trueaaahtrueaaahtrueaaahfalse");
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false", (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       aaa                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        java.lang.String[] strArray3 = new java.lang.String[] { "              1110               ", "100", "                              HIHIH" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray3 };
        java.lang.String[] strArray8 = new java.lang.String[] { "              1110               ", "100", "                              HIHIH" };
        java.lang.String[][] strArray9 = new java.lang.String[][] { strArray8 };
        java.lang.String[][][] strArray10 = new java.lang.String[][][] { strArray4, strArray9 };
        java.lang.String[][][] strArray11 = org.apache.commons.lang3.ArrayUtils.clone(strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[] strArray17 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[] strArray20 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[] strArray23 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[] strArray26 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[][] strArray27 = new java.lang.String[][] { strArray14, strArray17, strArray20, strArray23, strArray26 };
        java.lang.String[] strArray30 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[] strArray33 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[] strArray36 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[] strArray39 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[] strArray42 = new java.lang.String[] { "                                                                                              ", "   " };
        java.lang.String[][] strArray43 = new java.lang.String[][] { strArray30, strArray33, strArray36, strArray39, strArray42 };
        java.lang.String[][][] strArray44 = new java.lang.String[][][] { strArray27, strArray43 };
        java.lang.String[][][] strArray45 = org.apache.commons.lang3.ArrayUtils.addAll(strArray10, strArray44);
        java.lang.Object[][][] objArray46 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Object[][][]) strArray44);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "aaa                                ", "aaahihi..");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("10.0a1", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0a1" + "'", str2, "10.0a1");
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        byte[] byteArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a", "1      AAAA1      AAAA10", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, false, 35);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, true);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, false);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, true, 52);
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
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false, true, true]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", (int) (short) 0, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (byte) 1, (double) ' ');
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) (short) -1, (int) (byte) -1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) 64, 18, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (short) 10, 10);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray8);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) 3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.remove(floatArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
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
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, 3.0]");
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("A1A10A0A0", "", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "-,-,-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA" + "'", str2, "ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA");
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("10.0a1.0", "0.1a0.01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0a1.0" + "'", str2, "10.0a1.0");
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" 100 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100 1" + "'", str1, "100 1");
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils1 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils2 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils3 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray4 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils0, arrayUtils1, arrayUtils2, arrayUtils3 };
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray5 = org.apache.commons.lang3.ArrayUtils.clone(arrayUtilsArray4);
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray6 = org.apache.commons.lang3.ArrayUtils.toArray(arrayUtilsArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) arrayUtilsArray4);
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray10 = org.apache.commons.lang3.ArrayUtils.subarray(arrayUtilsArray4, 28, 14);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("AAA", strArray14);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) arrayUtilsArray10, (java.lang.Object) "AAA", 42);
        org.junit.Assert.assertNotNull(arrayUtilsArray4);
        org.junit.Assert.assertNotNull(arrayUtilsArray5);
        org.junit.Assert.assertNotNull(arrayUtilsArray6);
        org.junit.Assert.assertNotNull(arrayUtilsArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        long[] longArray30 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.add(longArray30, (long) (short) 1);
        long[] longArray36 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.contains(longArray36, (long) ' ');
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.addAll(longArray32, longArray36);
        java.lang.Long[] longArray46 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray46);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.addAll(longArray39, longArray47);
        long[] longArray54 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.add(longArray54, (long) (short) 1);
        long[] longArray62 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.add(longArray62, (long) (short) 1);
        long[] longArray68 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.contains(longArray68, (long) ' ');
        long[] longArray71 = org.apache.commons.lang3.ArrayUtils.addAll(longArray64, longArray68);
        long[] longArray72 = org.apache.commons.lang3.ArrayUtils.addAll(longArray54, longArray68);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray54, (-1L), 4);
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.addAll(longArray47, longArray54);
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.addAll(longArray24, longArray47);
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.add(longArray47, (long) 10);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray47);
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
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[-1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[100, 1, -1, 0, 1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray4 = new double[] {};
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) '4', (double) (byte) -1);
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 139);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("100", "                                                                 AAA                                                                                               aaa", "false");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaa                  ...", "                                                                                                 aaa", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("trueaaahtrueaaahtrueaaahfalse", "aaahihi#..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray15 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, '4');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray17);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) ' ', 4);
        java.lang.Class<?> wildcardClass24 = charArray23.getClass();
        short[] shortArray31 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) (byte) 0, (-1));
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.add(shortArray31, (short) (byte) -1);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.clone(shortArray31);
        java.lang.Class<?> wildcardClass38 = shortArray31.getClass();
        java.lang.reflect.Type[] typeArray39 = new java.lang.reflect.Type[] { wildcardClass24, wildcardClass38 };
        java.lang.reflect.Type[] typeArray41 = org.apache.commons.lang3.ArrayUtils.remove(typeArray39, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) typeArray41, '#', 1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aAA", "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "{-1,-1,0}", "{}0.0----------------------------------------------------------------aaa----------------------");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("{97,0,1,100,0}", 13, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{97,0,1,100,0}" + "'", str3, "{97,0,1,100,0}");
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAA1######AAAA#############", "   ", 52, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   " + "'", str4, "   ");
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                aaa                                 ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "       aAA");
        double[] doubleArray5 = new double[] { 1.0f };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray5);
        double[] doubleArray7 = new double[] {};
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) doubleArray5, (int) (short) 1);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray15 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray15, (double) 100);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray17);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray17, (double) 10L);
        double[] doubleArray27 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (double) 100);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray29, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray29);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray17, doubleArray29);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray11, doubleArray17);
        java.lang.Double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray11);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray11, 82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 82, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1.0a0.0", "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 0, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi..", "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        java.lang.Character[] charArray9 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, '4');
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray11);
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.toObject(charArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH!ih", charArray11);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 3, 'a');
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       AAA", charArray11);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray11, ' ');
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny(" ", charArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray21, 'a');
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a#aa444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a#aa444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, a, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a, 4, 4, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       AAA", "      a444#a       ", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hihi...", "a444#a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi..." + "'", str2, "hihi...");
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("       AAA", 42, "     HIHIH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       AAA     HIHIH     HIHIH     HIHIH  " + "'", str3, "       AAA     HIHIH     HIHIH     HIHIH  ");
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("trueaaahtru   eaaahfalse", "100.00.0-1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 1, (int) (short) 10);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) (byte) 0, (byte) -1);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray9);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray9, (byte) 100);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray9);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray20);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray20);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray20);
        java.lang.Byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray27);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) byteArray28);
        java.lang.Byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray28);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray28, ' ', (int) '#', 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "101101" + "'", str29, "101101");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 1, 10, 1]");
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                               AAA                                                                                               aaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 164 + "'", int1 == 164);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.1A0.01", "                                 aaa                                             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hihih", "falsefalsetruefalsefalsetruetruetruefalse", 1);
        java.lang.String str5 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) strArray3, "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{hihih}" + "'", str5, "{hihih}");
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A", "aaa                                                                                               aaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
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
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray22);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAA1      AAAA            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaa                                ", "      AAAA1      AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa                                " + "'", str2, "aaa                                ");
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HIHIH                              ", " AAAHIHI...  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) 10L, (int) (short) 100);
        java.lang.String str9 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int8);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(",", 64, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, ",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                       AAa       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 10);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, 1);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (-1));
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                    ", "HIHIH                                                        aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (float) (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) (short) 0);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray6, 14, 82);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaa");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("H", (java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "{true,false,false,f   h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        double[] doubleArray2 = new double[] { (short) 0, 'a' };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray2, (double) 1, (double) 2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray2, (double) 1L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, (double) 65);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", "HI                        ", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4", 13, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-11001011000-11001011000-11001011000-11 aaahihi...  ", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-11001011000-11001011000-11001011000-11 aaahihi...  " + "'", str2, "-11001011000-11001011000-11001011000-11 aaahihi...  ");
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        char[][] charArray0 = null;
        char[] charArray3 = new char[] { ' ', '#' };
        char[] charArray6 = new char[] { ' ', '#' };
        char[] charArray9 = new char[] { ' ', '#' };
        char[] charArray12 = new char[] { ' ', '#' };
        char[][] charArray13 = new char[][] { charArray3, charArray6, charArray9, charArray12 };
        char[] charArray20 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray20, 'a');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray20, ' ');
        char[] charArray31 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.add(charArray31, 'a');
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray31, '#');
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray20, charArray35);
        char[][] charArray38 = org.apache.commons.lang3.ArrayUtils.add(charArray13, charArray35);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray13, ' ');
        char[][] charArray41 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray13);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray0, "-11001011000-11001011000-11001011000-11 aaahihi...  ", 27, 4);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #]");
        org.junit.Assert.assertNotNull(charArray13);
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
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray19);
        java.lang.Boolean[] booleanArray25 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        java.lang.Long[] longArray34 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray34);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray34, (java.lang.Object) (short) 100);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray25, (java.lang.Object) longArray34);
        java.lang.Boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray41);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray42, false, 19);
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
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, true, true, false, true, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
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
        long[] longArray69 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray71 = org.apache.commons.lang3.ArrayUtils.add(longArray69, (long) (short) 1);
        long[] longArray77 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.add(longArray77, (long) (short) 1);
        long[] longArray83 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.contains(longArray83, (long) ' ');
        long[] longArray86 = org.apache.commons.lang3.ArrayUtils.addAll(longArray79, longArray83);
        long[] longArray87 = org.apache.commons.lang3.ArrayUtils.addAll(longArray69, longArray83);
        long[] longArray88 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray69);
        long[] longArray89 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray88);
        long[] longArray91 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray89, (long) 0);
        long[] longArray93 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray91, (long) 2);
        long[] longArray94 = org.apache.commons.lang3.ArrayUtils.clone(longArray91);
        long[] longArray95 = org.apache.commons.lang3.ArrayUtils.addAll(longArray63, longArray94);
        long[] longArray96 = org.apache.commons.lang3.ArrayUtils.clone(longArray95);
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
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray94), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[97, 1, 100, 0, -1, -1, 0, 97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray96), "[97, 1, 100, 0, -1, -1, 0, 97, 1, 100, 0]");
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0" + "'", str1, "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0");
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray14);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, 0L, 164);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAA", "       AAA                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA" + "'", str2, "AAA");
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, (float) (short) 100);
        float[] floatArray18 = new float[] { (byte) 10 };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) (-1));
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) '4');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray20);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray20);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (float) (short) 0);
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
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0]");
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HIHIH                                                        aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIH                                                        aaa" + "'", str1, "HIHIH                                                        aaa");
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("1110", "false0false0true0true0false0true");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa", ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("100 1", "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", "-1a10a0a10a1a10a0a0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100 1" + "'", str3, "100 1");
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "              1110               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("false0false0true0true0false0true", "aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false0false0true0true0false0true" + "'", str2, "false0false0true0true0false0true");
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H", "0.0 1.0 100.0 hi!H0.0 1.0 100.0 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAA", "  10110010aa", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray5);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.remove(floatArray1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 1");
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
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0]");
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAA1      AAAA", "  aaaa10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA1      AAAA" + "'", str2, "AAAA1      AAAA");
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray8, (byte) -1);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray11, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10.0a1.", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("-1A10A0A10A1A10A0A0", "aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                    ", 100, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a1a10a0a0", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a1a10a0a0" + "'", str2, "a1a10a0a0");
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) (byte) 0);
        float[] floatArray11 = new float[] { (byte) 10 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) (-1));
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray11, 0.0f, 100);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray11, (float) 0L);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray18, 10, (int) (byte) 10);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray18, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray24, (float) (short) 10);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(floatArray24, (float) 0L);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray4, floatArray24);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", " HIHIH10     HIHIH0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("... aaa", "-11001011000-11001011000-11001011000-11 aaahihi...  ", 12, 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "... aa-11001011000-11001011000-11001011000-11 aaahihi...  " + "'", str4, "... aa-11001011000-11001011000-11001011000-11 aaahihi...  ");
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444                                AAA44444444hi", (int) (byte) 1, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444..." + "'", str3, "4444444444444444444444444...");
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                              ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1110", "       aAA", (-1));
        java.lang.String[] strArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray3, strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(" AAAHIHI...  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1110" + "'", str9, "1110");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ...ihihaaa 11-00011010011-00011010011-00011010011-", "                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0.01.0100.010.010.0-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.01.0100.010.010.0-1.0" + "'", str1, "0.01.0100.010.010.0-1.0");
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1      AAAA1      AAAA1", 24, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1      AAAA1      AAAA1" + "'", str3, " 1      AAAA1      AAAA1");
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("{{ ,#},{ ,#},{ ,#},{ ,#}}", "a#a444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HIHIH######################", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIH######################" + "'", str2, "HIHIH######################");
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaah", "AAAA1######AAAA#############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaah" + "'", str2, "aaah");
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-1a10a0a10a1a10a0a0", "       AAA     HIHIH     HIHIH     HIHIH  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1a10a0a10a1a10a0a0" + "'", str2, "-1a10a0a10a1a10a0a0");
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaHihih", "                              HIHIH                                                        aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aa                                ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
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
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(longArray61, 10L);
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                aaa                                 ", "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("A", "------------aaa----------------------------------1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "      aaa", "                                 aaa                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1.0a0.0                              HIHIH                                                      ...", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        long[] longArray0 = null;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray1);
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
        long[] longArray38 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.add(longArray38, (long) (short) 1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray32, longArray40);
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.addAll(longArray3, longArray32);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray42, (long) 2);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray44);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
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
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1" + "'", str2, "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "1      aaaA1      aaaA10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                             {}                                              ", 164, 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        long[] longArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) 12, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "{100,1,-1,0,1,");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("      aaaA", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("{-1,52,10,1,0}", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{-1,52,10,1,0}" + "'", str5, "{-1,52,10,1,0}");
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "-,-,-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-,-,-" + "'", str1, "-,-,-");
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                 aaa                                                            aaaA", "{-1,0,1,100,1}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 aaa                                                            aaaA" + "'", str2, "                                 aaa                                                            aaaA");
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", "hihi...", (int) (byte) 100, 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444hihi..." + "'", str4, "444444444hihi...");
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0", "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray6, "                                                                aaa                                 ");
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray12, 100.0f);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, (float) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray14);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str11, "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, 10.0, 10.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        float[] floatArray10 = new float[] { (byte) 10 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray14);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray14, (float) 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, 10.0f, (int) (byte) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, (float) (short) 1, 0);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray14);
        float[] floatArray26 = new float[] { (byte) 10 };
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.add(floatArray26, (float) (-1));
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray26);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.add(floatArray29, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray29);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray29);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(floatArray29, (float) 2);
        java.lang.Class<?> wildcardClass37 = floatArray29.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("trueaaahitrueaaahitrueaaahifalse", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true   hitrue   hitrue   hif lse" + "'", str3, "true   hitrue   hitrue   hif lse");
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
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
        float[] floatArray31 = new float[] { (byte) 10 };
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (float) (-1));
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.add(floatArray33, (float) '4');
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray35);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.add(floatArray35, (float) (-1L));
        float[] floatArray40 = new float[] { (byte) 10 };
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.add(floatArray40, (float) (-1));
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.add(floatArray42, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray42);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray38, floatArray42);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray38, (float) 35, (-1));
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.add(floatArray38, (float) (byte) 100);
        float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray51);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(floatArray51, 10.0f);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray29, floatArray51);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray29, (float) (short) 1, 1);
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
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 3);
        boolean[] booleanArray15 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray22 = new boolean[] { false, false, true, true, false, true };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray15, booleanArray22);
        java.lang.String str25 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray15, "trueaaahtru   eaaahfalse");
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray0, (java.lang.Object) str25, 94);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{true,false,false,false,true,false}" + "'", str25, "{true,false,false,false,true,false}");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
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
        org.apache.commons.lang3.ArrayUtils.reverse(longArray58);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray58);
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A", "false", "0.0 1.0 100.0 hi!H0.0 1.0 100.0 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaa", "0     HIHIH0     HIHIH10    {}");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("true", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true" + "'", str2, "true");
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (int) '4', (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 5");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaa                                                                                               aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("1      AAAA1      AAAA10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1      AAAA1      AAAA10" + "'", str1, "1      AAAA1      AAAA10");
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.1a0.01", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "{true,true,true,false}", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17 + "'", int15 == 17);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi." + "'", str1, "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi.");
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("-,-,-", "0.0A                                                                AAA                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("     HIHIAaa                            aaaA", "                                                                                              aaa", "                                    ##1      AAAA1      AAAA1##                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     HIHIAaa                            aaaA" + "'", str3, "     HIHIAaa                            aaaA");
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "##                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##                                                                                                 " + "'", str1, "##                                                                                                 ");
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-11001011000-11001011000-11001011000-11 aaahihi..." + "'", str1, "-11001011000-11001011000-11001011000-11 aaahihi...");
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (short) 1);
        long[] longArray12 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) ' ');
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray12);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray8);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray16, 0L);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("     Hi      ", "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hihih", ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihih" + "'", str2, "hihih");
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAA                                                                                               aaa", "      aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                             ", "                                                                 AAAAA                                                                                               AAAAAAEAAAHFALSE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("H", "                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaahihi#..", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               aaahihi#.." + "'", str2, "               aaahihi#..");
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaa", (java.lang.CharSequence) "{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 65);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 99);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Aaaaaa                                                                                               aAAAa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, (long) '#', (int) (short) 100);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, 1L);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray19);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray19, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray34 = org.apache.commons.lang3.ArrayUtils.add(longArray19, 12, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 3");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1, 0, 1]");
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("{{ ,#},{ ,#},{ ,#},{ ,#}}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{{,#},{,#},{,#},{,#}}" + "'", str1, "{{,#},{,#},{,#},{,#}}");
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE" + "'", str1, "TRUE");
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (short) -1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.io.Serializable[] serializableArray9 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) strArray2, (java.io.Serializable) "");
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray12, (double) 1);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) serializableArray9, (java.lang.Object) doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15, (double) 7);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 13, (int) '#', (double) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("{true,true,true,false}", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{true,true,true,false}  " + "'", str2, "{true,true,true,false}  ");
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray14, 0L);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                AAA                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                AAA                                 " + "'", str1, "                                                                AAA                                 ");
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("trueaaahitrueaaahitrueaaahifalse", "true", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("###", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "{{,#},{,#},{,#},{,#}}", "0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("              1110               ", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HIHIH", "hihi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIH" + "'", str2, "HIHIH");
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAA                                                                                               aaa", 139, "   h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA                                                                                               aaa   h   h   h   h   h   h   h   h   h  " + "'", str3, "AAA                                                                                               aaa   h   h   h   h   h   h   h   h   h  ");
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAA4444444444-1A10A0A10A1A10A0A0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("   ", "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "                                             {}                                              ", (int) (short) -1, 106);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                             {}                                              " + "'", str4, "                                             {}                                              ");
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("##   ", "{-1,-1,0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray17, false);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, false, (int) ' ');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray17, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "10.0a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-1,10,0,10,1,10,0,0}" + "'", str1, "{-1,10,0,10,1,10,0,0}");
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", 1000, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}", "                                                                AAA                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10.0a1.0", 2, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.0a1.0" + "'", str3, "10.0a1.0");
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray9);
        java.lang.Byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) byteArray11);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray11, (byte) 0);
        java.lang.Class<?> wildcardClass15 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-10110010" + "'", str12, "-10110010");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1      AAAA1      AAAA", "              1110               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("h", "-11001011000-11001011000-11001011000-11 aaahihi...  ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaahihi..", (java.lang.CharSequence) " 100 1");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaahihi.." + "'", charSequence2, "aaahihi..");
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.", "                                AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        long[] longArray20 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, (long) (short) 1);
        long[] longArray28 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.add(longArray28, (long) (short) 1);
        long[] longArray34 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(longArray34, (long) ' ');
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.addAll(longArray30, longArray34);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.addAll(longArray20, longArray34);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray20);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray39);
        long[] longArray46 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.add(longArray46, (long) (short) 1);
        long[] longArray52 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(longArray52, (long) ' ');
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.addAll(longArray48, longArray52);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray48);
        long[] longArray62 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.add(longArray62, (long) (short) 1);
        long[] longArray70 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray72 = org.apache.commons.lang3.ArrayUtils.add(longArray70, (long) (short) 1);
        long[] longArray76 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.contains(longArray76, (long) ' ');
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.addAll(longArray72, longArray76);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.addAll(longArray62, longArray76);
        long[] longArray81 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray62);
        long[] longArray82 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray81);
        long[] longArray85 = org.apache.commons.lang3.ArrayUtils.subarray(longArray82, (int) (short) -1, 0);
        long[] longArray86 = org.apache.commons.lang3.ArrayUtils.addAll(longArray56, longArray82);
        long[] longArray87 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray82);
        int int89 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) (byte) 0);
        long[] longArray91 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray14, (long) 19);
        long[] longArray92 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray94 = org.apache.commons.lang3.ArrayUtils.remove(longArray14, 164);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 164, Length: 9");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 8 + "'", int89 == 8);
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                       AAa       ", "aAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "{true,false,false,false,true,false}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) 0L);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray1);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse", "  ...ihihaaa 11-00011010011-00011010011-00011010011-", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HIHIH######################", (java.lang.CharSequence) "hi..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, (int) ' ', 10);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.toObject(intArray8);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = org.apache.commons.lang3.ArrayUtils.add(intArray8, 12, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 0");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("1110", "1      aaaA1      aaaA10", "44444444444444444444444444444aaa444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1110" + "'", str3, "1110");
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" + "'", str1, "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0.1A0.01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaahihi..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false", 7, "hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false" + "'", str3, "false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false");
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "      AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1      aaaa1      aaaa10", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0.0A                                                                AAA                          ", "H", "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0A                                                                AAA                          " + "'", str3, "0.0A                                                                AAA                          ");
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("false", "aaa444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false" + "'", str2, "false");
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("   h", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("TRUE", "AAAA1      AAAA            ", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("      AAAA1      AAAA", "44444444444444444444444444444                                AAA44444444hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("{-1,52,10,1,0}", "                                 aAAAa                                                                                               aaaaaA", "-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{-1,52,10,1,0}" + "'", str3, "{-1,52,10,1,0}");
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "aaah", 516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aAA", 3, "-11001011000-11001011000-11001011000-11 aaahihi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAA" + "'", str3, "aAA");
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(charArray11, '#');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(charArray11, '#');
        java.lang.String str17 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray11, "1      AAAA1      AAAA10");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{a,#,a,4,4,4}" + "'", str17, "{a,#,a,4,4,4}");
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray7, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("false", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa", "0.0   1.0   100.0   10.0   10.0   -1.0", 33);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray13);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray18, 'a');
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray22, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray22, 100, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1a10a0a10a1a10a0a0" + "'", str21, "-1a10a0a10a1a10a0a0");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, 'a', 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "{100,1,-1,0,1,0}", (java.lang.CharSequence) "IH!ih");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "{100,1,-1,0,1,0}" + "'", charSequence2, "{100,1,-1,0,1,0}");
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
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
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray54);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                 aaa", " hi!4hi! hi!ahi!ahi!4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("               HIHIH               ", "H  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               HIHIH               " + "'", str2, "               HIHIH               ");
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-1,10,0,10,1,10,0,0}" + "'", str1, "{-1,10,0,10,1,10,0,0}");
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaahihi..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaahihi.." + "'", str1, "aaahihi..");
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("      AAAA1      AAA", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("falsefalsetruefalsefalsetruetruetruefalse", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                              ", charArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = org.apache.commons.lang3.ArrayUtils.add(charArray10, (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("       aAA", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 2, 10);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 4, 13);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 516);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray1, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("-11001011000-11001011000-11001011000-11 aaahihi...", "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAA1      AAAA", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA1      AAAA" + "'", str2, "AAAA1      AAAA");
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              HIHIH                                                        aaa", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, 13, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("IH!ih", "trueaaahtru   eaaahfalse");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        boolean[][][] booleanArray0 = null;
        boolean[][][] booleanArray3 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, 19, (int) (byte) 0);
        org.junit.Assert.assertNull(booleanArray3);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "  HIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray9, '4');
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray12, '#');
        char[] charArray19 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.toObject(charArray19);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, '4');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.clone(charArray19);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               HIHIH               ", charArray24);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray12, charArray24);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                             {}                                              ", charArray12);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        char[] charArray2 = new char[] { ' ', '#' };
        char[] charArray5 = new char[] { ' ', '#' };
        char[] charArray8 = new char[] { ' ', '#' };
        char[] charArray11 = new char[] { ' ', '#' };
        char[][] charArray12 = new char[][] { charArray2, charArray5, charArray8, charArray11 };
        char[] charArray19 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 'a');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray19, ' ');
        char[] charArray30 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray30, 'a');
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray30, '#');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray34);
        char[][] charArray37 = org.apache.commons.lang3.ArrayUtils.add(charArray12, charArray34);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray12, ' ');
        char[] charArray47 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.add(charArray47, 'a');
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.add(charArray47, ' ');
        char[] charArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray47);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(charArray47, 'a');
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(charArray47, 'a');
        char[] charArray60 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray61 = org.apache.commons.lang3.ArrayUtils.toObject(charArray60);
        char[] charArray63 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray60, '4');
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray47, charArray60);
        char[] charArray72 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray74 = org.apache.commons.lang3.ArrayUtils.add(charArray72, 'a');
        char[] charArray76 = org.apache.commons.lang3.ArrayUtils.add(charArray72, ' ');
        char[] charArray77 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray72);
        int int78 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray77);
        char[] charArray79 = org.apache.commons.lang3.ArrayUtils.addAll(charArray47, charArray77);
        java.lang.Character[] charArray85 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray87 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray85, ' ');
        char[] charArray88 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray85);
        boolean boolean89 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray47, charArray88);
        // The following exception was thrown during execution in test generation
        try {
            char[][] charArray90 = org.apache.commons.lang3.ArrayUtils.add(charArray12, (int) (short) -1, charArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[#,  ]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), " 4 aa4 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), " 4 aa4 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[ , 4,  , a, a, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray88), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray88), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray88), "[#, #, 4, a, #]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4", (java.lang.CharSequence) "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4" + "'", charSequence2, "atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4");
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        java.lang.Byte[] byteArray26 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 0);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray27);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray27);
        java.lang.Byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray32);
        java.lang.Byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray33);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray34, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.add(byteArray36, (int) 'a', (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 16");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                aAA         ", "100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, 3, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.remove(shortArray19, 2);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) 1);
        short[] shortArray34 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray34, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray34);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray34);
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.add(shortArray39, (short) 10);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray22, shortArray39);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(shortArray39, (short) 10);
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
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[-1, 10, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..", 164, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi.." + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..");
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                       AAA", "HIHIH                              ", 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(",", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        java.lang.Long[][][][] longArray0 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) (byte) 1, 8);
        java.lang.Long[][][][] longArray4 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray7 = org.apache.commons.lang3.ArrayUtils.subarray(longArray4, (int) (byte) 1, 8);
        java.lang.Long[][][][] longArray8 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray4, 'a', 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray8);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, 19, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 19, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HIHIH                              ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0     HIHIH0     HIHIH10    {}", "                                                                 aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0     HIHIH0     HIHIH10    {}" + "'", str2, "0     HIHIH0     HIHIH10    {}");
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("... aa-11001011000-11001011000-11001011000-11 aaahihi...  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 10L);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, 100.0d, 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        float[] floatArray1 = new float[] { (-1L) };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 100);
        float[] floatArray5 = new float[] { (byte) 10 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1));
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) 2, 10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray5);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray5, (float) '#');
        java.lang.String str16 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) '#', "       AAA     HIHIH     HIHIH     HIHIH  ");
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#" + "'", str16, "#");
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                              HIHIH                                                        aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("{true,true,true,false}  ", "       aAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "TRUE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray4 = new double[] {};
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) '4', (double) (byte) -1);
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 7);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (-1.0f));
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaahihi..", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahihi.." + "'", str2, "aaahihi..");
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "10.0a1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "          a#a444          ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("1      aaaA1      aaaA10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1      aaaA1      aaaA1" + "'", str1, "1      aaaA1      aaaA1");
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a#a444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L };
        java.lang.Long[][] longArray12 = new java.lang.Long[][] { longArray1, longArray3, longArray5, longArray7, longArray9, longArray11 };
        java.lang.Long[][] longArray14 = org.apache.commons.lang3.ArrayUtils.remove(longArray12, 3);
        java.lang.Long[][] longArray16 = org.apache.commons.lang3.ArrayUtils.remove(longArray14, 0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray16);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (int) (short) 0, (short) (byte) 100);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray15, (short) 1, 27);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, 42, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[100, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi...", "AAAA1######AAAA#############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("10.0a1.0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.01.0" + "'", str2, "10.01.0");
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 0, (short) 1, (short) 0, (short) 0 };
        java.lang.Short[][] shortArray5 = new java.lang.Short[][] { shortArray4 };
        java.lang.Short[][][] shortArray6 = new java.lang.Short[][][] { shortArray5 };
        java.lang.Short[][][] shortArray7 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray6);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        java.lang.Short[][][] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray7, (java.lang.Object) intArray8);
        int[] intArray12 = new int[] {};
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray12, (int) (short) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, (int) '#', 0);
        int[] intArray24 = new int[] { (-1), '4', (byte) 10, 1 };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray24, (int) (short) 100, 100);
        int[] intArray28 = new int[] {};
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray28, (int) (short) 1);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.subarray(intArray28, (int) (short) 0, (int) (short) -1);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray24, intArray28);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.add(intArray24, 0);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray24, (int) 'a', 0);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray24);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray8, intArray12);
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.add(intArray8, 21);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[21]");
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0", "1      aaaA1      aaaA1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0" + "'", str2, "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0");
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("{{{              1110               ,100,                              HIHIH}},{{              1110               ,100,                              HIHIH}}}", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HIHIH                                                        aaa", 82, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIH                                                        aaa##################" + "'", str3, "HIHIH                                                        aaa##################");
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("trueaaa", "aaa                                                                                               aaaa", "     HIHIH");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        int[] intArray6 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.toObject(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray7, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("aaa                                ", (java.lang.Object[]) intArray7);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0aaa                                10aaa                                1aaa                                1aaa                                0" + "'", str10, "0aaa                                10aaa                                1aaa                                1aaa                                0");
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaa444", "1      aaaa1      aaaa10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa444" + "'", str2, "aaa444");
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("1      aaaa1      aaaa10", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1      aaaa1      aaaa10" + "'", str2, "1      aaaa1      aaaa10");
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H  ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.subarray(strArray2, (int) 'a', (int) '4');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaA1110aaaA1110aaaA1110aaaA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        short[] shortArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, '4');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH!ih", charArray10);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.add(charArray10, 3, 'a');
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       AAA", charArray10);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray19, '4', 0, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a#aa444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a#aa444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, a, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
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
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 8);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (double) 94);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) (short) 1, 27);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) ' ', 24, (double) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 35.0, 94.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 1.0d };
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { 1.0d };
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 1.0d };
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { 1.0d };
        java.lang.Double[][] doubleArray8 = new java.lang.Double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7 };
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray12, (double) 1);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray12);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray12, (double) 8);
        float[] floatArray20 = new float[] { (byte) 10 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (-1));
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray20);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (int) (short) 0, (float) (short) -1);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray26, (float) (byte) -1);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray26);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray26, (float) '#');
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray31, (int) (byte) 10, 27);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray12, (java.lang.Object) (byte) 10);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double[][] doubleArray37 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, 27, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 27, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 1.0]");
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("trueaaahtru   eaaahfalse", "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtru   eaaahfalse" + "'", str2, "trueaaahtru   eaaahfalse");
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                 ", "aAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI", "HI                        ", "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{-" + "'", str3, "{-");
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 100.0d, (-1.0d), (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray7, '4', 2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("-11001011000", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-11001011000" + "'", str2, "-11001011000");
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" 100 1", "{hihih}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("101101", 64, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "101101" + "'", str3, "101101");
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("       AAA                  ", 139);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-1a10a0a10a1a10a0a", "H  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1a10a0a10a1a10a0a" + "'", str2, "-1a10a0a10a1a10a0a");
    }
}

