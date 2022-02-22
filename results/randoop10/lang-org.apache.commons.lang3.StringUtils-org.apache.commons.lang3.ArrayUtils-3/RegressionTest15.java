import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                 AAAAA                                                                                               AAAAAAEAAAHFALSE", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        java.lang.Object[] objArray10 = null;
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray5, objArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 100);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray13, (byte) 0);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray13);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray13);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(byteArray13, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                ", "{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001" + "'", str1, "-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001");
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        double[] doubleArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hihih", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihih" + "'", str2, "hihih");
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444444444444444444444444444444444444444444{44,44,4}{44,44,4}{44,44444{44,44,4}{44,44,4}{44,44", 28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("a1A10A0A0", 106);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a1A10A0A0                                                                                                 " + "'", str2, "a1A10A0A0                                                                                                 ");
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("               HIHIH               ", "hi!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("{-1,52,10,1,0}", "                            {tru93933393943  h                            ", "                ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                 AaaaA                                                                                               AAAAAaEAAAHFALSE", "aaahihi..", 347);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".1a0.01", 139, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################.1a0.01##################################################################" + "'", str3, "##################################################################.1a0.01##################################################################");
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa", "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa", "1      AAAA1      AAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa" + "'", str3, "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa");
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        long[] longArray0 = null;
        double[] doubleArray2 = new double[] { 1.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray2);
        double[] doubleArray4 = new double[] {};
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) (short) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) (byte) 1, 1);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) 4);
        long[] longArray19 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.add(longArray19, (long) (short) 1);
        long[] longArray27 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.add(longArray27, (long) (short) 1);
        long[] longArray33 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(longArray33, (long) ' ');
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray33);
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.addAll(longArray19, longArray33);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray38);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray39, (long) 0);
        double[] doubleArray43 = new double[] { 1.0f };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray43);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray43, (int) (short) 10, (int) ' ');
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray41, (java.lang.Object) doubleArray43);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray41);
        long[] longArray50 = null;
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.addAll(longArray41, longArray50);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray41, (long) 4);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) int13, (java.lang.Object) longArray41);
        java.lang.Long[] longArray55 = org.apache.commons.lang3.ArrayUtils.toObject(longArray41);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray41);
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray41, 1L, 1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi", "{", "10.0a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi" + "'", str3, "hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi");
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "0.01.0100.010.010.0-1.0", "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("eslafeurteurteurteslafeslafeurteslafeslaf");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("{97,0,1,100,0}", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("10.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA52.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA100.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA1.0", "{100,1,-1,0,1,");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        java.lang.Character[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("      aaa", "AAA44444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                 aAAAa                                                                                               aaaaaA", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 aAAAa                                                                                               aaaaaA" + "'", str2, "                                                                 aAAAa                                                                                               aaaaaA");
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi...");
        java.lang.Object[] objArray3 = null;
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray2, objArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaA", "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", 33);
        java.lang.String[] strArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("0.0A", strArray2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
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
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray22);
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray22);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.split("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        int int28 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrAAArrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", strArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) booleanArray24, (java.lang.Object[]) strArray27);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("10.0a1.aaahaaahaaahaaahaaahaaaha", "101101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".0a1.aaahaaahaaahaaahaaahaaaha" + "'", str2, ".0a1.aaahaaahaaahaaahaaahaaaha");
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aAa       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        int[][][] intArray0 = new int[][][] {};
        int[][] intArray2 = new int[][] {};
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        float[][] floatArray8 = new float[][] { floatArray3, floatArray4, floatArray5, floatArray6, floatArray7 };
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        float[][] floatArray14 = new float[][] { floatArray9, floatArray10, floatArray11, floatArray12, floatArray13 };
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        float[][] floatArray20 = new float[][] { floatArray15, floatArray16, floatArray17, floatArray18, floatArray19 };
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        float[][] floatArray26 = new float[][] { floatArray21, floatArray22, floatArray23, floatArray24, floatArray25 };
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        float[][] floatArray32 = new float[][] { floatArray27, floatArray28, floatArray29, floatArray30, floatArray31 };
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        float[][] floatArray38 = new float[][] { floatArray33, floatArray34, floatArray35, floatArray36, floatArray37 };
        float[][][] floatArray39 = new float[][][] { floatArray8, floatArray14, floatArray20, floatArray26, floatArray32, floatArray38 };
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        float[] floatArray45 = new float[] {};
        float[][] floatArray46 = new float[][] { floatArray40, floatArray41, floatArray42, floatArray43, floatArray44, floatArray45 };
        float[][] floatArray47 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray46);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) floatArray47);
        float[][][] floatArray49 = org.apache.commons.lang3.ArrayUtils.add(floatArray39, floatArray47);
        int[][] intArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray2, (java.lang.Object) floatArray39);
        float[] floatArray52 = new float[] { (byte) 10 };
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.add(floatArray52, (float) (-1));
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray52, 0.0f, 100);
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray52, (float) 0L);
        float[] floatArray62 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray59, 10, (int) (byte) 10);
        int int64 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray62, (float) ' ');
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray2, (java.lang.Object) int64);
        int[][] intArray68 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 1, (int) ' ');
        int[][] intArray69 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[][][] intArray70 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 21, intArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertNotNull(intArray69);
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
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
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.subarray(intArray5, 27, 139);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.subarray(intArray5, (int) (byte) -1, 7);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.subarray(intArray5, 43, 16);
        java.lang.Integer[] intArray31 = org.apache.commons.lang3.ArrayUtils.toObject(intArray30);
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      hi!4h                                                                 ", "eslafeurteurteurteslafeslafeurteslafeslaf", 432);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("falsefalsetruetruefalsetrue");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "falsefalsetruetruefalsetrue" + "'", str1, "falsefalsetruetruefalsetrue");
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        float[] floatArray19 = new float[] { (byte) -1, 100L, 100.0f, 100L, 1, 10.0f };
        float[] floatArray21 = new float[] { (byte) 10 };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, (float) (-1));
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray21, 0.0f, 100);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray21, (float) 0L);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray21);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray29, (float) (byte) 1);
        float[] floatArray33 = new float[] { (byte) 10 };
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.add(floatArray33, (float) (-1));
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.add(floatArray35, (float) '4');
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray37);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.add(floatArray37, (float) (-1L));
        float[] floatArray42 = new float[] { (byte) 10 };
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.add(floatArray42, (float) (-1));
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.add(floatArray44, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray44);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray40, floatArray44);
        float[] floatArray49 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray29, floatArray44);
        short[] shortArray56 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray56, (short) (byte) 0, (-1));
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.add(shortArray56, (short) (byte) -1);
        short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.add(shortArray56, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray56);
        short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.clone(shortArray56);
        java.lang.Short[] shortArray68 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray68, (short) 1);
        short[] shortArray77 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int80 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray77, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray77);
        short[] shortArray82 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray70, shortArray77);
        java.lang.Short[] shortArray83 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray82);
        java.lang.Short[] shortArray84 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray83);
        short[] shortArray85 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray84);
        short[] shortArray87 = org.apache.commons.lang3.ArrayUtils.add(shortArray85, (short) 0);
        boolean boolean88 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray85);
        short[] shortArray89 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray65, shortArray85);
        short[] shortArray92 = org.apache.commons.lang3.ArrayUtils.add(shortArray89, (int) (byte) 0, (short) (byte) 100);
        int int94 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray89, (short) 0);
        short[] shortArray96 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray89, (short) (byte) 1);
        boolean boolean97 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) floatArray44, (java.lang.Object) shortArray96);
        boolean boolean98 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray96);
        boolean boolean99 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray96);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertNotNull(shortArray84);
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray87), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(shortArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray89), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray92), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 13 + "'", int94 == 13);
        org.junit.Assert.assertNotNull(shortArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray96), "[0, 10, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaa                            aaaA", " 0.001 0.1 0.0H!ih 0.001 0.1 0.0");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "10.01.0                                                                                                   AAAA1      AAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
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
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.subarray(longArray28, 99, 27);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.clone(longArray28);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[-1, -1, 0]");
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0.0   1.0   100.0   10.0   10.0   -1.0", ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0   1.0   100.0   10.0   10.0   -1.0" + "'", str2, "0.0   1.0   100.0   10.0   10.0   -1.0");
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "1", (java.lang.CharSequence) "0.0 1.0 100.0 hi!H0.0 1.0 100.0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 82, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 28, (-1));
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 94, (int) (short) 1);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, 33, 0);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(intArray12, 7);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.subarray(intArray12, 0, 106);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, 0, 82);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#######################ihaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahi", "AAAA1      AAAA", 5);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "10.041.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#######################ihaaa", "aaa                                                        HIHIH", 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################ihaaa" + "'", str3, "#######################ihaaa");
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
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
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.subarray(longArray23, 1, 65);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray29, (long) 244);
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################" + "'", str1, "#################################################################################################");
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) -1);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        java.lang.Byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray12, (byte) -1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray14, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#", "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!H", "                                                                                             aaaeurt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!H" + "'", str2, "hi!H");
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("     hi..     ", "10.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA52.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA100.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA1.0", "a#a444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi" + "'", str1, "hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi");
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaa");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Character[] charArray13 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13, ' ');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13, 'a');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) charArray13);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray13, '4', 19, 3);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray13, 'a', 13, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #, 4, a, #]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
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
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray48, (float) 8);
        float[] floatArray55 = new float[] { (byte) 10 };
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.add(floatArray55, (float) (-1));
        float[] floatArray58 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray55);
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.add(floatArray58, (int) (short) 0, (float) (short) -1);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(floatArray58, 0.0f);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray53, floatArray58);
        java.lang.Float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray53);
        float[] floatArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray53);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray53, (float) 12);
        int int71 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray53, (float) 43, 58);
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
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray13, 0, 27);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray16, (byte) 1, 1000);
        java.lang.Byte[] byteArray25 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray25);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.add(byteArray26, (byte) 0);
        java.lang.Byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray26);
        java.lang.Byte[] byteArray35 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray35);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.add(byteArray36, (byte) 0);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray36);
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray39);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray26, byteArray40);
        java.lang.Byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray41);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray41, (int) (short) 10, 0);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray48, (byte) -1, (int) 'a');
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray48, (byte) 10);
        byte[] byteArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray48);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 1 };
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray57, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray57);
        byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray57);
        byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray62);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.contains(byteArray63, (byte) 10);
        byte[] byteArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray63);
        byte[] byteArray67 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray48, byteArray66);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        int int73 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray70, (byte) -1, (int) 'a');
        byte[] byteArray75 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray70, (byte) 10);
        byte[] byteArray76 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray70);
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 1 };
        int int82 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray79, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray83 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray79);
        byte[] byteArray84 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray79);
        byte[] byteArray85 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray84);
        boolean boolean87 = org.apache.commons.lang3.ArrayUtils.contains(byteArray85, (byte) 10);
        byte[] byteArray88 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray85);
        byte[] byteArray89 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray70, byteArray88);
        java.lang.Byte[] byteArray90 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray88);
        byte[] byteArray91 = org.apache.commons.lang3.ArrayUtils.clone(byteArray88);
        boolean boolean92 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray67, byteArray88);
        int int95 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray67, (byte) 0, (int) (byte) 10);
        boolean boolean96 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray41, byteArray67);
        byte[] byteArray97 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray16, byteArray67);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1]");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray91), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(byteArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray97), "[-1, 1, 100, 1, 10, 1, 10, 1]");
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("A1A10A0A0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A1A10A0A0" + "'", str1, "A1A10A0A0");
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray9);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray9);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray9, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-1", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1      aaaA1      aaaA10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "   h                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("10.01.0                                                                                                   AAAA1      AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.01.0                                                                                                   AAAA1      AAA" + "'", str1, "10.01.0                                                                                                   AAAA1      AAA");
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAH", 142, "                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAH                                                                                                                                          " + "'", str3, "AAAH                                                                                                                                          ");
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        java.lang.Character[] charArray7 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, ' ');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, 'a');
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "{true,false,false,false,true,false}", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "eslafeurteurteurteslafesl", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
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
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray18, (double) (-1L));
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 5, (double) 8);
        java.lang.String str37 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) 5);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "5" + "'", str37, "5");
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A", "IH!ih", 98);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hihih" + "'", str1, "Hihih");
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi.", " 4 aa4a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi." + "'", str2, "hi.");
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aaahihi..", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("      a444#a                                              ", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray9);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray9);
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray11, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "truetruetruefalse", charArray14);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, 'a', 115);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                              aaa", "HIHIH######################", 8);
        char[] charArray7 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray7);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, '4');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.clone(charArray7);
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray11);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray11, 17);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = org.apache.commons.lang3.ArrayUtils.remove(charArray11, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
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
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray30, false);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray46, false);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray46, true, 33);
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
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "true true true false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaA1110aaaA1110aaaA1110aaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaA1110aaaA1110aaaA1110aaaA" + "'", str1, "aaaA1110aaaA1110aaaA1110aaaA");
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray15 = new char[] { '4', ' ', ' ' };
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray15);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray16, ' ');
        java.lang.Character[] charArray25 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray25, '4');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray27);
        java.lang.Character[] charArray29 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray29, 'a');
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray29);
        java.lang.Character[] charArray39 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray39, '4');
        java.lang.Character[] charArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray39);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray43);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray29, (java.lang.Object) charArray43, 94);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.addAll(charArray18, charArray43);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.add(charArray18, 'a');
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4,  , a, a, 4, 4,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), " 4 aa44   444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), " 4 aa44   444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ , 4,  , a, a, 4, 4,  ,  ,  , 4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), " 4 aa44   a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), " 4 aa44   a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ , 4,  , a, a, 4, 4,  ,  ,  , a]");
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" {{,#},{,#},{,#},{,#}}  ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAA10.0a1.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) -1);
        java.lang.Byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("      AAAA1      AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, 64, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 64, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("{-1,10,0,10,1,10,0,0}", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,10,0,10,1,10,0,0}" + "'", str2, "{-1,10,0,10,1,10,0,0}");
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" Hihih 1 1HihihHihih 1", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hihih 1 1HihihHihih 1" + "'", str3, " Hihih 1 1HihihHihih 1");
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
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
        int[] intArray35 = new int[] { (-1), '4', (byte) 10, 1 };
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray35, (int) (short) 100, 100);
        int[] intArray39 = new int[] {};
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray39, (int) (short) 1);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.subarray(intArray39, (int) (short) 0, (int) (short) -1);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray35, intArray39);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray39, (int) ' ', 10);
        java.lang.Integer[] intArray49 = org.apache.commons.lang3.ArrayUtils.toObject(intArray39);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray49);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray49, 35);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.subarray(intArray52, (int) (short) 100, (int) '4');
        int[] intArray57 = org.apache.commons.lang3.ArrayUtils.add(intArray52, (int) '#');
        java.lang.Integer[] intArray58 = org.apache.commons.lang3.ArrayUtils.toObject(intArray52);
        int[] intArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray58, 35);
        int[] intArray61 = org.apache.commons.lang3.ArrayUtils.addAll(intArray30, intArray60);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray61);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[35]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                            {tru93933393943  h                            ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            {tru93933393943  h                            " + "'", str2, "                            {tru93933393943  h                            ");
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray19, (double) (-1.0f), (-1), (double) 5);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) 58, 42, (double) 27);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray19, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 0");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aa                                ", 106);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    aa                                                                    " + "'", str2, "                                    aa                                                                    ");
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                           ", 93, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           " + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           ");
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("10.0a1", "aaahihi..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahihi.." + "'", str2, "aaahihi..");
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray19 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) (byte) 0, (-1));
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (short) (byte) -1);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (short) (byte) 1);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray19, (short) (byte) 10);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray12, shortArray19);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(shortArray12, (short) (byte) 0);
        short[] shortArray38 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray38, (short) (byte) 0, (-1));
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.add(shortArray38, (short) (byte) 1);
        short[] shortArray50 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray50, (short) (byte) 0, (-1));
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray38, shortArray50);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray38, (short) 1);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray56, (short) 10);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray12, shortArray56);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray56);
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray56, (short) (byte) 0);
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray56, (short) 100);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 0, 10, 1, 10, 0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0, 10, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 6, 5);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) (short) 0, 0.0d);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
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
        java.lang.Short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray24);
        byte[][][] byteArray64 = new byte[][][] {};
        double[] doubleArray68 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray70 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray68, (double) 100);
        byte[][][] byteArray71 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray64, (java.lang.Object) 100);
        byte[][][] byteArray74 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray64, (int) ' ', (int) (short) 0);
        int int76 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray64, (java.lang.Object) "aaa");
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        byte[][] byteArray83 = new byte[][] { byteArray82 };
        byte[][] byteArray84 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray83);
        byte[][][] byteArray85 = org.apache.commons.lang3.ArrayUtils.add(byteArray64, byteArray84);
        java.io.Serializable[][] serializableArray86 = org.apache.commons.lang3.ArrayUtils.clone((java.io.Serializable[][]) byteArray85);
        int int88 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray63, (java.lang.Object) serializableArray86, (int) (short) 100);
        short[] shortArray90 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray63, (short) 0);
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
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[1, 0, -1, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertNotNull(serializableArray86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray90), "[]");
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("{                                                                                              }", "{-1,52,10,1,0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "      AAAA1  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("trueaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "trueaaa" + "'", str1, "trueaaa");
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ahaaahaaahaaahaaahaaahaaa.1a0.01", (java.lang.CharSequence) "HIHI...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
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
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", 9);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray29, (java.lang.Object) 9);
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
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
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
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray29);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray48);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.subarray(longArray49, (int) (short) -1, 0);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.clone(longArray52);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray53);
        java.lang.Long[] longArray55 = org.apache.commons.lang3.ArrayUtils.toObject(longArray53);
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray53, 0L);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.clone(longArray53);
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
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[]");
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) -1 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) -1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray1);
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[-1]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("IH!ih");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.io.Serializable[] serializableArray12 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) strArray5, (java.io.Serializable) "");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("Aaaa                            aaA001Aaaa                            aaA1Aaaa                            aaA0Aaaa                            aaA1-", strArray2, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(serializableArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray10, '#');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray10);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a, 4, #, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4, a, #, #]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray15);
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444{44,44,4}{44,44,4}{44,44444{44,44,4}{44,44,4}{44,44", "HI...", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 99);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444{44,44,4}{44,44,4}{44,44444{44,44,4}{44,44,4}{44,44" + "'", str4, "444444444444444444444444444444444444444444{44,44,4}{44,44,4}{44,44444{44,44,4}{44,44,4}{44,44");
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("10HI1", "AAA                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                 AAA                                                                                               aaaA", "0.0-------------------------------------------------");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, true);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray21);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray21);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(booleanArray23);
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        short[] shortArray25 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray25, (short) (byte) 0, (-1));
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.add(shortArray25, (short) (byte) -1);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.add(shortArray25, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray25);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.clone(shortArray25);
        java.lang.Short[] shortArray37 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray37, (short) 1);
        short[] shortArray46 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray46, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray46);
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray39, shortArray46);
        java.lang.Short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray51);
        java.lang.Short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray52);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray53);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray54, (short) 0);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray54);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray34, shortArray54);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.add(shortArray58, (int) (byte) 0, (short) (byte) 100);
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray58, (short) 0);
        short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray58, (short) (byte) 1);
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.add(shortArray58, (int) (short) 0, (short) 1);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray18, shortArray68);
        short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) (byte) 1);
        short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) 100);
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.clone(shortArray73);
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
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 13 + "'", int63 == 13);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[0, 10, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[1, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[-1, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[-1, 10, 100]");
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "#################################aaa############################################################aaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
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
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray21);
        java.lang.Byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray21);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray21, (byte) -1);
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
        long[] longArray58 = null;
        long[] longArray64 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.add(longArray64, (long) (short) 1);
        long[] longArray70 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.contains(longArray70, (long) ' ');
        long[] longArray73 = org.apache.commons.lang3.ArrayUtils.addAll(longArray66, longArray70);
        long[] longArray74 = org.apache.commons.lang3.ArrayUtils.addAll(longArray58, longArray66);
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.subarray(longArray74, (-1), (int) (byte) -1);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray56, longArray74);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray74);
        long[] longArray81 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray74, (long) (byte) 100);
        int int83 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray21, (java.lang.Object) longArray81, 0);
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 1]");
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
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[1, 0, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.1-444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.01444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.01444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.001444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.1444444444444444444444444444444444aaa", "hi", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                 ", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                      HI!4HI! HI!AHI!AHI!4                      ", (java.lang.CharSequence) "                                                                                             aaaeurt");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH", (int) (byte) -1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0.0A                                                                AAA                          ", "100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0", "0.0a1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0A                                                                AAA                          " + "'", str3, "0.0A                                                                AAA                          ");
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                 aaa", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str4, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str7, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(",aaaaaaaaaaaaaaaaaaaaaaaa...", 1, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12, (short) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) shortArray12);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 0, 10, 1, 10, 0]");
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "{0,0,10,1,10,0}");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                            AAAa");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "10hi1", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aahi", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444tru");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aahi" + "'", charSequence2, "aahi");
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Aaa                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("eslafihaaaeurtihaaaeurtihaaaeurt", "{                                                                                              }");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia", "10.01.0#############################################################################################################################################################", "                  aaahihi#..    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia" + "'", str3, "hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia");
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                       AAa       ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444hihi...", "HI                        ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("true true true false", "                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true true true false" + "'", str2, "true true true false");
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        long[] longArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 65, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaahihi..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, 1.0d, 106, (double) 19);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10, (double) 859);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{ ,4, ,a,a,4}", "-1a1A10A0A052a1A10A0A010a1A10A0A01");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15, (short) (byte) 100);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray11, (java.lang.Object) shortArray19);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray11, (float) 28);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray11, (float) 0L);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.clone(floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray25);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.add(floatArray26, 24, (float) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        short[] shortArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", "0.140.01", (int) (byte) 10, 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAA0.140.01AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih" + "'", str4, "AAAAAAAAAA0.140.01AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih");
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.remove(byteArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 35, (double) 99);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) (short) 10);
        double[] doubleArray20 = new double[] { 1.0f };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray20);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray20, (int) (short) 10, (int) ' ');
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray20, 0.0d);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray13, doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray27, 799);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 799, Length: 4");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 0.0, 100.0, 1.0]");
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0                                  ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0                                  " + "'", str2, "0                                  ");
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 1, false);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) 'a', 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, false);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("trueaaah      aaaAhifalse", "###########################################################################################     ###h", 209, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###########################################################################################     ###h" + "'", str4, "###########################################################################################     ###h");
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaa                  ...", "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse" + "'", str2, "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse");
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
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
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.add(shortArray39, (int) (byte) 0, (short) (byte) 100);
        short[] shortArray49 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray49, (short) (byte) 0, (-1));
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray49);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray49);
        java.lang.Short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray49);
        java.lang.Short[] shortArray58 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray58, (short) 1);
        short[] shortArray67 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray67, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray67);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray60, shortArray67);
        java.lang.Short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray72);
        java.lang.Short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray73);
        short[] shortArray75 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray74);
        short[] shortArray77 = org.apache.commons.lang3.ArrayUtils.add(shortArray75, (short) 0);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray75);
        short[] shortArray79 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray49, shortArray75);
        int int81 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray79, (short) 10);
        short[] shortArray82 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray39, shortArray79);
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
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray75), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0, 0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0.0A                                                                AAA                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) '4', 35);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.clone(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.clone(byteArray13);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray13, (byte) 1, 98);
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
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("{-1,52,10,1,0}", 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("-{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "aAAA1## AAAA1 ##1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                 aaa                                             ", "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        java.lang.Object[] objArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaah");
        java.lang.String[] strArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("aAAAa                                                                                               aaaaaA", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[                                 ,                                              ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[                                 ,                                              ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray13);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 0, 10, 1, 10, 0]");
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("444444444444444444444444444444444444444444{44,44,4}{44,44,4}{44,44444{44,44,4}{44,44,4}{44,44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0");
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                aAA         ", "                    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("#################################################################################################", 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################" + "'", str3, "################################################################################################");
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("a1A10A0A0", "10.01.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a1A10A0A0" + "'", str2, "a1A10A0A0");
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "HIHIH");
        double[] doubleArray5 = new double[] { 1.0f };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (-1L), (double) 100);
        double[] doubleArray11 = new double[] { 1.0f };
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray11);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray5, doubleArray11);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) doubleArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrAAArrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("......aaahi...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                       false4false4true4true4false4true4false", 9, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...              false4fa..." + "'", str3, "...              false4fa...");
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA", "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa", (int) '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                aaa", "aaa", (int) (short) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("{-1.0,1.0,0.0,1.0,35.0}", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{-1.0,1.0,0.0,1.0,35.0}" + "'", str10, "{-1.0,1.0,0.0,1.0,35.0}");
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("10.0A1.10.0A1.10.0A1.10.0A1.10HI...", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.0A1.10.0A1.10.0A1.10.0A1.10HI..." + "'", str3, "10.0A1.10.0A1.10.0A1.10.0A1.10HI...");
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(floatArray3, (float) 35);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 52, 94);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray11, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA" + "'", str2, "ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA");
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Long[] longArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray18, (long) 'a');
        int[] intArray21 = new int[] {};
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray21, (int) (short) 1);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.subarray(intArray21, (int) (short) 0, (int) (short) -1);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.add(intArray21, (int) (byte) 100);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.add(intArray21, (int) (byte) 0, (int) '4');
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) 'a', (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[52]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
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
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) -1, 52);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      AAAA1      AAAA", "                                                                                                    ", (int) (byte) 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "                                                                aaa                                 ", (int) (byte) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray9, (java.lang.Object) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", 42);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("     HIHIAaa                            aaaA", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 13 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray9, (float) '#', 1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray9);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, 8, (float) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 52.0, 2.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, 52.0, 2.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (-1.0f), (double) (byte) 1);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1, 8, (double) 58);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (int) (short) 0, (double) 18);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[18.0]");
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        java.lang.Boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) 0L);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) doubleArray6);
        double[] doubleArray11 = new double[] { 1.0f };
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) (-1L), (double) 100);
        double[] doubleArray17 = new double[] { 1.0f };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray17);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray11, doubleArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) 2);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) 35);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray6, (java.lang.Object) int23);
        java.lang.Double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray6);
        java.lang.Long[] longArray26 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray26);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray6, (java.lang.Object) longArray27, (int) (byte) 100);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray27, (long) '#');
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) booleanArray0, (java.lang.Object) '#');
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean[] booleanArray22 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray29 = new boolean[] { false, false, true, true, false, true };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray29);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray29);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray29);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray6, booleanArray29);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray29);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray34);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, false, false, false, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
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
        float[][][][][] floatArray35 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray6);
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
        org.junit.Assert.assertNotNull(floatArray35);
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "h       HIHIHh  h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "aaaHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str2, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("{Aaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa}", "true...     aAA       aAA       aAA       a...true...     aAA       aAA       aAA       a...true...     aAA       aAA       aAA       a...false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{Aaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa}" + "'", str2, "{Aaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa}");
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1" + "'", str1, "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1");
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 33);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "true" + "'", str11, "true");
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "11100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH01110");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0HIHIH0H0aaa       10HIHIH0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
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
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray7);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("-11001011000-11001011000-11001011000-11 aaahihi...", "aaa                            aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-11001011000-11001011000-11001011000-11 aaahihi..." + "'", str2, "-11001011000-11001011000-11001011000-11 aaahihi...");
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 100, (int) (short) -1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
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
        float[] floatArray21 = new float[] { (byte) 10 };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, (float) (-1));
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (int) (short) 0, (float) (short) -1);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray24, (float) (byte) 0);
        float[] floatArray31 = new float[] { (byte) 10 };
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (float) (-1));
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray31);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.add(floatArray34, (int) (short) 0, (float) (short) -1);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray37, (float) 1L);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray24, floatArray37);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray24);
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray24);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[10.0]");
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaha");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaha" + "'", str1, "aaha");
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
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
        long[] longArray78 = org.apache.commons.lang3.ArrayUtils.clone(longArray24);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray80 = org.apache.commons.lang3.ArrayUtils.remove(longArray78, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Length: 3");
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
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1, 0]");
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
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
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
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
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        java.lang.Boolean[] booleanArray7 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7, false);
        java.lang.Long[] longArray16 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray16, (java.lang.Object) (short) 100);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray7, (java.lang.Object) longArray16);
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray16);
        java.lang.Long[] longArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray16);
        java.lang.Long[] longArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) doubleArray1, (java.lang.Object[]) longArray22);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1, (double) 100);
        java.lang.Double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "", "AAAH                                                                                                                                          ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 10L);
        double[] doubleArray8 = new double[] {};
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) '4', (double) (byte) -1);
        double[] doubleArray16 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray8, doubleArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 100, (double) 100);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray8, 0, 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 1L);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray8);
        double[] doubleArray27 = new double[] {};
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) '4', (double) (byte) -1);
        double[] doubleArray35 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray27, doubleArray35);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 10.0f, (int) '4');
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (double) (byte) -1);
        double[] doubleArray43 = new double[] { 1.0f };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray43);
        double[] doubleArray45 = new double[] {};
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray43, doubleArray45);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.add(doubleArray43, (double) (short) -1);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray27, doubleArray43);
        double[] doubleArray51 = org.apache.commons.lang3.ArrayUtils.add(doubleArray43, (double) 3);
        double[] doubleArray54 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray51, 10, (int) (byte) 10);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray54);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray55, (double) '#', (double) '4');
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray55, (double) 58, 5, (double) 42);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 93, (long) 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 93, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray0, 23, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.add(doubleArray61, 200, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 200, Length: 0");
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
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0.1A0.01                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaa", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "              1110               ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(charArray9, '#');
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, 'a');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4, a, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hihi...", 99, 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1," + "'", str1, "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray6, "                                                                aaa                                 ");
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray12, 100.0f);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray12);
        float[] floatArray17 = new float[] { (byte) 10 };
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) (-1));
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray17);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (int) (short) 0, (float) (short) -1);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray20, (float) (byte) 0);
        float[] floatArray27 = new float[] { (byte) 10 };
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.add(floatArray27, (float) (-1));
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray27);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray30, (int) (short) 0, (float) (short) -1);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray33, (float) 1L);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray33);
        float[] floatArray43 = new float[] { (byte) -1, 100L, 100.0f, 100L, 1, 10.0f };
        float[] floatArray45 = new float[] { (byte) 10 };
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.add(floatArray45, (float) (-1));
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray45, 0.0f, 100);
        float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray45, (float) 0L);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray43, floatArray45);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray53, (float) (byte) 1);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray53);
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray20, (-1), (int) '4');
        float[] floatArray60 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray59);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str11, "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 10.0, 10.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 1.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[-1.0, 10.0, 10.0, 100.0, 1.0, 0.0, 10.0]");
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                 aaa                                             ", "   ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!ih", "                                                                                              aaa", 4);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.Comparable<java.lang.String>[]) strArray3, (java.lang.Comparable<java.lang.String>[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strComparableArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaIH!ih" + "'", str9, "aaaIH!ih");
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444-1a10a0a10a1a10a0a0", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("eslafeurteurteurteslafeslafeurteslafeslaf", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, 0.0f, 7);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) 2);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray3, (float) 164);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 142, (float) 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 142, Length: 3");
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
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       aAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, false);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray26 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray33 = new boolean[] { false, false, true, true, false, true };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray26, booleanArray33);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray33);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray33);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray33);
        boolean[] booleanArray44 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray51 = new boolean[] { false, false, true, true, false, true };
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray44, booleanArray51);
        boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray51);
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray53, 35, (int) (short) -1);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray53, false, (int) '#');
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray53);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray53, false, 2);
        boolean[] booleanArray69 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray74 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray76 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray74, false);
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray76);
        boolean[] booleanArray78 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray76);
        boolean[] booleanArray79 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray69, booleanArray76);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray69);
        boolean[] booleanArray83 = org.apache.commons.lang3.ArrayUtils.add(booleanArray69, (int) (short) 1, false);
        boolean[] booleanArray84 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray53, booleanArray83);
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray33, booleanArray83);
        boolean boolean86 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray33);
        boolean[] booleanArray87 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        boolean boolean88 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray87);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(booleanArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray69), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray74);
        org.junit.Assert.assertNotNull(booleanArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray76), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(booleanArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray78), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray79), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(booleanArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray83), "[false, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray84), "[false, false, true, true, false, true, false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(booleanArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray87), "[false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52]");
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
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
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray32, (short) 1);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.add(doubleArray1, (double) 0.0f);
        java.lang.String str8 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4444", "##1      AAAA1      AAAA1##", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444" + "'", str3, "4444");
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hihih", "001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-1010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1001-1010", "{}0.0----------------------------------------------------------------aaa----------------------", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("-11001011000-11001011000-11001011000-11 aaahihi...  ", "0.0a", 14);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        float[] floatArray6 = new float[] { (byte) -1, 100L, 100.0f, 100L, 1, 10.0f };
        float[] floatArray8 = new float[] { (byte) 10 };
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (-1));
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, 0.0f, 100);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray8, (float) 0L);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray8);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray16, (float) (byte) 1);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) 4);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray16, (float) 93, 6);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(floatArray16, (float) (short) 10);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("-11001011000-11001011000-11001011000-11 aaahihi...  ", 799, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "-11001011000-11001011000-11001011000-11 aaahihi...  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 100L);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 100.0d, (-1.0d), (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray4, (java.lang.Object) doubleArray12, (int) 'a');
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 24);
        float[] floatArray19 = new float[] { (byte) 10 };
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, (float) (-1));
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray19);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray17, floatArray22);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray24, 209, (-1));
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray24, (float) 115, 859);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[100.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "true true true false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "eslafeurteurteurteslafesl");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("       aaa                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray23 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, (-1));
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray23);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray4);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray29, (short) (byte) -1, 200);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("00.01.0100.010.010.0-1.000.01.0100.010.010.0-1.0100.01.0100.010.010.0-1.0100.01.0100.010.010.0-1.000.01.0100.010.010.0-1.01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.01.0100.010.010.0-1.000.01.0100.010.010.0-1.0100.01.0100.010.010.0-1.0100.01.0100.010.010.0-1.000.01.0100.010.010.0-1.01" + "'", str1, "00.01.0100.010.010.0-1.000.01.0100.010.010.0-1.0100.01.0100.010.010.0-1.0100.01.0100.010.010.0-1.000.01.0100.010.010.0-1.01");
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 0, (short) 1, (short) 0, (short) 0 };
        java.lang.Short[][] shortArray5 = new java.lang.Short[][] { shortArray4 };
        java.lang.Short[][][] shortArray6 = new java.lang.Short[][][] { shortArray5 };
        java.lang.Short[][][] shortArray7 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray6);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        java.lang.Short[][][] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray7, (java.lang.Object) intArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.io.Serializable[][][]) shortArray11);
        java.io.Serializable[][][] serializableArray15 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[][][]) shortArray11, 19, 64);
        java.lang.Object[] objArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) serializableArray15);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(serializableArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "  hihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "a1A10A0A0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) -1);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray7);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray51 = org.apache.commons.lang3.ArrayUtils.remove(longArray44, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 6");
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
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray12, 0.0f);
        java.lang.Float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray12);
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
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0", "aaaHIHIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaahihi..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, 1, (double) 0.0f);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (double) 100L);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray25, (double) (short) 100, 98);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, -1.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
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
        long[] longArray68 = org.apache.commons.lang3.ArrayUtils.subarray(longArray26, 28, 93);
        long[] longArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray26);
        int int71 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray26, (long) (byte) 1);
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
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (-1.0f), (double) (byte) 1);
        double[] doubleArray16 = null;
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray16, (double) 139);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA", "truetruetruefalse               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA" + "'", str2, "-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA");
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.add(charArray0, '4');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray3, (byte) -1, 98);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.clone(byteArray3);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
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
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.add(shortArray39, (int) (byte) 0, (short) (byte) 100);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray39, (short) 0);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray39, (short) (byte) 1);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.add(shortArray39, (int) (short) 0, (short) 1);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray49, (short) (byte) 10, 26);
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
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 13 + "'", int44 == 13);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 10, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[1, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("true   hitrue   hitrue   hif lse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true   hitrue   hitrue   hif lse" + "'", str1, "true   hitrue   hitrue   hif lse");
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aAA");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("AAA                                                                                               aaaA", strArray5, strArray8);
        long[] longArray15 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray15, (long) (short) 1);
        long[] longArray23 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.add(longArray23, (long) (short) 1);
        long[] longArray29 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(longArray29, (long) ' ');
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray29);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray29);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray15);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray34);
        long[] longArray41 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.add(longArray41, (long) (short) 1);
        long[] longArray47 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(longArray47, (long) ' ');
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.addAll(longArray43, longArray47);
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.addAll(longArray35, longArray43);
        long[] longArray57 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.add(longArray57, (long) (short) 1);
        long[] longArray65 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.add(longArray65, (long) (short) 1);
        long[] longArray71 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.contains(longArray71, (long) ' ');
        long[] longArray74 = org.apache.commons.lang3.ArrayUtils.addAll(longArray67, longArray71);
        long[] longArray75 = org.apache.commons.lang3.ArrayUtils.addAll(longArray57, longArray71);
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray57);
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray76);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.subarray(longArray77, (int) (short) -1, 0);
        long[] longArray81 = org.apache.commons.lang3.ArrayUtils.addAll(longArray51, longArray77);
        long[] longArray83 = org.apache.commons.lang3.ArrayUtils.add(longArray51, (long) '#');
        int int85 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray5, (java.lang.Object) '#', 42);
        java.lang.String[] strArray89 = org.apache.commons.lang3.StringUtils.split("##                                                                                                 ", "HI", (int) (byte) 1);
        java.lang.String str90 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaIH!ih", strArray5, strArray89);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AAA                                                                                               aaaA" + "'", str9, "AAA                                                                                               aaaA");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "aaaIH!ih" + "'", str90, "aaaIH!ih");
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a1a10a0a0", "                                                              AAA                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaahihi... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", (java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444", 13, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray24, (long) 9);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray29 = org.apache.commons.lang3.ArrayUtils.add(longArray26, 432, (long) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 432, Length: 9");
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
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 35, (double) 99);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray13, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.add(doubleArray18, 43, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 43, Length: 2");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 100.0]");
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 100);
        java.lang.Byte[] byteArray18 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray18);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (byte) 1);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray22, (byte) 100);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray22, (byte) 10);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray22);
        java.lang.Byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray22);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(byteArray22, (byte) 10);
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 1, 100, 1, 1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1, -1, 0, 1, 100, 1, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0     HIHIH0     HIHIH10    {}", "HIHIH                                                        aaa##################");
        java.lang.String[] strArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
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
        long[] longArray33 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.add(longArray33, (long) (short) 1);
        long[] longArray41 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.add(longArray41, (long) (short) 1);
        long[] longArray47 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(longArray47, (long) ' ');
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.addAll(longArray43, longArray47);
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray47);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray47);
        java.lang.Long[] longArray53 = org.apache.commons.lang3.ArrayUtils.toObject(longArray47);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray53);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray23, longArray54);
        long[] longArray61 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray63 = org.apache.commons.lang3.ArrayUtils.add(longArray61, (long) (short) 1);
        long[] longArray69 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray71 = org.apache.commons.lang3.ArrayUtils.add(longArray69, (long) (short) 1);
        long[] longArray75 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.contains(longArray75, (long) ' ');
        long[] longArray78 = org.apache.commons.lang3.ArrayUtils.addAll(longArray71, longArray75);
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.addAll(longArray61, longArray75);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray75);
        boolean boolean82 = org.apache.commons.lang3.ArrayUtils.contains(longArray80, (long) '#');
        long[] longArray83 = org.apache.commons.lang3.ArrayUtils.addAll(longArray54, longArray80);
        int int86 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray54, 1L, (int) (byte) 10);
        long[] longArray87 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray54);
        java.lang.Long[] longArray88 = org.apache.commons.lang3.ArrayUtils.toObject(longArray1);
        int int90 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) 26);
        int int93 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) (byte) 0, 6);
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
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[-1, -1, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (short) 0, (int) (short) -1);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (byte) 100);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray7, (int) (byte) 1, 94);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 94]");
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, (float) (short) 10);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) 244);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("     AAAH", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
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
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false, (int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaHIHIH#########################################################################################################################################################################################################", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         AAa                ", "h aaahihi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah");
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, 209, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 209, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                AAA                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "h  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (short) 0, (int) (short) -1);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (byte) 100);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray7);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.subarray(intArray7, 11, 33);
        java.lang.Character[] charArray19 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray19, '4');
        java.lang.Character[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray19);
        java.lang.Character[] charArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(charArray24, '#');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(charArray24, '#');
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.add(charArray24, 'a');
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAA                                ", charArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) 11, (java.lang.Object) boolean31);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "a#a444a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "a#a444a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[a, #, a, 4, 4, 4, a]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0     hihih0     hihih10    {}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("444444                ...", ".0a0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("       aaa                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a", "AAA                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a");
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAA" + "'", str1, "aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAA");
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAA                  ", "a1a10a0a0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        java.lang.Float[] floatArray24 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray24);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray25, (float) 100L);
        java.lang.Double[] doubleArray33 = new java.lang.Double[] { 100.0d, (-1.0d), (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray33);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray25, (java.lang.Object) doubleArray33, (int) 'a');
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray20, (java.lang.Object) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap39 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'false', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...     aAA       aAA       aAA       a...", "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...     aAA       aAA       aAA       a..." + "'", str2, "...     aAA       aAA       aAA       a...");
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        java.lang.Float[] floatArray7 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray7, 1.0f);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray7, "                                                                aaa                                 ");
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("1      AAAA1      AAAA1", (java.lang.Object[]) floatArray7);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray7);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.remove(floatArray15, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 94, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str12, "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0" + "'", str14, "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1      AAAA1      AAAA", "     Hi      44444444444444444444444444444                                AAA44444444hi     Hi      ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray13);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray13, 42, (int) (short) 10);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        short[] shortArray28 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray28, (short) (byte) 0, (-1));
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray28, (short) -1, (int) (byte) -1);
        java.lang.Short[] shortArray37 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray37, (short) 1);
        short[] shortArray46 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray46, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray46);
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray39, shortArray46);
        short[] shortArray58 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray58, (short) (byte) 0, (-1));
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray39, shortArray58);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray39);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray28, shortArray39);
        java.lang.Short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray28);
        java.lang.Short[] shortArray68 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray68, (short) 1);
        short[] shortArray77 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int80 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray77, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray77);
        short[] shortArray82 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray70, shortArray77);
        java.lang.Short[] shortArray83 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray82);
        short[] shortArray85 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray83, (short) (byte) 0);
        short[] shortArray87 = org.apache.commons.lang3.ArrayUtils.add(shortArray85, (short) 0);
        boolean boolean88 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray28, shortArray85);
        boolean boolean89 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray28);
        int int90 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray21, (java.lang.Object) shortArray28);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray87), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0", "      a444#a       ", 445);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("eaaahfalse trueaaahtru", "444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray1, (int) 'a', 3);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.clone(floatArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray12);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "-1#-1#0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#######################", "                                                   #", 516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("... aaa", "false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false", (int) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("HIHIH                                                        aaa##################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10", ' ');
        java.lang.Float[] floatArray9 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray9, 1.0f);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray9);
        java.lang.Float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        java.lang.Float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray13);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray13, (float) (byte) 100);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray13);
        java.lang.Float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray13);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray2, (java.lang.Object) floatArray13, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                          ", "aAAA1## AAAA1 ##1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          " + "'", str2, "                                          ");
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
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
        java.lang.Integer[] intArray47 = org.apache.commons.lang3.ArrayUtils.toObject(intArray17);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.subarray(intArray17, 28, (int) (short) 0);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray17, 142);
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
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) -1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100, 24);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
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
        org.apache.commons.lang3.ArrayUtils.reverse(longArray25);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray25, (long) 106, 445);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("trueaaah      aaaAhifalse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "trueaaahaaaAhifalse" + "'", str1, "trueaaahaaaAhifalse");
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!H", "  10110010AA                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!H" + "'", str2, "hi!H");
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("100 1", "{#,4}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100 1" + "'", str2, "100 1");
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 10);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.clone(byteArray8);
        java.lang.Byte[] byteArray17 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray17);
        java.lang.Byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray17, (byte) -1);
        java.lang.Object[] objArray22 = null;
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray17, objArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray17, (byte) 100);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray25, (byte) 0);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray11, byteArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray11);
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
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 1, -1, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (short) (byte) 1);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, (short) -1);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray17, (short) -1, 3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 0, 10, 1, 10, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                {-1,10,10,1,10,0,0}                       ", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        java.lang.Character[][] charArray0 = new java.lang.Character[][] {};
        java.lang.Character[] charArray2 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray4 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray6 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray8 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray10 = new java.lang.Character[] { ' ' };
        java.lang.Character[][] charArray11 = new java.lang.Character[][] { charArray2, charArray4, charArray6, charArray8, charArray10 };
        java.lang.Character[][] charArray12 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray11);
        java.lang.Character[][] charArray13 = org.apache.commons.lang3.ArrayUtils.toArray(charArray0);
        java.io.Serializable[][] serializableArray14 = org.apache.commons.lang3.ArrayUtils.toArray((java.io.Serializable[][]) charArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray13, 'a');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(serializableArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-10110010", "100.0                              HIHIH                                                        aaa0.0                              HIHIH                                                        aaa-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa", "10.0A1.10.0A1.10.0A1.10.0A1.10HI...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("-,-,-", "  ", 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-,-,-" + "'", str3, "-,-,-");
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0404104141040", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{10.0}aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1-10", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, (double) 0L);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 100.0d);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray5, 93, 2);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray11, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 1.0]");
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAA                                ", 99, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray17, false);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, false, (int) ' ');
        boolean[] booleanArray28 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray33 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray33, false);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray35);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray35);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray28, booleanArray35);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray38);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.add(booleanArray38, 4, true);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray17, booleanArray38);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray38);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray38);
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
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, true, false, true, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      a444#a       ", 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        float[][] floatArray5 = new float[][] { floatArray0, floatArray1, floatArray2, floatArray3, floatArray4 };
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        float[][] floatArray11 = new float[][] { floatArray6, floatArray7, floatArray8, floatArray9, floatArray10 };
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        float[][] floatArray17 = new float[][] { floatArray12, floatArray13, floatArray14, floatArray15, floatArray16 };
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        float[][] floatArray23 = new float[][] { floatArray18, floatArray19, floatArray20, floatArray21, floatArray22 };
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        float[][] floatArray29 = new float[][] { floatArray24, floatArray25, floatArray26, floatArray27, floatArray28 };
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        float[][] floatArray35 = new float[][] { floatArray30, floatArray31, floatArray32, floatArray33, floatArray34 };
        float[][][] floatArray36 = new float[][][] { floatArray5, floatArray11, floatArray17, floatArray23, floatArray29, floatArray35 };
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        float[][] floatArray43 = new float[][] { floatArray37, floatArray38, floatArray39, floatArray40, floatArray41, floatArray42 };
        float[][] floatArray44 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray43);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) floatArray44);
        float[][][] floatArray46 = org.apache.commons.lang3.ArrayUtils.add(floatArray36, floatArray44);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray36, 'a');
        java.lang.Object obj49 = null;
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray36, obj49, 445);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray11);
        java.lang.Character[] charArray19 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray19, '4');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray21);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray21);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.addAll(charArray12, charArray21);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.clone(charArray21);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray25);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   h                                                                    aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA", charArray25);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[a, #, a, 4, 4, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA" + "'", str2, "1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA");
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray9, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, '4', 10);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a#a444 4 aa4a", charArray16);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, '#');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.subarray(charArray13, (int) (short) 1, (int) (short) -1);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray13);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, ' ', (int) 'a');
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                aaa                                 ", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", charArray13);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray13);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("     HIHIAaa                            aaaA", "Aaa                     ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false", 8, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false" + "'", str3, "false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false");
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(intArray4, (-1));
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.add(intArray4, (int) (byte) 1, 100);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray19);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray19, 1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" {{,#},{,#},{,#},{,#}}  ", "     Hi      44444444444444444444444444444                                AAA44444444hi     Hi      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        char[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.clone(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1      AAAA1      AAAA", "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
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
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.clone(intArray30);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray31, 1);
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
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hiaaaaaaaa", "                                    ##1      AAAA1      AAAA1##                                     ", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
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
        double[] doubleArray62 = org.apache.commons.lang3.ArrayUtils.add(doubleArray60, 1.0d);
        double[] doubleArray65 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray60, 1, 65);
        double[] doubleArray67 = org.apache.commons.lang3.ArrayUtils.add(doubleArray60, (double) 28);
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
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[28.0]");
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("  4444444444444444444444444...   ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                     4444444444444444444444444...   " + "'", str2, "                                                                     4444444444444444444444444...   ");
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a", "4444", 209);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-1010", "93933393943");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", " AAAHIHI...  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "eslafihaaaeurtihaaaeurtihaaaeurt");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
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
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.clone(byteArray23);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray23, 42, 82);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray23, (byte) 0);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray23, (byte) -1, 35);
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
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
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
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray31);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.add(floatArray34, (int) (short) 0, (float) (short) -1);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray34);
        float[] floatArray40 = new float[] { (byte) 10 };
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.add(floatArray40, (float) (-1));
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.add(floatArray42, (float) '4');
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray44);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains(floatArray44, (float) 10);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray44, 10.0f, (int) (byte) 10);
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray44, (float) (short) 1, 0);
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray34, floatArray44);
        float[] floatArray55 = null;
        float[] floatArray56 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray44, floatArray55);
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray44, 0, 19);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray29, floatArray44);
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray44, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray44);
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
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[52.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (short) 1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) 10, (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                    ##1      AAAA1      AAAA1##                                     ", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" 1      AAAA1      AAAA1", "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444                                AAA44444444hiaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaih44444444AAA                                44444444444444444444444444444" + "'", str1, "aaaaaaaaih44444444AAA                                44444444444444444444444444444");
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, 347);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 347, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 AAA                                                                                               aaaA", 516);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-152101-1521010", "2.0hihih52.0hihih-1.0", "aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa" + "'", str3, "aaaaa");
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray7);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray5);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (int) 'a', 11);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) (byte) -1);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray13);
        double[] doubleArray15 = new double[] {};
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) '4', (double) (byte) -1);
        double[] doubleArray23 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray15, doubleArray23);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) 100, (double) 100);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray15, 0, 0);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 1L);
        double[] doubleArray33 = new double[] {};
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray33, (double) '4', (double) (byte) -1);
        double[] doubleArray41 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray33, doubleArray41);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray33, (double) 100, (double) 100);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray15, doubleArray33);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray15, (double) (-1L));
        double[] doubleArray52 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray52, (double) 100);
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray54, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray54);
        double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray58, (double) 10.0f);
        double[] doubleArray62 = org.apache.commons.lang3.ArrayUtils.add(doubleArray60, 100.0d);
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray62, (double) 35, (double) 99);
        double[] doubleArray67 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray62, (double) (short) 10);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray67, (double) 0.0f);
        double[] doubleArray70 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray48, doubleArray67);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray13, doubleArray67);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.remove(byteArray25, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1000, Length: 5");
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
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
        org.apache.commons.lang3.ArrayUtils.reverse(intArray21);
        java.lang.Integer[] intArray23 = org.apache.commons.lang3.ArrayUtils.toObject(intArray21);
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
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
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
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '#');
        short[] shortArray43 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray43, (short) (byte) 0, (-1));
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) (byte) -1);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) (byte) 1);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray50, (short) (byte) 1);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray52);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray52);
        short[] shortArray61 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray61, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray61);
        int int67 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray61, (short) 10);
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.clone(shortArray61);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray68);
        short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray68, (short) 1);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray54, shortArray68);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.contains(shortArray72, (short) 100);
        int int76 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray72, (short) (byte) 10);
        int int77 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray6, (java.lang.Object) shortArray72);
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
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[0, 0, 10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[0, 0, 10, 10, 0, 1, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                 ", "0.041.04100.0410.0410.04-1.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        java.lang.String[] strArray3 = new java.lang.String[] { "              1110               ", "100", "                              HIHIH" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray3 };
        java.lang.String[] strArray8 = new java.lang.String[] { "              1110               ", "100", "                              HIHIH" };
        java.lang.String[][] strArray9 = new java.lang.String[][] { strArray8 };
        java.lang.String[][][] strArray10 = new java.lang.String[][][] { strArray4, strArray9 };
        java.lang.String[][][] strArray11 = org.apache.commons.lang3.ArrayUtils.clone(strArray10);
        java.lang.String[][][] strArray14 = org.apache.commons.lang3.ArrayUtils.subarray(strArray11, 27, (int) ' ');
        java.lang.String[][][] strArray15 = org.apache.commons.lang3.ArrayUtils.clone(strArray11);
        java.lang.String[][][] strArray16 = org.apache.commons.lang3.ArrayUtils.toArray(strArray11);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray24 = org.apache.commons.lang3.ArrayUtils.subarray(strArray21, (int) 'a', (int) '4');
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.split("hi!HI", "                                                                 AAA                                                                                               aaa");
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("       AAA", strArray21, strArray27);
        float[] floatArray34 = new float[] { (-1L), 1.0f, 0L, 1, '#' };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray34);
        java.lang.Float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray34);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray27, (java.lang.Object[]) floatArray36);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray36, (float) 3);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray18, (java.lang.Object) floatArray39);
        java.lang.CharSequence[][][] charSequenceArray41 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.CharSequence[][][]) strArray16, (java.lang.Object) floatArray39);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "       AAA" + "'", str28, "       AAA");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0, 1.0, 0.0, 1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[-1.0, 1.0, 0.0, 1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(charSequenceArray41);
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0.1a0.01", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.1a0.01" + "'", str2, "0.1a0.01");
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
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
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, (int) (byte) 0, 2);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray12);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray12);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray32);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("              aaa        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAA                  ", (java.lang.CharSequence) "h h h h h h h h h aaa AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 AAAAA                                                                                               AAAAAAEAAAHFALSE", "aaa                                                                                              ", 432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444                                AAA44444444hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih44444444AAA                                44444444444444444444444444444" + "'", str1, "ih44444444AAA                                44444444444444444444444444444");
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "   {0,10,1,1,0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...a", 0, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...a" + "'", str3, "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...a");
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
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
        float[] floatArray24 = new float[] { (byte) 10 };
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) (-1));
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray24);
        float[] floatArray34 = new float[] { (byte) -1, 100L, 100.0f, 100L, 1, 10.0f };
        float[] floatArray36 = new float[] { (byte) 10 };
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.add(floatArray36, (float) (-1));
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray36, 0.0f, 100);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray36, (float) 0L);
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray34, floatArray36);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray44, (float) (byte) 1);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray44, (float) 4);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray44);
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray44);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray50);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[2.0, 52.0, -1.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[2.0, 52.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("{-1.0,10.0,35.0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-1.0,10.0,35.0}" + "'", str1, "{-1.0,10.0,35.0}");
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
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
        java.lang.Integer[] intArray35 = org.apache.commons.lang3.ArrayUtils.toObject(intArray4);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) intArray35);
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
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
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
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray15, 25);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        int[][][][] intArray0 = new int[][][][] {};
        int[] intArray3 = new int[] { (short) 100, 445 };
        int[] intArray6 = new int[] { (short) 100, 445 };
        int[] intArray9 = new int[] { (short) 100, 445 };
        int[] intArray12 = new int[] { (short) 100, 445 };
        int[] intArray15 = new int[] { (short) 100, 445 };
        int[] intArray18 = new int[] { (short) 100, 445 };
        int[][] intArray19 = new int[][] { intArray3, intArray6, intArray9, intArray12, intArray15, intArray18 };
        int[][][] intArray20 = new int[][][] { intArray19 };
        int[][][][] intArray21 = new int[][][][] { intArray20 };
        int[][][][] intArray22 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray21);
        int[] intArray30 = new int[] { (byte) 10, 2, 3, 1, 7, '4' };
        int[][] intArray31 = new int[][] { intArray30 };
        int[] intArray38 = new int[] { (byte) 10, 2, 3, 1, 7, '4' };
        int[][] intArray39 = new int[][] { intArray38 };
        int[] intArray46 = new int[] { (byte) 10, 2, 3, 1, 7, '4' };
        int[][] intArray47 = new int[][] { intArray46 };
        int[] intArray54 = new int[] { (byte) 10, 2, 3, 1, 7, '4' };
        int[][] intArray55 = new int[][] { intArray54 };
        int[] intArray62 = new int[] { (byte) 10, 2, 3, 1, 7, '4' };
        int[][] intArray63 = new int[][] { intArray62 };
        int[][][] intArray64 = new int[][][] { intArray31, intArray39, intArray47, intArray55, intArray63 };
        int[][][] intArray65 = org.apache.commons.lang3.ArrayUtils.toArray(intArray64);
        // The following exception was thrown during execution in test generation
        try {
            int[][][][] intArray66 = org.apache.commons.lang3.ArrayUtils.add(intArray22, 21, intArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 445]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 445]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 445]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 445]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 445]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 445]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 2, 3, 1, 7, 52]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 2, 3, 1, 7, 52]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 2, 3, 1, 7, 52]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[10, 2, 3, 1, 7, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[10, 2, 3, 1, 7, 52]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(intArray65);
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1, 0]");
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (short) 1);
        long[] longArray14 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) (short) 1);
        long[] longArray20 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(longArray20, (long) ' ');
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray16, longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray20);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray26, (long) 0);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray28, (long) 2);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray28, (long) (byte) 100);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray32);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(longArray32, (long) 0);
        int[] intArray40 = new int[] { (-1), '4', (byte) 10, 1 };
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray40, (int) (short) 100, 100);
        int[] intArray44 = new int[] {};
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray44, (int) (short) 1);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.subarray(intArray44, (int) (short) 0, (int) (short) -1);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray40, intArray44);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray44, (int) ' ', 10);
        java.lang.Integer[] intArray54 = org.apache.commons.lang3.ArrayUtils.toObject(intArray44);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray54);
        int[] intArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray54, 35);
        int[] intArray60 = org.apache.commons.lang3.ArrayUtils.subarray(intArray57, (int) (short) 100, (int) '4');
        int[] intArray62 = org.apache.commons.lang3.ArrayUtils.add(intArray57, (int) '#');
        java.lang.Integer[] intArray63 = org.apache.commons.lang3.ArrayUtils.toObject(intArray57);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) longArray32, (java.lang.Object) intArray57);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.contains(longArray32, (long) 33);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 1, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[35]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
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
        float[] floatArray23 = new float[] { (byte) 10 };
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) (-1));
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, 0.0f, 100);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray23, (float) 0L);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray30, 10, (int) (byte) 10);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray30, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray36, (float) (short) 100);
        float[] floatArray40 = new float[] { (byte) 10 };
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.add(floatArray40, (float) (-1));
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.add(floatArray42, (float) '4');
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray42);
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray36, floatArray42);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray21, floatArray36);
        java.lang.Float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray36);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.remove(floatArray36, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 0");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray48);
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "a444#a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1000", "  hihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(",aaaaaaaaaaaaaaaaaaaaaaaa...", "##4a#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("h aaahihi... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h aaahihi..." + "'", str1, "h aaahihi...");
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("10.0a1.aaahaaahaaahaaahaaahaaaha", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha" + "'", str2, "10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha");
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 1, false);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true);
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, false, false]");
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 10L);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, 100.0d, 0);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray7);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, 23, (double) 305);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 3");
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
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 0.0, 100.0]");
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
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
        int int89 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray14, (long) 33);
        long[] longArray90 = org.apache.commons.lang3.ArrayUtils.clone(longArray14);
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
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (-1));
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 74, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 74, Length: 0");
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
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                 AAA                                                                                               aaa", 33, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "{-1,10,0,10,1,10,0,0}", "...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        int[] intArray10 = new int[] { (-1), '4', (byte) 10, 1 };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, (int) (short) 100, 100);
        int[] intArray14 = new int[] {};
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray14, (int) (short) 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.subarray(intArray14, (int) (short) 0, (int) (short) -1);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray5, (java.lang.Object) boolean20, 100);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, (double) 64);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray25);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray25, (double) 82);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                    aa                                                                    ", "-,-,-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    aa                                                                    " + "'", str2, "                                    aa                                                                    ");
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (short) 1);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray9);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10);
        java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray16, false);
        java.lang.Long[] longArray25 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray25, (java.lang.Object) (short) 100);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray16, (java.lang.Object) longArray25);
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        java.lang.Long[] longArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        java.lang.Long[] longArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray31);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) doubleArray10, (java.lang.Object[]) longArray31);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10, (double) 100);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray35);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray35, (double) 0L);
        java.lang.Double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 2, 10);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 4, 13);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 516);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
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
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0]");
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        float[] floatArray6 = new float[] { (byte) -1, 100L, 100.0f, 100L, 1, 10.0f };
        float[] floatArray8 = new float[] { (byte) 10 };
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (-1));
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, 0.0f, 100);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray8, (float) 0L);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray8);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray16, (float) (byte) 1);
        float[] floatArray20 = new float[] { (byte) 10 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (-1));
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) '4');
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray24);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) (-1L));
        float[] floatArray29 = new float[] { (byte) 10 };
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray29, (float) (-1));
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray31);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray27, floatArray31);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray31);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, 0.0f);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0, 10.0, 0.0]");
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44AAA444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", "{{ ,#},{ ,#},{ ,#},{ ,#}}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "      HIHIH10     HIHIH0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "{0,10,1,1,0}", 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", "-1-10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
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
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray8, false);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("{{ ,#},{ ,#},{ ,#},{ ,#}}                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{{ ,#},{ ,#},{ ,#},{ ,#}}                 " + "'", str1, "{{ ,#},{ ,#},{ ,#},{ ,#}}                 ");
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                            AAAa", "0.0--------------------0.00.0--------------------0.00.0--------------------0.0110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi..", "{35.0,0.0,100.0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        float[] floatArray8 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) '#');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 2, (int) (short) -1);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) booleanArray3, (java.lang.Object) floatArray8);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, true]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, (int) ' ', 0);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, 'a');
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray19, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 43, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 43, Length: 0");
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        java.lang.Boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray21, "aaahi");
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray21);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray27, false);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "trueaaahitrueaaahitrueaaahifalse" + "'", str24, "trueaaahitrueaaahitrueaaahifalse");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("H  ", 164);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray16);
        java.lang.Object[] objArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) booleanArray16);
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
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[false, false, true, false, false, true, true, true, false]");
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", " 1      aaaa1      aaaa1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray10, true);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
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
        java.lang.Short[] shortArray57 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray57, (short) (byte) 100);
        java.lang.Short[] shortArray62 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray62, (short) 1);
        short[] shortArray71 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray71, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray71);
        short[] shortArray76 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray64, shortArray71);
        java.lang.Short[] shortArray77 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray76);
        short[] shortArray79 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray77, (short) (byte) 0);
        short[] shortArray81 = org.apache.commons.lang3.ArrayUtils.add(shortArray79, (short) 0);
        short[] shortArray82 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray59, shortArray79);
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.contains(shortArray79, (short) -1);
        short[] shortArray85 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray38, shortArray79);
        short[] shortArray86 = org.apache.commons.lang3.ArrayUtils.clone(shortArray79);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray79);
        int int90 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray79, (short) 1, 26);
        boolean boolean92 = org.apache.commons.lang3.ArrayUtils.contains(shortArray79, (short) 0);
        int int94 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray79, (short) (byte) 1);
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
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray76), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[1, 1, 10, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[-1, 10, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray86), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 3 + "'", int94 == 3);
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
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
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray16, 10, 244);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray16);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray16);
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaa1      aaaa            ", "hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa1      aaaa            " + "'", str2, "aaaa1      aaaa            ");
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str1, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aa-10110010", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa-10110010" + "'", str2, "aa-10110010");
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE", "aaa                            aaaA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (short) 0, (int) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray9, 0);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, 28, (-1));
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, 94, (int) (short) 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = org.apache.commons.lang3.ArrayUtils.remove(intArray12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
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
        int[] intArray64 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray63);
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
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[]");
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                                    ", (java.lang.CharSequence) "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", charSequence2, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{", 164, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
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
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray3, (float) '4', 27);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[2.0, 52.0, -1.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0a0a10a1a10a00a0a10a1a10a000.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, ",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", "1.0A0.0                              hihih                                                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0" + "'", str2, "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                aaa", "          A#A444          {-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", "aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,#{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,4{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,a{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 405 + "'", int1 == 405);
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("{}0.0----------------------------------------------------------------aaa----------------------", "", "truetruetruefalse               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{}0.0----------------------------------------------------------------aaa----------------------" + "'", str3, "{}0.0----------------------------------------------------------------aaa----------------------");
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("-1010", "AAa       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.add(booleanArray37, 209, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 209, Length: 5");
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
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("{true,false,false,f   h", "AAA", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray18 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) (byte) 0, (-1));
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray18);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray24, (short) 10);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray24);
        java.lang.Short[] shortArray30 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30, (short) 1);
        short[] shortArray39 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray39, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray39);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray32, shortArray39);
        java.lang.Short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray44);
        java.lang.Short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray45);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray45);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray47, (short) -1);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray47, 33, (-1));
        java.lang.Short[] shortArray55 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray55, (short) 1);
        short[] shortArray64 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray64, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray64);
        short[] shortArray69 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray57, shortArray64);
        short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.add(shortArray69, (short) 10);
        short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.add(shortArray71, (short) 100);
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray71);
        short[] shortArray76 = org.apache.commons.lang3.ArrayUtils.add(shortArray71, (short) 100);
        short[] shortArray77 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray52, shortArray71);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray77);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.contains(shortArray77, (short) 10);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray24, shortArray77);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray24);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 10, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 10, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray76), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110AAAH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110AAAH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110AAAH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" {{,#},{,#},{,#},{,#}}  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{{,#},{,#},{,#},{,#}}" + "'", str1, "{{,#},{,#},{,#},{,#}}");
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(floatArray3, (float) 99);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) (byte) 1);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray12, (int) (byte) 0);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (float) 1);
        long[] longArray22 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.add(longArray22, (long) (short) 1);
        long[] longArray30 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.add(longArray30, (long) (short) 1);
        long[] longArray36 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.contains(longArray36, (long) ' ');
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.addAll(longArray32, longArray36);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray22, longArray36);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray22);
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray41);
        long[] longArray48 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.add(longArray48, (long) (short) 1);
        long[] longArray54 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(longArray54, (long) ' ');
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.addAll(longArray50, longArray54);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.addAll(longArray42, longArray50);
        java.lang.Float[] floatArray65 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray65, 1.0f);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray50, (java.lang.Object) floatArray65);
        java.lang.Float[] floatArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray65);
        java.lang.Float[] floatArray70 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray69);
        float[] floatArray72 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray69, (float) (-1L));
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray72);
        float[] floatArray74 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray72);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[97, 0, 1, 100, 0]");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[-1.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        java.lang.CharSequence charSequence0 = null;
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray12);
        char[] charArray20 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray20, 'a');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.subarray(charArray20, 3, 100);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.clone(charArray20);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.addAll(charArray12, charArray20);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray30 = org.apache.commons.lang3.ArrayUtils.add(charArray12, 516, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 516, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[a, a, 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4]");
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray6 = new float[] { (byte) 10 };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, (float) (-1));
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) '4');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1L));
        float[] floatArray15 = new float[] { (byte) 10 };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, (float) (-1));
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray17);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray13, floatArray17);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray13, (float) 35, (-1));
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, (float) (byte) 100);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray1, floatArray26);
        java.lang.String str28 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean27);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "false" + "'", str28, "false");
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("{-1}", " hi!4hi! hi!ahi!ahi!4", "{{7,99,2,1000,10},{7,99,2,1000,10},{7,99,2,1000,10},{7,99,2,1000,10},{}}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{-1}" + "'", str3, "{-1}");
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18);
        java.lang.String str20 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray19);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, 22, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 22, Length: 8");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{-1,10,0,10,1,10,0,0}" + "'", str20, "{-1,10,0,10,1,10,0,0}");
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
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
        int[] intArray31 = new int[] { (-1), '4', (byte) 10, 1 };
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray31, (int) (short) 100, 100);
        int[] intArray35 = new int[] {};
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray35, (int) (short) 1);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.subarray(intArray35, (int) (short) 0, (int) (short) -1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray31, intArray35);
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.add(intArray31, 0);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.add(intArray31, 94);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray31, (int) (byte) -1);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray26, intArray31);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray31, 0, 12);
        int[] intArray56 = new int[] { (-1), '4', (byte) 10, 1 };
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray56, (int) (short) 100, 100);
        int[] intArray60 = new int[] {};
        int[] intArray62 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray60, (int) (short) 1);
        int[] intArray65 = org.apache.commons.lang3.ArrayUtils.subarray(intArray60, (int) (short) 0, (int) (short) -1);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray56, intArray60);
        int[] intArray68 = org.apache.commons.lang3.ArrayUtils.add(intArray56, 0);
        int int71 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray56, (int) 'a', 0);
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray56, 0, (int) ' ');
        int[] intArray76 = org.apache.commons.lang3.ArrayUtils.add(intArray56, 10);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.contains(intArray56, 27);
        int int80 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray56, (int) '4');
        int int83 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray56, (int) (byte) 1, (int) (short) 0);
        int int85 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray56, (int) ' ');
        int[] intArray87 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray56, 0);
        int[] intArray90 = org.apache.commons.lang3.ArrayUtils.add(intArray56, 4, (int) (byte) 1);
        int[] intArray91 = org.apache.commons.lang3.ArrayUtils.addAll(intArray31, intArray90);
        int[] intArray93 = org.apache.commons.lang3.ArrayUtils.add(intArray91, (-1));
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
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 52, 10, 1, 94]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 52, 10, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 3 + "'", int83 == 3);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[-1, 52, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 52, 10, 1, -1, 52, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[-1, 52, 10, 1, -1, 52, 10, 1, 1, -1]");
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "{hihih}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("trueaaahtrueaaahtrueaaahfalse", 244, 164);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("11100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH01110", "trueaaahtru   eaaahfalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) -1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 0);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
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
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray22);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
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
        int int32 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray31);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                             aaa                                 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "RRRRRR1.0a0.0RRRRRR", 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("... AA-11001011000-11001011000-11001011000-11 AAAHIHI...  ", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-11 AAAHIHI...  " + "'", str2, "0-11 AAAHIHI...  ");
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
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
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray51, (long) 0);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray51, (long) 0, 10);
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.subarray(longArray51, (int) '4', 2);
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray59, (long) (short) 100, 516);
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
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[100, 1, -1, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aahi", (int) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaahiaaa" + "'", str3, "aaaaahiaaa");
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray5, (long) 14, 164);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("false4false4true4true4false4true4false", "##################################################################.1a0.01##################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false4false4true4true4false4true4false" + "'", str2, "false4false4true4true4false4true4false");
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (short) (byte) 1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray13);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray16, 1000, 3);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray19);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[]");
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4, (short) (byte) 100);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        char[] charArray14 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.add(charArray14, 'a');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray14, ' ');
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(charArray14, 'a');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(charArray14, 'a');
        char[] charArray27 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray28 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray27, '4');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray27);
        char[] charArray39 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.add(charArray39, 'a');
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.add(charArray39, ' ');
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        int int45 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray44);
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.addAll(charArray14, charArray44);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) shortArray4, (java.lang.Object) charArray14);
        int int48 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hihih", charArray14);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#,  ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), " 4 aa4 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), " 4 aa4 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ , 4,  , a, a, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
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
        int int90 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray87, (long) 19, 6);
        boolean boolean91 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray87);
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
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{", "0.0   1.0   100.0   10.0   10.0   -1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{" + "'", str2, "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{");
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 64, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray58 = org.apache.commons.lang3.ArrayUtils.add(longArray55, (int) (byte) -1, (long) 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 11");
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
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[100, 1, -1, 0, 1, 0, 97, 1, 100, 0, 0]");
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                       AAa       ", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       AAa       " + "'", str2, "       AAa       ");
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray15 = new char[] { '4', ' ', ' ' };
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray15);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray16, ' ');
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray18, '#');
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4,  , a, a, 4, 4,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}", "true true true false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}" + "'", str2, "{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("99", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "99" + "'", str2, "99");
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = new java.lang.Short[] {};
        java.lang.Short[] shortArray2 = new java.lang.Short[] {};
        java.lang.Short[] shortArray3 = new java.lang.Short[] {};
        java.lang.Short[] shortArray4 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray5 = new java.lang.Short[][] { shortArray0, shortArray1, shortArray2, shortArray3, shortArray4 };
        java.lang.Short[] shortArray6 = new java.lang.Short[] {};
        java.lang.Short[] shortArray7 = new java.lang.Short[] {};
        java.lang.Short[] shortArray8 = new java.lang.Short[] {};
        java.lang.Short[] shortArray9 = new java.lang.Short[] {};
        java.lang.Short[] shortArray10 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray11 = new java.lang.Short[][] { shortArray6, shortArray7, shortArray8, shortArray9, shortArray10 };
        java.lang.Short[][][] shortArray12 = new java.lang.Short[][][] { shortArray5, shortArray11 };
        java.lang.Short[] shortArray13 = new java.lang.Short[] {};
        java.lang.Short[] shortArray14 = new java.lang.Short[] {};
        java.lang.Short[] shortArray15 = new java.lang.Short[] {};
        java.lang.Short[] shortArray16 = new java.lang.Short[] {};
        java.lang.Short[] shortArray17 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray18 = new java.lang.Short[][] { shortArray13, shortArray14, shortArray15, shortArray16, shortArray17 };
        java.lang.Short[] shortArray19 = new java.lang.Short[] {};
        java.lang.Short[] shortArray20 = new java.lang.Short[] {};
        java.lang.Short[] shortArray21 = new java.lang.Short[] {};
        java.lang.Short[] shortArray22 = new java.lang.Short[] {};
        java.lang.Short[] shortArray23 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray24 = new java.lang.Short[][] { shortArray19, shortArray20, shortArray21, shortArray22, shortArray23 };
        java.lang.Short[][][] shortArray25 = new java.lang.Short[][][] { shortArray18, shortArray24 };
        java.lang.Short[] shortArray26 = new java.lang.Short[] {};
        java.lang.Short[] shortArray27 = new java.lang.Short[] {};
        java.lang.Short[] shortArray28 = new java.lang.Short[] {};
        java.lang.Short[] shortArray29 = new java.lang.Short[] {};
        java.lang.Short[] shortArray30 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray31 = new java.lang.Short[][] { shortArray26, shortArray27, shortArray28, shortArray29, shortArray30 };
        java.lang.Short[] shortArray32 = new java.lang.Short[] {};
        java.lang.Short[] shortArray33 = new java.lang.Short[] {};
        java.lang.Short[] shortArray34 = new java.lang.Short[] {};
        java.lang.Short[] shortArray35 = new java.lang.Short[] {};
        java.lang.Short[] shortArray36 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray37 = new java.lang.Short[][] { shortArray32, shortArray33, shortArray34, shortArray35, shortArray36 };
        java.lang.Short[][][] shortArray38 = new java.lang.Short[][][] { shortArray31, shortArray37 };
        java.lang.Short[][][][] shortArray39 = new java.lang.Short[][][][] { shortArray12, shortArray25, shortArray38 };
        java.lang.Short[][][][] shortArray42 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray39, 42, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short[][][][] shortArray44 = org.apache.commons.lang3.ArrayUtils.remove(shortArray42, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 96, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(shortArray42);
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                       aaa##################", "hihi...", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaahiaaa", 859, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("-1{-1,-1,0}11{-1,-1,0}{-1,-1,0}1{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaa", "                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("{0,10,1,1,0}", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{0,10,1,1,0}" + "'", str3, "{0,10,1,1,0}");
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                 ", 139);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                           " + "'", str2, "                                                                                                                                           ");
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
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
        float[] floatArray37 = new float[] { (byte) 10 };
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.add(floatArray37, (float) (-1));
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray37);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray40, (int) (short) 0, (float) (short) -1);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray40);
        float[] floatArray46 = new float[] { (byte) 10 };
        float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.add(floatArray46, (float) (-1));
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.add(floatArray48, (float) '4');
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray50);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.contains(floatArray50, (float) 10);
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray50, 10.0f, (int) (byte) 10);
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray50, (float) (short) 1, 0);
        float[] floatArray60 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray40, floatArray50);
        float[] floatArray61 = null;
        float[] floatArray62 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray50, floatArray61);
        float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray50, 0, 19);
        float[] floatArray68 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray50, 12, 1000);
        float[] floatArray69 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray24, floatArray68);
        float[] floatArray70 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray24);
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
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[]");
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[10.0, 52.0, -1.0, 100.0]");
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaa1aaaa", "                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "trueaaahtrueaaahtrueaaahfalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih");
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  A                                                                      AAA                                                                                                     A               A A                                 A A                                 A   A                                 A ", " HIHIH10     HIHIH0                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A                                                                      AAA                                                                                                     A               A A                                 A A                                 A   A                                 A" + "'", str2, "A                                                                      AAA                                                                                                     A               A A                                 A A                                 A   A                                 A");
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("1      aaaA1      aaaA1", "                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1      aaaA1      aaaA1" + "'", str2, "1      aaaA1      aaaA1");
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray4 = new double[] {};
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) '4', (double) (byte) -1);
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray12);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 100L);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray16, (double) 100, (-1), (double) 24);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray16, (double) 23, 11, (double) (byte) 10);
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("A1A10A0A0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A1A10A0A0" + "'", str1, "A1A10A0A0");
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("              1110               ", 0, "                                                                 AAAAA                                                                                               AAAAAAEAAAHFALSE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              1110               " + "'", str3, "              1110               ");
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("a#a444 4 aa4a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#a444 4 aa4a" + "'", str1, "a#a444 4 aa4a");
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                              ", "-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
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
        long[] longArray57 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.add(longArray57, (long) (short) 1);
        long[] longArray63 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.contains(longArray63, (long) ' ');
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.addAll(longArray59, longArray63);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray66);
        java.lang.Long[] longArray74 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray75 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray74);
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.addAll(longArray66, longArray75);
        int int79 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray75, (long) 1, 35);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.addAll(longArray19, longArray75);
        int int83 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, 0L, 0);
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
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, -1, -1, 1, 0, 100, 1, 0, 97, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 4 + "'", int79 == 4);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaahi#######################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A" + "'", str1, "0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A");
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("     hi..     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi.." + "'", str1, "hi..");
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "{97,0,1,100,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{97,0,1,100,0}" + "'", str1, "{97,0,1,100,0}");
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        short[] shortArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
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
        java.lang.Integer[] intArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray18);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = org.apache.commons.lang3.ArrayUtils.add(intArray24, 12, 41);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
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
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(byteArray16, (byte) 0);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.clone(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, 57, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 57, Length: 2");
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
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 1]");
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("{-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      ", "aaaa10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      " + "'", str2, "{-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      ");
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 28);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (int) (short) 0, 7);
        java.lang.Double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray10);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (-1));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0]");
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("       aaa                  ", "flse4flse4true4true4flse4true4flse", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       aaa                  " + "'", str3, "       aaa                  ");
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  aaaa10", 58, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa  aaaa10aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaa  aaaa10aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("trueaaa                            aaaAtrueaaa                            aaaAtrueaaa                            aaaAfalse", 13, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Aaa 1.0 aaa 100.0 aaa 10.01.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0aaa 10.0 aaa -1.0", "{-1,0,1,100,1}", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray59 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
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
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("{true,true,true,false}  ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{true,true,true,f lse}  " + "'", str3, "{true,true,true,f lse}  ");
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("{#,4}", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{#,4}" + "'", str2, "{#,4}");
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.subarray(strArray3, (int) 'a', (int) '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hi!HI", "                                                                 AAA                                                                                               aaa");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("       AAA", strArray3, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                 aAAAa                                                                                               aaaaaA", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "       AAA" + "'", str10, "       AAA");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{hi!HI}" + "'", str12, "{hi!HI}");
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 57);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        java.lang.Object[] objArray0 = null;
        char[] charArray4 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray4);
        java.lang.Class<?> wildcardClass7 = charArray6.getClass();
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0 0 10 1 10 0", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00101100" + "'", str2, "00101100");
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h   ", "aaahi######################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " HIHIH10     HIHIH0                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray15, true);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, true]");
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "AAA4444444444-1A10A0A10...", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 100);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 10);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray8, (byte) -1);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 164, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
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
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray50, (long) (short) 0, (int) 'a');
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray50);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.subarray(longArray55, 26, 52);
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray58, (long) (short) 10, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("falsefalsetruetruefalsetrue", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAA...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa aaaA", "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 10L);
        double[] doubleArray8 = new double[] {};
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) '4', (double) (byte) -1);
        double[] doubleArray16 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray8, doubleArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 100, (double) 100);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray8, 0, 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 1L);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray8);
        double[] doubleArray27 = new double[] {};
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) '4', (double) (byte) -1);
        double[] doubleArray35 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray27, doubleArray35);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 10.0f, (int) '4');
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (double) (byte) -1);
        double[] doubleArray43 = new double[] { 1.0f };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray43);
        double[] doubleArray45 = new double[] {};
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray43, doubleArray45);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.add(doubleArray43, (double) (short) -1);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray27, doubleArray43);
        double[] doubleArray51 = org.apache.commons.lang3.ArrayUtils.add(doubleArray43, (double) 3);
        double[] doubleArray54 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray51, 10, (int) (byte) 10);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray54);
        double[] doubleArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray54, 0.0d);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray54);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray19);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray20);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1, 115);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a1A10A0A0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1A10A0A0" + "'", str2, "1A10A0A0");
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray8, (double) ' ');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray12, (double) 3);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray14, (double) (byte) 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray14, (double) 28);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray14, (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 10.0, 35.0, 3.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 35.0, 3.0]");
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                       false4false4true4true4false4true4false", ".0a1.aaahaaahaaahaaahaaahaaaha");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("-1#-1#0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
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
        java.lang.Float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray48);
        float[] floatArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray48);
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) floatArray48);
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
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0.01.0100.010.010.0-1.0" + "'", str59, "0.01.0100.010.010.0-1.0");
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("h h h h h h h h h aaa AAA", "                            AAAa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("10hi1", "###", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

