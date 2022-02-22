import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "trueaaah      aaaAhifalse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Trueaaah      aaaAhifalse" + "'", str1, "Trueaaah      aaaAhifalse");
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AHAAAHAAAHAAAHAAAHAAAHAAA.1A0.01AAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1AAAAAAAA1", "  hihih", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) 244, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 1, (int) (short) 10);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) (byte) 0, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray7, "aaaA");
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray7, (byte) 10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!ih", "                                                                                              aaa", 4);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray19, (byte) -1, (int) 'a');
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray19, (byte) 10);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray19);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.add(byteArray25, (byte) -1);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray25, (int) (short) -1, 0);
        java.lang.Byte[] byteArray36 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray36);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray25, byteArray37);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray16, (java.lang.Object) byteArray37, 24);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray11, byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.remove(byteArray37, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...ihihaaa 11-00011010011-00011010011-00011010011-", "###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ihihaaa 11-00011010011-00011010011-00011010011-" + "'", str2, "...ihihaaa 11-00011010011-00011010011-00011010011-");
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray1, (byte) 1, (int) (short) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray1, (int) (byte) 0, (byte) -1);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1 };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray10, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray10);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray10, (byte) 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray1, byteArray10);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray21, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray21);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray21);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray21);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray21);
        java.lang.Byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray28);
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.split("", "");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray33);
        int int35 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray33);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.stripAll(strArray33, "aaa");
        java.lang.String[] strArray41 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi", "hi", (int) 'a');
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray41);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray41, 'a', (int) ' ', 3);
        int int47 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray41);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0.0       ", strArray37, strArray41);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray29, (java.lang.Object[]) strArray41);
        int int50 = org.apache.commons.lang3.StringUtils.indexOfAny("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.", strArray41);
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.stripAll(strArray41, "1      aaaA1      aaaA10");
        int int53 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray41);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0.0       " + "'", str48, "0.0       ");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0" + "'", str1, "1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0");
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!ih", "                                                                                              aaa", 4);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) -1, (int) 'a');
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) (short) -1, 0);
        java.lang.Byte[] byteArray23 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray23);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray24);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) byteArray24, 24);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 100);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) -1, 19);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(byteArray24, (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        java.lang.Double[] doubleArray13 = new java.lang.Double[] { 0.0d, 10.0d };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray13);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray14);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray10, (java.lang.Object) doubleArray14, 1);
        double[] doubleArray18 = new double[] {};
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) '4', (double) (byte) -1);
        double[] doubleArray26 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray18, doubleArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 100, (double) 100);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) (-1.0f), (double) (byte) 1);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray14, doubleArray18);
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray37);
        double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray38, (double) 0L);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray40, 100.0d);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray40, (double) 100L);
        java.lang.Double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray40);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray45, 0.0d);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray47, (double) 1L, 33, (double) 1.0f);
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray34, doubleArray47);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 10.0, 10.0, 1.0]");
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, 106, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 106, Length: 5");
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
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, false, false, true]");
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIHI...", "       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                 ", "eslfiheurtiheurtiheurt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray37 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.add(longArray37, (long) (short) 1);
        long[] longArray43 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(longArray43, (long) ' ');
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.addAll(longArray39, longArray43);
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray43);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray29, (-1L), 4);
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.addAll(longArray22, longArray29);
        java.lang.Long[] longArray52 = org.apache.commons.lang3.ArrayUtils.toObject(longArray51);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray51);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.clone(longArray51);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                          ", "                            aaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 0);
        java.lang.Byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("Aaa                            aaaA", (java.lang.Object[]) byteArray10);
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray10);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) 100);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10);
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        char[] charArray3 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 8, (int) ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 28, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0.0 1.0 100.0 10.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10, (float) 98);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray13);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("{10.0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{10.0}" + "'", str1, "{10.0}");
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        long[][] longArray0 = new long[][] {};
        long[] longArray3 = new long[] { 'a', (byte) 100 };
        long[] longArray6 = new long[] { 'a', (byte) 100 };
        long[] longArray9 = new long[] { 'a', (byte) 100 };
        long[] longArray12 = new long[] { 'a', (byte) 100 };
        long[] longArray15 = new long[] { 'a', (byte) 100 };
        long[] longArray18 = new long[] { 'a', (byte) 100 };
        long[][] longArray19 = new long[][] { longArray3, longArray6, longArray9, longArray12, longArray15, longArray18 };
        long[][] longArray20 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray19);
        float[] floatArray22 = new float[] { (byte) 10 };
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) (-1));
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) '4');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray24);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(floatArray24, (float) 99);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) 516);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray20, (java.lang.Object) floatArray31);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (float) 106);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray34, 432, 55);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0, -1.0, 516.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0, -1.0, 516.0, 106.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[]");
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
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
            char[] charArray45 = org.apache.commons.lang3.ArrayUtils.remove(charArray42, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 73, Length: 5");
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
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "      aaaA");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("aaahihi..", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("a444#a", 'a');
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("### 1.0 ### 100.0 ### 10.0 ### 10.0 ### -1.0", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    aa-10110010", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    aa-10110010" + "'", str12, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    aa-10110010");
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0", "hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0" + "'", str2, "                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0");
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
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
        java.lang.Byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray33);
        java.lang.Byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray35);
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
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray36);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1L);
        double[] doubleArray18 = new double[] {};
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) '4', (double) (byte) -1);
        double[] doubleArray26 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray18, doubleArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 100, (double) 100);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray18);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (-1L));
        double[] doubleArray37 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray37, (double) 100);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray39, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray39);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray43, (double) 10.0f);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.add(doubleArray45, 100.0d);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray47, (double) 35, (double) 99);
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray47, (double) (short) 10);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray52, (double) 0.0f);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray33, doubleArray52);
        double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray33, 0, (int) (byte) 10);
        double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray58, (double) 100);
        double[] doubleArray61 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray58);
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray61, (double) '#');
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray61, (double) 1.0f, (double) 19);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray68 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray61, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 73, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
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
        java.lang.Float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray22);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray22, (float) 25, 19);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.0       0.0       0.0       0.0      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, false, 35);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, 28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                       AAa       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "1001-1010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray23 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, (-1));
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray23);
        java.lang.Short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray28, (short) 10);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray30, (short) 0);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.clone(shortArray30);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.add(shortArray30, 42, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 2");
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
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[-1, 10]");
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("          A#A444          {-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          A#A444          {-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1," + "'", str1, "          A#A444          {-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray15, 35, (int) (short) -1);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false, (int) '#');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, false, 2);
        boolean[] booleanArray31 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray36 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray36, false);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray38);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray38);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray31, booleanArray38);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray31);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.add(booleanArray31, (int) (short) 1, false);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray45);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false, (int) (short) 1);
        boolean[] booleanArray50 = null;
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray15, booleanArray50);
        boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, false);
        boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray53);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray54);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[false, false, true, true, false, true, false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray21, "{0,0,10,1,10,0}");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray18, (java.lang.Object) strArray26, (int) (byte) 10);
        java.lang.Short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray18);
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(shortArray29);
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", "                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "{-1,10,0,10,1,10,0,0}", 4);
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1." + "'", str9, "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        java.lang.Boolean[] booleanArray24 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray24, false);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray26);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray28);
        boolean[] booleanArray36 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray43 = new boolean[] { false, false, true, true, false, true };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray36, booleanArray43);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray43, false);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray43, false, (int) (short) 0);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray28, booleanArray43);
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray50, false, 13);
        boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray50);
        boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray54);
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
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, false, false, true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[false, false, true, false, false, true, true, true, false, false, false, true, true, false, true]");
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (short) -1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.io.Serializable[] serializableArray9 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) strArray2, (java.io.Serializable) "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Boolean[] booleanArray15 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray15, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) booleanArray15, 3);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray15);
        long[] longArray26 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.add(longArray26, (long) (short) 1);
        long[] longArray32 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(longArray32, (long) ' ');
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.addAll(longArray28, longArray32);
        java.lang.Long[] longArray42 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray42);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.addAll(longArray35, longArray43);
        long[] longArray50 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.add(longArray50, (long) (short) 1);
        long[] longArray58 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.add(longArray58, (long) (short) 1);
        long[] longArray64 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.contains(longArray64, (long) ' ');
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.addAll(longArray60, longArray64);
        long[] longArray68 = org.apache.commons.lang3.ArrayUtils.addAll(longArray50, longArray64);
        int int71 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray50, (-1L), 4);
        long[] longArray72 = org.apache.commons.lang3.ArrayUtils.addAll(longArray43, longArray50);
        long[] longArray74 = org.apache.commons.lang3.ArrayUtils.add(longArray72, (long) (byte) 0);
        int int76 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray15, (java.lang.Object) longArray72, 82);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray15, "##################################################################.1a0.01##################################################################", 7, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.add(doubleArray1, (double) 0.0f);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 209);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1L);
        double[] doubleArray18 = new double[] {};
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) '4', (double) (byte) -1);
        double[] doubleArray26 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray18, doubleArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 100, (double) 100);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray18);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (-1L));
        double[] doubleArray37 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray37, (double) 100);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray39, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray39);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray43, (double) 10.0f);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.add(doubleArray45, 100.0d);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray47, (double) 35, (double) 99);
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray47, (double) (short) 10);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray52, (double) 0.0f);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray33, doubleArray52);
        double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray33, 58, 0);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 19);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 6, (int) (byte) 10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray14 = new float[] { (byte) 10 };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (float) (-1));
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (float) '4');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray18);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) (-1L));
        float[] floatArray23 = new float[] { (byte) 10 };
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) (-1));
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray25);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray21, floatArray25);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray21, (float) 35, (-1));
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, (float) (byte) 100);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.add(floatArray34, (float) 1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray36);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray36, 10.0f, 0);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray36, (int) (byte) 1, (float) '4');
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray43);
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
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0, -1.0, 52.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0, 52.0, -1.0, 52.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        java.lang.Boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        short[] shortArray26 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray26, (short) (byte) 0, (-1));
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray26);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.add(shortArray26, 2, (short) (byte) 0);
        short[] shortArray40 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray40, (short) (byte) 0, (-1));
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.add(shortArray40, (short) (byte) -1);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.add(shortArray40, (short) (byte) 1);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray47, (short) (byte) 1, (int) ' ');
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.add(shortArray47, (short) 0);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray33, shortArray52);
        java.lang.Short[] shortArray56 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray56, (short) 1);
        short[] shortArray65 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray65, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray65);
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray58, shortArray65);
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray58, (short) 10);
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray33, shortArray58);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray58);
        short[] shortArray76 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray58, (short) (byte) -1);
        short[] shortArray77 = org.apache.commons.lang3.ArrayUtils.clone(shortArray58);
        int int79 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray19, (java.lang.Object) shortArray77, 21);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray77);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray76), "[10]");
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10);
        java.lang.Character[] charArray18 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18, '4');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray20);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray20);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray20);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray20);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray24);
        char[] charArray34 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.add(charArray34, 'a');
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.add(charArray34, ' ');
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray34);
        int int40 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1A10A0A10A1A10A0A0", charArray39);
        int int41 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Aaaaaa                                                                                               aAAAa", charArray39);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray42, 'a');
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray24, charArray42);
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[a, #, a, 4, 4, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                       AAa                          0.0       ", "trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaa", "true", (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AaaaaaAAaaaaaAAatrueaaaaAAaaaaaAAaa" + "'", str3, "AaaaaaAAaaaaaAAatrueaaaaAAaaaaaAAaa");
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ESLAFIHAAAEURTIHAAAEURTIHAAAEURT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aa-10110010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa-10110010" + "'", str1, "aa-10110010");
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUEAAAHTRUEAAAHTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI..." + "'", str1, "TRUEAAAHTRUEAAAHTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...");
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAA1      AAA", "            Hi             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA1      AAA" + "'", str2, "AAAA1      AAA");
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(",4,4,4}a,#,a{", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (short) 1);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray10, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                ...", "hihiH");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaa                            aaaA", "       AAA                  ", (int) 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0" + "'", str8, "############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0");
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaa                        hi!Haaa                        ", "false0false0true0true0false0true", "------------aaa----------------------------------1.0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("      AAAA1      AAA", 12, " aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi... ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      AAAA1      AAA" + "'", str3, "      AAAA1      AAA");
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 10, (-1));
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, 2, 35);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray13);
        java.lang.Byte[] byteArray20 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray20);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.add(byteArray21, (byte) 0);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray21);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray24);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray24);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray24, (byte) 10);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 0, (int) (short) 100);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray13, byteArray24);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray24);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 10);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
        int[] intArray8 = new int[] { (-1), '4', (byte) 10, 1 };
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, (int) (short) 100, 100);
        int[] intArray12 = new int[] {};
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray12, (int) (short) 1);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.subarray(intArray12, (int) (short) 0, (int) (short) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray8, intArray12);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(intArray8, (-1));
        int[] intArray25 = new int[] { (-1), '4', (byte) 10, 1 };
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray25, (int) (short) 100, 100);
        int[] intArray29 = new int[] {};
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray29, (int) (short) 1);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.subarray(intArray29, (int) (short) 0, (int) (short) -1);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray25, intArray29);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.add(intArray25, 0);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.addAll(intArray8, intArray37);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains(intArray38, 0);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray38);
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 100);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] {};
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray44, 35);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray44, 3);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.subarray(intArray48, (int) 'a', (int) (short) 100);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray51, 24);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray51);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray57 = org.apache.commons.lang3.ArrayUtils.remove(intArray51, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 52, 10, 1, -1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0.1a0.01", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.01a0.1" + "'", str2, "0.01a0.1");
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0", (java.lang.CharSequence) "aaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "  4444444444444444444444444...   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  4444444444444444444444444...   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "  4444444444444444444444444...   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaA", (int) (short) 10, "111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110AAAH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1aaaaaaA11" + "'", str3, "1aaaaaaA11");
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        java.lang.Object[] objArray0 = null;
        double[] doubleArray1 = new double[] {};
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) '4', (double) (byte) -1);
        double[] doubleArray9 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray9);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) (byte) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray9);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("  10110010AA                                                                                    ", "                                             {}                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray31 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray35 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray27, strArray31, strArray35 };
        java.lang.String[][] strArray37 = org.apache.commons.lang3.ArrayUtils.toArray(strArray36);
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        int int43 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa", strArray42);
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aAA");
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.replaceEach("AAA                                                                                               aaaA", strArray42, strArray45);
        java.lang.Comparable<java.lang.String>[][] strComparableArray47 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.Comparable<java.lang.String>[][]) strArray36, (java.lang.Object) strArray42);
        java.lang.String[] strArray51 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray55 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray59 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[][] strArray60 = new java.lang.String[][] { strArray51, strArray55, strArray59 };
        java.lang.String[][] strArray61 = org.apache.commons.lang3.ArrayUtils.toArray(strArray60);
        java.lang.Comparable<java.lang.String>[][] strComparableArray62 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.Comparable<java.lang.String>[][]) strArray36, (java.lang.Comparable<java.lang.String>[][]) strArray61);
        java.lang.String[][] strArray63 = org.apache.commons.lang3.ArrayUtils.addAll(strArray12, strArray36);
        java.lang.String[] strArray68 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-1-110010110000-110010110001-11001011000100-110010110001", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][] charSequenceArray69 = org.apache.commons.lang3.ArrayUtils.add((java.lang.CharSequence[][]) strArray12, 4, (java.lang.CharSequence[]) strArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AAA                                                                                               aaaA" + "'", str46, "AAA                                                                                               aaaA");
        org.junit.Assert.assertNotNull(strComparableArray47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strComparableArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.remove(charArray6, 5);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4,  ]");
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                       AAa                          0.0       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                       AAa                          0.0       " + "'", str1, "                                                       AAa                          0.0       ");
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        float[] floatArray0 = new float[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) (byte) 100);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                    ", (java.lang.CharSequence) "      a444#a       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, (int) ' ', 10);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray8);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.add(intArray18, 1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(intArray18, 1000);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (byte) 100, 516, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 26, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, 0.0f);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) '#');
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[35.0]");
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0.0 AAA 1.0 AAA 100.0 AAA 10.0 AAA 10.0 AAA -1.0", "AAAH                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444-1a10a0a10a1a10a0a0", "0.0A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444-1a10a0a10a1a10a0a0" + "'", str2, "4444444444-1a10a0a10a1a10a0a0");
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAA                                ", "hi!H", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("##1      AAAA1      AAAA1##", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##1      AAAA1      AAAA1####1      AAAA1      AAAA1####1      AAAA1      AAAA1##" + "'", str2, "##1      AAAA1      AAAA1####1      AAAA1      AAAA1####1      AAAA1      AAAA1##");
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.clone(charArray11);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4, a]");
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "h       HIHIHh  h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   h                                                                    aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 2, 10);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 4, 13);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 516);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
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
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAAA1      AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa1      aaaa" + "'", str1, "aaaa1      aaaa");
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("-10110010", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                -10110010" + "'", str2, "                                                -10110010");
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
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
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, 9, (int) (byte) 10);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 7);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    aa-10110010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
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
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray55, (long) 27);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray57);
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
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 24, (float) 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ESLAFIHAAAEURTIHAAAEURTIHAAAEURT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ESLAFIHAAAEURTIHAAAEURTIHAAAEURT" + "'", str1, "ESLAFIHAAAEURTIHAAAEURTIHAAAEURT");
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 100);
        java.lang.String str7 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray3, "{true,true,true,false}");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{1,1,10}" + "'", str7, "{1,1,10}");
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("{#,4}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{#,4}" + "'", str1, "{#,4}");
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "-{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA" + "'", str1, "-{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1.0a0.0HIHIHaaa1.0a0.0HIHIHaaa1.0a0.0", 879, "11001011000-11001011000-11 AAAHIHI...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 A1.0a0.0HIHIHaaa1.0a0.0HIHIHaaa1.0a0.0" + "'", str3, "11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 AAAHIHI...11001011000-11001011000-11 A1.0a0.0HIHIHaaa1.0a0.0HIHIHaaa1.0a0.0");
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
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
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, 100.0d);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 244);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[244.0]");
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "      aaa        ", (java.lang.CharSequence) "10.0a1.0     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true, (int) '#');
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true, (int) (short) -1);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, 1, true);
        boolean[] booleanArray31 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray38 = new boolean[] { false, false, true, true, false, true };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray31, booleanArray38);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray38);
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray40, false, 93);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray40, true);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray40, false);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray24, booleanArray47);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray48, true, 7);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray48);
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray48, true, 106);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, true, false, false, false, true, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[true, true, false, false, false, true, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.util.Map<java.lang.Object, java.lang.Object> objMap3 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(objMap3);
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        double[] doubleArray0 = null;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 33, (double) 432);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "  ...ihihaaa 11-00011010011-00011010011-00011010011-");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "  4444444444444444444444444...  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
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
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, (float) 1);
        java.lang.Float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray23);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray23, (float) 10L, 100);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray23, (float) 0, 21);
        java.lang.Object obj31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) int30, obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0, -1.0, 52.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0.010.0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("{97,0,1,100,0}", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}" + "'", str2, "{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}{97,0,1,100,0}");
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, false, 35);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray14, false, 1);
        java.lang.Boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray14);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray14, true, 26);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) (short) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray6, (double) (byte) 1, (double) 64);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.", "a1A10A0A0                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                             {}                                              ", 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("{100,1,-1,0,1,0}", "hIHIH######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{100,1,-1,0,1,0}" + "'", str2, "{100,1,-1,0,1,0}");
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 28);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (int) (short) 0, 7);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, 1.0d);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray12, 100.0d);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray14, (double) 99, (double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", "hi...", 13, 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0          hi...                                                      AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0" + "'", str4, "0.0          hi...                                                      AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0");
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA{1,100,1,-1} aaaA", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaahi", (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
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
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.add(shortArray36, (short) (byte) 10);
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
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0, 10]");
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10.0a1.aaahaaahaaahaaahaaahaaaha", 25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...     aAA       aAA       aAA       a...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha", 94, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha" + "'", str3, "10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha");
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray19, "aAa       ");
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) 0);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1aAa       10aAa       0aAa       10aAa       1aAa       10aAa       0aAa       0" + "'", str21, "-1aAa       10aAa       0aAa       10aAa       1aAa       10aAa       0aAa       0");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 10, 0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 244, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("         AAa                ", "  ", 142);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         AAa                " + "'", str3, "         AAa                ");
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) '4', 35);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.clone(byteArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, 28);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] {};
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray11);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.subarray(intArray11, 28, (int) ' ');
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.subarray(intArray11, (int) (byte) 10, (int) '#');
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray11);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray11);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.add(intArray11, 99);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray22, 21);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[99]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HIHIH                              ", 21, "-1 Hihih 1 1HihihHihih 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIH                              " + "'", str3, "HIHIH                              ");
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ..." + "'", charSequence2, "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...");
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444                                AAA44444444hiaaaaaaaa", (int) ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444                                AAA44444444hiaaaaaaaa" + "'", str3, "44444444444444444444444444444                                AAA44444444hiaaaaaaaa");
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4, a, #]");
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                ", "                                    aa                                                                    ", "        0.010.0        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                " + "'", str3, "                                                                ");
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        java.lang.Long[] longArray22 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray23);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray23);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray25, (long) 58, 165);
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
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) -1);
        short[] shortArray20 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray20);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(shortArray20, (short) 0);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray20);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray20);
        java.lang.Short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray20);
        java.lang.Short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray29);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.add(shortArray31, (short) 100);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray33);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.remove(shortArray33, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 0, 10, 1, 10, 0, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0, 10, 1, 10, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                 AAAAA                                                                                               AAAAAAEAAAHFALSE", "{true,false,false,false,true,false}{true,false,false,false,true,false}{true,false,false,false,true,false}{true,false,false,false,tru-1{-1,-1,0}11{-1,-1,0}{-1,-1,0}1{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaa{true,false,false,false,true,false}{true,false,false,false,true,false}{true,false,false,false,true,false}{true,false,false,false,true");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAHI", "44444444hiaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI" + "'", str2, "AAHI");
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 'a', 35, (double) 28);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 10.0f, 0.0d);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) 13);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray1);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 2, 305);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "1      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aitrueaaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("           ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaahihi#..", "                                                                     4444444444444444444444444...   ", 445, 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaahihi#..                                                                     4444444444444444444444444...   " + "'", str4, "aaahihi#..                                                                     4444444444444444444444444...   ");
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "  aahaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("{10,.,0,a,1,.,0}", "0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{10,.,0,a,1,.,0}" + "'", str2, "{10,.,0,a,1,.,0}");
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray0, "aaaA", (int) (short) 1, 164);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
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
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray26, (long) ' ');
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray28);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray31 = org.apache.commons.lang3.ArrayUtils.remove(longArray28, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 3");
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, -1, 0]");
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA", "10.01.0#############################################################################################################################################################", 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA");
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE..." + "'", str2, "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE...");
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, 35);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray1);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) "      a444#a       ", (java.lang.Object) intArray7);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 18, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.", 13, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
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
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray26);
        java.lang.Class<?> wildcardClass28 = longArray27.getClass();
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
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
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
        float[] floatArray19 = null;
        java.lang.Float[] floatArray26 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray26, 1.0f);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray26);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray29, (float) (short) -1);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray19, floatArray31);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray18, floatArray31);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray31, (float) 12, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0, 1.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) (byte) 1, 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (short) (byte) 100);
        short[] shortArray17 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray17, (short) (byte) 0, (-1));
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray17);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray17);
        java.lang.Short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray17);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray23);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray24);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 1, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[1, 1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[1, 1, 10, 0]");
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("-1a10a0a10a1a10a0a", (int) '#', 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1a10a0a10a1a10a0a" + "'", str3, "-1a10a0a10a1a10a0a");
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaih44444444AAA                                44444444444444444444444444444", "hi", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1", "1.0a0.0                              HIHIH                                                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1" + "'", str2, "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1");
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1      aaaa1      aaaa10", "...              false4fa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
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
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray28, (long) ' ', 4);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray35 = org.apache.commons.lang3.ArrayUtils.add(longArray28, 115, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 115, Length: 0");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, (-1L), 100L, 10L, 1L, 1L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) 17);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        java.lang.Long[] longArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '0', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, -1, 100, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0, -1, 100, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[0, -1, 100, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray11);
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  10110010AA                                                                                    ", (int) (short) 100, 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 100L);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 52);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 22);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[100.0, 0.0, -1.0]");
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("1      aaaA1      aaaA10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1      aaaA1      aaaA10" + "'", str1, "1      aaaA1      aaaA10");
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = null;
        boolean[] booleanArray8 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray15 = new boolean[] { false, false, true, true, false, true };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray8, booleanArray15);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray15);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, false);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray1, booleanArray15);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, false, 35);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray15);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, false, 13);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) charArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray5, '4', 19, 3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray5);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "##4a#" + "'", str16, "##4a#");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #, 4, a, #]");
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
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
        short[] shortArray22 = null;
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray19, shortArray22);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("00101100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00101100" + "'", str1, "00101100");
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##4a#", "{0,0,10,1,10,0,1,0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##4a#" + "'", str2, "##4a#");
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) (byte) 100);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.remove(shortArray16, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 1, 10, 0]");
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "00000AAAH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("101101011010110               aaahihi#..101101011010110", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "101101011010110               aaahihi#..101101011010110" + "'", str2, "101101011010110               aaahihi#..101101011010110");
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "", "11100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH01110", 165);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        java.lang.Integer[][][][][][] intArray0 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray1 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray2 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray3 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray4 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray5 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][][] intArray6 = new java.lang.Integer[][][][][][][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        java.lang.Integer[][][][][][] intArray7 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray8 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray9 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray10 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray11 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray12 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][][] intArray13 = new java.lang.Integer[][][][][][][] { intArray7, intArray8, intArray9, intArray10, intArray11, intArray12 };
        java.lang.Integer[][][][][][] intArray14 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray15 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray16 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray17 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray18 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray19 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][][] intArray20 = new java.lang.Integer[][][][][][][] { intArray14, intArray15, intArray16, intArray17, intArray18, intArray19 };
        java.lang.Integer[][][][][][] intArray21 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray22 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray23 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray24 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray25 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][] intArray26 = new java.lang.Integer[][][][][][] {};
        java.lang.Integer[][][][][][][] intArray27 = new java.lang.Integer[][][][][][][] { intArray21, intArray22, intArray23, intArray24, intArray25, intArray26 };
        java.lang.Integer[][][][][][][][] intArray28 = new java.lang.Integer[][][][][][][][] { intArray6, intArray13, intArray20, intArray27 };
        java.lang.Integer[][][][][][][] intArray29 = new java.lang.Integer[][][][][][][] {};
        java.lang.Integer[][][][][][][] intArray30 = new java.lang.Integer[][][][][][][] {};
        java.lang.Integer[][][][][][][] intArray31 = new java.lang.Integer[][][][][][][] {};
        java.lang.Integer[][][][][][][] intArray32 = new java.lang.Integer[][][][][][][] {};
        java.lang.Integer[][][][][][][] intArray33 = new java.lang.Integer[][][][][][][] {};
        java.lang.Integer[][][][][][][] intArray34 = new java.lang.Integer[][][][][][][] {};
        java.lang.Integer[][][][][][][][] intArray35 = new java.lang.Integer[][][][][][][][] { intArray29, intArray30, intArray31, intArray32, intArray33, intArray34 };
        java.lang.Integer[][][][][][][][] intArray36 = org.apache.commons.lang3.ArrayUtils.addAll(intArray28, intArray35);
        java.lang.Long[][][][] longArray37 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray38 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][][] longArray39 = new java.lang.Long[][][][][] { longArray37, longArray38 };
        java.lang.Short[] shortArray43 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray43, (short) (byte) 100);
        java.lang.Short[] shortArray48 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray48, (short) 1);
        short[] shortArray57 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray57, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray57);
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray50, shortArray57);
        java.lang.Short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray62);
        short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray63, (short) (byte) 0);
        short[] shortArray67 = org.apache.commons.lang3.ArrayUtils.add(shortArray65, (short) 0);
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray45, shortArray65);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray68);
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray68, (short) 0, 5);
        java.lang.Long[][][][][] longArray73 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray39, (java.lang.Object) int72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][][][] objArray74 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[][][][][][]) intArray35, (java.lang.Object[][][][][]) longArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [[[[[Ljava.lang.Long;");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[1, 1, 10, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 5 + "'", int72 == 5);
        org.junit.Assert.assertNotNull(longArray73);
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                      {97,0,1,100,0}", 64, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                      {97,0,1,100,0}" + "'", str3, "                                                                                      {97,0,1,100,0}");
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                -10110010", "             aaA001Aaaa                            aaA1Aaaa                            aaA0Aaaa           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("10.01.0", "0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.01.0" + "'", str2, "10.01.0");
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                  aaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa" + "'", str1, "aaa");
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaa4444444444-1a10a0a10a1a10a0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa4444444444-1a10a0a10a1a10a0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi" + "'", str2, "aaa4444444444-1a10a0a10a1a10a0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi");
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray17);
        java.lang.Boolean[] booleanArray23 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray23, false);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray25);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray25);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray25);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray25);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray17, booleanArray25);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.add(booleanArray30, 99, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Length: 8");
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
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, false, false, true, true, true, false]");
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        long[] longArray3 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(longArray3, (long) ' ');
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) 21, 7);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray10 = org.apache.commons.lang3.ArrayUtils.remove(longArray3, 305);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 305, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        double[] doubleArray0 = null;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (byte) -1, 9, (double) 65);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10.01.0", "------------aaa----------------------------------1.0");
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, 0.0f, 7);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) 2);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray3, (float) 164);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) 93, 165);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) 10L, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 25, (float) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 25, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " AAAHIHI...  ", "                  aaahihi#..    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("             aaA001Aaaa                            aaA1Aaaa                            aaA0Aaaa           ", 58, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...a   ..." + "'", str3, "...a   ...");
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("100 1TRUE   HI", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1TRUE   HI" + "'", str2, "1TRUE   HI");
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" 1      AAAA1      AAAA1", "10.041.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   h", "HIHIh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "ih44444444AAA                                44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.add(longArray11, (long) (-1));
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(longArray16, (long) 35);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.add(longArray16, (long) 1000);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray23 = org.apache.commons.lang3.ArrayUtils.remove(longArray16, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Length: 4");
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
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[-1, -1, 0, -1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[-1, -1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[-1, -1, 0, -1, 1000]");
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray4);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, (short) 1);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, 1, (short) (byte) -1);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) 1);
        short[] shortArray34 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray34, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray34);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray34);
        short[] shortArray46 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray46, (short) (byte) 0, (-1));
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray46);
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray50, (int) 'a', 100);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray22, shortArray53);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray53, (short) 0);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray53, (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[]");
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAA1      AAAA             ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("  ...ihihaaa 11-00011010011-00011010011-00011010011-", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray24 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray24, (double) 100);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray26, (double) 100, (double) (-1));
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray26);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.add(doubleArray26, (double) 98);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray15, doubleArray32);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray32, (double) 21, (double) 139);
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[35.0, 0.0, 98.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, -1.0, 1.0, 10.0, 35.0, 0.0, 98.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, 'a');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, '4');
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '#', 305);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true, (int) '#');
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true, (int) (short) -1);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, 1, true);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, false, 26);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, true, false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "{3}", "AAa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
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
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray48);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray48, (byte) -1, 12);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 28);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (int) (short) 0, 7);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, 1.0d);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray12, 100.0d);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 0, 100);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 27, (int) (byte) 10);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, 6, 33);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, (double) 0L);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "{-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      ", "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray4);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, (short) 1);
        java.lang.Short[] shortArray22 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray22, (short) 1);
        short[] shortArray31 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray31);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray31);
        java.lang.Short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray36);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray37, (short) (byte) 0);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray19, shortArray39);
        java.lang.Short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray19);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[10, -1, 1, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray41);
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("-1100100-10h aaahihi... h aaahihi... h aaahihi......", "aaa                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
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
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray25, (float) 17, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAa       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAa       " + "'", str2, "AAa       ");
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
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
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray23);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray53, (byte) 0, 139);
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
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (short) 10, 10);
        float[] floatArray18 = null;
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(floatArray19, 0.0f);
        float[] floatArray23 = new float[] { (byte) 10 };
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) (-1));
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) '4');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray27);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(floatArray27, (float) 10);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray27, 10.0f, (int) (byte) 10);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray27, (float) (short) 1, 0);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray27, (float) 99, 2);
        float[] floatArray41 = new float[] { (byte) 10 };
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray41, (float) (-1));
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray41, 0.0f, 100);
        float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray41, (float) 0L);
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray48, 10, (int) (byte) 10);
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray48, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray48, (int) (short) 10, 10);
        float[] floatArray58 = null;
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray48, floatArray58);
        float[] floatArray61 = new float[] { (byte) 10 };
        float[] floatArray63 = org.apache.commons.lang3.ArrayUtils.add(floatArray61, (float) (-1));
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray61);
        float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.add(floatArray64, (int) (short) 0, (float) (short) -1);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray64);
        float[] floatArray69 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray48, floatArray64);
        float[] floatArray72 = org.apache.commons.lang3.ArrayUtils.add(floatArray64, 1, (float) 99);
        float[] floatArray73 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray27, floatArray72);
        float[] floatArray74 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray72);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray72);
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
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[10.0, 99.0]");
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[10.0, -1.0, 52.0, 10.0, 99.0]");
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[10.0, 10.0, 99.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        double[] doubleArray16 = new double[] {};
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray16, (double) '4', (double) (byte) -1);
        double[] doubleArray24 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray16, doubleArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray16, (double) 100, (double) 100);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray16, 0, 0);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray16, (double) 1L);
        double[] doubleArray34 = new double[] {};
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray34, (double) '4', (double) (byte) -1);
        double[] doubleArray42 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray34, doubleArray42);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray34, (double) 100, (double) 100);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray16, doubleArray34);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray16, (double) (-1L));
        double[] doubleArray53 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray53, (double) 100);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray55, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray59 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray55);
        double[] doubleArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray59, (double) 10.0f);
        double[] doubleArray63 = org.apache.commons.lang3.ArrayUtils.add(doubleArray61, 100.0d);
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray63, (double) 35, (double) 99);
        double[] doubleArray68 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray63, (double) (short) 10);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray68, (double) 0.0f);
        double[] doubleArray71 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray49, doubleArray68);
        double[] doubleArray74 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray49, 0, (int) (byte) 10);
        double[] doubleArray76 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray74, (double) 100);
        double[] doubleArray77 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray74);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray77, 0.0d);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray15, doubleArray77);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) boolean80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("falsefalsetruetruefalsetrue", "                    ...", 23);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaa1      aaaa            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa1      aaaa           " + "'", str1, "aaaa1      aaaa           ");
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1A10A0A0", 17, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         1A10A0A0" + "'", str3, "         1A10A0A0");
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444 aaa444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", 19, "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444 aaa444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444444444444444444444444 aaa444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "-1100100-10h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h aaahihi... h a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("5", 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0" + "'", str2, "0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0");
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        byte[][][] byteArray0 = new byte[][][] {};
        double[] doubleArray4 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) 100);
        byte[][][] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (java.lang.Object) 100);
        byte[][][] byteArray10 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) ' ', (int) (short) 0);
        byte[][][] byteArray11 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray0, '4', 0, 626);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray9, (float) (short) -1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (float) 106);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.remove(floatArray11, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 5");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) (byte) 10, 36);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0.0-------------------------------------------------", "444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..", "Hihih 1 1HihihHihih 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00-------------------------------------------------" + "'", str3, "00-------------------------------------------------");
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                   #", "...     aAA       aAA       aAA       a...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("h                                                                    aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA", "  aaaa10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aitrueaaah", "HI                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (short) 1, 24);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(intArray4, 23);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("################################################################################################", 22, "      HIHIH10     HIHIH0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################" + "'", str3, "################################################################################################");
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("           ...", "-1aAa#######10aAa#######0aAa#######10aAa#######1aAa#######10aAa#######0aAa#######0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("10.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-1.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa52.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-1.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa100.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa1.0", "10.0a1.10.0a1.10.0a1.10.0a1.10hi...", 96, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10.044444410.0a1.10.0a1.10.0a1.10.0a1.10hi...44aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-1.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa52.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-1.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa100.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa1.0" + "'", str4, "10.044444410.0a1.10.0a1.10.0a1.10.0a1.10hi...44aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-1.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa52.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-1.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa100.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa1.0");
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
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
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray17);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray47, 0, 27);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray52 = org.apache.commons.lang3.ArrayUtils.remove(intArray47, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
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
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray1, "... aa-11001011000-11001011000-11001011000-11 aaahihi...  ", 106, 37);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                             aaa                                 ", charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, '#', 42);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0.0--------------------0.0       ", "HIHIH                                                        aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0--------------------0.0       " + "'", str2, "0.0--------------------0.0       ");
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0a0a10a1a10a0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " 100 1", (java.lang.CharSequence) "  10110010AA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444" + "'", str1, "444");
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 28, (-1));
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 94, (int) (short) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.subarray(intArray5, 33, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray5);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.remove(intArray5, 0);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, 432);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(intArray19, 7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 2, (double) 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", charArray9);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray9);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "{hihih}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str2, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 65);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 17);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray12 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, 100);
        int[] intArray15 = new int[] {};
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray15, (int) (short) 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray15, (-1));
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(intArray15, 0);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray15);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray15);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray12);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray12);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] {};
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray26, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray28);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.subarray(intArray28, 28, (int) ' ');
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray33, (int) (byte) 0, 100);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray33);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray32, intArray33);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, (int) (byte) -1, 10);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray32);
        java.lang.Integer[] intArray43 = org.apache.commons.lang3.ArrayUtils.toObject(intArray12);
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray7, (java.lang.Object) intArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray43, " trueaaa  ", 0, 799);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
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
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.addAll(intArray20, intArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray25);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 10, 52, -1]");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 52, 10, 1, 94, 516, -1, 52, 10, 1]");
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
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
        java.lang.String str27 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) longArray25, "-10110010");
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray28);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray28, (long) 799);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray28);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{-1,-1,0}" + "'", str27, "{-1,-1,0}");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, -1, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[0, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
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
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 10);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, 432, 0);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.clone(byteArray26);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                   ", (int) (short) 0, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   " + "'", str3, "                                                   ");
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("eslafeurteurteurteslafesl", 64, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("-1Aaa#aaaA0Aaa#aaaA1Aaa#aaaA100Aaa#aaaA1", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih");
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 1      AAAA1      AAAA1", 244, "     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1      AAAA1      AAAA1                                                                                                                                                                                                                            " + "'", str3, " 1      AAAA1      AAAA1                                                                                                                                                                                                                            ");
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         AAa                ", "0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0", "0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         AAa                " + "'", str3, "         AAa                ");
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaA", "-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001", 55, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001" + "'", str4, "-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001");
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray6);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        char[] charArray3 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray3, '4');
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray8, 0, (int) (short) 10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #,  ]");
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray0, "aaaA");
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) 0);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 10);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (short) 1, 24);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, (-1), 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA", "h aaahihi...", ",1-,1-{}0,1-,1-{}0,1-,1-{0011-,1-{}0,1-,1-{}0,1-,1-{444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (short) 1);
        long[] longArray14 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) (short) 1);
        long[] longArray20 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(longArray20, (long) ' ');
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray16, longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray20);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray20);
        long[] longArray31 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray31, (long) (short) 1);
        long[] longArray37 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(longArray37, (long) ' ');
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray37);
        java.lang.Long[] longArray47 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray47);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray48);
        long[] longArray55 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.add(longArray55, (long) (short) 1);
        long[] longArray63 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.add(longArray63, (long) (short) 1);
        long[] longArray69 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.contains(longArray69, (long) ' ');
        long[] longArray72 = org.apache.commons.lang3.ArrayUtils.addAll(longArray65, longArray69);
        long[] longArray73 = org.apache.commons.lang3.ArrayUtils.addAll(longArray55, longArray69);
        int int76 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray55, (-1L), 4);
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.addAll(longArray48, longArray55);
        long[] longArray78 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray48);
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray78);
        int int81 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray78, (long) 7);
        boolean boolean82 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray78);
        long[] longArray83 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
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
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[-1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(longArray83);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false, 93);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray15, false);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray15, true);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, 1, (double) 0.0f);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) 626);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
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
        java.lang.Float[] floatArray48 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray48, 1.0f);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray33, (java.lang.Object) floatArray48);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray48, "AAA                                                                                               aaaA", (int) '#', (int) '#');
        java.lang.Float[] floatArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray48);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) floatArray48);
        java.lang.Class<?> wildcardClass58 = floatArray48.getClass();
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
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0.01.0100.010.010.0-1.0" + "'", str57, "0.01.0100.010.010.0-1.0");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("          ", "ESLAFHAAAEAAAAAA                                                                                               AAAAA                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("   ", 626, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0" + "'", str1, "Aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaHIHIH#########################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaHIHIH#########################################################################################################################################################################################################" + "'", str1, "aaaHIHIH#########################################################################################################################################################################################################");
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0.0A                                                                AAA                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("{-1,0,1,100,1}", 98, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("     ", 879);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("false0false0true0true0false0true", "0.044444444444444444444444444444                                AAA44444444hiaaaaaaaa1.044444444444444444444444444444                                AAA44444444hiaaaaaaaa100.044444444444444444444444444444                                AAA44444444hiaaaaaaaa10.044444444444444444444444444444                                AAA44444444hiaaaaaaaa10.044444444444444444444444444444                                AAA44444444hiaaaaaaaa-1.0");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("HIHIH", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 9 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("trueaaa", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Hihih 1 1HihihHihih 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 28, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                 ", "1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-14-140", "##                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi..", (java.lang.CharSequence) "### 1.0 ### 100.0 ### 10.0 ### 10.0 ### -1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
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
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 1);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 100, 1);
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
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                                                                AAA                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray98 = org.apache.commons.lang3.ArrayUtils.add(booleanArray63, 516, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 516, Length: 5");
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
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                aaa                                 ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Comparable<java.lang.String>[]) strArray1);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahi", "AAAA1      AAAA", 5);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                              aaa", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
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
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.add(intArray21, (int) '#');
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray21, 3);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray21, 55, 42);
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(intArray8, (int) '4');
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, 24, (int) (short) 0);
        int[] intArray24 = new int[] { (-1), '4', (byte) 10, 1 };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray24, (int) (short) 100, 100);
        int[] intArray28 = new int[] {};
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray28, (int) (short) 1);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.subarray(intArray28, (int) (short) 0, (int) (short) -1);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray24, intArray28);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.add(intArray24, 0);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.add(intArray24, 94);
        java.lang.String[] strArray41 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray41);
        int[] intArray43 = new int[] {};
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray43, (int) (short) 1);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray43, 100);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray43, (int) '#', 0);
        int[] intArray55 = new int[] { (-1), '4', (byte) 10, 1 };
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray55, (int) (short) 100, 100);
        int[] intArray59 = new int[] {};
        int[] intArray61 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray59, (int) (short) 1);
        int[] intArray64 = org.apache.commons.lang3.ArrayUtils.subarray(intArray59, (int) (short) 0, (int) (short) -1);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray55, intArray59);
        int[] intArray67 = org.apache.commons.lang3.ArrayUtils.add(intArray55, 0);
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray55, (int) 'a', 0);
        int[] intArray71 = org.apache.commons.lang3.ArrayUtils.addAll(intArray43, intArray55);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray41, (java.lang.Object) intArray71);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray71, (int) ' ', (int) 'a');
        int[] intArray78 = org.apache.commons.lang3.ArrayUtils.add(intArray71, (int) (byte) 0, (int) (byte) -1);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray24, intArray71);
        java.lang.Integer[] intArray80 = org.apache.commons.lang3.ArrayUtils.toObject(intArray71);
        int[] intArray81 = new int[] {};
        int[] intArray83 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray81, (int) (short) 1);
        int[] intArray86 = org.apache.commons.lang3.ArrayUtils.subarray(intArray81, (int) (short) 0, (int) (short) -1);
        boolean boolean87 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray71, intArray81);
        boolean boolean88 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray19, intArray81);
        int[] intArray91 = org.apache.commons.lang3.ArrayUtils.add(intArray81, (int) (short) 0, (int) (byte) 0);
        int int94 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray81, 305, 0);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
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
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 52, 10, 1, 94]");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[-1, -1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[0]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        java.lang.Boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray18 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) (byte) 0, (-1));
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray18);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 1);
        int int25 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) shortArray6);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("......aaahi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......aaahi..." + "'", str1, "......aaahi...");
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) (-1));
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray11, (double) 13);
        java.lang.Double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray11);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray14);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray15);
        java.lang.Double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 0.0]");
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, (int) ' ', 10);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.toObject(intArray8);
        java.lang.Integer[] intArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray18);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray19);
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.toObject(intArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(intArray20, 96);
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                             AaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        float[] floatArray13 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, (float) '#');
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray13, 2, (int) (short) -1);
        java.lang.Float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray13);
        float[] floatArray20 = null;
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray13, floatArray20);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) 100);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray23, (float) 1L);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, (float) 52, 0);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) 43);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray4, floatArray23);
        java.lang.Class<?> wildcardClass32 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[100.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[100.0, 43.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAA                                                                                               aaaA1      aaaA1      aaaA10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA                                                                                               aaaA1      aaaA1      aaaA10" + "'", str1, "AAA                                                                                               aaaA1      aaaA1      aaaA10");
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("a#a444    ...", "0.1A0.01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#a444    ..." + "'", str2, "a#a444    ...");
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10110010", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...a   ...", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...a   ..." + "'", str2, "...a   ...");
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", "AAA44444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0" + "'", str2, "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0");
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.add(doubleArray1, (double) (short) -1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("##################################################################.1a0.01##################################################################", "-1.0                                                                                                    5.0                                                                                                    100.0                                                                                                    -1.0                                                                                                    1.0                                                                                                    10.0                                                                                                    0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("             aaA001Aaaa                            aaA1Aaaa                            aaA0Aaaa           ", 65, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 19);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray8);
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
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
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
        java.lang.Double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray22);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray22, (double) (byte) 100);
        java.lang.Double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray25);
        java.lang.Double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray25);
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray27);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "AAA                                                                                               aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA                                                                                               aaaA" + "'", str2, "AAA                                                                                               aaaA");
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}", "AAAA1## AAAA1 ##1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 1, false);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true, (int) 'a');
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hihih", "                                                       AAa       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                       AAa       " + "'", str2, "                                                       AAa       ");
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "4444444444-1a10a0a10a1a10a0a0", "10110010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        boolean[] booleanArray14 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray21 = new boolean[] { false, false, true, true, false, true };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray21, false);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray21, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray21);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray5, (java.lang.Object) booleanArray28, (int) (byte) -1);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray28);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray28);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray28);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, true, true, false, true]");
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        short[] shortArray4 = new short[] { (short) 10, (short) -1, (short) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray11, (short) (byte) -1);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray19, (java.lang.Object) (short) -1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray19);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.io.Serializable[] serializableArray26 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) strArray19, (java.io.Serializable) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray28 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.Comparable<java.lang.String>[]) strArray19, (java.lang.Object) "AAA");
        short[] shortArray35 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray35, (short) (byte) 0, (-1));
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray35);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray35);
        java.lang.Short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray35);
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray19, (java.lang.Object) shortArray41, (int) (short) 1);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) shortArray16, (java.lang.Object) strArray19);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray16);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray48, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray48);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray48);
        byte[] byteArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray53);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 1 };
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray57, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray57);
        byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray57);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray62, (byte) 100, 0);
        byte[] byteArray66 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray53, byteArray62);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray53);
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.add(byteArray53, (byte) -1);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray69);
        byte[] byteArray71 = org.apache.commons.lang3.ArrayUtils.clone(byteArray69);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) shortArray45, (java.lang.Object) byteArray69);
        byte[] byteArray73 = org.apache.commons.lang3.ArrayUtils.clone(byteArray69);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[10, -1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(serializableArray26);
        org.junit.Assert.assertNotNull(strComparableArray28);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[10, -1, 100, 1, 0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[10, 1, -1]");
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("a1a10a0a0", " Hihih 1 1HihihHihih 1", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray9);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray9, (int) (byte) 1, 10);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.clone(byteArray9);
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
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A                                                                      AAA                                                                                                     A               A A                                 A A                                 A   A                                 A", 12, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!4hi! hi!ahi!ahi!4", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.remove(floatArray8, 82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 82, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110AAAH", "0.140.01", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 19);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        float[] floatArray11 = new float[] { (byte) 10 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (int) (short) 0, (float) (short) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray14);
        float[] floatArray20 = new float[] { (byte) 10 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (-1));
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) '4');
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(floatArray24, (float) 10);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray24, 10.0f, (int) (byte) 10);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray24, (float) (short) 1, 0);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray24);
        float[] floatArray36 = new float[] { (byte) 10 };
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.add(floatArray36, (float) (-1));
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray36);
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.add(floatArray39, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray39);
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray39);
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray39, (float) 94, 94);
        float[] floatArray49 = org.apache.commons.lang3.ArrayUtils.add(floatArray39, (float) 93);
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.clone(floatArray39);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray39, (float) 52);
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray39, (float) 5);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray54);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray55, (float) 100, 98);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray55);
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray55, (float) 13);
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
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[10.0, 93.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[10.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444", 36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray13);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray13, (int) (byte) 10, 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(byteArray18, (byte) 100);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray18, (byte) 0);
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
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
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray22);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray22);
        java.lang.Short[] shortArray28 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray28, (short) 1);
        short[] shortArray37 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray37, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray37);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray30, shortArray37);
        java.lang.Short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray42);
        java.lang.Short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray43);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray44);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray44, 'a');
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray44);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray48, (short) 10);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray50);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray22, shortArray50);
        short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray22, 3, 42);
        short[] shortArray62 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray62, (short) (byte) 0, (-1));
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray62);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray62);
        java.lang.Short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray62);
        java.lang.Short[] shortArray71 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray71, (short) 1);
        short[] shortArray80 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int83 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray80, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray80);
        short[] shortArray85 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray73, shortArray80);
        java.lang.Short[] shortArray86 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray85);
        java.lang.Short[] shortArray87 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray86);
        short[] shortArray88 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray87);
        short[] shortArray90 = org.apache.commons.lang3.ArrayUtils.add(shortArray88, (short) 0);
        boolean boolean91 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray88);
        short[] shortArray92 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray62, shortArray88);
        short[] shortArray94 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray88, (short) 0);
        boolean boolean95 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray22, shortArray88);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1a10a0a10a1a10a0a0" + "'", str47, "-1a10a0a10a1a10a0a0");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 0, 10, 1, 10, 0, 10, -1, -1, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[1, 10, 0, 10, -1]");
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray80), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray88), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray90), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(shortArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray92), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray94), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "{0.0,1.0,100.0,10.0,10.0,-1.0}", (java.lang.CharSequence) "                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
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
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.remove(shortArray70, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
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
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("{0,-1,10,1,10,0,0}false0false0true0true0false0true", "}1-{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "      aaaa            ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0", (java.lang.CharSequence) "-1Aaa#aaaA0Aaa#aaaA1Aaa#aaaA100Aaa#aaaA1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray5, 12);
        int[] intArray13 = new int[] { (-1), '4', (byte) 10, 1 };
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray13, (int) (short) 100, 100);
        int[] intArray17 = new int[] {};
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, (int) (short) 1);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.subarray(intArray17, (int) (short) 0, (int) (short) -1);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray13, intArray17);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.add(intArray13, 0);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray13, (int) 'a', 0);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray13, 0, (int) ' ');
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.add(intArray13, 10);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(intArray13, 27);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray13, (int) '4');
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray13, (int) (byte) 1, (int) (short) 0);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.addAll(intArray8, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = org.apache.commons.lang3.ArrayUtils.remove(intArray13, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 41, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 52, 10, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, -1, 52, 10, 1]");
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 100);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) (byte) 10, 6);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaa1      aaaa            ", "0.044444444444444444444444444444                                AAA44444444hiaaaaaaaa1.0444444444444444...", "-11001011000-11001011000-11001011000-11 aa", 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaa1      aaaa            " + "'", str4, "aaaa1      aaaa            ");
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                              HIHIH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("{0,0,10,1,10,0}", "00000AAAH", "Aaaa                            aaA001Aaaa                            aaA1Aaaa                            aaA0Aaaa                            aaA1-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{A,A,1A,1,1A,A}" + "'", str3, "{A,A,1A,1,1A,A}");
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "{hihih}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str2, "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" aaahihi...  ", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("eslafihaaaeurtihaaaeurtihaaaeurt", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eslafihaaaeurtihaaaeurtihaaaeurt" + "'", str2, "eslafihaaaeurtihaaaeurtihaaaeurt");
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, 1, (double) 0.0f);
        double[] doubleArray25 = new double[] { 1.0f };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray15, doubleArray25);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray15);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (double) 0);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray30, 1, (double) 5);
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray33);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray33, (double) 7, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 100.0, -1.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 5.0, 100.0, -1.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaa");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, '#');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, (int) 'a', 35);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                aaa", charArray7);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, '#');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray7);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A" + "'", str1, "0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A");
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 10);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.clone(byteArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, 0.0d, 9);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(intArray5, (int) '#');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaa                            aaaA", 799);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 93, 93, 33, 93, 94, 3 };
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray6);
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "93933393943" + "'", str8, "93933393943");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[93, 93, 33, 93, 94, 3]");
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AaaaaaAAaaaaaAAatrueaaaaAAaaaaaAAaa", "10HI1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 25);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) ' ', 0.0d);
        double[] doubleArray12 = new double[] { 1.0f };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray12);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray12, (int) (short) 10, (int) ' ');
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray12, 0.0d);
        double[] doubleArray24 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray24);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray24, (-1.0d));
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray24, (double) (byte) 1, 100);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray24);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray6, doubleArray12);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 200);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...a   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...a..." + "'", str1, "...a...");
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
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
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 0, 16);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaa1      aaaa            ", "2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.0", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("{-1,52,10,1,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-1,52,10,1,0" + "'", str1, "{-1,52,10,1,0");
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaa                                                        HIHIH", "------------aaa----------------------------------1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray4 = new double[] {};
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) '4', (double) (byte) -1);
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 7);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (-1.0f));
        java.lang.Double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray0);
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
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray59 = org.apache.commons.lang3.ArrayUtils.add(longArray56, 37, (long) 879);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 37, Length: 9");
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
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "#################################aaa############################################################aaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################aaa############################################################aaaA" + "'", str1, "#################################aaa############################################################aaaA");
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0.044444444444444444444444444444                                AAA44444444hiaaaaaaaa1.0444444444444444...", "AAAH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        java.lang.Boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray17);
        java.lang.Class<?> wildcardClass20 = booleanArray19.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
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
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray54);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.contains(longArray54, (long) 1000);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (short) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray21, (short) -1);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray21, (short) (byte) 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
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
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray38);
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
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[10]");
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, '#');
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0.01.0100.010.010.0-1.0", 0, "{0,0,10,1,10,0,1,0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.01.0100.010.010.0-1.0" + "'", str3, "0.01.0100.010.010.0-1.0");
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, (int) (byte) 0, 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray7);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (byte) -1, 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray6);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.subarray(intArray6, 6, (int) 'a');
        java.lang.Integer[] intArray20 = org.apache.commons.lang3.ArrayUtils.toObject(intArray6);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray20);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110AAAH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("-1#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "-1#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.041.04100.0410.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ih44444444AAA                                44444444444444444444444444444", "  A                                                                      AAA                                                                                                     A               A A                                 A A                                 A   A                                 A ", "aa                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih44444444AAA                                44444444444444444444444444444" + "'", str3, "ih44444444AAA                                44444444444444444444444444444");
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA", "{-1.0,1.0,0.0,1.0,35.0}", "                                    ##1      AAAA1      AAAA1##                                     ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        long[][][][][] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[][][][][] longArray2 = org.apache.commons.lang3.ArrayUtils.remove(longArray0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray13, (short) (byte) 1, (int) ' ');
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, (short) 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(shortArray18, (short) (byte) 100);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) 0);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) 1);
        short[] shortArray34 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray34, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray34);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray34);
        short[] shortArray46 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray46, (short) (byte) 0, (-1));
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray46);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray22, shortArray50);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.contains(shortArray50, (short) (byte) 0);
        short[] shortArray54 = null;
        short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray54);
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.add(shortArray55, (short) 0);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.clone(shortArray55);
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.clone(shortArray58);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray58, (short) 10);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray58);
        short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.add(shortArray58, (short) 0);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray50, shortArray58);
        java.lang.Short[] shortArray66 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray50);
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray66, (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 10, 1, 10, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[]");
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[0]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[]");
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[-1, 10, 0, 0, 10, 1, 10, 0]");
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
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
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray22, (float) 35, 73);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                      {97,0,1,100,0}", "                      HI!4HI! HI!AHI!AHI!4                      ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("###", "                      hi!4h                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aa-10110010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("1      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aitrueaaah", "1.0a0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0a0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0a0", "hIHIH######################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#", "     AAAH10.01.0#########", 55, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     AAAH10.01.0#########" + "'", str4, "     AAAH10.01.0#########");
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", "                                aaa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray4, "aaaA");
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) byteArray4, 0);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, 64, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 64, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                     aaaa1aaaa                     ", "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaa1aaaa                     " + "'", str2, "                     aaaa1aaaa                     ");
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
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
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray16);
        java.lang.String str49 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray16, "                                                                AAA                                 ");
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.add(intArray16, (int) (byte) 0, 28);
        java.lang.Integer[] intArray53 = org.apache.commons.lang3.ArrayUtils.toObject(intArray16);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.contains(intArray16, 28);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{-1,52,10,1,0}" + "'", str49, "{-1,52,10,1,0}");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[28, -1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                            aaaA", "hi..", "10.0a1.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            aaaA" + "'", str3, "                            aaaA");
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                     aaaa1aaaa                     ", "1aaaaaaA11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray18, (short) (byte) 100, 99);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray23);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[10, -1]");
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hihi...", "aaaaaaaa                  ...aaaaaa", 96, (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hihi...aaaaaaaa                  ...aaaaaa" + "'", str4, "hihi...aaaaaaaa                  ...aaaaaa");
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        java.lang.Character[] charArray1 = new java.lang.Character[] {};
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HIHIH######################", charArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, '#', 3);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray2);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, (int) '4');
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1 };
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray14, (byte) -1, (int) 'a');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray14);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.clone(byteArray14);
        java.lang.Byte[] byteArray25 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray25);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.add(byteArray26, (byte) 0);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray26);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(byteArray26, (byte) -1);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray26, (byte) 0);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray19, byteArray33);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.clone(byteArray19);
        java.lang.Byte[] byteArray41 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray41);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.add(byteArray42, (byte) 0);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray42);
        java.lang.Byte[] byteArray51 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray51);
        byte[] byteArray54 = org.apache.commons.lang3.ArrayUtils.add(byteArray52, (byte) 0);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray54);
        byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray45, byteArray54);
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.clone(byteArray56);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray56, (byte) -1, 0);
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray56, (byte) -1, (int) (short) -1);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray35, byteArray56);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray35);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray35);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10, 1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0a0a10a1a10a0", "AAAA1######AAAA#############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "###########################################################################################     ###h", (java.lang.CharSequence) "hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        int[] intArray0 = new int[] {};
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.clone(intArray1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "                                                                                                 ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAa       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                               Hi", ' ');
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        java.lang.Object obj4 = null;
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, obj4, 405);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAA4444444444-1A10A0A10...", "a#a444    ...", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("{aaa                                 1.010.0a1.0100.010.0a1.010.010.0a1.010.010.0a1.0-1.0", 12, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{aaa                                 1.010.0a1.0100.010.0a1.010.010.0a1.010.010.0a1.0-1.0" + "'", str3, "{aaa                                 1.010.0a1.0100.010.0a1.010.010.0a1.010.010.0a1.0-1.0");
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                ", "                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        float[] floatArray9 = new float[] { (byte) 10 };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) (-1));
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray9);
        float[] floatArray15 = new float[] { (byte) 10 };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, (float) (-1));
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray15, 0.0f, 100);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray15, (float) 0L);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, (int) 'a', 3);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.clone(floatArray25);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray26, (float) 65, 4);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray26);
        float[] floatArray32 = new float[] { (byte) 10 };
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray32, (float) (-1));
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray32);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.add(floatArray35, (int) (short) 0, (float) (short) -1);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray38, (float) (byte) -1);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray38, (int) (short) 10, 98);
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray30, floatArray38);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0, 10.0, -1.0, 10.0]");
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...a", "###########################################################################################     ###h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...a" + "'", str2, "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...a");
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAA1      AAAA", "                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                    ##1      AAAA1      AAAA1##                                     ", "aAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
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
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(arrayUtilsArray6, (java.lang.Object) 115);
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
        org.junit.Assert.assertNotNull(arrayUtilsArray21);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi", 244, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi##################################################################################################################################################################################################################################################" + "'", str3, "hi##################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           " + "'", str1, "                           ");
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                      0.0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    aa-10110010", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("h h h h h h h h h aaa AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h h h h h h h h h aaa AAA" + "'", str1, "h h h h h h h h h aaa AAA");
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("......aaahi...", "4444", 73);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0", "{1,1,10}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{1,1,10}" + "'", str2, "{1,1,10}");
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0.0       0.0       0.0       0.0      ...", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0       0.0       0.0       0.0      ..." + "'", str3, "0.0       0.0       0.0       0.0      ...");
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        int[] intArray4 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray7);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] {};
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray20);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.subarray(intArray20, 28, (int) ' ');
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray25, (int) (byte) 0, 100);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray25);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray24, intArray25);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray24, (int) (byte) -1, 10);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = org.apache.commons.lang3.ArrayUtils.remove(intArray34, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 57, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 1, 35, 10]");
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0a0a10a1a10a0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("h  ", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     h       " + "'", str2, "     h       ");
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 0);
        java.lang.Byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray11, (byte) 1, 32);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAA1      AAAA            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "{-1,52,10,1,0}", (java.lang.CharSequence) "Aaa                     ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "{-1,52,10,1,0}" + "'", charSequence2, "{-1,52,10,1,0}");
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray8, 432, 18);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[]");
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahi", "AAAA1      AAAA", 5);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("TRUE   HITRUE   HITRUE   HIF LSE", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   0hihih0hihih10hihih1hihih10hihih0" + "'", str1, "                   0hihih0hihih10hihih1hihih10hihih0");
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA");
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '#');
        short[] shortArray9 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, (-1));
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) (byte) -1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) (byte) 1);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray16, (short) (byte) 1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray18);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray2, (java.lang.Object) shortArray18);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray18, 99, (-1));
        short[] shortArray30 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray30, (short) (byte) 0, (-1));
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.add(shortArray30, (short) (byte) -1);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.add(shortArray30, (short) (byte) 1);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray37, (short) (byte) 1, (int) ' ');
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.add(shortArray37, (short) 0);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray18, shortArray42);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray18);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, 65, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 65, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 0, 10, 10, 0, 1, 0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("h   ", "aaahihi#..                                                                     4444444444444444444444444...   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h   " + "'", str2, "h   ");
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih");
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1" + "'", str2, "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1");
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                -10110010", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "{35.0,0.0,100.0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
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
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray11);
        double[] doubleArray37 = new double[] {};
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray37, (double) '4', (double) (byte) -1);
        double[] doubleArray45 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray37, doubleArray45);
        double[] doubleArray52 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray53 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray52);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray37, doubleArray52);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray37);
        java.lang.Double[] doubleArray56 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray57 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray56);
        java.lang.Double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray57);
        double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray58, (double) (short) 0);
        double[] doubleArray61 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray55, doubleArray60);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray11, doubleArray55);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("   h", "{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) -1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(shortArray21, (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) 2, (double) (byte) -1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) 10.0f, 58, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray9, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        float[][][][] floatArray0 = new float[][][][] {};
        float[][][][] floatArray1 = new float[][][][] {};
        float[][][][] floatArray2 = new float[][][][] {};
        float[][][][] floatArray3 = new float[][][][] {};
        float[][][][] floatArray4 = new float[][][][] {};
        float[][][][] floatArray5 = new float[][][][] {};
        float[][][][][] floatArray6 = new float[][][][][] { floatArray0, floatArray1, floatArray2, floatArray3, floatArray4, floatArray5 };
        java.lang.Boolean[] booleanArray11 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray11, false);
        java.lang.Long[] longArray20 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray20);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray20, (java.lang.Object) (short) 100);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray11, (java.lang.Object) longArray20);
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray11);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        java.lang.Boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        java.lang.Boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray28);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray29, "44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray29);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray32);
        float[][][][][] floatArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray6, (java.lang.Object) booleanArray32);
        float[][][][] floatArray35 = null;
        float[][][][][] floatArray36 = org.apache.commons.lang3.ArrayUtils.add(floatArray34, floatArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray34);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse" + "'", str31, "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        double[] doubleArray0 = null;
        double[] doubleArray1 = new double[] {};
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) '4', (double) (byte) -1);
        double[] doubleArray9 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray9);
        double[] doubleArray16 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray16);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray19);
        double[] doubleArray21 = new double[] {};
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray21, (double) '4', (double) (byte) -1);
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray21, doubleArray29);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray21, (double) 10.0f, (int) '4');
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray21, (double) (byte) -1);
        double[] doubleArray37 = new double[] { 1.0f };
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray37);
        double[] doubleArray39 = new double[] {};
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray37, doubleArray39);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.add(doubleArray37, (double) (short) -1);
        double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray21, doubleArray37);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.add(doubleArray37, (double) 3);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray45, 10, (int) (byte) 10);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray20, doubleArray45);
        double[] doubleArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray20);
        double[] doubleArray51 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray50);
        double[] doubleArray52 = new double[] {};
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray52, (double) '4', (double) (byte) -1);
        double[] doubleArray60 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray52, doubleArray60);
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray52, (double) 10.0f, (int) '4');
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray52, (double) (-1), (-1), 10.0d);
        double[] doubleArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray52);
        java.lang.Double[] doubleArray70 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray71 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray70);
        double[] doubleArray72 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray71);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray72);
        int int76 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray72, (double) 516, (double) (byte) 10);
        double[] doubleArray77 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray52, doubleArray72);
        int int79 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray77, (double) 28);
        double[] doubleArray80 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray51, doubleArray77);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[]");
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        int[] intArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (-1), 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA" + "'", str2, "-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, '#');
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
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaa444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "falsefalsetruefalsefalsetruetruetruefalse", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("10.0a1.0     ", "AAA                                                                                               aaaA1      aaaA1      aaaA10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0a1.0     " + "'", str2, "10.0a1.0     ");
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("2.052.0-1.0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
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
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray23);
        java.lang.Byte[] byteArray59 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray59);
        byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.add(byteArray60, (byte) 0);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray62);
        byte[] byteArray65 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray62, (byte) 10);
        byte[] byteArray67 = org.apache.commons.lang3.ArrayUtils.add(byteArray62, (byte) 0);
        byte[] byteArray68 = null;
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray62, byteArray68);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray68);
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
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1, 0, 1, 100, 1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", '#');
        short[] shortArray10 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray10, (short) (byte) 0, (-1));
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (short) (byte) -1);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (short) (byte) 1);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray17, (short) (byte) 1);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray19);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) shortArray19);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "{-1,10,0,10,1,10,0,0}", 4);
        java.lang.String[] strArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray26);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.endsWithAny("falsefalsetruefalsefalsetruetruetruefalse", strArray27);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEach("{}", strArray3, strArray27);
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "A1A10A0A0");
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,52,10,1}", "", 41, 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaa-1,52,10,1}" + "'", str4, "aaaaaaaaaaaaaaaa-1,52,10,1}");
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "trueaaahitrueaaahitrueaaahifalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                            aaaA", "0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            aaaA" + "'", str2, "                            aaaA");
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Long[] longArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray18);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19, (long) (byte) 100);
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
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[100, 1, -1, 0, 1, 0]");
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, ",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        int[] intArray0 = new int[] {};
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, 43, 432);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("2.0hihih52.0hihih-1.0", 516, "      AAAA1      AAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      A2.0hihih52.0hihih-1.0      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AA" + "'", str3, "      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      A2.0hihih52.0hihih-1.0      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AA");
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "                                                                aaa                                 ", (int) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                 AAA                                                                                               aaaA", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                              HIHIH", strArray5);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray5);
        double[] doubleArray13 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) 100);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) 100, (double) (-1));
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray15);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) (short) -1);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) 106);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) objArray9, (java.lang.Object) 106);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, '4');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray10, 'a');
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, '4');
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("{-1,10,10,1,10,0,0}", charArray10);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray10, 'a');
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       aAA", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray22 = org.apache.commons.lang3.ArrayUtils.remove(charArray10, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 41, Length: 6");
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#a444a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#a444a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #, a, 4, 4, 4, a]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("{0,-1,10,1,10,0,0}false0false0true0true0false0true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{0,-1,10,1,10,0,0}false0false0true0true0false0true" + "'", str1, "{0,-1,10,1,10,0,0}false0false0true0true0false0true");
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Aaa                            aaaA", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap3 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'Aaa', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("-152101-1521010", "10.0a1.0     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 100);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, 4, 4);
        int[] intArray11 = new int[] {};
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray11, (int) (short) 1);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray11, 100);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray11, (int) '#', 0);
        int[] intArray23 = new int[] { (-1), '4', (byte) 10, 1 };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray23, (int) (short) 100, 100);
        int[] intArray27 = new int[] {};
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray27, (int) (short) 1);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.subarray(intArray27, (int) (short) 0, (int) (short) -1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray23, intArray27);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.add(intArray23, 0);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray23, (int) 'a', 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray23, (int) (byte) 0, 2);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray23);
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.clone(intArray42);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray43);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray43);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0" + "'", str1, "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0");
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("true   hitrue   hitrue   hif lse", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#####...", 55, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) (byte) 100);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray12);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray12);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17, (short) -1);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 1, 10, 0]");
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        char[] charArray6 = new char[] { 'a', '#', '#', ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ",", charArray6);
        char[] charArray16 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray16, 'a');
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray16, ' ');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray16);
        char[] charArray25 = new char[] { '4', ' ', ' ' };
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray16, charArray25);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(charArray16, '4');
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "H", charArray16);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", charArray16);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray16);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.add(charArray31, '4');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(charArray33, 'a');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, a, 4, 4,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a##   4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a##   4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, #, #,  ,  ,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "a##   4 aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "a##   4 aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, #, #,  ,  ,  , 4,  , a, a, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1a1A10A0A052a1A10A0A010a1A10A0A01", "0.0A", 200);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "trueaaahaaaAhifalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0.01a0.1", "                   0hihih0hihih10hihih1hihih10hihih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.01a0.1" + "'", str2, "0.01a0.1");
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaahi", "hiaaaaaaaa");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", "HIHIH");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..", strArray3, strArray6);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.." + "'", str7, "444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..");
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray9 = new int[] {};
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray9, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray11, 0);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.clone(intArray13);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray14);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.subarray(intArray15, 0, 0);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray8, intArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray19, (int) (byte) 1, 0);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                      {97,0,1,100,0}", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("      AAAA1      AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA1      AAA" + "'", str1, "AAAA1      AAA");
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        long[] longArray0 = null;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, 4, 0);
        org.junit.Assert.assertNull(longArray3);
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("-1...ihihaaa 11-00011010011-00011010011-00011010011--1...ihihaaa 11-00011010011-00011010011-00011010011-0...ihihaaa 11-00011010011-00011010011-00011010011--1", "-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1...ihihaaa 11-00011010011-00011010011-00011010011--1...ihihaaa 11-00011010011-00011010011-00011010011-0...ihihaaa 11-00011010011-00011010011-00011010011--1" + "'", str2, "-1...ihihaaa 11-00011010011-00011010011-00011010011--1...ihihaaa 11-00011010011-00011010011-00011010011-0...ihihaaa 11-00011010011-00011010011-00011010011--1");
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aAAA1## AAAA1 ##1", "0.0a", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray6);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray6);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 1.0]");
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("h aaahihi... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h aaahihi..." + "'", str1, "h aaahihi...");
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
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
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray22);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray22);
        java.lang.Short[] shortArray28 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray28, (short) 1);
        short[] shortArray37 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray37, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray37);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray30, shortArray37);
        java.lang.Short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray42);
        java.lang.Short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray43);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray44);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray44, 'a');
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray44);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray48, (short) 10);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray50);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray22, shortArray50);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.remove(shortArray22, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 8");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1a10a0a10a1a10a0a0" + "'", str47, "-1a10a0a10a1a10a0a0");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 0, 10, 1, 10, 0, 10, -1, -1, 0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
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
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        char[] charArray29 = new char[] { ' ', '#' };
        char[] charArray32 = new char[] { ' ', '#' };
        char[] charArray35 = new char[] { ' ', '#' };
        char[] charArray38 = new char[] { ' ', '#' };
        char[][] charArray39 = new char[][] { charArray29, charArray32, charArray35, charArray38 };
        char[] charArray46 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray48 = org.apache.commons.lang3.ArrayUtils.add(charArray46, 'a');
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.add(charArray46, ' ');
        char[] charArray57 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.add(charArray57, 'a');
        char[] charArray61 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray57, '#');
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray61);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray46, charArray61);
        char[][] charArray64 = org.apache.commons.lang3.ArrayUtils.add(charArray39, charArray61);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) longArray26, (java.lang.Object) charArray64);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray26, (long) 626, 41);
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
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , #]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , #]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , #]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "{-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
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
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 10);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 26);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, 27, 10);
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
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[26]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" 0.001 0.1 0.0H!ih 0.001 0.1 0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 0.001 0.1 0.0H!ih 0.001 0.1 0.0" + "'", str1, " 0.001 0.1 0.0H!ih 0.001 0.1 0.0");
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                            aaaA", "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444AAAA1-1.0AAAA1AAAA110.01AAAA1AAAA110.01AAAA1AAAA1100.01AAAA1AAAA11.01AAAA10.01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("     HIHIAaa                            aaaA", "HIHIH                                                        aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray13);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray13, true, 106);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) ' ', (int) (byte) -1);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.clone(floatArray4);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0]");
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray16);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray17, 52, 347);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray20, false);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1aAa#######10aAa#######0aAa#######10aAa#######1aAa#######10aAa#######0aAa#######0", "aaaaaaaaaaaa", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" 100 1", "aaa   haaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 100 1" + "'", str2, " 100 1");
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!4HI! HI!AHI!AHI!4", "AA", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 10.0f, (int) '4');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 100);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 9, 82);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        double[] doubleArray5 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI...", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray13);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.clone(charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", charArray15);
        int int17 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) charArray15);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(charArray15, 'a');
        java.lang.Character[] charArray28 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray28, '4');
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", charArray30);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-,-,-", charArray30);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.addAll(charArray15, charArray30);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray30);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), " 4 aa4a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), " 4 aa4a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ , 4,  , a, a, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a, #, a, 4, 4, 4]");
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray8, '4');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.remove(charArray11, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(charArray11, '4');
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a, 4, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "-1{-1,-1,0}11{-1,-1,0}{-1,-1,0}1{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray2, ' ');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray2, 2, 99);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, ' ', 5);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                AAA                                 ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}-1a1A10A0A052a1A10A0A010a1A10A0A01{0,0,10,1,10,0,1,0}", charArray8);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("2.0hihih52.0hihih-1.0", " 1      AAAA1      AAAA1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.0hihih52.0hihih-1.0" + "'", str2, "2.0hihih52.0hihih-1.0");
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray9);
        java.lang.Byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) byteArray11);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray11, (byte) 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray14, (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH", "HI                        ##########################################################################", "aaaaaaaa                  ...aaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
    }
}

