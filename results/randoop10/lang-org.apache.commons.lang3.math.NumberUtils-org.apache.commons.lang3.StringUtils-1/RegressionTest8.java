import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "z-CENG                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bigDecimal7.intValueExact();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Rounding necessary");
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
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\u30ab\u30ca\u30c0", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn" + "'", str3, "zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u82f1\u8a9e", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("3.01E-50", "anglais");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -2, (byte) 0, (byte) -33);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        double double7 = bigDecimal6.doubleValue();
        java.math.BigInteger bigInteger8 = bigDecimal6.toBigInteger();
        java.lang.String str9 = bigDecimal6.toPlainString();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = bigDecimal10.negate();
        int int13 = bigDecimal12.intValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.max(bigDecimal12);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = bigDecimal4.divide(bigDecimal14, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setVariant("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "z-C", (java.lang.CharSequence) "-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
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
        java.lang.Class<?> wildcardClass19 = bigInteger18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(6.0d, (double) 6, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.0d + "'", double3 == 6.0d);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ita", "", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("zohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohzohz");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hKorean (South Korea)en-cen-cen", (int) (short) -2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hKorean (South Korea)en-cen-cen" + "'", str2, "hKorean (South Korea)en-cen-cen");
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setExtension(' ', "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
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
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        double double43 = bigDecimal42.doubleValue();
        java.math.BigInteger bigInteger44 = bigDecimal42.toBigInteger();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger51 = bigInteger49.pow((int) 'a');
        byte[] byteArray52 = bigInteger49.toByteArray();
        long long53 = bigInteger49.longValueExact();
        java.math.BigInteger bigInteger54 = bigInteger44.or(bigInteger49);
        byte[] byteArray57 = new byte[] { (byte) 1 };
        byte byte58 = org.apache.commons.lang3.math.NumberUtils.min(byteArray57);
        java.math.BigInteger bigInteger59 = new java.math.BigInteger((int) (short) -1, byteArray57);
        java.math.BigInteger bigInteger61 = bigInteger59.pow((int) 'a');
        java.math.BigInteger bigInteger63 = bigInteger59.shiftLeft((int) (short) 1);
        boolean boolean65 = bigInteger63.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger66 = bigInteger49.divide(bigInteger63);
        long long67 = bigInteger49.longValue();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger68 = bigInteger41.mod(bigInteger49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger: modulus not positive");
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
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 1 + "'", byte48 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1]");
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 1 + "'", byte58 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\uc5b4\uad6d\ud55c", "French (France)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc5b4\uad6d\ud55c" + "'", str2, "\uc5b4\uad6d\ud55c");
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
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
        byte[] byteArray55 = bigInteger54.toByteArray();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        byte byte58 = org.apache.commons.lang3.math.NumberUtils.min(byteArray57);
        java.math.BigInteger bigInteger59 = new java.math.BigInteger(byteArray57);
        java.math.BigDecimal bigDecimal60 = new java.math.BigDecimal(bigInteger59);
        short short61 = bigInteger59.shortValueExact();
        int int62 = bigInteger59.bitLength();
        java.math.BigInteger[] bigIntegerArray63 = bigInteger54.divideAndRemainder(bigInteger59);
        java.math.BigInteger bigInteger64 = bigInteger12.max(bigInteger59);
        boolean boolean66 = bigInteger64.isProbablePrime((int) (short) 100);
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
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1]");
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 1 + "'", byte58 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 1 + "'", short61 == (short) 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("en_CA", "und ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(35, 117, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        java.util.Locale locale1 = new java.util.Locale("Korean (South Korea)");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("", locale3);
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.lang.String str6 = locale1.getDisplayCountry(locale3);
        org.junit.Assert.assertEquals(locale1.toString(), "korean (south korea)");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\uc911\uad6d\uc5b4\uc911\uad6d)", (java.lang.CharSequence) "aauabuaeuafuakuamuanuaruasuavuayuazubaubeubgubhubiubmubnuboubrubsucauceuchucoucrucsucuucvucyudaudeudvudzueeueluenueouesuetueuufauffufiufjufoufrufyugaugduglugnuguugvuhauheuhiuhouhruhtuhuuhyuhzuiauiduieuiguiiuikuinuiouisuituiuuiwujaujiujvukaukgukiukjukkuklukmuknukoukruksukuukvukwukyulaulbulguliulnuloultuluulvumgumhumiumkumlumnumoumrumsumtumyunaunbunduneungunlunnunounrunvunyuocuojuomuoruosupaupiuplupsuptuquurmurnurouruurwusauscusduseusgusiuskuslusmusnusousqusrussustusuusvuswutauteutguthutiutkutlutnutoutrutsuttutwutyuuguukuuruuzuveuviuvouwauwouxhuyiuyouzauzhuzu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "1.00E-98");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   0   " + "'", str2, "   0   ");
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        int int9 = bigInteger8.intValueExact();
        short short10 = bigInteger8.shortValue();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -2 + "'", short10 == (short) -2);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
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
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.TEN;
        long long11 = bigDecimal10.longValueExact();
        java.math.BigDecimal bigDecimal12 = bigDecimal10.ulp();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal16 = bigDecimal14.movePointRight(30);
        java.math.BigDecimal bigDecimal17 = bigDecimal9.multiply(bigDecimal16);
        short short18 = bigDecimal9.shortValue();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Vereinigtes K\366nigreich", "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("\u65e5\u672c\u8a9e", strArray5, strArray8);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FR", (int) (short) 1);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("#", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("United States", strArray5, strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("zho", strArray17);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str9, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United States" + "'", str16, "United States");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000035", (int) (byte) -2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\u4e2d\u65874444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "KR                               ", 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "th Korea)en-cen-cenuKorean (So");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getScript();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                          gne", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                                                                                                          gne" + "'", str6, "                                                                                                                                                                                                                                                                                                          gne");
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getVariant();
        java.util.Locale locale7 = locale3.stripExtensions();
        java.lang.String str8 = locale0.getDisplayScript(locale3);
        java.lang.String str9 = locale0.getDisplayVariant();
        java.lang.String str10 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str1, "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587" + "'", str10, "\u82f1\u6587");
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        java.util.Locale locale3 = new java.util.Locale("     zh-cn", "CN", "\u65e5\u672c\u8a9e");
        boolean boolean4 = locale3.hasExtensions();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (short) -1);
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
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI", "englisch", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0L);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        java.lang.String str6 = languageRange2.getRange();
        double double7 = languageRange2.getWeight();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal10 = bigDecimal9.abs();
        int int11 = bigDecimal9.intValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal9.pow(0);
        boolean boolean14 = languageRange2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chn" + "'", str6, "chn");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\ud55c\uad6d\uc5b4", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        char[] charArray11 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray11);
        java.math.MathContext mathContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(charArray11, 34, 10, mathContext19);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u52a0\u62ff\u5927", (java.lang.CharSequence) "\u671d\u9c9c\u6587");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Chine");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ???????? (??????) is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 300, (float) 117L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uad6d\ubbfc\ud55c\ub300" + "'", str1, "\uad6d\ubbfc\ud55c\ub300");
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
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
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal42 = bigDecimal41.negate();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal42.subtract(bigDecimal45);
        java.math.BigInteger bigInteger47 = bigDecimal46.toBigInteger();
        java.math.BigInteger bigInteger48 = bigInteger47.negate();
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        double double50 = bigDecimal49.doubleValue();
        java.math.BigInteger bigInteger51 = bigDecimal49.toBigInteger();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        byte byte55 = org.apache.commons.lang3.math.NumberUtils.min(byteArray54);
        java.math.BigInteger bigInteger56 = new java.math.BigInteger((int) (short) -1, byteArray54);
        java.math.BigInteger bigInteger58 = bigInteger56.pow((int) 'a');
        byte[] byteArray59 = bigInteger56.toByteArray();
        long long60 = bigInteger56.longValueExact();
        java.math.BigInteger bigInteger61 = bigInteger51.or(bigInteger56);
        byte[] byteArray64 = new byte[] { (byte) 1 };
        byte byte65 = org.apache.commons.lang3.math.NumberUtils.min(byteArray64);
        java.math.BigInteger bigInteger66 = new java.math.BigInteger((int) (short) -1, byteArray64);
        java.math.BigInteger bigInteger68 = bigInteger66.pow((int) 'a');
        byte[] byteArray69 = bigInteger66.toByteArray();
        long long70 = bigInteger66.longValueExact();
        java.lang.String str72 = bigInteger66.toString(0);
        int int73 = bigInteger66.intValueExact();
        java.math.BigInteger bigInteger74 = bigInteger61.subtract(bigInteger66);
        java.math.BigInteger bigInteger75 = bigInteger47.min(bigInteger61);
        java.math.BigInteger bigInteger76 = bigInteger40.gcd(bigInteger75);
        java.math.BigInteger bigInteger77 = bigInteger12.subtract(bigInteger76);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger79 = bigInteger12.pow((-2));
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
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1]");
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 1 + "'", byte55 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1]");
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 1 + "'", byte65 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[-1]");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "-1" + "'", str72, "-1");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger77);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "en-us");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("gBR", "CN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
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
        long long25 = bigInteger7.longValue();
        byte byte26 = bigInteger7.byteValueExact();
        java.math.BigInteger bigInteger28 = bigInteger7.shiftRight(11);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger7, 117);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        java.math.BigDecimal bigDecimal38 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal39 = bigDecimal30.add(bigDecimal38);
        int int40 = bigDecimal30.scale();
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 117 + "'", int40 == 117);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("JPN", "VEREINIGTES KONIGREICH", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JPN" + "'", str3, "JPN");
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 117);
        double double2 = bigDecimal1.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.setScale(2);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.lang.String str12 = bigDecimal7.toPlainString();
        java.lang.String str13 = bigDecimal7.toPlainString();
        java.math.MathContext mathContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray15 = bigDecimal1.divideAndRemainder(bigDecimal7, mathContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 117.0d + "'", double2 == 117.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\uc5b4\uad6d\ud55c                                                                                                                                                                                                                                                                                                        ", (int) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc5b4\uad6d\ud55c                                                                                                                                                                                                                                                                                                        " + "'", str3, "\uc5b4\uad6d\ud55c                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("zh", (int) (short) 16, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\u82f1\u6587\u82f1\u56fd)", "KR                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Chine");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Chine\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
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
        java.math.BigDecimal bigDecimal35 = bigDecimal33.negate();
        int int36 = bigDecimal35.intValueExact();
        java.math.BigInteger bigInteger37 = bigDecimal35.toBigInteger();
        java.math.BigInteger bigInteger38 = bigInteger37.negate();
        int int39 = bigInteger12.compareTo(bigInteger38);
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger46 = bigInteger44.pow((int) 'a');
        byte[] byteArray47 = bigInteger44.toByteArray();
        long long48 = bigInteger44.longValueExact();
        java.lang.String str50 = bigInteger44.toString(0);
        byte[] byteArray53 = new byte[] { (byte) 1 };
        byte byte54 = org.apache.commons.lang3.math.NumberUtils.min(byteArray53);
        java.math.BigInteger bigInteger55 = new java.math.BigInteger((int) (short) -1, byteArray53);
        java.math.BigInteger bigInteger56 = bigInteger44.and(bigInteger55);
        java.math.BigInteger bigInteger57 = bigInteger12.remainder(bigInteger44);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-1" + "'", str50, "-1");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger57);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
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
        byte[] byteArray59 = new byte[] { (byte) 1 };
        byte byte60 = org.apache.commons.lang3.math.NumberUtils.min(byteArray59);
        java.math.BigInteger bigInteger61 = new java.math.BigInteger((int) (short) -1, byteArray59);
        java.math.BigInteger bigInteger62 = new java.math.BigInteger(byteArray59);
        java.math.BigInteger bigInteger63 = new java.math.BigInteger(byteArray59);
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal65 = bigDecimal64.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal69 = bigDecimal65.subtract(bigDecimal68);
        java.math.BigInteger bigInteger70 = bigDecimal69.toBigInteger();
        double double71 = bigInteger70.doubleValue();
        byte[] byteArray74 = new byte[] { (byte) 1 };
        byte byte75 = org.apache.commons.lang3.math.NumberUtils.min(byteArray74);
        java.math.BigInteger bigInteger76 = new java.math.BigInteger((int) (short) -1, byteArray74);
        java.math.BigInteger bigInteger77 = bigInteger70.gcd(bigInteger76);
        java.math.BigDecimal bigDecimal78 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal79 = bigDecimal78.negate();
        java.math.BigDecimal bigDecimal82 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal83 = bigDecimal79.subtract(bigDecimal82);
        java.math.BigInteger bigInteger84 = bigDecimal83.toBigInteger();
        java.math.BigInteger bigInteger85 = bigInteger76.or(bigInteger84);
        double double86 = bigInteger85.doubleValue();
        java.math.BigInteger bigInteger87 = bigInteger63.divide(bigInteger85);
        java.math.BigInteger bigInteger89 = bigInteger85.pow(3);
        java.math.BigDecimal bigDecimal90 = new java.math.BigDecimal(bigInteger85);
        int int91 = bigInteger53.compareTo(bigInteger85);
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
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1]");
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) 1 + "'", byte60 == (byte) 1);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1]");
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 1 + "'", byte75 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
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
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(bigInteger7, (int) (byte) 0);
        float float16 = bigDecimal15.floatValue();
        byte byte17 = bigDecimal15.byteValue();
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
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
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
        byte byte32 = bigInteger24.byteValue();
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
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -2 + "'", byte32 == (byte) -2);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 10L);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.movePointLeft(33);
        long long4 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = bigDecimal1.divide(bigDecimal5, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("en_CA", "\uc5b4\uad6d\ud55c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("en_US", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_US" + "'", str2, "en_US");
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("hi");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder5.build();
        java.lang.Object obj8 = locale7.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("\u671d\u9c9c\u6587\u97e9\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??? (??)\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = locale6.stripExtensions();
        java.util.Locale.Builder builder11 = builder2.setLocale(locale6);
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getDisplayScript();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale12.getDisplayName(locale16);
        java.util.Locale.Builder builder18 = builder11.setLocale(locale12);
        java.util.Locale.Builder builder20 = builder11.addUnicodeLocaleAttribute("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder20.setUnicodeLocaleKeyword("", "\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str17, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
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
        short short49 = bigDecimal48.shortValue();
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
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 1 + "'", short49 == (short) 1);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("en-US", "Eng                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u52a0\u62ff\u5927", 8);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u52a0\u62ff\u5927" + "'", str2, "\u52a0\u62ff\u5927");
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz", (-2));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((double) (-1L));
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.lang.String str14 = bigDecimal9.toPlainString();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        double double16 = bigDecimal15.doubleValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal15.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger19 = bigDecimal15.unscaledValue();
        long long20 = bigDecimal15.longValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal22 = bigDecimal15.ulp();
        java.math.BigDecimal bigDecimal23 = bigDecimal7.multiply(bigDecimal22);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = bigDecimal4.divide(bigDecimal7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
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
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.setLanguageTag("eng");
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder19 = builder17.setLocale(locale18);
        java.util.Locale.Builder builder21 = builder19.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder23 = builder21.setVariant("");
        java.util.Locale locale24 = builder23.build();
        java.lang.String str25 = locale10.getDisplayScript(locale24);
        java.util.Locale.setDefault(locale24);
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
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("FR-FR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587" + "'", str2, "\u6cd5\u6587");
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("     zh-cn", "10.0E-99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     zh-cn" + "'", str2, "     zh-cn");
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((-1L), 4);
        java.math.MathContext mathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigDecimal2.pow(52, mathContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.RoundingMode roundingMode17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = bigDecimal15.setScale(32, roundingMode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigInteger bigInteger1 = bigDecimal0.toBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = bigInteger1.pow((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Negative exponent");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              ", "#######", 33);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.math.RoundingMode roundingMode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigDecimal2.setScale((int) 'u', roundingMode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn", (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("EN", "\u82f1\u6587\u82f1\u56fd)", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.scaleByPowerOfTen((int) 'a');
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) '#', 120);
        int int8 = bigDecimal7.signum();
        java.lang.String str9 = bigDecimal7.toPlainString();
        java.math.MathContext mathContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = bigDecimal2.add(bigDecimal7, mathContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000035" + "'", str9, "0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000035");
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("CAN", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CAN" + "'", str2, "CAN");
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("en_CA", 101, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        double double14 = bigInteger13.doubleValue();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger20 = bigInteger13.gcd(bigInteger19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        java.math.BigInteger bigInteger28 = bigInteger19.or(bigInteger27);
        java.math.BigInteger bigInteger29 = bigInteger6.min(bigInteger28);
        byte[] byteArray32 = new byte[] { (byte) 1 };
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger((int) (short) -1, byteArray32);
        java.math.BigInteger bigInteger36 = bigInteger34.pow((int) 'a');
        byte[] byteArray37 = bigInteger34.toByteArray();
        long long38 = bigInteger34.longValueExact();
        java.lang.String str40 = bigInteger34.toString(0);
        byte[] byteArray43 = new byte[] { (byte) 1 };
        byte byte44 = org.apache.commons.lang3.math.NumberUtils.min(byteArray43);
        java.math.BigInteger bigInteger45 = new java.math.BigInteger((int) (short) -1, byteArray43);
        java.math.BigInteger bigInteger46 = bigInteger34.and(bigInteger45);
        java.math.BigInteger bigInteger47 = bigInteger45.abs();
        java.math.BigInteger bigInteger48 = bigInteger6.max(bigInteger45);
        java.math.BigInteger bigInteger49 = bigInteger6.abs();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger(byteArray51);
        java.math.BigDecimal bigDecimal54 = new java.math.BigDecimal(bigInteger53);
        short short55 = bigInteger53.shortValueExact();
        int int56 = bigInteger53.bitLength();
        java.math.BigInteger bigInteger57 = bigInteger6.mod(bigInteger53);
        java.math.BigInteger bigInteger59 = bigInteger53.clearBit((int) (byte) 10);
        double double60 = bigInteger53.doubleValue();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1" + "'", str40, "-1");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1]");
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 1 + "'", short55 == (short) 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.lang.String str12 = locale11.getISO3Language();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = locale8.getLanguage();
        java.util.Locale.Builder builder15 = builder7.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.addUnicodeLocaleAttribute("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: it [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jpn" + "'", str12, "jpn");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de" + "'", str14, "de");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = java.math.BigInteger.probablePrime(563, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("eng");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.lang.String str17 = locale16.getVariant();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.upperCase("", locale24);
        java.util.Locale locale26 = java.util.Locale.PRC;
        java.lang.String str27 = locale26.getISO3Language();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale34);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("hi", locale34);
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.lowerCase("", locale42);
        java.util.Locale.setDefault(locale42);
        java.util.Locale locale45 = java.util.Locale.TAIWAN;
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale47.getScript();
        java.util.Locale locale49 = java.util.Locale.PRC;
        java.util.Locale locale50 = null;
        java.lang.String str51 = locale49.getDisplayScript(locale50);
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.lowerCase("", locale54);
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale12, locale13, locale15, locale16, locale18, locale19, locale20, locale21, locale22, locale24, locale26, locale29, locale30, locale34, locale37, locale39, locale40, locale42, locale45, locale46, locale47, locale49, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.Locale locale59 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap60);
        java.util.Locale.LanguageRange[] languageRangeArray62 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList63 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63, languageRangeArray62);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, (java.util.Collection<java.lang.String>) strList69);
        java.lang.String str73 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList63, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.lang.String>) strList81);
        java.lang.String str84 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, (java.util.Collection<java.lang.String>) strList83);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strList83, filteringMode85);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList83);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR_#u-engcn");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zho" + "'", str27, "zho");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str35, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi" + "'", str36, "hi");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(locale59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(languageRangeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode85.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList87);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("UNITED STATES", "\u4e2d\u6587\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\u1103\u1169\u11a8\u110b\u1175\u11af))");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNITED STATES" + "'", str2, "UNITED STATES");
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) " + "'", str1, "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ");
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Vereinigtes K\366nigreich", "Koreanisch (S\374dkorea)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Vereinigtes K\366nigreich" + "'", str2, "Vereinigtes K\366nigreich");
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))", 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0L);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        double double6 = languageRange2.getWeight();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("eng");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder12 = builder10.setLocale(locale11);
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.lang.String str14 = locale13.getVariant();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.lang.String str16 = locale15.getDisplayCountry();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale15.getDisplayLanguage();
        java.util.Locale.Builder builder19 = builder12.setLocale(locale15);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.setLanguageTag("eng");
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder25 = builder23.setLocale(locale24);
        java.util.Locale.Builder builder27 = builder25.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale28 = builder25.build();
        java.util.Locale.Builder builder29 = builder12.setLocale(locale28);
        java.util.Locale locale30 = builder29.build();
        boolean boolean31 = languageRange2.equals((java.lang.Object) locale30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais" + "'", str18, "fran\347ais");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("frazho");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("english", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("engCN");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "engCN" + "'", str2, "engCN");
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("th Korea)en-cen-cenuKorean (So", "\u65e5\u6587", "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa", "HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str1, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "00", (java.lang.CharSequence) "italien");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
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
        byte[] byteArray22 = bigInteger21.toByteArray();
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger26 = bigInteger24.pow((-2));
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str1, "0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Englisch", "ENG                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0000", (int) (byte) -33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000" + "'", str2, "0000");
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "UNITEDxSTATES");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) -1, (short) -5);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -5 + "'", short3 == (short) -5);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Koreanisch (S\374dkorea)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Koreanisch (Su?dkorea)\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("uuuuuuuuuuuuuuuuENGuuuuuuuuuuuuuuuu", "                                                                                                                                                     #                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuENGuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuENGuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("United States", (int) (byte) -33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.negate();
        java.math.BigInteger bigInteger4 = bigDecimal0.toBigIntegerExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) 301, (int) '4');
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte10 = bigDecimal9.byteValueExact();
        java.math.BigDecimal bigDecimal12 = bigDecimal9.pow(2);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.TEN;
        long long16 = bigDecimal15.longValueExact();
        java.math.BigDecimal bigDecimal17 = bigDecimal15.ulp();
        java.lang.String str18 = bigDecimal15.toString();
        int int19 = bigDecimal13.compareTo(bigDecimal15);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal15.divide(bigDecimal21, (int) (short) 1);
        java.math.BigDecimal bigDecimal24 = bigDecimal12.add(bigDecimal15);
        java.math.BigDecimal bigDecimal25 = bigDecimal15.negate();
        java.math.BigDecimal[] bigDecimalArray26 = bigDecimal7.divideAndRemainder(bigDecimal15);
        java.math.BigDecimal[] bigDecimalArray27 = bigDecimal0.divideAndRemainder(bigDecimal7);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.TEN;
        long long31 = bigDecimal30.longValueExact();
        java.math.BigDecimal bigDecimal32 = bigDecimal30.ulp();
        java.lang.String str33 = bigDecimal30.toString();
        int int34 = bigDecimal28.compareTo(bigDecimal30);
        short short35 = bigDecimal28.shortValueExact();
        java.math.BigDecimal bigDecimal37 = bigDecimal28.scaleByPowerOfTen((-1));
        double double38 = bigDecimal37.doubleValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal7.subtract(bigDecimal37);
        byte byte40 = bigDecimal37.byteValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimalArray26);
        org.junit.Assert.assertNotNull(bigDecimalArray27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10" + "'", str33, "10");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 0 + "'", short35 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(13L, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Hindi", "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\uc5b4\uad6d\ud55c", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("French (France)", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
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
        int int20 = bigDecimal14.precision();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.lang.String str6 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        double double8 = bigDecimal7.doubleValue();
        java.math.BigDecimal bigDecimal10 = bigDecimal7.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger11 = bigDecimal7.unscaledValue();
        long long12 = bigDecimal7.longValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal1.subtract(bigDecimal7);
        java.lang.String str14 = bigDecimal13.toPlainString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((-2.0d));
        byte[] byteArray19 = new byte[] { (byte) 1 };
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray19);
        java.math.BigInteger bigInteger21 = new java.math.BigInteger((int) (short) -1, byteArray19);
        java.math.BigInteger bigInteger23 = bigInteger21.pow((int) 'a');
        java.math.BigInteger bigInteger25 = bigInteger21.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal29 = bigDecimal27.min(bigDecimal28);
        java.lang.String str30 = bigDecimal27.toPlainString();
        boolean boolean31 = bigInteger25.equals((java.lang.Object) bigDecimal27);
        java.math.BigDecimal bigDecimal32 = bigDecimal16.min(bigDecimal27);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal35 = bigDecimal13.divide(bigDecimal16, 0, 1073741825);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bigDecimal32);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
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
        long long25 = bigInteger7.longValue();
        byte byte26 = bigInteger7.byteValueExact();
        java.math.BigInteger bigInteger28 = bigInteger7.shiftRight(11);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger7, 117);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        java.math.BigDecimal bigDecimal38 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal39 = bigDecimal30.add(bigDecimal38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.negate();
        java.lang.String str43 = bigDecimal40.toString();
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join(objArray48, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean53 = bigDecimal45.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal54 = bigDecimal40.max(bigDecimal45);
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal56 = bigDecimal55.negate();
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal60 = bigDecimal56.subtract(bigDecimal59);
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal62 = bigDecimal59.min(bigDecimal61);
        java.math.BigDecimal bigDecimal64 = bigDecimal62.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal65 = bigDecimal40.min(bigDecimal62);
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal67 = bigDecimal66.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal69 = bigDecimal68.negate();
        java.math.BigDecimal bigDecimal70 = bigDecimal68.negate();
        java.lang.String str71 = bigDecimal70.toEngineeringString();
        java.math.BigDecimal bigDecimal72 = bigDecimal67.multiply(bigDecimal70);
        java.math.BigDecimal bigDecimal73 = bigDecimal40.subtract(bigDecimal70);
        java.math.BigDecimal bigDecimal75 = bigDecimal73.setScale((int) (byte) 1);
        int int76 = bigDecimal39.compareTo(bigDecimal75);
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal78 = bigDecimal77.negate();
        java.math.BigDecimal bigDecimal79 = bigDecimal78.abs();
        int int80 = bigDecimal78.intValueExact();
        java.math.BigInteger bigInteger81 = bigDecimal78.toBigInteger();
        java.math.BigDecimal bigDecimal82 = bigDecimal78.ulp();
        int int83 = bigDecimal78.intValueExact();
        java.math.BigDecimal bigDecimal84 = bigDecimal75.multiply(bigDecimal78);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0" + "'", str43, "0");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "0" + "'", str71, "0");
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(bigDecimal84);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                     #                                                                                                                                                      ", "\u82f1\u6587\u82f1\u56fd)", (int) (short) -33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        float[] floatArray5 = new float[] { '4', 0L, 4, 1L, 1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[52.0, 0.0, 4.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 52.0f + "'", float9 == 52.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 52.0f + "'", float10 == 52.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 52.0f + "'", float11 == 52.0f);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("", locale4);
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("", locale8);
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("", locale19);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.lang.String str24 = locale23.getVariant();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = java.util.Locale.PRC;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale31.getScript();
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale4, locale8, locale11, locale14, locale16, locale19, locale21, locale22, locale23, locale25, locale28, locale29, locale30, locale31, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList35, filteringMode37);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "a");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str15, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + filteringMode37 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode37.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh-CN", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "englisch");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList14);
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.lang.String str22 = locale21.getVariant();
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Locale locale27 = java.util.Locale.ITALIAN;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.upperCase("", locale29);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.lang.String str32 = locale31.getISO3Language();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale39);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("hi", locale39);
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.util.Locale locale45 = java.util.Locale.ENGLISH;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.lowerCase("", locale47);
        java.util.Locale.setDefault(locale47);
        java.util.Locale locale50 = java.util.Locale.TAIWAN;
        java.util.Locale locale51 = java.util.Locale.ENGLISH;
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.lang.String str53 = locale52.getScript();
        java.util.Locale locale54 = java.util.Locale.PRC;
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale54.getDisplayScript(locale55);
        java.util.Locale locale57 = java.util.Locale.PRC;
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.lowerCase("", locale59);
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale17, locale18, locale20, locale21, locale23, locale24, locale25, locale26, locale27, locale29, locale31, locale34, locale35, locale39, locale42, locale44, locale45, locale47, locale50, locale51, locale52, locale54, locale57, locale59 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.Locale locale64 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap65);
        java.util.Locale locale68 = new java.util.Locale("");
        java.lang.String str69 = locale68.getVariant();
        java.util.Locale locale70 = java.util.Locale.TAIWAN;
        java.lang.String str71 = locale68.getDisplayScript(locale70);
        java.util.Set<java.lang.String> strSet72 = locale68.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList80);
        java.lang.String str84 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList74, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray85 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList86 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList86, languageRangeArray85);
        java.lang.String[] strArray89 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        java.lang.String str92 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList86, (java.util.Collection<java.lang.String>) strList90);
        java.util.Locale.FilteringMode filteringMode93 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList90, filteringMode93);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strSet72, filteringMode93);
        java.lang.String str96 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList95);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zho" + "'", str32, "zho");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str40, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi" + "'", str41, "hi");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
// flaky:         org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(locale64);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(languageRangeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertTrue("'" + filteringMode93 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode93.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("ENGLISH", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.abs();
        java.lang.String str2 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.stripTrailingZeros();
        short short4 = bigDecimal1.shortValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.math.BigInteger bigInteger9 = bigDecimal4.toBigInteger();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.setScale(0);
        int int12 = bigDecimal4.scale();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.TEN;
        long long16 = bigDecimal15.longValueExact();
        java.math.BigDecimal bigDecimal17 = bigDecimal15.ulp();
        java.lang.String str18 = bigDecimal15.toString();
        int int19 = bigDecimal13.compareTo(bigDecimal15);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal15.divide(bigDecimal21, (int) (short) 1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.TEN;
        long long25 = bigDecimal24.longValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal23.max(bigDecimal24);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.TEN;
        long long28 = bigDecimal27.longValueExact();
        java.math.BigDecimal bigDecimal29 = bigDecimal27.ulp();
        java.math.BigDecimal bigDecimal30 = bigDecimal24.subtract(bigDecimal27);
        java.math.MathContext mathContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal32 = bigDecimal4.divide(bigDecimal24, mathContext31);
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
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 33L);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        java.math.BigDecimal bigDecimal6 = bigDecimal2.stripTrailingZeros();
        java.math.BigDecimal bigDecimal9 = bigDecimal1.divide(bigDecimal6, 1, 0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("UNITED STATES");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
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
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.negate();
        java.lang.String str20 = bigDecimal17.toString();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.scaleByPowerOfTen(0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal23 = bigDecimal7.divideToIntegralValue(bigDecimal22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(bigDecimal22);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("RF-rf");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RF-RF" + "'", str1, "RF-RF");
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u30ab\u30ca\u30c0", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", (int) (short) 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        int int2 = bigDecimal0.intValue();
        int int3 = bigDecimal0.scale();
        java.lang.String str4 = bigDecimal0.toEngineeringString();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal8 = bigDecimal7.plus();
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        int int10 = bigDecimal8.signum();
        java.math.BigDecimal bigDecimal11 = bigDecimal8.plus();
        java.math.MathContext mathContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = bigDecimal0.subtract(bigDecimal8, mathContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal11);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.lang.String str7 = locale5.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean" + "'", str3, "Korean");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean (South Korea)" + "'", str6, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
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
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("", locale16);
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("", locale20);
        java.util.Locale.setDefault(locale20);
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale26);
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.upperCase("", locale31);
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale35.getVariant();
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.util.Locale locale42 = java.util.Locale.PRC;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale43.getScript();
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale16, locale20, locale23, locale26, locale28, locale31, locale33, locale34, locale35, locale37, locale40, locale41, locale42, locale43, locale45 };
        java.util.ArrayList<java.util.Locale> localeList47 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList47, localeArray46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList47, filteringMode49);
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList47);
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder52.setLanguageTag("eng");
        java.util.Locale.Builder builder55 = builder54.clearExtensions();
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder57 = builder55.setLocale(locale56);
        java.util.Set<java.lang.String> strSet58 = locale56.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet58, filteringMode59);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList68);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList70);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str27, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587" + "'", str29, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!uuu", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("Cennese");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("RF-RF", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\uad6d\ubbfc\ud55c\ub300", "                                      !hi!hi!hi!hi!hi!hi!hi!hi                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"xxx\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        int int5 = bigDecimal1.scale();
        byte byte6 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.movePointRight(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, (int) (byte) 0);
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getISO3Language();
        boolean boolean27 = bigDecimal24.equals((java.lang.Object) str26);
        java.math.BigDecimal bigDecimal30 = bigDecimal11.divide(bigDecimal24, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal1.max(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.lang.String str38 = bigDecimal33.toPlainString();
        java.lang.String str39 = bigDecimal33.toPlainString();
        long[] longArray46 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long47 = org.apache.commons.lang3.math.NumberUtils.min(longArray46);
        boolean boolean48 = bigDecimal33.equals((java.lang.Object) long47);
        java.math.BigDecimal bigDecimal49 = bigDecimal30.add(bigDecimal33);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.ZERO;
        double double51 = bigDecimal50.doubleValue();
        java.math.BigInteger bigInteger52 = bigDecimal50.toBigInteger();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        byte byte56 = org.apache.commons.lang3.math.NumberUtils.min(byteArray55);
        java.math.BigInteger bigInteger57 = new java.math.BigInteger((int) (short) -1, byteArray55);
        java.math.BigInteger bigInteger59 = bigInteger57.pow((int) 'a');
        byte[] byteArray60 = bigInteger57.toByteArray();
        long long61 = bigInteger57.longValueExact();
        java.math.BigInteger bigInteger62 = bigInteger52.or(bigInteger57);
        java.math.BigDecimal bigDecimal63 = new java.math.BigDecimal(bigInteger52);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray64 = bigDecimal33.divideAndRemainder(bigDecimal63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division undefined");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0" + "'", str39, "0");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1]");
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 1 + "'", byte56 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger62);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
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
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(bigInteger7, (int) (byte) 0);
        java.math.BigInteger bigInteger17 = bigInteger7.setBit(7);
        java.math.BigInteger bigInteger19 = bigInteger7.clearBit((int) (byte) 1);
        byte byte20 = bigInteger7.byteValue();
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
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
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
        java.math.BigInteger bigInteger51 = bigInteger44.setBit(11);
        java.math.BigInteger bigInteger52 = bigInteger51.nextProbablePrime();
        java.math.MathContext mathContext54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(bigInteger52, 5, mathContext54);
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
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger52);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
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
        byte[] byteArray64 = new byte[] { (byte) 1 };
        byte byte65 = org.apache.commons.lang3.math.NumberUtils.min(byteArray64);
        java.math.BigInteger bigInteger66 = new java.math.BigInteger((int) (short) -1, byteArray64);
        java.math.BigInteger bigInteger68 = bigInteger66.pow((int) 'a');
        int int69 = bigInteger68.bitLength();
        java.math.BigInteger bigInteger70 = bigInteger60.max(bigInteger68);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger71 = bigInteger60.nextProbablePrime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: start < 0: -1");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1]");
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 1 + "'", byte65 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(bigInteger70);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                    ", 34, "th Korea)en-cen-cenuKorean (So");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    " + "'", str3, "                                                    ");
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u65e5\u672c\u8a9e", (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("de", 33, "\u6cd5\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd" + "'", str3, "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd");
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("             hi!uuu             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2L, (double) (short) 100, (double) 30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("JPN", 301);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JPN                                                                                                                                                                                                                                                                                                          " + "'", str2, "JPN                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
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
        java.math.BigInteger bigInteger40 = bigDecimal32.toBigInteger();
        int int41 = bigDecimal32.precision();
        java.math.MathContext mathContext42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal43 = bigDecimal32.plus(mathContext42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 16, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 16 + "'", short3 == (short) 16);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3, (double) 563, (double) (-2L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) " + "'", str3, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ");
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "fran\347ais");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Fran\347ais" + "'", str1, "Fran\347ais");
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList26);
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.lowerCase("", locale34);
        java.util.Locale.setDefault(locale34);
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.lowerCase("", locale38);
        java.util.Locale.setDefault(locale38);
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale44);
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale46.getDisplayLanguage();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.upperCase("", locale49);
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.util.Locale locale53 = java.util.Locale.GERMANY;
        java.lang.String str54 = locale53.getVariant();
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.util.Locale locale56 = locale55.stripExtensions();
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.util.Locale locale58 = locale57.stripExtensions();
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.util.Locale locale60 = java.util.Locale.PRC;
        java.util.Locale locale61 = java.util.Locale.KOREA;
        java.lang.String str62 = locale61.getScript();
        java.util.Locale locale63 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale34, locale38, locale41, locale44, locale46, locale49, locale51, locale52, locale53, locale55, locale58, locale59, locale60, locale61, locale63 };
        java.util.ArrayList<java.util.Locale> localeList65 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList65, localeArray64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList65, filteringMode67);
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList68);
        boolean boolean70 = bigInteger6.equals((java.lang.Object) locale69);
        java.math.BigInteger bigInteger72 = bigInteger6.setBit((int) (short) 0);
        int int73 = bigInteger72.getLowestSetBit();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str45, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u6587" + "'", str47, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale49);
// flaky:         org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode67.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u6587", 'u');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'u');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI", "Hindi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -2, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
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
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        java.math.BigInteger bigInteger52 = bigInteger44.shiftRight((int) (short) -2);
        java.lang.String str53 = bigInteger44.toString();
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
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale4.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str5, "\ud55c\uad6d\uc5b4");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str6, "\u671d\u9c9c\u6587\u97e9\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str7, "\u671d\u9c9c\u6587\u97e9\u56fd)");
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0.00000000000000000000000000000000SETATS DETINU", "Korean (South Korea)en-cen-cen", "                                      !hi!hi!hi!hi!hi!hi!hi!hi                                      ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("120");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "120" + "'", str1, "120");
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hindi", "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hindi" + "'", str2, "Hindi");
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("zh_CN", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger10 = bigInteger8.flipBit(1);
        long long11 = bigInteger10.longValue();
        java.math.BigInteger bigInteger13 = bigInteger10.setBit((int) (byte) 1);
        float float14 = bigInteger13.floatValue();
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
        java.math.BigInteger bigInteger38 = bigInteger35.shiftRight((int) (short) -1);
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
        java.math.BigInteger bigInteger60 = bigInteger51.or(bigInteger59);
        java.math.BigInteger bigInteger62 = bigInteger59.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger63 = bigInteger38.max(bigInteger59);
        java.lang.String str65 = bigInteger63.toString((int) 'a');
        java.math.BigInteger bigInteger66 = bigInteger63.nextProbablePrime();
        java.math.BigInteger bigInteger67 = bigInteger13.multiply(bigInteger63);
        short short68 = bigInteger67.shortValue();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-4L) + "'", long11 == (-4L));
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-2.0f) + "'", float14 == (-2.0f));
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
        org.junit.Assert.assertNotNull(bigInteger38);
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
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 0 + "'", short68 == (short) 0);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        java.util.Locale locale1 = new java.util.Locale("FRA");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\ub300\ud55c\ubbfc\uad6d", "#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d" + "'", str1, "\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d");
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", (double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\u671d\u9c9c\u6587", "zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn" + "'", str2, "zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn");
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        boolean boolean9 = bigInteger4.testBit(101);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("   JA", (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("engCN", "hi", (int) (short) 10);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1.00E-98", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("CN", strArray4, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'u', (int) (byte) 1, 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CN" + "'", str8, "CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "engCN" + "'", str13, "engCN");
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Korean (South Korea)", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) (short) -2, 1073741825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = locale6.stripExtensions();
        java.util.Locale.Builder builder11 = builder2.setLocale(locale6);
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getDisplayScript();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale12.getDisplayName(locale16);
        java.util.Locale.Builder builder18 = builder11.setLocale(locale12);
        java.util.Locale.Builder builder20 = builder18.setLanguage("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str17, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "China");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
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
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        java.math.BigInteger bigInteger52 = bigInteger44.shiftRight((int) (short) -2);
        java.util.Random random54 = null;
        java.math.BigInteger bigInteger55 = new java.math.BigInteger((int) (short) 0, random54);
        java.math.BigInteger bigInteger56 = bigInteger52.max(bigInteger55);
        java.math.BigInteger bigInteger58 = bigInteger52.shiftLeft((int) (byte) 0);
        int int59 = bigInteger58.intValueExact();
        java.math.BigInteger bigInteger61 = bigInteger58.flipBit(8);
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
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(bigInteger61);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111South Korea");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111South Korea" + "'", str1, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111South Korea");
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi" + "'", str1, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi");
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u82f1\u6587\u82f1\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=aaa?? (??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                                                                                                                                                                                          gne");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gne" + "'", str1, "gne");
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("SETATS DETINU", "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111South Korea", "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2ETAT2-DETINU" + "'", str3, "2ETAT2-DETINU");
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "2-", (java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("z-CN");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z-CN" + "'", str3, "z-CN");
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("gBR", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale11 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale6.getDisplayLanguage(locale11);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.setDefault(category14, locale17);
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale19.getDisplayVariant(locale21);
        java.lang.String str23 = locale21.getDisplayCountry();
        java.util.Locale.setDefault(category14, locale21);
        java.util.Set<java.lang.String> strSet25 = locale21.getUnicodeLocaleKeys();
        java.lang.String str26 = locale6.getDisplayScript(locale21);
        java.util.Set<java.lang.String> strSet27 = locale21.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet28 = locale21.getExtensionKeys();
        java.lang.String str29 = locale21.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "South Korea" + "'", str23, "South Korea");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ko_KR" + "'", str29, "ko_KR");
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("AJ", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ" + "'", str2, "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00" + "'", str1, "00");
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("120", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120" + "'", str2, "120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120");
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("korean##############################################################################################", "# (HI!)", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\uc774\ud0c8\ub9ac\uc544\uc5b4", "############################################################################################################################################################################################################################################################################################################", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.plus();
        long long6 = bigDecimal5.longValue();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList18, strMap19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList18, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList30);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList24, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList42);
        java.lang.String str45 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList44);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap46);
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getVariant();
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.lang.String str52 = locale49.getDisplayScript(locale51);
        java.util.Set<java.lang.String> strSet53 = locale49.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList61);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList55, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        java.lang.String str73 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.lang.String>) strList71);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList71, filteringMode74);
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags(languageRangeList47, (java.util.Collection<java.lang.String>) strSet53, filteringMode74);
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList18, (java.util.Collection<java.lang.String>) strList76, filteringMode77);
        java.lang.String[] strArray89 = new java.lang.String[] { "jpn", "0", "\u4e2d\u6587", "                                         French (France)                                         ", "JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN", "FR", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "10.0E-99", "UND", "1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        java.lang.String str92 = java.util.Locale.lookupTag(languageRangeList18, (java.util.Collection<java.lang.String>) strList90);
        boolean boolean93 = bigDecimal5.equals((java.lang.Object) str92);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode74.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode77.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        float float3 = bigDecimal1.floatValue();
        java.math.BigDecimal bigDecimal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray5 = bigDecimal1.divideAndRemainder(bigDecimal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("enhinh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: enhinh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("z-CN", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z-CN" + "'", str2, "z-CN");
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN", "ko-KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN" + "'", str2, "JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN");
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("und", "   0   ", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 1073741825);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("UNITEDxSTATES");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SETATSxDETINU" + "'", str1, "SETATSxDETINU");
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", 1073741825);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741825 + "'", int2 == 1073741825);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigInteger bigInteger4 = bigInteger2.setBit(4);
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(bigInteger2, (int) (byte) 10);
        java.math.BigInteger bigInteger7 = bigDecimal6.toBigInteger();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger7);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
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
        java.lang.String str24 = bigInteger20.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigInteger bigInteger2 = bigDecimal0.unscaledValue();
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        double double4 = bigDecimal3.doubleValue();
        java.math.BigInteger bigInteger5 = bigDecimal3.toBigInteger();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray8);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger((int) (short) -1, byteArray8);
        java.math.BigInteger bigInteger12 = bigInteger10.pow((int) 'a');
        byte[] byteArray13 = bigInteger10.toByteArray();
        long long14 = bigInteger10.longValueExact();
        java.math.BigInteger bigInteger15 = bigInteger5.or(bigInteger10);
        byte byte16 = bigInteger10.byteValueExact();
        boolean boolean18 = bigInteger10.testBit(100);
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray21);
        java.math.BigInteger bigInteger23 = new java.math.BigInteger((int) (short) -1, byteArray21);
        java.math.BigInteger bigInteger25 = bigInteger23.pow((int) 'a');
        java.math.BigInteger bigInteger27 = bigInteger23.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal31 = bigDecimal29.min(bigDecimal30);
        java.lang.String str32 = bigDecimal29.toPlainString();
        boolean boolean33 = bigInteger27.equals((java.lang.Object) bigDecimal29);
        java.math.BigInteger bigInteger34 = bigInteger10.divide(bigInteger27);
        java.math.BigInteger bigInteger36 = bigInteger10.pow(7);
        int int37 = bigInteger2.compareTo(bigInteger10);
        int int38 = bigInteger10.intValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("anglais", (int) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                 anglais" + "'", str2, "                                                                                                                 anglais");
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("gbr", "zho");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\u52a0\u62ff", (int) (byte) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10", "#");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("FR", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "UND");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("China", (int) (byte) -2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(120);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal5 = bigDecimal4.plus();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal5);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.TEN;
        long long8 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.ulp();
        java.lang.String str10 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        double double14 = bigDecimal13.doubleValue();
        java.math.BigDecimal bigDecimal16 = bigDecimal13.movePointLeft((int) (byte) -1);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal11.add(bigDecimal16);
        java.math.BigDecimal bigDecimal19 = bigDecimal7.add(bigDecimal18);
        java.math.BigDecimal bigDecimal21 = bigDecimal19.pow((int) '#');
        int int22 = bigDecimal1.compareTo(bigDecimal19);
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal((int) (short) -2);
        java.math.BigDecimal bigDecimal25 = bigDecimal24.plus();
        java.math.BigDecimal bigDecimal26 = bigDecimal19.min(bigDecimal24);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigIntegerExact();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((double) 33L);
        java.math.MathContext mathContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal31 = bigDecimal26.divide(bigDecimal29, mathContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal29);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
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
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        byte[] byteArray53 = new byte[] { (byte) 1 };
        byte byte54 = org.apache.commons.lang3.math.NumberUtils.min(byteArray53);
        java.math.BigInteger bigInteger55 = new java.math.BigInteger((int) (short) -1, byteArray53);
        java.math.BigInteger bigInteger57 = bigInteger55.pow((int) 'a');
        byte[] byteArray58 = bigInteger55.toByteArray();
        long long59 = bigInteger55.longValueExact();
        java.lang.String str61 = bigInteger55.toString(0);
        int int62 = bigInteger55.intValueExact();
        java.math.BigDecimal bigDecimal63 = new java.math.BigDecimal(bigInteger55);
        java.math.BigInteger bigInteger64 = bigInteger50.subtract(bigInteger55);
        java.lang.String str66 = bigInteger55.toString((int) (byte) -1);
        int int67 = bigInteger55.signum();
        java.math.BigInteger bigInteger68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger69 = bigInteger55.mod(bigInteger68);
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
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-1" + "'", str61, "-1");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "-1" + "'", str66, "-1");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
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
        java.math.BigDecimal bigDecimal94 = bigDecimal5.movePointLeft((int) (short) -33);
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
        org.junit.Assert.assertNotNull(bigDecimal94);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "FR-FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 13, (double) 299, (double) (-10.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10.0d) + "'", double3 == (-10.0d));
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Japanese", (java.lang.CharSequence) "ko-KR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it_it!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("en-US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#", (byte) -33);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -33 + "'", byte2 == (byte) -33);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("anglais", "englisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setExtension('x', "hi");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguageTag("zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: cnzh [at index 8]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((long) 300, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ja");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = bigDecimal8.plus();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.lang.String str17 = bigDecimal14.toString();
        int int18 = bigDecimal12.compareTo(bigDecimal14);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal14.divide(bigDecimal20, (int) (short) 1);
        java.math.BigDecimal bigDecimal23 = bigDecimal11.multiply(bigDecimal22);
        // The following exception was thrown during execution in test generation
        try {
            byte byte24 = bigDecimal11.byteValueExact();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Rounding necessary");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1H", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("zh-cn", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-cn" + "'", str2, "zh-cn");
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u7f8e\u56fd\u7f8e\u56fd\u7f8e\u56fd", "0000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("kor", "", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "i!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("English (United Kingdom)", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "TW");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Koreanisch (S\374dkorea)", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koreanisch(S\374dkorea)" + "'", str3, "Koreanisch(S\374dkorea)");
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9" + "'", str1, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u671d\u9c9c\u6587", "FR", 299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u671d\u9c9c\u6587", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u671d\u9c9c\u6587" + "'", str2, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("SETATSxDETINU", "!hi!hi!hi!hi!hi!hi!hi!hi", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SETATSxDETINU" + "'", str3, "SETATSxDETINU");
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ja", "120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
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
        int int11 = bigDecimal4.scale();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.subtract(bigDecimal16);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal19 = bigDecimal16.min(bigDecimal18);
        java.math.BigDecimal bigDecimal21 = bigDecimal19.movePointRight((int) (short) -2);
        int int22 = bigDecimal21.precision();
        java.math.BigDecimal bigDecimal23 = bigDecimal4.min(bigDecimal21);
        java.math.MathContext mathContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = bigDecimal4.plus(mathContext24);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(bigDecimal23);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FR", (int) (short) 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "#");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Canada", "-1)");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("eng", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Deutsch", "zho");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deutsch" + "'", str2, "Deutsch");
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 100, (short) -2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("united states", "                                                                                                                 anglais");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("it_IT");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"it_IT\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
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
        java.lang.String str50 = bigInteger48.toString((int) 'a');
        java.math.BigInteger bigInteger51 = bigInteger48.nextProbablePrime();
        int int52 = bigInteger48.intValueExact();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ko-KR");
        java.lang.Class<?> wildcardClass2 = languageRangeList1.getClass();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder5 = builder1.removeUnicodeLocaleAttribute("CAN");
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setRegion("en-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(13, (int) (short) 16, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("South Korea");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("KOREAN (SOUTH KOREA)EN-CEN-CEN", "", 30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Korean##############################################################################################", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((long) 34);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal2.toString();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(objArray10, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean15 = bigDecimal7.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal16 = bigDecimal2.max(bigDecimal7);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal18.subtract(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal24 = bigDecimal21.min(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = bigDecimal24.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal27 = bigDecimal2.min(bigDecimal24);
        int int28 = bigDecimal24.intValue();
        java.math.BigDecimal bigDecimal29 = bigDecimal1.divide(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(bigDecimal29);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("zh-CN", (int) (short) -5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ENGLISH", "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u56fd" + "'", str1, "\u6cd5\u56fd");
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\ud504\ub791\uc2a4\uc5b4-1.0", "EN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504\ub791\uc2a4\uc5b4-1.0" + "'", str2, "\ud504\ub791\uc2a4\uc5b4-1.0");
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
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
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal58.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal61 = bigDecimal60.negate();
        java.math.BigDecimal bigDecimal62 = bigDecimal60.negate();
        java.lang.String str63 = bigDecimal62.toEngineeringString();
        java.math.BigDecimal bigDecimal64 = bigDecimal59.multiply(bigDecimal62);
        java.math.BigDecimal bigDecimal66 = bigDecimal62.movePointRight(100);
        java.lang.String str67 = bigDecimal62.toEngineeringString();
        java.lang.String str68 = bigDecimal62.toPlainString();
        int int69 = bigDecimal62.scale();
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal71 = bigDecimal70.negate();
        java.math.BigDecimal bigDecimal74 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal75 = bigDecimal71.subtract(bigDecimal74);
        java.math.BigDecimal bigDecimal76 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal77 = bigDecimal74.min(bigDecimal76);
        java.math.BigDecimal bigDecimal79 = bigDecimal77.movePointRight((int) (short) -2);
        int int80 = bigDecimal79.precision();
        java.math.BigDecimal bigDecimal81 = bigDecimal62.min(bigDecimal79);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal82 = bigDecimal54.remainder(bigDecimal81);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
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
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0" + "'", str68, "0");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(bigDecimal81);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale11 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale6.getDisplayLanguage(locale11);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.setDefault(category14, locale17);
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale19.getDisplayVariant(locale21);
        java.lang.String str23 = locale21.getDisplayCountry();
        java.util.Locale.setDefault(category14, locale21);
        java.util.Set<java.lang.String> strSet25 = locale21.getUnicodeLocaleKeys();
        java.lang.String str26 = locale6.getDisplayScript(locale21);
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = locale21.getDisplayCountry(locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "South Korea" + "'", str23, "South Korea");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\u52a0\u62ff");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u52a0\u62ff" + "'", str1, "\u52a0\u62ff");
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale8 = builder5.build();
        java.lang.String str9 = locale8.getCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FR" + "'", str9, "FR");
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en-US", "fra", 4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "h", 4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("RF-RF");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("z-CENG                                                                                                                                                                                                                                                                                                          ", "\u65e5\u672c\u8a9e", (int) '4', 8);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u65e5\u672c\u8a9e                                                                                                                                                                                                                                                            " + "'", str4, "\u65e5\u672c\u8a9e                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("Cennese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("KOREAN (SOUTH KOREA)EN-CEN-CEN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: KOREAN (SOUTH KOREA)EN-CEN-CEN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Enhinh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("South Korea");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("-1.0", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        char[] charArray7 = new char[] { 'x', '#', '4', ' ', 'a' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinese", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Vereinigtes K\366nigreich", charArray7);
        java.math.MathContext mathContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(charArray7, 13, 30, mathContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "x#4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "x#4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[x, #, 4,  , a]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("zh-TW", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States", (int) (short) 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States" + "'", str2, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u30d5\u30e9\u30f3\u30b9\u8a9e", "-1UND0", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("enhinh", "fra ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enhinh" + "'", str2, "enhinh");
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("anglais");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "anglais");
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn", "engCN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh-CN", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("", locale7);
        java.util.Locale.setDefault(locale7);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("", locale11);
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.upperCase("", locale22);
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale26.getVariant();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.lang.String str35 = locale34.getScript();
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale7, locale11, locale14, locale17, locale19, locale22, locale24, locale25, locale26, locale28, locale31, locale32, locale33, locale34, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList38, filteringMode40);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList38, filteringMode42);
        java.util.Collection<java.lang.String> strCollection44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList2, strCollection44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str18, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList43);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u65e5\u6587", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) (byte) -2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\u4e2d\u6587\u4e2d\u56fd)", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("UNITEDxSTATES");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.ulp();
        int int6 = bigDecimal1.intValueExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        double double8 = bigDecimal7.doubleValue();
        java.math.BigInteger bigInteger9 = bigDecimal7.toBigInteger();
        java.math.BigDecimal bigDecimal10 = bigDecimal7.negate();
        java.math.BigInteger bigInteger11 = bigDecimal7.toBigIntegerExact();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 301, (int) '4');
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte17 = bigDecimal16.byteValueExact();
        java.math.BigDecimal bigDecimal19 = bigDecimal16.pow(2);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal22.divide(bigDecimal28, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal19.add(bigDecimal22);
        java.math.BigDecimal bigDecimal32 = bigDecimal22.negate();
        java.math.BigDecimal[] bigDecimalArray33 = bigDecimal14.divideAndRemainder(bigDecimal22);
        java.math.BigDecimal[] bigDecimalArray34 = bigDecimal7.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.TEN;
        long long38 = bigDecimal37.longValueExact();
        java.math.BigDecimal bigDecimal39 = bigDecimal37.ulp();
        java.lang.String str40 = bigDecimal37.toString();
        int int41 = bigDecimal35.compareTo(bigDecimal37);
        short short42 = bigDecimal35.shortValueExact();
        java.math.BigDecimal bigDecimal44 = bigDecimal35.scaleByPowerOfTen((-1));
        double double45 = bigDecimal44.doubleValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal14.subtract(bigDecimal44);
        java.math.MathContext mathContext47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal48 = bigDecimal1.divide(bigDecimal44, mathContext47);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimalArray33);
        org.junit.Assert.assertNotNull(bigDecimalArray34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10" + "'", str40, "10");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 0 + "'", short42 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal46);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", "Korean##############################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str2, "0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.movePointLeft((int) (byte) -1);
        int int6 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal0.add(bigDecimal5);
        int int8 = bigDecimal5.precision();
        java.math.BigDecimal bigDecimal10 = bigDecimal5.movePointRight(0);
        java.math.MathContext mathContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = bigDecimal5.plus(mathContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(bigDecimal10);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
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
        int int16 = bigDecimal13.intValueExact();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        int int23 = bigDecimal17.compareTo(bigDecimal19);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal19.divide(bigDecimal25, (int) (short) 1);
        java.lang.String str28 = bigDecimal27.toPlainString();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        double double30 = bigDecimal29.doubleValue();
        java.math.BigInteger bigInteger31 = bigDecimal29.toBigInteger();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger38 = bigInteger36.pow((int) 'a');
        byte[] byteArray39 = bigInteger36.toByteArray();
        long long40 = bigInteger36.longValueExact();
        java.math.BigInteger bigInteger41 = bigInteger31.or(bigInteger36);
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(bigInteger31);
        java.math.BigDecimal bigDecimal43 = bigDecimal27.multiply(bigDecimal42);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal46 = bigDecimal13.divide(bigDecimal27, (int) '4', (int) (short) -33);
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
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal43);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.lang.String str3 = bigDecimal0.toPlainString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        int int7 = bigDecimal6.intValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal0.max(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.stripTrailingZeros();
        java.math.MathContext mathContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = bigDecimal0.add(bigDecimal9, mathContext11);
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
        org.junit.Assert.assertNotNull(bigDecimal10);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = java.math.BigInteger.probablePrime(5, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = locale4.getDisplayName();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        double double14 = bigInteger13.doubleValue();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger20 = bigInteger13.gcd(bigInteger19);
        java.math.BigInteger bigInteger21 = bigInteger19.negate();
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
        byte byte45 = bigInteger34.byteValueExact();
        java.math.BigInteger bigInteger46 = bigInteger19.and(bigInteger34);
        java.util.Locale locale47 = java.util.Locale.UK;
        boolean boolean48 = bigInteger46.equals((java.lang.Object) locale47);
        java.lang.String str49 = locale47.getVariant();
        java.lang.String str50 = locale4.getDisplayVariant(locale47);
        java.util.Locale locale51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = locale47.getDisplayCountry(locale51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str5, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean (South Korea)" + "'", str6, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
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
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("#_ENG", "A", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#_ENG" + "'", str3, "#_ENG");
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        short short7 = bigDecimal0.shortValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal0.scaleByPowerOfTen((-1));
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal10.movePointLeft((int) (byte) 0);
        java.lang.String str13 = bigDecimal12.toPlainString();
        byte byte14 = bigDecimal12.byteValueExact();
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
        byte byte28 = bigInteger22.byteValueExact();
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger22, (int) (byte) 0);
        java.math.BigDecimal bigDecimal31 = bigDecimal12.multiply(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = bigDecimal12.plus();
        java.math.RoundingMode roundingMode34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal35 = bigDecimal9.divide(bigDecimal32, 117, roundingMode34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
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
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -1 + "'", byte28 == (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        java.util.Locale locale1 = new java.util.Locale("Korean (South Korea)");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "korean (south korea)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("Cennese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(35L, 100L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale1.getDisplayLanguage(locale3);
        java.lang.String str6 = locale1.getISO3Language();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str5, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("\u82f1\u6587\u82f1\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "JPN                                                                                                                                                                                                                                                                                                          ", (java.lang.CharSequence) "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 301 + "'", int2 == 301);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(2L, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("fr-FR", "Deutschland", (int) 'a', 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr-FRDeutschland" + "'", str4, "fr-FRDeutschland");
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "French (France)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        int int15 = bigDecimal5.precision();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = bigDecimal5.setScale((int) (short) 16, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("Korean (South Korea)en-cen-cen", (int) (short) 117);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117 + "'", int2 == 117);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        double double14 = bigInteger13.doubleValue();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger20 = bigInteger13.gcd(bigInteger19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        java.math.BigInteger bigInteger28 = bigInteger19.or(bigInteger27);
        java.math.BigInteger bigInteger29 = bigInteger6.min(bigInteger28);
        byte[] byteArray32 = new byte[] { (byte) 1 };
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger((int) (short) -1, byteArray32);
        java.math.BigInteger bigInteger36 = bigInteger34.pow((int) 'a');
        byte[] byteArray37 = bigInteger34.toByteArray();
        long long38 = bigInteger34.longValueExact();
        java.lang.String str40 = bigInteger34.toString(0);
        byte[] byteArray43 = new byte[] { (byte) 1 };
        byte byte44 = org.apache.commons.lang3.math.NumberUtils.min(byteArray43);
        java.math.BigInteger bigInteger45 = new java.math.BigInteger((int) (short) -1, byteArray43);
        java.math.BigInteger bigInteger46 = bigInteger34.and(bigInteger45);
        java.math.BigInteger bigInteger47 = bigInteger45.abs();
        java.math.BigInteger bigInteger48 = bigInteger6.max(bigInteger45);
        java.math.BigInteger bigInteger49 = bigInteger6.abs();
        int int50 = bigInteger49.bitLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1" + "'", str40, "-1");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1]");
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.MathContext mathContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = bigDecimal10.plus(mathContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\uc774\ud0c8\ub9ac\uc544\uc5b4", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u6587", 'u');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0L);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.ulp();
        java.lang.String str7 = bigDecimal4.toString();
        int int8 = bigDecimal2.compareTo(bigDecimal4);
        int int9 = bigDecimal4.precision();
        int int10 = bigDecimal4.precision();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.divideToIntegralValue(bigDecimal4);
        byte byte12 = bigDecimal1.byteValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal7 = bigDecimal3.subtract(bigDecimal6);
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigInteger();
        double double9 = bigInteger8.doubleValue();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray12);
        java.math.BigInteger bigInteger14 = new java.math.BigInteger((int) (short) -1, byteArray12);
        java.math.BigInteger bigInteger15 = bigInteger8.gcd(bigInteger14);
        java.math.BigInteger bigInteger16 = bigInteger14.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal18.subtract(bigDecimal21);
        java.math.BigInteger bigInteger23 = bigDecimal22.toBigInteger();
        double double24 = bigInteger23.doubleValue();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        byte byte28 = org.apache.commons.lang3.math.NumberUtils.min(byteArray27);
        java.math.BigInteger bigInteger29 = new java.math.BigInteger((int) (short) -1, byteArray27);
        java.math.BigInteger bigInteger30 = bigInteger23.gcd(bigInteger29);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        java.math.BigInteger bigInteger38 = bigInteger29.or(bigInteger37);
        short short39 = bigInteger29.shortValueExact();
        byte byte40 = bigInteger29.byteValueExact();
        java.math.BigInteger bigInteger41 = bigInteger14.and(bigInteger29);
        java.util.Locale locale42 = java.util.Locale.UK;
        boolean boolean43 = bigInteger41.equals((java.lang.Object) locale42);
        java.util.Locale.setDefault(category1, locale42);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.lowerCase("Japanese", locale42);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1]");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1]");
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 1 + "'", byte28 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) -1 + "'", short39 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) -1 + "'", byte40 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "japanese" + "'", str45, "japanese");
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("English (Canada)", "en-US");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        char[] charArray8 = new char[] { 'x', '#', '4', ' ', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinese", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "x#4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "x#4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[x, #, 4,  , a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Zh_CN" + "'", str1, "Zh_CN");
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CN", "Korean (South Korea)en-cen-cen", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "fr_fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_fr" + "'", str1, "fr_fr");
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("Cennese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setUnicodeLocaleKeyword("Japanisch", "\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Japanisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("EN", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EN" + "'", str4, "EN");
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??????? [at index 0]");
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
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "South Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ja", "en_US", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 100.0f);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.ulp();
        java.lang.String str7 = bigDecimal4.toString();
        int int8 = bigDecimal2.compareTo(bigDecimal4);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal4.divide(bigDecimal10, (int) (short) 1);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal12.max(bigDecimal13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.math.BigDecimal bigDecimal19 = bigDecimal13.subtract(bigDecimal16);
        double double20 = bigDecimal16.doubleValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal1.divideToIntegralValue(bigDecimal16);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        double double23 = bigDecimal22.doubleValue();
        java.math.BigInteger bigInteger24 = bigDecimal22.toBigInteger();
        java.lang.String str25 = bigDecimal22.toPlainString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.negate();
        int int29 = bigDecimal28.intValueExact();
        java.math.BigDecimal bigDecimal30 = bigDecimal22.max(bigDecimal28);
        int int31 = bigDecimal30.precision();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal34 = bigDecimal32.negate();
        java.lang.String str35 = bigDecimal32.toString();
        java.math.BigDecimal bigDecimal37 = bigDecimal32.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        long long41 = bigDecimal40.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.lang.String str43 = bigDecimal40.toString();
        int int44 = bigDecimal38.compareTo(bigDecimal40);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal40.divide(bigDecimal46, (int) (short) 1);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.TEN;
        long long50 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal51 = bigDecimal48.max(bigDecimal49);
        java.math.BigDecimal bigDecimal52 = bigDecimal32.add(bigDecimal48);
        int int53 = bigDecimal30.compareTo(bigDecimal48);
        java.math.BigDecimal bigDecimal54 = bigDecimal16.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal56 = bigDecimal16.movePointRight((int) '#');
        int int57 = bigDecimal16.precision();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        short short7 = bigDecimal0.shortValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal0.scaleByPowerOfTen((-1));
        double double10 = bigDecimal9.doubleValue();
        java.math.MathContext mathContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = bigDecimal9.plus(mathContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 301);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Radix out of range");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ko-KR", 0, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko-KR" + "'", str3, "ko-KR");
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                        ???????? (??????)                                                        \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
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
        boolean boolean23 = bigInteger21.testBit(117);
        byte[] byteArray26 = new byte[] { (byte) 1 };
        byte byte27 = org.apache.commons.lang3.math.NumberUtils.min(byteArray26);
        java.math.BigInteger bigInteger28 = new java.math.BigInteger((int) (short) -1, byteArray26);
        java.math.BigInteger bigInteger30 = bigInteger28.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigInteger28.flipBit((int) 'a');
        java.math.BigInteger bigInteger33 = bigInteger21.divide(bigInteger32);
        java.lang.String str34 = bigInteger21.toString();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        byte byte38 = org.apache.commons.lang3.math.NumberUtils.min(byteArray37);
        java.math.BigInteger bigInteger39 = new java.math.BigInteger((int) (short) -1, byteArray37);
        java.math.BigInteger bigInteger41 = bigInteger39.pow((int) 'a');
        byte[] byteArray42 = bigInteger39.toByteArray();
        long long43 = bigInteger39.longValueExact();
        byte byte44 = bigInteger39.byteValueExact();
        java.lang.String str46 = bigInteger39.toString((int) (byte) 10);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal48 = bigDecimal47.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal52 = bigDecimal48.subtract(bigDecimal51);
        java.math.BigInteger bigInteger53 = bigDecimal52.toBigInteger();
        java.math.BigInteger bigInteger54 = bigInteger53.negate();
        java.math.BigInteger bigInteger55 = bigInteger39.xor(bigInteger53);
        java.math.BigInteger bigInteger56 = bigInteger21.subtract(bigInteger53);
        java.math.BigInteger bigInteger58 = bigInteger21.flipBit(30);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1]");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 1 + "'", byte27 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1" + "'", str34, "-1");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1]");
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-1" + "'", str46, "-1");
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x" + "'", str2, "x");
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("France", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "France" + "'", str2, "France");
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\uc5b4\uad6d\ud55c", "CAN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger53 = bigInteger4.pow((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Negative exponent");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        int int5 = bigDecimal1.scale();
        short short6 = bigDecimal1.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger38 = bigInteger35.setBit((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Negative bit address");
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
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setScript("frazho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: frazho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("\u30a4\u30bf\u30ea\u30a2\u8a9e  dnu");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????  dnu\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang3.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
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
        java.math.BigInteger bigInteger25 = java.math.BigInteger.TEN;
        java.math.BigInteger[] bigIntegerArray26 = bigInteger12.divideAndRemainder(bigInteger25);
        byte[] byteArray29 = new byte[] { (byte) 1 };
        byte byte30 = org.apache.commons.lang3.math.NumberUtils.min(byteArray29);
        java.math.BigInteger bigInteger31 = new java.math.BigInteger((int) (short) -1, byteArray29);
        java.math.BigInteger bigInteger33 = bigInteger31.pow((int) 'a');
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
        java.math.BigInteger bigInteger56 = bigInteger33.min(bigInteger55);
        java.math.BigInteger bigInteger57 = bigInteger25.divide(bigInteger56);
        int int58 = bigInteger56.intValueExact();
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
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigIntegerArray26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 1 + "'", byte30 == (byte) 1);
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
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        long long3 = bigDecimal1.longValue();
        int int4 = bigDecimal1.intValueExact();
        java.math.MathContext mathContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigDecimal1.abs(mathContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Englisch (Vereinigtes K\366nigreich)", "", 120, (int) 'u');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str4, "Englisch (Vereinigtes K\366nigreich)");
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale2.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale2.toLanguageTag();
        boolean boolean8 = locale2.hasExtensions();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("", locale2);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigInteger bigInteger16 = bigDecimal15.toBigInteger();
        double double17 = bigInteger16.doubleValue();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray20);
        java.math.BigInteger bigInteger22 = new java.math.BigInteger((int) (short) -1, byteArray20);
        java.math.BigInteger bigInteger23 = bigInteger16.gcd(bigInteger22);
        java.math.BigInteger bigInteger24 = bigInteger22.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigInteger bigInteger31 = bigDecimal30.toBigInteger();
        double double32 = bigInteger31.doubleValue();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        byte byte36 = org.apache.commons.lang3.math.NumberUtils.min(byteArray35);
        java.math.BigInteger bigInteger37 = new java.math.BigInteger((int) (short) -1, byteArray35);
        java.math.BigInteger bigInteger38 = bigInteger31.gcd(bigInteger37);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal44 = bigDecimal40.subtract(bigDecimal43);
        java.math.BigInteger bigInteger45 = bigDecimal44.toBigInteger();
        java.math.BigInteger bigInteger46 = bigInteger37.or(bigInteger45);
        short short47 = bigInteger37.shortValueExact();
        byte byte48 = bigInteger37.byteValueExact();
        java.math.BigInteger bigInteger49 = bigInteger22.and(bigInteger37);
        java.util.Locale locale50 = java.util.Locale.UK;
        boolean boolean51 = bigInteger49.equals((java.lang.Object) locale50);
        java.lang.String str52 = locale2.getDisplayCountry(locale50);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 1 + "'", byte36 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) -1 + "'", short47 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) -1 + "'", byte48 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        int int3 = bigDecimal2.precision();
        java.lang.String str4 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = null;
        java.math.MathContext mathContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = bigDecimal2.remainder(bigDecimal5, mathContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!", (java.lang.CharSequence) "zh-TW");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", charSequence2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zho", "\ud55c\uad6d\uc5b4", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UNITEDxSTATES");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=unitedxstates");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TW" + "'", str1, "TW");
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("en-GB");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9) ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal6.toEngineeringString();
        java.math.BigDecimal bigDecimal8 = bigDecimal3.multiply(bigDecimal6);
        java.math.BigDecimal bigDecimal10 = bigDecimal3.movePointLeft(0);
        java.math.BigDecimal bigDecimal11 = bigDecimal1.subtract(bigDecimal3);
        int int12 = bigDecimal11.scale();
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Englisch", "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("zh-cnzh-cnCN", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cnzh-cnCN" + "'", str3, "zh-cnzh-cnCN");
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("RF-RF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str1, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: fr-FR is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "english");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "RF-rf", "En-US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("italien", "Chinese");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal6 = bigDecimal5.stripTrailingZeros();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\uc77c\ub3c5\uc5b4\uc77c\ub3c5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("fR", 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\u65e5\u672c\u8a9e", 1073741825);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str2, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder5.build();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
        java.lang.String str10 = locale7.getDisplayName(locale9);
        java.util.Locale locale13 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.util.Locale.setDefault(locale13);
        boolean boolean15 = locale7.equals((java.lang.Object) locale13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("\u30a4\u30bf\u30ea\u30a2\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                 anglais", "                                                                                                 ", "uauauauayuiyuaxuawuawuavuivuevuauuauukuuguuytuwtuttustuatuatuntultuktuituatugtuetuatuwsuvsuusutsussuasuqsuasunsumsulsuksuisugsuesudsucsuasuwauuauaunaumauuqutpuspulpuipuapusauaumaujaucauynuvnuanuanunnulnugnuenudnubnuanuymutmusmuamuamunmulmukmuimuamugmuvluulutlualunluiluglublualuykuwkuvkuukuskuakuakunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuaiuniukiuiiugiueiudiuaiuauyauuautauauauiaueauauvguugungulgudguaguyauauaujauiauauauueuteuseuaeuneuleueeuaduvdueduaduycuvcuucuscuacuacuacuecuacusbuabuabunbumbuibuabugbuebuabuauyauvausauaunaumaukauaueaubau");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuanglais" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuanglais");
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        char[] charArray8 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("en_US", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(charArray8, 13, (int) (short) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Locale.Builder builder8 = builder6.setLocale(locale7);
        java.util.Locale locale12 = new java.util.Locale("uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa", "kor", "VEREINIGTES K\326NIGREICH");
        java.lang.String str13 = locale7.getDisplayName(locale12);
        java.util.Locale.setDefault(locale7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale12.toString(), "uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa_KOR_VEREINIGTES K\326NIGREICH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English (Canada)" + "'", str13, "English (Canada)");
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("i!hi!hi!hi!hi!hi!hi!hi!hi", (int) (short) -5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("en-US", "engCN");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                 anglais", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("engcn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("SETATS DETINU", "2-");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: SETATS DETINU [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
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
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigInteger bigInteger31 = bigDecimal30.toBigInteger();
        double double32 = bigInteger31.doubleValue();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        byte byte36 = org.apache.commons.lang3.math.NumberUtils.min(byteArray35);
        java.math.BigInteger bigInteger37 = new java.math.BigInteger((int) (short) -1, byteArray35);
        java.math.BigInteger bigInteger38 = bigInteger31.gcd(bigInteger37);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal44 = bigDecimal40.subtract(bigDecimal43);
        java.math.BigInteger bigInteger45 = bigDecimal44.toBigInteger();
        java.math.BigInteger bigInteger46 = bigInteger37.or(bigInteger45);
        short short47 = bigInteger37.shortValueExact();
        byte[] byteArray50 = new byte[] { (byte) 1 };
        byte byte51 = org.apache.commons.lang3.math.NumberUtils.min(byteArray50);
        java.math.BigInteger bigInteger52 = new java.math.BigInteger((int) (short) -1, byteArray50);
        java.math.BigInteger bigInteger54 = bigInteger52.pow((int) 'a');
        java.math.BigInteger bigInteger56 = bigInteger52.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger57 = bigInteger37.xor(bigInteger56);
        java.math.BigInteger bigInteger58 = bigInteger56.not();
        java.math.BigInteger bigInteger59 = bigInteger24.and(bigInteger58);
        java.math.BigInteger bigInteger61 = bigInteger58.shiftRight((int) 'x');
        java.math.BigInteger bigInteger62 = bigInteger8.add(bigInteger58);
        byte[] byteArray65 = new byte[] { (byte) 1 };
        byte byte66 = org.apache.commons.lang3.math.NumberUtils.min(byteArray65);
        java.math.BigInteger bigInteger67 = new java.math.BigInteger((int) (short) -1, byteArray65);
        java.math.BigInteger bigInteger69 = bigInteger67.pow((int) 'a');
        java.math.BigDecimal bigDecimal71 = new java.math.BigDecimal(bigInteger67, 34);
        java.math.BigInteger bigInteger72 = bigInteger58.remainder(bigInteger67);
        java.math.BigInteger bigInteger74 = bigInteger72.setBit(35);
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
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 1 + "'", byte36 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) -1 + "'", short47 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1]");
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 1 + "'", byte51 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1]");
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 1 + "'", byte66 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger74);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("UNITED STATES", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=unitedstates");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.MathContext mathContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = bigDecimal0.plus(mathContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("fr_FR", "und ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", (int) (short) -2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
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
        int int89 = bigInteger86.signum();
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
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        java.util.Locale locale1 = new java.util.Locale("it");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal2.toString();
        java.math.BigDecimal bigDecimal7 = bigDecimal2.scaleByPowerOfTen(0);
        boolean boolean8 = locale1.equals((java.lang.Object) bigDecimal7);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        byte byte11 = bigDecimal10.byteValueExact();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 10);
        float float14 = bigDecimal13.floatValue();
        long long15 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal10.divideToIntegralValue(bigDecimal13);
        long long17 = bigDecimal10.longValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
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
        java.math.BigDecimal bigDecimal22 = bigDecimal14.setScale(301);
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
        org.junit.Assert.assertNotNull(bigDecimal22);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("JA", "English (United Kingdom)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zho");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("zh_CN", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Korean (South Korea)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=korean(southkorea)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\uc77c\ub3c5\uc5b4\uc77c\ub3c5", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "e", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Cennese", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", ' ', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("e");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = bigInteger4.nextProbablePrime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: start < 0: -1");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -5, (-4), 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 117 + "'", int3 == 117);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "fr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
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
        byte byte33 = bigInteger32.byteValue();
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
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) -1 + "'", byte33 == (byte) -1);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", (java.lang.CharSequence) "2-");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", charSequence2, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen(0);
        short short6 = bigDecimal0.shortValueExact();
        java.math.RoundingMode roundingMode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = bigDecimal0.setScale(101, roundingMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -2, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0L);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        double double6 = languageRange2.getWeight();
        java.lang.String str7 = languageRange2.getRange();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chn" + "'", str7, "chn");
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2.0f, 120.0d, 16.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 120.0d + "'", double3 == 120.0d);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((long) (-10), mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        short short5 = bigInteger3.shortValueExact();
        java.math.BigInteger bigInteger7 = bigInteger3.flipBit((int) '4');
        java.math.BigInteger bigInteger8 = bigInteger3.abs();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(117, 0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Chinese (China)", "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zho");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("FRA", strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("english", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str8, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
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
        byte byte62 = bigInteger8.byteValueExact();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger64 = bigInteger8.clearBit((int) (short) -5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Negative bit address");
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
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) -2 + "'", byte62 == (byte) -2);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("hi");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setVariant("JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
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
        java.math.MathContext mathContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = bigDecimal12.abs(mathContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u65e5\u672c\u8a9e", (int) (short) 16);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str2, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("South Korea");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = bigDecimal1.subtract(bigDecimal2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "zh-cnzh-cn", (java.lang.CharSequence) "Eng                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Korean (South Korea)", (java.lang.CharSequence) "#_eng");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en_US", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (int) '4');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("#", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "jpn");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("chn", "hin", 301);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        char[] charArray9 = new char[] { 'x', '#', '4', ' ', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinese", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   JA", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(charArray9, (int) (byte) 10, (int) (short) -33);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((-1L), 7);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.negate();
        java.lang.String str6 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(objArray11, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean16 = bigDecimal8.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal17 = bigDecimal3.max(bigDecimal8);
        int int18 = bigDecimal2.compareTo(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal17.negate();
        java.math.MathContext mathContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal22 = bigDecimal17.pow((int) (short) 16, mathContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal19);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguageTag("\uc911\uad6d\uc5b4\uc911\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ???????? (??????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = java.math.BigInteger.probablePrime((int) (byte) -1, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf((-10L));
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\u82f1\u6587", "ita");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587" + "'", str2, "\u82f1\u6587");
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("FR-FR", (long) 299);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 299L + "'", long2 == 299L);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger((int) (byte) 10, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = bigDecimal8.plus();
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal((int) (short) 100);
        java.math.MathContext mathContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = bigDecimal8.multiply(bigDecimal13, mathContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale6 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.lang.String str7 = locale2.getDisplayScript(locale6);
        java.lang.String str8 = locale6.getVariant();
        java.lang.String str9 = locale0.getDisplayName(locale6);
        java.lang.String str10 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-CA" + "'", str3, "en-CA");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Korean (South Korea)" + "'", str9, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "KR" + "'", str10, "KR");
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0L);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        double double6 = languageRange2.getWeight();
        java.lang.String str7 = languageRange2.getRange();
        double double8 = languageRange2.getWeight();
        float[] floatArray14 = new float[] { '4', 0L, 4, 1L, 1 };
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray14);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray14);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray14);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray14);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray14);
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray14);
        float float21 = org.apache.commons.lang3.math.NumberUtils.max(floatArray14);
        boolean boolean22 = languageRange2.equals((java.lang.Object) floatArray14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chn" + "'", str5, "chn");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chn" + "'", str7, "chn");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[52.0, 0.0, 4.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 52.0f + "'", float16 == 52.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 52.0f + "'", float17 == 52.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 52.0f + "'", float18 == 52.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 52.0f + "'", float21 == 52.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!uuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en-CA", "hKorean (South Korea)en-cen-cen");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("UNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUND", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNDUNDUNDUNDUNDUNDUNDUNDUNDUND" + "'", str2, "UNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\u7f8e\u56fd", "TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7f8e\u56fd" + "'", str2, "\u7f8e\u56fd");
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!uuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
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
        double double18 = bigDecimal14.doubleValue();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        java.math.BigDecimal bigDecimal23 = bigDecimal19.stripTrailingZeros();
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray25 = bigDecimal14.divideAndRemainder(bigDecimal23);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.pow((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
        org.junit.Assert.assertNotNull(bigDecimal27);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("zh-TW", (int) 'x');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
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
        byte[] byteArray64 = new byte[] { (byte) 1 };
        byte byte65 = org.apache.commons.lang3.math.NumberUtils.min(byteArray64);
        java.math.BigInteger bigInteger66 = new java.math.BigInteger((int) (short) -1, byteArray64);
        java.math.BigInteger bigInteger68 = bigInteger66.pow((int) 'a');
        int int69 = bigInteger68.bitLength();
        java.math.BigInteger bigInteger70 = bigInteger60.max(bigInteger68);
        java.math.BigInteger bigInteger71 = bigInteger60.negate();
        short short72 = bigInteger71.shortValue();
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
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1]");
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 1 + "'", byte65 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 1 + "'", short72 == (short) 1);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "uuuuuuuuuuuuuuuuENGuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuENGuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuENGuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("jpnjpnjpnjpnjpnjpnjpnjpnjpnjpn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=jpnjpnjpnjpnjpnjpnjpnjpnjpnjpn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        char[] charArray12 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "United States", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "jpn", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FR-FR", charArray12);
        java.math.MathContext mathContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(charArray12, mathContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
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
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale2);
        java.lang.String str4 = locale2.getCountry();
        java.lang.String str5 = locale2.getVariant();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaUNITED STATESaaaaaaaaaa", locale6);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FR" + "'", str4, "FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaunited statesaaaaaaaaaa" + "'", str7, "aaaaaaaaaunited statesaaaaaaaaaa");
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("English");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList3, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList19, filteringMode22);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList19);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'u');
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 100.0f);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.ulp();
        java.lang.String str7 = bigDecimal4.toString();
        int int8 = bigDecimal2.compareTo(bigDecimal4);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal4.divide(bigDecimal10, (int) (short) 1);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal12.max(bigDecimal13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.math.BigDecimal bigDecimal19 = bigDecimal13.subtract(bigDecimal16);
        double double20 = bigDecimal16.doubleValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal1.divideToIntegralValue(bigDecimal16);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        double double23 = bigDecimal22.doubleValue();
        java.math.BigInteger bigInteger24 = bigDecimal22.toBigInteger();
        java.lang.String str25 = bigDecimal22.toPlainString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.negate();
        int int29 = bigDecimal28.intValueExact();
        java.math.BigDecimal bigDecimal30 = bigDecimal22.max(bigDecimal28);
        int int31 = bigDecimal30.precision();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal34 = bigDecimal32.negate();
        java.lang.String str35 = bigDecimal32.toString();
        java.math.BigDecimal bigDecimal37 = bigDecimal32.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        long long41 = bigDecimal40.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.lang.String str43 = bigDecimal40.toString();
        int int44 = bigDecimal38.compareTo(bigDecimal40);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal40.divide(bigDecimal46, (int) (short) 1);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.TEN;
        long long50 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal51 = bigDecimal48.max(bigDecimal49);
        java.math.BigDecimal bigDecimal52 = bigDecimal32.add(bigDecimal48);
        int int53 = bigDecimal30.compareTo(bigDecimal48);
        java.math.BigDecimal bigDecimal54 = bigDecimal16.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal56 = bigDecimal16.movePointRight((int) '#');
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal58 = bigDecimal57.negate();
        java.math.BigDecimal bigDecimal59 = bigDecimal57.negate();
        java.lang.String str60 = bigDecimal57.toString();
        java.math.BigDecimal bigDecimal62 = bigDecimal57.scaleByPowerOfTen(0);
        short short63 = bigDecimal57.shortValueExact();
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal65 = bigDecimal64.negate();
        java.math.BigDecimal bigDecimal66 = bigDecimal65.abs();
        long long67 = bigDecimal65.longValue();
        java.math.BigDecimal bigDecimal68 = bigDecimal57.add(bigDecimal65);
        java.math.RoundingMode roundingMode69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal70 = bigDecimal16.divide(bigDecimal57, roundingMode69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0" + "'", str60, "0");
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 0 + "'", short63 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal68);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(32, 301, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 301 + "'", int3 == 301);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u671d\u9c9c\u6587", "RF-RF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (-1L));
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal7 = bigDecimal3.subtract(bigDecimal6);
        java.lang.String str8 = bigDecimal3.toPlainString();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        double double10 = bigDecimal9.doubleValue();
        java.math.BigDecimal bigDecimal12 = bigDecimal9.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger13 = bigDecimal9.unscaledValue();
        long long14 = bigDecimal9.longValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal3.subtract(bigDecimal9);
        java.math.BigDecimal bigDecimal16 = bigDecimal9.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal1.multiply(bigDecimal16);
        java.math.BigDecimal bigDecimal18 = bigDecimal16.negate();
        java.math.MathContext mathContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = bigDecimal16.negate(mathContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Koreanisch(S\374dkorea)", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
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
        long long29 = bigInteger15.longValueExact();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger(byteArray31);
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(bigInteger33);
        boolean boolean35 = bigInteger15.equals((java.lang.Object) bigDecimal34);
        short short36 = bigDecimal34.shortValueExact();
        int int37 = bigDecimal34.scale();
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1]");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 1 + "'", short36 == (short) 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -33, (byte) -33, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -33 + "'", byte3 == (byte) -33);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("englisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "englisch" + "'", str1, "englisch");
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 32L, (double) 100L, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Vereinigtes K\366nigreich", "");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("\u65e5\u672c\u8a9e", strArray4, strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FR", (int) (short) 1);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("#", strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("United States", strArray4, strArray13);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "French (France)", 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str8, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "United States" + "'", str15, "United States");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
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
        boolean boolean58 = bigInteger56.testBit(117);
        double double59 = bigInteger56.doubleValue();
        java.math.BigInteger bigInteger60 = bigInteger20.subtract(bigInteger56);
        boolean boolean62 = bigInteger20.testBit((int) (byte) 10);
        byte byte63 = bigInteger20.byteValueExact();
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) -1 + "'", byte63 == (byte) -1);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\uad6d\ubbfc\ud55c\ub300", "fr_FR", "FR-FR", 1073741825);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uad6d\ubbfc\ud55c\ub300" + "'", str4, "\uad6d\ubbfc\ud55c\ub300");
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CHN\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             hi!uuu             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1.00E-98", (int) (byte) -33, "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.00E-98" + "'", str3, "1.00E-98");
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger36 = bigInteger7.nextProbablePrime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: start < 0: -1");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger("-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Radix out of range");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
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
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.lang.String str19 = bigDecimal16.toString();
        java.math.BigDecimal bigDecimal20 = bigDecimal16.stripTrailingZeros();
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal22 = bigDecimal20.plus();
        java.math.MathContext mathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = bigDecimal8.divideToIntegralValue(bigDecimal20, mathContext23);
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
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
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
        short short87 = bigInteger48.shortValueExact();
        boolean boolean89 = bigInteger48.equals((java.lang.Object) "Japanese");
        int int90 = bigInteger48.getLowestSetBit();
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
        org.junit.Assert.assertTrue("'" + short87 + "' != '" + (short) 0 + "'", short87 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Chinese", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u65e5\u672c\u8a9e", 11, '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str3, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "h", (java.lang.CharSequence) "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "h" + "'", charSequence2, "h");
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.lang.Object obj7 = null;
        boolean boolean8 = locale6.equals(obj7);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                           ", "SETATSxDETINU", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.lang.String str7 = locale0.getDisplayLanguage(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jpn" + "'", str5, "jpn");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Englisch" + "'", str7, "Englisch");
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(bigInteger6, (int) (byte) 0);
        boolean boolean10 = bigInteger6.testBit(0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "United States");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        long long1 = bigDecimal0.longValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "frazho", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("#_HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: #_HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\u82f1\u6587\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587\u82f1" + "'", str1, "\u82f1\u6587\u82f1");
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)", "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)" + "'", str2, "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal1.negate();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal6 = bigDecimal2.subtract(bigDecimal5);
        java.math.BigInteger bigInteger7 = bigDecimal6.toBigInteger();
        double double8 = bigInteger7.doubleValue();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger14 = bigInteger7.gcd(bigInteger13);
        java.math.BigInteger bigInteger15 = bigInteger13.negate();
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
        java.math.BigInteger bigInteger37 = bigInteger28.or(bigInteger36);
        short short38 = bigInteger28.shortValueExact();
        byte byte39 = bigInteger28.byteValueExact();
        java.math.BigInteger bigInteger40 = bigInteger13.and(bigInteger28);
        byte byte41 = bigInteger40.byteValueExact();
        byte[] byteArray42 = bigInteger40.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) 117, byteArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid signum value");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
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
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) -1 + "'", byte39 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) -1 + "'", byte41 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1]");
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u6587\u82f1\u56fd)", "gBR", "z-CN");
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587\u82f1\u56fd)_GBR_z-CN");
    }
}
