import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray1);
        java.math.BigInteger bigInteger8 = bigInteger6.pow(3);
        int int9 = bigInteger6.getLowestSetBit();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        double double11 = bigDecimal10.doubleValue();
        java.math.BigInteger bigInteger12 = bigDecimal10.toBigInteger();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        byte[] byteArray20 = bigInteger17.toByteArray();
        long long21 = bigInteger17.longValueExact();
        java.math.BigInteger bigInteger22 = bigInteger12.or(bigInteger17);
        byte byte23 = bigInteger17.byteValueExact();
        int int24 = bigInteger17.bitCount();
        java.math.BigInteger bigInteger26 = bigInteger17.clearBit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = bigInteger6.modInverse(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger: modulus not positive");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(bigInteger26);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        char[] charArray10 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("en_US", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-us", charArray10);
        java.math.MathContext mathContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(charArray10, 16, (int) (short) -2, mathContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        int int2 = bigDecimal0.intValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal12 = bigDecimal9.min(bigDecimal11);
        java.lang.String str13 = bigDecimal12.toPlainString();
        java.math.BigDecimal bigDecimal14 = bigDecimal0.subtract(bigDecimal12);
        int int15 = bigDecimal12.scale();
        java.math.BigDecimal bigDecimal16 = bigDecimal12.abs();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((double) 117);
        double double19 = bigDecimal18.doubleValue();
        int int20 = bigDecimal18.scale();
        java.math.BigDecimal bigDecimal22 = bigDecimal18.setScale((int) (short) 10);
        java.math.MathContext mathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = bigDecimal12.multiply(bigDecimal18, mathContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str13, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 117.0d + "'", double19 == 117.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(bigDecimal22);
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\uc77c\ub3c5\uc5b4\uc77c\ub3c5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Chinese", "und");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en_US", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (int) '4');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!", 4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("En-US", strArray7, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("\u82f1\u6587", (java.lang.Object[]) strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("German (Germany)", (java.lang.Object[]) strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("frz-C aaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                  ", (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "En-US" + "'", str13, "En-US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str14, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str15, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str16, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger17 = bigInteger15.pow((int) 'a');
        byte[] byteArray18 = bigInteger15.toByteArray();
        long long19 = bigInteger15.longValueExact();
        java.math.BigInteger bigInteger20 = bigInteger10.or(bigInteger15);
        byte byte21 = bigInteger15.byteValueExact();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.math.BigInteger bigInteger25 = bigInteger15.setBit(7);
        java.math.BigInteger bigInteger27 = bigInteger15.clearBit((int) (byte) 1);
        java.math.BigInteger bigInteger28 = bigInteger6.remainder(bigInteger15);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        java.math.BigInteger bigInteger36 = bigInteger35.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        double double38 = bigDecimal37.doubleValue();
        java.math.BigInteger bigInteger39 = bigDecimal37.toBigInteger();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger46 = bigInteger44.pow((int) 'a');
        byte[] byteArray47 = bigInteger44.toByteArray();
        long long48 = bigInteger44.longValueExact();
        java.math.BigInteger bigInteger49 = bigInteger39.or(bigInteger44);
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger56 = bigInteger54.pow((int) 'a');
        byte[] byteArray57 = bigInteger54.toByteArray();
        long long58 = bigInteger54.longValueExact();
        java.lang.String str60 = bigInteger54.toString(0);
        int int61 = bigInteger54.intValueExact();
        java.math.BigInteger bigInteger62 = bigInteger49.subtract(bigInteger54);
        java.math.BigInteger bigInteger63 = bigInteger35.min(bigInteger49);
        float float64 = bigInteger35.floatValue();
        java.math.BigInteger bigInteger65 = bigInteger15.subtract(bigInteger35);
        java.math.BigInteger bigInteger67 = java.math.BigInteger.valueOf((long) '#');
        java.math.BigInteger bigInteger69 = bigInteger67.clearBit((int) 'x');
        java.math.BigInteger bigInteger70 = bigInteger35.min(bigInteger67);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-1" + "'", str60, "-1");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigInteger70);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("English");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("english");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("IT...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it..." + "'", str1, "it...");
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Englis...", "#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englis..." + "'", str2, "Englis...");
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_CA" + "'", str1, "en_CA");
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf(13L);
        java.lang.String str6 = bigDecimal5.toPlainString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigDecimal3.divide(bigDecimal5, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "13" + "'", str6, "13");
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.TEN;
        long long19 = bigDecimal18.longValueExact();
        int int20 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal18.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.TEN;
        long long24 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.ulp();
        java.math.BigDecimal bigDecimal26 = bigDecimal22.remainder(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ZERO;
        double double28 = bigDecimal27.doubleValue();
        java.math.BigInteger bigInteger29 = bigDecimal27.toBigInteger();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger((int) (short) -1, byteArray32);
        java.math.BigInteger bigInteger36 = bigInteger34.pow((int) 'a');
        byte[] byteArray37 = bigInteger34.toByteArray();
        long long38 = bigInteger34.longValueExact();
        java.math.BigInteger bigInteger39 = bigInteger29.or(bigInteger34);
        byte byte40 = bigInteger34.byteValueExact();
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(bigInteger34, (int) (byte) 0);
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(bigInteger34, (int) '#');
        java.math.BigDecimal bigDecimal45 = bigDecimal26.subtract(bigDecimal44);
        java.math.BigDecimal bigDecimal46 = bigDecimal17.add(bigDecimal26);
        java.math.BigDecimal bigDecimal48 = new java.math.BigDecimal(120);
        java.lang.String str49 = bigDecimal48.toPlainString();
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) 'x', 120);
        float float53 = bigDecimal52.floatValue();
        int int54 = bigDecimal48.compareTo(bigDecimal52);
        java.math.BigDecimal bigDecimal55 = bigDecimal46.subtract(bigDecimal52);
        java.math.BigInteger bigInteger56 = bigDecimal46.unscaledValue();
        java.math.BigInteger bigInteger57 = bigInteger56.not();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) -1 + "'", byte40 == (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "120" + "'", str49, "120");
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger57);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Korean (South Korea)");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\ub3c5\uc77c\uc5b4", "   JA", "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str3, "\ub3c5\uc77c\uc5b4");
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("3.5E-114", "HI!HI!HI!HI", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3.5E-114" + "'", str3, "3.5E-114");
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("DUNDUNDUND", (int) 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DUNDUNDUND#######################################################################################" + "'", str3, "DUNDUNDUND#######################################################################################");
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("chinese", "\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd)", (int) (byte) -33, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd)chinese" + "'", str4, "\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd)chinese");
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("China");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CN");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cn" + "'", str2, "cn");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(52);
        java.math.MathContext mathContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = bigDecimal1.abs(mathContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Korean (South Korea)", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!H", "Chinese", 6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("aj", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!H" + "'", str8, "HI!H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aj" + "'", str9, "aj");
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("UNITEDxSTATES", "chinois");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNITEDxSTATES" + "'", str3, "UNITEDxSTATES");
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Japanese");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Japanese\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuyuiyuxuwuwuvuivuevuuuuukuuguuytuwtuttustututuntultuktuitutugtuetutuwsuvsuusutsussusuqsusunsumsulsuksuisugsuesudsucsusuwuuuunumuuqutpuspulpuipupusuumujucuynuvnunununnulnugnuenudnubnunuymutmusmumumunmulmukmuimumugmuvluulutlulunluiluglubluluykuwkuvkuukuskukukunkumkulkukkujkuikugkukuvjuijujuwiuuiutiusiuiuniukiuiiugiueiudiuiuuyuuutuuuiueuuvguugungulgudguguyuuujuiuuuueuteuseueuneuleueeuduvdueduduycuvcuucuscucucucuecucusbububunbumbuibubugbuebubuuyuvusuunumukuueubu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("De", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "             hi!uuu             ", 100, 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ko", "aaaaaaaaaunited statesaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        java.util.Locale locale1 = new java.util.Locale("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("zh-CN", locale3);
        java.lang.String str7 = locale3.getCountry();
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ");
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.lang.String str12 = locale8.getDisplayCountry(locale10);
        java.lang.String str13 = locale3.getDisplayLanguage(locale10);
        java.lang.String str14 = locale1.getDisplayVariant(locale10);
        java.lang.String str15 = locale10.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-cn" + "'", str6, "zh-cn");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal14 = bigDecimal10.subtract(bigDecimal13);
        java.math.BigInteger bigInteger15 = bigDecimal14.toBigInteger();
        double double16 = bigInteger15.doubleValue();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray19);
        java.math.BigInteger bigInteger21 = new java.math.BigInteger((int) (short) -1, byteArray19);
        java.math.BigInteger bigInteger22 = bigInteger15.gcd(bigInteger21);
        java.math.BigInteger bigInteger23 = bigInteger21.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        short short46 = bigInteger36.shortValueExact();
        byte byte47 = bigInteger36.byteValueExact();
        java.math.BigInteger bigInteger48 = bigInteger21.and(bigInteger36);
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        java.math.BigInteger bigInteger57 = bigInteger53.shiftLeft((int) (short) 1);
        int int58 = bigInteger57.intValueExact();
        java.math.BigInteger bigInteger59 = bigInteger57.abs();
        java.math.BigInteger bigInteger60 = bigInteger36.multiply(bigInteger59);
        java.math.BigInteger bigInteger61 = bigInteger6.multiply(bigInteger59);
        byte[] byteArray63 = new byte[] { (byte) 1 };
        byte byte64 = org.apache.commons.lang3.math.NumberUtils.min(byteArray63);
        java.math.BigInteger bigInteger65 = new java.math.BigInteger(byteArray63);
        java.math.BigInteger bigInteger66 = bigInteger61.subtract(bigInteger65);
        java.lang.String str68 = bigInteger66.toString((int) (byte) 2);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) -1 + "'", short46 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) -1 + "'", byte47 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-2) + "'", int58 == (-2));
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 1 + "'", byte64 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "-1" + "'", str68, "-1");
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "2ETAT2-D)aeroK htuoS( naeroK");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)" + "'", str1, "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("-1UND0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1UND0" + "'", str1, "-1UND0");
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        java.util.Locale locale3 = new java.util.Locale("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi", ")", "en-c");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi_)_en-c");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ")" + "'", str4, ")");
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigInteger bigInteger11 = bigDecimal10.toBigInteger();
        double double12 = bigInteger11.doubleValue();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger18 = bigInteger11.gcd(bigInteger17);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal20 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal24 = bigDecimal20.subtract(bigDecimal23);
        java.math.BigInteger bigInteger25 = bigDecimal24.toBigInteger();
        java.math.BigInteger bigInteger26 = bigInteger17.or(bigInteger25);
        short short27 = bigInteger17.shortValueExact();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger34 = bigInteger32.pow((int) 'a');
        java.math.BigInteger bigInteger36 = bigInteger32.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger37 = bigInteger17.xor(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        long long41 = bigDecimal40.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.lang.String str43 = bigDecimal40.toString();
        int int44 = bigDecimal38.compareTo(bigDecimal40);
        java.math.BigInteger bigInteger45 = bigDecimal38.toBigInteger();
        java.math.BigInteger bigInteger46 = bigInteger37.gcd(bigInteger45);
        java.math.BigInteger bigInteger47 = bigInteger4.gcd(bigInteger46);
        double double48 = bigInteger4.doubleValue();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(bigInteger4, (int) (short) 34);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale locale6 = new java.util.Locale("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayName(locale6);
        java.lang.String str9 = locale6.getCountry();
        java.lang.String str10 = locale6.getDisplayName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str7, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str10, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((long) 4);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1), (double) 117L, 296.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 296.0d + "'", double3 == 296.0d);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("i!hi!hi!hi!hi!hi!hi!hi!h", "\u65e5\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.scaleByPowerOfTen(301);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        double double11 = bigDecimal10.doubleValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.movePointLeft((int) (byte) -1);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.stripTrailingZeros();
        int int16 = bigDecimal7.compareTo(bigDecimal13);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal18.subtract(bigDecimal21);
        java.math.BigInteger bigInteger23 = bigDecimal22.toBigInteger();
        byte[] byteArray24 = bigInteger23.toByteArray();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger23);
        java.math.BigDecimal bigDecimal26 = bigDecimal13.max(bigDecimal25);
        byte byte27 = bigDecimal26.byteValueExact();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.setScale(2, 2);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf(10L);
        long long33 = bigDecimal32.longValueExact();
        int int34 = bigDecimal32.precision();
        java.math.BigDecimal bigDecimal35 = bigDecimal30.divideToIntegralValue(bigDecimal32);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal38 = bigDecimal36.divide(bigDecimal37);
        java.math.MathContext mathContext39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal40 = bigDecimal32.remainder(bigDecimal38, mathContext39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\u671d\u9c9c\u6587                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 45, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.scaleByPowerOfTen(301);
        double double10 = bigDecimal7.doubleValue();
        java.math.BigInteger bigInteger11 = bigDecimal7.toBigInteger();
        java.math.BigInteger bigInteger12 = bigDecimal7.unscaledValue();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal18 = bigDecimal14.subtract(bigDecimal17);
        java.math.BigInteger bigInteger19 = bigDecimal18.toBigInteger();
        byte[] byteArray20 = bigInteger19.toByteArray();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        double double28 = bigInteger27.doubleValue();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger34 = bigInteger27.gcd(bigInteger33);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        java.math.BigInteger bigInteger42 = bigInteger33.or(bigInteger41);
        java.math.BigInteger bigInteger43 = bigInteger19.or(bigInteger41);
        java.math.BigInteger bigInteger44 = java.math.BigInteger.ONE;
        java.math.BigInteger bigInteger45 = bigInteger41.divide(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.pow((int) (byte) 100);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal49 = bigDecimal48.negate();
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal53 = bigDecimal49.subtract(bigDecimal52);
        java.math.BigInteger bigInteger54 = bigDecimal53.toBigInteger();
        double double55 = bigInteger54.doubleValue();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        byte byte59 = org.apache.commons.lang3.math.NumberUtils.min(byteArray58);
        java.math.BigInteger bigInteger60 = new java.math.BigInteger((int) (short) -1, byteArray58);
        java.math.BigInteger bigInteger61 = bigInteger54.gcd(bigInteger60);
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal63 = bigDecimal62.negate();
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal67 = bigDecimal63.subtract(bigDecimal66);
        java.math.BigInteger bigInteger68 = bigDecimal67.toBigInteger();
        java.math.BigInteger bigInteger69 = bigInteger60.or(bigInteger68);
        java.math.BigInteger bigInteger71 = bigInteger68.shiftRight((int) (short) -1);
        int int72 = bigInteger47.compareTo(bigInteger71);
        double double73 = bigInteger71.doubleValue();
        java.math.BigInteger bigInteger75 = bigInteger71.flipBit(120);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger[] bigIntegerArray76 = bigInteger12.divideAndRemainder(bigInteger71);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger divide by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-98d + "'", double10 == 1.0E-98d);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1]");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1]");
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 1 + "'", byte59 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger75);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("hi");
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("GBR");
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        boolean boolean12 = locale11.hasExtensions();
        java.util.Locale.Builder builder13 = builder5.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("\uc911\uad6d\uc5b4\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???????? (??????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        int int23 = bigInteger12.getLowestSetBit();
        long long24 = bigInteger12.longValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.negate();
        boolean boolean27 = bigInteger25.equals((java.lang.Object) 31);
        java.math.MathContext mathContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger25, (-1025), mathContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1.0E+2", "3.5E-114");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ENG", (double) 1L);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (-2));
        java.math.BigDecimal bigDecimal3 = bigDecimal1.movePointRight(0);
        java.math.BigDecimal bigDecimal5 = bigDecimal3.movePointRight(99);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\ud504\ub791\uc2a4", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504\ub791\uc2a4" + "'", str2, "\ud504\ub791\uc2a4");
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("   0      0      0      0      0      0   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0      0      0      0      0      0" + "'", str1, "0      0      0      0      0      0");
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u4e2d\u56fd\u8a9eaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#_HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#_HI!" + "'", str1, "#_HI!");
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("zh-TW", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9) uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "...du Sud", "#_ENG");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) -18, (short) 117);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 117 + "'", short3 == (short) 117);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("IT...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IT..." + "'", str1, "IT...");
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9) uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", locale2);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9) UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9) UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow((int) (byte) 1);
        java.math.BigInteger bigInteger5 = bigDecimal4.unscaledValue();
        java.lang.String str7 = bigInteger5.toString((int) '4');
        int int8 = bigInteger5.signum();
        byte[] byteArray9 = bigInteger5.toByteArray();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        int int12 = bigDecimal11.signum();
        long long13 = bigDecimal11.longValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal11.abs();
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        java.math.BigDecimal bigDecimal17 = bigDecimal14.pow((int) (short) 0);
        java.math.BigInteger bigInteger18 = bigDecimal17.toBigInteger();
        java.math.BigInteger bigInteger20 = bigInteger18.setBit(30);
        java.math.BigInteger[] bigIntegerArray21 = bigInteger5.divideAndRemainder(bigInteger18);
        byte[] byteArray22 = bigInteger5.toByteArray();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigIntegerArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0]");
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(byteArray13);
        boolean boolean17 = bigInteger4.equals((java.lang.Object) byteArray13);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        double double25 = bigInteger24.doubleValue();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        java.math.BigInteger bigInteger30 = new java.math.BigInteger((int) (short) -1, byteArray28);
        java.math.BigInteger bigInteger31 = bigInteger24.gcd(bigInteger30);
        java.math.BigInteger bigInteger32 = bigInteger4.and(bigInteger30);
        long long33 = bigInteger30.longValue();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger40 = bigInteger38.pow((int) 'a');
        java.math.BigInteger bigInteger42 = bigInteger38.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger44 = bigInteger42.flipBit(1);
        long long45 = bigInteger44.longValue();
        java.math.BigInteger bigInteger47 = bigInteger44.setBit((int) (byte) 1);
        int int48 = bigInteger44.bitCount();
        java.math.BigInteger bigInteger49 = bigInteger30.min(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-4L) + "'", long45 == (-4L));
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(bigInteger49);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\ud504\ub791\uc2a4\uc5b4-1.0", "UNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "h", 4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("kr", strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!" + "'", str14, "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str5 = locale1.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "US" + "'", str5, "US");
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("UND ", (int) '4', (int) (byte) -33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "gb");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gb" + "'", str1, "Gb");
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        java.math.BigInteger bigInteger21 = bigInteger17.shiftLeft((int) (short) 1);
        boolean boolean23 = bigInteger21.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger24 = bigInteger7.divide(bigInteger21);
        int int25 = bigInteger7.intValue();
        int int26 = bigInteger7.getLowestSetBit();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        byte byte30 = org.apache.commons.lang3.math.NumberUtils.min(byteArray29);
        java.math.BigInteger bigInteger31 = new java.math.BigInteger((int) (short) -1, byteArray29);
        java.math.BigInteger bigInteger33 = bigInteger31.pow((int) 'a');
        java.math.BigInteger bigInteger35 = bigInteger31.shiftLeft((int) (short) 1);
        boolean boolean37 = bigInteger35.isProbablePrime((int) '4');
        short short38 = bigInteger35.shortValueExact();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal44 = bigDecimal40.subtract(bigDecimal43);
        java.math.BigInteger bigInteger45 = bigDecimal44.toBigInteger();
        double double46 = bigInteger45.doubleValue();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        byte byte50 = org.apache.commons.lang3.math.NumberUtils.min(byteArray49);
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) -1, byteArray49);
        java.math.BigInteger bigInteger52 = bigInteger45.gcd(bigInteger51);
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal54 = bigDecimal53.negate();
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal58 = bigDecimal54.subtract(bigDecimal57);
        java.math.BigInteger bigInteger59 = bigDecimal58.toBigInteger();
        double double60 = bigInteger59.doubleValue();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        byte byte64 = org.apache.commons.lang3.math.NumberUtils.min(byteArray63);
        java.math.BigInteger bigInteger65 = new java.math.BigInteger((int) (short) -1, byteArray63);
        java.math.BigInteger bigInteger66 = bigInteger59.gcd(bigInteger65);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal68 = bigDecimal67.negate();
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal72 = bigDecimal68.subtract(bigDecimal71);
        java.math.BigInteger bigInteger73 = bigDecimal72.toBigInteger();
        java.math.BigInteger bigInteger74 = bigInteger65.or(bigInteger73);
        short short75 = bigInteger65.shortValueExact();
        byte[] byteArray78 = new byte[] { (byte) 1 };
        byte byte79 = org.apache.commons.lang3.math.NumberUtils.min(byteArray78);
        java.math.BigInteger bigInteger80 = new java.math.BigInteger((int) (short) -1, byteArray78);
        java.math.BigInteger bigInteger82 = bigInteger80.pow((int) 'a');
        java.math.BigInteger bigInteger84 = bigInteger80.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger85 = bigInteger65.xor(bigInteger84);
        java.math.BigInteger bigInteger86 = bigInteger84.not();
        java.math.BigInteger bigInteger87 = bigInteger52.and(bigInteger86);
        java.math.BigInteger bigInteger88 = bigInteger35.subtract(bigInteger86);
        java.math.BigInteger bigInteger90 = bigInteger35.clearBit((int) 'u');
        java.math.BigInteger bigInteger92 = bigInteger90.clearBit((int) (byte) 1);
        java.math.BigInteger bigInteger93 = bigInteger7.multiply(bigInteger90);
        int int94 = bigInteger7.intValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 1 + "'", byte30 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -2 + "'", short38 == (short) -2);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 1 + "'", byte50 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 1 + "'", byte64 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) -1 + "'", short75 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[1]");
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) 1 + "'", byte79 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en-c", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte2 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow(2);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        double double6 = bigDecimal5.doubleValue();
        java.math.BigInteger bigInteger7 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger9 = bigInteger7.setBit(4);
        boolean boolean10 = bigDecimal4.equals((java.lang.Object) bigInteger9);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        int int13 = bigDecimal12.signum();
        long long14 = bigDecimal12.longValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal12.abs();
        java.math.BigDecimal bigDecimal16 = bigDecimal15.stripTrailingZeros();
        java.math.BigDecimal bigDecimal18 = bigDecimal15.pow((int) (short) 0);
        java.math.BigInteger bigInteger19 = bigDecimal18.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger19.setBit(30);
        java.math.BigInteger bigInteger23 = bigInteger21.setBit(0);
        boolean boolean24 = bigDecimal4.equals((java.lang.Object) bigInteger23);
        boolean boolean26 = bigInteger23.isProbablePrime(52);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = bigInteger4.not();
        java.math.BigInteger bigInteger6 = bigInteger5.not();
        java.lang.String str8 = bigInteger5.toString(1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\uc911\uad6d\uc5b4\uc911\uad6d)", "1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ena_aUS", "italien");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ena_aUS" + "'", str2, "ena_aUS");
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger17 = bigInteger15.pow((int) 'a');
        byte[] byteArray18 = bigInteger15.toByteArray();
        long long19 = bigInteger15.longValueExact();
        java.math.BigInteger bigInteger20 = bigInteger10.or(bigInteger15);
        byte[] byteArray23 = new byte[] { (byte) 1 };
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray23);
        java.math.BigInteger bigInteger25 = new java.math.BigInteger((int) (short) -1, byteArray23);
        java.math.BigInteger bigInteger27 = bigInteger25.pow((int) 'a');
        byte[] byteArray28 = bigInteger25.toByteArray();
        long long29 = bigInteger25.longValueExact();
        java.lang.String str31 = bigInteger25.toString(0);
        int int32 = bigInteger25.intValueExact();
        java.math.BigInteger bigInteger33 = bigInteger20.subtract(bigInteger25);
        java.math.BigInteger bigInteger34 = bigInteger6.min(bigInteger20);
        boolean boolean36 = bigInteger34.testBit(6);
        byte[] byteArray37 = bigInteger34.toByteArray();
        java.lang.String str38 = bigInteger34.toString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1]");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 1 + "'", byte24 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1" + "'", str38, "-1");
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 3, (byte) 34, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587", "German(Germany)", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("eng");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale11 = builder9.build();
        java.lang.String str12 = locale11.getDisplayCountry();
        java.util.Locale.Builder builder13 = builder6.setLocale(locale11);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.setDefault(category14, locale17);
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getVariant();
        java.util.Locale.setDefault(category14, locale20);
        java.util.Locale locale25 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.util.Locale.setDefault(locale25);
        java.lang.String str27 = locale20.getDisplayLanguage(locale25);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clearExtensions();
        java.util.Locale locale31 = builder30.build();
        java.util.Locale.setDefault(category28, locale31);
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale33.getDisplayVariant(locale35);
        java.lang.String str37 = locale35.getDisplayCountry();
        java.util.Locale.setDefault(category28, locale35);
        java.util.Set<java.lang.String> strSet39 = locale35.getUnicodeLocaleKeys();
        java.lang.String str40 = locale20.getDisplayScript(locale35);
        java.util.Locale.Builder builder41 = builder13.setLocale(locale35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder41.setScript("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.FORMAT + "'", category28.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "South Korea" + "'", str37, "South Korea");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("UNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "ENGLISCH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("gbr");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("rbgrbgrbgrbgrbgHindirbgrbgrbgrbgrbg", "0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((long) 'x');
        int int2 = bigDecimal1.intValueExact();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 120 + "'", int2 == 120);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale7 = new java.util.Locale("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        java.lang.String str8 = locale7.getDisplayName();
        java.lang.String str9 = locale5.getDisplayName(locale7);
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale5.getDisplayLanguage(locale10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("           AJ           AJ", locale5);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str8, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it" + "'", str11, "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "           AJ           AJ" + "'", str13, "           AJ           AJ");
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "\u82f1\u6587\u82f1\u56fd)", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Cor\351e du Sud");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.plus();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        double double7 = bigDecimal6.doubleValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal6.movePointLeft((int) (byte) -1);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.add(bigDecimal9);
        java.math.BigDecimal bigDecimal12 = bigDecimal2.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int21 = bigDecimal17.compareTo(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray22 = bigDecimal2.divideAndRemainder(bigDecimal20);
        long long23 = bigDecimal20.longValueExact();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\u30ab\u30ca\u30c0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ko", "united states");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "Italian");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "FRENCH", (java.lang.CharSequence) "CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        double double15 = bigInteger14.doubleValue();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger21 = bigInteger14.gcd(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigInteger bigInteger29 = bigInteger20.or(bigInteger28);
        java.math.BigInteger bigInteger30 = bigInteger6.or(bigInteger28);
        java.lang.String str31 = bigInteger28.toString();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        double double39 = bigInteger38.doubleValue();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger45 = bigInteger38.gcd(bigInteger44);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal47 = bigDecimal46.negate();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal51 = bigDecimal47.subtract(bigDecimal50);
        java.math.BigInteger bigInteger52 = bigDecimal51.toBigInteger();
        java.math.BigInteger bigInteger53 = bigInteger44.or(bigInteger52);
        short short54 = bigInteger44.shortValueExact();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        byte byte58 = org.apache.commons.lang3.math.NumberUtils.min(byteArray57);
        java.math.BigInteger bigInteger59 = new java.math.BigInteger((int) (short) -1, byteArray57);
        java.math.BigInteger bigInteger61 = bigInteger59.pow((int) 'a');
        java.math.BigInteger bigInteger63 = bigInteger59.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger64 = bigInteger44.xor(bigInteger63);
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal66 = bigDecimal65.negate();
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        long long68 = bigDecimal67.longValueExact();
        java.math.BigDecimal bigDecimal69 = bigDecimal67.ulp();
        java.lang.String str70 = bigDecimal67.toString();
        int int71 = bigDecimal65.compareTo(bigDecimal67);
        java.math.BigInteger bigInteger72 = bigDecimal65.toBigInteger();
        java.math.BigInteger bigInteger73 = bigInteger64.gcd(bigInteger72);
        java.math.BigInteger bigInteger74 = bigInteger73.negate();
        java.math.BigInteger bigInteger75 = bigInteger28.gcd(bigInteger74);
        int int76 = bigInteger28.intValueExact();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal78 = bigDecimal77.negate();
        java.math.BigDecimal bigDecimal79 = bigDecimal78.abs();
        int int80 = bigDecimal78.intValueExact();
        java.math.BigInteger bigInteger81 = bigDecimal78.toBigInteger();
        java.math.BigDecimal bigDecimal82 = bigDecimal78.plus();
        long long83 = bigDecimal82.longValue();
        java.math.BigInteger bigInteger84 = bigDecimal82.toBigIntegerExact();
        byte byte85 = bigInteger84.byteValueExact();
        long long86 = bigInteger84.longValue();
        java.math.BigInteger bigInteger87 = bigInteger28.gcd(bigInteger84);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) -1 + "'", short54 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1]");
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 1 + "'", byte58 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L + "'", long68 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "10" + "'", str70, "10");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertTrue("'" + byte85 + "' != '" + (byte) 0 + "'", byte85 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(bigInteger87);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("x", (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiHI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiHI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!" + "'", str2, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiHI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!4HI4!");
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        int int9 = bigInteger6.intValueExact();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray12);
        java.math.BigInteger bigInteger14 = new java.math.BigInteger((int) (short) -1, byteArray12);
        java.math.BigInteger bigInteger16 = bigInteger14.pow((int) 'a');
        byte[] byteArray17 = bigInteger14.toByteArray();
        long long18 = bigInteger14.longValueExact();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray21);
        java.math.BigInteger bigInteger23 = new java.math.BigInteger((int) (short) -1, byteArray21);
        java.math.BigInteger bigInteger25 = bigInteger23.pow((int) 'a');
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger25, (int) (byte) 0);
        java.math.BigInteger bigInteger28 = bigInteger14.divide(bigInteger25);
        byte[] byteArray32 = new byte[] { (byte) 1 };
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger((int) (short) -1, byteArray32);
        java.math.BigInteger bigInteger35 = new java.math.BigInteger(byteArray32);
        byte byte36 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.max(byteArray32);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) 1, byteArray32);
        java.math.BigInteger bigInteger39 = bigInteger38.nextProbablePrime();
        java.math.BigInteger bigInteger40 = bigInteger14.add(bigInteger39);
        java.math.BigInteger bigInteger41 = bigInteger6.and(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1]");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 1 + "'", byte36 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AD AE AF AG AI AL AM AN AO AQ AR AS AT AU AW AX AZ BA BB BD BE BF BG BH BI BJ BL BM BN BO BQ BR BS BT BV BW BY BZ CA CC CD CF CG CH CI CK CL CM CN CO CR CU CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK FM FO FR GA GB GD GE GF GG GH GI GL GM GN GP GQ GR GS GT GU GW GY HK HM HN HR HT HU ID IE IL IM IN IO IQ IR IS IT JE JM JO JP KE KG KH KI KM KN KP KR KW KY KZ LA LB LC LI LK LR LS LT LU LV LY MA MC MD ME MF MG MH MK ML MM MN MO MP MQ MR MS MT MU MV MW MX MY MZ NA NC NE NF NG NI NL NO NP NR NU NZ OM PA PE PF PG PH PK PL PM PN PR PS PT PW PY QA RE RO RS RU RW SA SB SC SD SE SG SH SI SJ SK SL SM SN SO SR SS ST SV SX SY SZ TC TD TF TG TH TJ TK TL TM TN TO TR TT TV TW TZ UA UG UM US UY UZ VA VC VE VG VI VN VU WF WS YE YT ZA ZM ZW", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("eng");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale11 = builder9.build();
        java.lang.String str12 = locale11.getDisplayCountry();
        java.util.Locale.Builder builder13 = builder6.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder6.clearExtensions();
        java.util.Locale locale15 = builder6.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ENGLISCH (VEREINIGTES K\326NIGREICH)", "ENG                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("English (United Kingdom)", 'u', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English (United Kingdom)" + "'", str3, "English (United Kingdom)");
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(bigInteger48);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal51 = bigDecimal50.negate();
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal55 = bigDecimal51.subtract(bigDecimal54);
        java.math.BigInteger bigInteger56 = bigDecimal55.toBigInteger();
        double double57 = bigInteger56.doubleValue();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        byte byte61 = org.apache.commons.lang3.math.NumberUtils.min(byteArray60);
        java.math.BigInteger bigInteger62 = new java.math.BigInteger((int) (short) -1, byteArray60);
        java.math.BigInteger bigInteger63 = bigInteger56.gcd(bigInteger62);
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal65 = bigDecimal64.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal69 = bigDecimal65.subtract(bigDecimal68);
        java.math.BigInteger bigInteger70 = bigDecimal69.toBigInteger();
        java.math.BigInteger bigInteger71 = bigInteger62.or(bigInteger70);
        short short72 = bigInteger62.shortValueExact();
        byte[] byteArray75 = new byte[] { (byte) 1 };
        byte byte76 = org.apache.commons.lang3.math.NumberUtils.min(byteArray75);
        java.math.BigInteger bigInteger77 = new java.math.BigInteger((int) (short) -1, byteArray75);
        java.math.BigInteger bigInteger79 = bigInteger77.pow((int) 'a');
        java.math.BigInteger bigInteger81 = bigInteger77.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger82 = bigInteger62.xor(bigInteger81);
        java.math.BigInteger bigInteger83 = bigInteger81.not();
        java.math.BigInteger bigInteger84 = bigInteger48.or(bigInteger83);
        java.math.BigInteger bigInteger86 = bigInteger48.shiftLeft(2);
        java.math.BigDecimal bigDecimal87 = java.math.BigDecimal.ZERO;
        double double88 = bigDecimal87.doubleValue();
        java.math.BigInteger bigInteger89 = bigDecimal87.toBigInteger();
        java.math.BigInteger bigInteger90 = bigInteger86.xor(bigInteger89);
        java.math.BigInteger bigInteger91 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger92 = bigInteger90.gcd(bigInteger91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1]");
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 1 + "'", byte61 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) -1 + "'", short72 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1]");
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 1 + "'", byte76 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 296L, 301L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 301L + "'", long3 == 301L);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("D", "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", (int) (short) 1024);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str2, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.scaleByPowerOfTen(34);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        double double13 = bigInteger12.doubleValue();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger19 = bigInteger12.gcd(bigInteger18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal25.toBigInteger();
        java.math.BigInteger bigInteger27 = bigInteger18.or(bigInteger26);
        short short28 = bigInteger18.shortValueExact();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger35 = bigInteger33.pow((int) 'a');
        java.math.BigInteger bigInteger37 = bigInteger33.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger38 = bigInteger18.xor(bigInteger37);
        java.math.BigInteger bigInteger40 = bigInteger37.clearBit(4);
        double double41 = bigInteger37.doubleValue();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger54.or(bigInteger62);
        byte[] byteArray64 = bigInteger63.toByteArray();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger(byteArray66);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger68);
        short short70 = bigInteger68.shortValueExact();
        int int71 = bigInteger68.bitLength();
        java.math.BigInteger[] bigIntegerArray72 = bigInteger63.divideAndRemainder(bigInteger68);
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal74 = bigDecimal73.negate();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal78 = bigDecimal74.subtract(bigDecimal77);
        java.math.BigInteger bigInteger79 = bigDecimal78.toBigInteger();
        double double80 = bigInteger79.doubleValue();
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger86 = bigInteger79.gcd(bigInteger85);
        java.math.BigInteger bigInteger87 = bigInteger68.andNot(bigInteger85);
        java.math.BigInteger bigInteger88 = bigInteger37.xor(bigInteger85);
        boolean boolean89 = bigDecimal5.equals((java.lang.Object) bigInteger37);
        java.math.BigDecimal bigDecimal91 = java.math.BigDecimal.valueOf((long) 1);
        java.math.BigDecimal bigDecimal92 = bigDecimal5.max(bigDecimal91);
        java.lang.String str93 = bigDecimal5.toEngineeringString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -1 + "'", short28 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1]");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-2.0d) + "'", double41 == (-2.0d));
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 1 + "'", short70 == (short) 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray72);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[1]");
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(bigDecimal91);
        org.junit.Assert.assertNotNull(bigDecimal92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "0.00E+36" + "'", str93, "0.00E+36");
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger8 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger9 = bigInteger8.not();
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = bigInteger9.and(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("EN-GB", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0" + "'", str2, "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0");
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Japanese", "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) (short) 117, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u6cd5\u6587TWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 3, (byte) -2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (byte) 34);
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Koreanisch (S\374dkorea)", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\u6cd5\u6587TWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTW", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(4.0f, 99.0f, 33.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\u671d\u9c9c\u6587\u97e9\u56fd)");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'u');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("UNDUNDUNDUNDUNDUNDUNDUNDUNDUND", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fdu)" + "'", str4, "\u671d\u9c9c\u6587\u97e9\u56fdu)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(byteArray13);
        boolean boolean17 = bigInteger4.equals((java.lang.Object) byteArray13);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger(byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray21);
        java.math.BigInteger bigInteger23 = new java.math.BigInteger((int) (short) -1, byteArray21);
        java.math.BigInteger bigInteger25 = bigInteger23.pow((int) 'a');
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        double double33 = bigInteger32.doubleValue();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger39 = bigInteger32.gcd(bigInteger38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal45 = bigDecimal41.subtract(bigDecimal44);
        java.math.BigInteger bigInteger46 = bigDecimal45.toBigInteger();
        java.math.BigInteger bigInteger47 = bigInteger38.or(bigInteger46);
        java.math.BigInteger bigInteger48 = bigInteger25.min(bigInteger47);
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        byte[] byteArray56 = bigInteger53.toByteArray();
        long long57 = bigInteger53.longValueExact();
        java.lang.String str59 = bigInteger53.toString(0);
        byte[] byteArray62 = new byte[] { (byte) 1 };
        byte byte63 = org.apache.commons.lang3.math.NumberUtils.min(byteArray62);
        java.math.BigInteger bigInteger64 = new java.math.BigInteger((int) (short) -1, byteArray62);
        java.math.BigInteger bigInteger65 = bigInteger53.and(bigInteger64);
        java.math.BigInteger bigInteger66 = bigInteger64.abs();
        java.math.BigInteger bigInteger67 = bigInteger25.max(bigInteger64);
        java.math.BigInteger bigInteger68 = bigInteger18.or(bigInteger25);
        int int69 = bigInteger18.bitLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-1" + "'", str59, "-1");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1]");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 1 + "'", byte63 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\uc774\ud0c8\ub9ac\uc544\uc5b4", (-18), "\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str3, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        int[] intArray1 = new int[] { (byte) 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("frz-C aaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                  ", 3, (-33));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        long long3 = bigDecimal0.longValueExact();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("z-CN");
        boolean boolean6 = bigDecimal0.equals((java.lang.Object) strArray5);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal10 = bigDecimal9.plus();
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        int int12 = bigDecimal10.signum();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.plus();
        float float14 = bigDecimal10.floatValue();
        short short15 = bigDecimal10.shortValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal0.max(bigDecimal10);
        int int17 = bigDecimal16.intValueExact();
        java.math.BigDecimal bigDecimal19 = bigDecimal16.setScale(28);
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal((double) 1L);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.lang.String str28 = bigDecimal23.toPlainString();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        double double30 = bigDecimal29.doubleValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal29.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger33 = bigDecimal29.unscaledValue();
        long long34 = bigDecimal29.longValue();
        java.math.BigDecimal bigDecimal35 = bigDecimal23.subtract(bigDecimal29);
        double double36 = bigDecimal29.doubleValue();
        java.math.BigDecimal bigDecimal37 = bigDecimal21.min(bigDecimal29);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte40 = bigDecimal39.byteValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal39.pow(2);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.TEN;
        long long46 = bigDecimal45.longValueExact();
        java.math.BigDecimal bigDecimal47 = bigDecimal45.ulp();
        java.lang.String str48 = bigDecimal45.toString();
        int int49 = bigDecimal43.compareTo(bigDecimal45);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal53 = bigDecimal45.divide(bigDecimal51, (int) (short) 1);
        java.math.BigDecimal bigDecimal54 = bigDecimal42.add(bigDecimal45);
        java.math.BigDecimal bigDecimal55 = bigDecimal29.subtract(bigDecimal54);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal58 = bigDecimal19.divide(bigDecimal55, 5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "10" + "'", str48, "10");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        java.util.Locale locale10 = new java.util.Locale("\uc5b4\uad6d\ud55c", "\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd");
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale.Builder builder13 = builder2.setLocale(locale11);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\uc5b4\uad6d\ud55c\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\uc5b4\uad6d\ud55c\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd)" + "'", str12, "\uc5b4\uad6d\ud55c\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(bigInteger6);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = bigDecimal9.min(bigDecimal18);
        java.math.BigDecimal bigDecimal22 = bigDecimal21.ulp();
        long long23 = bigDecimal22.longValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("kokokanglais (Royaume-Uni)kokoko", "hi!uuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger((-10), random1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: numBits must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u65e5\u672c\u8a9e", 35, (int) (short) -16960);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigInteger bigInteger11 = bigDecimal10.toBigInteger();
        double double12 = bigInteger11.doubleValue();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger18 = bigInteger11.gcd(bigInteger17);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal20 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal24 = bigDecimal20.subtract(bigDecimal23);
        java.math.BigInteger bigInteger25 = bigDecimal24.toBigInteger();
        java.math.BigInteger bigInteger26 = bigInteger17.or(bigInteger25);
        short short27 = bigInteger17.shortValueExact();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger34 = bigInteger32.pow((int) 'a');
        java.math.BigInteger bigInteger36 = bigInteger32.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger37 = bigInteger17.xor(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        long long41 = bigDecimal40.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.lang.String str43 = bigDecimal40.toString();
        int int44 = bigDecimal38.compareTo(bigDecimal40);
        java.math.BigInteger bigInteger45 = bigDecimal38.toBigInteger();
        java.math.BigInteger bigInteger46 = bigInteger37.gcd(bigInteger45);
        java.math.BigInteger bigInteger47 = bigInteger4.gcd(bigInteger46);
        java.math.BigDecimal bigDecimal48 = new java.math.BigDecimal(bigInteger47);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.TEN;
        long long53 = bigDecimal52.longValueExact();
        java.math.BigDecimal bigDecimal54 = bigDecimal52.ulp();
        java.math.BigDecimal bigDecimal56 = bigDecimal54.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal57 = bigDecimal54.plus();
        java.math.BigDecimal[] bigDecimalArray58 = bigDecimal51.divideAndRemainder(bigDecimal57);
        java.math.BigDecimal bigDecimal60 = bigDecimal57.movePointRight((int) (byte) -33);
        int int61 = bigDecimal48.compareTo(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimalArray58);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#_eng");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 'u', 0);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(bigInteger44);
        java.math.BigDecimal bigDecimal51 = new java.math.BigDecimal(bigInteger44, (int) (byte) 0);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) '#', 120);
        int int55 = bigDecimal54.signum();
        java.lang.String str56 = bigDecimal54.toPlainString();
        java.math.BigDecimal bigDecimal57 = bigDecimal51.remainder(bigDecimal54);
        java.math.BigDecimal bigDecimal59 = bigDecimal54.movePointRight((int) (short) 0);
        java.math.BigDecimal bigDecimal61 = bigDecimal54.movePointRight((int) (byte) 34);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000035" + "'", str56, "0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000035");
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal61);
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        double double22 = bigInteger21.doubleValue();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger28 = bigInteger21.gcd(bigInteger27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        java.math.BigInteger bigInteger36 = bigInteger27.or(bigInteger35);
        short short37 = bigInteger27.shortValueExact();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        byte byte41 = org.apache.commons.lang3.math.NumberUtils.min(byteArray40);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger((int) (short) -1, byteArray40);
        java.math.BigInteger bigInteger44 = bigInteger42.pow((int) 'a');
        java.math.BigInteger bigInteger46 = bigInteger42.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger47 = bigInteger27.xor(bigInteger46);
        java.math.BigInteger bigInteger48 = bigInteger46.not();
        java.math.BigInteger bigInteger49 = bigInteger14.min(bigInteger46);
        int int50 = bigInteger14.bitLength();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal52 = bigDecimal51.negate();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal56 = bigDecimal52.subtract(bigDecimal55);
        java.math.BigInteger bigInteger57 = bigDecimal56.toBigInteger();
        double double58 = bigInteger57.doubleValue();
        byte[] byteArray61 = new byte[] { (byte) 1 };
        byte byte62 = org.apache.commons.lang3.math.NumberUtils.min(byteArray61);
        java.math.BigInteger bigInteger63 = new java.math.BigInteger((int) (short) -1, byteArray61);
        java.math.BigInteger bigInteger64 = bigInteger57.gcd(bigInteger63);
        java.math.BigInteger bigInteger65 = bigInteger63.negate();
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.ZERO;
        double double67 = bigDecimal66.doubleValue();
        java.math.BigInteger bigInteger68 = bigDecimal66.toBigInteger();
        byte[] byteArray71 = new byte[] { (byte) 1 };
        byte byte72 = org.apache.commons.lang3.math.NumberUtils.min(byteArray71);
        java.math.BigInteger bigInteger73 = new java.math.BigInteger((int) (short) -1, byteArray71);
        java.math.BigInteger bigInteger75 = bigInteger73.pow((int) 'a');
        byte[] byteArray76 = bigInteger73.toByteArray();
        long long77 = bigInteger73.longValueExact();
        java.math.BigInteger bigInteger78 = bigInteger68.or(bigInteger73);
        byte[] byteArray81 = new byte[] { (byte) 1 };
        byte byte82 = org.apache.commons.lang3.math.NumberUtils.min(byteArray81);
        java.math.BigInteger bigInteger83 = new java.math.BigInteger((int) (short) -1, byteArray81);
        java.math.BigInteger bigInteger85 = bigInteger83.pow((int) 'a');
        byte[] byteArray86 = bigInteger83.toByteArray();
        long long87 = bigInteger83.longValueExact();
        java.lang.String str89 = bigInteger83.toString(0);
        int int90 = bigInteger83.intValueExact();
        java.math.BigInteger bigInteger91 = bigInteger78.subtract(bigInteger83);
        java.math.BigInteger bigInteger92 = bigInteger63.subtract(bigInteger91);
        java.math.BigInteger bigInteger93 = bigInteger14.gcd(bigInteger63);
        java.math.BigInteger bigInteger95 = bigInteger63.shiftLeft(33);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1]");
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 1 + "'", byte62 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1]");
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) 1 + "'", byte72 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[1]");
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 1 + "'", byte82 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[-1]");
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "-1" + "'", str89, "-1");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertNotNull(bigInteger95);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                               ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                              AJ           AJ                                    ", 13, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              AJ           AJ                                    " + "'", str3, "                                              AJ           AJ                                    ");
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal3 = bigDecimal0.abs();
        long long4 = bigDecimal0.longValue();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigInteger bigInteger11 = bigDecimal10.toBigInteger();
        double double12 = bigInteger11.doubleValue();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger18 = bigInteger11.gcd(bigInteger17);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal20 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal24 = bigDecimal20.subtract(bigDecimal23);
        java.math.BigInteger bigInteger25 = bigDecimal24.toBigInteger();
        java.math.BigInteger bigInteger26 = bigInteger17.or(bigInteger25);
        java.math.BigInteger bigInteger28 = bigInteger25.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        double double36 = bigInteger35.doubleValue();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        byte byte40 = org.apache.commons.lang3.math.NumberUtils.min(byteArray39);
        java.math.BigInteger bigInteger41 = new java.math.BigInteger((int) (short) -1, byteArray39);
        java.math.BigInteger bigInteger42 = bigInteger35.gcd(bigInteger41);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal44.subtract(bigDecimal47);
        java.math.BigInteger bigInteger49 = bigDecimal48.toBigInteger();
        java.math.BigInteger bigInteger50 = bigInteger41.or(bigInteger49);
        java.math.BigInteger bigInteger52 = bigInteger49.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger53 = bigInteger28.max(bigInteger49);
        java.math.BigInteger bigInteger55 = bigInteger49.shiftLeft((-1));
        java.math.BigInteger bigInteger57 = bigInteger49.shiftRight(5);
        java.lang.String str59 = bigInteger57.toString((int) '4');
        java.math.BigInteger bigInteger60 = bigInteger57.abs();
        java.math.BigInteger bigInteger62 = bigInteger57.pow((int) (short) 100);
        java.math.BigDecimal bigDecimal63 = new java.math.BigDecimal(bigInteger57);
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal65 = bigDecimal64.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal69 = bigDecimal65.subtract(bigDecimal68);
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal71 = bigDecimal68.min(bigDecimal70);
        java.math.BigDecimal bigDecimal73 = bigDecimal71.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal74 = bigDecimal63.add(bigDecimal71);
        java.math.MathContext mathContext75 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal76 = bigDecimal0.add(bigDecimal71, mathContext75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1]");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 1 + "'", byte40 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0" + "'", str59, "0");
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal74);
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        java.math.BigDecimal bigDecimal7 = bigDecimal4.pow((int) (short) 0);
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigInteger();
        java.math.BigInteger bigInteger10 = bigInteger8.setBit(30);
        java.math.BigInteger bigInteger12 = bigInteger10.setBit(0);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        double double14 = bigDecimal13.doubleValue();
        java.math.BigInteger bigInteger15 = bigDecimal13.toBigInteger();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        byte[] byteArray23 = bigInteger20.toByteArray();
        long long24 = bigInteger20.longValueExact();
        java.math.BigInteger bigInteger25 = bigInteger15.or(bigInteger20);
        byte[] byteArray28 = new byte[] { (byte) 1 };
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        java.math.BigInteger bigInteger30 = new java.math.BigInteger((int) (short) -1, byteArray28);
        java.math.BigInteger bigInteger32 = bigInteger30.pow((int) 'a');
        java.math.BigInteger bigInteger34 = bigInteger30.shiftLeft((int) (short) 1);
        boolean boolean36 = bigInteger34.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger37 = bigInteger20.divide(bigInteger34);
        long long38 = bigInteger20.longValue();
        byte byte39 = bigInteger20.byteValueExact();
        int int40 = bigInteger20.intValue();
        int int41 = bigInteger10.compareTo(bigInteger20);
        java.math.BigInteger bigInteger42 = bigInteger20.abs();
        java.math.MathContext mathContext44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(bigInteger20, (int) (short) 1024, mathContext44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) -1 + "'", byte39 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(bigInteger42);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((long) 31, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        java.util.Random random1 = null;
        java.math.BigInteger bigInteger2 = new java.math.BigInteger((int) (short) 0, random1);
        java.lang.String str4 = bigInteger2.toString(2);
        java.math.MathContext mathContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(bigInteger2, 30, mathContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("en", "undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("fra ", (-10));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra " + "'", str2, "fra ");
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("fr-frdeutschland", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-frdeutschland" + "'", str2, "fr-frdeutschland");
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger10 = bigInteger8.flipBit(1);
        java.math.BigInteger bigInteger11 = bigInteger8.abs();
        java.lang.String str13 = bigInteger8.toString(2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-10" + "'", str13, "-10");
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-z-CN", "            NC-z");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-z-CN" + "'", str2, "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-z-CN");
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale5 = new java.util.Locale("JA", "                                                                                                 ");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale5.getDisplayLanguage(locale6);
        java.lang.String str10 = locale6.getDisplayVariant();
        java.util.Locale.Builder builder11 = builder1.setLocale(locale6);
        java.util.Locale.Builder builder12 = builder1.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "ja_                                                                                                 ");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanisch" + "'", str9, "Japanisch");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaUNITED STATESaaaaaaaaaa", "3.01E-50");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("h", (int) (byte) 34, (int) (short) 1024);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("frazho", "chn");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("france", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "frazho" + "'", str4, "frazho");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u671d\u9c9c\u6587\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u671d\u9c9c\u6587(", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("eng");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        java.lang.String str9 = locale6.getLanguage();
        java.lang.String str10 = locale6.getCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FR" + "'", str10, "FR");
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.math.BigInteger bigInteger8 = new java.math.BigInteger(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)", "-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "x");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("hi");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (???????? (??????)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(31, 97, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Chinese");
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.util.Locale.setDefault(locale7);
        java.util.Locale locale11 = locale7.stripExtensions();
        java.lang.String str12 = locale6.getDisplayVariant(locale7);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale17 = new java.util.Locale("United States", "", "10");
        java.lang.String str18 = locale17.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale17);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal25.toBigInteger();
        double double27 = bigInteger26.doubleValue();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger33 = bigInteger26.gcd(bigInteger32);
        java.math.BigInteger bigInteger34 = bigInteger32.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        double double42 = bigInteger41.doubleValue();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        byte byte46 = org.apache.commons.lang3.math.NumberUtils.min(byteArray45);
        java.math.BigInteger bigInteger47 = new java.math.BigInteger((int) (short) -1, byteArray45);
        java.math.BigInteger bigInteger48 = bigInteger41.gcd(bigInteger47);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal54 = bigDecimal50.subtract(bigDecimal53);
        java.math.BigInteger bigInteger55 = bigDecimal54.toBigInteger();
        java.math.BigInteger bigInteger56 = bigInteger47.or(bigInteger55);
        short short57 = bigInteger47.shortValueExact();
        byte byte58 = bigInteger47.byteValueExact();
        java.math.BigInteger bigInteger59 = bigInteger32.and(bigInteger47);
        java.util.Locale locale60 = java.util.Locale.UK;
        boolean boolean61 = bigInteger59.equals((java.lang.Object) locale60);
        java.util.Locale.setDefault(category0, locale60);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "chinese");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale17.toString(), "united states__10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1]");
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 1 + "'", byte46 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) -1 + "'", short57 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) -1 + "'", byte58 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("en-us", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("\uad6d\ubbfc\ud55c\ub300UNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???????????UND\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Koreanisch(S\374dkorea)Koreanisch(S\374dkorea)Koreanisch(S\374dkorea)Koreanisch(S\374dkorea)Koreanisch(S\374dkEN-US", 45, 563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((int) (short) -1, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale0.getDisplayName(locale4);
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayLanguage(locale6);
        java.lang.String str9 = locale4.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str5, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str7, "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Korean" + "'", str8, "Korean");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u671d\u9c9c\u6587" + "'", str9, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("-1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("           AJ", 301.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 301.0d + "'", double2 == 301.0d);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(")aeroK htuoS( naeroK", "\u671d\u9c9c\u6587\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u671d\u9c9c\u6587 (");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        double double22 = bigInteger21.doubleValue();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger28 = bigInteger21.gcd(bigInteger27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        java.math.BigInteger bigInteger36 = bigInteger27.or(bigInteger35);
        short short37 = bigInteger27.shortValueExact();
        byte byte38 = bigInteger27.byteValueExact();
        java.math.BigInteger bigInteger39 = bigInteger12.and(bigInteger27);
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger46 = bigInteger44.pow((int) 'a');
        java.math.BigInteger bigInteger48 = bigInteger44.shiftLeft((int) (short) 1);
        int int49 = bigInteger48.intValueExact();
        java.math.BigInteger bigInteger50 = bigInteger48.abs();
        java.math.BigInteger bigInteger51 = bigInteger27.multiply(bigInteger50);
        java.math.BigInteger bigInteger52 = bigInteger27.negate();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.ZERO;
        double double54 = bigDecimal53.doubleValue();
        java.math.BigInteger bigInteger55 = bigDecimal53.toBigInteger();
        java.math.BigInteger bigInteger57 = bigInteger55.setBit(4);
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        double double59 = bigDecimal58.doubleValue();
        java.math.BigInteger bigInteger60 = bigDecimal58.toBigInteger();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        byte byte64 = org.apache.commons.lang3.math.NumberUtils.min(byteArray63);
        java.math.BigInteger bigInteger65 = new java.math.BigInteger((int) (short) -1, byteArray63);
        java.math.BigInteger bigInteger67 = bigInteger65.pow((int) 'a');
        byte[] byteArray68 = bigInteger65.toByteArray();
        long long69 = bigInteger65.longValueExact();
        java.math.BigInteger bigInteger70 = bigInteger60.or(bigInteger65);
        java.math.BigInteger bigInteger71 = bigInteger55.multiply(bigInteger70);
        java.math.BigInteger bigInteger72 = bigInteger52.multiply(bigInteger55);
        java.math.BigInteger bigInteger73 = bigInteger72.negate();
        boolean boolean75 = bigInteger72.testBit(0);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2) + "'", int49 == (-2));
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 1 + "'", byte64 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[-1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Englisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Englisch" + "'", str1, "Englisch");
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        double double5 = bigDecimal4.doubleValue();
        java.math.BigInteger bigInteger6 = bigDecimal4.toBigInteger();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray9);
        java.math.BigInteger bigInteger11 = new java.math.BigInteger((int) (short) -1, byteArray9);
        java.math.BigInteger bigInteger13 = bigInteger11.pow((int) 'a');
        byte[] byteArray14 = bigInteger11.toByteArray();
        long long15 = bigInteger11.longValueExact();
        java.math.BigInteger bigInteger16 = bigInteger6.or(bigInteger11);
        byte byte17 = bigInteger11.byteValueExact();
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(bigInteger11, (int) (byte) 0);
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(bigInteger11, (int) '#');
        java.math.BigDecimal bigDecimal22 = bigDecimal0.max(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.TEN;
        long long24 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.ulp();
        java.lang.String str26 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.TEN;
        long long28 = bigDecimal27.longValueExact();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        double double30 = bigDecimal29.doubleValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal29.movePointLeft((int) (byte) -1);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal27.add(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal23.add(bigDecimal34);
        java.math.BigDecimal bigDecimal37 = bigDecimal35.pow((int) '#');
        java.math.BigDecimal bigDecimal38 = bigDecimal0.min(bigDecimal37);
        java.math.BigDecimal bigDecimal40 = bigDecimal37.movePointLeft((int) (short) 10);
        java.math.RoundingMode roundingMode42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal43 = bigDecimal37.setScale((int) (byte) 100, roundingMode42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal40);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf((long) 35);
        char[] charArray10 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray10);
        boolean boolean13 = bigInteger1.equals((java.lang.Object) charArray10);
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger20 = bigInteger18.pow((int) 'a');
        int int21 = bigInteger20.bitCount();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        double double29 = bigInteger28.doubleValue();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger((int) (short) -1, byteArray32);
        java.math.BigInteger bigInteger35 = bigInteger28.gcd(bigInteger34);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal41 = bigDecimal37.subtract(bigDecimal40);
        java.math.BigInteger bigInteger42 = bigDecimal41.toBigInteger();
        java.math.BigInteger bigInteger43 = bigInteger34.or(bigInteger42);
        short short44 = bigInteger34.shortValueExact();
        int int45 = bigInteger34.getLowestSetBit();
        long long46 = bigInteger34.longValueExact();
        java.math.BigInteger bigInteger47 = bigInteger20.divide(bigInteger34);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal49 = bigDecimal48.negate();
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal53 = bigDecimal49.subtract(bigDecimal52);
        java.math.BigInteger bigInteger54 = bigDecimal53.toBigInteger();
        java.math.BigInteger bigInteger55 = bigInteger54.negate();
        java.math.BigInteger bigInteger57 = bigInteger55.flipBit((int) (short) 0);
        float float58 = bigInteger57.floatValue();
        java.math.BigInteger bigInteger59 = bigInteger1.modPow(bigInteger47, bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) -1 + "'", short44 == (short) -1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 1.0f + "'", float58 == 1.0f);
        org.junit.Assert.assertNotNull(bigInteger59);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        long long3 = bigDecimal0.longValueExact();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("z-CN");
        boolean boolean6 = bigDecimal0.equals((java.lang.Object) strArray5);
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal((int) 'x');
        java.math.RoundingMode roundingMode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = bigDecimal0.divide(bigDecimal8, (-5), roundingMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setUnicodeLocaleKeyword("iH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RF-r");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: iH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.setRegion("US");
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("", locale9);
        java.util.Set<java.lang.Character> charSet11 = locale9.getExtensionKeys();
        java.util.Locale.Builder builder12 = builder3.setLocale(locale9);
        java.util.Locale.Builder builder14 = builder3.setVariant("");
        java.util.Locale.Builder builder15 = builder3.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", "CN  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((int) (byte) 1, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(6L);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = bigDecimal1.pow((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Invalid operation");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        char[] charArray10 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Enhinh", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "En-US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("SETATSxDETINU", (int) (byte) -2, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SETATSxDETINU" + "'", str3, "SETATSxDETINU");
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList17);
        java.lang.String str20 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'x');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\u1103\u1169\u11a8\u110b\u1175\u11af)" + "'", str1, "\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\u1103\u1169\u11a8\u110b\u1175\u11af)");
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((long) 13);
        java.math.MathContext mathContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = bigDecimal1.round(mathContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        int int23 = bigInteger12.getLowestSetBit();
        long long24 = bigInteger12.longValue();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigInteger bigInteger31 = bigDecimal30.toBigInteger();
        java.math.BigInteger bigInteger32 = bigInteger31.negate();
        java.math.BigInteger bigInteger33 = bigInteger12.gcd(bigInteger31);
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger40 = bigInteger38.pow((int) 'a');
        byte[] byteArray41 = bigInteger38.toByteArray();
        long long42 = bigInteger38.longValueExact();
        java.lang.String str44 = bigInteger38.toString(0);
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger50 = new java.math.BigInteger(byteArray47);
        boolean boolean51 = bigInteger38.equals((java.lang.Object) byteArray47);
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal53 = bigDecimal52.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal57 = bigDecimal53.subtract(bigDecimal56);
        java.math.BigInteger bigInteger58 = bigDecimal57.toBigInteger();
        double double59 = bigInteger58.doubleValue();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        byte byte63 = org.apache.commons.lang3.math.NumberUtils.min(byteArray62);
        java.math.BigInteger bigInteger64 = new java.math.BigInteger((int) (short) -1, byteArray62);
        java.math.BigInteger bigInteger65 = bigInteger58.gcd(bigInteger64);
        java.math.BigInteger bigInteger66 = bigInteger38.and(bigInteger64);
        java.math.BigInteger bigInteger67 = bigInteger33.max(bigInteger64);
        int int68 = bigInteger33.intValueExact();
        boolean boolean70 = bigInteger33.isProbablePrime((int) (short) -5);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-1" + "'", str44, "-1");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 1 + "'", byte48 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1]");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 1 + "'", byte63 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???South Korea  ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???    ???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("DE", (byte) 34);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 34 + "'", byte2 == (byte) 34);
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("China");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "China" + "'", str1, "China");
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.lang.String str3 = bigDecimal0.toPlainString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        int int7 = bigDecimal6.intValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal0.max(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal12 = bigDecimal10.min(bigDecimal11);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal18 = bigDecimal14.subtract(bigDecimal17);
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal11.divideAndRemainder(bigDecimal17);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal27 = bigDecimal24.min(bigDecimal26);
        java.math.BigDecimal bigDecimal28 = bigDecimal17.divideToIntegralValue(bigDecimal27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.TEN;
        long long32 = bigDecimal31.longValueExact();
        java.math.BigDecimal bigDecimal33 = bigDecimal31.ulp();
        java.lang.String str34 = bigDecimal31.toString();
        int int35 = bigDecimal29.compareTo(bigDecimal31);
        java.math.BigInteger bigInteger36 = bigDecimal29.toBigInteger();
        java.math.BigDecimal bigDecimal37 = bigDecimal29.ulp();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal41 = bigDecimal39.min(bigDecimal40);
        int int42 = bigDecimal29.compareTo(bigDecimal41);
        int int43 = bigDecimal28.compareTo(bigDecimal41);
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte46 = bigDecimal45.byteValueExact();
        java.math.BigDecimal bigDecimal48 = bigDecimal45.pow(2);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.TEN;
        long long52 = bigDecimal51.longValueExact();
        java.math.BigDecimal bigDecimal53 = bigDecimal51.ulp();
        java.lang.String str54 = bigDecimal51.toString();
        int int55 = bigDecimal49.compareTo(bigDecimal51);
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal59 = bigDecimal51.divide(bigDecimal57, (int) (short) 1);
        java.math.BigDecimal bigDecimal60 = bigDecimal48.add(bigDecimal51);
        java.math.BigDecimal bigDecimal61 = bigDecimal41.divideToIntegralValue(bigDecimal51);
        java.lang.String str62 = bigDecimal41.toString();
        long long63 = bigDecimal41.longValue();
        java.math.BigDecimal bigDecimal64 = bigDecimal8.add(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10" + "'", str34, "10");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 0 + "'", byte46 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L + "'", long52 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "10" + "'", str54, "10");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0" + "'", str62, "0");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal64);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow((int) (byte) 1);
        java.math.BigInteger bigInteger5 = bigDecimal4.unscaledValue();
        java.lang.String str7 = bigInteger5.toString((int) '4');
        java.math.BigInteger bigInteger8 = bigInteger5.negate();
        java.math.BigInteger bigInteger10 = bigInteger5.shiftRight((int) (byte) -33);
        boolean boolean12 = bigInteger5.isProbablePrime(120);
        int int13 = bigInteger5.signum();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\ud504\ub791\uc2a4\uc5b4-1.0", (int) (byte) 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u56fd\u82f1" + "'", str1, "\u56fd\u82f1");
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        int int7 = bigInteger6.bitCount();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        double double15 = bigInteger14.doubleValue();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger21 = bigInteger14.gcd(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigInteger bigInteger29 = bigInteger20.or(bigInteger28);
        short short30 = bigInteger20.shortValueExact();
        int int31 = bigInteger20.getLowestSetBit();
        long long32 = bigInteger20.longValueExact();
        java.math.BigInteger bigInteger33 = bigInteger6.divide(bigInteger20);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal39 = bigDecimal35.subtract(bigDecimal38);
        java.math.BigInteger bigInteger40 = bigDecimal39.toBigInteger();
        double double41 = bigInteger40.doubleValue();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        byte byte45 = org.apache.commons.lang3.math.NumberUtils.min(byteArray44);
        java.math.BigInteger bigInteger46 = new java.math.BigInteger((int) (short) -1, byteArray44);
        java.math.BigInteger bigInteger47 = bigInteger40.gcd(bigInteger46);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal49 = bigDecimal48.negate();
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal53 = bigDecimal49.subtract(bigDecimal52);
        java.math.BigInteger bigInteger54 = bigDecimal53.toBigInteger();
        java.math.BigInteger bigInteger55 = bigInteger46.or(bigInteger54);
        double double56 = bigInteger55.doubleValue();
        java.math.BigInteger bigInteger57 = bigInteger33.andNot(bigInteger55);
        int int58 = bigInteger33.getLowestSetBit();
        java.math.BigDecimal bigDecimal60 = new java.math.BigDecimal(bigInteger33, 299);
        java.math.BigDecimal bigDecimal61 = new java.math.BigDecimal(bigInteger33);
        java.math.BigDecimal bigDecimal62 = bigDecimal61.ulp();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 1 + "'", byte45 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(bigDecimal62);
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        char[] charArray12 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "United States", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "jpn", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuuuENGuuuuuuuuuuuuuuuu", charArray12);
        java.math.MathContext mathContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(charArray12, 99, 8, mathContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "englisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("z-CN");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("CAN", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\uc911\uad6d\uc5b4\uc911\uad6d)", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '#');
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("chinese", strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0.0000000000000000000000000000000001", strArray4, strArray11);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("zh-TW", "chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("japanese", strArray11, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str13, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0000000000000000000000000000000001" + "'", str15, "0.0000000000000000000000000000000001");
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale0.getDisplayScript(locale3);
        java.lang.String str7 = locale0.getLanguage();
        java.lang.String str8 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fr" + "'", str8, "fr");
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte2 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow(2);
        long long5 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((-2.0d));
        short short9 = bigDecimal8.shortValueExact();
        java.math.BigDecimal bigDecimal10 = bigDecimal6.max(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.negate();
        java.lang.String str16 = bigDecimal15.toEngineeringString();
        java.math.BigDecimal bigDecimal17 = bigDecimal12.multiply(bigDecimal15);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.movePointRight(100);
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger26 = bigInteger24.pow((int) 'a');
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(bigInteger26, (int) (byte) 0);
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = locale29.getISO3Language();
        boolean boolean31 = bigDecimal28.equals((java.lang.Object) str30);
        java.math.BigDecimal bigDecimal34 = bigDecimal15.divide(bigDecimal28, (int) (short) 100, (int) (short) 1);
        java.math.MathContext mathContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal36 = bigDecimal10.subtract(bigDecimal34, mathContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -2 + "'", short9 == (short) -2);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bigDecimal34);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((-2.0d));
        java.math.BigInteger bigInteger2 = bigDecimal1.toBigIntegerExact();
        int int3 = bigDecimal1.scale();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        int int6 = bigDecimal5.signum();
        long long7 = bigDecimal5.longValue();
        java.math.BigDecimal bigDecimal8 = bigDecimal5.abs();
        java.math.BigDecimal bigDecimal9 = bigDecimal8.stripTrailingZeros();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.pow(10);
        java.math.BigDecimal bigDecimal12 = bigDecimal1.max(bigDecimal11);
        java.math.MathContext mathContext14 = null;
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal((double) 0, mathContext14);
        java.math.BigDecimal bigDecimal16 = bigDecimal11.add(bigDecimal15);
        int int17 = bigDecimal16.signum();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.negate();
        java.math.BigDecimal bigDecimal27 = bigDecimal25.scaleByPowerOfTen(301);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        double double29 = bigDecimal28.doubleValue();
        java.math.BigDecimal bigDecimal31 = bigDecimal28.movePointLeft((int) (byte) -1);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal31.stripTrailingZeros();
        int int34 = bigDecimal25.compareTo(bigDecimal31);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        byte[] byteArray42 = bigInteger41.toByteArray();
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(bigInteger41);
        java.math.BigDecimal bigDecimal44 = bigDecimal31.max(bigDecimal43);
        byte byte45 = bigDecimal44.byteValueExact();
        java.math.BigDecimal bigDecimal48 = bigDecimal44.setScale(2, 2);
        java.math.MathContext mathContext49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal50 = bigDecimal16.divideToIntegralValue(bigDecimal44, mathContext49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal48);
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 1L);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        int int4 = bigDecimal3.signum();
        long long5 = bigDecimal3.longValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal3.abs();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray9);
        java.math.BigInteger bigInteger11 = new java.math.BigInteger((int) (short) -1, byteArray9);
        java.math.BigInteger bigInteger13 = bigInteger11.pow((int) 'a');
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(bigInteger13, (int) (byte) 0);
        int int16 = bigDecimal15.signum();
        java.math.BigDecimal bigDecimal17 = bigDecimal6.divideToIntegralValue(bigDecimal15);
        int int18 = bigDecimal6.signum();
        java.math.BigDecimal bigDecimal19 = bigDecimal1.subtract(bigDecimal6);
        java.math.BigDecimal bigDecimal21 = bigDecimal6.scaleByPowerOfTen((-1025));
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal21);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal("\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d", mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HINDI", 3, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\ud504\ub791", 21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud504\ub791          " + "'", str3, "\ud504\ub791          ");
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        double double21 = bigInteger20.doubleValue();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger((int) (short) -1, byteArray24);
        java.math.BigInteger bigInteger27 = bigInteger20.gcd(bigInteger26);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal33 = bigDecimal29.subtract(bigDecimal32);
        java.math.BigInteger bigInteger34 = bigDecimal33.toBigInteger();
        java.math.BigInteger bigInteger35 = bigInteger26.or(bigInteger34);
        short short36 = bigInteger26.shortValueExact();
        boolean boolean38 = bigInteger26.testBit((int) (short) 0);
        java.math.BigInteger bigInteger39 = java.math.BigInteger.TEN;
        java.math.BigInteger[] bigIntegerArray40 = bigInteger26.divideAndRemainder(bigInteger39);
        int int41 = bigInteger12.compareTo(bigInteger26);
        java.lang.String str42 = bigInteger12.toString();
        int int43 = bigInteger12.bitCount();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) -1 + "'", short36 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigIntegerArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1" + "'", str42, "-1");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte2 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow(2);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.TEN;
        long long8 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.ulp();
        java.lang.String str10 = bigDecimal7.toString();
        int int11 = bigDecimal5.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal7.divide(bigDecimal13, (int) (short) 1);
        java.math.BigDecimal bigDecimal16 = bigDecimal4.add(bigDecimal7);
        java.math.BigDecimal bigDecimal17 = bigDecimal7.negate();
        java.math.BigInteger bigInteger18 = bigDecimal17.toBigIntegerExact();
        java.math.BigInteger bigInteger20 = bigInteger18.shiftRight((int) (short) 10);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        double double28 = bigInteger27.doubleValue();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger34 = bigInteger27.gcd(bigInteger33);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        java.math.BigInteger bigInteger42 = bigInteger33.or(bigInteger41);
        java.math.BigInteger bigInteger44 = bigInteger41.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal46 = bigDecimal45.negate();
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal50 = bigDecimal46.subtract(bigDecimal49);
        java.math.BigInteger bigInteger51 = bigDecimal50.toBigInteger();
        double double52 = bigInteger51.doubleValue();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        byte byte56 = org.apache.commons.lang3.math.NumberUtils.min(byteArray55);
        java.math.BigInteger bigInteger57 = new java.math.BigInteger((int) (short) -1, byteArray55);
        java.math.BigInteger bigInteger58 = bigInteger51.gcd(bigInteger57);
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal60 = bigDecimal59.negate();
        java.math.BigDecimal bigDecimal63 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal64 = bigDecimal60.subtract(bigDecimal63);
        java.math.BigInteger bigInteger65 = bigDecimal64.toBigInteger();
        java.math.BigInteger bigInteger66 = bigInteger57.or(bigInteger65);
        java.math.BigInteger bigInteger68 = bigInteger65.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger69 = bigInteger44.max(bigInteger65);
        boolean boolean70 = bigInteger20.equals((java.lang.Object) bigInteger65);
        java.lang.String str71 = bigInteger65.toString();
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1]");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1]");
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 1 + "'", byte56 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "0" + "'", str71, "0");
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a', 0, 120);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE" + "'", str2, "DE");
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "2ETAT2-DETINU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("JAJAJAJAJAJAJhi!JAJAJAJAJAJAJA", "it_IT");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\u97e9\u56fd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder4 = builder2.setVariant("Korean");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("                                                                                                     fr-FRDeutschland", "frz-C aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:                                                                                                      fr-FRDeutschland [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        int int3 = bigDecimal2.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal2.toBigInteger();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.TEN;
        long long6 = bigDecimal5.longValueExact();
        int int7 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal5.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal17 = bigDecimal14.min(bigDecimal16);
        java.lang.String str18 = bigDecimal17.toPlainString();
        java.math.BigDecimal bigDecimal19 = bigDecimal5.subtract(bigDecimal17);
        int int20 = bigDecimal17.scale();
        java.math.RoundingMode roundingMode22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal23 = bigDecimal2.divide(bigDecimal17, (int) ' ', roundingMode22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str18, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { 'x', '#', '4', ' ', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinese", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(charArray9, (int) (short) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "x#4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "x#4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[x, #, 4,  , a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger((int) (short) -1, byteArray3);
        java.math.BigInteger bigInteger6 = bigInteger5.not();
        byte[] byteArray7 = bigInteger5.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger8 = new java.math.BigInteger(296, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid signum value");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("fr_fr", 32, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.lang.String str9 = bigDecimal4.toEngineeringString();
        java.lang.String str10 = bigDecimal4.toPlainString();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.ulp();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.abs();
        int int14 = bigDecimal13.precision();
        java.math.BigDecimal bigDecimal15 = bigDecimal4.max(bigDecimal13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.lang.String str19 = bigDecimal16.toString();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.TEN;
        long long21 = bigDecimal20.longValueExact();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        double double23 = bigDecimal22.doubleValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal22.movePointLeft((int) (byte) -1);
        int int26 = bigDecimal25.intValue();
        java.math.BigDecimal bigDecimal27 = bigDecimal20.add(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal16.add(bigDecimal27);
        java.math.BigDecimal bigDecimal29 = bigDecimal13.max(bigDecimal28);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.lang.String str32 = bigDecimal31.toEngineeringString();
        int int33 = bigDecimal31.intValue();
        java.math.BigInteger bigInteger34 = bigDecimal31.unscaledValue();
        java.math.MathContext mathContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal36 = bigDecimal28.subtract(bigDecimal31, mathContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(bigInteger34);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale7.getUnicodeLocaleType("German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: German (Germany)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u97e9\u56fd" + "'", str9, "\u97e9\u56fd");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(10.0d);
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "1.00E-95xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.00E-95xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "1.00E-95xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(16.0d);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("1.0E+2", "\u52a0\u62ff\u5927");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        int int2 = bigDecimal0.intValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.scaleByPowerOfTen(0);
        java.lang.String str5 = bigDecimal4.toPlainString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u6cd5\u6587", "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.setLanguage("gBR");
        java.util.Locale.Builder builder7 = builder1.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("United States", "                                         French (France)                                         ", (int) (byte) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\ud55c\uad6d\uc5b4", 13, (-2));
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UitdStts" + "'", str4, "UitdStts");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\ud504\ub791\uc2a4\uc5b4-1.0", "Koreanisch(S\374dkorea)", (int) (short) 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd", "i!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!i!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd" + "'", str2, "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd");
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinese");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        java.math.BigInteger bigInteger0 = java.math.BigInteger.TEN;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger((int) (short) -1, byteArray3);
        java.math.BigInteger bigInteger7 = bigInteger5.pow((int) 'a');
        java.math.BigInteger bigInteger9 = bigInteger5.shiftLeft((int) (short) 1);
        boolean boolean11 = bigInteger9.isProbablePrime((int) '4');
        short short12 = bigInteger9.shortValueExact();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal18 = bigDecimal14.subtract(bigDecimal17);
        java.math.BigInteger bigInteger19 = bigDecimal18.toBigInteger();
        double double20 = bigInteger19.doubleValue();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray23);
        java.math.BigInteger bigInteger25 = new java.math.BigInteger((int) (short) -1, byteArray23);
        java.math.BigInteger bigInteger26 = bigInteger19.gcd(bigInteger25);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal28 = bigDecimal27.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal32 = bigDecimal28.subtract(bigDecimal31);
        java.math.BigInteger bigInteger33 = bigDecimal32.toBigInteger();
        double double34 = bigInteger33.doubleValue();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        byte byte38 = org.apache.commons.lang3.math.NumberUtils.min(byteArray37);
        java.math.BigInteger bigInteger39 = new java.math.BigInteger((int) (short) -1, byteArray37);
        java.math.BigInteger bigInteger40 = bigInteger33.gcd(bigInteger39);
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal42 = bigDecimal41.negate();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal42.subtract(bigDecimal45);
        java.math.BigInteger bigInteger47 = bigDecimal46.toBigInteger();
        java.math.BigInteger bigInteger48 = bigInteger39.or(bigInteger47);
        short short49 = bigInteger39.shortValueExact();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger56 = bigInteger54.pow((int) 'a');
        java.math.BigInteger bigInteger58 = bigInteger54.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger59 = bigInteger39.xor(bigInteger58);
        java.math.BigInteger bigInteger60 = bigInteger58.not();
        java.math.BigInteger bigInteger61 = bigInteger26.and(bigInteger60);
        java.math.BigInteger bigInteger62 = bigInteger9.subtract(bigInteger60);
        java.math.BigInteger[] bigIntegerArray63 = bigInteger0.divideAndRemainder(bigInteger60);
        int int64 = bigInteger60.signum();
        org.junit.Assert.assertNotNull(bigInteger0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -2 + "'", short12 == (short) -2);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1]");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 1 + "'", byte24 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1]");
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) -1 + "'", short49 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigIntegerArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        char[] charArray11 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(charArray11, (int) (short) 2, (int) (byte) 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   #_eng                        ", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setRegion("fr");
        java.util.Locale.Builder builder9 = builder7.setScript("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        char[] charArray13 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "gbr", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????(??????)hi");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        long long20 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal23 = bigDecimal21.negate();
        java.lang.String str24 = bigDecimal21.toString();
        java.math.BigDecimal bigDecimal26 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(objArray29, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean34 = bigDecimal26.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal35 = bigDecimal21.max(bigDecimal26);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal41 = bigDecimal37.subtract(bigDecimal40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal43 = bigDecimal40.min(bigDecimal42);
        java.math.BigDecimal bigDecimal45 = bigDecimal43.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal46 = bigDecimal21.min(bigDecimal43);
        java.math.BigDecimal bigDecimal48 = bigDecimal46.setScale((-33));
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal52 = bigDecimal51.negate();
        java.math.BigDecimal bigDecimal53 = bigDecimal51.negate();
        java.lang.String str54 = bigDecimal53.toEngineeringString();
        java.math.BigDecimal bigDecimal55 = bigDecimal50.multiply(bigDecimal53);
        java.math.BigInteger bigInteger56 = bigDecimal53.unscaledValue();
        java.math.BigDecimal bigDecimal57 = bigDecimal48.subtract(bigDecimal53);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal59 = bigDecimal14.divide(bigDecimal57, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigDecimal57);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "            NC-z");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 287 + "'", int2 == 287);
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "fra ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("UitdStts", (short) 16);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 16 + "'", short2 == (short) 16);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\uc774\ud0c8\ub9ac\uc544\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u6cd5\u6587", "AJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)", ")");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)_)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)_)" + "'", str3, "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)_)");
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("\uc911\uad6d\uc5b4                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????????                           \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray7);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger((int) (short) -1, byteArray7);
        java.math.BigInteger bigInteger11 = bigInteger9.pow((int) 'a');
        byte[] byteArray12 = bigInteger9.toByteArray();
        long long13 = bigInteger9.longValueExact();
        byte byte14 = bigInteger9.byteValueExact();
        java.lang.String str16 = bigInteger9.toString((int) (byte) 10);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal18.subtract(bigDecimal21);
        java.math.BigInteger bigInteger23 = bigDecimal22.toBigInteger();
        java.math.BigInteger bigInteger24 = bigInteger23.negate();
        java.math.BigInteger bigInteger25 = bigInteger9.xor(bigInteger23);
        byte byte26 = bigInteger25.byteValueExact();
        java.math.BigInteger bigInteger27 = bigInteger3.multiply(bigInteger25);
        double double28 = bigInteger3.doubleValue();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("   #_eng");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        boolean boolean10 = bigInteger8.isProbablePrime((int) '4');
        short short11 = bigInteger8.shortValueExact();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.setLanguageTag("eng");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder17 = builder15.setLocale(locale16);
        boolean boolean18 = bigInteger8.equals((java.lang.Object) builder15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder15.removeUnicodeLocaleAttribute("Koreanisch(S\374dkorea)Koreanisch(S\374dkorea)Koreanisch(S\374dkorea)Koreanisch(S\374dkorea)Koreanisch(S\374dkEN-US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Koreanisch(Su?dkorea)Koreanisch(Su?dkorea)Koreanisch(Su?dkorea)Koreanisch(Su?dkorea)Koreanisch(Su?dkEN-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -2 + "'", short11 == (short) -2);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale6.getVariant();
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getDisplayVariant();
        java.lang.String str13 = locale1.getDisplayName(locale10);
        java.lang.String str14 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str7, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587" + "'", str11, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str13, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u65e5\u672c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("kor");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setExtension(' ', "Koreanisch(S\374dkorea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger17 = bigInteger15.pow((int) 'a');
        byte[] byteArray18 = bigInteger15.toByteArray();
        long long19 = bigInteger15.longValueExact();
        java.math.BigInteger bigInteger20 = bigInteger10.or(bigInteger15);
        byte byte21 = bigInteger15.byteValueExact();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.math.BigInteger bigInteger25 = bigInteger15.setBit(7);
        java.math.BigInteger bigInteger27 = bigInteger15.clearBit((int) (byte) 1);
        java.math.BigInteger bigInteger28 = bigInteger6.remainder(bigInteger15);
        java.lang.String str29 = bigInteger15.toString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1" + "'", str29, "-1");
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        short short5 = bigInteger3.shortValueExact();
        java.math.BigInteger bigInteger7 = bigInteger3.flipBit((int) '4');
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        double double15 = bigInteger14.doubleValue();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger21 = bigInteger14.gcd(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigInteger bigInteger29 = bigInteger20.or(bigInteger28);
        short short30 = bigInteger20.shortValueExact();
        int int31 = bigInteger20.getLowestSetBit();
        long long32 = bigInteger20.longValue();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal38 = bigDecimal34.subtract(bigDecimal37);
        java.math.BigInteger bigInteger39 = bigDecimal38.toBigInteger();
        java.math.BigInteger bigInteger40 = bigInteger39.negate();
        java.math.BigInteger bigInteger41 = bigInteger20.gcd(bigInteger39);
        java.math.BigInteger bigInteger42 = bigInteger7.xor(bigInteger41);
        float float43 = bigInteger42.floatValue();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 4.5035996E15f + "'", float43 == 4.5035996E15f);
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal22 = bigDecimal19.min(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.min(bigDecimal22);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        int int28 = bigDecimal26.intValue();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal22.divideAndRemainder(bigDecimal26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) bigDecimalArray29, 'a', (int) (short) 16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = bigDecimal1.negate();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Englisch44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "\u30a4\u30bf\u30ea\u30a2\u8a9e     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        int int23 = bigInteger12.getLowestSetBit();
        long long24 = bigInteger12.longValue();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigInteger bigInteger31 = bigDecimal30.toBigInteger();
        java.math.BigInteger bigInteger32 = bigInteger31.negate();
        java.math.BigInteger bigInteger33 = bigInteger12.gcd(bigInteger31);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal39 = bigDecimal35.subtract(bigDecimal38);
        java.math.BigInteger bigInteger40 = bigDecimal39.toBigInteger();
        double double41 = bigInteger40.doubleValue();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        byte byte45 = org.apache.commons.lang3.math.NumberUtils.min(byteArray44);
        java.math.BigInteger bigInteger46 = new java.math.BigInteger((int) (short) -1, byteArray44);
        java.math.BigInteger bigInteger47 = bigInteger40.gcd(bigInteger46);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal49 = bigDecimal48.negate();
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal53 = bigDecimal49.subtract(bigDecimal52);
        java.math.BigInteger bigInteger54 = bigDecimal53.toBigInteger();
        java.math.BigInteger bigInteger55 = bigInteger46.or(bigInteger54);
        boolean boolean57 = bigInteger55.testBit(117);
        java.math.BigInteger bigInteger58 = bigInteger31.min(bigInteger55);
        int int59 = bigInteger58.intValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 1 + "'", byte45 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int8 = bigDecimal4.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = bigDecimal4.ulp();
        java.math.BigDecimal bigDecimal10 = bigDecimal9.abs();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ", 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 3);
        java.math.MathContext mathContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = bigDecimal1.negate(mathContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Gb");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gb" + "'", str1, "Gb");
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                          gne", "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HindiHindiHindiRF-RFHindiHindiHindi", "                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((long) 'u', mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((long) 34, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0", "#_HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u671d\u9c9c\u6587\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u671d\u9c9c\u6587(", "dnu0E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal7 = bigDecimal4.min(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal7.movePointRight((int) (short) -2);
        int int10 = bigDecimal9.precision();
        int int11 = bigDecimal9.scale();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u65e5\u672c\u8a9e", "en-US", 100);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FR", (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "#");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "frz-C ");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Korean(SouthKorea)en-cen-cen", strArray5, strArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!UUU", strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Korean(SouthKorea)en-cen-cen" + "'", str17, "Korean(SouthKorea)en-cen-cen");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(byteArray13);
        boolean boolean17 = bigInteger4.equals((java.lang.Object) byteArray13);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        double double25 = bigInteger24.doubleValue();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        java.math.BigInteger bigInteger30 = new java.math.BigInteger((int) (short) -1, byteArray28);
        java.math.BigInteger bigInteger31 = bigInteger24.gcd(bigInteger30);
        java.math.BigInteger bigInteger32 = bigInteger4.and(bigInteger30);
        java.lang.String str33 = bigInteger4.toString();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger39 = new java.math.BigInteger(byteArray36);
        byte byte40 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger41 = new java.math.BigInteger(byteArray36);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger(byteArray36);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger(byteArray36);
        byte byte44 = org.apache.commons.lang3.math.NumberUtils.max(byteArray36);
        java.math.BigInteger bigInteger45 = new java.math.BigInteger(byteArray36);
        java.math.BigInteger bigInteger46 = bigInteger4.add(bigInteger45);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 1 + "'", byte40 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte byte13 = bigInteger7.byteValueExact();
        boolean boolean15 = bigInteger7.testBit(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigInteger bigInteger24 = bigInteger20.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal28 = bigDecimal26.min(bigDecimal27);
        java.lang.String str29 = bigDecimal26.toPlainString();
        boolean boolean30 = bigInteger24.equals((java.lang.Object) bigDecimal26);
        java.math.BigInteger bigInteger31 = bigInteger7.divide(bigInteger24);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger("h", (int) ' ');
        java.math.BigInteger bigInteger35 = bigInteger7.gcd(bigInteger34);
        java.math.BigInteger bigInteger37 = bigInteger7.clearBit(3);
        double double38 = bigInteger7.doubleValue();
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(bigInteger7, 34);
        byte[] byteArray43 = new byte[] { (byte) 1 };
        byte byte44 = org.apache.commons.lang3.math.NumberUtils.min(byteArray43);
        java.math.BigInteger bigInteger45 = new java.math.BigInteger((int) (short) -1, byteArray43);
        java.math.BigInteger bigInteger47 = bigInteger45.pow((int) 'a');
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(bigInteger47, (int) (byte) 0);
        java.math.BigDecimal bigDecimal50 = bigDecimal40.remainder(bigDecimal49);
        int int51 = bigDecimal50.signum();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1]");
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.setRegion("US");
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("", locale9);
        java.util.Set<java.lang.Character> charSet11 = locale9.getExtensionKeys();
        java.util.Locale.Builder builder12 = builder3.setLocale(locale9);
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale13.getVariant();
        java.lang.String str15 = locale13.getDisplayCountry();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale13.getDisplayName(locale16);
        java.util.Locale.Builder builder19 = builder3.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder19.setScript("Englis...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Englis... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u5fb7\u56fd" + "'", str15, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd)" + "'", str18, "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.movePointLeft((int) (byte) -1);
        int int6 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal0.add(bigDecimal5);
        int int8 = bigDecimal5.precision();
        java.math.BigDecimal bigDecimal10 = bigDecimal5.movePointRight(0);
        java.math.BigInteger bigInteger11 = bigDecimal5.toBigInteger();
        short short12 = bigDecimal5.shortValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal5.ulp();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal13);
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getCountry();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Locale locale3 = java.util.Locale.PRC;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("", locale7);
        java.util.Locale.setDefault(locale7);
        java.lang.String str10 = locale3.getDisplayScript(locale7);
        java.util.Locale locale13 = new java.util.Locale("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi");
        java.lang.String str14 = locale3.getDisplayScript(locale13);
        java.lang.String str15 = locale0.getDisplayVariant(locale3);
        boolean boolean16 = locale3.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DE" + "'", str1, "DE");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger10 = bigInteger8.flipBit(1);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.lang.String str17 = bigInteger15.toString((int) (byte) 10);
        java.math.BigInteger bigInteger18 = bigInteger15.negate();
        java.math.BigInteger bigInteger19 = bigInteger8.min(bigInteger18);
        java.math.BigInteger bigInteger20 = bigInteger18.abs();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        double double28 = bigInteger27.doubleValue();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger34 = bigInteger27.gcd(bigInteger33);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        java.math.BigInteger bigInteger42 = bigInteger33.or(bigInteger41);
        short short43 = bigInteger33.shortValueExact();
        byte[] byteArray46 = new byte[] { (byte) 1 };
        byte byte47 = org.apache.commons.lang3.math.NumberUtils.min(byteArray46);
        java.math.BigInteger bigInteger48 = new java.math.BigInteger((int) (short) -1, byteArray46);
        java.math.BigInteger bigInteger50 = bigInteger48.pow((int) 'a');
        java.math.BigInteger bigInteger52 = bigInteger48.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger53 = bigInteger33.xor(bigInteger52);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal55 = bigDecimal54.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.TEN;
        long long57 = bigDecimal56.longValueExact();
        java.math.BigDecimal bigDecimal58 = bigDecimal56.ulp();
        java.lang.String str59 = bigDecimal56.toString();
        int int60 = bigDecimal54.compareTo(bigDecimal56);
        java.math.BigInteger bigInteger61 = bigDecimal54.toBigInteger();
        java.math.BigInteger bigInteger62 = bigInteger53.gcd(bigInteger61);
        java.math.BigInteger bigInteger63 = bigInteger18.or(bigInteger53);
        double double64 = bigInteger18.doubleValue();
        int int65 = bigInteger18.getLowestSetBit();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1]");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) -1 + "'", short43 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1]");
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 1 + "'", byte47 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L + "'", long57 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "10" + "'", str59, "10");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("\u4e2d\u6587###############", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CAN", "enfr_FR_#u-engcn", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("south korea", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf(35L, (int) (short) 117);
        java.math.BigDecimal bigDecimal4 = bigDecimal2.movePointLeft((int) (short) -2);
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        int int6 = bigInteger5.bitLength();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohz", "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("3010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3010" + "'", str1, "3010");
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("gBR", (int) (short) 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             gBR" + "'", str2, "             gBR");
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale8.getDisplayCountry();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Locale.Builder builder12 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("eng");
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder18 = builder16.setLocale(locale17);
        java.util.Locale.Builder builder20 = builder18.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale21 = builder18.build();
        java.util.Locale.Builder builder22 = builder5.setLocale(locale21);
        java.util.Locale.Builder builder24 = builder22.setRegion("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587" + "'", str11, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "KR                               ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!hs!hs!hs!hs!hs!hs!hs!hs");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("france", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(bigInteger48);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal51 = bigDecimal50.negate();
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal55 = bigDecimal51.subtract(bigDecimal54);
        java.math.BigInteger bigInteger56 = bigDecimal55.toBigInteger();
        double double57 = bigInteger56.doubleValue();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        byte byte61 = org.apache.commons.lang3.math.NumberUtils.min(byteArray60);
        java.math.BigInteger bigInteger62 = new java.math.BigInteger((int) (short) -1, byteArray60);
        java.math.BigInteger bigInteger63 = bigInteger56.gcd(bigInteger62);
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal65 = bigDecimal64.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal69 = bigDecimal65.subtract(bigDecimal68);
        java.math.BigInteger bigInteger70 = bigDecimal69.toBigInteger();
        java.math.BigInteger bigInteger71 = bigInteger62.or(bigInteger70);
        short short72 = bigInteger62.shortValueExact();
        byte[] byteArray75 = new byte[] { (byte) 1 };
        byte byte76 = org.apache.commons.lang3.math.NumberUtils.min(byteArray75);
        java.math.BigInteger bigInteger77 = new java.math.BigInteger((int) (short) -1, byteArray75);
        java.math.BigInteger bigInteger79 = bigInteger77.pow((int) 'a');
        java.math.BigInteger bigInteger81 = bigInteger77.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger82 = bigInteger62.xor(bigInteger81);
        java.math.BigInteger bigInteger83 = bigInteger81.not();
        java.math.BigInteger bigInteger84 = bigInteger48.or(bigInteger83);
        java.math.BigInteger bigInteger86 = bigInteger48.shiftLeft(2);
        java.math.BigInteger bigInteger87 = bigInteger86.not();
        long long88 = bigInteger86.longValueExact();
        int int89 = bigInteger86.intValueExact();
        java.lang.String str91 = bigInteger86.toString(6);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1]");
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 1 + "'", byte61 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) -1 + "'", short72 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1]");
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 1 + "'", byte76 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "0" + "'", str91, "0");
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        boolean boolean10 = bigInteger8.isProbablePrime((int) '4');
        short short11 = bigInteger8.shortValueExact();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.subtract(bigDecimal16);
        java.math.BigInteger bigInteger18 = bigDecimal17.toBigInteger();
        double double19 = bigInteger18.doubleValue();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger25 = bigInteger18.gcd(bigInteger24);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        double double33 = bigInteger32.doubleValue();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger39 = bigInteger32.gcd(bigInteger38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal45 = bigDecimal41.subtract(bigDecimal44);
        java.math.BigInteger bigInteger46 = bigDecimal45.toBigInteger();
        java.math.BigInteger bigInteger47 = bigInteger38.or(bigInteger46);
        short short48 = bigInteger38.shortValueExact();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        java.math.BigInteger bigInteger57 = bigInteger53.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger58 = bigInteger38.xor(bigInteger57);
        java.math.BigInteger bigInteger59 = bigInteger57.not();
        java.math.BigInteger bigInteger60 = bigInteger25.and(bigInteger59);
        java.math.BigInteger bigInteger61 = bigInteger8.subtract(bigInteger59);
        java.math.BigInteger bigInteger63 = bigInteger8.clearBit((int) 'u');
        java.math.BigInteger bigInteger65 = bigInteger63.clearBit((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger66 = bigInteger63.nextProbablePrime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: start < 0: -166153499473114484112975882535043074");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -2 + "'", short11 == (short) -2);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) -1 + "'", short48 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigInteger65);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal14 = bigDecimal10.subtract(bigDecimal13);
        java.math.BigInteger bigInteger15 = bigDecimal14.toBigInteger();
        double double16 = bigInteger15.doubleValue();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray19);
        java.math.BigInteger bigInteger21 = new java.math.BigInteger((int) (short) -1, byteArray19);
        java.math.BigInteger bigInteger22 = bigInteger15.gcd(bigInteger21);
        java.math.BigInteger bigInteger23 = bigInteger21.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        short short46 = bigInteger36.shortValueExact();
        byte byte47 = bigInteger36.byteValueExact();
        java.math.BigInteger bigInteger48 = bigInteger21.and(bigInteger36);
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        java.math.BigInteger bigInteger57 = bigInteger53.shiftLeft((int) (short) 1);
        int int58 = bigInteger57.intValueExact();
        java.math.BigInteger bigInteger59 = bigInteger57.abs();
        java.math.BigInteger bigInteger60 = bigInteger36.multiply(bigInteger59);
        java.math.BigInteger bigInteger61 = bigInteger6.multiply(bigInteger59);
        long long62 = bigInteger59.longValue();
        java.math.BigDecimal bigDecimal63 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal64 = bigDecimal63.negate();
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal68 = bigDecimal64.subtract(bigDecimal67);
        java.math.BigInteger bigInteger69 = bigDecimal68.toBigInteger();
        double double70 = bigInteger69.doubleValue();
        byte[] byteArray73 = new byte[] { (byte) 1 };
        byte byte74 = org.apache.commons.lang3.math.NumberUtils.min(byteArray73);
        java.math.BigInteger bigInteger75 = new java.math.BigInteger((int) (short) -1, byteArray73);
        java.math.BigInteger bigInteger76 = bigInteger69.gcd(bigInteger75);
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal78 = bigDecimal77.negate();
        java.math.BigDecimal bigDecimal81 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal82 = bigDecimal78.subtract(bigDecimal81);
        java.math.BigInteger bigInteger83 = bigDecimal82.toBigInteger();
        java.math.BigInteger bigInteger84 = bigInteger75.or(bigInteger83);
        double double85 = bigInteger84.doubleValue();
        int int86 = bigInteger84.getLowestSetBit();
        java.math.BigInteger bigInteger87 = bigInteger59.divide(bigInteger84);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) -1 + "'", short46 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) -1 + "'", byte47 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-2) + "'", int58 == (-2));
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 2L + "'", long62 == 2L);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[1]");
        org.junit.Assert.assertTrue("'" + byte74 + "' != '" + (byte) 1 + "'", byte74 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(bigInteger87);
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal12 = bigDecimal10.min(bigDecimal11);
        java.lang.String str13 = bigDecimal10.toPlainString();
        boolean boolean14 = bigInteger8.equals((java.lang.Object) bigDecimal10);
        java.lang.String str16 = bigInteger8.toString((int) (byte) 10);
        java.lang.String str18 = bigInteger8.toString((int) '4');
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray21);
        java.math.BigInteger bigInteger23 = new java.math.BigInteger((int) (short) -1, byteArray21);
        java.math.BigInteger bigInteger25 = bigInteger23.pow((int) 'a');
        java.math.BigInteger bigInteger27 = bigInteger23.shiftLeft((int) (short) 1);
        boolean boolean29 = bigInteger27.isProbablePrime((int) '4');
        short short30 = bigInteger27.shortValueExact();
        int int31 = bigInteger8.compareTo(bigInteger27);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        java.math.BigInteger bigInteger39 = bigInteger38.negate();
        byte byte40 = bigInteger38.byteValueExact();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal42 = bigDecimal41.negate();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal42.subtract(bigDecimal45);
        java.math.BigInteger bigInteger47 = bigDecimal46.toBigInteger();
        double double48 = bigInteger47.doubleValue();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger54 = bigInteger47.gcd(bigInteger53);
        java.math.BigInteger bigInteger55 = bigInteger53.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        double double63 = bigInteger62.doubleValue();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger((int) (short) -1, byteArray66);
        java.math.BigInteger bigInteger69 = bigInteger62.gcd(bigInteger68);
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal71 = bigDecimal70.negate();
        java.math.BigDecimal bigDecimal74 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal75 = bigDecimal71.subtract(bigDecimal74);
        java.math.BigInteger bigInteger76 = bigDecimal75.toBigInteger();
        java.math.BigInteger bigInteger77 = bigInteger68.or(bigInteger76);
        short short78 = bigInteger68.shortValueExact();
        byte byte79 = bigInteger68.byteValueExact();
        java.math.BigInteger bigInteger80 = bigInteger53.and(bigInteger68);
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger87 = bigInteger85.pow((int) 'a');
        java.math.BigInteger bigInteger89 = bigInteger85.shiftLeft((int) (short) 1);
        int int90 = bigInteger89.intValueExact();
        java.math.BigInteger bigInteger91 = bigInteger89.abs();
        java.math.BigInteger bigInteger92 = bigInteger68.multiply(bigInteger91);
        java.math.BigInteger bigInteger93 = bigInteger38.multiply(bigInteger91);
        int int94 = bigInteger8.compareTo(bigInteger91);
        int int95 = bigInteger8.intValue();
        java.math.BigInteger bigInteger96 = bigInteger8.abs();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-2" + "'", str16, "-2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-2" + "'", str18, "-2");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -2 + "'", short30 == (short) -2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) -1 + "'", short78 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) -1 + "'", byte79 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[1]");
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-2) + "'", int90 == (-2));
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-2) + "'", int95 == (-2));
        org.junit.Assert.assertNotNull(bigInteger96);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CA", "\u52a0\u62ff\u592700", "1H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CA" + "'", str3, "CA");
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("RBG", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.util.Random random50 = null;
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) 0, random50);
        java.math.BigInteger bigInteger52 = bigInteger44.gcd(bigInteger51);
        byte[] byteArray54 = new byte[] { (byte) 1 };
        byte byte55 = org.apache.commons.lang3.math.NumberUtils.min(byteArray54);
        java.math.BigInteger bigInteger56 = new java.math.BigInteger(byteArray54);
        java.math.BigInteger bigInteger57 = bigInteger52.subtract(bigInteger56);
        long long58 = bigInteger52.longValue();
        long long59 = bigInteger52.longValueExact();
        int int60 = bigInteger52.getLowestSetBit();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1]");
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 1 + "'", byte55 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Korean", 116);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                              Korean" + "'", str2, "                                                                                                              Korean");
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'a');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder12 = builder9.setLocale(locale11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = builder15.build();
        java.util.Locale.setDefault(category13, locale16);
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale18.getDisplayVariant(locale20);
        java.lang.String str22 = locale20.getDisplayCountry();
        java.util.Locale.setDefault(category13, locale20);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.lang.String str25 = locale20.getDisplayVariant(locale24);
        java.util.Locale.Builder builder26 = builder9.setLocale(locale20);
        java.util.Locale.Builder builder28 = builder9.setRegion("cn");
        java.util.Locale.Builder builder30 = builder28.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder31 = builder30.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u97e9\u56fd" + "'", str22, "\u97e9\u56fd");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.lang.String str3 = bigDecimal0.toPlainString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        int int7 = bigDecimal6.intValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal0.max(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal8.abs();
        int int10 = bigDecimal8.intValueExact();
        java.math.BigDecimal bigDecimal12 = bigDecimal8.setScale((int) (byte) 100);
        java.math.MathContext mathContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = bigDecimal12.round(mathContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bigDecimal12);
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("th Korea)en-cen-cenuKorean (So", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               th Korea)en-cen-cenuKorean (So" + "'", str2, "               th Korea)en-cen-cenuKorean (So");
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "frazho", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(bigInteger2);
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigDecimal14);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aj");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        int int23 = bigInteger12.getLowestSetBit();
        long long24 = bigInteger12.longValue();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigInteger bigInteger31 = bigDecimal30.toBigInteger();
        java.math.BigInteger bigInteger32 = bigInteger31.negate();
        java.math.BigInteger bigInteger33 = bigInteger12.gcd(bigInteger31);
        java.math.BigInteger bigInteger35 = java.math.BigInteger.valueOf((long) 7);
        java.math.BigInteger[] bigIntegerArray36 = bigInteger31.divideAndRemainder(bigInteger35);
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(bigInteger35, (int) (short) -5);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal41 = bigDecimal39.negate();
        java.lang.String str42 = bigDecimal41.toEngineeringString();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal45 = bigDecimal44.abs();
        java.math.BigDecimal bigDecimal47 = bigDecimal44.pow((int) (byte) 1);
        java.math.BigDecimal bigDecimal48 = bigDecimal41.add(bigDecimal44);
        java.math.BigDecimal bigDecimal49 = bigDecimal38.add(bigDecimal48);
        java.math.MathContext mathContext51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal52 = bigDecimal48.pow((int) (short) 1024, mathContext51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigIntegerArray36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)", "                                              AJ           AJ                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        short short5 = bigInteger3.shortValueExact();
        java.math.BigInteger bigInteger7 = bigInteger3.flipBit((int) '4');
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger14 = bigInteger12.pow((int) 'a');
        java.math.BigInteger bigInteger16 = bigInteger12.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal20 = bigDecimal18.min(bigDecimal19);
        java.lang.String str21 = bigDecimal18.toPlainString();
        boolean boolean22 = bigInteger16.equals((java.lang.Object) bigDecimal18);
        java.lang.String str24 = bigInteger16.toString((int) (byte) 10);
        java.lang.String str26 = bigInteger16.toString((int) '4');
        byte[] byteArray29 = new byte[] { (byte) 1 };
        byte byte30 = org.apache.commons.lang3.math.NumberUtils.min(byteArray29);
        java.math.BigInteger bigInteger31 = new java.math.BigInteger((int) (short) -1, byteArray29);
        java.math.BigInteger bigInteger33 = bigInteger31.pow((int) 'a');
        java.math.BigInteger bigInteger35 = bigInteger31.shiftLeft((int) (short) 1);
        boolean boolean37 = bigInteger35.isProbablePrime((int) '4');
        short short38 = bigInteger35.shortValueExact();
        int int39 = bigInteger16.compareTo(bigInteger35);
        java.math.BigInteger bigInteger40 = bigInteger7.and(bigInteger35);
        java.math.BigInteger bigInteger42 = bigInteger7.shiftRight(0);
        java.math.BigInteger bigInteger44 = bigInteger7.shiftLeft(320);
        java.math.BigInteger bigInteger46 = bigInteger7.shiftRight(31);
        int int47 = bigInteger46.signum();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-2" + "'", str24, "-2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-2" + "'", str26, "-2");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 1 + "'", byte30 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -2 + "'", short38 == (short) -2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1024L, 3L, (long) 120);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1024L + "'", long3 == 1024L);
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("             gBR", "ko-KR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("chn");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        int int2 = bigDecimal0.intValue();
        int int3 = bigDecimal0.scale();
        byte byte4 = bigDecimal0.byteValueExact();
        byte byte5 = bigDecimal0.byteValueExact();
        java.math.BigDecimal bigDecimal7 = bigDecimal0.pow(33);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\u671d\u9c9c\u6587\u97e9\u56fd)", "        FR");
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        java.util.Locale locale2 = new java.util.Locale("aaaDeutschaaa", "German(Germany)");
        java.lang.String str3 = locale2.getDisplayLanguage();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.math.BigInteger bigInteger8 = new java.math.BigInteger((int) (short) -1, byteArray6);
        java.math.BigInteger bigInteger10 = bigInteger8.pow((int) 'a');
        java.math.BigInteger bigInteger12 = bigInteger8.shiftLeft((int) (short) 1);
        boolean boolean14 = bigInteger12.isProbablePrime((int) '4');
        short short15 = bigInteger12.shortValueExact();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal17 = bigDecimal16.negate();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal21 = bigDecimal17.subtract(bigDecimal20);
        java.math.BigInteger bigInteger22 = bigDecimal21.toBigInteger();
        double double23 = bigInteger22.doubleValue();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        byte byte27 = org.apache.commons.lang3.math.NumberUtils.min(byteArray26);
        java.math.BigInteger bigInteger28 = new java.math.BigInteger((int) (short) -1, byteArray26);
        java.math.BigInteger bigInteger29 = bigInteger22.gcd(bigInteger28);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.subtract(bigDecimal34);
        java.math.BigInteger bigInteger36 = bigDecimal35.toBigInteger();
        double double37 = bigInteger36.doubleValue();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        byte byte41 = org.apache.commons.lang3.math.NumberUtils.min(byteArray40);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger((int) (short) -1, byteArray40);
        java.math.BigInteger bigInteger43 = bigInteger36.gcd(bigInteger42);
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal45 = bigDecimal44.negate();
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal49 = bigDecimal45.subtract(bigDecimal48);
        java.math.BigInteger bigInteger50 = bigDecimal49.toBigInteger();
        java.math.BigInteger bigInteger51 = bigInteger42.or(bigInteger50);
        short short52 = bigInteger42.shortValueExact();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        byte byte56 = org.apache.commons.lang3.math.NumberUtils.min(byteArray55);
        java.math.BigInteger bigInteger57 = new java.math.BigInteger((int) (short) -1, byteArray55);
        java.math.BigInteger bigInteger59 = bigInteger57.pow((int) 'a');
        java.math.BigInteger bigInteger61 = bigInteger57.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger62 = bigInteger42.xor(bigInteger61);
        java.math.BigInteger bigInteger63 = bigInteger61.not();
        java.math.BigInteger bigInteger64 = bigInteger29.and(bigInteger63);
        java.math.BigInteger bigInteger65 = bigInteger12.subtract(bigInteger63);
        java.math.BigInteger bigInteger67 = bigInteger12.clearBit((int) 'u');
        java.math.BigInteger bigInteger69 = bigInteger67.clearBit(117);
        int int70 = bigInteger67.intValue();
        boolean boolean71 = locale2.equals((java.lang.Object) int70);
        org.junit.Assert.assertEquals(locale2.toString(), "aaadeutschaaa_GERMAN(GERMANY)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaadeutschaaa" + "'", str3, "aaadeutschaaa");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -2 + "'", short15 == (short) -2);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1]");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 1 + "'", byte27 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) -1 + "'", short52 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1]");
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 1 + "'", byte56 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-2) + "'", int70 == (-2));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.plus();
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(1, byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 4);
        java.lang.String str2 = bigDecimal1.toEngineeringString();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.abs();
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertNotNull(bigDecimal3);
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = bigInteger21.gcd(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        java.util.Random random1 = null;
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(0, random1);
        int int3 = bigInteger2.bitLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Japanese", "hi!hi!hi!hi!h...", "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Japanese" + "'", str3, "Japanese");
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                         dnu                                                         ", (-5), "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         dnu                                                         " + "'", str3, "                                                         dnu                                                         ");
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u671d\u9c9c\u6587\u97e9\u56fd)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaUNITED STATESaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNITED STATES" + "'", str2, "UNITED STATES");
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "italien", "rman (Germany)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "SOUTH KOREA", (java.lang.CharSequence) "-2-2-zh-C                                                                                                            ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "SOUTH KOREA" + "'", charSequence2, "SOUTH KOREA");
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", (int) (short) 35, "############################################################################################################################################################################################################################################################################################################");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9" + "'", str3, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0.0000000000000000000000000000000001", "y)", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0000000000000000000000000000000001" + "'", str3, "0.0000000000000000000000000000000001");
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("             hi!uuu             ", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\uc77c\uc5b4\ub3c5\uc77c\ub3c5", "-2-2-zh-C                                                                                                            ", "                                      !hi!hi!hi!hi!hi!hi!hi!hi                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc77c\uc5b4\ub3c5\uc77c\ub3c5" + "'", str3, "\uc77c\uc5b4\ub3c5\uc77c\ub3c5");
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        java.util.Locale locale2 = new java.util.Locale("JA", "                                                                                                 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for                                                                                                  ");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "ja_                                                                                                 ");
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Italy");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italy" + "'", str1, "Italy");
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi", "eng", 1);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#_ENG", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("\ud504\ub791", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi" + "'", str8, "hi");
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) -20000, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -20000 + "'", short3 == (short) -20000);
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("engaaaaa                                      ", "De");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        byte[] byteArray20 = bigInteger17.toByteArray();
        long long21 = bigInteger17.longValueExact();
        java.lang.String str23 = bigInteger17.toString(0);
        int int24 = bigInteger17.intValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.subtract(bigInteger17);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        java.math.BigInteger bigInteger33 = bigInteger32.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        double double35 = bigDecimal34.doubleValue();
        java.math.BigInteger bigInteger36 = bigDecimal34.toBigInteger();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        byte byte40 = org.apache.commons.lang3.math.NumberUtils.min(byteArray39);
        java.math.BigInteger bigInteger41 = new java.math.BigInteger((int) (short) -1, byteArray39);
        java.math.BigInteger bigInteger43 = bigInteger41.pow((int) 'a');
        byte[] byteArray44 = bigInteger41.toByteArray();
        long long45 = bigInteger41.longValueExact();
        java.math.BigInteger bigInteger46 = bigInteger36.or(bigInteger41);
        byte[] byteArray49 = new byte[] { (byte) 1 };
        byte byte50 = org.apache.commons.lang3.math.NumberUtils.min(byteArray49);
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) -1, byteArray49);
        java.math.BigInteger bigInteger53 = bigInteger51.pow((int) 'a');
        byte[] byteArray54 = bigInteger51.toByteArray();
        long long55 = bigInteger51.longValueExact();
        java.lang.String str57 = bigInteger51.toString(0);
        int int58 = bigInteger51.intValueExact();
        java.math.BigInteger bigInteger59 = bigInteger46.subtract(bigInteger51);
        java.math.BigInteger bigInteger60 = bigInteger32.min(bigInteger46);
        java.math.BigInteger bigInteger61 = bigInteger25.gcd(bigInteger60);
        java.math.BigDecimal bigDecimal62 = new java.math.BigDecimal(bigInteger60);
        java.lang.String str63 = bigDecimal62.toPlainString();
        long long64 = bigDecimal62.longValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1]");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 1 + "'", byte40 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 1 + "'", byte50 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "-1" + "'", str57, "-1");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "-1" + "'", str63, "-1");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)" + "'", str1, "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", "undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                         French (France)                                         ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale1.getDisplayLanguage();
        java.lang.String str6 = locale1.getLanguage();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                 ", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                 " + "'", str7, "                                                                                                 ");
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale4);
        java.lang.String str6 = locale4.getCountry();
        java.lang.String str7 = locale4.getVariant();
        java.lang.String str8 = locale0.getDisplayCountry(locale4);
        java.util.Locale locale9 = locale4.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str5, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FR" + "'", str6, "FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        boolean boolean5 = locale1.hasExtensions();
        java.lang.String str6 = locale1.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayLanguage(locale1);
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale1.getDisplayVariant();
        boolean boolean10 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Korean" + "'", str4, "Korean");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ko-KR" + "'", str6, "ko-KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str7, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        double double22 = bigInteger21.doubleValue();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger28 = bigInteger21.gcd(bigInteger27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        java.math.BigInteger bigInteger36 = bigInteger27.or(bigInteger35);
        short short37 = bigInteger27.shortValueExact();
        byte byte38 = bigInteger27.byteValueExact();
        java.math.BigInteger bigInteger39 = bigInteger12.and(bigInteger27);
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger46 = bigInteger44.pow((int) 'a');
        java.math.BigInteger bigInteger48 = bigInteger44.shiftLeft((int) (short) 1);
        int int49 = bigInteger48.intValueExact();
        java.math.BigInteger bigInteger50 = bigInteger48.abs();
        java.math.BigInteger bigInteger51 = bigInteger27.multiply(bigInteger50);
        int int52 = bigInteger27.bitCount();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2) + "'", int49 == (-2));
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("enfr_FR_#u-engcn", "\u610f\u5927\u5229");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enfr_FR_#u-engcn" + "'", str2, "enfr_FR_#u-engcn");
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "i!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!i!hi!hi!hi", 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!i!hi!hi!hi" + "'", str4, "i!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!i!hi!hi!hi");
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 2, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        float[] floatArray5 = new float[] { '4', 0L, 4, 1L, 1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[52.0, 0.0, 4.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 52.0f + "'", float9 == 52.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 52.0f + "'", float12 == 52.0f);
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.lang.String str6 = bigDecimal4.toPlainString();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray8);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(byteArray8);
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(bigInteger10);
        int int12 = bigDecimal4.compareTo(bigDecimal11);
        java.math.MathContext mathContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = bigDecimal4.plus(mathContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) -4, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger10 = bigInteger8.flipBit(1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigInteger bigInteger17 = bigDecimal16.toBigInteger();
        double double18 = bigInteger17.doubleValue();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray21);
        java.math.BigInteger bigInteger23 = new java.math.BigInteger((int) (short) -1, byteArray21);
        java.math.BigInteger bigInteger24 = bigInteger17.gcd(bigInteger23);
        java.math.BigInteger bigInteger25 = bigInteger23.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        double double27 = bigDecimal26.doubleValue();
        java.math.BigInteger bigInteger28 = bigDecimal26.toBigInteger();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger35 = bigInteger33.pow((int) 'a');
        byte[] byteArray36 = bigInteger33.toByteArray();
        long long37 = bigInteger33.longValueExact();
        java.math.BigInteger bigInteger38 = bigInteger28.or(bigInteger33);
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger45 = bigInteger43.pow((int) 'a');
        byte[] byteArray46 = bigInteger43.toByteArray();
        long long47 = bigInteger43.longValueExact();
        java.lang.String str49 = bigInteger43.toString(0);
        int int50 = bigInteger43.intValueExact();
        java.math.BigInteger bigInteger51 = bigInteger38.subtract(bigInteger43);
        java.math.BigInteger bigInteger52 = bigInteger23.subtract(bigInteger51);
        java.math.BigInteger[] bigIntegerArray53 = bigInteger10.divideAndRemainder(bigInteger52);
        byte[] byteArray56 = new byte[] { (byte) 1 };
        byte byte57 = org.apache.commons.lang3.math.NumberUtils.min(byteArray56);
        java.math.BigInteger bigInteger58 = new java.math.BigInteger((int) (short) -1, byteArray56);
        java.math.BigInteger bigInteger60 = bigInteger58.pow((int) 'a');
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal62 = bigDecimal61.negate();
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal66 = bigDecimal62.subtract(bigDecimal65);
        java.math.BigInteger bigInteger67 = bigDecimal66.toBigInteger();
        double double68 = bigInteger67.doubleValue();
        byte[] byteArray71 = new byte[] { (byte) 1 };
        byte byte72 = org.apache.commons.lang3.math.NumberUtils.min(byteArray71);
        java.math.BigInteger bigInteger73 = new java.math.BigInteger((int) (short) -1, byteArray71);
        java.math.BigInteger bigInteger74 = bigInteger67.gcd(bigInteger73);
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal76 = bigDecimal75.negate();
        java.math.BigDecimal bigDecimal79 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal80 = bigDecimal76.subtract(bigDecimal79);
        java.math.BigInteger bigInteger81 = bigDecimal80.toBigInteger();
        java.math.BigInteger bigInteger82 = bigInteger73.or(bigInteger81);
        java.math.BigInteger bigInteger83 = bigInteger60.min(bigInteger82);
        java.math.BigInteger bigInteger85 = bigInteger60.pow(4);
        int int86 = bigInteger85.intValue();
        java.math.BigInteger bigInteger87 = bigInteger10.modInverse(bigInteger85);
        java.math.BigDecimal bigDecimal89 = new java.math.BigDecimal(bigInteger87, 18);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1]");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-1" + "'", str49, "-1");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigIntegerArray53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 1 + "'", byte57 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1]");
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) 1 + "'", byte72 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(bigInteger87);
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("kor");
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("enhinh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0E+1", "kokokanglais (Royaume-Uni)kokoko", (-2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0E+1" + "'", str3, "0E+1");
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ja", "KORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKOR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal22 = bigDecimal19.min(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.min(bigDecimal22);
        java.math.BigDecimal bigDecimal27 = bigDecimal0.pow((int) (short) 100);
        int int28 = bigDecimal27.signum();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        double double36 = bigInteger35.doubleValue();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        byte byte40 = org.apache.commons.lang3.math.NumberUtils.min(byteArray39);
        java.math.BigInteger bigInteger41 = new java.math.BigInteger((int) (short) -1, byteArray39);
        java.math.BigInteger bigInteger42 = bigInteger35.gcd(bigInteger41);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal44.subtract(bigDecimal47);
        java.math.BigInteger bigInteger49 = bigDecimal48.toBigInteger();
        java.math.BigInteger bigInteger50 = bigInteger41.or(bigInteger49);
        java.math.BigInteger bigInteger52 = bigInteger49.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal54 = bigDecimal53.negate();
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal58 = bigDecimal54.subtract(bigDecimal57);
        java.math.BigInteger bigInteger59 = bigDecimal58.toBigInteger();
        double double60 = bigInteger59.doubleValue();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        byte byte64 = org.apache.commons.lang3.math.NumberUtils.min(byteArray63);
        java.math.BigInteger bigInteger65 = new java.math.BigInteger((int) (short) -1, byteArray63);
        java.math.BigInteger bigInteger66 = bigInteger59.gcd(bigInteger65);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal68 = bigDecimal67.negate();
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal72 = bigDecimal68.subtract(bigDecimal71);
        java.math.BigInteger bigInteger73 = bigDecimal72.toBigInteger();
        java.math.BigInteger bigInteger74 = bigInteger65.or(bigInteger73);
        java.math.BigInteger bigInteger76 = bigInteger73.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger77 = bigInteger52.max(bigInteger73);
        java.math.BigDecimal bigDecimal78 = new java.math.BigDecimal(bigInteger73);
        java.math.BigDecimal bigDecimal80 = new java.math.BigDecimal(bigInteger73, (int) (byte) 0);
        java.math.BigDecimal bigDecimal83 = java.math.BigDecimal.valueOf((long) '#', 120);
        int int84 = bigDecimal83.signum();
        java.lang.String str85 = bigDecimal83.toPlainString();
        java.math.BigDecimal bigDecimal86 = bigDecimal80.remainder(bigDecimal83);
        java.math.BigDecimal bigDecimal88 = bigDecimal83.movePointRight((int) (short) 0);
        java.math.BigDecimal bigDecimal89 = bigDecimal27.divide(bigDecimal88);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1]");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 1 + "'", byte40 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 1 + "'", byte64 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000035" + "'", str85, "0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000035");
        org.junit.Assert.assertNotNull(bigDecimal86);
        org.junit.Assert.assertNotNull(bigDecimal88);
        org.junit.Assert.assertNotNull(bigDecimal89);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf((long) 13);
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u52a0\u62ff\u5927");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5927\u62ff\u52a0a" + "'", str1, "\u5927\u62ff\u52a0a");
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.lang.String str2 = bigDecimal1.toEngineeringString();
        int int3 = bigDecimal1.intValue();
        java.math.BigInteger bigInteger4 = bigDecimal1.unscaledValue();
        java.math.BigInteger bigInteger5 = bigDecimal1.unscaledValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "...du Sud");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str2, "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("00", "0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000120");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00" + "'", str2, "00");
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(bigInteger6);
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger(byteArray10);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(bigInteger12);
        short short14 = bigInteger12.shortValueExact();
        java.math.BigInteger bigInteger15 = bigInteger6.modInverse(bigInteger12);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.lang.String str22 = bigInteger20.toString((int) (byte) 10);
        java.math.BigInteger bigInteger23 = bigInteger20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        byte[] byteArray31 = bigInteger30.toByteArray();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        double double39 = bigInteger38.doubleValue();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger45 = bigInteger38.gcd(bigInteger44);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal47 = bigDecimal46.negate();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal51 = bigDecimal47.subtract(bigDecimal50);
        java.math.BigInteger bigInteger52 = bigDecimal51.toBigInteger();
        java.math.BigInteger bigInteger53 = bigInteger44.or(bigInteger52);
        java.math.BigInteger bigInteger54 = bigInteger30.or(bigInteger52);
        java.math.BigInteger bigInteger55 = java.math.BigInteger.ONE;
        java.math.BigInteger bigInteger56 = bigInteger52.divide(bigInteger55);
        java.math.BigInteger bigInteger58 = bigInteger55.pow((int) (byte) 100);
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.ZERO;
        double double60 = bigDecimal59.doubleValue();
        java.math.BigInteger bigInteger61 = bigDecimal59.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger61.setBit(4);
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        double double65 = bigDecimal64.doubleValue();
        java.math.BigInteger bigInteger66 = bigDecimal64.toBigInteger();
        byte[] byteArray69 = new byte[] { (byte) 1 };
        byte byte70 = org.apache.commons.lang3.math.NumberUtils.min(byteArray69);
        java.math.BigInteger bigInteger71 = new java.math.BigInteger((int) (short) -1, byteArray69);
        java.math.BigInteger bigInteger73 = bigInteger71.pow((int) 'a');
        byte[] byteArray74 = bigInteger71.toByteArray();
        long long75 = bigInteger71.longValueExact();
        java.math.BigInteger bigInteger76 = bigInteger66.or(bigInteger71);
        java.math.BigInteger bigInteger77 = bigInteger61.multiply(bigInteger76);
        java.math.BigDecimal bigDecimal78 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal79 = bigDecimal78.negate();
        java.math.BigDecimal bigDecimal82 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal83 = bigDecimal79.subtract(bigDecimal82);
        java.math.BigInteger bigInteger84 = bigDecimal83.toBigInteger();
        java.math.BigInteger bigInteger85 = bigInteger84.negate();
        java.math.BigInteger bigInteger86 = bigInteger77.xor(bigInteger85);
        java.math.BigInteger bigInteger87 = bigInteger58.andNot(bigInteger85);
        java.math.BigInteger bigInteger88 = bigInteger20.xor(bigInteger58);
        int int89 = bigInteger15.compareTo(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1" + "'", str22, "-1");
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1]");
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 1 + "'", byte70 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigInteger27.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger32 = bigInteger12.xor(bigInteger31);
        int int33 = bigInteger12.getLowestSetBit();
        int int34 = bigInteger12.bitCount();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        byte byte38 = org.apache.commons.lang3.math.NumberUtils.min(byteArray37);
        java.math.BigInteger bigInteger39 = new java.math.BigInteger((int) (short) -1, byteArray37);
        java.math.BigInteger bigInteger41 = bigInteger39.pow((int) 'a');
        byte[] byteArray42 = bigInteger39.toByteArray();
        long long43 = bigInteger39.longValueExact();
        java.lang.String str45 = bigInteger39.toString(0);
        java.math.BigInteger bigInteger47 = bigInteger39.shiftLeft(117);
        java.math.BigInteger bigInteger48 = bigInteger12.remainder(bigInteger39);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1]");
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-1" + "'", str45, "-1");
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0.0cn0.0cn0.0", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0cn0.0cn0.0" + "'", str2, "0.0cn0.0cn0.0");
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("eNGLISCH (vEREINIGTES k\326NIGREICH)");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("korean##############################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "korean##############################################################################################" + "'", str1, "korean##############################################################################################");
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "Japanese", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaENGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Japanese" + "'", charSequence2, "Japanese");
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        java.math.BigInteger bigInteger0 = java.math.BigInteger.TEN;
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(bigInteger0);
        byte[] byteArray2 = bigInteger0.toByteArray();
        org.junit.Assert.assertNotNull(bigInteger0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("fR", 16, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fRxxxxxxxxxxxxxx" + "'", str3, "fRxxxxxxxxxxxxxx");
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) '4', (int) (short) 10);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("301.0", locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "301.0" + "'", str3, "301.0");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getVariant();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getVariant();
        boolean boolean8 = locale5.hasExtensions();
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.setDefault(category9, locale12);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getVariant();
        java.util.Locale.setDefault(category9, locale15);
        java.util.Locale locale18 = java.util.Locale.getDefault(category9);
        java.util.Locale locale19 = java.util.Locale.getDefault(category9);
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale.setDefault(category9, locale21);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale locale26 = builder25.build();
        java.util.Locale.setDefault(category23, locale26);
        java.util.Locale locale28 = java.util.Locale.getDefault(category23);
        java.util.Locale.setDefault(category9, locale28);
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder32 = builder31.clearExtensions();
        java.util.Locale locale33 = builder32.build();
        java.util.Locale.setDefault(category30, locale33);
        java.util.Locale locale35 = java.util.Locale.getDefault(category30);
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.lang.String str37 = locale36.getScript();
        java.util.Locale.setDefault(category30, locale36);
        java.lang.String str39 = locale36.getCountry();
        java.util.Locale.setDefault(category9, locale36);
        java.lang.String str41 = locale5.getDisplayVariant(locale36);
        java.util.Locale.setDefault(locale36);
        java.lang.String str43 = locale36.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.FORMAT + "'", category30.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "TW" + "'", str39, "TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str43, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder12 = builder9.setLocale(locale11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = builder15.build();
        java.util.Locale.setDefault(category13, locale16);
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale18.getDisplayVariant(locale20);
        java.lang.String str22 = locale20.getDisplayCountry();
        java.util.Locale.setDefault(category13, locale20);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.lang.String str25 = locale20.getDisplayVariant(locale24);
        java.util.Locale.Builder builder26 = builder9.setLocale(locale20);
        java.util.Locale.Builder builder28 = builder9.setRegion("cn");
        java.util.Locale.Builder builder30 = builder28.addUnicodeLocaleAttribute("engcn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder32 = builder30.setLanguageTag("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u5357\u97d3" + "'", str22, "\u5357\u97d3");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        java.lang.String[] strArray2 = java.util.Locale.getISOLanguages();
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("jpn", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaabaeafakamanarasavayazbabebgbbbmbnbobrbscaceccocrcscucvcydadedvdzeeeleneoeseteufaffffjfofrfygagdglgngugvaeortuyzadegknostuwjajjvkakgkkjkkklkmknkokrkskukvkwkylalblgllnloltlulvmgmmmkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapplpsptqurmrnrorurwsascsdsesgsskslsmsnsosqsrssstsusvswtatetgtttktltntotrtstttwtyugukuruzvevvowawoxyyozazzu" + "'", str8, "aaabaeafakamanarasavayazbabebgbbbmbnbobrbscaceccocrcscucvcydadedvdzeeeleneoeseteufaffffjfofrfygagdglgngugvaeortuyzadegknostuwjajjvkakgkkjkkklkmknkokrkskukvkwkylalblgllnloltlulvmgmmmkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapplpsptqurmrnrorurwsascsdsesgsskslsmsnsosqsrssstsusvswtatetgtttktltntotrtstttwtyugukuruzvevvowawoxyyozazzu");
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ko-KR");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList3, 'a');
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList23);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList17, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("", locale32);
        java.util.Locale.setDefault(locale32);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("", locale36);
        java.util.Locale.setDefault(locale36);
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale42);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale44.getDisplayLanguage();
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.upperCase("", locale47);
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        java.util.Locale locale50 = java.util.Locale.GERMANY;
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        java.lang.String str52 = locale51.getVariant();
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.util.Locale locale54 = locale53.stripExtensions();
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.util.Locale locale56 = locale55.stripExtensions();
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.util.Locale locale58 = java.util.Locale.PRC;
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.lang.String str60 = locale59.getScript();
        java.util.Locale locale61 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale32, locale36, locale39, locale42, locale44, locale47, locale49, locale50, locale51, locale53, locale56, locale57, locale58, locale59, locale61 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.Locale.FilteringMode filteringMode65 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList63, filteringMode65);
        java.util.List<java.util.Locale> localeList67 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList68);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str43, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u4e2d\u6587" + "'", str45, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + filteringMode65 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode65.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNotNull(localeList67);
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertNotNull(localeList69);
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal9 = bigDecimal7.min(bigDecimal8);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal[] bigDecimalArray16 = bigDecimal8.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal17 = bigDecimal5.min(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (short) 10);
        java.math.BigDecimal bigDecimal20 = bigDecimal5.subtract(bigDecimal19);
        int int21 = bigDecimal19.precision();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((double) (-1L));
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.lang.String str30 = bigDecimal25.toPlainString();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        double double32 = bigDecimal31.doubleValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal31.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger35 = bigDecimal31.unscaledValue();
        long long36 = bigDecimal31.longValue();
        java.math.BigDecimal bigDecimal37 = bigDecimal25.subtract(bigDecimal31);
        java.math.BigDecimal bigDecimal38 = bigDecimal31.ulp();
        java.math.BigDecimal bigDecimal39 = bigDecimal23.multiply(bigDecimal38);
        java.math.BigDecimal bigDecimal40 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal41 = bigDecimal19.max(bigDecimal40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.TEN;
        long long45 = bigDecimal44.longValueExact();
        java.math.BigDecimal bigDecimal46 = bigDecimal44.ulp();
        java.lang.String str47 = bigDecimal44.toString();
        int int48 = bigDecimal42.compareTo(bigDecimal44);
        java.math.BigInteger bigInteger49 = bigDecimal42.toBigInteger();
        java.math.BigDecimal bigDecimal50 = bigDecimal42.abs();
        java.math.BigDecimal bigDecimal51 = bigDecimal40.min(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimalArray16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10" + "'", str47, "10");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("ko", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("zh-TW                                                                                           ", (int) (byte) -2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger10 = bigInteger8.flipBit(1);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.lang.String str17 = bigInteger15.toString((int) (byte) 10);
        java.math.BigInteger bigInteger18 = bigInteger15.negate();
        java.math.BigInteger bigInteger19 = bigInteger8.min(bigInteger18);
        java.math.BigInteger bigInteger20 = bigInteger18.abs();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        double double28 = bigInteger27.doubleValue();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger34 = bigInteger27.gcd(bigInteger33);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        java.math.BigInteger bigInteger42 = bigInteger33.or(bigInteger41);
        short short43 = bigInteger33.shortValueExact();
        byte[] byteArray46 = new byte[] { (byte) 1 };
        byte byte47 = org.apache.commons.lang3.math.NumberUtils.min(byteArray46);
        java.math.BigInteger bigInteger48 = new java.math.BigInteger((int) (short) -1, byteArray46);
        java.math.BigInteger bigInteger50 = bigInteger48.pow((int) 'a');
        java.math.BigInteger bigInteger52 = bigInteger48.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger53 = bigInteger33.xor(bigInteger52);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal55 = bigDecimal54.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.TEN;
        long long57 = bigDecimal56.longValueExact();
        java.math.BigDecimal bigDecimal58 = bigDecimal56.ulp();
        java.lang.String str59 = bigDecimal56.toString();
        int int60 = bigDecimal54.compareTo(bigDecimal56);
        java.math.BigInteger bigInteger61 = bigDecimal54.toBigInteger();
        java.math.BigInteger bigInteger62 = bigInteger53.gcd(bigInteger61);
        java.math.BigInteger bigInteger63 = bigInteger18.or(bigInteger53);
        java.lang.String str65 = bigInteger53.toString((int) (byte) -2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1]");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) -1 + "'", short43 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1]");
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 1 + "'", byte47 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L + "'", long57 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "10" + "'", str59, "10");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1" + "'", str65, "1");
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr-FRDeutschland");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder9.build();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getDisplayName();
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale15);
        java.lang.String str17 = locale15.getCountry();
        java.lang.String str18 = locale15.getVariant();
        java.util.Locale locale19 = locale15.stripExtensions();
        java.lang.String str20 = locale12.getDisplayScript(locale15);
        java.lang.String str21 = locale11.getDisplayLanguage(locale12);
        java.lang.String str22 = locale1.getDisplayLanguage(locale12);
        java.lang.String str24 = locale1.getExtension('u');
        java.lang.Object obj25 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u82f1\u6587\u82f1\u570b)" + "'", str13, "\u82f1\u6587\u82f1\u570b)");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str16, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FR" + "'", str17, "FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "French" + "'", str22, "French");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "fr");
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u6587\u82f1\u56fd", "");
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale4.getDisplayName(locale5);
        java.lang.String str9 = locale2.getDisplayScript(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale4.getUnicodeLocaleType("                                                                                                                 anglais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                                                                                                  anglais");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587\u82f1\u56fd");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u53f0\u7063" + "'", str7, "\u53f0\u7063");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u97d3\u6587\u5357\u97d3)" + "'", str8, "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayVariant(locale2);
        java.lang.String str6 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) '#', 120);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.negate();
        java.lang.String str6 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(objArray11, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean16 = bigDecimal8.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal17 = bigDecimal3.max(bigDecimal8);
        java.math.BigDecimal bigDecimal18 = bigDecimal2.min(bigDecimal3);
        long long19 = bigDecimal18.longValueExact();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                    ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        int int12 = bigDecimal8.compareTo(bigDecimal9);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = bigDecimal8.add(bigDecimal14);
        java.math.BigDecimal bigDecimal16 = bigDecimal14.plus();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        long long18 = bigDecimal17.longValueExact();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.ulp();
        java.lang.String str20 = bigDecimal17.toString();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.ZERO;
        double double24 = bigDecimal23.doubleValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal23.movePointLeft((int) (byte) -1);
        int int27 = bigDecimal26.intValue();
        java.math.BigDecimal bigDecimal28 = bigDecimal21.add(bigDecimal26);
        java.math.BigDecimal bigDecimal29 = bigDecimal17.add(bigDecimal28);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal34 = bigDecimal32.negate();
        java.lang.String str35 = bigDecimal34.toEngineeringString();
        java.math.BigDecimal bigDecimal36 = bigDecimal31.multiply(bigDecimal34);
        java.math.BigDecimal bigDecimal38 = bigDecimal34.movePointRight(100);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal41 = bigDecimal39.negate();
        int int42 = bigDecimal38.compareTo(bigDecimal39);
        java.math.BigDecimal bigDecimal43 = bigDecimal17.min(bigDecimal38);
        java.math.BigDecimal bigDecimal44 = bigDecimal14.remainder(bigDecimal17);
        java.math.BigInteger bigInteger45 = bigDecimal44.unscaledValue();
        byte byte46 = bigDecimal44.byteValueExact();
        java.math.BigDecimal bigDecimal47 = bigDecimal44.plus();
        short short48 = bigDecimal44.shortValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 0 + "'", byte46 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 0 + "'", short48 == (short) 0);
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(byteArray13);
        boolean boolean17 = bigInteger4.equals((java.lang.Object) byteArray13);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        double double25 = bigInteger24.doubleValue();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        java.math.BigInteger bigInteger30 = new java.math.BigInteger((int) (short) -1, byteArray28);
        java.math.BigInteger bigInteger31 = bigInteger24.gcd(bigInteger30);
        java.math.BigInteger bigInteger32 = bigInteger4.and(bigInteger30);
        float float33 = bigInteger30.floatValue();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger39 = new java.math.BigInteger(byteArray36);
        java.math.BigInteger bigInteger40 = new java.math.BigInteger(byteArray36);
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal42 = bigDecimal41.negate();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal42.subtract(bigDecimal45);
        java.math.BigInteger bigInteger47 = bigDecimal46.toBigInteger();
        double double48 = bigInteger47.doubleValue();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger54 = bigInteger47.gcd(bigInteger53);
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal56 = bigDecimal55.negate();
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal60 = bigDecimal56.subtract(bigDecimal59);
        java.math.BigInteger bigInteger61 = bigDecimal60.toBigInteger();
        java.math.BigInteger bigInteger62 = bigInteger53.or(bigInteger61);
        double double63 = bigInteger62.doubleValue();
        java.math.BigInteger bigInteger64 = bigInteger40.divide(bigInteger62);
        java.math.BigInteger bigInteger66 = bigInteger62.pow(3);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger67 = bigInteger30.mod(bigInteger62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger: modulus not positive");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger66);
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal14 = bigDecimal10.subtract(bigDecimal13);
        java.math.BigInteger bigInteger15 = bigDecimal14.toBigInteger();
        double double16 = bigInteger15.doubleValue();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray19);
        java.math.BigInteger bigInteger21 = new java.math.BigInteger((int) (short) -1, byteArray19);
        java.math.BigInteger bigInteger22 = bigInteger15.gcd(bigInteger21);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal28 = bigDecimal24.subtract(bigDecimal27);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigInteger();
        java.math.BigInteger bigInteger30 = bigInteger21.or(bigInteger29);
        boolean boolean32 = bigInteger30.testBit(117);
        byte[] byteArray35 = new byte[] { (byte) 1 };
        byte byte36 = org.apache.commons.lang3.math.NumberUtils.min(byteArray35);
        java.math.BigInteger bigInteger37 = new java.math.BigInteger((int) (short) -1, byteArray35);
        java.math.BigInteger bigInteger39 = bigInteger37.pow((int) 'a');
        java.math.BigInteger bigInteger41 = bigInteger37.flipBit((int) 'a');
        java.math.BigInteger bigInteger42 = bigInteger30.divide(bigInteger41);
        java.lang.String str43 = bigInteger30.toString();
        byte[] byteArray46 = new byte[] { (byte) 1 };
        byte byte47 = org.apache.commons.lang3.math.NumberUtils.min(byteArray46);
        java.math.BigInteger bigInteger48 = new java.math.BigInteger((int) (short) -1, byteArray46);
        java.math.BigInteger bigInteger50 = bigInteger48.pow((int) 'a');
        byte[] byteArray51 = bigInteger48.toByteArray();
        long long52 = bigInteger48.longValueExact();
        byte byte53 = bigInteger48.byteValueExact();
        java.lang.String str55 = bigInteger48.toString((int) (byte) 10);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger62.negate();
        java.math.BigInteger bigInteger64 = bigInteger48.xor(bigInteger62);
        java.math.BigInteger bigInteger65 = bigInteger30.subtract(bigInteger62);
        byte[] byteArray68 = new byte[] { (byte) 1 };
        byte byte69 = org.apache.commons.lang3.math.NumberUtils.min(byteArray68);
        java.math.BigInteger bigInteger70 = new java.math.BigInteger((int) (short) -1, byteArray68);
        java.math.BigInteger bigInteger72 = bigInteger70.pow((int) 'a');
        java.math.BigInteger bigInteger74 = bigInteger70.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger75 = bigInteger62.min(bigInteger70);
        java.math.BigInteger bigInteger76 = bigInteger8.max(bigInteger75);
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal78 = bigDecimal77.negate();
        java.math.BigDecimal bigDecimal81 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal82 = bigDecimal78.subtract(bigDecimal81);
        java.math.BigInteger bigInteger83 = bigDecimal82.toBigInteger();
        java.math.BigInteger bigInteger84 = bigInteger83.negate();
        java.math.BigInteger bigInteger86 = bigInteger84.flipBit((int) (short) 0);
        byte byte87 = bigInteger86.byteValueExact();
        java.math.BigInteger bigInteger88 = bigInteger76.remainder(bigInteger86);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 1 + "'", byte36 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-1" + "'", str43, "-1");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1]");
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 1 + "'", byte47 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) -1 + "'", byte53 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-1" + "'", str55, "-1");
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[1]");
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 1 + "'", byte69 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertTrue("'" + byte87 + "' != '" + (byte) 1 + "'", byte87 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger88);
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal12 = bigDecimal10.min(bigDecimal11);
        java.lang.String str13 = bigDecimal10.toPlainString();
        boolean boolean14 = bigInteger8.equals((java.lang.Object) bigDecimal10);
        java.lang.String str16 = bigInteger8.toString((int) (byte) 10);
        java.lang.String str18 = bigInteger8.toString((int) '4');
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray21);
        java.math.BigInteger bigInteger23 = new java.math.BigInteger((int) (short) -1, byteArray21);
        java.math.BigInteger bigInteger25 = bigInteger23.pow((int) 'a');
        java.math.BigInteger bigInteger27 = bigInteger23.shiftLeft((int) (short) 1);
        boolean boolean29 = bigInteger27.isProbablePrime((int) '4');
        short short30 = bigInteger27.shortValueExact();
        int int31 = bigInteger8.compareTo(bigInteger27);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        java.math.BigInteger bigInteger39 = bigInteger38.negate();
        byte byte40 = bigInteger38.byteValueExact();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal42 = bigDecimal41.negate();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal42.subtract(bigDecimal45);
        java.math.BigInteger bigInteger47 = bigDecimal46.toBigInteger();
        double double48 = bigInteger47.doubleValue();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger54 = bigInteger47.gcd(bigInteger53);
        java.math.BigInteger bigInteger55 = bigInteger53.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        double double63 = bigInteger62.doubleValue();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger((int) (short) -1, byteArray66);
        java.math.BigInteger bigInteger69 = bigInteger62.gcd(bigInteger68);
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal71 = bigDecimal70.negate();
        java.math.BigDecimal bigDecimal74 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal75 = bigDecimal71.subtract(bigDecimal74);
        java.math.BigInteger bigInteger76 = bigDecimal75.toBigInteger();
        java.math.BigInteger bigInteger77 = bigInteger68.or(bigInteger76);
        short short78 = bigInteger68.shortValueExact();
        byte byte79 = bigInteger68.byteValueExact();
        java.math.BigInteger bigInteger80 = bigInteger53.and(bigInteger68);
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger87 = bigInteger85.pow((int) 'a');
        java.math.BigInteger bigInteger89 = bigInteger85.shiftLeft((int) (short) 1);
        int int90 = bigInteger89.intValueExact();
        java.math.BigInteger bigInteger91 = bigInteger89.abs();
        java.math.BigInteger bigInteger92 = bigInteger68.multiply(bigInteger91);
        java.math.BigInteger bigInteger93 = bigInteger38.multiply(bigInteger91);
        int int94 = bigInteger8.compareTo(bigInteger91);
        java.math.BigInteger bigInteger96 = bigInteger8.clearBit(11);
        java.math.BigInteger bigInteger97 = bigInteger8.not();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-2" + "'", str16, "-2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-2" + "'", str18, "-2");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -2 + "'", short30 == (short) -2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) -1 + "'", short78 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) -1 + "'", byte79 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[1]");
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-2) + "'", int90 == (-2));
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNotNull(bigInteger96);
        org.junit.Assert.assertNotNull(bigInteger97);
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("zh-c", "0", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("pn", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigInteger bigInteger17 = bigInteger13.shiftLeft((int) (short) 1);
        int int18 = bigInteger17.intValueExact();
        int int19 = bigInteger6.compareTo(bigInteger17);
        float float20 = bigInteger17.floatValue();
        java.math.BigInteger bigInteger22 = bigInteger17.pow((int) 'u');
        java.math.BigInteger bigInteger24 = bigInteger17.shiftLeft(32);
        java.math.BigInteger bigInteger26 = bigInteger24.shiftLeft((int) (short) -5);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = bigInteger26.nextProbablePrime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: start < 0: -268435456");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-2.0f) + "'", float20 == (-2.0f));
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger26);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Englis...");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getISO3Language();
        boolean boolean4 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Koreanisch (S\374dkorea)", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koreanisch (S\374dkorea)" + "'", str3, "Koreanisch (S\374dkorea)");
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\u52a0\u62ff\u5927 ", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u52a0\u62ff\u5927 " + "'", str2, "\u52a0\u62ff\u5927 ");
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "US", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u5fb7\u6587\u5fb7\u56fd)");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("UNITEDxSTATES", "rbgrbgrbgrbgrbgHindirbgrbgrbgrbgrbg");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.abs();
        java.lang.Class<?> wildcardClass2 = bigDecimal0.getClass();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "DE", (java.lang.CharSequence) "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "DE" + "'", charSequence2, "DE");
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getUnicodeLocaleType("\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: AAA?? (??AAA?? (??AAA?? (??AAA?? (??AAA?? (??AAA?? (??AAA?? (??AAA??                                                    ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FR", (int) (short) 1);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("#", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("\u82f1\u6587\u82f1\u56fd", (java.lang.Object[]) strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("GBR", strArray6, strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zho");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", strArray16, strArray19);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("ita", strArray6, strArray19);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "#####aad#####");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str12, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GBR" + "'", str13, "GBR");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str20, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ita" + "'", str22, "ita");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("UxitxdxStxtxs", "\u82f1\u6587");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", locale1);
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.lang.String str10 = locale1.getDisplayScript(locale4);
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("zh-CN", locale12);
        java.util.Locale locale16 = locale12.stripExtensions();
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.lang.String str18 = locale17.getCountry();
        java.lang.String str19 = locale12.getDisplayLanguage(locale17);
        java.lang.String str20 = locale4.getDisplayScript(locale17);
        java.util.Locale locale21 = java.util.Locale.UK;
        java.lang.String str22 = locale21.getDisplayScript();
        java.lang.String str23 = locale17.getDisplayLanguage(locale21);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "jpn" + "'", str8, "jpn");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English" + "'", str13, "English");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-cn" + "'", str15, "zh-cn");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u82f1\u6587" + "'", str19, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chinese" + "'", str23, "Chinese");
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 34, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger10 = bigInteger8.flipBit(1);
        double double11 = bigInteger10.doubleValue();
        int int12 = bigInteger10.intValue();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-4.0d) + "'", double11 == (-4.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\uc601\uad6d", "1.0E+21.0E+21.0E+2", 1073741825);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.MathContext mathContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigDecimal4.abs(mathContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("\u65e5\u6587\u65e5\u672c)", (int) (byte) 2);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587\u65e5\u672c\u65e5\u6587\u65e5\u672c)" + "'", str2, "\u65e5\u6587\u65e5\u672c\u65e5\u6587\u65e5\u672c)");
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("KR", "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KR" + "'", str2, "KR");
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 20L);
        java.lang.String str2 = bigDecimal1.toEngineeringString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20" + "'", str2, "20");
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)", ")");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("UNITED STATES                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: UNITED STATES                                                                                    ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)_)");
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("GBR", "jpn", (int) (short) 1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("en-US", strArray10, strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "engCN");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(")", strArray6, strArray10);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN");
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927", strArray10);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.startsWithAny("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", strArray10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en_US" + "'", str11, "en_US");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en_US" + "'", str16, "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ")" + "'", str17, ")");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("zh-cn", "0.00000000000000000000000000000000SETATS DETINU", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cn" + "'", str3, "zh-cn");
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigInteger bigInteger11 = bigDecimal10.toBigInteger();
        double double12 = bigInteger11.doubleValue();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger18 = bigInteger11.gcd(bigInteger17);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal20 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal24 = bigDecimal20.subtract(bigDecimal23);
        java.math.BigInteger bigInteger25 = bigDecimal24.toBigInteger();
        java.math.BigInteger bigInteger26 = bigInteger17.or(bigInteger25);
        short short27 = bigInteger17.shortValueExact();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger34 = bigInteger32.pow((int) 'a');
        java.math.BigInteger bigInteger36 = bigInteger32.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger37 = bigInteger17.xor(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        long long41 = bigDecimal40.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.lang.String str43 = bigDecimal40.toString();
        int int44 = bigDecimal38.compareTo(bigDecimal40);
        java.math.BigInteger bigInteger45 = bigDecimal38.toBigInteger();
        java.math.BigInteger bigInteger46 = bigInteger37.gcd(bigInteger45);
        java.math.BigInteger bigInteger47 = bigInteger4.gcd(bigInteger46);
        double double48 = bigInteger4.doubleValue();
        double double49 = bigInteger4.doubleValue();
        boolean boolean51 = bigInteger4.testBit((int) (short) 0);
        java.math.BigInteger bigInteger52 = bigInteger4.not();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(bigInteger52);
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (-10), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1.0E+2");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0E+2\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigInteger27.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger32 = bigInteger12.xor(bigInteger31);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.TEN;
        long long36 = bigDecimal35.longValueExact();
        java.math.BigDecimal bigDecimal37 = bigDecimal35.ulp();
        java.lang.String str38 = bigDecimal35.toString();
        int int39 = bigDecimal33.compareTo(bigDecimal35);
        java.math.BigInteger bigInteger40 = bigDecimal33.toBigInteger();
        java.math.BigInteger bigInteger41 = bigInteger32.gcd(bigInteger40);
        java.math.BigInteger bigInteger42 = bigInteger41.negate();
        byte[] byteArray43 = bigInteger41.toByteArray();
        int int44 = bigInteger41.bitCount();
        java.math.BigInteger bigInteger46 = bigInteger41.setBit(52);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10" + "'", str38, "10");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(bigInteger46);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("UNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUND     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("China", 301, "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StUnited StatesUnited StatesUnited StatesUnited StChinaUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StUnited StatesUnited StatesUnited StatesUnited St" + "'", str3, "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StUnited StatesUnited StatesUnited StatesUnited StChinaUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StUnited StatesUnited StatesUnited StatesUnited St");
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(byteArray13);
        boolean boolean17 = bigInteger4.equals((java.lang.Object) byteArray13);
        java.lang.String str18 = bigInteger4.toString();
        byte[] byteArray19 = bigInteger4.toByteArray();
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray19);
        java.math.BigInteger bigInteger21 = new java.math.BigInteger(byteArray19);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(bigInteger21, (-2));
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        boolean boolean24 = bigInteger12.testBit((int) (short) 0);
        short short25 = bigInteger12.shortValueExact();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = bigInteger12.pow((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Negative exponent");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "   #_eng                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      " + "'", str1, "eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (short) 1024);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        java.util.Locale locale3 = new java.util.Locale("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi", "en-us");
        java.lang.String str4 = locale3.getLanguage();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI_en-us");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        java.lang.String[] strArray2 = java.util.Locale.getISOLanguages();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'u');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("cn", strArray2);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\u30a4\u30bf\u30ea\u30a2\u8a9e", strArray2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 188 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aauabuaeuafuakuamuanuaruasuavuayuazubaubeubgubhubiubmubnuboubrubsucauceuchucoucrucsucuucvucyudaudeudvudzueeueluenueouesuetueuufauffufiufjufoufrufyugaugduglugnuguugvuhauheuhiuhouhruhtuhuuhyuhzuiauiduieuiguiiuikuinuiouisuituiuuiwujaujiujvukaukgukiukjukkuklukmuknukoukruksukuukvukwukyulaulbulguliulnuloultuluulvumgumhumiumkumlumnumoumrumsumtumyunaunbunduneungunlunnunounrunvunyuocuojuomuoruosupaupiuplupsuptuquurmurnurouruurwusauscusduseusgusiuskuslusmusnusousqusrussustusuusvuswutauteutguthutiutkutlutnutoutrutsuttutwutyuuguukuuruuzuveuviuvouwauwouxhuyiuyouzauzhuzu" + "'", str4, "aauabuaeuafuakuamuanuaruasuavuayuazubaubeubgubhubiubmubnuboubrubsucauceuchucoucrucsucuucvucyudaudeudvudzueeueluenueouesuetueuufauffufiufjufoufrufyugaugduglugnuguugvuhauheuhiuhouhruhtuhuuhyuhzuiauiduieuiguiiuikuinuiouisuituiuuiwujaujiujvukaukgukiukjukkuklukmuknukoukruksukuukvukwukyulaulbulguliulnuloultuluulvumgumhumiumkumlumnumoumrumsumtumyunaunbunduneungunlunnunounrunvunyuocuojuomuoruosupaupiuplupsuptuquurmurnurouruurwusauscusduseusgusiuskuslusmusnusousqusrussustusuusvuswutauteutguthutiutkutlutnutoutrutsuttutwutyuuguukuuruuzuveuviuvouwauwouxhuyiuyouzauzhuzu");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        double double15 = bigInteger14.doubleValue();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger21 = bigInteger14.gcd(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigInteger bigInteger29 = bigInteger20.or(bigInteger28);
        java.math.BigInteger bigInteger30 = bigInteger6.or(bigInteger28);
        java.math.BigInteger bigInteger32 = bigInteger28.pow(5);
        float float33 = bigInteger32.floatValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.lang.String str6 = bigInteger4.toString((int) (byte) 10);
        int int7 = bigInteger4.intValueExact();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("\uc911\uad6d\uc5b4\uc911\uad6d)");
        java.lang.String str11 = locale9.getExtension('a');
        boolean boolean12 = bigInteger4.equals((java.lang.Object) 'a');
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal15.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal18 = bigDecimal15.plus();
        java.math.BigInteger bigInteger19 = bigDecimal18.toBigInteger();
        java.math.BigInteger bigInteger20 = bigInteger4.add(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CN");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cn" + "'", str2, "cn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cn" + "'", str3, "cn");
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal((double) 1L);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((double) 117);
        double double25 = bigDecimal24.doubleValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal22.min(bigDecimal24);
        int int27 = bigDecimal19.compareTo(bigDecimal24);
        java.math.BigDecimal bigDecimal28 = bigDecimal19.stripTrailingZeros();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte31 = bigDecimal30.byteValueExact();
        java.math.BigDecimal bigDecimal33 = bigDecimal30.pow(2);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.TEN;
        long long37 = bigDecimal36.longValueExact();
        java.math.BigDecimal bigDecimal38 = bigDecimal36.ulp();
        java.lang.String str39 = bigDecimal36.toString();
        int int40 = bigDecimal34.compareTo(bigDecimal36);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal44 = bigDecimal36.divide(bigDecimal42, (int) (short) 1);
        java.math.BigDecimal bigDecimal45 = bigDecimal33.add(bigDecimal36);
        java.math.BigDecimal bigDecimal46 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal47 = bigDecimal19.max(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 117.0d + "'", double25 == 117.0d);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10" + "'", str39, "10");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale0.getDisplayName(locale4);
        java.util.Locale locale6 = locale0.stripExtensions();
        java.lang.String str8 = locale6.getUnicodeLocaleType("ja");
        java.lang.Object obj9 = locale6.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str5, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "de_DE");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "de_DE");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "de_DE");
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("1.00E-98", "En-US", 299);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.00E-98" + "'", str3, "1.00E-98");
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 301, (int) '4');
        java.lang.String str3 = bigDecimal2.toString();
        int int4 = bigDecimal2.intValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3.01E-50" + "'", str3, "3.01E-50");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigInteger bigInteger27 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal28 = bigDecimal20.ulp();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal32 = bigDecimal30.min(bigDecimal31);
        int int33 = bigDecimal20.compareTo(bigDecimal32);
        int int34 = bigDecimal19.compareTo(bigDecimal32);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal38 = bigDecimal37.plus();
        java.math.BigDecimal[] bigDecimalArray39 = bigDecimal32.divideAndRemainder(bigDecimal37);
        long long40 = bigDecimal32.longValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (short) -20000, "E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("13", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        java.util.Locale locale3 = new java.util.Locale("", "VEREINIGTES K\326NIGREICH", "gbr");
        org.junit.Assert.assertEquals(locale3.toString(), "_VEREINIGTES K\326NIGREICH_gbr");
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("fr-FRDeutschland", "etats-Unis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        int int23 = bigInteger12.getLowestSetBit();
        long long24 = bigInteger12.longValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.not();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        java.math.BigInteger bigInteger30 = new java.math.BigInteger((int) (short) -1, byteArray28);
        java.math.BigInteger bigInteger32 = bigInteger30.pow((int) 'a');
        int int33 = bigInteger32.bitCount();
        java.math.BigInteger bigInteger34 = bigInteger12.or(bigInteger32);
        java.math.BigInteger bigInteger36 = bigInteger32.shiftLeft((int) (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger36);
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u671d\u9c9c\u6587", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u671d\u9c9c\u6587" + "'", str2, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray1);
        java.math.BigInteger bigInteger8 = bigInteger6.pow(3);
        int int9 = bigInteger6.getLowestSetBit();
        int int10 = bigInteger6.intValueExact();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        int int6 = bigInteger5.bitCount();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        java.math.MathContext mathContext1 = null;
        java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((double) 0, mathContext1);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        org.junit.Assert.assertNotNull(bigDecimal3);
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(52.0f, (float) (-1025), (float) 563);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 563.0f + "'", float3 == 563.0f);
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("anglais", "KR");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        long long24 = bigDecimal23.longValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.ulp();
        java.math.BigDecimal bigDecimal27 = bigDecimal23.setScale((-33));
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal27);
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getVariant();
        java.lang.String str5 = locale1.getScript();
        java.lang.String str6 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French (France)" + "'", str6, "French (France)");
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("JAJAJAJAJAJAJhi!JAJAJAJAJAJAJA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAJAJAJAJAJAJhi!JAJAJAJAJAJAJA" + "'", str1, "JAJAJAJAJAJAJhi!JAJAJAJAJAJAJA");
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        java.util.Locale locale1 = new java.util.Locale("fr-FR-u-engcn");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("fr-FRDeutschland");
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "fr-fr-u-engcn");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal3 = bigDecimal0.abs();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigDecimal bigDecimal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigDecimal4.max(bigDecimal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        double double15 = bigInteger14.doubleValue();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger21 = bigInteger14.gcd(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigInteger bigInteger29 = bigInteger20.or(bigInteger28);
        java.math.BigInteger bigInteger30 = bigInteger6.or(bigInteger28);
        java.math.BigInteger bigInteger32 = bigInteger28.flipBit(2);
        java.lang.String str34 = bigInteger32.toString((int) (short) -1);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4" + "'", str34, "4");
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)U...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setScript("        FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:         FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        double double16 = bigDecimal15.doubleValue();
        java.math.BigInteger bigInteger17 = bigDecimal15.toBigInteger();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray20);
        java.math.BigInteger bigInteger22 = new java.math.BigInteger((int) (short) -1, byteArray20);
        java.math.BigInteger bigInteger24 = bigInteger22.pow((int) 'a');
        byte[] byteArray25 = bigInteger22.toByteArray();
        long long26 = bigInteger22.longValueExact();
        java.math.BigInteger bigInteger27 = bigInteger17.or(bigInteger22);
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger34 = bigInteger32.pow((int) 'a');
        byte[] byteArray35 = bigInteger32.toByteArray();
        long long36 = bigInteger32.longValueExact();
        java.lang.String str38 = bigInteger32.toString(0);
        int int39 = bigInteger32.intValueExact();
        java.math.BigInteger bigInteger40 = bigInteger27.subtract(bigInteger32);
        java.math.BigInteger bigInteger41 = bigInteger12.subtract(bigInteger40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigInteger bigInteger56 = bigInteger54.negate();
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal58 = bigDecimal57.negate();
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal62 = bigDecimal58.subtract(bigDecimal61);
        java.math.BigInteger bigInteger63 = bigDecimal62.toBigInteger();
        double double64 = bigInteger63.doubleValue();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        byte byte68 = org.apache.commons.lang3.math.NumberUtils.min(byteArray67);
        java.math.BigInteger bigInteger69 = new java.math.BigInteger((int) (short) -1, byteArray67);
        java.math.BigInteger bigInteger70 = bigInteger63.gcd(bigInteger69);
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal72 = bigDecimal71.negate();
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal76 = bigDecimal72.subtract(bigDecimal75);
        java.math.BigInteger bigInteger77 = bigDecimal76.toBigInteger();
        java.math.BigInteger bigInteger78 = bigInteger69.or(bigInteger77);
        short short79 = bigInteger69.shortValueExact();
        byte byte80 = bigInteger69.byteValueExact();
        java.math.BigInteger bigInteger81 = bigInteger54.and(bigInteger69);
        java.math.BigInteger bigInteger82 = bigInteger54.negate();
        java.math.BigInteger bigInteger83 = bigInteger41.multiply(bigInteger82);
        java.math.BigInteger bigInteger85 = bigInteger82.flipBit(13);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1" + "'", str38, "-1");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1]");
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 1 + "'", byte68 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) -1 + "'", short79 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) -1 + "'", byte80 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger85);
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("en-CA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ", (-1025));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "rman (Germany)", (-4));
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale7.getDisplayVariant(locale11);
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale locale17 = java.util.Locale.UK;
        java.lang.String str18 = locale17.getISO3Language();
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("\u82f1\u6587\u82f1\u56fd", locale17);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.setLanguageTag("eng");
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder25 = builder23.setLocale(locale24);
        java.util.Locale.Builder builder27 = builder25.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder29 = builder25.setScript("");
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("-1UND0");
        java.util.Locale.Builder builder32 = builder25.setLocale(locale31);
        java.util.Locale.Builder builder33 = builder25.clearExtensions();
        java.util.Locale locale34 = builder33.build();
        java.lang.String str35 = locale17.getDisplayName(locale34);
        java.lang.String str36 = locale34.toLanguageTag();
        java.lang.String str37 = locale11.getDisplayScript(locale34);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "South Korea" + "'", str9, "South Korea");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "eng" + "'", str18, "eng");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u82f1\u6587\u82f1\u56fd" + "'", str19, "\u82f1\u6587\u82f1\u56fd");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "English (United Kingdom)" + "'", str35, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "und" + "'", str36, "und");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd)", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ko", "\u671d\u9c9c\u6587                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.movePointLeft((int) (byte) -1);
        int int6 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal0.add(bigDecimal5);
        long long8 = bigDecimal0.longValue();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        double double10 = bigDecimal9.doubleValue();
        int int11 = bigDecimal9.intValue();
        int int12 = bigDecimal9.scale();
        byte byte13 = bigDecimal9.byteValueExact();
        byte byte14 = bigDecimal9.byteValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal0.add(bigDecimal9);
        java.math.BigDecimal bigDecimal17 = bigDecimal9.setScale(0);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal17);
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("enfr_FR_#u-engc", "Koreanisch(S\374dkorea)Koreanisch(S\374dkorea)Koreanisch(S\374dkorea)Koreanisch(S\374dkorea)Koreanisch(S\374dkEN-US", (int) (short) -18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEnhinh", "en-GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(34.0d, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", (int) (byte) -1, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("frz-C aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frz-C uuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "frz-C uuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("-1.0", "20");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0" + "'", str2, "-1.0");
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\u6cd5\u56fd", "rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("zh-TW                                                                                            ", "                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-TW                                                                                            " + "'", str2, "zh-TW                                                                                            ");
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("eng");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale locale12 = builder11.build();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", locale12);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.setDefault(category14, locale17);
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getVariant();
        java.util.Locale.setDefault(category14, locale20);
        java.util.Locale locale23 = java.util.Locale.getDefault(category14);
        java.util.Locale locale24 = java.util.Locale.getDefault(category14);
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Locale.setDefault(category14, locale26);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clearExtensions();
        java.util.Locale locale31 = builder30.build();
        java.util.Locale.setDefault(category28, locale31);
        java.util.Locale locale33 = java.util.Locale.getDefault(category28);
        java.util.Locale.setDefault(category14, locale33);
        java.util.Locale.Category category35 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder36.clearExtensions();
        java.util.Locale locale38 = builder37.build();
        java.util.Locale.setDefault(category35, locale38);
        java.util.Locale locale40 = java.util.Locale.getDefault(category35);
        java.util.Locale locale41 = java.util.Locale.TAIWAN;
        java.lang.String str42 = locale41.getScript();
        java.util.Locale.setDefault(category35, locale41);
        java.lang.String str44 = locale41.getCountry();
        java.util.Locale.setDefault(category14, locale41);
        java.lang.String str46 = locale12.getDisplayVariant(locale41);
        java.util.Set<java.lang.String> strSet47 = locale41.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str13, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.FORMAT + "'", category28.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.FORMAT + "'", category35.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "TW" + "'", str44, "TW");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("2ETAT2-D)aeroK htuoS( naeroK", "0.00000000000000000000000000000000SETATS DETINU");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", 94);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Radix out of range");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\u5927\u97d3\u6c11\u56fd", "DE", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5927\u97d3\u6c11\u56fd" + "'", str3, "\u5927\u97d3\u6c11\u56fd");
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("chn");
        java.util.Locale.Builder builder6 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setUnicodeLocaleKeyword("south Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: south Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger15 = bigInteger13.shiftRight((int) (short) 100);
        java.math.BigInteger bigInteger17 = bigInteger13.shiftRight((-10));
        short short18 = bigInteger17.shortValueExact();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal20 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal24 = bigDecimal20.subtract(bigDecimal23);
        java.math.BigInteger bigInteger25 = bigDecimal24.toBigInteger();
        double double26 = bigInteger25.doubleValue();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        byte byte30 = org.apache.commons.lang3.math.NumberUtils.min(byteArray29);
        java.math.BigInteger bigInteger31 = new java.math.BigInteger((int) (short) -1, byteArray29);
        java.math.BigInteger bigInteger32 = bigInteger25.gcd(bigInteger31);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal38 = bigDecimal34.subtract(bigDecimal37);
        java.math.BigInteger bigInteger39 = bigDecimal38.toBigInteger();
        java.math.BigInteger bigInteger40 = bigInteger31.or(bigInteger39);
        short short41 = bigInteger31.shortValueExact();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        byte byte45 = org.apache.commons.lang3.math.NumberUtils.min(byteArray44);
        java.math.BigInteger bigInteger46 = new java.math.BigInteger((int) (short) -1, byteArray44);
        java.math.BigInteger bigInteger48 = bigInteger46.pow((int) 'a');
        java.math.BigInteger bigInteger50 = bigInteger46.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger51 = bigInteger31.xor(bigInteger50);
        java.math.BigInteger bigInteger52 = bigInteger50.not();
        java.math.BigInteger bigInteger53 = bigInteger17.mod(bigInteger52);
        java.math.BigInteger bigInteger54 = bigInteger52.abs();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1024 + "'", short18 == (short) 1024);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 1 + "'", byte30 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) -1 + "'", short41 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 1 + "'", byte45 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger54);
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("eng");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = builder10.build();
        java.lang.String str13 = locale12.getDisplayCountry();
        java.util.Locale.Builder builder14 = builder7.setLocale(locale12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("\u9c9c\u6587\u97e9\u56fd)", locale12);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.lang.String str17 = locale16.getVariant();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale18.getDisplayCountry();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale18.getDisplayLanguage();
        java.lang.String str22 = locale12.getDisplayLanguage(locale18);
        java.lang.String str23 = locale12.getScript();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u9c9c\u6587\u97e9\u56fd)" + "'", str15, "\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str21, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!", (java.lang.CharSequence) "-1UND0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "h", 4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("kr", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("en-us", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale1.toLanguageTag();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("zh-CN", locale1);
        java.lang.String str5 = locale1.getCountry();
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.lang.String str10 = locale6.getDisplayCountry(locale8);
        java.lang.String str11 = locale1.getDisplayLanguage(locale8);
        java.lang.String str13 = locale1.getExtension('a');
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale15);
        java.lang.String str17 = locale15.getCountry();
        java.lang.String str18 = locale15.getVariant();
        java.util.Locale locale19 = locale15.stripExtensions();
        java.lang.String str20 = locale19.getISO3Country();
        java.lang.String str21 = locale1.getDisplayCountry(locale19);
        java.util.Set<java.lang.String> strSet22 = locale1.getUnicodeLocaleAttributes();
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("eng", "GBR");
        boolean boolean26 = locale1.equals((java.lang.Object) "GBR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str2, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ja" + "'", str3, "ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-cn" + "'", str4, "zh-cn");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Japanese" + "'", str11, "Japanese");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str16, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FR" + "'", str17, "FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FRA" + "'", str20, "FRA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList17, filteringMode20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("English");
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList43);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList53);
        java.lang.String str56 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList53);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.lowerCase("", locale61);
        java.util.Locale.setDefault(locale61);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.lowerCase("", locale65);
        java.util.Locale.setDefault(locale65);
        java.util.Locale locale68 = java.util.Locale.KOREA;
        java.util.Locale locale69 = locale68.stripExtensions();
        java.util.Locale locale71 = java.util.Locale.FRANCE;
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale71);
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.lang.String str74 = locale73.getDisplayLanguage();
        java.util.Locale locale76 = java.util.Locale.getDefault();
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.upperCase("", locale76);
        java.util.Locale locale78 = java.util.Locale.GERMANY;
        java.util.Locale locale79 = java.util.Locale.GERMANY;
        java.util.Locale locale80 = java.util.Locale.GERMANY;
        java.lang.String str81 = locale80.getVariant();
        java.util.Locale locale82 = java.util.Locale.KOREA;
        java.util.Locale locale83 = locale82.stripExtensions();
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.util.Locale locale85 = locale84.stripExtensions();
        java.util.Locale locale86 = java.util.Locale.KOREA;
        java.util.Locale locale87 = java.util.Locale.PRC;
        java.util.Locale locale88 = java.util.Locale.KOREA;
        java.lang.String str89 = locale88.getScript();
        java.util.Locale locale90 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale61, locale65, locale68, locale71, locale73, locale76, locale78, locale79, locale80, locale82, locale85, locale86, locale87, locale88, locale90 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.util.Locale>) localeList92, filteringMode94);
        java.util.Locale locale96 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.Locale locale97 = java.util.Locale.lookup(languageRangeList35, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.Locale locale98 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.List<java.util.Locale> localeList99 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList95);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str72, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str74, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode94.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNull(locale96);
        org.junit.Assert.assertNull(locale97);
        org.junit.Assert.assertNull(locale98);
        org.junit.Assert.assertNotNull(localeList99);
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        int int2 = bigDecimal0.intValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal12 = bigDecimal9.min(bigDecimal11);
        java.lang.String str13 = bigDecimal12.toPlainString();
        java.math.BigDecimal bigDecimal14 = bigDecimal0.subtract(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = bigDecimal0.plus();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf(35L, (int) (short) 117);
        java.math.BigDecimal bigDecimal20 = bigDecimal18.movePointLeft((int) (short) -2);
        java.math.BigDecimal bigDecimal21 = bigDecimal0.remainder(bigDecimal18);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(bigInteger28);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        double double31 = bigDecimal30.doubleValue();
        java.math.BigInteger bigInteger32 = bigDecimal30.toBigInteger();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        byte byte36 = org.apache.commons.lang3.math.NumberUtils.min(byteArray35);
        java.math.BigInteger bigInteger37 = new java.math.BigInteger((int) (short) -1, byteArray35);
        java.math.BigInteger bigInteger39 = bigInteger37.pow((int) 'a');
        byte[] byteArray40 = bigInteger37.toByteArray();
        long long41 = bigInteger37.longValueExact();
        java.math.BigInteger bigInteger42 = bigInteger32.or(bigInteger37);
        byte[] byteArray45 = new byte[] { (byte) 1 };
        byte byte46 = org.apache.commons.lang3.math.NumberUtils.min(byteArray45);
        java.math.BigInteger bigInteger47 = new java.math.BigInteger((int) (short) -1, byteArray45);
        java.math.BigInteger bigInteger49 = bigInteger47.pow((int) 'a');
        byte[] byteArray50 = bigInteger47.toByteArray();
        long long51 = bigInteger47.longValueExact();
        java.lang.String str53 = bigInteger47.toString(0);
        int int54 = bigInteger47.intValueExact();
        java.math.BigInteger bigInteger55 = bigInteger42.subtract(bigInteger47);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger62.negate();
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        double double65 = bigDecimal64.doubleValue();
        java.math.BigInteger bigInteger66 = bigDecimal64.toBigInteger();
        byte[] byteArray69 = new byte[] { (byte) 1 };
        byte byte70 = org.apache.commons.lang3.math.NumberUtils.min(byteArray69);
        java.math.BigInteger bigInteger71 = new java.math.BigInteger((int) (short) -1, byteArray69);
        java.math.BigInteger bigInteger73 = bigInteger71.pow((int) 'a');
        byte[] byteArray74 = bigInteger71.toByteArray();
        long long75 = bigInteger71.longValueExact();
        java.math.BigInteger bigInteger76 = bigInteger66.or(bigInteger71);
        byte[] byteArray79 = new byte[] { (byte) 1 };
        byte byte80 = org.apache.commons.lang3.math.NumberUtils.min(byteArray79);
        java.math.BigInteger bigInteger81 = new java.math.BigInteger((int) (short) -1, byteArray79);
        java.math.BigInteger bigInteger83 = bigInteger81.pow((int) 'a');
        byte[] byteArray84 = bigInteger81.toByteArray();
        long long85 = bigInteger81.longValueExact();
        java.lang.String str87 = bigInteger81.toString(0);
        int int88 = bigInteger81.intValueExact();
        java.math.BigInteger bigInteger89 = bigInteger76.subtract(bigInteger81);
        java.math.BigInteger bigInteger90 = bigInteger62.min(bigInteger76);
        java.math.BigInteger bigInteger91 = bigInteger55.gcd(bigInteger90);
        int int92 = bigInteger55.bitLength();
        java.math.BigInteger bigInteger93 = bigInteger28.andNot(bigInteger55);
        int int94 = bigInteger93.intValueExact();
        boolean boolean95 = bigDecimal18.equals((java.lang.Object) bigInteger93);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str13, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 1 + "'", byte36 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1]");
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 1 + "'", byte46 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1" + "'", str53, "-1");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1]");
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 1 + "'", byte70 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[1]");
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 1 + "'", byte80 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[-1]");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "-1" + "'", str87, "-1");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("A");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        double double15 = bigInteger14.doubleValue();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger21 = bigInteger14.gcd(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigInteger bigInteger29 = bigInteger20.or(bigInteger28);
        java.math.BigInteger bigInteger30 = bigInteger6.or(bigInteger28);
        java.math.BigInteger bigInteger32 = bigInteger28.pow(5);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal38 = bigDecimal34.subtract(bigDecimal37);
        java.math.BigInteger bigInteger39 = bigDecimal38.toBigInteger();
        double double40 = bigInteger39.doubleValue();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        byte byte44 = org.apache.commons.lang3.math.NumberUtils.min(byteArray43);
        java.math.BigInteger bigInteger45 = new java.math.BigInteger((int) (short) -1, byteArray43);
        java.math.BigInteger bigInteger46 = bigInteger39.gcd(bigInteger45);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal48 = bigDecimal47.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal52 = bigDecimal48.subtract(bigDecimal51);
        java.math.BigInteger bigInteger53 = bigDecimal52.toBigInteger();
        java.math.BigInteger bigInteger54 = bigInteger45.or(bigInteger53);
        java.math.BigInteger bigInteger55 = bigInteger53.abs();
        java.math.BigInteger bigInteger56 = bigInteger28.and(bigInteger53);
        java.lang.String str57 = bigInteger28.toString();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal58.negate();
        int int60 = bigDecimal59.signum();
        long long61 = bigDecimal59.longValue();
        java.math.BigDecimal bigDecimal62 = bigDecimal59.abs();
        java.math.BigDecimal bigDecimal63 = bigDecimal62.stripTrailingZeros();
        java.math.BigDecimal bigDecimal65 = bigDecimal62.pow((int) (short) 0);
        java.math.BigInteger bigInteger66 = bigDecimal65.toBigInteger();
        java.math.BigInteger bigInteger68 = bigInteger66.setBit(30);
        java.math.BigDecimal bigDecimal69 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal70 = bigDecimal69.negate();
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal74 = bigDecimal70.subtract(bigDecimal73);
        java.math.BigInteger bigInteger75 = bigDecimal74.toBigInteger();
        double double76 = bigInteger75.doubleValue();
        byte byte77 = bigInteger75.byteValueExact();
        byte[] byteArray80 = new byte[] { (byte) 1 };
        byte byte81 = org.apache.commons.lang3.math.NumberUtils.min(byteArray80);
        java.math.BigInteger bigInteger82 = new java.math.BigInteger((int) (short) -1, byteArray80);
        java.math.BigInteger bigInteger84 = bigInteger82.pow((int) 'a');
        java.math.BigInteger bigInteger86 = bigInteger82.shiftLeft((int) (short) 1);
        int int87 = bigInteger86.intValueExact();
        int int88 = bigInteger75.compareTo(bigInteger86);
        java.math.BigInteger bigInteger89 = bigInteger66.min(bigInteger86);
        java.math.BigInteger bigInteger90 = bigInteger28.max(bigInteger66);
        java.math.BigDecimal bigDecimal91 = new java.math.BigDecimal(bigInteger66);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1]");
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) 0 + "'", byte77 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[1]");
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 1 + "'", byte81 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-2) + "'", int87 == (-2));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("Chinese");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("                                         French (France)                                         ", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         french (france)                                         " + "'", str3, "                                         french (france)                                         ");
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("6.0", "ED-ed");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6.0" + "'", str2, "6.0");
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("hi");
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("GBR");
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        boolean boolean12 = locale11.hasExtensions();
        java.util.Locale.Builder builder13 = builder5.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder5.clearExtensions();
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.lang.String str17 = locale16.getDisplayScript();
        java.util.Locale.Builder builder18 = builder14.setLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder14.setLanguage("HI!UUU");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: HI!UUU [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str7, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("a");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "hindi (HI!UUU,Korean (South Korea))");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger((int) (short) -1, byteArray3);
        java.math.BigInteger bigInteger6 = bigInteger5.not();
        byte[] byteArray7 = bigInteger5.toByteArray();
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = new java.math.BigInteger(94, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid signum value");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 34.0f);
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz", "IT...KoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoK");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        long long3 = bigDecimal0.longValueExact();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("z-CN");
        boolean boolean6 = bigDecimal0.equals((java.lang.Object) strArray5);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal10 = bigDecimal9.plus();
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        int int12 = bigDecimal10.signum();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.plus();
        float float14 = bigDecimal10.floatValue();
        short short15 = bigDecimal10.shortValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal0.max(bigDecimal10);
        java.math.RoundingMode roundingMode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = bigDecimal10.setScale((int) (short) -18, roundingMode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertNotNull(bigDecimal16);
    }
}
