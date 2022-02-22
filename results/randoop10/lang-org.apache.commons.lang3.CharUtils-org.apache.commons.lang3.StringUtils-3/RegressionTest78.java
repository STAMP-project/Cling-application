import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest78 {

    public static boolean debug = false;

    @Test
    public void test39001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39001");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\u0023\\u00\\U0041\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                 \\u0036                                                                 ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 \\u0036                                                                 " + "'", str2, "                                                                 \\u0036                                                                 ");
    }

    @Test
    public void test39003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1", 508);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1" + "'", str2, ".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1");
    }

    @Test
    public void test39004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                               i!                                                                                                                                                                                                                 ", 161, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                               i!                                                                                                                                                                                                                 " + "'", str3, "                                                                                                                               i!                                                                                                                                                                                                                 ");
    }

    @Test
    public void test39006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39006");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test39007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39007");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39008");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u003");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test39009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39009");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555a......a555555", "\\U0023\\U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39010");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "23 U  23 U", 111);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39011");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("111111111aaaa", "4", 60);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("61\\ 61\\ 6161\\ 61\\ 6161   61\\ 61\\ 6161\\ 61\\ 6161", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "111111111aaaa" + "'", str7, "111111111aaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "111111111aaaa" + "'", str8, "111111111aaaa");
    }

    @Test
    public void test39012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("1        61   ", "1\\u00234                                      \\u0023\\u00\\U00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00234                                      \\u0023\\u00\\U00" + "'", str2, "\\u00234                                      \\u0023\\u00\\U00");
    }

    @Test
    public void test39013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39013");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 89);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39014");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           ", "\\0023\\0023\\0023\\0023\\0023\\0023\\0023...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39015");
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa                                                ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("  2   ", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test39016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39016");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'h', (int) '1', 3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u   6aaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test39017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                        a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        A" + "'", str1, "                        A");
    }

    @Test
    public void test39018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\u000a", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u000a" + "'", str2, "\\u000a");
    }

    @Test
    public void test39019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                             U\\32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
    }

    @Test
    public void test39021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ", "\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     " + "'", str2, "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ");
    }

    @Test
    public void test39022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39022");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test39023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39023");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "...AAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39024");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                        ", "616161616161616161616161616161616161616161616161616161616161u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                        " + "'", str3, "                                                                                                                                                                        ");
    }

    @Test
    public void test39026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700" + "'", str2, "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700");
    }

    @Test
    public void test39027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test39028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...0023h\\huh0023h\\huh0023h                            ...            ", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0023h\\huh0023h\\huh0023h                            ...            " + "'", str2, "...0023h\\huh0023h\\huh0023h                            ...            ");
    }

    @Test
    public void test39029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) 'U', "230U00230U00230U00230U00230U00230U00230U00230U00230U002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39030");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\4  2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39031");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "2............111111111111111111111111111111111111111111111..............................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test39034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U", "                                 A\\u0023AAAAAAAAAAAAA                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U" + "'", str2, "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
    }

    @Test
    public void test39035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...                                       ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00         ...", "\\u0023                                                                                     hi!hi!hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39036");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u005c", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111U", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test39037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 56, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39038");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                ...hhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   u61    ", "uuuuuuuuuuuu 3200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\nu002                                         \n\n1                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         " + "'", str1, "         ");
    }

    @Test
    public void test39043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39043");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                     222222222222222222222222222222222222222222222222222222                                                                                                      ", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n3\\U                      ", 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39044");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####A000U\\", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0037", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U0023                         ", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test39045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39045");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test39046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39046");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                                                             6u623\\U");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   2     ...                                ...    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39047");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r                                                 ", "61UUUUUUUUUUUUHI!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61UUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39048");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("             u0023\\u002u0023\\u002u0023\\u002u0", "7", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach(" 23", strArray5, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("23hi!hi!hi!                                                                          ", (java.lang.Object[]) strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " 23" + "'", str10, " 23");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test39049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                       61\n                       ", "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\n                       " + "'", str2, "61\n                       ");
    }

    @Test
    public void test39050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39050");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\u0023\\u0023        75023\\u0023\\u002");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "161\\161\\161\\161\\161\\161\\U6                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39052");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                        a0u0023aaaaaaaaaaaaa                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39053");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002", "\\U002066666666666666666666666666666666666666", (int) '1', (int) '1');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002\\U002066666666666666666666666666666666666666" + "'", str4, "U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002\\U002066666666666666666666666666666666666666");
    }

    @Test
    public void test39054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39054");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111U", '2');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39055");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                        a", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ", 157);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39056");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC 6...", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39057");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "uuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuu61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39058");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAA6516AAA", "                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             ", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                \\3200u\\3200u\\3200u\\300u\\", 929);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                \\3200u\\3200u\\3200u\\300u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                \\3200u\\3200u\\3200u\\300u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test39060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39060");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                               ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39062");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("8     8     8     8     8     8     8     8  8     8     8     8     8     8     8    ", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555##############################################.16 5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555", (int) 'I');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777", "             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777" + "'", str2, "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777");
    }

    @Test
    public void test39064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaac500\\0\\0200\\0200\\0200\\0200\\0200\\\n###", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\  6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u" + "'", str1, "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u");
    }

    @Test
    public void test39066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39066");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                ", "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39067");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39068");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "23hi!hi!hi!                                                                          ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u00\\u00\\u00\\u00\\u00\\u00\\u00" + "'", str5, "\\u00\\u00\\u00\\u00\\u00\\u00\\u00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test39069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39069");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                             6u666", "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                       aaaaaaaaaaaaa", "  \\005C  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaa" + "'", str2, "                                       aaaaaaaaaaaaa");
    }

    @Test
    public void test39071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                      3200U\\1400\\00U\\3200U\\", "3AAAA51AAAA0023AAAA51AAAA0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      3200U\\1400\\00U\\3200U\\" + "'", str2, "                                                                                      3200U\\1400\\00U\\3200U\\");
    }

    @Test
    public void test39072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575            ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575            " + "'", str2, "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575            ");
    }

    @Test
    public void test39073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39073");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'i', 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test39074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hCaaaaaaaaaaaaaaaaaaahCaaaaaaaaaaaaaaaaaaahCaaaaaaaaaaaaaaaaaaahCa", "                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u" + "'", str1, "uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
    }

    @Test
    public void test39076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39076");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023          3    23\\u0023\\u0023");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test39077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39077");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("iiiiiiiiiiiiiiiii23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39078");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1\\U00234                                      \\U0023\\U00\\u0", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39079");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("###\n\\u003\\u0023\\u0023\\u0023\\###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\n\\u003\\u0023\\u0023\\u0023\\###" + "'", str1, "###\n\\u003\\u0023\\u0023\\u0023\\###");
    }

    @Test
    public void test39080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39080");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 563);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 563 + "'", int2 == 563);
    }

    @Test
    public void test39081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIU005CIIIIIIIIIIIIIIIIIIIIIIIIIIII                                  " + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIU005CIIIIIIIIIIIIIIIIIIIIIIIIIIII                                  ");
    }

    @Test
    public void test39082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\" + "'", str1, "75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
    }

    @Test
    public void test39083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII              6 0200U\\\\6 0200U\\\\6 UUUUUU" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII              6 0200U\\\\6 0200U\\\\6 UUUUUU");
    }

    @Test
    public void test39084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                   \\U0033                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("uuuu61uuuu                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUU61UUUU                              23u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U00" + "'", str1, "UUUU61UUUU                              23u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U00");
    }

    @Test
    public void test39086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39086");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\16", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                        iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                        ", "                                                  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                        " + "'", str2, "                                                                                        iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                        ");
    }

    @Test
    public void test39088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39088");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void test39089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("U0023                                            ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023" + "'", str2, "U0023");
    }

    @Test
    public void test39091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39091");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaa\\\\\\", "", 695);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test39092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39092");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("616161616161616161616161", "", 119);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\" + "'", str1, "                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test39094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39094");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\", "                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                       ...HH...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39095");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuu6cuuuu", 563);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test39097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39097");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                         \n\n                                                     \n\n                                      ", "U\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                        \\u0023\\u\\", "                   \\u0023\\u0023\\u0023\\u0023\\u0023\\u                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        \\u0023\\u\\" + "'", str2, "                                                                                                        \\u0023\\u\\");
    }

    @Test
    public void test39099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39099");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "               3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39101");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###        ", 126, 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39102");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...       ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '\r');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test39103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("    u0034                                                                                          ", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023u666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\UUU02\\... 3hi!hi!hi!                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\UUU02\\... 3hi!hi!hi!" + "'", str1, "\\UUU02\\... 3hi!hi!hi!");
    }

    @Test
    public void test39105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39105");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     ", "61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39106");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u003                    111111111111111");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void test39107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39107");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                                                                                   ", 404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa" + "'", str1, "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa");
    }

    @Test
    public void test39109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39109");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

