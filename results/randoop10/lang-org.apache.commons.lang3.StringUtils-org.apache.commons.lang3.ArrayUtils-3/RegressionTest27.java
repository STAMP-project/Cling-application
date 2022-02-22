import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("FALSE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FALSE" + "'", str1, "FALSE");
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1);
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) '#', 19, (double) 'a');
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) 100, (double) 3);
        double[] doubleArray18 = new double[] {};
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) '4', (double) (byte) -1);
        double[] doubleArray26 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray18, doubleArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 10.0f, (int) '4');
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray18, (double) (byte) -1);
        double[] doubleArray34 = new double[] { 1.0f };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray34);
        double[] doubleArray36 = new double[] {};
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray34, doubleArray36);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.add(doubleArray34, (double) (short) -1);
        double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray18, doubleArray34);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.add(doubleArray34, (double) 3);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray42, 10, (int) (byte) 10);
        double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray8, doubleArray45);
        java.lang.Double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray46);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, -1.0, 10.0, 35.0]");
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
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
        double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, 33, (int) 'a');
        double[] doubleArray62 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray64 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray62, (double) 100);
        double[] doubleArray65 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray58, doubleArray62);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray58, (double) 10.0f, (double) 139);
        java.lang.Double[] doubleArray71 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray73 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray71, (double) 1);
        java.lang.Double[] doubleArray74 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray71);
        double[] doubleArray75 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray71);
        int int79 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray75, (double) (short) -1, 10, (double) 17);
        double[] doubleArray80 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray75);
        double[] doubleArray81 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray58, doubleArray80);
        int int84 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray80, (double) 44, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray16, (short) 10);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) 100);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray18);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray18, 99, 6);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.add(shortArray24, (short) (byte) 10);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.clone(shortArray24);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.add(shortArray24, 32, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
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
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[10]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[]");
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", "aAAAaaaaaaAeaaahfalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0" + "'", str2, "44444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihi4444#4444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str3, "444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihi4444#4444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi444hihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("haAAaAAaAAaAAaAAaAAaAAaAAaAA", "                                 aaa                                                            aaaA", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray18 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) (byte) 0, (-1));
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray18);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray24, (short) 10);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray24);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.clone(shortArray24);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray24, (short) 0, 12);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray24, (short) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 0, 10, 10, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0, 0, 10, 10, 0]");
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (byte) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 1, 1, 0]");
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", "                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray11, '#');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 2, ' ');
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("aaaa1      aaaa           ", charArray16);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "## 4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "## 4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #,  , 4, a, #]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("-,-,-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-,-,-" + "'", str1, "-,-,-");
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 28);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (int) (short) 0, 7);
        java.lang.Double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray10);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray12, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 1.0]");
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("10.01.0                                                                                                   AAAA1      AAA", "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.01.0                                                                                                   AAAA1      AAA" + "'", str2, "10.01.0                                                                                                   AAAA1      AAA");
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                     aaaa1aaaa                      ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 1, 1, 10, 0]");
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      A2.0hihih52.0hihih-1.0      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AA", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAA1      AAA      AAAA1      AAA      AAAA1 " + "'", str2, "      AAAA1      AAA      AAAA1      AAA      AAAA1 ");
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
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
        boolean[] booleanArray33 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray40 = new boolean[] { false, false, true, true, false, true };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray33, booleanArray40);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray40);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray42, false, 93);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray42);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray42);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray26, booleanArray47);
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
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, false, true, true, false, true, true, false, true, true, false, false]");
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1L);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray20 = new double[] { 1.0f };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray20);
        double[] doubleArray22 = new double[] {};
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray20, doubleArray22);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, (double) 'a', 35, (double) 28);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray20, (double) 10.0f, 0.0d);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray20, 0.0d);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, (double) 0.0f);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, 0.0d, (int) (short) 100);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) (-1.0f), 32);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray18, doubleArray20);
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        double[] doubleArray20 = new double[] {};
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) '4', (double) (byte) -1);
        double[] doubleArray28 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray20, doubleArray28);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, (double) 10.0f, (int) '4');
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray20, (double) (byte) -1);
        double[] doubleArray36 = new double[] { 1.0f };
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray36);
        double[] doubleArray38 = new double[] {};
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray36, doubleArray38);
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.add(doubleArray36, (double) (short) -1);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray20, doubleArray36);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.add(doubleArray36, (double) 3);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray44, 10, (int) (byte) 10);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray19, doubleArray44);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray44);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray44);
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 3.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray6, (java.lang.Object) (short) 100);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) 58);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(longArray13, (long) (byte) 10);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0 1.0 100.0 10.0 10.0 -1.0,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..true,false}", "aa####10");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ah  #h  ah  4h  4h  4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ah#hah4h4h4" + "'", str1, "ah#hah4h4h4");
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aa.a444444aa.aaa.aa.aaa.aa.aaa.aa.aaa.aahi...44aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-a.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa52.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-a.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaa.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaa.a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa.a444444aa.aaa.aa.aaa.aa.aaa.aa.aaa.aahi...44aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-a.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa52.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-a.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaa.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaa.a" + "'", str1, "aa.a444444aa.aaa.aa.aaa.aa.aaa.aa.aaa.aahi...44aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-a.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa52.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-a.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaa.a44444444444444444444444444444ttttttttttttttttttttttttttttttttAAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaa.a");
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0.04aaa41.04aaa4100.04aaa410.04aaa410.04aaa4-1.0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAA                                ", "                            hihi...                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA                                " + "'", str2, "AAA                                ");
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
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
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray46);
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
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[true, false, false, true, false]");
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("         1A10A0A0", "                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("{TRUE,FALSE,FALSE,FALSE,TRUE,FALSE}", "       97 1 100 0 -1 -1 0", 523, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       97 1 100 0 -1 -1 0" + "'", str4, "       97 1 100 0 -1 -1 0");
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                    ", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRaaaRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 5, 27, 26, 8 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        java.lang.Class[] classArray11 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class[] classArray17 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class[][] classArray23 = new java.lang.Class[5][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray24 = (java.lang.Class<?>[][]) classArray23;
        wildcardClassArray24[0] = classArray8;
        wildcardClassArray24[1] = classArray11;
        wildcardClassArray24[2] = wildcardClassArray15;
        wildcardClassArray24[3] = wildcardClassArray18;
        wildcardClassArray24[4] = wildcardClassArray21;
        java.lang.Class<?>[][] wildcardClassArray37 = org.apache.commons.lang3.ArrayUtils.subarray(wildcardClassArray24, 14, 21);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) intArray5, (java.lang.Object[]) wildcardClassArray37);
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(",4,4,4}a,#,a{", "trueaaahtru   eaaahfalse", 13);
        java.lang.Class<?>[][] wildcardClassArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(wildcardClassArray37, (java.lang.Object) strArray42);
        java.lang.reflect.Type[][] typeArray46 = org.apache.commons.lang3.ArrayUtils.subarray((java.lang.reflect.Type[][]) wildcardClassArray37, 139, (int) (byte) -1);
        java.util.Map<java.lang.Object, java.lang.Object> objMap47 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) wildcardClassArray37);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(objMap47);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 10, 5);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                 AAAAA                                                                                               AAAAAAEAAAHFALSE", "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                             aaaA", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        boolean[] booleanArray5 = new boolean[] { true, false, false, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray9 = new boolean[] { true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true);
        boolean[] booleanArray19 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray26 = new boolean[] { false, false, true, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray26);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray28, false, 93);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray28, true);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray28);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, 57, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 57, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, false, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, false, false, true, false, false, false, true, true, false, true]");
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (short) 0, (int) (short) -1);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, 516);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray9, 35);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray9, 94);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray9, 96);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.subarray(intArray9, 65, 99);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = org.apache.commons.lang3.ArrayUtils.remove(intArray18, 106);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 106, Length: 0");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[3]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[3]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!4HI! HI!AHI!AHI!4", "", "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!4HI! HI!AHI!AHI!4" + "'", str3, "HI!4HI! HI!AHI!AHI!4");
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 27, "h   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h   h   h   h   h   h   h  " + "'", str3, "h   h   h   h   h   h   h  ");
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HIHI...", "", 44, 51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIHI..." + "'", str4, "HIHI...");
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("eslafeurteurteurteslafesl", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaa   haaa", "                ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray11, '#');
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1110", charArray13);
        char[] charArray22 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray22, 'a');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray22, '#');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.subarray(charArray22, (int) 'a', 35);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                aaa", charArray22);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray13, charArray22);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray13);
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 1);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...", "aaaA", 99);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny("aaahihi...", strArray26);
        java.lang.String[] strArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray26);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) shortArray19, (java.lang.Object[]) strArray28);
        java.lang.Short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
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
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortArray30);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                  aaahihi#..    ", "                                                                 AaaaA                                                                                               AAAAAaEAAAHFALSE");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{10.0}aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hihi#.." + "'", str4, "hihi#..");
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray11, "aaa444444444444444444444444444...");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.01.0100.010.010.0-1.0" + "'", str13, "0.01.0100.010.010.0-1.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0aaa444444444444444444444444444...1.0aaa444444444444444444444444444...100.0aaa444444444444444444444444444...10.0aaa444444444444444444444444444...10.0aaa444444444444444444444444444...-1.0" + "'", str15, "0.0aaa444444444444444444444444444...1.0aaa444444444444444444444444444...100.0aaa444444444444444444444444444...10.0aaa444444444444444444444444444...10.0aaa444444444444444444444444444...-1.0");
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("{{ ,#},{ ,#},{ ,#},{ ,#}}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{{ ,#},{ ,#},{ ,#},{ ,#}}" + "'", str1, "{{ ,#},{ ,#},{ ,#},{ ,#}}");
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("       AAA                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRaaa                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       AAA                  " + "'", str2, "       AAA                  ");
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, 0.0f, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                 aAAAa                                                                                               aaaaaA", "{true,true,true,false}", 35);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("0.1A0.01", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
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
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray23);
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
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
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
        int int43 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) shortArray39);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray39, (short) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, 'a');
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        float[] floatArray16 = new float[] { (byte) 10 };
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (float) (-1));
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) '4');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray20);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (-1L));
        float[] floatArray25 = new float[] { (byte) 10 };
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) (-1));
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.add(floatArray27, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray27);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray23, floatArray27);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, (float) 35, (-1));
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) (byte) 100);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.add(floatArray36, (float) 1);
        java.lang.Float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) charArray14, (java.lang.Object) floatArray38);
        java.lang.Object[] objArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) charArray14);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, -1.0, 52.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[a, #, a, 4, 4, 4]");
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        boolean[] booleanArray14 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray21 = new boolean[] { false, false, true, true, false, true };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray21, false);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray21, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray21);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray5, (java.lang.Object) booleanArray28, (int) (byte) -1);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        java.lang.Character[] charArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray32);
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray33, ' ');
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
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, #, 4, a, #]");
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" aaahihi... ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " aaahihi... " + "'", str3, " aaahihi... ");
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 93, 93, 33, 93, 94, 3 };
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "93933393943" + "'", str8, "93933393943");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[93, 93, 33, 93, 94, 3]");
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "{{,#},{,#},{,#},{,#}}", (java.lang.CharSequence) "    #####...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaahihi#..                                                                     4444444444444444444444444...   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.0", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.0" + "'", str3, "2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.01.0A0.0                              hihih                                                      ...2.0hihih52.0hihih-1.0");
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        java.lang.Long[][][][] longArray0 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray1 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][][] longArray2 = new java.lang.Long[][][][][] { longArray0, longArray1 };
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 100);
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray11, (short) 1);
        short[] shortArray20 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray20);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray13, shortArray20);
        java.lang.Short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray25);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray26, (short) (byte) 0);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.add(shortArray28, (short) 0);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray8, shortArray28);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray31);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray31, (short) 0, 5);
        java.lang.Long[][][][][] longArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) int35);
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
        java.lang.Long[][][][][] longArray74 = org.apache.commons.lang3.ArrayUtils.addAll(longArray2, longArray73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[][][][][] longArray76 = org.apache.commons.lang3.ArrayUtils.remove(longArray2, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 36, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[1, 1, 10, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(longArray36);
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
        org.junit.Assert.assertNotNull(longArray74);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (short) -1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.io.Serializable[] serializableArray9 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) strArray2, (java.io.Serializable) "");
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray12, (double) 1);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) serializableArray9, (java.lang.Object) doubleArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray15, '4');
        java.lang.Double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray15);
        java.lang.Double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray15);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray20, '#');
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.041.0" + "'", str18, "10.041.0");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10.0#1.0" + "'", str22, "10.0#1.0");
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      a444#a                                             ", 97, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      a444#a                                             " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      a444#a                                             ");
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIAAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIAAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIA444#AAAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIAAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIAAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, '#');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, 'a', (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(charArray10, '#');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hihi...                  ", "#                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                              ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) -1, 1, (double) 516);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, (double) 21);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) 55);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 0.0, 100.0, 21.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray9, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      AAAA1      AAA", charArray14);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.subarray(charArray14, (int) (short) 1, 18);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.subarray(charArray21, 42, (int) (short) 100);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  hihih", charArray24);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray24, 'a');
        java.lang.Character[] charArray28 = org.apache.commons.lang3.ArrayUtils.toObject(charArray24);
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray0, (java.lang.Object) charArray8);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) doubleArray0);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 168);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("------------aaa----------------------------------1.0", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "------------aaa----------------------------------1.0" + "'", str5, "------------aaa----------------------------------1.0");
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray11 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray11, false);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray6, booleanArray13);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray17);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray19);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray19, 1, 28);
        java.lang.reflect.Type[] typeArray24 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.reflect.Type[]) wildcardClassArray0, (java.lang.Object) booleanArray19);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray19, false);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray19, true);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str18, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, true, true, true, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[true, true, true, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                 aAAAa                                                                                               aaaaaA", "{-1,0,1,100,1", (-1));
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) (short) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.io.Serializable[] serializableArray14 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) strArray7, (java.io.Serializable) "");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(serializableArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray15, 35, (int) (short) -1);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray18, true, (int) '#');
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray18);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray18, true);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray14, (short) -1);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray14);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray10);
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13, '4');
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray15, '#');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("10110", "    #####...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    #####..." + "'", str2, "    #####...");
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.1A0.01", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("{-1}", charArray10);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
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
            long[] longArray32 = org.apache.commons.lang3.ArrayUtils.add(longArray28, 74, (long) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 74, Length: 3");
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
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "{97,0,1,100,0}", (java.lang.CharSequence) "AAa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
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
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.add(booleanArray46, false);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray46, false, 799);
        boolean[] booleanArray57 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray62 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray62, false);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray64);
        boolean[] booleanArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray64);
        boolean[] booleanArray67 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray57, booleanArray64);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray67);
        boolean[] booleanArray71 = org.apache.commons.lang3.ArrayUtils.add(booleanArray67, 4, true);
        boolean[] booleanArray73 = org.apache.commons.lang3.ArrayUtils.add(booleanArray71, true);
        boolean[] booleanArray75 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray71, true);
        boolean[] booleanArray77 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray75, true);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray46, booleanArray77);
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
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, false, true, true, false, true, false, false, false, true, false, false, false]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray57), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray64), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(booleanArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray66), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(booleanArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray71), "[false, false, true, false, true, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray73), "[false, false, true, false, true, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray75), "[false, false, false, true, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray77), "[false, false, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAA10.0a1.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAA", "       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "-11001011000-11001011000-11001011000-11 aa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...", "aaaaaaaa                  ...aaaaaa", "93933393943");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHI{1,1,10}HIHI{1,1,10}HIHI{1,1,10}HIHI{1,1,10}HIHI{1,1,10}HIHI{1,1,10}HIHI" + "'", str3, "HIHI{1,1,10}HIHI{1,1,10}HIHI{1,1,10}HIHI{1,1,10}HIHI{1,1,10}HIHI{1,1,10}HIHI");
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (byte) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 0L, (int) (byte) 100);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 42, 0.0d);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, 0.0d, 63);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("}1-{", "hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true, (int) '#');
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true, (int) (short) -1);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, 1, true);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.add(booleanArray25, 51, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 51, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, false, false, false, true, false]");
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi", "aaa                                                        HIHIH                              ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 100L);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        float[] floatArray9 = new float[] { (byte) 10 };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) (-1));
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (int) (short) 0, (float) (short) -1);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray12);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray12);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) floatArray7, (java.lang.Object) floatArray17);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah", "1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                itrueaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah");
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10, (float) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10, (float) 7);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray14);
        java.lang.String str17 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) floatArray14, "0.0 1.0 100.0 10.0 10.0 -1.0");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{0.0,1.0,100.0,10.0,10.0,-1.0}" + "'", str17, "{0.0,1.0,100.0,10.0,10.0,-1.0}");
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(",aaaaaaaaaaaaaaaaaaaaaaaa...", "2.052.0-1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, ",aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
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
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.subarray(longArray5, 3, (-1));
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toObject(longArray29);
        java.lang.Long[] longArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray30);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray30);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray30);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray30, (java.lang.Object) "{1,100,1,-1}");
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
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
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray26, (float) 165);
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
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 10.0, 10.0, 100.0, 1.0, 0.0, -1.0, 52.0, 2.0]");
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
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
        java.lang.Comparable<java.lang.String>[][] strComparableArray38 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.Comparable<java.lang.String>[][]) strArray12, (java.lang.Comparable<java.lang.String>[][]) strArray37);
        java.lang.CharSequence[][] charSequenceArray39 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.CharSequence[][]) strArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][] strComparableArray41 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.Comparable<java.lang.String>[][]) strArray37, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
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
        org.junit.Assert.assertNotNull(strComparableArray38);
        org.junit.Assert.assertNotNull(charSequenceArray39);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray11, '#');
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1110", charArray13);
        char[] charArray22 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray22, 'a');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray22, '#');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.subarray(charArray22, (int) 'a', 35);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                aaa", charArray22);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray13, charArray22);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.clone(charArray22);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray22, ' ');
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4,  , a, a, 4]");
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0", "trueaaahitrueaaahitrueaaahifalse", "393933393943793933393943289393339394310");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35" + "'", str1, "35");
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hIHIH######################", "100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaa", "                                                                 AAAAA                                                                                               AAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa" + "'", str2, "aaaa");
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, false);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        java.lang.Long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) 97);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("       97 1 100 0 -1 -1 0", "AAAAAAAAAA0.140.01AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, true, false, false, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray20 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, (-1));
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) -1);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray20);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.clone(shortArray20);
        java.lang.Short[] shortArray32 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32, (short) 1);
        short[] shortArray41 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray41, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray41);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray34, shortArray41);
        java.lang.Short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray46);
        java.lang.Short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray47);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray48);
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.add(shortArray49, (short) 0);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray49);
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray29, shortArray49);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray53, (int) (byte) 0, (short) (byte) 100);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray53, (short) 0);
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray53);
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.add(shortArray60, (short) (byte) -1);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray62, (short) 0, 24);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 13 + "'", int58 == 13);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[0, 0, 10, 1, 10, 0, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaa10.0a1.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaa10.0a1.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaa10.0a1.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaa");
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("00101100", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(floatArray3, (float) 99);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) (byte) 1);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray12, (int) (byte) 0);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray12, (float) 96, 516);
        java.lang.Class<?> wildcardClass18 = floatArray12.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.0444444", "10hi1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (int) (short) 0, (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10, 100]");
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "{-1,0,1,100,1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, true, 100);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, false);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(charArray8, 'a');
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(charArray8, 'a');
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (byte) 10);
        char[] charArray24 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray25 = org.apache.commons.lang3.ArrayUtils.toObject(charArray24);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.clone(charArray24);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.addAll(charArray8, charArray24);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray24, '4', 27);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray24);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", charArray24);
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.subarray(charArray24, 24, (int) (byte) -1);
        int int36 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "040410414104", charArray24);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4 aa44# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4 aa44# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4,  , a, a, 4, 4, #,  ]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                falsefalsetruetruefalsetrue44444444444444444444444444444444444444", "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", "{}0.0----------------------------------------------------------------aaa----------------------{}0.0----------------------------------------------------------------aaa----------------------{}0.0----------------------------------------------------------------aaa----------------------{}0.0---------1001-1010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                f-lsef-lsetruetruef-lsetrue44444444444444444444444444444444444444" + "'", str3, "                                f-lsef-lsetruetruef-lsetrue44444444444444444444444444444444444444");
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray3);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) 10, (int) (short) 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray21, (byte) -1, (int) 'a');
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 10);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray21);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray3, byteArray21);
        java.lang.Byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray3);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray3, (byte) -1);
        java.lang.Byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
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
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray33);
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
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("-1A1A10A0A0-1A1A10A0A00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1A1A10A0A0-1A1A10A0A00" + "'", str1, "-1A1A10A0A0-1A1A10A0A00");
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  4444444444444444444444444...  ", 97, 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  4444444444444444444444444...  " + "'", str3, "  4444444444444444444444444...  ");
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..");
        java.lang.Object obj2 = null;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray1, obj2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        double[] doubleArray5 = new double[] { 65, 5, (short) 0, 10.0f, 65 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 17);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[65.0, 5.0, 0.0, 10.0, 65.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[65.0, 5.0, 0.0, 10.0, 65.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[65.0, 5.0, 0.0, 10.0, 65.0, 17.0]");
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0.04aaa41.04aaa4100.04aaa410.04aaa410.04aaa4-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.04aaa41.04aaa4100.04aaa410.04aaa410.04aaa4-1." + "'", str1, "0.04aaa41.04aaa4100.04aaa410.04aaa410.04aaa4-1.");
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                              ", 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                       aaaaaaaaaaaaaaaaaaaaa", "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0" + "'", str2, "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0");
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
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
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray32);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray32);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray34);
        boolean[] booleanArray42 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray49 = new boolean[] { false, false, true, true, false, true };
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray42, booleanArray49);
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray49);
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray51, false, 93);
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray51, true);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray51, false);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray34, booleanArray51);
        boolean[] booleanArray60 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray59);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray25, booleanArray60);
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
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray60), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("            Hi             ", "aaa                        hi!Haaa                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, 'a');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.subarray(charArray11, 18, 28);
        java.lang.String str18 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) 28, "1.0...");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "28" + "'", str18, "28");
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray6, (java.lang.Object) (short) 100);
        java.lang.Long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.clone(longArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray12, (long) 57);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray8, (byte) -1);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray8, 305, 10);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray15, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
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
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", "                                aaa");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray25);
        java.lang.Byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray27, "aaaA");
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray27, (byte) 100);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray26, (java.lang.Object) byteArray27, 0);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray27);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray21, (java.lang.Object) byteArray27);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21, false);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21, false);
        java.lang.Boolean[] booleanArray44 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray44, false);
        java.lang.Boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray44);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray47);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray47, true);
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray47);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray39, booleanArray51);
        boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray39, 74, 626);
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[true, true, true, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[]");
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (short) (byte) 1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray15);
        short[] shortArray23 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, (-1));
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray23);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.add(shortArray23, 2, (short) (byte) 0);
        short[] shortArray37 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray37, (short) (byte) 0, (-1));
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.add(shortArray37, (short) (byte) -1);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.add(shortArray37, (short) (byte) 1);
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray44, (short) (byte) 1, (int) ' ');
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.add(shortArray44, (short) 0);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray30, shortArray49);
        java.lang.Short[] shortArray53 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray53, (short) 1);
        short[] shortArray62 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray62, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray62);
        short[] shortArray67 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray55, shortArray62);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray55, (short) 10);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray30, shortArray55);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray55);
        short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray55, (short) (byte) -1);
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.clone(shortArray55);
        short[] shortArray76 = org.apache.commons.lang3.ArrayUtils.add(shortArray55, (short) 10);
        short[] shortArray78 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray76, (short) 1);
        short[] shortArray80 = org.apache.commons.lang3.ArrayUtils.add(shortArray78, (short) (byte) 10);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray16, shortArray78);
        int int84 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) (byte) 0, 13);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[10]");
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray76), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray78), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray80), "[10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("      a444#a       ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", strArray2);
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
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray29, (long) 0);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray29, 10L);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray29, (long) (short) -1);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray29, 0L, 165);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) longArray29, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray3 = new int[] {};
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray3, (int) (short) 1);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (short) -1);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 3);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray10, 516);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, 35);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray12);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.add(intArray12, (int) '#');
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.add(intArray12, 859);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray19, 7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[3]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[3]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[3, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[3, 859]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[3, 859]");
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaA");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "-1A10A0A10A1A10A0A0");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("   h                                                            ...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       AAA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, " 1      AAAA1      AAAA1");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("IH", strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) 2, (double) (byte) -1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) 10.0f, 58, (double) (short) 100);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 1.0f, 181, (double) 44);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
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
        java.lang.Integer[] intArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray22);
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
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AaaaaaA", 4, 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        char[] charArray4 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray4, '4');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray4);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.subarray(charArray9, 0, (int) (short) 10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-101100", charArray9);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
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
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray18);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray18, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 26, Length: 9");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, true, true, true, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, false, false, true, true, true, false]");
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 0);
        java.lang.Byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("Aaa                            aaaA", (java.lang.Object[]) byteArray10);
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray10);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) 0);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) 1);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray22, (byte) -1, (int) 'a');
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray22);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.clone(byteArray22);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray27, (byte) 10, (-1));
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray27, 2, 35);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray33);
        java.lang.Byte[] byteArray40 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray40);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.add(byteArray41, (byte) 0);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray41);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray44);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray44);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray44, (byte) 10);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray44, (byte) 0, (int) (short) 100);
        byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray33, byteArray44);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray19, byteArray52);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("a#a444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#a444" + "'", str1, "a#a444");
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray8, '4');
        java.lang.Character[] charArray18 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18, '4');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray20);
        java.lang.Character[] charArray22 = org.apache.commons.lang3.ArrayUtils.toObject(charArray20);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray20);
        java.lang.Character[] charArray24 = org.apache.commons.lang3.ArrayUtils.toObject(charArray11);
        char[] charArray31 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.add(charArray31, 'a');
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.add(charArray31, ' ');
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray31);
        char[] charArray40 = new char[] { '4', ' ', ' ' };
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.addAll(charArray31, charArray40);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.add(charArray41, ' ');
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray41);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.subarray(charArray41, 106, 139);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray47, 'a');
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "a#a4444a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "a#a4444a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[a, #, a, 4, 4, 4, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[ , 4,  , a, a, 4, 4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ , 4,  , a, a, 4, 4,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "a#a4444 4 aa44  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "a#a4444 4 aa44  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[a, #, a, 4, 4, 4, 4,  , 4,  , a, a, 4, 4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (byte) 0);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, 9, (-1));
        int[] intArray16 = new int[] { (-1), '4', (byte) 10, 1 };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, (int) (short) 100, 100);
        int[] intArray20 = new int[] {};
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray20, (int) (short) 1);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.subarray(intArray20, (int) (short) 0, (int) (short) -1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray16, intArray20);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.add(intArray16, 0);
        int[] intArray29 = new int[] {};
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray29, (int) (short) 1);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray29, 100);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray29, (int) '#', 0);
        int[] intArray41 = new int[] { (-1), '4', (byte) 10, 1 };
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray41, (int) (short) 100, 100);
        int[] intArray45 = new int[] {};
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray45, (int) (short) 1);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.subarray(intArray45, (int) (short) 0, (int) (short) -1);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray41, intArray45);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.add(intArray41, 0);
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray41, (int) 'a', 0);
        int[] intArray57 = org.apache.commons.lang3.ArrayUtils.addAll(intArray29, intArray41);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray28, intArray29);
        int[] intArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray29, 35);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.contains(intArray29, 35);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray8, intArray29);
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.subarray(intArray29, 1, (int) 'a');
        int[] intArray68 = org.apache.commons.lang3.ArrayUtils.add(intArray29, 24);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
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
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[24]");
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
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
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray29, 0L, 1000);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
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
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray29, (long) 6);
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444440A0A01A1A444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444440A0A01A1A444444444444444444444" + "'", str1, "4444444444444444444440A0A01A1A444444444444444444444");
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
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
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray30);
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
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, false, false, false, true, false]");
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0", "011000-11 AAAHIHI...  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "              1110               ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "##4a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("trueaaahtrueaaahtrueaaahfalse", 106, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a0.0                              HIHIH                                                        aaa-1.0", "0404104141040");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0.1----------------------------------AAA----------------------------------------------------------------0.01---------------------------------AAA----------------------------------------------------------------0.01---------------------------------AAA----------------------------------------------------------------0.001---------------------------------AAA----------------------------------------------------------------0.1---------------------------------AAA----------------------------------------------------------------0.0", "1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("trueaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "trueaaa" + "'", str1, "trueaaa");
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "      HIHIH10     HIHIH0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "se");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0.0------------------                    ...--------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", "10.0a1.aaahaaahaaahaaahaaahaaaha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0------------------                    ...--------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0" + "'", str2, "0.0------------------                    ...--------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        java.util.Map[] mapArray1 = new java.util.Map[0];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray2 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray1;
        java.util.Map[] mapArray4 = new java.util.Map[0];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray5 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray4;
        java.util.Map[][] mapArray7 = new java.util.Map[2][];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray8 = (java.util.Map<java.lang.Object, java.lang.Object>[][]) mapArray7;
        objMapArray8[0] = mapArray1;
        objMapArray8[1] = mapArray4;
        java.util.Map[] mapArray14 = new java.util.Map[0];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray15 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray14;
        java.util.Map[] mapArray17 = new java.util.Map[0];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray18 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray17;
        java.util.Map[][] mapArray20 = new java.util.Map[2][];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray21 = (java.util.Map<java.lang.Object, java.lang.Object>[][]) mapArray20;
        objMapArray21[0] = mapArray14;
        objMapArray21[1] = mapArray17;
        java.util.Map[][][] mapArray27 = new java.util.Map[2][][];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[][][] objMapArray28 = (java.util.Map<java.lang.Object, java.lang.Object>[][][]) mapArray27;
        objMapArray28[0] = objMapArray8;
        objMapArray28[1] = objMapArray21;
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray33);
        char[] charArray41 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.add(charArray41, 'a');
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.add(charArray41, ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray41);
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray33, (java.lang.Object) charArray41);
        java.lang.Double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray33);
        java.lang.Double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray33);
        double[] doubleArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray49, (-1.0d));
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray49);
        java.util.Map<java.lang.Object, java.lang.Object>[][][] objMapArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(objMapArray28, (java.lang.Object) doubleArray49);
        java.lang.Double[] doubleArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray49);
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray49, " aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi4aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi4", 871, 209);
        org.junit.Assert.assertNotNull(mapArray1);
        org.junit.Assert.assertNotNull(objMapArray2);
        org.junit.Assert.assertNotNull(mapArray4);
        org.junit.Assert.assertNotNull(objMapArray5);
        org.junit.Assert.assertNotNull(mapArray7);
        org.junit.Assert.assertNotNull(objMapArray8);
        org.junit.Assert.assertNotNull(mapArray14);
        org.junit.Assert.assertNotNull(objMapArray15);
        org.junit.Assert.assertNotNull(mapArray17);
        org.junit.Assert.assertNotNull(objMapArray18);
        org.junit.Assert.assertNotNull(mapArray20);
        org.junit.Assert.assertNotNull(objMapArray21);
        org.junit.Assert.assertNotNull(mapArray27);
        org.junit.Assert.assertNotNull(objMapArray28);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(objMapArray53);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
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
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray28);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray28, (short) (byte) -1);
        java.lang.Short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray33);
        java.lang.Short[] shortArray37 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray37, (short) 1);
        short[] shortArray46 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray46, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray46);
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray39, shortArray46);
        java.lang.Short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray51);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray52, (short) (byte) 0);
        short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray33, shortArray54);
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
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[-1, 10, -1, 10, 0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Aaa                            aaaA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("FALSE", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AaaFALSE                            FALSEaaaFALSEA" + "'", str4, "AaaFALSE                            FALSEaaaFALSEA");
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                 ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, 8);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("      a444#a                                             ", "hi..hihi...hi..hihi...hi..hihi...hi..hihi...h93933393943hihi...hi..hihi...hi..hihi...hi..hihi...hi..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
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
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray57, (short) (byte) 100);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray57);
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
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[10, -1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (short) -1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.io.Serializable[] serializableArray9 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) strArray2, (java.io.Serializable) "");
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray12, (double) 1);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) serializableArray9, (java.lang.Object) doubleArray15);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray17);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray17, (double) 305);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, 0.0d, 23, (double) 432);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0     HIHIH0     HIHIH10", "aaa                                                        HIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0     HIHIH0     HIHIH10" + "'", str2, "0     HIHIH0     HIHIH10");
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        short[] shortArray2 = new short[] { (byte) 100, (byte) -1 };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (short) 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("      aAA", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aAA" + "'", str2, "      aAA");
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (byte) 0);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, 9, (-1));
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray11, 14, (int) (byte) 0);
        int[] intArray20 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.toObject(intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray22, (int) (short) 1);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray22, (-1));
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(intArray22, 0);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray22);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.addAll(intArray20, intArray22);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray11, intArray30);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray11, 5);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray11);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(intArray11, 23);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                              aaaa10                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 37, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("1      aaaA1      aaaA1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1      aaaA1      aaaA1" + "'", str1, "1      aaaA1      aaaA1");
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0000000000000000000", "      HIHIH10     HIHIH0", "  4444444444444444444444444...  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi.." + "'", str1, "hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..");
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray18 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) (byte) 0, (-1));
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray18);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 1);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.add(shortArray24, (short) -1);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(shortArray26, (short) 100);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray26, (short) (byte) 10, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 0, 10, 10, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                  a444#a                   ", "  1.0100.010.010.0-1.0  ", 26);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hihih 1 1hihihhihih", "aaa4444444444-1a10a0a10a1a10a0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi", 244);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray0, (java.lang.Object) charArray8);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, '4');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, '4');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(charArray16, '#');
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "aa  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "aa  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, a,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4", "###########{1  ,1,-1, ,1, ,97, ,1,1  , }###########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "      1       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                     aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                      " + "'", str1, "                     aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                      ");
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444{hi!HI}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444{hi!HI" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444{hi!HI");
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[][] shortArray12 = new java.lang.Short[][] { shortArray3, shortArray7, shortArray11 };
        java.lang.Short[][] shortArray13 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray12);
        java.io.Serializable[] serializableArray14 = org.apache.commons.lang3.ArrayUtils.toArray((java.io.Serializable[]) shortArray12);
        long[] longArray20 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, (long) (short) 1);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray20);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray12, (java.lang.Object) longArray23);
        java.lang.Short[] shortArray30 = new java.lang.Short[] { (short) 100, (short) 10, (short) 100, (short) 1, (short) 0 };
        java.lang.Short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray30);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30, (short) (byte) -1);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30, (short) -1);
        java.lang.Short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray30);
        java.lang.Short[][] shortArray37 = org.apache.commons.lang3.ArrayUtils.add(shortArray12, shortArray36);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(serializableArray14);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[100, 10, 100, 1, 0]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[100, 10, 100, 1, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray37);
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", "                                             aaa                                 ", "101101100 1");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "             aaA001Aaaa                            aaA1Aaaa                            aaA0Aaaa           ", "10.0a1.10.0a1.10.0a1.10.0a1.10hi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!HI", "HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...", 63);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("a#a444 4 aa4a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A#A444 4 AA4A" + "'", str1, "A#A444 4 AA4A");
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaahiaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaa10.0a1.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ihaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaahiaaa" + "'", str2, "aaaaahiaaa");
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaa", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa" + "'", str3, "aaaaa");
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  aaahi   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
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
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray15, false);
        java.lang.Boolean[] booleanArray33 = new java.lang.Boolean[] { true, true, true };
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray33);
        java.lang.Boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray33);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray33, true);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray29, booleanArray37);
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
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, false);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, false);
        boolean[] booleanArray15 = null;
        java.lang.Character[] charArray21 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray21, ' ');
        boolean[] booleanArray30 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray37 = new boolean[] { false, false, true, true, false, true };
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray30, booleanArray37);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray37, false);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray37, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray37);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray21, (java.lang.Object) booleanArray44, (int) (byte) -1);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray44, true);
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray48);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray6, booleanArray48);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray6, false, 0);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA", "                                                              393933393943793933393943289393339394310                                                               ", "          A#A444          {-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-AAA                            AAAAAAA                            AAAAAAA                            AAAAAAA                            AAAA" + "'", str3, "-AAA                            AAAAAAA                            AAAAAAA                            AAAAAAA                            AAAA");
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaA1110aaaA1110aaaA1110aaaA", "...ihihaaa 11-00011010011-00011010011-00011010011-", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      A2.0hihih52.0hihih-1.0      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AAAA1      AAA      AA", 10, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1   " + "'", str3, "1   ");
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L };
        java.lang.Long[][] longArray12 = new java.lang.Long[][] { longArray1, longArray3, longArray5, longArray7, longArray9, longArray11 };
        java.lang.Long[][] longArray14 = org.apache.commons.lang3.ArrayUtils.remove(longArray12, 3);
        long[] longArray20 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, (long) (short) 1);
        long[] longArray26 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(longArray26, (long) ' ');
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.addAll(longArray22, longArray26);
        java.lang.Long[] longArray36 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray36);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray37);
        long[] longArray44 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.add(longArray44, (long) (short) 1);
        long[] longArray52 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.add(longArray52, (long) (short) 1);
        long[] longArray58 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.contains(longArray58, (long) ' ');
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.addAll(longArray54, longArray58);
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.addAll(longArray44, longArray58);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray44, (-1L), 4);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.addAll(longArray37, longArray44);
        java.lang.Long[] longArray67 = org.apache.commons.lang3.ArrayUtils.toObject(longArray66);
        long[] longArray69 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray67, (long) 3);
        java.lang.Long[][] longArray70 = org.apache.commons.lang3.ArrayUtils.add(longArray12, longArray67);
        long[] longArray71 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray67);
        int int73 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray71, (long) 244);
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray71, (long) 96, 33);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A", "100.0                              HIHIH                                                        aaa0.0                              HIHIH                                                        aaa-1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A" + "'", str2, "0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A");
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("         AAa                ", "!HI", "falseAAHIfalseAAHItrueAAHIfalseAAHIfalse");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444444                ...", "aaaaaaaa                  ...aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444" + "'", str2, "444444");
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                       flse4flse4true4true4flse4true4flse", " 1      AAAA1      AAAA1                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       flse4flse4true4true4flse4true4flse" + "'", str2, "                       flse4flse4true4true4flse4true4flse");
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                 aAAAa                                                                                               aaaaaAeaaahfalse", ' ');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                                                                   ", "A", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   " + "'", str3, "                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   A                                                                                                   ");
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0.0", 516, "-1 0 1 100 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 10" + "'", str3, "0.0-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 100 1-1 0 1 10");
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
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
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray19);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray19);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, 31, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Length: 8");
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
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ', (int) (short) -1);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray17 = null;
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray8, charArray17);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(charArray21, '#');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a#a444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a#a444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, #, a, 4, 4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a, 4, 4, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (-1));
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, 0);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 3);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        java.lang.Boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, true);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("1001-101097011000", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        float[] floatArray1 = new float[] { (-1L) };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 100);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) "eslfiheurtiheurtiheurt", "00-------------------------------------------------");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eslfiheurtiheurtiheurt" + "'", str2, "eslfiheurtiheurtiheurt");
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
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
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(longArray24, (long) 5);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray24, (long) '4');
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        java.lang.Long[] longArray31 = org.apache.commons.lang3.ArrayUtils.toObject(longArray24);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...a...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6, (byte) -1);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray13, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray13);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(byteArray19, (byte) 10);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.clone(byteArray19);
        java.lang.Byte[] byteArray28 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28);
        java.lang.Byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray28);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28, (byte) -1);
        java.lang.Object[] objArray33 = null;
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray28, objArray33);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28, (byte) 100);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray36, (byte) 0);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray22, byteArray38);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray10, (java.lang.Object) byteArray38, 82);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 1, -1, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("      aaaA1      aaaA10", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10" + "'", str2, "      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10      aaaA1      aaaA10");
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!ih", "                                                                                              aaa", 4);
        boolean[] booleanArray10 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray17 = new boolean[] { false, false, true, true, false, true };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, false);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray17);
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        java.lang.Boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) "                                                                                              aaa", (java.lang.Object) booleanArray25);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, true, false, true]");
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
        java.lang.String[] strArray4 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray8 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray12 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray4, strArray8, strArray12 };
        java.lang.String[][] strArray14 = org.apache.commons.lang3.ArrayUtils.toArray(strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa", strArray19);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aAA");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("AAA                                                                                               aaaA", strArray19, strArray22);
        java.lang.Comparable<java.lang.String>[][] strComparableArray24 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.Comparable<java.lang.String>[][]) strArray13, (java.lang.Object) strArray19);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.startsWithAny("AAA                                                                                               aaaA", strArray19);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AAA                                                                                               aaaA" + "'", str23, "AAA                                                                                               aaaA");
        org.junit.Assert.assertNotNull(strComparableArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
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
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray18, "                                          ", 0, (int) (byte) 0);
        java.lang.Integer[] intArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray18);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, 879);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray29, 73);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.add(intArray29, 52);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[52]");
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
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
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.clone(longArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, 0L, (int) (byte) 1);
        long[] longArray17 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.add(longArray17, (long) (short) 1);
        long[] longArray23 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(longArray23, (long) ' ');
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.addAll(longArray19, longArray23);
        java.lang.Long[] longArray33 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.addAll(longArray26, longArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray26);
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray26);
        int[] intArray43 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray44 = org.apache.commons.lang3.ArrayUtils.toObject(intArray43);
        int[] intArray45 = new int[] {};
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray45, (int) (short) 1);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray45, (-1));
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.contains(intArray45, 0);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray45);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.addAll(intArray43, intArray45);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.clone(intArray45);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray37, (java.lang.Object) intArray54);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.clone(longArray37);
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.subarray(longArray37, 4, 4);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray59, (long) 98);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
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
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.remove(byteArray20, (int) (byte) 1);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray22);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray22, (byte) 1);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(byteArray22, (byte) 1);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("eslafihaaaeurtihaaaeurtihaaaeurt", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eslafihaaaeurtihaaaeurtihaaaeurt" + "'", str2, "eslafihaaaeurtihaaaeurtihaaaeurt");
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
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
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, 523);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 523, Length: 5");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       a", "   h                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("true                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0true                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0true                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0false", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray11 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray11, false);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray6, booleanArray13);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray16, true, (int) (byte) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray16, true, 42);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, false, false, true, true, true, false]");
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 28, (-1));
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray10 = null;
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray10);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray11);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.add(intArray12, 106);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 106]");
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..", 244);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ahaaahaaahaaahaaahaaahaaa.1a0.01", 97, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                ahaaahaaahaaahaaahaaahaaa.1a0.01                                 " + "'", str3, "                                ahaaahaaahaaahaaahaaahaaa.1a0.01                                 ");
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        short[] shortArray2 = new short[] { (byte) 10, (short) 1 };
        short[] shortArray5 = new short[] { (byte) 10, (short) 1 };
        short[][] shortArray6 = new short[][] { shortArray2, shortArray5 };
        short[][][] shortArray7 = new short[][][] { shortArray6 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray7);
        short[] shortArray12 = new short[] { (byte) 10, (short) -1, (byte) 10 };
        short[] shortArray16 = new short[] { (byte) 10, (short) -1, (byte) 10 };
        short[] shortArray20 = new short[] { (byte) 10, (short) -1, (byte) 10 };
        short[] shortArray24 = new short[] { (byte) 10, (short) -1, (byte) 10 };
        short[][] shortArray25 = new short[][] { shortArray12, shortArray16, shortArray20, shortArray24 };
        short[] shortArray29 = new short[] { (byte) 10, (short) -1, (byte) 10 };
        short[] shortArray33 = new short[] { (byte) 10, (short) -1, (byte) 10 };
        short[] shortArray37 = new short[] { (byte) 10, (short) -1, (byte) 10 };
        short[] shortArray41 = new short[] { (byte) 10, (short) -1, (byte) 10 };
        short[][] shortArray42 = new short[][] { shortArray29, shortArray33, shortArray37, shortArray41 };
        short[][][] shortArray43 = new short[][][] { shortArray25, shortArray42 };
        short[][][] shortArray44 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray7, shortArray43);
        short[] shortArray49 = new short[] { (short) 100, (short) -1, (short) 100 };
        short[] shortArray53 = new short[] { (short) 100, (short) -1, (short) 100 };
        short[] shortArray57 = new short[] { (short) 100, (short) -1, (short) 100 };
        short[] shortArray61 = new short[] { (short) 100, (short) -1, (short) 100 };
        short[] shortArray65 = new short[] { (short) 100, (short) -1, (short) 100 };
        short[] shortArray69 = new short[] { (short) 100, (short) -1, (short) 100 };
        short[][] shortArray70 = new short[][] { shortArray49, shortArray53, shortArray57, shortArray61, shortArray65, shortArray69 };
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray70);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray70);
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray70, ' ', 94, 2);
        short[][] shortArray77 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray70);
        // The following exception was thrown during execution in test generation
        try {
            short[][][] shortArray78 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, 115, shortArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 115, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(shortArray77);
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("5", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5" + "'", str2, "5");
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 1.0]");
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (short) 10, 10);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray8);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 24, 1000);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, 115, (float) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 115, Length: 0");
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
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "TRUEAAAHTRUEAAAHTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) charArray9);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("10.0a1", "  4444444444444444444444444...   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 244);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HIHIH                                                        aaa##################", "a444#a");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("{0,0,10,1,10,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{0,0,10,1,10,0}" + "'", str1, "{0,0,10,1,10,0}");
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Aaa444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, 0.0d);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaa                                                                                              ", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa                                                                                              " + "'", str2, "aaa                                                                                              ");
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 100);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52]");
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0a0a10a1a10a00a0a10a1a10a000.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0a0a10a1a10a00a0a10a1a10a000.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0" + "'", str1, "0a0a10a1a10a00a0a10a1a10a000.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0");
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("10.01.0                                                                                                   ", "}1-{");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.01.0                                                                                                   " + "'", str2, "10.01.0                                                                                                   ");
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Aaaaaa                                                                                               aAAAa", "-1-110010110000-110010110001-11001011000100-110010110001");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 10, (-1));
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, 2, 35);
        java.lang.Byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.remove(byteArray13, 879);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 879, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAA                  ", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA                  " + "'", str2, "AA                  ");
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (short) 0, (int) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (short) 0, 8);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] {};
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray11, 35);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray11);
        java.lang.Integer[] intArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray11);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray15);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray15);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray15);
        int[] intArray19 = new int[] {};
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray19, (int) (short) 1);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray19, 100);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray19, (int) '#', 0);
        int[] intArray31 = new int[] { (-1), '4', (byte) 10, 1 };
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray31, (int) (short) 100, 100);
        int[] intArray35 = new int[] {};
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray35, (int) (short) 1);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.subarray(intArray35, (int) (short) 0, (int) (short) -1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray31, intArray35);
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.add(intArray31, 0);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray31, (int) 'a', 0);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.addAll(intArray19, intArray31);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.addAll(intArray18, intArray47);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.clone(intArray47);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray47, 32);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray51);
        java.lang.Integer[] intArray53 = org.apache.commons.lang3.ArrayUtils.toObject(intArray52);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray56 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 36, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 52, 10, 1]");
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (-1.0f), (double) (byte) 1);
        double[] doubleArray16 = null;
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) (byte) 1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray17, 0.0d, (double) 19);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray18, 12, 4);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) (short) -1);
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
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
        java.lang.Float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray48);
        java.lang.Float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray52);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray52, (float) (short) 100);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.lang.Object[]) floatArray52);
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray52);
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray57, (float) 25, 244);
        float[] floatArray62 = new float[] { (byte) 10 };
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.add(floatArray62, (float) (-1));
        float[] floatArray66 = org.apache.commons.lang3.ArrayUtils.add(floatArray64, (float) '4');
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray66);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.contains(floatArray66, (float) 10);
        int int72 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray66, 10.0f, (int) (byte) 10);
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray57, floatArray66);
        float[] floatArray75 = org.apache.commons.lang3.ArrayUtils.add(floatArray57, (float) 94);
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
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0, 94.0]");
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah                                               ", (java.lang.CharSequence) "TRUE   HITRUE   HITRUE   HIF LSE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    " + "'", str2, "                    ");
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!4HI! HI!AHI!AHI!4", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("00000AAAH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray14, (short) -1);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray14, (short) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray16 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray16);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, '4');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray18);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, (int) ' ', 4);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray7);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ESLAFHAAAEAAAAAA                                                                                               AAAAA                                                                 ", charArray7);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
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
        float[] floatArray25 = null;
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray25);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.remove(floatArray25, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, -1.0, 52.0]");
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (short) 0, (int) (short) -1);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, 516);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray9, 35);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray9, 94);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray9, 96);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.subarray(intArray9, 65, 99);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[3]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[3]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                  aaa       ", (java.lang.CharSequence) "       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  aahaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahaA" + "'", str1, "aahaA");
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "hihi...aaaaaaaa                  ...aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" + "'", str2, "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        double[] doubleArray21 = new double[] { 1.0f };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray21);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray21, (int) (short) 10, (int) ' ');
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray21, 0.0d);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray21, (double) 3, 28, (double) (short) 0);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray18, (java.lang.Object) doubleArray21);
        java.lang.Boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray33);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.add(booleanArray34, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[true, true, true, false, true]");
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi..." + "'", str2, "trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                  1aaa                                1aaa                                0", "1A10A0A0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("false", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false      " + "'", str2, "false      ");
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("     h       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     h       " + "'", str2, "     h       ");
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("##                                                                                                ", 37, 859);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                             " + "'", str3, "                                                             ");
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("### 1.0 ### 100.0 ### 10.0 ### 10.0 ### -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "### 1.0 ### 100.0 ### 10.0 ### 10.0 ### -1.0" + "'", str1, "### 1.0 ### 100.0 ### 10.0 ### 10.0 ### -1.0");
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0.0-------------------------------------------------", "{1,1,10}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0-------------------------------------------------" + "'", str2, "0.0-------------------------------------------------");
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("{3}", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{3}" + "'", str2, "{3}");
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) (-1L), (double) 100);
        double[] doubleArray7 = new double[] { 1.0f };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray1, doubleArray7);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (double) 1L);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray11, 0.0d);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (double) 24, 19, 10.0d);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray13, 58, (int) (byte) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, (double) 27);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        int int11 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray3);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 52.0, 2.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[-1.0, 52.0, 2.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, '4');
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-,-,-", charArray10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray10, '#');
        java.lang.Character[] charArray22 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray22, '4');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray24);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray24);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("AAAA1      AAAA             ", charArray24);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray24);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray24, ' ');
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.addAll(charArray14, charArray24);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.subarray(charArray31, 82, 16);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray31, '#');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a#a444#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a#a444#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, #, a, 4, 4, 4, #]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a#a444#444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a#a444#444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, #, a, 4, 4, 4, #, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "aa444#444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "aa444#444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[a, a, 4, 4, 4, #, 4, 4, 4, a, #, a]");
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aa1.0aaa100.0aaa10.0aaa10.0aaa-1.0", "AAAA1## AAAA1 ##10.1a0.010.1a0.010.1a0.010.1a0.010.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0", 142, "...1A10A0A0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0" + "'", str3, "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
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
        java.lang.String str29 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) longArray25, "                                                                                                 aaa");
        long[] longArray30 = null;
        long[] longArray36 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.add(longArray36, (long) (short) 1);
        long[] longArray44 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.add(longArray44, (long) (short) 1);
        long[] longArray50 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.contains(longArray50, (long) ' ');
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray46, longArray50);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.addAll(longArray36, longArray50);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray50, (long) '#', (int) (short) 100);
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray50, 1L);
        long[] longArray65 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.add(longArray65, (long) (short) 1);
        long[] longArray73 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray75 = org.apache.commons.lang3.ArrayUtils.add(longArray73, (long) (short) 1);
        long[] longArray79 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.contains(longArray79, (long) ' ');
        long[] longArray82 = org.apache.commons.lang3.ArrayUtils.addAll(longArray75, longArray79);
        long[] longArray83 = org.apache.commons.lang3.ArrayUtils.addAll(longArray65, longArray79);
        long[] longArray84 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray65);
        long[] longArray85 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray84);
        long[] longArray88 = org.apache.commons.lang3.ArrayUtils.subarray(longArray85, (int) (short) -1, 0);
        java.lang.Long[] longArray89 = org.apache.commons.lang3.ArrayUtils.toObject(longArray88);
        boolean boolean90 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray50, longArray88);
        long[] longArray91 = org.apache.commons.lang3.ArrayUtils.addAll(longArray30, longArray88);
        int int93 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray88, 0L);
        long[] longArray94 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray88);
        int int96 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray88, (long) 445);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray99 = org.apache.commons.lang3.ArrayUtils.add(longArray88, 523, (long) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 523, Length: 0");
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
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{97,0,1,100,0}" + "'", str29, "{97,0,1,100,0}");
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(longArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray94), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) (short) 1);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray16, (long) 10, 94);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray16, (int) (byte) 1, (long) 99);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray22, (long) 37, 347);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 99, 0, 1, 100, 0, 1, -1, -1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      a444#a                                             ", (-1), '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      a444#a                                             " + "'", str3, "      a444#a                                             ");
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444false", "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10);
        float[] floatArray16 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (float) '#');
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray16, 2, (int) (short) -1);
        java.lang.Float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray16);
        float[] floatArray23 = null;
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray16, floatArray23);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray12);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray26, 0.0f, 64);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) byteArray5);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1011001" + "'", str8, "-1011001");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray7);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, (int) (short) 0);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray19);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        java.lang.Character[] charArray9 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, '4');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, 'a');
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray11);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, '4');
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa10", charArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray20);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.1-444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.01444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.01444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.001444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.1444444444444444444444444444444444aaa", charArray20);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "a#a44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "a#a44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, #, a, 4, 4]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) -1);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        double[] doubleArray20 = new double[] {};
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) '4', (double) (byte) -1);
        double[] doubleArray28 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray20, doubleArray28);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, (double) 10.0f, (int) '4');
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray20, (double) (byte) -1);
        double[] doubleArray36 = new double[] { 1.0f };
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray36);
        double[] doubleArray38 = new double[] {};
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray36, doubleArray38);
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.add(doubleArray36, (double) (short) -1);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray20, doubleArray36);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.add(doubleArray36, (double) 3);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray44, 10, (int) (byte) 10);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray19, doubleArray44);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray44, (-1.0d), (int) (short) 10, (double) 93);
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray44, (double) 64);
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                 ", "44444444444444444444444444444aaa444444444444444444444444444444", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(floatArray3, (float) 99);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) (byte) 1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) 99, 33);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444440A0A01A1A444444444444444444444", 41, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444440A0A01A1A444444444444444444444" + "'", str3, "4444444444444444444440A0A01A1A444444444444444444444");
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
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
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray33, 0);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray36);
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
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, false, false, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, false, false, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("10               HIHIH               1", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10               HIHIH               1" + "'", str2, "10               HIHIH               1");
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
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
        float[] floatArray31 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (float) '#');
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray31, 2, (int) (short) -1);
        java.lang.Float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray36);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray36, (int) (byte) 10, 27);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray36, (float) 65);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray24, floatArray36);
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
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[100.0, 0.0, -1.0, 10.0]");
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah", "AaaaaaAAaaaaaAAatrueaaaaAAaaaaaAAaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah");
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray7);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (float) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (byte) 10, 27);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray15, (float) 28);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 0);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 100);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray16 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray16);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, '4');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray18);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, (int) ' ', 4);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray7);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.clone(charArray7);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 6, '#');
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray29);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray29);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...", charArray29);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray35 = org.apache.commons.lang3.ArrayUtils.add(charArray29, (int) (byte) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 7");
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, 4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, 4, a, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaahiaaa#aaaaahiaaaaaaaaahiaaa4aaaaahiaaa4aaaaahiaaa4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
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
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray46, (int) 'a', 1000);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray46);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.contains(shortArray50, (short) 100);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray50, (short) 0, 57);
        java.lang.String[] strArray58 = org.apache.commons.lang3.StringUtils.split("", '#');
        short[] shortArray65 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray65, (short) (byte) 0, (-1));
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.add(shortArray65, (short) (byte) -1);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.add(shortArray65, (short) (byte) 1);
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray72, (short) (byte) 1);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray74);
        int int76 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray58, (java.lang.Object) shortArray74);
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray50, shortArray74);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[0, 10, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 12 + "'", int55 == 12);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "{444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..true,false}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("101101", "aaah");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0" + "'", str1, "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("1001-101097011000", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
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
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray50, (byte) 0, 142);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, 1, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("     HIHIHfalsefalsetru", "HIHIH                                                        aaa", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13816");
        int[] intArray0 = null;
        java.lang.Integer[] intArray1 = new java.lang.Integer[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 28, (int) ' ');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray7);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray7);
        int[] intArray14 = new int[] { (-1), '4', (byte) 10, 1 };
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray14, (int) (short) 100, 100);
        int[] intArray18 = new int[] {};
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray18, (int) (short) 1);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.subarray(intArray18, (int) (short) 0, (int) (short) -1);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray14, intArray18);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(intArray18, (int) '4');
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray18);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray27);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, 25);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", 35, "0.01a0.1                                                                                                                                                                                                                                                                                                                                                                                                                            HIHIH                                                        aaa                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi..." + "'", str3, "trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13818");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Long[] longArray25 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray25, (java.lang.Object) (short) 100);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25);
        long[] longArray35 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.add(longArray35, (long) (short) 1);
        long[] longArray41 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.contains(longArray41, (long) ' ');
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.addAll(longArray37, longArray41);
        java.lang.Long[] longArray51 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray51);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray44, longArray52);
        long[] longArray59 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.add(longArray59, (long) (short) 1);
        long[] longArray67 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray69 = org.apache.commons.lang3.ArrayUtils.add(longArray67, (long) (short) 1);
        long[] longArray73 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.contains(longArray73, (long) ' ');
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.addAll(longArray69, longArray73);
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.addAll(longArray59, longArray73);
        int int80 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray59, (-1L), 4);
        long[] longArray81 = org.apache.commons.lang3.ArrayUtils.addAll(longArray52, longArray59);
        long[] longArray83 = org.apache.commons.lang3.ArrayUtils.add(longArray81, (long) (byte) 0);
        long[] longArray84 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray81);
        int int85 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray18, (java.lang.Object) longArray81);
        short[] shortArray87 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) -1);
        short[] shortArray89 = org.apache.commons.lang3.ArrayUtils.add(shortArray87, (short) 10);
        java.lang.Short[] shortArray90 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray87);
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
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[100, 1, -1, 0, 1, 0, 100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray87), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray89), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray90);
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13819");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        long[] longArray21 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.add(longArray21, (long) (short) 1);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray35 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.contains(longArray35, (long) ' ');
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.addAll(longArray31, longArray35);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.addAll(longArray21, longArray35);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray35);
        java.lang.Long[] longArray41 = org.apache.commons.lang3.ArrayUtils.toObject(longArray35);
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray41);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray42);
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.subarray(longArray43, 164, (int) (short) 100);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.subarray(longArray46, 347, 35);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray51 = org.apache.commons.lang3.ArrayUtils.remove(longArray49, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 0");
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
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[0, -1, -1, 1, 0, 100, 1, 0, 97, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13820");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray13, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        java.lang.String str24 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{false,false,true,true,false,true}" + "'", str24, "{false,false,true,true,false,true}");
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", 19, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa...ihihaaa...i" + "'", str3, "aa...ihihaaa...i");
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("       aaa                  ", 32, 181);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13823");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 100);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.remove(shortArray5, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1, 10]");
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13825");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa", "H  ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("4444trueaaahtru   eaaahfalse4444", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13826");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0.0   1.0   100.0   10.0   10.0   -1.0", "AAAA1## AAAA1 ##1");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  10110010AA", "aaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha10.0a1.aaahaaahaaahaaahaaahaaaha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  10110010AA" + "'", str2, "  10110010AA");
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13828");
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
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (short) -1);
        int[] intArray31 = new int[] {};
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray31, (int) (short) 1);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.subarray(intArray31, (int) (short) 0, (int) (short) -1);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray36, 100, (int) (short) 100);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray30, intArray36);
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray30, 93, 82);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray30);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray30, 142);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1]");
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13829");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, 0.0d);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0]");
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13830");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                        -152101-1521010                                         ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13831");
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
        java.lang.Float[] floatArray62 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray62, 1.0f);
        float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray62);
        java.lang.Float[] floatArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray62);
        java.lang.Float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray66);
        float[] floatArray69 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray66, (float) (byte) 100);
        float[] floatArray70 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray66);
        java.lang.Float[] floatArray77 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray79 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray77, 1.0f);
        float[] floatArray80 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray77);
        java.lang.Float[] floatArray81 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray77);
        float[] floatArray83 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray81, (float) (byte) 10);
        float[] floatArray84 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray70, floatArray83);
        int int86 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray84, (float) 168);
        float[] floatArray87 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray55, floatArray84);
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
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray79), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray80), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray83), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray84), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(floatArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray87), "[10.0, 10.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13832");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10110");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13833");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  aaahi   ", "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                          ", 67);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13834");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("{-1,10,0,10,1,10,0,0}", "0.01a0.1                                                                                                                                                                                                                                                                                                                                                                                                                            HIHIH                                                        aaa                                                                                                                                                                                                                                                                                                                                                                                               ", "trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0.1A0.01                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "1001-101", "                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "              1110               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13838");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 626, 1);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("##", "101101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "101101" + "'", str2, "101101");
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13840");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("..ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaaH.ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444false" + "'", str1, "trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444false");
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13842");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 10.0f, (int) '4');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (byte) -1);
        double[] doubleArray15 = new double[] {};
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) '4', (double) (byte) -1);
        double[] doubleArray23 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray15, doubleArray23);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray23);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray23, (double) (-1));
        double[] doubleArray28 = new double[] {};
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray28, (double) '4', (double) (byte) -1);
        double[] doubleArray36 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray28, doubleArray36);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray28, (double) 100, (double) 100);
        double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray28, 0, 0);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray23, doubleArray28);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) 8);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.add(doubleArray23, (double) 94);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray23);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) 38);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, -1.0, 10.0, 35.0, 94.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13843");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", ' ');
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray13 = new java.lang.Long[] { 0L };
        java.lang.Long[] longArray15 = new java.lang.Long[] { 0L };
        java.lang.Long[][] longArray16 = new java.lang.Long[][] { longArray5, longArray7, longArray9, longArray11, longArray13, longArray15 };
        java.lang.Long[][] longArray18 = org.apache.commons.lang3.ArrayUtils.remove(longArray16, 3);
        java.lang.Long[][] longArray19 = null;
        java.lang.Long[][] longArray20 = org.apache.commons.lang3.ArrayUtils.addAll(longArray18, longArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray18, "                                                                AAA                                 ", 35, 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) 35);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.concatWith("TRUEAAAHTRUEAAAHTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa" + "'", str26, "...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa");
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#", "......aaahi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#" + "'", str2, "#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#");
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13846");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        java.lang.Boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray9);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        boolean[] booleanArray18 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray23 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray23, false);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray25);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray18, booleanArray25);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray18);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.add(booleanArray18, (int) (short) 1, false);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, true);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray18, true);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray18, false);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray12, booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, true, true, false, false, false, true, false, false]");
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13847");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray10, true);
        java.lang.Boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, false, (int) 'a');
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray12, false, 20);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, true, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, false, true, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13848");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("      aaaA", "      aAA", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13849");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("falsefalsetruetruefalsetrue44444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13850");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13851");
        char[] charArray1 = null;
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray1, '#');
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("97110000", 142, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97110000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97110000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13853");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaa", "AAAAAAAAAA0.140.01AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", 1000);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...feurteslafeslaf", "1TRUE   HI", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13855");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("a#a444", "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "101101");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101101" + "'", str1, "101101");
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13857");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aAa       .0 AAA 100.0 AAA 10.0 AAA 10.0 A", ",", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "{0,10,10,0,0,-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13859");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray11, '4');
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("-1011001-10110010-1011001", charArray11);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 aa4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 aa4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, a, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13860");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaih44444444AAA                                44444444444444444444444444444###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1", "{hihih}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 432);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13862");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "##1      AAAA1      AAAA1####1      AAAA1      AAAA1####1      AAAA1      AAAA1##", "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("A#A444 4 AA4A", "-1#-1#0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13864");
        char[] charArray0 = null;
        java.lang.CharSequence charSequence1 = null;
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, '4');
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray13);
        char[] charArray21 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray21, 'a');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray21, ' ');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray21);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(charArray21, 'a');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.addAll(charArray13, charArray21);
        char[] charArray34 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.toObject(charArray34);
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray34, '4');
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.clone(charArray34);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray38);
        int int40 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               HIHIH               ", charArray39);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray41);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.addAll(charArray29, charArray41);
        java.lang.Character[] charArray44 = org.apache.commons.lang3.ArrayUtils.toObject(charArray29);
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray29);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "a#a444 4 aa44# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "a#a444 4 aa44# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4, 4, #,  ]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4]");
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAA AAAAAAEAAAHFALSE", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAA AAAAAAEAAAHFALSE" + "'", str2, "AAAAA AAAAAAEAAAHFALSE");
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("28");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "28" + "'", str1, "28");
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13867");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaa");
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "                              HIHIH");
        java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray9);
        float[] floatArray16 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (float) '#');
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray16, 2, (int) (short) -1);
        java.lang.Float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray21);
        java.util.Map<java.lang.Object, java.lang.Object> objMap23 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray22);
        java.lang.Double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray24);
        java.lang.Double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray24);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray24);
        java.lang.Double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray27);
        java.util.Map<java.lang.Object, java.lang.Object> objMap29 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray28);
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '4');
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray32, "IH!ih");
        java.util.Map<java.lang.Object, java.lang.Object> objMap35 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray32);
        java.util.Map[] mapArray37 = new java.util.Map[5];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray38 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray37;
        objMapArray38[0] = objMap8;
        objMapArray38[1] = objMap12;
        objMapArray38[2] = objMap23;
        objMapArray38[3] = objMap29;
        objMapArray38[4] = objMap35;
        java.lang.Short[] shortArray53 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray53, (short) (byte) 100);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray53);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray56, (short) (byte) 1);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray56);
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray56, (int) (byte) 10, (int) (short) 10);
        java.lang.Short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray62);
        int[] intArray64 = new int[] {};
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray64, (int) (short) 1);
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray64, 100);
        int int71 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray64, (int) '#', 0);
        int[] intArray76 = new int[] { (-1), '4', (byte) 10, 1 };
        int int79 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray76, (int) (short) 100, 100);
        int[] intArray80 = new int[] {};
        int[] intArray82 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray80, (int) (short) 1);
        int[] intArray85 = org.apache.commons.lang3.ArrayUtils.subarray(intArray80, (int) (short) 0, (int) (short) -1);
        boolean boolean86 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray76, intArray80);
        int[] intArray88 = org.apache.commons.lang3.ArrayUtils.add(intArray76, 0);
        int int91 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray76, (int) 'a', 0);
        int[] intArray92 = org.apache.commons.lang3.ArrayUtils.addAll(intArray64, intArray76);
        int[] intArray94 = org.apache.commons.lang3.ArrayUtils.add(intArray64, (int) (short) -1);
        int int95 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray63, (java.lang.Object) (short) -1);
        java.util.Map<java.lang.Object, java.lang.Object> objMap96 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) shortArray63);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray97 = org.apache.commons.lang3.ArrayUtils.add(objMapArray38, (int) (byte) 0, objMap96);
        boolean boolean98 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(objMapArray38);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableArray7);
        org.junit.Assert.assertNotNull(objMap8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objMap12);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(objMap23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(objMap29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(objMap35);
        org.junit.Assert.assertNotNull(mapArray37);
        org.junit.Assert.assertNotNull(objMapArray38);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[]");
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[-1]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(objMap96);
        org.junit.Assert.assertNotNull(objMapArray97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13868");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                               aaa                                                                                               aaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13869");
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
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray25, 10L);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray25, (long) 100, (int) 'a');
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray25, (long) 42, 1000);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray25, (long) 168);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray25, (long) 38);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13870");
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
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.add(longArray53, 0, (long) 516);
        java.lang.Long[] longArray61 = org.apache.commons.lang3.ArrayUtils.toObject(longArray60);
        java.lang.Class<?> wildcardClass62 = longArray60.getClass();
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
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[516]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13871");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                aaa                                 ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray8 = org.apache.commons.lang3.ArrayUtils.subarray(strArray5, (int) 'a', (int) '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str11, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("393933393943793933393943289393339394310", "1.0A0.0                              hihih                                                      ...", "#################################aaa############################################################aaaA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3939333939437939333939432893933393943##" + "'", str3, "3939333939437939333939432893933393943##");
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13873");
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
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.remove(shortArray21, 7);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.remove(shortArray23, 0);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray25, (short) 0, 27);
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
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13874");
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
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray50);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray53, (short) (byte) 1);
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
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[-1, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                      hi!4h                                                                 ", 164, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13877");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4!iha!iha!ih!ih4!ih", "a0.0                              HIHIH                                                        aaa-1.0", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAAA1AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA1AAAA" + "'", str1, "AAAA1AAAA");
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13879");
        java.lang.Character[] charArray11 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray11, '4');
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH!ih", charArray13);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray13, 3, 'a');
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       AAA", charArray13);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray13, ' ');
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny(" ", charArray23);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("                                                                ", charArray23);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  10110010AA                                                                                    ", charArray23);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "a#aa444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "a#aa444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, #, a, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "a#a444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "a#a444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[a, #, a, 4, 4, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13880");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray8, (byte) 100);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray10, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13881");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] {};
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        java.lang.String[][][] strArray6 = new java.lang.String[][][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String[][] strArray7 = new java.lang.String[][] {};
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.lang.String[][] strArray10 = new java.lang.String[][] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] {};
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][][] strArray13 = new java.lang.String[][][] { strArray7, strArray8, strArray9, strArray10, strArray11, strArray12 };
        java.lang.String[][] strArray14 = new java.lang.String[][] {};
        java.lang.String[][] strArray15 = new java.lang.String[][] {};
        java.lang.String[][] strArray16 = new java.lang.String[][] {};
        java.lang.String[][] strArray17 = new java.lang.String[][] {};
        java.lang.String[][] strArray18 = new java.lang.String[][] {};
        java.lang.String[][] strArray19 = new java.lang.String[][] {};
        java.lang.String[][][] strArray20 = new java.lang.String[][][] { strArray14, strArray15, strArray16, strArray17, strArray18, strArray19 };
        java.lang.String[][] strArray21 = new java.lang.String[][] {};
        java.lang.String[][] strArray22 = new java.lang.String[][] {};
        java.lang.String[][] strArray23 = new java.lang.String[][] {};
        java.lang.String[][] strArray24 = new java.lang.String[][] {};
        java.lang.String[][] strArray25 = new java.lang.String[][] {};
        java.lang.String[][] strArray26 = new java.lang.String[][] {};
        java.lang.String[][][] strArray27 = new java.lang.String[][][] { strArray21, strArray22, strArray23, strArray24, strArray25, strArray26 };
        java.lang.String[][][][] strArray28 = new java.lang.String[][][][] { strArray6, strArray13, strArray20, strArray27 };
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 1 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray31, (byte) -1, (int) 'a');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray31);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray31, (byte) 1);
        java.lang.String[][][][] strArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(strArray28, (java.lang.Object) byteArray31);
        java.lang.Object[] objArray39 = null;
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray38, objArray39);
        java.lang.CharSequence[][][][] charSequenceArray41 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.CharSequence[][][][]) strArray38);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(charSequenceArray41);
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13882");
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
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray46, (int) 'a', 1000);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray46);
        java.lang.Short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray50);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray50, (short) 1, (int) '4');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[0, 10, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13883");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10, (float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, 36, (float) 432);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 36, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13884");
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
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray34);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray35, 1, 0);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray41, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray41);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray41);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray41);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray38, byteArray41);
        java.lang.Byte[] byteArray54 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray54);
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.add(byteArray55, (byte) 0);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray57);
        byte[] byteArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray57, (byte) 10);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 1 };
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray63, (byte) -1, (int) 'a');
        byte[] byteArray68 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray63, (byte) 10);
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray68);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray57, byteArray68);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray41, byteArray68);
        int int73 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray41, (byte) -1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[1]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13885");
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
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray6, (double) 93, (double) 74);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("H", "hi..hihi...hi..hihi...hi..hihi...hi..hihi...h93933393943hihi...hi..hihi...hi..hihi...hi..hihi...hi..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13887");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 0, (short) 1, (short) 0, (short) 0 };
        java.lang.Short[][] shortArray5 = new java.lang.Short[][] { shortArray4 };
        java.lang.Short[][][] shortArray6 = new java.lang.Short[][][] { shortArray5 };
        java.lang.Short[][][] shortArray7 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray6);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        java.lang.Short[][][] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray7, (java.lang.Object) intArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.io.Serializable[][][]) shortArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) shortArray11);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("10110010aa", "ah#hah4h4h4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10110010aa" + "'", str2, "10110010aa");
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13889");
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
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray33, (double) 8, 1000);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray33);
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
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 5.0, 100.0, -1.0, 1.0, 10.0, 0.0]");
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13890");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12, 'a');
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray16, 'a');
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray16);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #, a, 4, 4, 4]");
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13891");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1, (double) 5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, 19, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a444#a", "{true,true,false,true}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444#a" + "'", str2, "444#a");
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13893");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, (double) 0L);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 100.0d);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray5, 93, 2);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 36, 100.0d);
        java.lang.Double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray10, (double) 55);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13894");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10110010aa                               ", "{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13895");
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
        org.apache.commons.lang3.ArrayUtils.reverse(intArray51);
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
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13896");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("TRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRaaa                                HTRUEAAAHTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13897");
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
        java.lang.Short[] shortArray27 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray27, (short) 1);
        short[] shortArray36 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray36, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray36);
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray29, shortArray36);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.add(shortArray41, (short) 10);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) 100);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray43);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) 100);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray43);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray24, (short) 100);
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
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13898");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13899");
        java.lang.Float[][][][] floatArray0 = null;
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 100.0f, 1.0f, 100.0f };
        java.lang.Float[] floatArray9 = new java.lang.Float[] { 100.0f, 1.0f, 100.0f };
        java.lang.Float[] floatArray13 = new java.lang.Float[] { 100.0f, 1.0f, 100.0f };
        java.lang.Float[] floatArray17 = new java.lang.Float[] { 100.0f, 1.0f, 100.0f };
        java.lang.Float[] floatArray21 = new java.lang.Float[] { 100.0f, 1.0f, 100.0f };
        java.lang.Float[] floatArray25 = new java.lang.Float[] { 100.0f, 1.0f, 100.0f };
        java.lang.Float[][] floatArray26 = new java.lang.Float[][] { floatArray5, floatArray9, floatArray13, floatArray17, floatArray21, floatArray25 };
        java.lang.Float[][][] floatArray27 = new java.lang.Float[][][] { floatArray26 };
        java.lang.Float[][][] floatArray28 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray27);
        java.lang.Float[][][][] floatArray29 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0, floatArray28);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13900");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("{0,0,10,1,10,0,1,0}", "                           AAA     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "            Hi             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13902");
        java.lang.Character[][] charArray0 = new java.lang.Character[][] {};
        java.lang.Character[] charArray2 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray4 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray6 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray8 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray10 = new java.lang.Character[] { ' ' };
        java.lang.Character[][] charArray11 = new java.lang.Character[][] { charArray2, charArray4, charArray6, charArray8, charArray10 };
        java.lang.Character[][] charArray12 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray13, (byte) 1, (int) (short) 10);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, (int) (byte) 0, (byte) -1);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray22, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray22);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray22);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray22, (byte) 100);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray22);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray13, (byte) 1, 2);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray12, (java.lang.Object) byteArray13, (int) (byte) 0);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray13, 244, (int) ' ');
        java.lang.Byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray38);
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa", "H  ");
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.stripAll(strArray44);
        boolean boolean46 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA", strArray45);
        java.lang.String[] strArray49 = org.apache.commons.lang3.StringUtils.split("                                AAA", "{{ ,#},{ ,#},{ ,#},{ ,#}}");
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" trueaaa  ", strArray45, strArray49);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray39, (java.lang.Object[]) strArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray45, "                                          ", (-1), 57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " trueaaa  " + "'", str50, " trueaaa  ");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13903");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(shortArray6, (short) -1);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  HIHIH ", 27, 879);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13905");
        short[] shortArray2 = new short[] { (short) 0, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13906");
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
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.remove(longArray29, (int) (byte) 1);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray29);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) 142);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.add(longArray56, (long) 305);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 0, 1, 100, 0, 142]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 0, 1, 100, 0, 142, 305]");
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("{{{              1110               ,100,                              HIHIH}},{{              1110               ,100,                              HIHIH}}}", 6, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{{{              1110               ,100,                              HIHIH}},{{              1110               ,100,                              HIHIH}}}" + "'", str3, "{{{              1110               ,100,                              HIHIH}},{{              1110               ,100,                              HIHIH}}}");
    }

    @Test
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13908");
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
        java.lang.Double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray16);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray16, (double) 36, 208);
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "eslafeurteurteurteslafesl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAA                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA                                " + "'", str1, "AAA                                ");
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "trueaaahtrueaaahtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13912");
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray9, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaA", charArray16);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  aaahihi#..    ", charArray16);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray16);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13914");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[] classArray10 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class[][] classArray16 = new java.lang.Class[5][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray17 = (java.lang.Class<?>[][]) classArray16;
        wildcardClassArray17[0] = classArray1;
        wildcardClassArray17[1] = classArray4;
        wildcardClassArray17[2] = wildcardClassArray8;
        wildcardClassArray17[3] = wildcardClassArray11;
        wildcardClassArray17[4] = wildcardClassArray14;
        java.lang.Class<?>[][] wildcardClassArray30 = org.apache.commons.lang3.ArrayUtils.subarray(wildcardClassArray17, 14, 21);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray31 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray30);
        float[] floatArray32 = new float[] {};
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray32, (float) (byte) 100);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.clone(floatArray32);
        java.lang.reflect.Type[][] typeArray36 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.reflect.Type[][]) wildcardClassArray30, (java.lang.Object) floatArray32);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray39, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray39);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray43, (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray45);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray45, (byte) 0, 10);
        java.lang.Byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray45);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) typeArray36, (java.lang.Object) byteArray45);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(genericDeclarationArray31);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[]");
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13915");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  4444444444444444444444444...   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      AAAA1      AA", 209);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0.0a1.0", "{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}{3}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0a1.0" + "'", str2, "0.0a1.0");
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("   h", "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   h" + "'", str2, "   h");
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(" a  a    a   a   a  a ", "ih44444444AAA44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " a  a    a   a   a  a " + "'", str2, " a  a    a   a   a  a ");
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13919");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaA1110aaaA1110aaaA1110aaaA", "aaaaaaaa                  ...aaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                 ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "false0false0true0true0false0true");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13920");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("### 1.0 ### 100.0 ### 10.0 ### 10.0 ### -1.0", "10.0a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13921");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aa1.0aaa100.0aaa10.0aaa10.0aaa-1.0", "                                                                AAA                                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13922");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, 955);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 955, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13923");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1      aaaa1      aaaa10", "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13924");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "                                                                aaa                                 ", (int) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13925");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray9);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
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
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13926");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                   ", "HIHIH                                                        aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aa1.0aaa100.0aaa10.0aaa10.0aaa-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13928");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAA1######AAAA#############", "-152101-1521010");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13929");
        java.lang.Long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) 871);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13930");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0.1----------------------------------AAA----------------------------------------------------------------0.01---------------------------------AAA----------------------------------------------------------------0.01---------------------------------AAA----------------------------------------------------------------0.001---------------------------------AAA----------------------------------------------------------------0.1---------------------------------AAA----------------------------------------------------------------0.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAH                                                                                                                                          ", "                                aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAH                                                                                                                                          " + "'", str2, "AAAH                                                                                                                                          ");
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13932");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray14);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.subarray(longArray14, 2, 100);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.clone(longArray27);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray27, (long) (byte) 10);
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
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAA                                                                                              ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA                                                                                              ..." + "'", str1, "AAA                                                                                              ...");
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                AAA                                 ", 139, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444                                                                AAA                                 " + "'", str3, "444444444444444444444444444444444444444                                                                AAA                                 ");
    }

    @Test
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13935");
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
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray29);
        java.lang.Double[] doubleArray33 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33, (double) 1);
        java.lang.Double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray33);
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33, (double) 8);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray29, doubleArray39);
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                aaa                                 ");
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.stripAll(strArray42, "       aAA");
        double[] doubleArray46 = new double[] { 1.0f };
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray46);
        double[] doubleArray48 = new double[] {};
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray46, doubleArray48);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray44, (java.lang.Object) doubleArray46, (int) (short) 1);
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray46);
        double[] doubleArray56 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray56, (double) 100);
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray58, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray62 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray58);
        double[] doubleArray64 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray58, (double) 10L);
        double[] doubleArray68 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray70 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray68, (double) 100);
        int int73 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray70, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray74 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray70);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray58, doubleArray70);
        double[] doubleArray76 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray52, doubleArray58);
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray76);
        double[] doubleArray78 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray76);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray29, doubleArray76);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13936");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaa                        hi!Haaa                        ", "aAa       .0 AAA 100.0 AAA 10.0 AAA 10.0 A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", 871);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa" + "'", str2, "a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa");
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13938");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" HIHIH10  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIH10" + "'", str1, "HIHIH10");
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13939");
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, '4');
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-,-,-", charArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray10, ' ');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1a0.01", "                                                                                                 ", 82);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13941");
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
        float[] floatArray71 = org.apache.commons.lang3.ArrayUtils.remove(floatArray24, 0);
        int int73 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray71, (float) (short) 100);
        float[] floatArray75 = org.apache.commons.lang3.ArrayUtils.add(floatArray71, (float) 64);
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray71);
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
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray71), "[52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[52.0, -1.0, 100.0, 64.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("{0,10,1,1,0}", (int) (short) 0, "{{,#},{,#},{,#},{,#}}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{0,10,1,1,0}" + "'", str3, "{0,10,1,1,0}");
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13943");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1011001-10110010-1011001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1011001-10110010-1011001" + "'", str2, "-1011001-10110010-1011001");
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13944");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 28, (-1));
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 94, (int) (short) 1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray5, 1000);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13945");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray16 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray23 = new boolean[] { false, false, true, true, false, true };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray16, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray23);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray25, false, 93);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray25, true);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray25, false);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray8, booleanArray25);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray25, true, 67);
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
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13946");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 1, 3);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.remove(shortArray6, 115);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 115, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi", "{}0.0----------------------------------------------------------------aaa----------------------", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi" + "'", str3, "Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi");
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13948");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 0);
        java.lang.Byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        java.lang.Byte[] byteArray16 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray21);
        java.lang.Byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray22);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah", (java.lang.Object[]) byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap25 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '-1', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1" + "'", str24, "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1");
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13949");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray15 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray15, '4');
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray19);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.addAll(charArray8, charArray19);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray21, ' ');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13950");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray12);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray12);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.remove(floatArray14, (int) (byte) 1);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, 0.0f);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray18, (float) 142);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.remove(floatArray18, 0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 100.0, 10.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 100.0, 10.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[100.0, 10.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13951");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "{-1,52,10,1,0", (java.lang.CharSequence) "                ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "{-1,52,10,1,0" + "'", charSequence2, "{-1,52,10,1,0");
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13952");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 96, (int) ' ', (double) 7);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 55);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 4, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aahaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahaA" + "'", str1, "aahaA");
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13954");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "100#############################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13955");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 100, (double) (-1));
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray6);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, 0, (double) 0L);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAA1######AAAA#############", "100#############################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA1######AAAA#############" + "'", str2, "AAAA1######AAAA#############");
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13957");
        float[] floatArray1 = new float[] { (-1L) };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray1);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 165);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaih44444444AAA                                44444444444444444444444444444###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1A10A0A0###########...1", "       aaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13959");
        float[] floatArray0 = null;
        float[] floatArray4 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) '#');
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, 2, (int) (short) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        java.lang.Float[] floatArray17 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray17, 1.0f);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray17);
        java.lang.Float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray17);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray17);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray22, (float) (-1));
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray22);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray26);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray27);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[2.0, 52.0, -1.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0, 1.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13960");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("h       HIHIHh  h", "#############################################################################################################################################################################################################################################################################################################################################################################################################################################", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13961");
        char[] charArray3 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, '4');
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, ' ');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13962");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       aaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13963");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0.0          hi...                                                      AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", "aaa                                                                                               aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13964");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, 'a');
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray15, "   h                                                            ...");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "a   h                                                            ...#   h                                                            ...a   h                                                            ...4   h                                                            ...4   h                                                            ...4" + "'", str18, "a   h                                                            ...#   h                                                            ...a   h                                                            ...4   h                                                            ...4   h                                                            ...4");
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a                                                                      aaa                                                                                                     a               a a                                 a a                                 a   a                                 a", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a a a a a a a a aaa a" + "'", str2, "a a a a a a a a aaa a");
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "h aaahihi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H aaahihi..." + "'", str1, "H aaahihi...");
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0.0A                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "flse4flse4true4true4flse4true4flse");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13968");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0.0-------------------------------------------------", "itrueaaah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13969");
        byte[][][] byteArray0 = new byte[][][] {};
        double[] doubleArray4 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) 100);
        byte[][][] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (java.lang.Object) 100);
        byte[][][] byteArray10 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) ' ', (int) (short) 0);
        byte[][][] byteArray11 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        short[] shortArray18 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) (byte) 0, (-1));
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray18);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray18);
        byte[][][] byteArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray11, (java.lang.Object) boolean23);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        byte[][] byteArray31 = new byte[][] { byteArray30 };
        byte[][] byteArray32 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray31);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray32);
        byte[][][] byteArray34 = org.apache.commons.lang3.ArrayUtils.add(byteArray24, byteArray32);
        byte[][][] byteArray35 = org.apache.commons.lang3.ArrayUtils.clone(byteArray34);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 0, -1, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("      a444#a       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a444#a" + "'", str1, "a444#a");
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13971");
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
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 14, 64, (-1.0d));
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.add(doubleArray36, 18, (double) 626);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 18, Length: 4");
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, -1.0, 10.0, 35.0]");
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13972");
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
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray28, (byte) -1, (int) 'a');
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray28);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray28, (byte) 1);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(byteArray28, (byte) -1);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray28, (byte) 0);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray28);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.add(byteArray28, (byte) -1);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray28, (byte) 100);
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 0, 1, 100, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 1]");
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13973");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..", "Hihih 1 1HihihHihih 1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13974");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "}1-{", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13975");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,#{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,4{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,a{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,#");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("{hihih}", "FALSE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13977");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###########################################################################################     ###h", 142, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13978");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap2 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray0);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 100L);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray4, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 57, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(objMap2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13979");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "##                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13980");
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
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.add(intArray32, (int) (byte) 10);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray38, 7);
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
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 52, 10, 1, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13981");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "{Aaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa,,,,,,,,,,,,,,,,,,,,,,,,,,,,aaaAAaa}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13982");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13983");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "10.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA52.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA100.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA1.0", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444                                aaa444444444444444444444444444444", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444                                aaa444444444444444444444444444444" + "'", str2, "4444444444444444444444444444                                aaa444444444444444444444444444444");
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}", "                     aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                                           aaaa1aaaa                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}" + "'", str2, "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13986");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray57 = org.apache.commons.lang3.ArrayUtils.add(longArray54, (int) (byte) -1, (long) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
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
    }

    @Test
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("1      aaaA1      aaaA10", "trueaaa                            aaaAtrueaaa                            aaaAtrueaaa                            aaaAfalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1      aaaA1      aaaA10" + "'", str2, "1      aaaA1      aaaA10");
    }

    @Test
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13988");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(",aaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("{{ ,#},{ ,#},{ ,#},{ ,#}}", "                       false4false4true4true4false4true4false");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13990");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = org.apache.commons.lang3.ArrayUtils.remove(intArray26, 347);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 347, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13991");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          a#a444          ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13992");
        double[] doubleArray1 = new double[] {};
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) '4', (double) (byte) -1);
        double[] doubleArray9 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 100, (double) 100);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, 0, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 1L);
        double[] doubleArray19 = new double[] {};
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) '4', (double) (byte) -1);
        double[] doubleArray27 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray19, doubleArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray19, (double) 100, (double) 100);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray19);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray19, (double) (-1L));
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) (short) 10, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray19);
        java.lang.Double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray19);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.concatWith("5", (java.lang.Object[]) doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13993");
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
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25);
        java.lang.Long[] longArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25, (long) 82);
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray30);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1, 0]");
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13994");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                 AAAAA                                                                                               AAAAAAEAAAHFALSE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13995");
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("aaahihi...", (java.lang.Object[]) longArray1);
        int int3 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) longArray1);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1, (long) (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) 94);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(longArray8, (-1L));
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[94]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13996");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", (java.lang.CharSequence) "###                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13997");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("      HIHIH10     HIHIH0", 0, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      HIHIH10     HIHIH0" + "'", str3, "      HIHIH10     HIHIH0");
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13998");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     A", "     HIHIHfalsefalsetru", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi... ", (int) (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi... " + "'", str3, " aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi...  aaahihi... ");
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test14000");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                   ", "{0,0,10,1,10,0}", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

