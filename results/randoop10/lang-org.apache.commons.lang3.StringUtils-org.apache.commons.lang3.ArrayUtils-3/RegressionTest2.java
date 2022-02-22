import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("{100,1,-1,0,1,0}", strArray3, strArray7);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray13 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.CharSequence[]) strArray7, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaa" + "'", str9, "aaa");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{100,1,-1,0,1,0}" + "'", str10, "{100,1,-1,0,1,0}");
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1      AAAA1      AAAA", "                                             aaa                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1," + "'", str2, "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaah", "aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("-10110010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-10110010" + "'", str1, "-10110010");
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("-1 0 1 100 1", "{}", "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1 0 1 100 1" + "'", str3, "-1 0 1 100 1");
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("10.0a1.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0a1." + "'", str1, "10.0a1.");
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("IH!ih", "                                                                 aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0.0       ", 33, "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0--------------------0.0       " + "'", str3, "0.0--------------------0.0       ");
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1      AAAA1      AAAA1", "       aAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("IH!ih", "              1110               ", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!ih" + "'", str3, "IH!ih");
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{0,0,10,1,10,0}");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap3 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '{0,0,10,1,10,0}', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                              HIHIH", "{100,1,-1,0,1,0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              HIHIH" + "'", str2, "                              HIHIH");
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("aaahihi...", (java.lang.Object[]) longArray1);
        int int3 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) longArray1);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1, (long) (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray8 = org.apache.commons.lang3.ArrayUtils.remove(longArray5, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a#a444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a444#a" + "'", str2, "a444#a");
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" aaahihi...  ", "H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " aaahihi...  " + "'", str2, " aaahihi...  ");
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Hihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" aaahihi...  ", (int) '4', "-11001011000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-11001011000-11001011000-11001011000-11 aaahihi...  " + "'", str3, "-11001011000-11001011000-11001011000-11 aaahihi...  ");
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10110010", "hi");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                             aaa                                 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, (double) 0L);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 94, Length: 2");
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
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                aaa                                 ", 27, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("trueaaahtrueaaahtrueaaahfalse", "                                                                 aAAAa                                                                                               aaaaaA", (-1), 19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse" + "'", str4, "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                 aaa                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 aaa                                             " + "'", str1, "                                 aaa                                             ");
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" aaahihi... ", "{-1,0,1,100,1}", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1," + "'", str1, "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                 aaa", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 aaa" + "'", str2, "                                                                                                 aaa");
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("1      aaaa1      aaaa10", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  aaaa10" + "'", str2, "  aaaa10");
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1      aaaA1      aaaA10", 5, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1      aaaA1      aaaA10" + "'", str3, "1      aaaA1      aaaA10");
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                 aAAAa                                                                                               aaaaaAeaaahfalse", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse" + "'", str2, "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0.0--------------------0.0       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray23 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, (-1));
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray23);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray23);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(shortArray28, (short) -1);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.remove(shortArray28, 2);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0, 1, 10, 0]");
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Hi", 0, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi" + "'", str3, "Hi");
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...", "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        java.lang.Integer[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                AAA                                 ", "       aaa                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("     HIHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     HIHIH" + "'", str1, "     HIHIH");
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0" + "'", str3, "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!HI", charArray7);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, 94, 0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray19 = org.apache.commons.lang3.ArrayUtils.remove(charArray17, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 27, Length: 0");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                 ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        int[] intArray0 = null;
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 0, (int) (short) 1);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aaa                            aaaA", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                 aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        java.lang.Object[] objArray0 = null;
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
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.subarray(longArray26, (int) (short) -1, 0);
        long[] longArray35 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.add(longArray35, (long) (short) 1);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray29, longArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(objArray0, (java.lang.Object) boolean38);
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean[] booleanArray14 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray21);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray14, booleanArray21);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray14);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, (int) (short) 1, false);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray8, booleanArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[true, true, true, false, false, false, true, false, false]");
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10110010", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10110010" + "'", str2, "10110010");
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0" + "'", str1, "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0");
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                              aaa", "HIHIH", "1      aaaA1      aaaA10");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        java.lang.Float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) (short) 1);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "trueaaahtrueaaahtrueaaahfalse", "      aaaA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAA" + "'", str1, "aAA");
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                 aAAAa                                                                                               aaaaaA", "                                 aaa                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 aAAAa                                                                                               aaaaaA" + "'", str2, "                                                                 aAAAa                                                                                               aaaaaA");
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAA1      AAAA", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA1      AAAA             " + "'", str2, "AAAA1      AAAA             ");
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("{-1,10,10,1,10,0,0}", "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", (int) (short) 1, 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str4, "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("-1a10a0a10a1a10a0a", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1a10a0a10a1a10a0a" + "'", str2, "-1a10a0a10a1a10a0a");
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                 AAA                                                                                               aaaA", "1110");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                 AAA                                                                                               aaa", "HIHIH                              ", 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              HIHIH                                                        aaa" + "'", str3, "                              HIHIH                                                        aaa");
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("     HIHIH", (int) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     HIHIH" + "'", str3, "     HIHIH");
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-1a10a0a10a1a10a0a", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap10 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '0.0', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                 aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAa                                                                                               aaaaaA" + "'", str1, "aAAAa                                                                                               aaaaaA");
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HIHIH", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               HIHIH               " + "'", str2, "               HIHIH               ");
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AAAH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("##   ", "Aaa                            aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##   " + "'", str2, "##   ");
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 AAA                                                                                               aaaA", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0" + "'", str2, "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0");
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      aaaA", 100, "                                 aaa                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 aaa                                                            aaaA" + "'", str3, "                                 aaa                                                            aaaA");
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAA                                                                                               aaaA", "       aaa                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray4, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", 28, 516);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("{-1,10,10,1,10,0,0}", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAH", "trueaaahtrueaaahtrueaaahfalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAH" + "'", str2, "AAAH");
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "aaa                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  aaaa10", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  aaaa10" + "'", str2, "  aaaa10");
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaahi", (int) (byte) 1, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi" + "'", str3, "aahi");
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (short) 1, 24);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("      aaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaA" + "'", str1, "aaaA");
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "a444#a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("10.0a1.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0a1" + "'", str1, "10.0a1");
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("1110", " aaahihi...  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1110" + "'", str2, "1110");
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        char[] charArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(charArray0, '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAA1      AAAA", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
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
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.clone(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.remove(byteArray33, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, 27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 27, Length: 6");
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
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray67 = org.apache.commons.lang3.ArrayUtils.remove(longArray26, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 5");
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
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        java.lang.Class<?> wildcardClass18 = shortArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("##   ", "0.0a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.subarray(strArray3, (int) 'a', (int) '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hi!HI", "                                                                 AAA                                                                                               aaa");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("       AAA", strArray3, strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("                                aaa", strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("IH!ih", strArray9, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "       AAA" + "'", str10, "       AAA");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "      aaaA", (java.lang.CharSequence) "-1A10A0A10A1A10A0A0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "      aaaA" + "'", charSequence2, "      aaaA");
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1      aaaA1      aaaA10", "aaahihi...", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        int[] intArray0 = null;
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 0, 24);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[24]");
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                 AAA                                                                                               aaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        char[] charArray0 = null;
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1A10A0A10A1A10A0A0", charArray13);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray13);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, ' ', (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a#a444", "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        short[] shortArray0 = null;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, 19, (int) (short) 1);
        org.junit.Assert.assertNull(shortArray3);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1L);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray0);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (short) 0, (double) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", 9, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        float[] floatArray6 = new float[] { (byte) -1, 100L, 100.0f, 100L, 1, 10.0f };
        float[] floatArray8 = new float[] { (byte) 10 };
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (-1));
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, 0.0f, 100);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray8, (float) 0L);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray8);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray16, (float) 7);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.remove(floatArray16, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaa                            aaaA", "Hi", "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa                            aaaA" + "'", str3, "aaa                            aaaA");
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "       AAA                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str2, "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          " + "'", str1, "          ");
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hihi...", 100, "hiaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia" + "'", str3, "hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia");
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", 33, 19);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                aaa                                 ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
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
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray27, (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 1, 100, 0]");
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("10.0a1", "hiaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0a1" + "'", str2, "10.0a1");
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("     HIHIH", 516, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "AAAH");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAA                                                                                               aaaA", "       AAA                  ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAAA1      AAAA             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA1      AAAA            " + "'", str1, "AAAA1      AAAA            ");
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("1      AAAA1      AAAA", "-10110010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("{", "       aAA", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (-1));
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 27);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "{100,1,-1,0,1,0}", "trueaaahtrueaaahtrueaaahfalse                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str3, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0" + "'", str1, "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str2, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("{", "AAA                                                                                               aaaA", "      AAAA1      AAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(shortArray13, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaA", "1      AAAA1      AAAA1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaA" + "'", str2, "aaaA");
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 100, "aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("10.0a1.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0a1." + "'", str1, "10.0a1.");
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("trueaaahtru   eaaahfalse", "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1      AAAA1      AAAA1", 27, "##                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##1      AAAA1      AAAA1##" + "'", str3, "##1      AAAA1      AAAA1##");
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi", "a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("-1a10a0a10a1a10a0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1a10a0a10a1a10a0a" + "'", str1, "-1a10a0a10a1a10a0a");
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray2);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, (int) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, 33, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0.0--------------------0.0       ", "Aaa                            aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0--------------------0.0       " + "'", str2, "0.0--------------------0.0       ");
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 100, (int) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10L, (double) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("1      aaaa1      aaaa10", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1      AAAA1      AAAA1", 516, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1      AAAA1      AAAA", 8, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1      AAAA1      AAAA" + "'", str3, "1      AAAA1      AAAA");
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("10110010", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10110010" + "'", str2, "10110010");
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[][] shortArray12 = new java.lang.Short[][] { shortArray3, shortArray7, shortArray11 };
        java.lang.Short[][] shortArray13 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray12);
        java.io.Serializable[] serializableArray14 = org.apache.commons.lang3.ArrayUtils.toArray((java.io.Serializable[]) shortArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short[][] shortArray16 = org.apache.commons.lang3.ArrayUtils.remove(shortArray12, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(serializableArray14);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aAA", "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAA1      AAAA            ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.remove(floatArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hihi...", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0", (int) '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0" + "'", str3, "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "       aaa                  ", (java.lang.CharSequence) "                                                                 AAA                                                                                               aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, (int) (byte) 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!ih", "                                                                                              aaa", 4);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hiaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0.0--------------------0.0       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("-11001011000", "       aaa                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-11001011000" + "'", str2, "-11001011000");
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaa", "AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        int[] intArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 94, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                 aaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 aaa" + "'", str2, "                                                                                                 aaa");
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "hihih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap2 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray0);
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray3);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray6);
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray6);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray9);
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray9);
        java.lang.Double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray12);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray15);
        java.util.Map<java.lang.Object, java.lang.Object> objMap17 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray15);
        java.util.Map[] mapArray19 = new java.util.Map[6];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray20 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray19;
        objMapArray20[0] = objMap2;
        objMapArray20[1] = objMap5;
        objMapArray20[2] = objMap8;
        objMapArray20[3] = objMap11;
        objMapArray20[4] = objMap14;
        objMapArray20[5] = objMap17;
        java.util.Map[][] mapArray34 = new java.util.Map[1][];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray35 = (java.util.Map<java.lang.Object, java.lang.Object>[][]) mapArray34;
        objMapArray35[0] = objMapArray20;
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(objMapArray35);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(objMap2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(objMap5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(objMap8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(objMap11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(objMap14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(objMap17);
        org.junit.Assert.assertNotNull(mapArray19);
        org.junit.Assert.assertNotNull(objMapArray20);
        org.junit.Assert.assertNotNull(mapArray34);
        org.junit.Assert.assertNotNull(objMapArray35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray8, true);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray10, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 35, (double) 99);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 6, (double) 93);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(byteArray0, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" aaahihi...  ", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " aaahihi...  " + "'", str2, " aaahihi...  ");
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.1a0.01", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "10110010", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, 0.0d);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 3, 28, (double) (short) 0);
        double[] doubleArray15 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray15, (double) 100);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray1, doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 35.0, 0.0, 100.0]");
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                                                aaa                                 ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
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
        java.lang.Short[] shortArray41 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[] shortArray45 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[] shortArray49 = new java.lang.Short[] { (short) 10, (short) 100, (short) 100 };
        java.lang.Short[][] shortArray50 = new java.lang.Short[][] { shortArray41, shortArray45, shortArray49 };
        java.lang.Short[][] shortArray51 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray52 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.Object[][]) floatArray36, (java.lang.Object[][]) shortArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot store [Ljava.lang.Short; in an array of [Ljava.lang.Float;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertNotNull(shortArray51);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) (-1));
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray8, (double) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray14, (double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("{-1,10,10,1,10,0,0}", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaa", 94, "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444" + "'", str3, "aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444");
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray3, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray3);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray3);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) "                                                                aaa                                 ", (java.lang.Object) byteArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray8, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AAAA1      AAAA", "     HIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("##                                                                                                 ", "       AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##                                                                                                 " + "'", str2, "##                                                                                                 ");
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0.0a1.0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0a0.0" + "'", str2, "1.0a0.0");
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "1      AAAA1      AAAA10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (int) 'a', (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 2");
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
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        int[] intArray0 = null;
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (byte) 10, 8);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 0.0d, 10.0d };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 10.0]");
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, (int) (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("10.0a1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0a1" + "'", str1, "10.0a1");
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("a444#a", "AAAH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        java.lang.Byte[] byteArray16 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 5");
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
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("-1a10a0a10a1a10a0a0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1a10a0a10a1a10a0a0" + "'", str1, "-1a10a0a10a1a10a0a0");
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0.0a", "                                                                                                 aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                 aAAAa                                                                                               aaaaaA", 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 aAAAa                                                                                               aaaaaA" + "'", str3, "                                                                 aAAAa                                                                                               aaaaaA");
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.0       ", "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                aaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "HIHIH");
        double[] doubleArray4 = new double[] { 1.0f };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) (-1L), (double) 100);
        double[] doubleArray10 = new double[] { 1.0f };
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray10);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray2, (java.lang.Object) doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, 35, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray40 = org.apache.commons.lang3.ArrayUtils.add(longArray36, (int) (short) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
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
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hihih", " aaahihi... ", 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h aaahihi... " + "'", str4, "h aaahihi... ");
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                AAA                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hiaaaaaaaa", "10.0a1.0", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.remove(byteArray14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 1, 100, 1]");
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444444444444444                                aaa444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        double[] doubleArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                             aaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaA" + "'", str1, "aaaA");
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                AAA                                 ", "-1a10a0a10a1a10a0a0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("{");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        java.lang.Long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (-1));
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
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
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray9);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAA1      AAAA            ", (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "{}", 28, (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0     HIHIH0     HIHIH10    {}" + "'", str4, "0     HIHIH0     HIHIH10    {}");
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaa", "aaaA1110aaaA1110aaaA1110aaaA", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa" + "'", str3, "aaa");
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1 0 1 100 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, (int) (short) 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("{100,1,-1,0,1,0}", "aahi", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              HIHIH                                                        aaa", "aaaA", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "1110", (java.lang.CharSequence) "aaahihi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("1      aaaa1      aaaa10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1      aaaa1      aaaa10" + "'", str1, "1      aaaa1      aaaa10");
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray17 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray17, 'a');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, '#');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray21);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray21);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray21, ' ', 24);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) 4);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aAAAa                                                                                               aaaaaA", "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) '#', 0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "1      AAAA1      AAAA1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false, 93);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, true);
        java.lang.String str22 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) true, "");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "true" + "'", str22, "true");
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", "AAA                                                                                               aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1," + "'", str2, "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray17 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray17, 'a');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, '#');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray21);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray21);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray25 = org.apache.commons.lang3.ArrayUtils.remove(charArray21, 516);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 516, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!HI", "trueaaahtrueaaahtrueaaahfalse                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!HI" + "'", str2, "hi!HI");
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("   ", "trueaaahtrueaaahtrueaaahfalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                 aAAAa                                                                                               aaaaaAeaaahfalse", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse" + "'", str2, "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("##                                                                                                 ", "a444#a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 aAAAa                                                                                               aaaaaAeaaahfalse", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "1110");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(floatArray5, (float) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, 10.0f, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 3");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("trueaaahtru   eaaahfalse", "               HIHIH               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtru   eaaahfalse" + "'", str2, "trueaaahtru   eaaahfalse");
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "              1110               ", "       AAA                  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaa                            aaaA", "-1a10a0a10a1a10a0a0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa                            aaaA" + "'", str2, "aaa                            aaaA");
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "1      AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("-1A10A0A10A1A10A0A0", (int) (byte) 10, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A1A10A0A0" + "'", str3, "A1A10A0A0");
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("{-1,10,0,10,1,10,0,0}", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,10,0,10,1,10,0,0}" + "'", str2, "{-1,10,0,10,1,10,0,0}");
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                AAA                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("1      aaaA1      aaaA10", "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaah", (java.lang.CharSequence) "       aaa                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                                                              ", "0.0a", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                              aaa", 13, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("h aaahihi... ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h aaahihi... " + "'", str2, "h aaahihi... ");
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "trueaaahtru   eaaahfalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-1,10,0,10,1,10,0,0}" + "'", str1, "{-1,10,0,10,1,10,0,0}");
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi...");
        java.lang.Object[] objArray2 = null;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray1, objArray2);
        java.util.Map<java.lang.Object, java.lang.Object> objMap4 = org.apache.commons.lang3.ArrayUtils.toMap(objArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objMap4);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        float[] floatArray0 = new float[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) (byte) 100);
        float[] floatArray4 = new float[] { (byte) 10 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) (-1));
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (int) (short) 0, (float) (short) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (byte) 0);
        float[] floatArray14 = new float[] { (byte) 10 };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (float) (-1));
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray14);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (int) (short) 0, (float) (short) -1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray20, (float) 1L);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray20);
        float[] floatArray30 = new float[] { (byte) -1, 100L, 100.0f, 100L, 1, 10.0f };
        float[] floatArray32 = new float[] { (byte) 10 };
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray32, (float) (-1));
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray32, 0.0f, 100);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray32, (float) 0L);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray30, floatArray32);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray40, (float) (byte) 1);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray40);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray0, floatArray7);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, 7, 6);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.add(floatArray47, (int) (short) 1, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[]");
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("1110", " aaahihi... ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("0.0a", "                                                                aaa                                 ", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a" + "'", str3, "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a");
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                 aAAAa                                                                                               aaaaaA", "0.0a1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
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
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray21, '#');
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("      aaaA", "               HIHIH               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaA" + "'", str2, "      aaaA");
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "{0,0,10,1,10,0}");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("AAA", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      aaaA", "hi!HI");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("1      aaaa1      aaaa10", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0     HIHIH0     HIHIH10    {}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) 'a', 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("h aaahihi... ", "-10110010", " aaahihi...  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h aaahihi... " + "'", str3, "h aaahihi... ");
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("-1a10a0a10a1a10a0a0", "hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1a10a0a10a1a10a0a0" + "'", str2, "-1a10a0a10a1a10a0a0");
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH", "       AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH");
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "{}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hihi...", "10.0a1", "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", "     HIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0" + "'", str2, "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        java.lang.CharSequence[] charSequenceArray0 = null;
        java.lang.CharSequence[] charSequenceArray1 = org.apache.commons.lang3.ArrayUtils.toArray(charSequenceArray0);
        org.junit.Assert.assertNull(charSequenceArray1);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "1110");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                 aAAAa                                                                                               aaaaaA", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 aAAAa                                                                                               aaaaaA" + "'", str2, "                                 aAAAa                                                                                               aaaaaA");
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(" aaahihi...  ", "44444444444444444444444444444                                aaa444444444444444444444444444444", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "0     HIHIH0     HIHIH10    {}", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("-1 0 1 100 1", "aaahihi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 0 1 100 1" + "'", str2, "-1 0 1 100 1");
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                aaa                                 ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
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
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray7);
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
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH", "{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                              HIHIH                                                        aaa", "                                 aAAAa                                                                                               aaaaaA", "##   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hihi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi..." + "'", str1, "hihi...");
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("{97,0,1,100,0}", "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       aAA", (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaa", "{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa" + "'", str2, "aaa");
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "      aaaA", (java.lang.CharSequence) "AAAH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("HIHIH                              ", "                                                                 AAA                                                                                               aaa", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                              HIHIH                                                        aaa", "1      AAAA1      AAAA1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAA1      AAAA", "1      AAAA1      AAAA10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA1      AAAA" + "'", str2, "AAAA1      AAAA");
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                             aaa                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) 27, (double) 'a');
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (double) 10L);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.add(doubleArray20, (int) (byte) 10, (double) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" aaahihi...  ", "HIHIH", "aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " aaahihi...  " + "'", str4, " aaahihi...  ");
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", 516);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aAAAa                                                                                               aaaaaA", "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
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
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.subarray(intArray21, (int) (byte) 0, (int) (byte) 1);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray27, (int) (byte) 1, 13);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = org.apache.commons.lang3.ArrayUtils.add(intArray27, 8, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 0");
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
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        short[] shortArray0 = null;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) (short) -1, 24);
        org.junit.Assert.assertNull(shortArray3);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaA1110aaaA1110aaaA1110aaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("true", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        int[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "1      AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi...", "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi..." + "'", str2, "hi...");
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray18 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) (byte) 0, (-1));
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray18);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.remove(floatArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, -1.0]");
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaahihi...", "HI", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaahi", "hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1110", "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("1      aaaa1      aaaa10", 6, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) 10);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("10.0a1.10.0a1.10.0a1.10.0a1.10hi...", "1      AAAA1      AAAA10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 94);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 2);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                 aaa                                             ", (int) '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 aaa                                             " + "'", str3, "                                 aaa                                             ");
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("a#a444", "44444444444444444444444444444                                aaa444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#a444" + "'", str2, "a#a444");
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("{}", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hihih", "AAA                                                                                               aaaA", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##1      AAAA1      AAAA1##", (int) (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    ##1      AAAA1      AAAA1##                                     " + "'", str3, "                                    ##1      AAAA1      AAAA1##                                     ");
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1A10A0A10A1A10A0A0", "1      aaaA1      aaaA10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("10.0a1", "trueaaahtrueaaahtrueaaahfalse", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("       AAA", "-1a10a0a10a1a10a0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       AAA" + "'", str2, "       AAA");
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = org.apache.commons.lang3.ArrayUtils.remove(charArray12, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 6");
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", (java.lang.CharSequence) "     HIHIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap21 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'true', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("       aAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAA" + "'", str1, "aAA");
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 516, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 516, Length: 0");
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
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
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
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 13, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 0");
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
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaa                                                                                               aAAAa" + "'", str1, "Aaaaaa                                                                                               aAAAa");
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(objArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, 10.0d, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("-1a10a0a10a1a10a0a0", "                                                                AAA                                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a", (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "##                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hiaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiaaaaaaaa" + "'", str2, "hiaaaaaaaa");
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                 aaa                                                            aaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray14);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray19, 19, 27);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray19, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
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
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[]");
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          ", "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "Aaaaaa                                                                                               aAAAa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 100, (int) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, 0.0d, 94, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0     HIHIH0     HIHIH10    {}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("10.0a1.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0a1." + "'", str1, "10.0a1.");
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                 AAA                                                                                               aaa", "aaa", "aAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "1110", "##1      AAAA1      AAAA1##");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                 aaa                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0     HIHIH0     HIHIH10    {}", "                                                                AAA                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia", "1.0a0.0", "hihi...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 4, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                              aaa", "AAAH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 10.0f, (int) '4');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (byte) -1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 19);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, 0.0d, 2, (double) 100L);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" aaahihi...  ", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0.0       ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       " + "'", str2, "0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                 aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 aAAAa                                                                                               aaaaaA" + "'", str1, "                                 aAAAa                                                                                               aaaaaA");
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" aaahihi...  ", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " aaahihi...  " + "'", str3, " aaahihi...  ");
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "-1A10A0A10A1A10A0A0", (java.lang.CharSequence) "Aaa                            aaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("1.0a0.0", "                              HIHIH                                                        aaa", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0" + "'", str3, "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0");
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA" + "'", str1, "-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("{0,0,10,1,10,0}", "-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaa                                ", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa                                " + "'", str2, "aa                                ");
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("h", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1      AAAA1      AAAA10", (int) (byte) 100, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray5);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray5, 0, 0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0]");
        org.junit.Assert.assertNull(floatArray9);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  aaaa10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", "aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.remove(intArray7, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", "                                                                 aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0" + "'", str2, "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 100, "{-1,10,10,1,10,0,0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1," + "'", str3, "{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,");
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "-1 0 1 100 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "AAAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str2, "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
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
        long[] longArray31 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(longArray31, (long) ' ');
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray23, longArray31);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray31);
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[-1, -1, 0]");
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.remove(shortArray4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[]");
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
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
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.remove(shortArray31, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 2");
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
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[-1, 10]");
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) " aaahihi... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " aaahihi... " + "'", str1, " aaahihi... ");
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "trueaaahtrueaaahtrueaaahfalse                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("{97,0,1,100,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{97,0,1,100,0}" + "'", str1, "{97,0,1,100,0}");
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                 aaa", 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 aaa" + "'", str3, "                                                                                                 aaa");
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("       aAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAA" + "'", str1, "aAA");
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                 AAA                                                                                               aaa", "                                                                 aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAa                                                                                               aaaaaA" + "'", str2, "aAAAa                                                                                               aaaaaA");
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray9, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
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
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("-11001011000", "0.0--------------------0.0       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("trueaaahtrueaaahtrueaaahfalse", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtrueaaahtrueaaahfalse" + "'", str2, "trueaaahtrueaaahtrueaaahfalse");
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Hihih", 27, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "##   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (int) (byte) 1, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "1.0a0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        double[] doubleArray4 = new double[] { (byte) 1, 1.0d, 10.0d, 516 };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 1.0, 10.0, 516.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str3, "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10.0a1.0", "                                 aaa                                                            aaaA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi...", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("10.0a1.10.0a1.10.0a1.10.0a1.10hi...", 0, "                                aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.0a1.10.0a1.10.0a1.10.0a1.10hi..." + "'", str3, "10.0a1.10.0a1.10.0a1.10.0a1.10hi...");
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAA                                                                                               aaaA", "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA                                                                                               aaaA" + "'", str2, "AAA                                                                                               aaaA");
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaa");
        java.lang.CharSequence[] charSequenceArray9 = org.apache.commons.lang3.ArrayUtils.subarray((java.lang.CharSequence[]) strArray6, 35, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) charSequenceArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A" + "'", str1, "0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A");
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        float[] floatArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                AAA                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", 33, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              HIHIH                                                        aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 9, (float) 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 3");
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
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAA                                                                                               aaaA", "hiaaaaaaaa", "aaah", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAA                                                                                               aaaA" + "'", str4, "AAA                                                                                               aaaA");
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 aAAAa                                                                                               aaaaaA", "                                                                 AAA                                                                                               aaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] {};
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        java.lang.String[][] strArray6 = new java.lang.String[][] {};
        java.lang.String[][] strArray7 = new java.lang.String[][] {};
        java.lang.String[][][] strArray8 = new java.lang.String[][][] { strArray2, strArray3, strArray4, strArray5, strArray6, strArray7 };
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.lang.String[][] strArray10 = new java.lang.String[][] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] {};
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        java.lang.String[][] strArray14 = new java.lang.String[][] {};
        java.lang.String[][][] strArray15 = new java.lang.String[][][] { strArray9, strArray10, strArray11, strArray12, strArray13, strArray14 };
        java.lang.String[][] strArray16 = new java.lang.String[][] {};
        java.lang.String[][] strArray17 = new java.lang.String[][] {};
        java.lang.String[][] strArray18 = new java.lang.String[][] {};
        java.lang.String[][] strArray19 = new java.lang.String[][] {};
        java.lang.String[][] strArray20 = new java.lang.String[][] {};
        java.lang.String[][] strArray21 = new java.lang.String[][] {};
        java.lang.String[][][] strArray22 = new java.lang.String[][][] { strArray16, strArray17, strArray18, strArray19, strArray20, strArray21 };
        java.lang.String[][] strArray23 = new java.lang.String[][] {};
        java.lang.String[][] strArray24 = new java.lang.String[][] {};
        java.lang.String[][] strArray25 = new java.lang.String[][] {};
        java.lang.String[][] strArray26 = new java.lang.String[][] {};
        java.lang.String[][] strArray27 = new java.lang.String[][] {};
        java.lang.String[][] strArray28 = new java.lang.String[][] {};
        java.lang.String[][][] strArray29 = new java.lang.String[][][] { strArray23, strArray24, strArray25, strArray26, strArray27, strArray28 };
        java.lang.String[][][][] strArray30 = new java.lang.String[][][][] { strArray8, strArray15, strArray22, strArray29 };
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 1 };
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray33, (byte) -1, (int) 'a');
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray33);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray33, (byte) 1);
        java.lang.String[][][][] strArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(strArray30, (java.lang.Object) byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][][][][] strArray41 = org.apache.commons.lang3.ArrayUtils.add(strArray0, 24, strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
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
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10]");
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "     HIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                 aaa                                                            aaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("10.0a1.0", "                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (int) '4', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                 aaa", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 94, "          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              " + "'", str3, "                                                                                              ");
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
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
        java.lang.String str96 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray94, "-1a10a0a10a1a10a0a");
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
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "{{ ,#},{ ,#},{ ,#},{ ,#}}" + "'", str96, "{{ ,#},{ ,#},{ ,#},{ ,#}}");
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("{{ ,#},{ ,#},{ ,#},{ ,#}}", "{}", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        java.lang.Byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) 10);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        short[] shortArray0 = null;
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray5);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (short) 10, 10);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(floatArray17, (float) '4');
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("{100,1,-1,0,1,0}", 4, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{100,1,-1,0,1,0}" + "'", str3, "{100,1,-1,0,1,0}");
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1 0 1 100 1", "AAAH", "0.1a0.01");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" aaahihi... ", "                                             aaa                                 ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) " aaahihi... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " aaahihi... " + "'", str1, " aaahihi... ");
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A" + "'", str1, "0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A");
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                AAA                                 ", "                                aaa", (int) (byte) 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaa                                ", "aaa", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("trueaaahtrueaaahtrueaaahfalse", (java.lang.Object[]) strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("h aaahihi... ", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "trueaaahtrueaaahtrueaaahfalse                                " + "'", str10, "trueaaahtrueaaahtrueaaahfalse                                ");
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAA1      AAAA             ", 19, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA1      AAAA             " + "'", str3, "AAAA1      AAAA             ");
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444                                aaa444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444aaa444444444444444444444444444444" + "'", str1, "44444444444444444444444444444aaa444444444444444444444444444444");
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.remove(floatArray8, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("{{ ,#},{ ,#},{ ,#},{ ,#}}", "                                                                                              aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{ ,#},{ ,#},{ ,#},{ ,#}}" + "'", str2, "{{ ,#},{ ,#},{ ,#},{ ,#}}");
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        int[] intArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 4, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (int) (short) 0, (short) (byte) 100);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.remove(shortArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 6");
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
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0.0a", "{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0a" + "'", str2, "0.0a");
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("a444#a", "  aaaa10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        char[] charArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("10.0a1.", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray20, false, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "-11001011000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-11001011000" + "'", str1, "-11001011000");
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", "AAA                                                                                               aaaA", 28);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaah", "                              HIHIH                                                        aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaahihi...", "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahihi..." + "'", str2, "aaahihi...");
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
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
        long[] longArray36 = null;
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.addAll(longArray27, longArray36);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray27, (long) 4);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray27);
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
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", "-11001011000", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("1      AAAA1      AAAA1", (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1      AAAA1      AAAA1" + "'", str3, "1      AAAA1      AAAA1");
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, false, 35);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, 7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 6");
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
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false, true, true]");
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("1      AAAA1      AAAA10", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("{100,1,-1,0,1,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{100,1,-1,0,1,0}" + "'", str1, "{100,1,-1,0,1,0}");
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAA                                                                                               aaaA", 28, "aahi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA                                                                                               aaaA" + "'", str3, "AAA                                                                                               aaaA");
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aAAAa                                                                                               aaaaaA", "{0,0,10,1,10,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaa", (int) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Hihih", "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{-1,10,10,1,10,0,0}", "hihih", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("{-1,-1,0}", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}" + "'", str2, "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aahi", "a#a444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}", "aAAAa                                                                                               aaaaaA", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("               HIHIH               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 35, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
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
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI", "1110");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("  aaaa10", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", (java.lang.CharSequence) "hi!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "AAAA1      AAAA            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1." + "'", str1, "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.");
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hiaaaaaaaa", (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray1, (int) 'a', 3);
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray11);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaA", "      aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("1.0a0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0a0.0" + "'", str1, "1.0a0.0");
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "0.0--------------------0.0       ", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("-1a10a0a10a1a10a0a0", "       aAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1a10a0a10a1a10a0a0" + "'", str2, "-1a10a0a10a1a10a0a0");
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "10.0a1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 4, (int) (short) 0);
        java.lang.Object obj7 = null;
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, obj7, 93);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("{97,0,1,100,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{97,0,1,100,0}" + "'", str1, "{97,0,1,100,0}");
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        int int1 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Aaa                            aaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaa                            aaaA" + "'", str1, "Aaa                            aaaA");
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IH!ih", "1      AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a", "IH!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1a10a0a10a1a10a0a", "hi", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1      AAAA1      AAAA10", "AAAA1      AAAA");
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaA1110aaaA1110aaaA1110aaaA", "{", 19);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("       aaa                  ", (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi", "HIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi" + "'", str2, "Hi");
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("1      aaaa1      aaaa10", 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1      aaaa1      aaaa10" + "'", str3, "1      aaaa1      aaaa10");
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a444#a", "a#a444", "          ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                              HIHIH                                                        aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray10, '#', 25, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) ' ', (double) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 1.0]");
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", "1      aaaa1      aaaa10", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "------------aaa----------------------------------1.0" + "'", str2, "------------aaa----------------------------------1.0");
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("{0,0,10,1,10,0}", "Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{0,0,10,1,10,0}" + "'", str2, "{0,0,10,1,10,0}");
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        java.lang.String[] strArray1 = new java.lang.String[] { "                                                                 aAAAa                                                                                               aaaaaA" };
        java.lang.String[] strArray3 = new java.lang.String[] { "                                                                 aAAAa                                                                                               aaaaaA" };
        java.lang.String[] strArray5 = new java.lang.String[] { "                                                                 aAAAa                                                                                               aaaaaA" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray1, strArray3, strArray5 };
        java.lang.String[] strArray8 = new java.lang.String[] { "                                                                 aAAAa                                                                                               aaaaaA" };
        java.lang.String[] strArray10 = new java.lang.String[] { "                                                                 aAAAa                                                                                               aaaaaA" };
        java.lang.String[] strArray12 = new java.lang.String[] { "                                                                 aAAAa                                                                                               aaaaaA" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray8, strArray10, strArray12 };
        java.lang.String[][][] strArray14 = new java.lang.String[][][] { strArray6, strArray13 };
        java.lang.String[][][] strArray15 = org.apache.commons.lang3.ArrayUtils.clone(strArray14);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray14);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA" + "'", str1, "AAA");
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aa                                ", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa                                " + "'", str2, "aa                                ");
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[][][] byteArray23 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }
}

