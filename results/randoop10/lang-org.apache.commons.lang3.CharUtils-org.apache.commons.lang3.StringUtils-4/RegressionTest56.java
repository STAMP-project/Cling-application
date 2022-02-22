import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest56 {

    public static boolean debug = false;

    @Test
    public void test28001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28001");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test28002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28002");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28003");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", strArray5);
        java.lang.String[] strArray8 = null;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6", strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str9, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test28004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28004");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (byte) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test28005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28005");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "u061u061061u0061u061u061u061u061");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\4  ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\4" + "'", str2, "\\4");
    }

    @Test
    public void test28007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28007");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA111111111111111111111u6111111111111111111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '7', 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28008");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("uUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28009");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "23\\u0023\\u...                                   0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023         0023   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "   23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("2                              \\2                              \\2                              \\2                              \\2                              \\2                              \\2                              \\2", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("222222222222222222222222222222222222222222222222222222222222u   6", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 104);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "222222222222222222222222222222222222222222222222222222222222u   6" + "'", str3, "222222222222222222222222222222222222222222222222222222222222u   6");
    }

    @Test
    public void test28013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28014");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("222223200U\\  ", "61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61", "    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "222223200U\\  " + "'", str3, "222223200U\\  ");
    }

    @Test
    public void test28015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28015");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u003                                                ", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("...                                                                                                                 ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test28016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28016");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u002e", (java.lang.CharSequence) "                                                                                               555555555555555                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 205 + "'", int2 == 205);
    }

    @Test
    public void test28017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", 306);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28018");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "1\\6");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...0##0230##\\0##U0##00230##\\0##U0##002375757575757575757575757575757575757575757575757575757575111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28020");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test28021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  6\\\\u0020", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28022");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 404, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28023");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1111111111111...", "\\U0033                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("u002322222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u002322222" + "'", str1, "u002322222");
    }

    @Test
    public void test28025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", '\r');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test28026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28026");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061", '2');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                           ...                                                                                                                                                                                                                          ", "3200", "7777777777777777777777777777777777777777777777777777777777777                                        a0u0023aaaaaaaaaaaaa                                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ih01001!ih0", 96, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28029");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "23\\u                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "AAAA...", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666" + "'", str3, "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
    }

    @Test
    public void test28031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28031");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("11111111111111. 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test28032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28032");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61\\ 61\\ 61");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       ", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       61" + "'", str3, "6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       61");
    }

    @Test
    public void test28033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("555555555555555", 17, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "555555555555555aa" + "'", str3, "555555555555555aa");
    }

    @Test
    public void test28034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("  6  6  6  6  6  UUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6  6  6  6  6  UUU" + "'", str1, "6  6  6  6  6  UUU");
    }

    @Test
    public void test28035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 ", "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6" + "'", str3, "1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6");
    }

    @Test
    public void test28036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("u6      61        61        61        61                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u661616161" + "'", str1, "u661616161");
    }

    @Test
    public void test28037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28037");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\iui0020\\4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28038");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "...111111111111111111111111111111111111111111111111111111111", "\\u0023                                                                                                                                                  hi!hi!hi!", 433);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test28039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "777777777777777777777777777777777777777777" + "'", str2, "777777777777777777777777777777777777777777");
    }

    @Test
    public void test28040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28040");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                        2", "0020\\u0##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28041");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU33333333333333333333UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28042");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAaaaaaaaaaaaaaaaa...023\\u0061\\u0061\\u0 61 \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 460, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...1\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "...1\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28043");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\" + "'", str1, "\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test28044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28044");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("a000u\\       UUUUUUUUUUUUUUUUUUU", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28045");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str2, "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test28047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA", "i!                                                                                   U002", "uuu  \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA");
    }

    @Test
    public void test28048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28048");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa      ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("333333333333333333333333333333333333333333u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test28049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28049");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1111111", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test28050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28050");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0", 202, 127);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28051");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023                                                                                     ", "      ", 92);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '1', 1, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test28052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575", "61\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575" + "'", str2, "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
    }

    @Test
    public void test28053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...1\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0020\\u0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28055");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("6666666666666666666666666666666666666666666666666666622222\\U0023\\U00\\u0041\\U002322222                                                                                                                                                              ", "2\\", (int) '6');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void test28056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28056");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "uuu6  6  6  6  6");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28057");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "...5    5...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (java.lang.CharSequence) "   ...                                                                                           \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...5    5...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", charSequence2, "...5    5...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test28058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28058");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0\\u0020\\u00", 46, (int) '7');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28059");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023                                                                                     hi!hi!hi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "11111", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                   2                              ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28060");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("u002322222", "                                                300u\\", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28061");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ih01001!ih0", (int) 'U', 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28062");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023002", "61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", 84);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28063");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'C', '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test28064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", (int) 'i', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16" + "'", str3, "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16");
    }

    @Test
    public void test28065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28065");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 113);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 113 + "'", int2 == 113);
    }

    @Test
    public void test28066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii                                  ", "aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("200u\\3200u\\3200u\\", " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023        75023\\u0023\\u002", "                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str1, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test28070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28070");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", 60);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test28071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) " 61.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("23\\U0023\\U", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\U0023\\U" + "'", str2, "23\\U0023\\U");
    }

    @Test
    public void test28073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28073");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("111111111", '6');
        java.lang.String[] strArray7 = new java.lang.String[] { "u 61..", "####A000U\\", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test28074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28074");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('C', 358);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 358 + "'", int2 == 358);
    }

    @Test
    public void test28075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("6161...", "                                                                                                                                                                                                                                                                 ####au");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6161..." + "'", str2, "6161...");
    }

    @Test
    public void test28076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                          11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......", "i!                                                                                   U003                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28078");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("          23\\u0023\\u0023          3    23\\u0023\\u0023      ", 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test28079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28079");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("      AAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      AAAA..." + "'", str1, "      AAAA...");
    }

    @Test
    public void test28080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28080");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                      \\U0023\\U00\\u0041\\U002", "U0023\\U0023\\U\\4003U0023\\U0023\\U0", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "... AAAA15AAAA AAAA15AAAA ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28082");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                         \n\n1           ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 82 + "'", int4 == 82);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test28083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28083");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '1', (int) 'I');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test28084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28084");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28085");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ", "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                ...", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28086");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAA                             HHHHHHHHHHHHHHHHH", 71, 168);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 71");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28087");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... 16 16 16 16 16 16 16 16 16                                                                                                                                                                                                                                         ", 'h');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28088");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("U00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28089");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "...h    h...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test28090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28090");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", " 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\" + "'", str2, "\\");
    }

    @Test
    public void test28092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28092");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   ", "0000000000000000U00232222200000000000000000", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh....................................................................................................                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh....................................................................................................                                    " + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh....................................................................................................                                    ");
    }

    @Test
    public void test28094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28094");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '5', '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '5' + "'", char2 == '5');
    }

    @Test
    public void test28095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28095");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("u005CU0U005CU0U0023uU005CU0U005CU0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U005C" + "'", str1, "\\U005C");
    }

    @Test
    public void test28097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28097");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200", "                                                                                            ccccccc      ", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28098");
        char[] charArray6 = new char[] { ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\4003", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28100");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test28101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28101");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\U0023\\U00\\u0041\\U", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28102");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6" + "'", str4, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
    }

    @Test
    public void test28103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A\\u0023AAAAAAAAAAAAAa000u\\", 'i');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      ", "      ");
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("h", strArray3, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "C", 54, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A\\u0023AAAAAAAAAAAAAa000u\\" + "'", str4, "A\\u0023AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test28104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u", "U0023\\U002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28105");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("11111111111U0023#U0023#U0023#U0023#U0023#U0023#U", "\\U000AAAAAAAAAAAAAA3200U\\A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28106");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("111111U1111111", "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023u6                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28108");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "6                                     ", (java.lang.CharSequence) "\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    " + "'", str1, "   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ");
    }

    @Test
    public void test28110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\", (java.lang.CharSequence) "       5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                              0U\\1600U\\1600U\\3200U\\U\\1600U\\1600U\\", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              0U\\1600U\\1600U\\3200U\\U\\1600U\\1600U\\" + "'", str2, "                              0U\\1600U\\1600U\\3200U\\U\\1600U\\1600U\\");
    }

    @Test
    public void test28113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\n                       ", 116, 85);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28114");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111161\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28115");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61", "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555561\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28116");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("1\\6", "aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               ", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\6" + "'", str3, "1\\6");
    }

    @Test
    public void test28118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   ", 88, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
    }

    @Test
    public void test28121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...0023h\\huh0023h\\huh0023h...", "                                         ...0023h\\hh0023h\\hh0023h                            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0023h\\huh0023h\\huh0023h..." + "'", str2, "...0023h\\huh0023h\\huh0023h...");
    }

    @Test
    public void test28122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28122");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                              ...", "6\\ 66\\ 6\\ 66\\ 6\\ 6 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 61 \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 136);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                              ..." + "'", str4, "                                                                                                                                                              ...");
    }

    @Test
    public void test28123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28123");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("1111111...");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111..." + "'", str3, "1111111...");
    }

    @Test
    public void test28124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28124");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0023\\U0023\\U0023\\U0023\\U0023\\U00", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 47);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test28125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                        ", 566);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test28126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!", 96, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!" + "'", str3, "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!");
    }

    @Test
    public void test28127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28128");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28129");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  ......  ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002361\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("u0023\\u002", (int) '3', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....................u0023\\u002....................." + "'", str3, "....................u0023\\u002.....................");
    }

    @Test
    public void test28131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28131");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0023\\00023\\00023\\ ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test28132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6" + "'", str1, "161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
    }

    @Test
    public void test28133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28133");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", 'A');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                       ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                              \\u0032");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test28134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28134");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0000002\\UUUUUUUU00000000000000000000000000000000000000000", '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000002\\UUUUUUUU00000000000000000000000000000000000000000" + "'", str2, "0000002\\UUUUUUUU00000000000000000000000000000000000000000");
    }

    @Test
    public void test28136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28137");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test28138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28138");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023                                                                                     hi!hi!hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0032", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5C1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test28139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28139");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("          aaaaaaa       ", 117, (int) 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28140");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", "           A\\u0023AAAAAAAAAAAAA  u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu           A\\u0023AAAAAAAAAAAAA   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("3200", 460, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuu3200" + "'", str3, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuu3200");
    }

    @Test
    public void test28142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28142");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 55 + "'", int21 == 55);
    }

    @Test
    public void test28143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28143");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test28144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28144");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 a\\U0023aaaaaaaaaaaaa", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" 61\\\\u0020", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\\\u" + "'", str2, " 61\\\\u");
    }

    @Test
    public void test28146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28146");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      ", 479, "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      " + "'", str3, "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ");
    }

    @Test
    public void test28147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("111111U1111111", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111U1111111" + "'", str2, "111111U1111111");
    }

    @Test
    public void test28148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("75                                      ...", "                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28150");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hhhhhhhhhhhhh", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "\\u0075");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("U61", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("2", "", 100);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray13, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray9, strArray13);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", strArray4, strArray13);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str19, "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          " + "'", str21, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test28151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28151");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("11111111111111uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\111111111111111", 'A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void test28152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "1\\ 1\\ 1\\ 1\\ 1\\ 11111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\ 1\\ 1\\ 1\\ 1\\ 11111111" + "'", str1, "1\\ 1\\ 1\\ 1\\ 1\\ 11111111");
    }

    @Test
    public void test28153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28153");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...0##0230##\\0##U0##00230##\\0##U0##002375757575757575757575757575757575757575757575757575757575111", 886, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28154");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28155");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'c', (int) 'h', 77);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test28156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28156");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str2, "hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test28158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28158");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                 a\\U0023aaaaaaaaaaaaa", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 a\\U0023aaaaaaaaaaaaa" + "'", str2, "                                 a\\U0023aaaaaaaaaaaaa");
    }

    @Test
    public void test28160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28160");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c\\u0", "a         ", 92);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "\\");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u", strArray6, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concatWith("10hi!10010hi!10010h\\400310hi!10010hi!10010hi", (java.lang.Object[]) strArray18);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                 ..", strArray18);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str14, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str15, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "23\\u0023\\u" + "'", str19, "23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str20, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test28161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28161");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\321\\ u1\\ 1\\ 1\\ 1\\ 1\\  1\\ u1\\ 1\\ 1\\ 1\\ 1\\", 834, 433);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA200U\\3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA200U\\3" + "'", str1, "AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA200U\\3");
    }

    @Test
    public void test28163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("u0034                                                                                          ", (int) 'c', "                                        a0u0023aaaaaaaaaaaaa                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    u0034                                                                                          " + "'", str3, "    u0034                                                                                          ");
    }

    @Test
    public void test28164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28164");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "57");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28165");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                            hhhhhhhhhhhhh", "55555555555555555555555555555555555555555555555#####4", 53);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28166");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ ", "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 297);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     " + "'", str4, "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
    }

    @Test
    public void test28167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ", 433);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           " + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ");
    }

    @Test
    public void test28168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1 61 6161 61 6161 61 6161 6", "\\u0023 hi!hi!hi!", "2.................................................................................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.61.6161.61.6161.61.6161.6" + "'", str3, "1.61.6161.61.6161.61.6161.6");
    }

    @Test
    public void test28169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28169");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'u', 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'u' + "'", char2 == 'u');
    }

    @Test
    public void test28170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28170");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                  I!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...1\\61\\61\\61\\   2     ...                                ...    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28172");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("\\U0023", strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0023                                                                                     hi!hi!hi!", 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("U61", strArray8, strArray15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '\r', 86, 86);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray3, strArray8);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'C');
        java.lang.Class<?> wildcardClass25 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "U61" + "'", str16, "U61");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str21, "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test28173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("16116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6116116116116116116116116116116116116116116116116116116116116116" + "'", str2, "6116116116116116116116116116116116116116116116116116116116116116");
    }

    @Test
    public void test28174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28174");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1111111      ", "\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068" + "'", str1, "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068");
    }

    @Test
    public void test28176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\\u00", "                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00" + "'", str2, "\\u00");
    }

    @Test
    public void test28178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28178");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '2', 153);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test28179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28179");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\                                      030                 \\u", 8, 635);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28180");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ', (int) '\\', (int) (short) 1);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                        ", strArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("u61", '1');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ", strArray5, strArray16);
        java.lang.Class<?> wildcardClass20 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "u6" + "'", str18, "u6");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     " + "'", str19, "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test28181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "...\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test28182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28182");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28183");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                         \n\n1                                                    \n\n1                                  61\\", "\\\\2\\\\\\\\\\2\\\\\\ 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("     \\U0023\\U00\\u0041\\U0023     ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \\U0023\\U00\\u0041\\U0023     " + "'", str3, "     \\U0023\\U00\\u0041\\U0023     ");
    }

    @Test
    public void test28185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U0023AAAAAAAAAAAAAA000U\\", "23\\u###\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u", "...3\\U0##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U0023AAAAAAAAAAAAAA000U\\" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U0023AAAAAAAAAAAAAA000U\\");
    }

    @Test
    public void test28186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("U5C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u5c" + "'", str1, "u5c");
    }

    @Test
    public void test28187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", "aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test28188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "610000000000000000000000000000000000000000000000000                                  0auu0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28189");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "H", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A                                                                                                                                                                ", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "51", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test28190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28190");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                       \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test28192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  2  UUUUU", 297, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  2  UUUUUhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "  2  UUUUUhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test28193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28193");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                   16u", "                                                                                   16u", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", 111);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\" + "'", str4, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
    }

    @Test
    public void test28194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28194");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!                                                                                   U0023                          ", "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test28195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("I", 44, "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666AAAAAAAAAAAAAAAAAI6666AAAAAAAAAAAAAAAAAA" + "'", str3, "6666AAAAAAAAAAAAAAAAAI6666AAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28196");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                 ", "222222222222222222222222222222uu55                                            2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test28197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str1, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test28198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 6, "                                         AAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
    }

    @Test
    public void test28199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28199");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111", "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 54, 173);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023757575757                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str4, "111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023757575757                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test28200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28200");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "u0023", 90);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("U0023                                            ");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny(" ", strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "\\u005c\\u00");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test28201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28201");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("3", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("\\400326666666666666666666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\4003266666666666666666666666666666666666666", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test28202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\4003");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                ", 297, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test28204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\", "                                       AAAAAAAAAAAAA3200u\\A                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                 16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\" + "'", str1, "                                                                                                                                 16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\");
    }

    @Test
    public void test28206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("        #######    61        61        615c    61        61        61", (int) '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1        61        615c    61        61        61" + "'", str2, "1        61        615c    61        61        61");
    }

    @Test
    public void test28207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("23\\u0023\\u...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u..." + "'", str1, "23\\u0023\\u...");
    }

    @Test
    public void test28208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444", 118, "...023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757" + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757");
    }

    @Test
    public void test28209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0020                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020                                        " + "'", str1, "\\u0020                                        ");
    }

    @Test
    public void test28210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                300u\\", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                300u\\" + "'", str2, "                                                300u\\");
    }

    @Test
    public void test28211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("... 61uuuuuuuuuuuuuuuuuuuuu   u61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... 61uuuuuuuuuuuuuuuuuuuuu   u61" + "'", str1, "... 61uuuuuuuuuuuuuuuuuuuuu   u61");
    }

    @Test
    public void test28212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28212");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("           \n\n161\\ 61\\ 6", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28214");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1\\ 1\\ 1\\ 1\\ 1\\ 11111111", "1111U0023#U0023#U0023#U", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", " 6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA" + "'", str1, "                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA");
    }

    @Test
    public void test28217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28217");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u\\", "###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test28218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28218");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!1", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28219");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\n\n\n\n\n\n\n\n\n\n\n\n                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n", "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28220");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u61", '0');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test28221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055", "                       61\n                       ", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", "23\\U                                                                                            ", "\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016" + "'", str3, "161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016");
    }

    @Test
    public void test28223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28223");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002361\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                ", 237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...3\\U0##########", 191, '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...3\\U0##########333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str3, "...3\\U0##########333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
    }

    @Test
    public void test28225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh", '.', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAuuuaaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh" + "'", str3, "AAAAuuuaaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh");
    }

    @Test
    public void test28226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6", "                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28228");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28229");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("5700u\\", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "      " + "'", str5, "      ");
    }

    @Test
    public void test28230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6", " U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A" + "'", str3, "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
    }

    @Test
    public void test28233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###", "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###");
    }

    @Test
    public void test28234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28235");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28236");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("111111111111111111111u6111111111111111111111", "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28237");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("23\\u0023\\u0023\\u002");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002", (int) '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "###\n###" + "'", str9, "###\n###");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "###" + "'", str11, "###");
    }

    @Test
    public void test28238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28238");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa", "61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                 \\u0030                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28240");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                           \\\\335c", 117);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28241");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28242");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55", "723aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28243");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U002066666666666666666666666666666666666666", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", 508);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test28244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r", "iiiiiiiiiiiiiiiiiiiiiiiiiiiU775Ciiiiiiiiiiiiiiiiiiiiiiiiiiii7777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r");
    }

    @Test
    public void test28245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28245");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222", "        #######    61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U", "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U" + "'", str2, "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
    }

    @Test
    public void test28247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("5555555                                             ...", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555                                             ..." + "'", str2, "5555555                                             ...");
    }

    @Test
    public void test28248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("d", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28249");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\UUU02\\... 3hi!hi!hi!                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                                              ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test28251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("UUUUUUUUUUu6UUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUu6UUUUUUUUUUU" + "'", str1, "UUUUUUUUUUu6UUUUUUUUUUU");
    }

    @Test
    public void test28252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28252");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "11111111111111111111111111111...", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A\\u0061\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\3AAAAAAAAAAAAAa000u\\", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test28253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("5500u\\", 'u', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5500\r\\" + "'", str3, "5500\r\\");
    }

    @Test
    public void test28254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28254");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444444444", (int) (byte) 100, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...", " 61\\\\50020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                              5c", 22, 113);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              5c" + "'", str3, "                                              5c");
    }

    @Test
    public void test28257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28257");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("2U...", " 23");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28259");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28260");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 'I');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA111111111111111111111u6111111111111111111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                 \\u0023                                                                                     hi!hi!hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA111111111111111111111u6111111111111111111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA111111111111111111111u6111111111111111111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28262");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", charSequence2, "AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28263");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a000u\\", 'h');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", "\\u0075", (int) (byte) 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 117);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("3000u\\3111111111111111111111111111111111111111111111", strArray9, strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaa 61\\ 61\\61aaaaaaaa", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str10, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str16, "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3000u\\3111111111111111111111111111111111111111111111" + "'", str17, "3000u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aaaaaaaa 61\\ 61\\61aaaaaaaa" + "'", str18, "aaaaaaaa 61\\ 61\\61aaaaaaaa");
    }

    @Test
    public void test28264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28264");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaa\\\\\\", "i!", (int) (byte) 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0023", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "U   6");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test28265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("61\\ 61\\ 61\\ 61\\ 61\\ 611111111..", 85, (int) '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("6116116116116116116116116116116116116116116116116116116116116116", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6116116116116116116116116116116116116116116116116116116116116116" + "'", str2, "6116116116116116116116116116116116116116116116116116116116116116");
    }

    @Test
    public void test28267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "6\\\\u0020                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28268");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...", "3200U\\3200U\\\\i\\3200U\\3200U\\3", "                                                                                      u\\32");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28269");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#####4", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28270");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) (short) -1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("\\u005c", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "\\u0023                                                                                     ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\n");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray8, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str12, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test28271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ".\\16 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#6666\r\r\r\r\r\r\r##", "...0u\\3114...0u\\31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#6666\r\r\r\r\r\r\r##" + "'", str2, "#6666\r\r\r\r\r\r\r##");
    }

    @Test
    public void test28273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28273");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28275");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test28276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28276");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     00U\\3200U\\3200U\\3200U\\3200U\\3200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     00U\\3200U\\3200U\\3200U\\3200U\\3200" + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     00U\\3200U\\3200U\\3200U\\3200U\\3200");
    }

    @Test
    public void test28278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28278");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "111111111", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U003aaaaaa                                             ", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "33333333", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test28279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Iaaaaaaaaaaaa", 92, (int) '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Iaaaaaaaaaaaa" + "'", str3, "Iaaaaaaaaaaaa");
    }

    @Test
    public void test28280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28280");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28281");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                        ..        ", "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhhh", 460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28282");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("3200U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28284");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("11111111111u6111111111111111111111", "iiiiiiiiiii 6\\\\u0020iiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0023\\u0...", 64, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7777777777777777777777777770023\\u0...777777777777777777777777777" + "'", str3, "7777777777777777777777777770023\\u0...777777777777777777777777777");
    }

    @Test
    public void test28286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("30\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30\\\\\\\\" + "'", str1, "30\\\\\\\\");
    }

    @Test
    public void test28287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 834);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test28288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "...1\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test28289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("         a          ", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         a          " + "'", str2, "         a          ");
    }

    @Test
    public void test28290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("261                                                                                                                    ", (int) '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              " + "'", str2, "                                              ");
    }

    @Test
    public void test28291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                              23\\u0023\\u0023\\u002                                                       ", 56, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              23\\u0023\\u0023\\u002                                                       " + "'", str3, "                              23\\u0023\\u0023\\u002                                                       ");
    }

    @Test
    public void test28292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28292");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'U', '7');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test28293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("21", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\", 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "21" + "'", str3, "21");
    }

    @Test
    public void test28294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\\u0055                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                          23\\U0023\\U                                          ", 49, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          23\\U0023\\U                                          " + "'", str3, "                                          23\\U0023\\U                                          ");
    }

    @Test
    public void test28296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28296");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\321\\ u1\\ 1\\ 1\\ 1\\ 1\\  1\\ u1\\ 1\\ 1\\ 1\\ 1\\", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1", 449);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28297");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 340);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 340 + "'", int2 == 340);
    }

    @Test
    public void test28298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test28299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100" + "'", str1, "666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
    }

    @Test
    public void test28300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28300");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1", 82);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28301");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("000000000000000000000000000000...             ", "A...\\61\\61\\61\\61\\U0023     ...A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28302");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\U005C                                                                                                                                                                  ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28303");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("23\\u0023\\u0023323\\u0023\\u0023                                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 936);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28304");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("400u\\00U\\3200U\\", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 20);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("##############################################.16 ", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test28305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\U0023\\U00", "                            UUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U00" + "'", str2, "\\U0023\\U00");
    }

    @Test
    public void test28306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("23\\U                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U                                         " + "'", str1, "23\\U                                         ");
    }

    @Test
    public void test28307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1" + "'", str1, "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1");
    }

    @Test
    public void test28308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28308");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("5c", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '6');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "      " + "'", str8, "      ");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test28309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28309");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28310");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28311");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                             ", "222222222222222222222222222222222222222222222U6                                          ", 94);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("222222222222222222222222222222222\\UUU02\\...2222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222222222222222222222222222222\\UUU02\\...2222222222222222222222222222222222" + "'", str1, "222222222222222222222222222222222\\UUU02\\...2222222222222222222222222222222222");
    }

    @Test
    public void test28313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str2, "a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test28314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28314");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28315");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        ", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a000u\\       ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test28316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "111111111        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("       aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa          ", "  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28318");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...h    h...                                                                                            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003" + "'", str2, "u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003");
    }

    @Test
    public void test28320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("6\\ 66\\ 6\\ 66\\ 6\\ 6 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "A 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\ 66\\ 6\\ 66\\ 6\\ 6 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66" + "'", str2, "6\\ 66\\ 6\\ 66\\ 6\\ 6 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
    }

    @Test
    public void test28321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("2\\u0032\\u0032\\u0032", "\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075", "u003");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28322");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '\\');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                     61aaaaaaaaaaaaaaaaaaaaaa...", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     61aaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "                     61aaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test28324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 116);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002                     " + "'", str2, "                                                    23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002                     ");
    }

    @Test
    public void test28325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test28326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28326");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "                              11111                                ", 77);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28327");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "IIIIIIIIIIIII...AAAA      ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str5, "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str7, "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test28328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28328");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("161\\ 61\\ 6", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16", 138);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28329");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test28330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                        0U\\                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0U\\" + "'", str1, "0U\\");
    }

    @Test
    public void test28331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("u1111111111111111111111111111111111111111111116", (int) (byte) 0, 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u1111111111111111111111111111111111111111111116" + "'", str3, "u1111111111111111111111111111111111111111111116");
    }

    @Test
    public void test28332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6" + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6");
    }

    @Test
    public void test28333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "222222222222222222222222222222222222222222222u6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test28334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28334");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) " 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  ", (java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28335");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test28336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28336");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "UUUUUUUUUUUUUUUUUU\\4555555555555555555555555");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6" + "'", str1, "\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6");
    }

    @Test
    public void test28339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28339");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!", "\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                   ", (int) (short) 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test28340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28340");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "iiiiiiiiiiiiiiiii23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61 + "'", int1 == 61);
    }

    @Test
    public void test28341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                   ######", 14, 127);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     ######" + "'", str3, "     ######");
    }

    @Test
    public void test28342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28342");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaa...", "", "                                                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test28344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\u0023\\", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\" + "'", str2, "\\u0023\\");
    }

    @Test
    public void test28345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28345");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\4003", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 191, "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28347");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                 ...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111" + "'", str2, "...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test28349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u", "11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111", "61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu" + "'", str3, "u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu");
    }

    @Test
    public void test28351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28351");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u", '5');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                    \n                     ", strArray3, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "1111");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                    \n                     " + "'", str7, "                    \n                     ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u" + "'", str10, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
    }

    @Test
    public void test28352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\\\400326666666666666666666666666", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333" + "'", str3, "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333");
    }

    @Test
    public void test28353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28353");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("6666AAAAAAAAAAAAAAAAAI6666AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6666aaaaaaaaaaaaaaaaai6666aaaaaaaaaaaaaaaaaa" + "'", str1, "6666aaaaaaaaaaaaaaaaai6666aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUUUUUUUUUUUUUUUUUUUUU", "\\400326666666666666666666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\4003266666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28355");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAAAAA     \\u0041                                                                                ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 73, 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAA     \\u0041           \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                         " + "'", str4, "AAAAAAA     \\u0041           \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                         ");
    }

    @Test
    public void test28356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", (int) '6', "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h " + "'", str3, "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ");
    }

    @Test
    public void test28358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                               HUUU02HUUU02HUUU02HAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HUUU02HUUU02HUUU02HAAAAAAAAAAAAA" + "'", str1, "HUUU02HUUU02HUUU02HAAAAAAAAAAAAA");
    }

    @Test
    public void test28359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28359");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\iui0020", "11111", 7);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28360");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       231111111111111", "           161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("7777777777777777", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7777777777777777" + "'", str2, "7777777777777777");
    }

    @Test
    public void test28362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28362");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("...U0020U0020U0020U0020U0020U0020U0020U0020U0020...", "\\u0030");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...U0020U0020U0020U0020U0020U0020U0020U0020U0020..." + "'", str2, "...U0020U0020U0020U0020U0020U0020U0020U0020U0020...");
    }

    @Test
    public void test28364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U" + "'", str2, "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
    }

    @Test
    public void test28365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28365");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                  U0023\\U0023\\U\\4003U0023\\U0023\\U0", "0000000000000000000000000000000000000000000000000000  2   0000000000000000000000000000000000000000000000000000", 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28366");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test28367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28367");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28368");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u000a", "032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", 886);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ua" + "'", str4, "ua");
    }

    @Test
    public void test28369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28369");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("5700u\\", 46, "23\\u                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5700u\\23\\u                                    " + "'", str3, "5700u\\23\\u                                    ");
    }

    @Test
    public void test28370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28370");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  \\U005C  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U005C" + "'", str1, "\\U005C");
    }

    @Test
    public void test28371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28371");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", "", 306);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
    }

    @Test
    public void test28372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28372");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "u6      61        61        61        61      ", (java.lang.CharSequence) "                                         \n\n                                                     \n\n                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28373");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                       aaaaaaaaaaaaa", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28374");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("161\\ 61\\ 6", "uuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000", "                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000" + "'", str2, "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
    }

    @Test
    public void test28376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28377");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28378");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28379");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaa", "\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28380");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("C", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                  uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("1111111111...", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28383");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih!ih   2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2 ", "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666664300u\\", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("UUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "UUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test28385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28385");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1\\61\\6161\\61\\6161\\61\\6161\\6", "0Ucaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("6u666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666u6" + "'", str1, "666u6");
    }

    @Test
    public void test28387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ", "333333333333333333333333333333333333333333333333333333333333333333333333333333310HI!100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  " + "'", str2, "\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ");
    }

    @Test
    public void test28388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "uuuuuuuuuuuuuuuuuu\\4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61aaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "61aaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("  ......  \\u00410023\\U0023\\U0023\\U0023\\U0023\\U001\\u0041\\u006666666666666666666666666666666666666666", "0023\\u0023\\u0023\\ U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ......  \\u00410023\\U0023\\U0023\\U0023\\U0023\\U001\\u0041\\u006666666666666666666666666666666666666666" + "'", str2, "  ......  \\u00410023\\U0023\\U0023\\U0023\\U0023\\U001\\u0041\\u006666666666666666666666666666666666666666");
    }

    @Test
    public void test28391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("3232323232323                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3232323232323                                                  " + "'", str1, "3232323232323                                                  ");
    }

    @Test
    public void test28392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...AAAA      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAA      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61" + "'", str2, "...AAAA      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
    }

    @Test
    public void test28393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                  I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28394");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32" + "'", str1, "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32");
    }

    @Test
    public void test28395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28395");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28396");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                       aaaaaaaaaaaaa\\\\\\", "000000000000000000000000000000.....", "A...\\61\\61\\61\\61\\U0023     ...A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       aaaaaaaaaaaaa\\\\\\" + "'", str3, "                                       aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test28397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28397");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                         ", 1000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28398");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   ...", "\\u0023\\u00\\U0041\\u", 17);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\61\\61\\61\\61\\61\\61aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test28399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28399");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                     ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                         75                                                          ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test28400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28400");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("             u0023\\u002u0023\\u002u0023\\u002u0", "                                                         ", 94);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                 A\\u0023AAAAAAAAAAAAA                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test28401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U", 562, '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test28402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28402");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0020\\u0020\\u0020\\u0020\\u0020\\u...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u..." + "'", str1, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u...");
    }

    @Test
    public void test28403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28403");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...    ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str2, "                                                                                                   20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test28405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28405");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "61Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("2U2U2U2U2U2U2U2U2U2", "u0034                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2U2U2U2U2U2U2U2U2U2" + "'", str2, "2U2U2U2U2U2U2U2U2U2");
    }

    @Test
    public void test28407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666", 63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28408");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                           \\\\U005C005c", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("U005cu0u005cu0u0023Uu005cu0u005cu0", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ ", "...HH...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U005cu0u005cu0u0023Uu005cu0u005cu0" + "'", str3, "U005cu0u005cu0u0023Uu005cu0u005cu0");
    }

    @Test
    public void test28410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28410");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                            UUUUUUUUUUUUUUUUUU", "u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28411");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   c                                           \\u005");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test28413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28413");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\u003\\u0023\\u0023\\u0023\\                                                                                                                ", "UUUUUUUUUUUUUUUUUU\\4555555555555555555555555", 57, 26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\  UUUUUUUUUUUUUUUUUU\\4555555555555555555555555                                                                               " + "'", str4, "\\u003\\u0023\\u0023\\u0023\\  UUUUUUUUUUUUUUUUUU\\4555555555555555555555555                                                                               ");
    }

    @Test
    public void test28414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28414");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057" + "'", str1, "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057");
    }

    @Test
    public void test28415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                            AAAAAAAAAAAAA3100\\A                             6\\6\\66\\6\\66\\6\\66\\6...", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("        61        61        61   ", 68, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        61        61        61   55555555555555555555555555555555555" + "'", str3, "        61        61        61   55555555555555555555555555555555555");
    }

    @Test
    public void test28417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28417");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", "A000u\\");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '3');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316" + "'", str4, "161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316");
    }

    @Test
    public void test28418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                             136u66136u", 189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             136u66136u                                                                                                      " + "'", str2, "                                                                             136u66136u                                                                                                      ");
    }

    @Test
    public void test28420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28420");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("16        16        16        16        16        16        16        16        16", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("41", "61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "U61616161616161616161616161U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str2, "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test28423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28423");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\3u30053c", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\u0023                                                                                                                                                  hi!hi!hi!", "\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u002" + "'", str2, "\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test28425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\" + "'", str1, "\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\");
    }

    @Test
    public void test28426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "  UUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28427");
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray19);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray19);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray19);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray19);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray19);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray19);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray19);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!10010hi!10010h\\400310hi!10010hi!10010hi", charArray19);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", charArray19);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray19);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "33333333333333333333333333333\\40032333333333333333333333333333333", charArray19);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "22222222222222222222uuu0023                                            222222222222222222222", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 48 + "'", int31 == 48);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test28428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("u0023#u0023#u0023#u0023#u0023#u0023#u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023#u0023#u0023#u0023#u0023#u0023#u0023" + "'", str1, "u0023#u0023#u0023#u0023#u0023#u0023#u0023");
    }

    @Test
    public void test28429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28429");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                        41                                                                                                                                                                         ", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh" + "'", str1, "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh");
    }

    @Test
    public void test28431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", '2');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u", 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28432");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\", "2.................................................................................................", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28433");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUU..55          aaaaaaa       CCCCCCCCCCCCCCCC", "...hhhhhhhhhhhhhhhhhhhhhU61hhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28434");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\\\hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "               51               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" 61.##########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61.##########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, " 61.##########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28437");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("5700u\\", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("3\\u1111111111111111111111111111111111111111111116", 127, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111113\\u1111111111111111111111111111111111111111111116111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111113\\u1111111111111111111111111111111111111111111116111111111111111111111111111111111111111");
    }

    @Test
    public void test28439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28439");
        char[] charArray11 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U61", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U0023", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...  16        16        16        16        16        16        16        16        16", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test28440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28440");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "2                              \\2                              \\2                              \\2                              \\2                              \\2                              \\2                              \\2", (java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28441");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("I!                                                                                   ", "aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(" 61\\ 6161\\ 61\\ 6161\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28444");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("i", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test28447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28447");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28448");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0Ucaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test28450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28450");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 1AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28451");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("a         ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("55555555555", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test28452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28452");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                       \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\", "\\u0020                                         61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28453");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                 A\\u0023AAAAAAAAAAAAA                                  ", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16", "023\\u0023       aaaaaaa", 53);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                 A\\u0023AAAAAAAAAAAAA                                  " + "'", str4, "                                 A\\u0023AAAAAAAAAAAAA                                  ");
    }

    @Test
    public void test28454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...1111111111111111111111111111111111111111...", "111111111111111111111u61111111111111111111111123\\U                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...1111111111111111111111111111111111111111..." + "'", str2, "...1111111111111111111111111111111111111111...");
    }

    @Test
    public void test28455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28455");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####A000U\\", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test28456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28456");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) " 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("..\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\", "                      75");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\" + "'", str2, "..\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\");
    }

    @Test
    public void test28458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("3333361                                         \n\n133323\\U                                                                                             3333361                                         \n\n1333");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333" + "'", str1, "3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333");
    }

    @Test
    public void test28459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28460");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 'I');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("            1hi!1             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            1HI!1             " + "'", str1, "            1HI!1             ");
    }

    @Test
    public void test28462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28462");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                        ...");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("61\\ 61\\ 61", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\ 61" + "'", str2, "61\\ 61\\ 61");
    }

    @Test
    public void test28464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                      75");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      75" + "'", str1, "                      75");
    }

    @Test
    public void test28465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28465");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("002300230023002300230023002300230A000U\\002300230023002300230023002300230");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test28467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("uuuuuuuuuuuuuuuuuu\\4", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuu\\4" + "'", str2, "uuuuuuuuuuuuuuuuuu\\4");
    }

    @Test
    public void test28468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28468");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u", "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1", "aa        75");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28469");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("77777777777777777777700000000000000000000777777777777777777777", "75 ", "001!ih01");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28470");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28471");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61616161616161616161616161", "\\\\0020");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "61616161616161616161616161" + "'", str5, "61616161616161616161616161");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test28472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" 6...", "5700u\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28473");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2aaaaaaaaaaaaaa", "...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28474");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih!ih!i", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("U0023000000000000000000000000000000000000000000000", "                            aaaaaaaaaaaaa3200\\a                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023000000000000000000000000000000000000000000000" + "'", str2, "U0023000000000000000000000000000000000000000000000");
    }

    @Test
    public void test28476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28476");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("00u\\3200u\\3200u\\3200u\\3200u\\3200", "", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test28477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u c", "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28478");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\", (java.lang.CharSequence) "6\\\\u0020                                                                     ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\" + "'", charSequence2, "\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\");
    }

    @Test
    public void test28479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               " + "'", str2, "aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               ");
    }

    @Test
    public void test28480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28480");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", (java.lang.CharSequence) "\\u0023                                                                                     hi!hi!hi!                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("UUUU", "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   2     ...                                ...    \\U0023", "\\i\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28483");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void test28484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28484");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("61\\ 61\\ ...", "000000000000000000000000000000...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28485");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444", "AAAA51AAAA", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28486");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str2, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str4, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
    }

    @Test
    public void test28487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28487");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61        61        61        61        61        61        61        61        61        61        61        61        61", '\\');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61        61        61        61        61        61        61        61        61        61        61        61        61" + "'", str3, "61        61        61        61        61        61        61        61        61        61        61        61        61");
    }

    @Test
    public void test28488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                ", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test28489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("11111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111" + "'", str1, "11111");
    }

    @Test
    public void test28490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28490");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", "41", 78);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("002u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "6...0000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                              41                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                              41                                                                                                                                                                         " + "'", str1, "                                                                                                                              41                                                                                                                                                                         ");
    }

    @Test
    public void test28493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28493");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                                                           ...                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 440 + "'", int1 == 440);
    }

    @Test
    public void test28494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u", 566);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test28495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28495");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "3\\U00237575757575757575757575757575757575757575757", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28496");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555", "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", 339);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\");
    }

    @Test
    public void test28498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("    222222222222222222222222222222222", 138, "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test28499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444423\\u0023\\u444444444444444444444", "a0U0023aaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28500");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("777777777777777777777777777777777777777777    61    7777777777777777777777777777777777777777777", "iiiiiiii\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

