import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4001AAAAAAA", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 001AAAAAAA" + "'", str3, " 001AAAAAAA");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "-...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        char[] charArray9 = new char[] { 'a', '#', '4', ' ', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1004", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                              0.0  0.1-                                                        ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4,  , 4, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                        -1.0     0.0");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0  0.0" + "'", str7, "-1.0  0.0");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("-1.0  0.0 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "1.00.0", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaa10041", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("           AAAAAAAHI!AAAAAA1004", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4001AAAAAAA", "               !IHAAAAAAA               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               !IHAAAAAAA               " + "'", str2, "               !IHAAAAAAA               ");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ihaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("###################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", "########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1.0  0.0", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaahi!HI!", (java.lang.CharSequence) "aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "                              0.0  0.1-                                                        ", "#################################################0.0##################################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "-1.0  0.0                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("-1.0   AAAAAAA10040.", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0   AAAAAAA10040." + "'", str2, "-1.0   AAAAAAA10040.");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str2, "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                             ####4", "-1.0   AAAAAAA10040.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                    !ihaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAhi!AAAAAA10041", (java.lang.CharSequence) ".0  0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa" + "'", str1, "!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaa", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4                                      AAAAAAAhi!AAAAAA100414", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                                      AAAAAAAhi!AAAAAA100414" + "'", str2, "4                                      AAAAAAAhi!AAAAAA100414");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaahi!aaaaaa1004", "AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!aaaaaa1004" + "'", str3, "aaaaaaahi!aaaaaa1004");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               hi!                                               ", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", (int) (byte) 1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!####                                                             ", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!####                                                             " + "'", str10, "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!####                                                             ");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(".0  0.1-", "aaaaaaahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("1.0     0.", "AAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0     0." + "'", str2, "1.0     0.");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("           AAAAAAAHI!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14001AAAAAA!IHAAAAAAA           " + "'", str1, "14001AAAAAA!IHAAAAAAA           ");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              0.0  0.1-", "4444444444444444444444444444440.0440.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                  ########", "AAAAAAA1004");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaahi!HI!", 91, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Aaaaaaahi!aaaaaa10041", 88, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################Aaaaaaahi!aaaaaa10041##################################" + "'", str3, "#################################Aaaaaaahi!aaaaaa10041##################################");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!ihaaaa...", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#################################Aaaaaaahi!aaaaaa10041##################################", (int) ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################Aaaaaaahi!aaaaaa10041##################################" + "'", str3, "#################################Aaaaaaahi!aaaaaa10041##################################");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaahi", "hi!ihaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                  AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", "                                                                                  ########", "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                  AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI" + "'", str3, "                                                                                  AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               hi!                                               ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 88, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", "hi!ih", 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", "0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                        -1.0     0.0", (int) (byte) 0, "                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0" + "'", str3, "                                        -1.0     0.0");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("-1.0   AAAAAAA10040.", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4###4###4###4###4###4###4###4###4###4##", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                            aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                            aaaaaaahi!aaaaaa10041" + "'", str1, "                                                                            aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0.0", "14001aaaaaa!ihaaaaaaA", "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1.0  0.0 ", 90);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1.00.0", "########################################-1.0#####0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                             ####4", "#################################Aaaaaaahi!aaaaaa10041##################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str3, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!ihaaaaaaa", (int) '4');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!" + "'", str1, "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("-1.0     0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0" + "'", str1, "-1.0     0");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", "!ihaaaaaaa... ...", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4###4###4###4###4###4###4###4###4###4###", "      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                               i!                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!####                                                             ", 911);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                ##########################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 40, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "... ...", (java.lang.CharSequence) "                                              ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "... ..." + "'", charSequence2, "... ...");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaahi!444444444444444444444444444444444444444444", "AAAAAAA1004");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaahi!", "Aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!" + "'", str2, "aaaaaaahi!");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!HI!" + "'", str1, "aaaaaaahi!HI!");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaahi!aaaaaa1004", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.00.0                                                                                       aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00.0                                                                                       aaaaaaahi!HI" + "'", str2, "0.00.0                                                                                       aaaaaaahi!HI");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaa                              0.0  0.1-HI!hi!", "                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                              0.0  0.1-HI!hi!" + "'", str2, "aaaaaaa                              0.0  0.1-HI!hi!");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "4                                      AAAAAAAhi!AAAAAA100414                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0.00.0                                                                                       AAAAAAAHI!hi", " ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                          aaaaaaa10041", strArray5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 88");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0.00.0                                                                                       aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.00.0                                                                                       aaaaaaahi!HI" + "'", str1, "0.00.0                                                                                       aaaaaaahi!HI");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("!ihaaaaaaa... ...", "                                                                     10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaaaaaaa... ..." + "'", str2, "!ihaaaaaaa... ...");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("14001aaaaaaa", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) " 001AAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 001AAAAAAA" + "'", str1, " 001AAAAAAA");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("-1.0  0.0 ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAHI!AAAAAA1004", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#############################################0.0     0.1-", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################0.0     0.1-" + "'", str2, "#############################################0.0     0.1-");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  ", "hi!ihaaaaaaa                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                        -1.0     0.0#############################################", "AAAAAAAHI!", 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) (short) 0, (int) (byte) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                        -1.0     0.0#############################################" + "'", str8, "                                        -1.0     0.0#############################################");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("        ...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ..." + "'", str2, "        ...");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0. -1.0", "aaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                  ########", "... ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("ihaaaaaa", "HI!                                                                                          aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihaaaaaa" + "'", str2, "ihaaaaaa");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("1.0     0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0     0." + "'", str1, "1.0     0.");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str1, "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAA10041                        ", "       AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 0.0  0.1-" + "'", str1, " 0.0  0.1-");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 12, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".HI..." + "'", str2, ".HI...");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaa                              0.0  0.1-HI!hi!", ".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa                              0.0  0.1-HI!hi!" + "'", str3, "aaaaaaa                              0.0  0.1-HI!hi!");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-1.00.0", "   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#############aaaaaaahi!#-1.0#####0.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("        ...", "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                        -1.0     0.0");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0.0", "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!ih", "                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                            aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                            AAAAAAAHI!AAAAAA10041" + "'", str1, "                                                                            AAAAAAAHI!AAAAAA10041");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                          AAAAAAA1004", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     ..." + "'", str2, "                                                                                     ...");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" 001AAAAAAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "-1.0  0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0." + "'", str1, "-1.0  0.");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("   ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10041" + "'", str3, "10041");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaa10041", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str3, "                                                                                          aaaaaaa10041");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                    ", "aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaah", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "1.0  0.0 ", 0, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1.0  0.0 " + "'", str4, "1.0  0.0 ");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                        -1.0     0.0#############################################", "1", 939);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                               hi!                                               ", "h");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                              0.0  0.1-", strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   ", "10041");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("... ...", strArray10);
        java.lang.String[] strArray12 = null;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.", strArray10, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040." + "'", str13, "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("14001aaaaaa!ihaaaaaaA", "AAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("   4", "                                                                                  AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI" + "'", str2, "                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi" + "'", str1, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###################################", 0, "!ihAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################" + "'", str3, "###################################");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("-1.0   AAAAAAA10040.", " 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0   AAAAAAA10040." + "'", str2, "-1.0   AAAAAAA10040.");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("-1.0  0.0 ", 95, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                     -1.0  0.0 " + "'", str3, "                                                                                     -1.0  0.0 ");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi4", "", 91);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa", 20, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("########", 0, "                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########" + "'", str3, "########");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 61, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                            AAAAAAAHI!AAAAAA10041", "aaaaaaa10041", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.00.0", "aaaaaaahi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("-1.0   AAAAAAA10040.", (java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.00.0" + "'", str4, "-1.00.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.00.0" + "'", str5, "-1.00.0");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                ##########################################################################################", "aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4####-     ", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("        ...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("0.00.0                                    ", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "        ..." + "'", str6, "        ...");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("10041", "0.00.0                                    ", 35, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100410.00.0                                    " + "'", str4, "100410.00.0                                    ");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!", 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ih!IHAAAAAAA                                                                                       0.00.0", "                                                 0.0                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!IHAAAAAAA                                                                                       0.00.0" + "'", str2, "ih!IHAAAAAAA                                                                                       0.00.0");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                 -1.0  0.0                                                  ", "ih!IHAAAAAAA                                                                                       0.00.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", 939);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 " + "'", str2, " 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4444444444444444444444444444440.0440.1-", "!ihaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str1, "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#############AAAAAAAHI!#-1.0#####0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0#####0.1-#!IHAAAAAAA#############" + "'", str1, ".0#####0.1-#!IHAAAAAAA#############");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaahi!", "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("-1.0  0.0 ", "AAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAi!iAAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                     -1.0  0.0 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                               hi!                                               ", "-1.00.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAA1004", "-1.0 0.0", 88);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", "!IHAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4###4###4###4###4###4###4###4###4###4###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4####", "ihaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4####" + "'", str2, "4####");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                  ########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("14001aaaaaa!ihaaaaaaa                                                                            ", "!ihAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14001aaaaaa!ihaaaaaaa                                                                            " + "'", str2, "14001aaaaaa!ihaaaaaaa                                                                            ");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   ", "-1.0a a a0.0");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 8, 7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444444440.0440.1-", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444440.0440.1-" + "'", str2, "4444444444444444444444444444440.0440.1-");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                               hi!                                               ", 13, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               hi!                                               " + "'", str3, "                                               hi!                                               ");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("-1.0     0.0", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ihAAAAAAA       ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0.00.0                                                                                       aaaaaaahi!HI!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ih!IHAAAAAAA                                                                                       0.00.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "#############aaaaaaahi!#-1.0#####0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                  ########", "4001AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  ########" + "'", str2, "                                                                                  ########");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaahi!aaaaaa10041", "                                ", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("-1.0     0-1.0     0-1.0     0-1.0     0", "                                AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0-1.0     0-1.0     0-1.0     0" + "'", str2, "-1.0     0-1.0     0-1.0     0-1.0     0");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4001AAAAAAA", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                              0.0  0.1-                                                        ", 61, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              0.0  0.1-                                                        " + "'", str3, "                              0.0  0.1-                                                        ");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("4                                                                                                ", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                    !ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                    !ihaaaaaaa" + "'", str1, "                                                                                    !ihaaaaaaa");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "#################################Aaaaaaahi!aaaaaa10041##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH" + "'", str2, "IH");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("h", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################0.0     0.1-                                        " + "'", str1, "#############################################0.0     0.1-                                        ");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaahi!444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa", "", (int) (short) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaa10041");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("###################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################" + "'", str1, "###################################");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                        -1.0     0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0." + "'", str1, "-1.0     0.");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("-1.0     0-1.0     0-1.0     0-1.0     0", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0-1.0     0-1.0     0-1.0     0" + "'", str2, "-1.0     0-1.0     0-1.0     0-1.0     0");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0. -1.0", "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaahi!", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 97, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444440. -1.044444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4", "HI!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#                                                                                          aaaaaaahi!", "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("           AAAAAAAHI!AAAAAA10041                                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1", "", "0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0.0a a a0.1-", (int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004", 24, "                                                 -1.0  0.0                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004" + "'", str3, "   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih", "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach(" 0.0  0.1-", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " 0.0  0.1-" + "'", str7, " 0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih" + "'", str8, "14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "-1.0  0.0                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 51, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                          aaaaaaa1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa1004" + "'", str1, "aaaaaaa1004");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa", "           AAAAAAAHI!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "-1.0     0-1.0     0-1.0     0-1.0     0", (java.lang.CharSequence) "########################################-1.0#####0.");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "-1.0     0-1.0     0-1.0     0-1.0     0" + "'", charSequence2, "-1.0     0-1.0     0-1.0     0-1.0     0");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", "0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!i" + "'", str1, "hi!i");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                 0.0                                                  ", "-1.0  0.0 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("14001aaaaaa!ihaaaaaaA", "", "aa        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0  0.0 ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########################################################################################", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.00.0                                                                                       AAAAAAAHI!hi", 95);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("   4", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", "                                ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("-1.0     0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0" + "'", str1, "-1.0     0");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-1.0  0.0                               ", "1.0  0.0                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaa", "AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                            AAAAAAAHI!AAAAAA10041", "hi4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH" + "'", str1, "iH");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaa", "  ", "                                                                                          aaaaaaa1004");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("           AAAAAAAHI!AAAAAA10041                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           AAAAAAAHI!AAAAAA10041                                                          " + "'", str1, "           AAAAAAAHI!AAAAAA10041                                                          ");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", 6, 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        " + "'", str3, "                                        ");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                          aaaaaaa10041", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str2, "                                                                                          aaaaaaa10041");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4###4###4###4###4###4###4###4###4###4###", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4                                      AAAAAAAhi!AAAAAA100414");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", 11, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA..." + "'", str3, "aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                    !ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ihaaaa...", " 0.0  0.1-", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                    ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("A", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAHI!", "                                                                                          aaaaaaa10041");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "A", 1, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAHI!" + "'", str4, "AAAAAAAHI!");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4####", 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaahi!aaaaaa10041" + "'", str1, "Aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", 51, "IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str3, ".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaahi!aaaaaa10041", "                                ", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4####                                                             ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444                                          ", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", (int) (byte) -1, "HI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 " + "'", str3, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0", "0.00.0", (int) 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("                                ", "10041", (int) (byte) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                ", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#                                                                                          aaaaaaahi!", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#                                                                                          aaaaaaahi!" + "'", str12, "#                                                                                          aaaaaaahi!");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", 51, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!", "-1.0     0-1.0     0-1.0     0-1.0     0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str2, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "aaaaaaahi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0" + "'", str3, "-1.0  0.0");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", 939);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI" + "'", str2, "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0" + "'", str1, "0.0");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi" + "'", str2, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1004", "HI!", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4                                      AAAAAAAhi!AAAAAA100414");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4AAAAAAAhi!AAAAAA100414" + "'", str1, "4AAAAAAAhi!AAAAAA100414");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#############################################0.0     0.1-", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "14001aaaaaa!ihaaaaaaa                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("-1.00.", ".0#####0.1-#!IHAAAAAAA#############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aa        ", "4444444444444444444444444444440.0440.1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa        " + "'", str2, "aa        ");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("1.0     0.", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         1.0     0.                                          " + "'", str2, "                                         1.0     0.                                          ");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "#                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#                                                                                          aaaaaaahi!" + "'", str1, "#                                                                                          aaaaaaahi!");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                        -1.0     0.0", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1.0     0.0" + "'", str2, "        -1.0     0.0");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041", "aaaaaaahi!aaaaaa1004");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaahi!444444444444444444444444444444444444444444", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaahi!", "                                AAAAAAAHI!AAAAAA1004", " 001AAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi" + "'", str3, "aaaaaaahi");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0  0.0 ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "14001aaaaaa!ihaaaaaaA", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                    !ihaaaaaaa", (java.lang.CharSequence) "AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                               i!                                               ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0.00.0                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("               !IHAAAAAAA               ", "4####                                                             ", 8, 61);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "        4####                                                             " + "'", str4, "        4####                                                             ");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", "i!i");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                    ", strArray1, strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    " + "'", str3, "                                                    ");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("1.0  0.0", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0", "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0  0.0" + "'", str3, "1.0  0.0");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!                                                                                          " + "'", str1, "hI!                                                                                          ");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                          aaaaaaa1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa1004" + "'", str1, "aaaaaaa1004");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi4444444444444444444444444444440.0440.1-!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4444444444444444444444444444440.0440.1-!" + "'", str1, "hi4444444444444444444444444444440.0440.1-!");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                             ####4", "#############################################0.0     0.1-                                        ", " 001AAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                             ####4" + "'", str3, "                                                             ####4");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!IH       ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "                                                                                          aaaaaaahi!", (int) ' ');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                               hi!                                               ", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10041" + "'", str9, "10041");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10041" + "'", str10, "10041");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("100410.00.0                                    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!                                                                                          aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                                          aaaa" + "'", str1, "HI!                                                                                          aaaa");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa", "14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("           AAAAAAAHI!AAAAAA10041                                                          ", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           AAAAAAAHI!AAAAAA10041                                                          " + "'", str2, "           AAAAAAAHI!AAAAAA10041                                                          ");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", "HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0.00.0                                    ", "aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaahi!HI!", "##########################################################################################", "                                                                            aaaaaaahi!aaaaaa10041", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaahi!HI!" + "'", str4, "aaaaaaahi!HI!");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("1.0     0.", "1.0  0.0 ", 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1.0     0.1.0  0.0 " + "'", str4, "1.0     0.1.0  0.0 ");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                          AAAAAAA1004", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          AAAAAAA1004" + "'", str2, "                                                                                          AAAAAAA1004");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaa", "#############################################0.0     0.1-", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                 -1.0  0.0                                                   ", "!ihaaaaaaa                                                                                          ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", (-1), 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("-1.0  0.", "hi4444444444444444444444444444440.0440.1-!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!                                                                                          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                          " + "'", str2, "HI!                                                                                          ");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1.0     0.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                                                                          AAAAAAA1004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1.0     0.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1.0     0.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" ", 102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("100", "0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0   aaaaaaa10040.", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "########################################-1.0#####0.", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-1.0  0.0                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0 ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaa                              0.0  0.1-HI!hi!", 10, 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...              ..." + "'", str3, "...              ...");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", "0. -1.0", 90, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-" + "'", str4, "0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("               !IHAAAAAAA               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IHAAAAAAA" + "'", str1, "!IHAAAAAAA");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                              0.0  0.1-", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4###4###4###4###4###4###4###4###4###4##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4###4###4###4###4###4###4###4###4###4##" + "'", str1, "4###4###4###4###4###4###4###4###4###4##");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4                                                                                                ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "", 90, 90);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str8, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                       AAAAAAAHI!HI!" + "'", str1, "                                                                                       AAAAAAAHI!HI!");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0.00.0", "...", 102, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.00.0..." + "'", str4, "0.00.0...");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "14001aaaaaaa", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...", (int) (short) 10, "aa        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI" + "'", str1, "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4###4###4###4###4###4###4###4###4###4##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4###4###4###4###4###4###4###4###4###4##" + "'", str1, "4###4###4###4###4###4###4###4###4###4##");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "-1.0  0.0", (java.lang.CharSequence) "                              0.0  0.1-                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0.00.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.00.0" + "'", str1, "0.00.0");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4###4###4###4###4###4###4###4###4###4###", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4###4###4###4###4###4###4###4###4###4###" + "'", str2, "4###4###4###4###4###4###4###4###4###4###");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0" + "'", str1, "0.0");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "               !IHAAAAAAA               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                              ####4                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "ihaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihaaaaaa" + "'", str1, "ihaaaaaa");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "-1.0  0.0                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "       AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", "0.00.0...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aaaaaaa10041", (java.lang.CharSequence) "hI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaa10041" + "'", charSequence2, "aaaaaaa10041");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444                                          ", "                                                                                          aaaaaaahi!", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("-1.0     0-1.0     0-1.0     0-1.0     0", "                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0-1.0     0-1.0     0-1.0     0" + "'", str2, "-1.0     0-1.0     0-1.0     0-1.0     0");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##########################################################################################", ".0#####0.1-#!IHAAAAAAA#############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("-1.0     0-1.0     0-1.0     0-1.0     0", "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "100410.00.0                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100410.00.0                                    " + "'", str1, "100410.00.0                                    ");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaahi!", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "a");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("1.0     0.", "aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0     0." + "'", str3, "1.0     0.");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                    !ihaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAhi!AAAAAA10041", "   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI" + "'", str3, "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                    ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4001AAAAAA!IHAAAAAAA           ", 91, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!IH       ", "44444444444444444444440. -1.044444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                  a                                                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1.0     0.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4####-     ", "1.0     0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4####-     " + "'", str2, "4####-     ");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                            AAAAAAAHI!AAAAAA10041", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  AAAAAAAHI!AAAAAA10041" + "'", str2, "                                                                  AAAAAAAHI!AAAAAA10041");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4####                                                             ", "1.0  0.0 ", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                       AAAAAAAHI!HI!", "4                                                                                                ", "14001aaaaaa!ihaaaaaaA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                       AAAAAAAHI!HI!" + "'", str3, "                                                                                       AAAAAAAHI!HI!");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ihaaaaaaa                                                                                          ", "4                                      AAAAAAAhi!AAAAAA100414                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                                                                                          " + "'", str2, "aaaaaaa                                                                                          ");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                      ", 95, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                        -1.0     0.", "aaaaaaahi!HI!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0." + "'", str3, "                                        -1.0     0.");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4                                                                                                ", (java.lang.CharSequence) "ih!IHAAAAAAA                                                                                       0.00.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!IHAAAAAAA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                              0.0  0.1-", strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IHAAAAAAA" + "'", str3, "!IHAAAAAAA");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        char[] charArray13 = new char[] { '#', '4', ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                        -1.0     0.", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                          ", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 7, 939);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hI!                                                                                          ", "                                               i!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                            AAAAAAAHI!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0  0.0 ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(".HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".HI..." + "'", str1, ".HI...");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", "aaaaaaa10041", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA..." + "'", str2, "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#############################################0.0     0.1-                                        ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaahi!aaaaaa1004", "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                      ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      " + "'", str2, "                                                                                      ");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                ##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!IHAAAAAAA                                                                                       0.00.0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA10041" + "'", str1, "AAAAAAA10041");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-", "                                                             ####4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(" 001AAAAAAA", "1004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 001AAAAAAA" + "'", str2, " 001AAAAAAA");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          AAAAAAA1004", "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#############################################0.0     0.1-                                        ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                     ...", "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     ..." + "'", str2, "                                                                                     ...");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1.0  0.0 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("10041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 4, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ihaaaa...", "###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...", "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4", "                                                                            aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!ihaaaaaaa                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", "hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######" + "'", str2, "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!aaaaaa1004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1.0  0.0", "                              0.0  0.1-                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaah", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaah" + "'", str2, "aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaah");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444440. -1.044444444444444444444444", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444440. -1.044444444444444444444444" + "'", str2, "44444444444444444444440. -1.044444444444444444444444");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(".", "   4");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10041", "hi!ih", (int) (byte) 100);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0.0a a a0.1-", 106, 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 911, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "-", (java.lang.CharSequence) "aa        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0.0a a a0.1-", 24, 939);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0a a a0.1-" + "'", str3, "0.0a a a0.1-");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#############AAAAAAAHI!#-1.0#####0.", "#############################################0.0     0.1-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaahi!aaaaaa10041", "4001AAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0" + "'", str1, "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!i", 0, "4                                      AAAAAAAhi!AAAAAA100414                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i" + "'", str3, "hi!i");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                 -1.0  0.0                                                   ", "               !IHAAAAAAA               ", (int) 'a');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaa1004", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444441004" + "'", str3, "44444441004");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.00.0", 106, 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa", "                                                 -1.0  0.0                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ih!IHAAAAAAA                                                                                       0.00.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IHAAAAAAA                                                                                       0.00.0" + "'", str1, "IH!IHAAAAAAA                                                                                       0.00.0");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 74, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!ihaaaa...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!AAAAAA10041");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaahi!HI!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-...", "", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                             ####4", "hi!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             ####4" + "'", str2, "                                                             ####4");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0", 40, "AAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAi!iAAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", "aa        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004", "... ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ..." + "'", str2, "... ...");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-1.0     0.0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0.0" + "'", str2, "-1.0     0.0");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.00.0                                                                                       AAAAAAAHI!hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) " 001AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("           AAAAAAAHI!AAAAAA1004", "aaaaaaahi!444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                              ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ihAAAAAAA       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihAAAAAAA       " + "'", str2, "!ihAAAAAAA       ");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                          ", 94, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("        4####                                                             ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        4####                                                             " + "'", str2, "        4####                                                             ");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaa10041", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa10041" + "'", str2, "aaaaaaa10041");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                   ", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                               i!                                               ", "#################################################0.0##################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################0.0##################################################" + "'", str2, "#################################################0.0##################################################");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", "0.00.0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("-1.00.", "                                                                                       AAAAAAAHI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00." + "'", str2, "-1.00.");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                 -1.0  0.0                                                   ", "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0" + "'", str2, "-1.0  0.0");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1.0     0.1.0  0.0 ", 101, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0     0.1.0  0.0 ##################################################################################" + "'", str3, "1.0     0.1.0  0.0 ##################################################################################");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                          AAAAAAA1004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAA10041                        ", "##########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0  0.0 " + "'", str1, "1.0  0.0 ");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "... ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                 -1.0  0.0                                                   ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0 -1.0" + "'", str2, "0.0 -1.0");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAAAAAAI!IAAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAA..." + "'", str1, "AAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAAAAAAI!IAAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAA...");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa" + "'", str2, "aaaaaa");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("... ...", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ..." + "'", str2, "... ...");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0.0", "AAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAAAAAAI!IAAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0" + "'", str2, "0.0");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0", 939, "                                                  a                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 " + "'", str3, "                                                  a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("-1.0  0.0                               ", "-1.0     0.", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAHI!", "                                                                                          aaaaaaa10041");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "                                                                                          aaaaaaahi!", (int) ' ');
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("                                               hi!                                               ", strArray12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '#', 0, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("-1.00.0", strArray6, strArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.endsWithAny("                                   ", strArray6);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "0.0");
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny("4", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAAHI!" + "'", str7, "AAAAAAAHI!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10041" + "'", str17, "10041");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.00.0" + "'", str18, "-1.00.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("-...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", 94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                            AAAAAAAHI!AAAAAA10041", "hi!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.00.0", "                                               hi!                                               ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaaaaaaa" + "'", str1, "!ihaaaaaaa");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 35, "           aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################" + "'", str1, "##########################################################################################");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", "hI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############################################0.0     0.1-                                        ", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.00.0                                    ", 7, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0  0.0 ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                        ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                  a                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAA");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("iH", "aaaaaaa", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("10041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10041" + "'", str5, "10041");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAAAAA10041", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA10041" + "'", str2, "AAAA10041");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0  0.0 ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                                                  a                                                  ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.00.0                                                                                       AAAAAAAHI!hi", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1004", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                                                                                    ");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-" + "'", str9, "0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                AAAAAAAHI!AAAAAA1004", 51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        char[] charArray10 = new char[] { '#', '4', ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ihaaaaaaa", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0     0.0", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0.00.0", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ihaaaaaaa                                                                                         ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IHAAAAAAA", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!ih       ", (java.lang.CharSequence) "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 438 + "'", int2 == 438);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4", "        4####                                                             ", "0.00.0                                                                                       aaaaaaahi!HI!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str2, "i!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                               i!                                               ", "                                                                              ####4                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               i!                                               " + "'", str2, "                                               i!                                               ");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("-1.0 0.0", ".0  0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.0     0.0", "                                                                                          aaaaaaa10041");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "aaaaaaa10041");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str13, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0.00.0                                    ", "444444444444444444444440.1- .04444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", "                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        " + "'", str1, "        ");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                               aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi" + "'", str1, "                                                                               aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!ih       ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih                                                                                               " + "'", str2, "hi!ih                                                                                               ");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a" + "'", str2, "a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4                                      AAAAAAAhi!AAAAAA100414", "aaaaaaahi!aaaaaa1004");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4                                                                                                ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str8, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa", "", (int) (short) 100);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaa10041");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                  ########", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                        -1.0     0.0#############################################", " 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        char[] charArray15 = new char[] { '#', '4', ' ', '4' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                        -1.0     0.", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                          ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("           aaaaaaahi!aaaaaa10041", charArray15);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                 -1.0  0.0                                                  ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 49 + "'", int26 == 49);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aa        ", "-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa        " + "'", str3, "aa        ");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAAAAAAI!IAAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

